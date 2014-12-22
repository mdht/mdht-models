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
package org.openhealthtools.mdht.uml.cda.consol.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Criterion;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.consol.*;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public class ConsolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConsolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolSwitch<Adapter> modelSwitch = new ConsolSwitch<Adapter>() {
		@Override
		public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
			return createGeneralHeaderConstraintsAdapter();
		}

		@Override
		public Adapter caseAllergyProblemAct(AllergyProblemAct object) {
			return createAllergyProblemActAdapter();
		}

		@Override
		public Adapter caseAllergyObservation(AllergyObservation object) {
			return createAllergyObservationAdapter();
		}

		@Override
		public Adapter caseSubstanceOrDeviceAllergyObservation(SubstanceOrDeviceAllergyObservation object) {
			return createSubstanceOrDeviceAllergyObservationAdapter();
		}

		@Override
		public Adapter caseAllergyStatusObservation(AllergyStatusObservation object) {
			return createAllergyStatusObservationAdapter();
		}

		@Override
		public Adapter caseReactionObservation(ReactionObservation object) {
			return createReactionObservationAdapter();
		}

		@Override
		public Adapter caseSeverityObservation(SeverityObservation object) {
			return createSeverityObservationAdapter();
		}

		@Override
		public Adapter caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
			return createProcedureActivityProcedureAdapter();
		}

		@Override
		public Adapter caseIndication(Indication object) {
			return createIndicationAdapter();
		}

		@Override
		public Adapter caseServiceDeliveryLocation(ServiceDeliveryLocation object) {
			return createServiceDeliveryLocationAdapter();
		}

		@Override
		public Adapter caseMedicationActivity(MedicationActivity object) {
			return createMedicationActivityAdapter();
		}

		@Override
		public Adapter caseMedicationSupplyOrder(MedicationSupplyOrder object) {
			return createMedicationSupplyOrderAdapter();
		}

		@Override
		public Adapter caseInstructions(Instructions object) {
			return createInstructionsAdapter();
		}

		@Override
		public Adapter caseMedicationDispense(MedicationDispense object) {
			return createMedicationDispenseAdapter();
		}

		@Override
		public Adapter caseDrugVehicle(DrugVehicle object) {
			return createDrugVehicleAdapter();
		}

		@Override
		public Adapter caseProductInstance(ProductInstance object) {
			return createProductInstanceAdapter();
		}

		@Override
		public Adapter caseAgeObservation(AgeObservation object) {
			return createAgeObservationAdapter();
		}

		@Override
		public Adapter caseHealthStatusObservation(HealthStatusObservation object) {
			return createHealthStatusObservationAdapter();
		}

		@Override
		public Adapter caseCommentActivity(CommentActivity object) {
			return createCommentActivityAdapter();
		}

		@Override
		public Adapter caseNonMedicinalSupplyActivity(NonMedicinalSupplyActivity object) {
			return createNonMedicinalSupplyActivityAdapter();
		}

		@Override
		public Adapter caseProblemConcernAct(ProblemConcernAct object) {
			return createProblemConcernActAdapter();
		}

		@Override
		public Adapter caseProblemObservation(ProblemObservation object) {
			return createProblemObservationAdapter();
		}

		@Override
		public Adapter caseProblemStatus(ProblemStatus object) {
			return createProblemStatusAdapter();
		}

		@Override
		public Adapter caseContinuityOfCareDocument(ContinuityOfCareDocument object) {
			return createContinuityOfCareDocumentAdapter();
		}

		@Override
		public Adapter caseAllergiesSection(AllergiesSection object) {
			return createAllergiesSectionAdapter();
		}

		@Override
		public Adapter caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional object) {
			return createAllergiesSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseMedicationsSection(MedicationsSection object) {
			return createMedicationsSectionAdapter();
		}

		@Override
		public Adapter caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
			return createMedicationsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseProblemSection(ProblemSection object) {
			return createProblemSectionAdapter();
		}

		@Override
		public Adapter caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
			return createProblemSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseProceduresSection(ProceduresSection object) {
			return createProceduresSectionAdapter();
		}

		@Override
		public Adapter caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
			return createProceduresSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseProcedureActivityObservation(ProcedureActivityObservation object) {
			return createProcedureActivityObservationAdapter();
		}

		@Override
		public Adapter caseProcedureActivityAct(ProcedureActivityAct object) {
			return createProcedureActivityActAdapter();
		}

		@Override
		public Adapter caseResultsSection(ResultsSection object) {
			return createResultsSectionAdapter();
		}

		@Override
		public Adapter caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
			return createResultsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseResultOrganizer(ResultOrganizer object) {
			return createResultOrganizerAdapter();
		}

		@Override
		public Adapter caseResultObservation(ResultObservation object) {
			return createResultObservationAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
			return createAdvanceDirectivesSectionAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional object) {
			return createAdvanceDirectivesSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
			return createAdvanceDirectiveObservationAdapter();
		}

		@Override
		public Adapter caseEncountersSection(EncountersSection object) {
			return createEncountersSectionAdapter();
		}

		@Override
		public Adapter caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
			return createEncountersSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseEncounterActivities(EncounterActivities object) {
			return createEncounterActivitiesAdapter();
		}

		@Override
		public Adapter caseEncounterDiagnosis(EncounterDiagnosis object) {
			return createEncounterDiagnosisAdapter();
		}

		@Override
		public Adapter caseFamilyHistorySection(FamilyHistorySection object) {
			return createFamilyHistorySectionAdapter();
		}

		@Override
		public Adapter caseFamilyHistoryOrganizer(FamilyHistoryOrganizer object) {
			return createFamilyHistoryOrganizerAdapter();
		}

		@Override
		public Adapter caseFamilyHistoryObservation(FamilyHistoryObservation object) {
			return createFamilyHistoryObservationAdapter();
		}

		@Override
		public Adapter caseFamilyHistoryDeathObservation(FamilyHistoryDeathObservation object) {
			return createFamilyHistoryDeathObservationAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusSection(FunctionalStatusSection object) {
			return createFunctionalStatusSectionAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusResultOrganizer(FunctionalStatusResultOrganizer object) {
			return createFunctionalStatusResultOrganizerAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusResultObservation(FunctionalStatusResultObservation object) {
			return createFunctionalStatusResultObservationAdapter();
		}

		@Override
		public Adapter caseCaregiverCharacteristics(CaregiverCharacteristics object) {
			return createCaregiverCharacteristicsAdapter();
		}

		@Override
		public Adapter caseAssessmentScaleObservation(AssessmentScaleObservation object) {
			return createAssessmentScaleObservationAdapter();
		}

		@Override
		public Adapter caseAssessmentScaleSupportingObservation(AssessmentScaleSupportingObservation object) {
			return createAssessmentScaleSupportingObservationAdapter();
		}

		@Override
		public Adapter caseCognitiveStatusResultOrganizer(CognitiveStatusResultOrganizer object) {
			return createCognitiveStatusResultOrganizerAdapter();
		}

		@Override
		public Adapter caseCognitiveStatusResultObservation(CognitiveStatusResultObservation object) {
			return createCognitiveStatusResultObservationAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusProblemObservation(FunctionalStatusProblemObservation object) {
			return createFunctionalStatusProblemObservationAdapter();
		}

		@Override
		public Adapter caseCognitiveStatusProblemObservation(CognitiveStatusProblemObservation object) {
			return createCognitiveStatusProblemObservationAdapter();
		}

		@Override
		public Adapter casePressureUlcerObservation(PressureUlcerObservation object) {
			return createPressureUlcerObservationAdapter();
		}

		@Override
		public Adapter caseNumberOfPressureUlcersObservation(NumberOfPressureUlcersObservation object) {
			return createNumberOfPressureUlcersObservationAdapter();
		}

		@Override
		public Adapter caseHighestPressureUlcerStage(HighestPressureUlcerStage object) {
			return createHighestPressureUlcerStageAdapter();
		}

		@Override
		public Adapter caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional object) {
			return createImmunizationsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseImmunizationActivity(ImmunizationActivity object) {
			return createImmunizationActivityAdapter();
		}

		@Override
		public Adapter caseImmunizationRefusalReason(ImmunizationRefusalReason object) {
			return createImmunizationRefusalReasonAdapter();
		}

		@Override
		public Adapter caseMedicalEquipmentSection(MedicalEquipmentSection object) {
			return createMedicalEquipmentSectionAdapter();
		}

		@Override
		public Adapter casePayersSection(PayersSection object) {
			return createPayersSectionAdapter();
		}

		@Override
		public Adapter caseCoverageActivity(CoverageActivity object) {
			return createCoverageActivityAdapter();
		}

		@Override
		public Adapter casePolicyActivity(PolicyActivity object) {
			return createPolicyActivityAdapter();
		}

		@Override
		public Adapter casePlanOfCareSection(PlanOfCareSection object) {
			return createPlanOfCareSectionAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
			return createPlanOfCareActivityActAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
			return createPlanOfCareActivityEncounterAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
			return createPlanOfCareActivityObservationAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
			return createPlanOfCareActivityProcedureAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
			return createPlanOfCareActivitySubstanceAdministrationAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivitySupply(PlanOfCareActivitySupply object) {
			return createPlanOfCareActivitySupplyAdapter();
		}

		@Override
		public Adapter caseSocialHistorySection(SocialHistorySection object) {
			return createSocialHistorySectionAdapter();
		}

		@Override
		public Adapter caseSocialHistoryObservation(SocialHistoryObservation object) {
			return createSocialHistoryObservationAdapter();
		}

		@Override
		public Adapter casePregnancyObservation(PregnancyObservation object) {
			return createPregnancyObservationAdapter();
		}

		@Override
		public Adapter caseEstimatedDateOfDelivery(EstimatedDateOfDelivery object) {
			return createEstimatedDateOfDeliveryAdapter();
		}

		@Override
		public Adapter caseSmokingStatusObservation(SmokingStatusObservation object) {
			return createSmokingStatusObservationAdapter();
		}

		@Override
		public Adapter caseTobaccoUse(TobaccoUse object) {
			return createTobaccoUseAdapter();
		}

		@Override
		public Adapter caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
			return createVitalSignsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseVitalSignsOrganizer(VitalSignsOrganizer object) {
			return createVitalSignsOrganizerAdapter();
		}

		@Override
		public Adapter caseVitalSignObservation(VitalSignObservation object) {
			return createVitalSignObservationAdapter();
		}

		@Override
		public Adapter caseImmunizationsSection(ImmunizationsSection object) {
			return createImmunizationsSectionAdapter();
		}

		@Override
		public Adapter caseVitalSignsSection(VitalSignsSection object) {
			return createVitalSignsSectionAdapter();
		}

		@Override
		public Adapter caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
			return createHistoryOfPastIllnessSectionAdapter();
		}

		@Override
		public Adapter caseChiefComplaintSection(ChiefComplaintSection object) {
			return createChiefComplaintSectionAdapter();
		}

		@Override
		public Adapter caseReasonForReferralSection(ReasonForReferralSection object) {
			return createReasonForReferralSectionAdapter();
		}

		@Override
		public Adapter caseHistoryOfPresentIllnessSection(HistoryOfPresentIllnessSection object) {
			return createHistoryOfPresentIllnessSectionAdapter();
		}

		@Override
		public Adapter caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
			return createHospitalAdmissionDiagnosisSectionAdapter();
		}

		@Override
		public Adapter caseHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosis object) {
			return createHospitalAdmissionDiagnosisAdapter();
		}

		@Override
		public Adapter caseHospitalAdmissionMedicationsSectionEntriesOptional(
				HospitalAdmissionMedicationsSectionEntriesOptional object) {
			return createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseAdmissionMedication(AdmissionMedication object) {
			return createAdmissionMedicationAdapter();
		}

		@Override
		public Adapter caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
			return createMedicationsAdministeredSectionAdapter();
		}

		@Override
		public Adapter casePhysicalExamSection(PhysicalExamSection object) {
			return createPhysicalExamSectionAdapter();
		}

		@Override
		public Adapter caseGeneralStatusSection(GeneralStatusSection object) {
			return createGeneralStatusSectionAdapter();
		}

		@Override
		public Adapter caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
			return createReviewOfSystemsSectionAdapter();
		}

		@Override
		public Adapter caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
			return createAssessmentAndPlanSectionAdapter();
		}

		@Override
		public Adapter caseSurgicalDrainsSection(SurgicalDrainsSection object) {
			return createSurgicalDrainsSectionAdapter();
		}

		@Override
		public Adapter caseUnstructuredDocument(UnstructuredDocument object) {
			return createUnstructuredDocumentAdapter();
		}

		@Override
		public Adapter caseMedicationInformation(MedicationInformation object) {
			return createMedicationInformationAdapter();
		}

		@Override
		public Adapter caseDischargeSummary(DischargeSummary object) {
			return createDischargeSummaryAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection object) {
			return createHospitalDischargeDiagnosisSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeDiagnosis(HospitalDischargeDiagnosis object) {
			return createHospitalDischargeDiagnosisAdapter();
		}

		@Override
		public Adapter caseDischargeDietSection(DischargeDietSection object) {
			return createDischargeDietSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeMedicationsSectionEntriesOptional(
				HospitalDischargeMedicationsSectionEntriesOptional object) {
			return createHospitalDischargeMedicationsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseDischargeMedication(DischargeMedication object) {
			return createDischargeMedicationAdapter();
		}

		@Override
		public Adapter caseHospitalCourseSection(HospitalCourseSection object) {
			return createHospitalCourseSectionAdapter();
		}

		@Override
		public Adapter caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
			return createChiefComplaintAndReasonForVisitSectionAdapter();
		}

		@Override
		public Adapter caseHospitalConsultationsSection(HospitalConsultationsSection object) {
			return createHospitalConsultationsSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeInstructionsSection(HospitalDischargeInstructionsSection object) {
			return createHospitalDischargeInstructionsSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargePhysicalSection(HospitalDischargePhysicalSection object) {
			return createHospitalDischargePhysicalSectionAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeStudiesSummarySection(HospitalDischargeStudiesSummarySection object) {
			return createHospitalDischargeStudiesSummarySectionAdapter();
		}

		@Override
		public Adapter caseReasonForVisitSection(ReasonForVisitSection object) {
			return createReasonForVisitSectionAdapter();
		}

		@Override
		public Adapter casePreconditionForSubstanceAdministration(PreconditionForSubstanceAdministration object) {
			return createPreconditionForSubstanceAdministrationAdapter();
		}

		@Override
		public Adapter caseImmunizationMedicationInformation(ImmunizationMedicationInformation object) {
			return createImmunizationMedicationInformationAdapter();
		}

		@Override
		public Adapter caseAuthorizationActivity(AuthorizationActivity object) {
			return createAuthorizationActivityAdapter();
		}

		@Override
		public Adapter caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
			return createHospitalDischargeMedicationsSectionAdapter();
		}

		@Override
		public Adapter caseAnesthesiaSection(AnesthesiaSection object) {
			return createAnesthesiaSectionAdapter();
		}

		@Override
		public Adapter caseComplicationsSection(ComplicationsSection object) {
			return createComplicationsSectionAdapter();
		}

		@Override
		public Adapter caseDICOMObjectCatalogSection(DICOMObjectCatalogSection object) {
			return createDICOMObjectCatalogSectionAdapter();
		}

		@Override
		public Adapter caseStudyAct(StudyAct object) {
			return createStudyActAdapter();
		}

		@Override
		public Adapter caseSeriesAct(SeriesAct object) {
			return createSeriesActAdapter();
		}

		@Override
		public Adapter caseSOPInstanceObservation(SOPInstanceObservation object) {
			return createSOPInstanceObservationAdapter();
		}

		@Override
		public Adapter casePurposeofReferenceObservation(PurposeofReferenceObservation object) {
			return createPurposeofReferenceObservationAdapter();
		}

		@Override
		public Adapter caseReferencedFramesObservation(ReferencedFramesObservation object) {
			return createReferencedFramesObservationAdapter();
		}

		@Override
		public Adapter caseBoundaryObservation(BoundaryObservation object) {
			return createBoundaryObservationAdapter();
		}

		@Override
		public Adapter caseFindingsSection(FindingsSection object) {
			return createFindingsSectionAdapter();
		}

		@Override
		public Adapter caseInterventionsSection(InterventionsSection object) {
			return createInterventionsSectionAdapter();
		}

		@Override
		public Adapter caseMedicalHistorySection(MedicalHistorySection object) {
			return createMedicalHistorySectionAdapter();
		}

		@Override
		public Adapter caseObjectiveSection(ObjectiveSection object) {
			return createObjectiveSectionAdapter();
		}

		@Override
		public Adapter caseOperativeNoteFluidSection(OperativeNoteFluidSection object) {
			return createOperativeNoteFluidSectionAdapter();
		}

		@Override
		public Adapter caseOperativeNoteSurgicalProcedureSection(OperativeNoteSurgicalProcedureSection object) {
			return createOperativeNoteSurgicalProcedureSectionAdapter();
		}

		@Override
		public Adapter casePlannedProcedureSection(PlannedProcedureSection object) {
			return createPlannedProcedureSectionAdapter();
		}

		@Override
		public Adapter casePostoperativeDiagnosisSection(PostoperativeDiagnosisSection object) {
			return createPostoperativeDiagnosisSectionAdapter();
		}

		@Override
		public Adapter casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection object) {
			return createPostprocedureDiagnosisSectionAdapter();
		}

		@Override
		public Adapter casePostprocedureDiagnosis(PostprocedureDiagnosis object) {
			return createPostprocedureDiagnosisAdapter();
		}

		@Override
		public Adapter casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection object) {
			return createPreoperativeDiagnosisSectionAdapter();
		}

		@Override
		public Adapter casePreoperativeDiagnosis(PreoperativeDiagnosis object) {
			return createPreoperativeDiagnosisAdapter();
		}

		@Override
		public Adapter caseProcedureDescriptionSection(ProcedureDescriptionSection object) {
			return createProcedureDescriptionSectionAdapter();
		}

		@Override
		public Adapter caseProcedureDispositionSection(ProcedureDispositionSection object) {
			return createProcedureDispositionSectionAdapter();
		}

		@Override
		public Adapter caseProcedureEstimatedBloodLossSection(ProcedureEstimatedBloodLossSection object) {
			return createProcedureEstimatedBloodLossSectionAdapter();
		}

		@Override
		public Adapter caseProcedureFindingsSection(ProcedureFindingsSection object) {
			return createProcedureFindingsSectionAdapter();
		}

		@Override
		public Adapter caseProcedureImplantsSection(ProcedureImplantsSection object) {
			return createProcedureImplantsSectionAdapter();
		}

		@Override
		public Adapter caseProcedureIndicationsSection(ProcedureIndicationsSection object) {
			return createProcedureIndicationsSectionAdapter();
		}

		@Override
		public Adapter caseProcedureSpecimensTakenSection(ProcedureSpecimensTakenSection object) {
			return createProcedureSpecimensTakenSectionAdapter();
		}

		@Override
		public Adapter caseSubjectiveSection(SubjectiveSection object) {
			return createSubjectiveSectionAdapter();
		}

		@Override
		public Adapter caseConsultationNote(ConsultationNote object) {
			return createConsultationNoteAdapter();
		}

		@Override
		public Adapter caseAssessmentSection(AssessmentSection object) {
			return createAssessmentSectionAdapter();
		}

		@Override
		public Adapter caseHistoryAndPhysicalNote(HistoryAndPhysicalNote object) {
			return createHistoryAndPhysicalNoteAdapter();
		}

		@Override
		public Adapter caseInstructionsSection(InstructionsSection object) {
			return createInstructionsSectionAdapter();
		}

		@Override
		public Adapter caseOperativeNote(OperativeNote object) {
			return createOperativeNoteAdapter();
		}

		@Override
		public Adapter caseProcedureNote(ProcedureNote object) {
			return createProcedureNoteAdapter();
		}

		@Override
		public Adapter caseProgressNote(ProgressNote object) {
			return createProgressNoteAdapter();
		}

		@Override
		public Adapter caseDiagnosticImagingReport(DiagnosticImagingReport object) {
			return createDiagnosticImagingReportAdapter();
		}

		@Override
		public Adapter casePhysicianReadingStudyPerformer(PhysicianReadingStudyPerformer object) {
			return createPhysicianReadingStudyPerformerAdapter();
		}

		@Override
		public Adapter casePhysicianofRecordParticipant(PhysicianofRecordParticipant object) {
			return createPhysicianofRecordParticipantAdapter();
		}

		@Override
		public Adapter caseTextObservation(TextObservation object) {
			return createTextObservationAdapter();
		}

		@Override
		public Adapter caseQuantityMeasurementObservation(QuantityMeasurementObservation object) {
			return createQuantityMeasurementObservationAdapter();
		}

		@Override
		public Adapter caseCodeObservations(CodeObservations object) {
			return createCodeObservationsAdapter();
		}

		@Override
		public Adapter caseProcedureContext(ProcedureContext object) {
			return createProcedureContextAdapter();
		}

		@Override
		public Adapter caseMedicationUseNoneKnown(MedicationUseNoneKnown object) {
			return createMedicationUseNoneKnownAdapter();
		}

		@Override
		public Adapter caseDeceasedObservation(DeceasedObservation object) {
			return createDeceasedObservationAdapter();
		}

		@Override
		public Adapter caseFetusSubjectContext(FetusSubjectContext object) {
			return createFetusSubjectContextAdapter();
		}

		@Override
		public Adapter caseObserverContext(ObserverContext object) {
			return createObserverContextAdapter();
		}

		@Override
		public Adapter caseActReference(ActReference object) {
			return createActReferenceAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveOrganizer(AdvanceDirectiveOrganizer object) {
			return createAdvanceDirectiveOrganizerAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectiveObservation2(AdvanceDirectiveObservation2 object) {
			return createAdvanceDirectiveObservation2Adapter();
		}

		@Override
		public Adapter caseCharacteristicsOfHomeEnvironment(CharacteristicsOfHomeEnvironment object) {
			return createCharacteristicsOfHomeEnvironmentAdapter();
		}

		@Override
		public Adapter caseCognitiveAbilitiesObservation(CognitiveAbilitiesObservation object) {
			return createCognitiveAbilitiesObservationAdapter();
		}

		@Override
		public Adapter caseCulturalAndReligiousObservation(CulturalAndReligiousObservation object) {
			return createCulturalAndReligiousObservationAdapter();
		}

		@Override
		public Adapter caseDrugMonitoringAct(DrugMonitoringAct object) {
			return createDrugMonitoringActAdapter();
		}

		@Override
		public Adapter caseHandoffCommunication(HandoffCommunication object) {
			return createHandoffCommunicationAdapter();
		}

		@Override
		public Adapter caseMedicalEquipmentOrganizer(MedicalEquipmentOrganizer object) {
			return createMedicalEquipmentOrganizerAdapter();
		}

		@Override
		public Adapter caseNonMedicinalSupplyActivity2(NonMedicinalSupplyActivity2 object) {
			return createNonMedicinalSupplyActivity2Adapter();
		}

		@Override
		public Adapter caseInstruction2(Instruction2 object) {
			return createInstruction2Adapter();
		}

		@Override
		public Adapter caseProcedureActivityProcedure2(ProcedureActivityProcedure2 object) {
			return createProcedureActivityProcedure2Adapter();
		}

		@Override
		public Adapter caseIndication2(Indication2 object) {
			return createIndication2Adapter();
		}

		@Override
		public Adapter caseMedicationActivity2(MedicationActivity2 object) {
			return createMedicationActivity2Adapter();
		}

		@Override
		public Adapter caseSubstanceAdministeredAct(SubstanceAdministeredAct object) {
			return createSubstanceAdministeredActAdapter();
		}

		@Override
		public Adapter caseMedicationSupplyOrder2(MedicationSupplyOrder2 object) {
			return createMedicationSupplyOrder2Adapter();
		}

		@Override
		public Adapter caseMedicationDispense2(MedicationDispense2 object) {
			return createMedicationDispense2Adapter();
		}

		@Override
		public Adapter caseReactionObservation2(ReactionObservation2 object) {
			return createReactionObservation2Adapter();
		}

		@Override
		public Adapter caseSeverityObservation2(SeverityObservation2 object) {
			return createSeverityObservation2Adapter();
		}

		@Override
		public Adapter caseMentalStatusObservation(MentalStatusObservation object) {
			return createMentalStatusObservationAdapter();
		}

		@Override
		public Adapter caseNutritionAssessment(NutritionAssessment object) {
			return createNutritionAssessmentAdapter();
		}

		@Override
		public Adapter caseNutritionRecommendations(NutritionRecommendations object) {
			return createNutritionRecommendationsAdapter();
		}

		@Override
		public Adapter caseNutritionalStatusObservation(NutritionalStatusObservation object) {
			return createNutritionalStatusObservationAdapter();
		}

		@Override
		public Adapter caseOutcomeObservation(OutcomeObservation object) {
			return createOutcomeObservationAdapter();
		}

		@Override
		public Adapter caseGoalObservation(GoalObservation object) {
			return createGoalObservationAdapter();
		}

		@Override
		public Adapter casePlannedObservation2(PlannedObservation2 object) {
			return createPlannedObservation2Adapter();
		}

		@Override
		public Adapter casePatientPriorityPreference(PatientPriorityPreference object) {
			return createPatientPriorityPreferenceAdapter();
		}

		@Override
		public Adapter caseProviderPriorityPreference(ProviderPriorityPreference object) {
			return createProviderPriorityPreferenceAdapter();
		}

		@Override
		public Adapter casePlannedCoverage(PlannedCoverage object) {
			return createPlannedCoverageAdapter();
		}

		@Override
		public Adapter caseHealthConcernAct(HealthConcernAct object) {
			return createHealthConcernActAdapter();
		}

		@Override
		public Adapter caseSelfCareActivities(SelfCareActivities object) {
			return createSelfCareActivitiesAdapter();
		}

		@Override
		public Adapter caseSensoryAndSpeechStatus(SensoryAndSpeechStatus object) {
			return createSensoryAndSpeechStatusAdapter();
		}

		@Override
		public Adapter caseWoundObservation(WoundObservation object) {
			return createWoundObservationAdapter();
		}

		@Override
		public Adapter caseProblemObservation2(ProblemObservation2 object) {
			return createProblemObservation2Adapter();
		}

		@Override
		public Adapter casePrognosisObservation(PrognosisObservation object) {
			return createPrognosisObservationAdapter();
		}

		@Override
		public Adapter caseWoundMeasurementObservation(WoundMeasurementObservation object) {
			return createWoundMeasurementObservationAdapter();
		}

		@Override
		public Adapter caseWoundCharacteristics(WoundCharacteristics object) {
			return createWoundCharacteristicsAdapter();
		}

		@Override
		public Adapter caseNumberOfPressureUlcersObservation2(NumberOfPressureUlcersObservation2 object) {
			return createNumberOfPressureUlcersObservation2Adapter();
		}

		@Override
		public Adapter caseExternalDocumentReference(ExternalDocumentReference object) {
			return createExternalDocumentReferenceAdapter();
		}

		@Override
		public Adapter caseAllergyObservation2(AllergyObservation2 object) {
			return createAllergyObservation2Adapter();
		}

		@Override
		public Adapter caseCognitiveStatusObservation2(CognitiveStatusObservation2 object) {
			return createCognitiveStatusObservation2Adapter();
		}

		@Override
		public Adapter caseCurrentSmokingStatus2(CurrentSmokingStatus2 object) {
			return createCurrentSmokingStatus2Adapter();
		}

		@Override
		public Adapter caseEncounterDiagnosis2(EncounterDiagnosis2 object) {
			return createEncounterDiagnosis2Adapter();
		}

		@Override
		public Adapter caseFunctionalStatusObservation2(FunctionalStatusObservation2 object) {
			return createFunctionalStatusObservation2Adapter();
		}

		@Override
		public Adapter caseHospitalAdmissionDiagnosis2(HospitalAdmissionDiagnosis2 object) {
			return createHospitalAdmissionDiagnosis2Adapter();
		}

		@Override
		public Adapter casePostprocedureDiagnosis2(PostprocedureDiagnosis2 object) {
			return createPostprocedureDiagnosis2Adapter();
		}

		@Override
		public Adapter casePreoperativeDiagnosis2(PreoperativeDiagnosis2 object) {
			return createPreoperativeDiagnosis2Adapter();
		}

		@Override
		public Adapter caseResultObservation2(ResultObservation2 object) {
			return createResultObservation2Adapter();
		}

		@Override
		public Adapter caseSocialHistoryObservation2(SocialHistoryObservation2 object) {
			return createSocialHistoryObservation2Adapter();
		}

		@Override
		public Adapter caseSubstanceOrDeviceAllergyObservation2(SubstanceOrDeviceAllergyObservation2 object) {
			return createSubstanceOrDeviceAllergyObservation2Adapter();
		}

		@Override
		public Adapter caseTobaccoUse2(TobaccoUse2 object) {
			return createTobaccoUse2Adapter();
		}

		@Override
		public Adapter caseVitalSignObservation2(VitalSignObservation2 object) {
			return createVitalSignObservation2Adapter();
		}

		@Override
		public Adapter caseResultOrganizer2(ResultOrganizer2 object) {
			return createResultOrganizer2Adapter();
		}

		@Override
		public Adapter caseProblemConcernAct2(ProblemConcernAct2 object) {
			return createProblemConcernAct2Adapter();
		}

		@Override
		public Adapter casePlannedEncounter2(PlannedEncounter2 object) {
			return createPlannedEncounter2Adapter();
		}

		@Override
		public Adapter casePlannedProcedure2(PlannedProcedure2 object) {
			return createPlannedProcedure2Adapter();
		}

		@Override
		public Adapter casePlannedMedicationActivity2(PlannedMedicationActivity2 object) {
			return createPlannedMedicationActivity2Adapter();
		}

		@Override
		public Adapter casePlannedSupply2(PlannedSupply2 object) {
			return createPlannedSupply2Adapter();
		}

		@Override
		public Adapter casePlannedAct2(PlannedAct2 object) {
			return createPlannedAct2Adapter();
		}

		@Override
		public Adapter caseProgressTowardGoalObservation(ProgressTowardGoalObservation object) {
			return createProgressTowardGoalObservationAdapter();
		}

		@Override
		public Adapter caseInterventionAct(InterventionAct object) {
			return createInterventionActAdapter();
		}

		@Override
		public Adapter caseImmunizationActivity2(ImmunizationActivity2 object) {
			return createImmunizationActivity2Adapter();
		}

		@Override
		public Adapter caseProcedureActivityAct2(ProcedureActivityAct2 object) {
			return createProcedureActivityAct2Adapter();
		}

		@Override
		public Adapter caseProcedureActivityObservation2(ProcedureActivityObservation2 object) {
			return createProcedureActivityObservation2Adapter();
		}

		@Override
		public Adapter caseEncounterActivity2(EncounterActivity2 object) {
			return createEncounterActivity2Adapter();
		}

		@Override
		public Adapter casePatientReferralAct(PatientReferralAct object) {
			return createPatientReferralActAdapter();
		}

		@Override
		public Adapter casePlannedImmunizationActivity(PlannedImmunizationActivity object) {
			return createPlannedImmunizationActivityAdapter();
		}

		@Override
		public Adapter caseGoalsSection(GoalsSection object) {
			return createGoalsSectionAdapter();
		}

		@Override
		public Adapter caseHealthConcernsSection(HealthConcernsSection object) {
			return createHealthConcernsSectionAdapter();
		}

		@Override
		public Adapter caseHealthStatusObservation2(HealthStatusObservation2 object) {
			return createHealthStatusObservation2Adapter();
		}

		@Override
		public Adapter caseHealthStatusEvaluationsOutcomesSection(HealthStatusEvaluationsOutcomesSection object) {
			return createHealthStatusEvaluationsOutcomesSectionAdapter();
		}

		@Override
		public Adapter caseMentalStatusSection(MentalStatusSection object) {
			return createMentalStatusSectionAdapter();
		}

		@Override
		public Adapter caseCognitiveStatusOrganizer2(CognitiveStatusOrganizer2 object) {
			return createCognitiveStatusOrganizer2Adapter();
		}

		@Override
		public Adapter caseNutritionSection(NutritionSection object) {
			return createNutritionSectionAdapter();
		}

		@Override
		public Adapter casePhysicalFindingsOfSkinSection(PhysicalFindingsOfSkinSection object) {
			return createPhysicalFindingsOfSkinSectionAdapter();
		}

		@Override
		public Adapter caseUSRealmHeader2(USRealmHeader2 object) {
			return createUSRealmHeader2Adapter();
		}

		@Override
		public Adapter caseCarePlan(CarePlan object) {
			return createCarePlanAdapter();
		}

		@Override
		public Adapter caseInterventionsSection2(InterventionsSection2 object) {
			return createInterventionsSection2Adapter();
		}

		@Override
		public Adapter caseReferralNote(ReferralNote object) {
			return createReferralNoteAdapter();
		}

		@Override
		public Adapter casePlanOfTreatmentSection2(PlanOfTreatmentSection2 object) {
			return createPlanOfTreatmentSection2Adapter();
		}

		@Override
		public Adapter caseAdvanceDirectivesSectionEntriesOptional2(AdvanceDirectivesSectionEntriesOptional2 object) {
			return createAdvanceDirectivesSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseImmunizationsSection2(ImmunizationsSection2 object) {
			return createImmunizationsSection2Adapter();
		}

		@Override
		public Adapter caseImmunizationsSectionEntriesOptional2(ImmunizationsSectionEntriesOptional2 object) {
			return createImmunizationsSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseProblemSection2(ProblemSection2 object) {
			return createProblemSection2Adapter();
		}

		@Override
		public Adapter caseProblemSectionEntriesOptional2(ProblemSectionEntriesOptional2 object) {
			return createProblemSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseProceduresSectionEntriesOptional2(ProceduresSectionEntriesOptional2 object) {
			return createProceduresSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseResultsSection2(ResultsSection2 object) {
			return createResultsSection2Adapter();
		}

		@Override
		public Adapter caseResultsSectionEntriesOptional2(ResultsSectionEntriesOptional2 object) {
			return createResultsSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseSocialHistorySection2(SocialHistorySection2 object) {
			return createSocialHistorySection2Adapter();
		}

		@Override
		public Adapter caseVitalSignsSection2(VitalSignsSection2 object) {
			return createVitalSignsSection2Adapter();
		}

		@Override
		public Adapter caseVitalSignsSectionEntriesOptional2(VitalSignsSectionEntriesOptional2 object) {
			return createVitalSignsSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseVitalSignsOrganizer2(VitalSignsOrganizer2 object) {
			return createVitalSignsOrganizer2Adapter();
		}

		@Override
		public Adapter caseFunctionalStatusSection2(FunctionalStatusSection2 object) {
			return createFunctionalStatusSection2Adapter();
		}

		@Override
		public Adapter caseFunctionalStatusOrganizer2(FunctionalStatusOrganizer2 object) {
			return createFunctionalStatusOrganizer2Adapter();
		}

		@Override
		public Adapter casePhysicalExamSection2(PhysicalExamSection2 object) {
			return createPhysicalExamSection2Adapter();
		}

		@Override
		public Adapter caseMedicalEquipmentSection2(MedicalEquipmentSection2 object) {
			return createMedicalEquipmentSection2Adapter();
		}

		@Override
		public Adapter caseAllergiesSection2(AllergiesSection2 object) {
			return createAllergiesSection2Adapter();
		}

		@Override
		public Adapter caseAllergiesSectionEntriesOptional2(AllergiesSectionEntriesOptional2 object) {
			return createAllergiesSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseAllergyConcernAct2(AllergyConcernAct2 object) {
			return createAllergyConcernAct2Adapter();
		}

		@Override
		public Adapter caseAssessmentAndPlanSection2(AssessmentAndPlanSection2 object) {
			return createAssessmentAndPlanSection2Adapter();
		}

		@Override
		public Adapter caseHistoryOfPastIllnessSection2(HistoryOfPastIllnessSection2 object) {
			return createHistoryOfPastIllnessSection2Adapter();
		}

		@Override
		public Adapter caseMedicationsSection2(MedicationsSection2 object) {
			return createMedicationsSection2Adapter();
		}

		@Override
		public Adapter caseMedicationsSectionEntriesOptional2(MedicationsSectionEntriesOptional2 object) {
			return createMedicationsSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseReasonForReferralSection2(ReasonForReferralSection2 object) {
			return createReasonForReferralSection2Adapter();
		}

		@Override
		public Adapter caseTransferSummary(TransferSummary object) {
			return createTransferSummaryAdapter();
		}

		@Override
		public Adapter caseAdvanceDirectivesSection2(AdvanceDirectivesSection2 object) {
			return createAdvanceDirectivesSection2Adapter();
		}

		@Override
		public Adapter caseEncountersSection2(EncountersSection2 object) {
			return createEncountersSection2Adapter();
		}

		@Override
		public Adapter caseEncountersSectionEntriesOptional2(EncountersSectionEntriesOptional2 object) {
			return createEncountersSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseDischargeDiagnosisSection2(DischargeDiagnosisSection2 object) {
			return createDischargeDiagnosisSection2Adapter();
		}

		@Override
		public Adapter caseHospitalDischargeDiagnosis2(HospitalDischargeDiagnosis2 object) {
			return createHospitalDischargeDiagnosis2Adapter();
		}

		@Override
		public Adapter casePayersSection2(PayersSection2 object) {
			return createPayersSection2Adapter();
		}

		@Override
		public Adapter caseCoverageActivity2(CoverageActivity2 object) {
			return createCoverageActivity2Adapter();
		}

		@Override
		public Adapter casePolicyActivity2(PolicyActivity2 object) {
			return createPolicyActivity2Adapter();
		}

		@Override
		public Adapter caseProceduresSection2(ProceduresSection2 object) {
			return createProceduresSection2Adapter();
		}

		@Override
		public Adapter caseUSRealmHeaderPatientGeneratedDocument(USRealmHeaderPatientGeneratedDocument object) {
			return createUSRealmHeaderPatientGeneratedDocumentAdapter();
		}

		@Override
		public Adapter caseAuthorParticipation(AuthorParticipation object) {
			return createAuthorParticipationAdapter();
		}

		@Override
		public Adapter caseAdmissionMedication2(AdmissionMedication2 object) {
			return createAdmissionMedication2Adapter();
		}

		@Override
		public Adapter caseDeceasedObservation2(DeceasedObservation2 object) {
			return createDeceasedObservation2Adapter();
		}

		@Override
		public Adapter caseDischargeMedication2(DischargeMedication2 object) {
			return createDischargeMedication2Adapter();
		}

		@Override
		public Adapter caseImmunizationMedicationInformation2(ImmunizationMedicationInformation2 object) {
			return createImmunizationMedicationInformation2Adapter();
		}

		@Override
		public Adapter caseMedicationInformation2(MedicationInformation2 object) {
			return createMedicationInformation2Adapter();
		}

		@Override
		public Adapter casePhysicianofRecordParticipant2(PhysicianofRecordParticipant2 object) {
			return createPhysicianofRecordParticipant2Adapter();
		}

		@Override
		public Adapter caseAnesthesiaSection2(AnesthesiaSection2 object) {
			return createAnesthesiaSection2Adapter();
		}

		@Override
		public Adapter caseComplicationsSection2(ComplicationsSection2 object) {
			return createComplicationsSection2Adapter();
		}

		@Override
		public Adapter caseAdmissionDiagnosisSection2(AdmissionDiagnosisSection2 object) {
			return createAdmissionDiagnosisSection2Adapter();
		}

		@Override
		public Adapter caseAdmissionMedicationsSectionEntriesOptional2(
				AdmissionMedicationsSectionEntriesOptional2 object) {
			return createAdmissionMedicationsSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseDischargeMedicationsSectionEntriesOptional2(
				DischargeMedicationsSectionEntriesOptional2 object) {
			return createDischargeMedicationsSectionEntriesOptional2Adapter();
		}

		@Override
		public Adapter caseInstructionsSection2(InstructionsSection2 object) {
			return createInstructionsSection2Adapter();
		}

		@Override
		public Adapter caseMedicationsAdministeredSection2(MedicationsAdministeredSection2 object) {
			return createMedicationsAdministeredSection2Adapter();
		}

		@Override
		public Adapter casePlannedProcedureSection2(PlannedProcedureSection2 object) {
			return createPlannedProcedureSection2Adapter();
		}

		@Override
		public Adapter casePostprocedureDiagnosisSection2(PostprocedureDiagnosisSection2 object) {
			return createPostprocedureDiagnosisSection2Adapter();
		}

		@Override
		public Adapter casePreoperativeDiagnosisSection2(PreoperativeDiagnosisSection2 object) {
			return createPreoperativeDiagnosisSection2Adapter();
		}

		@Override
		public Adapter caseProcedureFindingsSection2(ProcedureFindingsSection2 object) {
			return createProcedureFindingsSection2Adapter();
		}

		@Override
		public Adapter caseProcedureIndicationsSection2(ProcedureIndicationsSection2 object) {
			return createProcedureIndicationsSection2Adapter();
		}

		@Override
		public Adapter caseDischargeMedicationsSection2(DischargeMedicationsSection2 object) {
			return createDischargeMedicationsSection2Adapter();
		}

		@Override
		public Adapter caseConsultationNote2(ConsultationNote2 object) {
			return createConsultationNote2Adapter();
		}

		@Override
		public Adapter caseContinuityOfCareDocument2(ContinuityOfCareDocument2 object) {
			return createContinuityOfCareDocument2Adapter();
		}

		@Override
		public Adapter caseDiagnosticImagingReport2(DiagnosticImagingReport2 object) {
			return createDiagnosticImagingReport2Adapter();
		}

		@Override
		public Adapter caseDischargeSummary2(DischargeSummary2 object) {
			return createDischargeSummary2Adapter();
		}

		@Override
		public Adapter caseHistoryAndPhysicalNote2(HistoryAndPhysicalNote2 object) {
			return createHistoryAndPhysicalNote2Adapter();
		}

		@Override
		public Adapter caseOperativeNote2(OperativeNote2 object) {
			return createOperativeNote2Adapter();
		}

		@Override
		public Adapter caseProcedureNote2(ProcedureNote2 object) {
			return createProcedureNote2Adapter();
		}

		@Override
		public Adapter caseProgressNote2(ProgressNote2 object) {
			return createProgressNote2Adapter();
		}

		@Override
		public Adapter caseUnstructuredDocument2(UnstructuredDocument2 object) {
			return createUnstructuredDocument2Adapter();
		}

		@Override
		public Adapter casePreconditionForSubstanceAdministration2(PreconditionForSubstanceAdministration2 object) {
			return createPreconditionForSubstanceAdministration2Adapter();
		}

		@Override
		public Adapter caseFamilyHistoryObservation2(FamilyHistoryObservation2 object) {
			return createFamilyHistoryObservation2Adapter();
		}

		@Override
		public Adapter caseFamilyHistoryOrganizer2(FamilyHistoryOrganizer2 object) {
			return createFamilyHistoryOrganizer2Adapter();
		}

		@Override
		public Adapter caseFamilyHistorySection2(FamilyHistorySection2 object) {
			return createFamilyHistorySection2Adapter();
		}

		@Override
		public Adapter casePhysicianReadingStudyPerformer2(PhysicianReadingStudyPerformer2 object) {
			return createPhysicianReadingStudyPerformer2Adapter();
		}

		@Override
		public Adapter caseCourseOfCareSection(CourseOfCareSection object) {
			return createCourseOfCareSectionAdapter();
		}

		@Override
		public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
			return createInfrastructureRootAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter caseClinicalDocument(ClinicalDocument object) {
			return createClinicalDocumentAdapter();
		}

		@Override
		public Adapter caseClinicalStatement(ClinicalStatement object) {
			return createClinicalStatementAdapter();
		}

		@Override
		public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
			return createCDA_ActAdapter();
		}

		@Override
		public Adapter caseObservation(Observation object) {
			return createObservationAdapter();
		}

		@Override
		public Adapter caseProcedure(Procedure object) {
			return createProcedureAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseParticipantRole(ParticipantRole object) {
			return createParticipantRoleAdapter();
		}

		@Override
		public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
			return createSubstanceAdministrationAdapter();
		}

		@Override
		public Adapter caseSupply(Supply object) {
			return createSupplyAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseOrganizer(Organizer object) {
			return createOrganizerAdapter();
		}

		@Override
		public Adapter caseEncounter(Encounter object) {
			return createEncounterAdapter();
		}

		@Override
		public Adapter caseManufacturedProduct(ManufacturedProduct object) {
			return createManufacturedProductAdapter();
		}

		@Override
		public Adapter caseCriterion(Criterion object) {
			return createCriterionAdapter();
		}

		@Override
		public Adapter caseParticipation(Participation object) {
			return createParticipationAdapter();
		}

		@Override
		public Adapter casePerformer1(Performer1 object) {
			return createPerformer1Adapter();
		}

		@Override
		public Adapter caseEncounterParticipant(EncounterParticipant object) {
			return createEncounterParticipantAdapter();
		}

		@Override
		public Adapter caseRelatedSubject(RelatedSubject object) {
			return createRelatedSubjectAdapter();
		}

		@Override
		public Adapter caseAuthor(Author object) {
			return createAuthorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct <em>Allergy Problem Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct
	 * @generated
	 */
	public Adapter createAllergyProblemActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation <em>Allergy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyObservation
	 * @generated
	 */
	public Adapter createAllergyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation <em>Substance Or Device Allergy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation
	 * @generated
	 */
	public Adapter createSubstanceOrDeviceAllergyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation <em>Reaction Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReactionObservation
	 * @generated
	 */
	public Adapter createReactionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation <em>Severity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SeverityObservation
	 * @generated
	 */
	public Adapter createSeverityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation <em>Allergy Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation
	 * @generated
	 */
	public Adapter createAllergyStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AgeObservation
	 * @generated
	 */
	public Adapter createAgeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation
	 * @generated
	 */
	public Adapter createHealthStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity <em>Comment Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CommentActivity
	 * @generated
	 */
	public Adapter createCommentActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
	 * @generated
	 */
	public Adapter createMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity <em>Non Medicinal Supply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity
	 * @generated
	 */
	public Adapter createNonMedicinalSupplyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProductInstance
	 * @generated
	 */
	public Adapter createProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Instructions
	 * @generated
	 */
	public Adapter createInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Indication <em>Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Indication
	 * @generated
	 */
	public Adapter createIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense <em>Medication Dispense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationDispense
	 * @generated
	 */
	public Adapter createMedicationDispenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder <em>Medication Supply Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder
	 * @generated
	 */
	public Adapter createMedicationSupplyOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle <em>Drug Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DrugVehicle
	 * @generated
	 */
	public Adapter createDrugVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct <em>Problem Concern Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct
	 * @generated
	 */
	public Adapter createProblemConcernActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus <em>Problem Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemStatus
	 * @generated
	 */
	public Adapter createProblemStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument <em>Continuity Of Care Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument
	 * @generated
	 */
	public Adapter createContinuityOfCareDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional <em>Advance Directives Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection <em>Allergies Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSection
	 * @generated
	 */
	public Adapter createAllergiesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional <em>Allergies Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional
	 * @generated
	 */
	public Adapter createAllergiesSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional <em>Encounters Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional
	 * @generated
	 */
	public Adapter createEncountersSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional <em>Immunizations Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createImmunizationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayersSection
	 * @generated
	 */
	public Adapter createPayersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity <em>Coverage Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CoverageActivity
	 * @generated
	 */
	public Adapter createCoverageActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity <em>Policy Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicyActivity
	 * @generated
	 */
	public Adapter createPolicyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity <em>Authorization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity
	 * @generated
	 */
	public Adapter createAuthorizationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional <em>Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct
	 * @generated
	 */
	public Adapter createPlanOfCareActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter
	 * @generated
	 */
	public Adapter createPlanOfCareActivityEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation
	 * @generated
	 */
	public Adapter createPlanOfCareActivityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure
	 * @generated
	 */
	public Adapter createPlanOfCareActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply <em>Plan Of Care Activity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection <em>Procedures Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSection
	 * @generated
	 */
	public Adapter createProceduresSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional <em>Procedures Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProceduresSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation <em>Procedure Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation
	 * @generated
	 */
	public Adapter createProcedureActivityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct <em>Procedure Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct
	 * @generated
	 */
	public Adapter createProcedureActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure <em>Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure
	 * @generated
	 */
	public Adapter createProcedureActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional <em>Vital Signs Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createVitalSignsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer <em>Family History Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer
	 * @generated
	 */
	public Adapter createFamilyHistoryOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation
	 * @generated
	 */
	public Adapter createFamilyHistoryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation <em>Family History Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation
	 * @generated
	 */
	public Adapter createFamilyHistoryDeathObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation <em>Social History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation
	 * @generated
	 */
	public Adapter createSocialHistoryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation <em>Pregnancy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PregnancyObservation
	 * @generated
	 */
	public Adapter createPregnancyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery <em>Estimated Date Of Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery
	 * @generated
	 */
	public Adapter createEstimatedDateOfDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation <em>Smoking Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation
	 * @generated
	 */
	public Adapter createSmokingStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse <em>Tobacco Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.TobaccoUse
	 * @generated
	 */
	public Adapter createTobaccoUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSection
	 * @generated
	 */
	public Adapter createResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional <em>Results Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createResultsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * @generated
	 */
	public Adapter createResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection
	 * @generated
	 */
	public Adapter createMedicalEquipmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer <em>Functional Status Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer
	 * @generated
	 */
	public Adapter createFunctionalStatusResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation <em>Functional Status Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation
	 * @generated
	 */
	public Adapter createFunctionalStatusResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics <em>Caregiver Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics
	 * @generated
	 */
	public Adapter createCaregiverCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation <em>Assessment Scale Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation
	 * @generated
	 */
	public Adapter createAssessmentScaleObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation <em>Assessment Scale Supporting Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation
	 * @generated
	 */
	public Adapter createAssessmentScaleSupportingObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer <em>Cognitive Status Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer
	 * @generated
	 */
	public Adapter createCognitiveStatusResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation <em>Cognitive Status Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation
	 * @generated
	 */
	public Adapter createCognitiveStatusResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation <em>Functional Status Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation
	 * @generated
	 */
	public Adapter createFunctionalStatusProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation <em>Cognitive Status Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation
	 * @generated
	 */
	public Adapter createCognitiveStatusProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation <em>Pressure Ulcer Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation
	 * @generated
	 */
	public Adapter createPressureUlcerObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation <em>Number Of Pressure Ulcers Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation
	 * @generated
	 */
	public Adapter createNumberOfPressureUlcersObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage <em>Highest Pressure Ulcer Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage
	 * @generated
	 */
	public Adapter createHighestPressureUlcerStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection <em>Problem Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSection
	 * @generated
	 */
	public Adapter createProblemSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional <em>Problem Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProblemSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation <em>Advance Directive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSection
	 * @generated
	 */
	public Adapter createEncountersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities <em>Encounter Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterActivities
	 * @generated
	 */
	public Adapter createEncounterActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis <em>Encounter Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis
	 * @generated
	 */
	public Adapter createEncounterDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation <em>Service Delivery Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation
	 * @generated
	 */
	public Adapter createServiceDeliveryLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity <em>Immunization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity
	 * @generated
	 */
	public Adapter createImmunizationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason <em>Immunization Refusal Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationRefusalReason
	 * @generated
	 */
	public Adapter createImmunizationRefusalReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection <em>Hospital Discharge Studies Summary Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection
	 * @generated
	 */
	public Adapter createHospitalDischargeStudiesSummarySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication <em>Discharge Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeMedication
	 * @generated
	 */
	public Adapter createDischargeMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis <em>Hospital Discharge Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis
	 * @generated
	 */
	public Adapter createHospitalDischargeDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection <em>Hospital Discharge Instructions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeInstructionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation
	 * @generated
	 */
	public Adapter createVitalSignObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection <em>History Of Present Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection <em>Hospital Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional <em>Hospital Admission Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createHospitalAdmissionMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication <em>Admission Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication
	 * @generated
	 */
	public Adapter createAdmissionMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection <em>Hospital Discharge Physical Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection
	 * @generated
	 */
	public Adapter createHospitalDischargePhysicalSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection <em>Chief Complaint And Reason For Visit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection
	 * @generated
	 */
	public Adapter createChiefComplaintAndReasonForVisitSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection <em>Reason For Visit Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection
	 * @generated
	 */
	public Adapter createReasonForVisitSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection
	 * @generated
	 */
	public Adapter createPhysicalExamSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection <em>General Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection
	 * @generated
	 */
	public Adapter createGeneralStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection
	 * @generated
	 */
	public Adapter createHospitalCourseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection <em>Surgical Drains Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection
	 * @generated
	 */
	public Adapter createSurgicalDrainsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument <em>Unstructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument
	 * @generated
	 */
	public Adapter createUnstructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation <em>Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationInformation
	 * @generated
	 */
	public Adapter createMedicationInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeSummary
	 * @generated
	 */
	public Adapter createDischargeSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection <em>Discharge Diet Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection
	 * @generated
	 */
	public Adapter createDischargeDietSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional <em>Hospital Discharge Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration <em>Precondition For Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration
	 * @generated
	 */
	public Adapter createPreconditionForSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation <em>Immunization Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation
	 * @generated
	 */
	public Adapter createImmunizationMedicationInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Supply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Supply
	 * @generated
	 */
	public Adapter createSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ParticipantRole
	 * @generated
	 */
	public Adapter createParticipantRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Participation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Participation
	 * @generated
	 */
	public Adapter createParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection <em>Anesthesia Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection
	 * @generated
	 */
	public Adapter createAnesthesiaSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection <em>Complications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection
	 * @generated
	 */
	public Adapter createComplicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection <em>DICOM Object Catalog Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DICOMObjectCatalogSection
	 * @generated
	 */
	public Adapter createDICOMObjectCatalogSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.StudyAct <em>Study Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.StudyAct
	 * @generated
	 */
	public Adapter createStudyActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct <em>Series Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SeriesAct
	 * @generated
	 */
	public Adapter createSeriesActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation <em>SOP Instance Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation
	 * @generated
	 */
	public Adapter createSOPInstanceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation <em>Purposeof Reference Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PurposeofReferenceObservation
	 * @generated
	 */
	public Adapter createPurposeofReferenceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation <em>Referenced Frames Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation
	 * @generated
	 */
	public Adapter createReferencedFramesObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation <em>Boundary Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation
	 * @generated
	 */
	public Adapter createBoundaryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FindingsSection <em>Findings Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FindingsSection
	 * @generated
	 */
	public Adapter createFindingsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection <em>Hospital Consultations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection
	 * @generated
	 */
	public Adapter createHospitalConsultationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection <em>Interventions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InterventionsSection
	 * @generated
	 */
	public Adapter createInterventionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection <em>Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection
	 * @generated
	 */
	public Adapter createMedicalHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection <em>Objective Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection
	 * @generated
	 */
	public Adapter createObjectiveSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection <em>Operative Note Fluid Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection
	 * @generated
	 */
	public Adapter createOperativeNoteFluidSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection <em>Operative Note Surgical Procedure Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection
	 * @generated
	 */
	public Adapter createOperativeNoteSurgicalProcedureSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection <em>Planned Procedure Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection
	 * @generated
	 */
	public Adapter createPlannedProcedureSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection <em>Postoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createPostoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection <em>Postprocedure Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis <em>Postprocedure Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection <em>Preoperative Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection <em>Procedure Description Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection
	 * @generated
	 */
	public Adapter createProcedureDescriptionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection <em>Procedure Disposition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection
	 * @generated
	 */
	public Adapter createProcedureDispositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection <em>Procedure Estimated Blood Loss Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection
	 * @generated
	 */
	public Adapter createProcedureEstimatedBloodLossSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection <em>Procedure Findings Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection
	 * @generated
	 */
	public Adapter createProcedureFindingsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection <em>Procedure Implants Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection
	 * @generated
	 */
	public Adapter createProcedureImplantsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection <em>Procedure Indications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection
	 * @generated
	 */
	public Adapter createProcedureIndicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection <em>Procedure Specimens Taken Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection
	 * @generated
	 */
	public Adapter createProcedureSpecimensTakenSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection <em>Subjective Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection
	 * @generated
	 */
	public Adapter createSubjectiveSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote <em>Consultation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsultationNote
	 * @generated
	 */
	public Adapter createConsultationNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentSection <em>Assessment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentSection
	 * @generated
	 */
	public Adapter createAssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote <em>History And Physical Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote
	 * @generated
	 */
	public Adapter createHistoryAndPhysicalNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote <em>Operative Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNote
	 * @generated
	 */
	public Adapter createOperativeNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote <em>Procedure Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote
	 * @generated
	 */
	public Adapter createProcedureNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote <em>Progress Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProgressNote
	 * @generated
	 */
	public Adapter createProgressNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis <em>Preoperative Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection <em>Instructions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InstructionsSection
	 * @generated
	 */
	public Adapter createInstructionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis <em>Hospital Admission Diagnosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport <em>Diagnostic Imaging Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport
	 * @generated
	 */
	public Adapter createDiagnosticImagingReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer <em>Physician Reading Study Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer
	 * @generated
	 */
	public Adapter createPhysicianReadingStudyPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant <em>Physicianof Record Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant
	 * @generated
	 */
	public Adapter createPhysicianofRecordParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.TextObservation <em>Text Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.TextObservation
	 * @generated
	 */
	public Adapter createTextObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation <em>Quantity Measurement Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.QuantityMeasurementObservation
	 * @generated
	 */
	public Adapter createQuantityMeasurementObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CodeObservations <em>Code Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CodeObservations
	 * @generated
	 */
	public Adapter createCodeObservationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureContext <em>Procedure Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureContext
	 * @generated
	 */
	public Adapter createProcedureContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown <em>Medication Use None Known</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationUseNoneKnown
	 * @generated
	 */
	public Adapter createMedicationUseNoneKnownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation <em>Deceased Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation
	 * @generated
	 */
	public Adapter createDeceasedObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext <em>Fetus Subject Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext
	 * @generated
	 */
	public Adapter createFetusSubjectContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ObserverContext <em>Observer Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ObserverContext
	 * @generated
	 */
	public Adapter createObserverContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ActReference <em>Act Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ActReference
	 * @generated
	 */
	public Adapter createActReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer <em>Advance Directive Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveOrganizer
	 * @generated
	 */
	public Adapter createAdvanceDirectiveOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment <em>Characteristics Of Home Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment
	 * @generated
	 */
	public Adapter createCharacteristicsOfHomeEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation <em>Cognitive Abilities Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveAbilitiesObservation
	 * @generated
	 */
	public Adapter createCognitiveAbilitiesObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation <em>Cultural And Religious Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation
	 * @generated
	 */
	public Adapter createCulturalAndReligiousObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct <em>Drug Monitoring Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct
	 * @generated
	 */
	public Adapter createDrugMonitoringActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication <em>Handoff Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HandoffCommunication
	 * @generated
	 */
	public Adapter createHandoffCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer <em>Medical Equipment Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer
	 * @generated
	 */
	public Adapter createMedicalEquipmentOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation <em>Mental Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation
	 * @generated
	 */
	public Adapter createMentalStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment <em>Nutrition Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NutritionAssessment
	 * @generated
	 */
	public Adapter createNutritionAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations <em>Nutrition Recommendations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendations
	 * @generated
	 */
	public Adapter createNutritionRecommendationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation <em>Nutritional Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NutritionalStatusObservation
	 * @generated
	 */
	public Adapter createNutritionalStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation <em>Outcome Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation
	 * @generated
	 */
	public Adapter createOutcomeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference <em>Patient Priority Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientPriorityPreference
	 * @generated
	 */
	public Adapter createPatientPriorityPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct <em>Patient Referral Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct
	 * @generated
	 */
	public Adapter createPatientReferralActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage <em>Planned Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage
	 * @generated
	 */
	public Adapter createPlannedCoverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation <em>Goal Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GoalObservation
	 * @generated
	 */
	public Adapter createGoalObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct <em>Health Concern Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct
	 * @generated
	 */
	public Adapter createHealthConcernActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct <em>Intervention Act</em>}'.
	 * <!-- begin-user-doc -->
	* This default implementation returns null so that we can easily ignore cases;
	* it's useful to ignore a case when inheritance will catch all the cases anyway.
	* <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InterventionAct
	 * @generated
	 */
	public Adapter createInterventionActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference <em>External Document Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference
	 * @generated
	 */
	public Adapter createExternalDocumentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity <em>Planned Immunization Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedImmunizationActivity
	 * @generated
	 */
	public Adapter createPlannedImmunizationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation <em>Prognosis Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation
	 * @generated
	 */
	public Adapter createPrognosisObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation <em>Progress Toward Goal Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation
	 * @generated
	 */
	public Adapter createProgressTowardGoalObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference <em>Provider Priority Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProviderPriorityPreference
	 * @generated
	 */
	public Adapter createProviderPriorityPreferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities <em>Self Care Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities
	 * @generated
	 */
	public Adapter createSelfCareActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus <em>Sensory And Speech Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus
	 * @generated
	 */
	public Adapter createSensoryAndSpeechStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct <em>Substance Administered Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct
	 * @generated
	 */
	public Adapter createSubstanceAdministeredActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics <em>Wound Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics
	 * @generated
	 */
	public Adapter createWoundCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2 <em>Number Of Pressure Ulcers Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation2
	 * @generated
	 */
	public Adapter createNumberOfPressureUlcersObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation <em>Wound Measurement Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation
	 * @generated
	 */
	public Adapter createWoundMeasurementObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.WoundObservation <em>Wound Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.WoundObservation
	 * @generated
	 */
	public Adapter createWoundObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GoalsSection <em>Goals Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GoalsSection
	 * @generated
	 */
	public Adapter createGoalsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection <em>Health Concerns Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection
	 * @generated
	 */
	public Adapter createHealthConcernsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection <em>Health Status Evaluations Outcomes Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthStatusEvaluationsOutcomesSection
	 * @generated
	 */
	public Adapter createHealthStatusEvaluationsOutcomesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection <em>Mental Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection
	 * @generated
	 */
	public Adapter createMentalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NutritionSection <em>Nutrition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NutritionSection
	 * @generated
	 */
	public Adapter createNutritionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection <em>Physical Findings Of Skin Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection
	 * @generated
	 */
	public Adapter createPhysicalFindingsOfSkinSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2 <em>US Realm Header2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2
	 * @generated
	 */
	public Adapter createUSRealmHeader2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CarePlan <em>Care Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CarePlan
	 * @generated
	 */
	public Adapter createCarePlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote <em>Referral Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReferralNote
	 * @generated
	 */
	public Adapter createReferralNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary <em>Transfer Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.TransferSummary
	 * @generated
	 */
	public Adapter createTransferSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument <em>US Realm Header Patient Generated Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderPatientGeneratedDocument
	 * @generated
	 */
	public Adapter createUSRealmHeaderPatientGeneratedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation <em>Author Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation
	 * @generated
	 */
	public Adapter createAuthorParticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2 <em>Admission Medication2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication2
	 * @generated
	 */
	public Adapter createAdmissionMedication2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2 <em>Advance Directive Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2
	 * @generated
	 */
	public Adapter createAdvanceDirectiveObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2 <em>Allergy Concern Act2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2
	 * @generated
	 */
	public Adapter createAllergyConcernAct2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2 <em>Allergy Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2
	 * @generated
	 */
	public Adapter createAllergyObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusOrganizer2 <em>Cognitive Status Organizer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusOrganizer2
	 * @generated
	 */
	public Adapter createCognitiveStatusOrganizer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2 <em>Cognitive Status Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusObservation2
	 * @generated
	 */
	public Adapter createCognitiveStatusObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2 <em>Coverage Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CoverageActivity2
	 * @generated
	 */
	public Adapter createCoverageActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2 <em>Current Smoking Status2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CurrentSmokingStatus2
	 * @generated
	 */
	public Adapter createCurrentSmokingStatus2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2 <em>Deceased Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation2
	 * @generated
	 */
	public Adapter createDeceasedObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2 <em>Discharge Medication2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeMedication2
	 * @generated
	 */
	public Adapter createDischargeMedication2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2 <em>Encounter Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterActivity2
	 * @generated
	 */
	public Adapter createEncounterActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2 <em>Encounter Diagnosis2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis2
	 * @generated
	 */
	public Adapter createEncounterDiagnosis2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2 <em>Functional Status Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2
	 * @generated
	 */
	public Adapter createFunctionalStatusObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2 <em>Functional Status Organizer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2
	 * @generated
	 */
	public Adapter createFunctionalStatusOrganizer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2 <em>Health Status Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2
	 * @generated
	 */
	public Adapter createHealthStatusObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2 <em>Hospital Admission Diagnosis2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis2
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosis2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2 <em>Hospital Discharge Diagnosis2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2
	 * @generated
	 */
	public Adapter createHospitalDischargeDiagnosis2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2 <em>Immunization Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity2
	 * @generated
	 */
	public Adapter createImmunizationActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2 <em>Immunization Medication Information2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation2
	 * @generated
	 */
	public Adapter createImmunizationMedicationInformation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Indication2 <em>Indication2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Indication2
	 * @generated
	 */
	public Adapter createIndication2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Instruction2 <em>Instruction2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.Instruction2
	 * @generated
	 */
	public Adapter createInstruction2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2 <em>Medication Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2
	 * @generated
	 */
	public Adapter createMedicationActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2 <em>Medication Dispense2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationDispense2
	 * @generated
	 */
	public Adapter createMedicationDispense2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2 <em>Medication Information2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationInformation2
	 * @generated
	 */
	public Adapter createMedicationInformation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2 <em>Medication Supply Order2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder2
	 * @generated
	 */
	public Adapter createMedicationSupplyOrder2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2 <em>Non Medicinal Supply Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2
	 * @generated
	 */
	public Adapter createNonMedicinalSupplyActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2 <em>Physicianof Record Participant2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2
	 * @generated
	 */
	public Adapter createPhysicianofRecordParticipant2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedAct2 <em>Planned Act2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedAct2
	 * @generated
	 */
	public Adapter createPlannedAct2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2 <em>Planned Encounter2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedEncounter2
	 * @generated
	 */
	public Adapter createPlannedEncounter2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2 <em>Planned Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedObservation2
	 * @generated
	 */
	public Adapter createPlannedObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2 <em>Planned Procedure2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedProcedure2
	 * @generated
	 */
	public Adapter createPlannedProcedure2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2 <em>Planned Medication Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedMedicationActivity2
	 * @generated
	 */
	public Adapter createPlannedMedicationActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2 <em>Planned Supply2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedSupply2
	 * @generated
	 */
	public Adapter createPlannedSupply2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2 <em>Policy Activity2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PolicyActivity2
	 * @generated
	 */
	public Adapter createPolicyActivity2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2 <em>Postprocedure Diagnosis2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis2
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosis2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2 <em>Preoperative Diagnosis2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis2
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosis2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2 <em>Problem Concern Act2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2
	 * @generated
	 */
	public Adapter createProblemConcernAct2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2 <em>Problem Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2
	 * @generated
	 */
	public Adapter createProblemObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2 <em>Procedure Activity Act2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2
	 * @generated
	 */
	public Adapter createProcedureActivityAct2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2 <em>Procedure Activity Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2
	 * @generated
	 */
	public Adapter createProcedureActivityObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2 <em>Procedure Activity Procedure2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2
	 * @generated
	 */
	public Adapter createProcedureActivityProcedure2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2 <em>Reaction Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2
	 * @generated
	 */
	public Adapter createReactionObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation2 <em>Result Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultObservation2
	 * @generated
	 */
	public Adapter createResultObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2 <em>Result Organizer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2
	 * @generated
	 */
	public Adapter createResultOrganizer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2 <em>Severity Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2
	 * @generated
	 */
	public Adapter createSeverityObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2 <em>Social History Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2
	 * @generated
	 */
	public Adapter createSocialHistoryObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2 <em>Substance Or Device Allergy Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2
	 * @generated
	 */
	public Adapter createSubstanceOrDeviceAllergyObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2 <em>Tobacco Use2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2
	 * @generated
	 */
	public Adapter createTobaccoUse2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2 <em>Vital Sign Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2
	 * @generated
	 */
	public Adapter createVitalSignObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2 <em>Vital Signs Organizer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2
	 * @generated
	 */
	public Adapter createVitalSignsOrganizer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2 <em>Anesthesia Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection2
	 * @generated
	 */
	public Adapter createAnesthesiaSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2 <em>Assessment And Plan Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2 <em>Complications Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection2
	 * @generated
	 */
	public Adapter createComplicationsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2 <em>Admission Diagnosis Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2
	 * @generated
	 */
	public Adapter createAdmissionDiagnosisSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2 <em>Admission Medications Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createAdmissionMedicationsSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2 <em>Discharge Medications Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createDischargeMedicationsSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2 <em>Encounters Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createEncountersSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2 <em>Discharge Diagnosis Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2
	 * @generated
	 */
	public Adapter createDischargeDiagnosisSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2 <em>Functional Status Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2
	 * @generated
	 */
	public Adapter createFunctionalStatusSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2 <em>History Of Past Illness Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2 <em>Immunizations Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createImmunizationsSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2 <em>Instructions Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2
	 * @generated
	 */
	public Adapter createInstructionsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2 <em>Interventions Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2
	 * @generated
	 */
	public Adapter createInterventionsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2 <em>Medical Equipment Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2
	 * @generated
	 */
	public Adapter createMedicalEquipmentSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2 <em>Medications Administered Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection2
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PayersSection2 <em>Payers Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PayersSection2
	 * @generated
	 */
	public Adapter createPayersSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2 <em>Physical Exam Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2
	 * @generated
	 */
	public Adapter createPhysicalExamSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2 <em>Plan Of Treatment Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2
	 * @generated
	 */
	public Adapter createPlanOfTreatmentSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2 <em>Planned Procedure Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection2
	 * @generated
	 */
	public Adapter createPlannedProcedureSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2 <em>Postprocedure Diagnosis Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection2
	 * @generated
	 */
	public Adapter createPostprocedureDiagnosisSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2 <em>Preoperative Diagnosis Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection2
	 * @generated
	 */
	public Adapter createPreoperativeDiagnosisSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2 <em>Procedure Findings Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2
	 * @generated
	 */
	public Adapter createProcedureFindingsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2 <em>Procedure Indications Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2
	 * @generated
	 */
	public Adapter createProcedureIndicationsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2 <em>Discharge Medications Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2
	 * @generated
	 */
	public Adapter createDischargeMedicationsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2 <em>Procedures Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createProceduresSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2 <em>Reason For Referral Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2
	 * @generated
	 */
	public Adapter createReasonForReferralSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2 <em>Results Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createResultsSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2 <em>Social History Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2
	 * @generated
	 */
	public Adapter createSocialHistorySection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2 <em>Vital Signs Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createVitalSignsSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2 <em>Advance Directives Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2 <em>Medications Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createMedicationsSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2 <em>Problem Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createProblemSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2 <em>Advance Directives Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2 <em>Allergies Section Entries Optional2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2
	 * @generated
	 */
	public Adapter createAllergiesSectionEntriesOptional2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2 <em>Allergies Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2
	 * @generated
	 */
	public Adapter createAllergiesSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection2 <em>Encounters Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSection2
	 * @generated
	 */
	public Adapter createEncountersSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2 <em>Immunizations Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2
	 * @generated
	 */
	public Adapter createImmunizationsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2 <em>Medications Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2
	 * @generated
	 */
	public Adapter createMedicationsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSection2 <em>Problem Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSection2
	 * @generated
	 */
	public Adapter createProblemSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2 <em>Procedures Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2
	 * @generated
	 */
	public Adapter createProceduresSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSection2 <em>Results Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSection2
	 * @generated
	 */
	public Adapter createResultsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2 <em>Vital Signs Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2
	 * @generated
	 */
	public Adapter createVitalSignsSection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2 <em>Consultation Note2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2
	 * @generated
	 */
	public Adapter createConsultationNote2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2 <em>Continuity Of Care Document2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2
	 * @generated
	 */
	public Adapter createContinuityOfCareDocument2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2 <em>Diagnostic Imaging Report2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport2
	 * @generated
	 */
	public Adapter createDiagnosticImagingReport2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2 <em>Discharge Summary2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2
	 * @generated
	 */
	public Adapter createDischargeSummary2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2 <em>History And Physical Note2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2
	 * @generated
	 */
	public Adapter createHistoryAndPhysicalNote2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote2 <em>Operative Note2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.OperativeNote2
	 * @generated
	 */
	public Adapter createOperativeNote2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2 <em>Procedure Note2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2
	 * @generated
	 */
	public Adapter createProcedureNote2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2 <em>Progress Note2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProgressNote2
	 * @generated
	 */
	public Adapter createProgressNote2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2 <em>Unstructured Document2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument2
	 * @generated
	 */
	public Adapter createUnstructuredDocument2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2 <em>Precondition For Substance Administration2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration2
	 * @generated
	 */
	public Adapter createPreconditionForSubstanceAdministration2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2 <em>Family History Observation2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation2
	 * @generated
	 */
	public Adapter createFamilyHistoryObservation2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2 <em>Family History Organizer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer2
	 * @generated
	 */
	public Adapter createFamilyHistoryOrganizer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2 <em>Family History Section2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2
	 * @generated
	 */
	public Adapter createFamilyHistorySection2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2 <em>Physician Reading Study Performer2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer2
	 * @generated
	 */
	public Adapter createPhysicianReadingStudyPerformer2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection <em>Course Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection
	 * @generated
	 */
	public Adapter createCourseOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Performer1 <em>Performer1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Performer1
	 * @generated
	 */
	public Adapter createPerformer1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ManufacturedProduct <em>Manufactured Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ManufacturedProduct
	 * @generated
	 */
	public Adapter createManufacturedProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Criterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Criterion
	 * @generated
	 */
	public Adapter createCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.EncounterParticipant <em>Encounter Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.EncounterParticipant
	 * @generated
	 */
	public Adapter createEncounterParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.RelatedSubject <em>Related Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.RelatedSubject
	 * @generated
	 */
	public Adapter createRelatedSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ConsolAdapterFactory
