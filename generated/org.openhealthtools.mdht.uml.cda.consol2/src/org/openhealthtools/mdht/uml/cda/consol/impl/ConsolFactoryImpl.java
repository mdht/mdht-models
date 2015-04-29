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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.consol.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsolFactoryImpl extends EFactoryImpl implements ConsolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsolFactory init() {
		try {
			ConsolFactory theConsolFactory = (ConsolFactory) EPackage.Registry.INSTANCE.getEFactory(ConsolPackage.eNS_URI);
			if (theConsolFactory != null) {
				return theConsolFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConsolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS:
				return createGeneralHeaderConstraints();
			case ConsolPackage.ALLERGY_PROBLEM_ACT:
				return createAllergyProblemAct();
			case ConsolPackage.ALLERGY_OBSERVATION:
				return createAllergyObservation();
			case ConsolPackage.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION:
				return createSubstanceOrDeviceAllergyObservation();
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION:
				return createAllergyStatusObservation();
			case ConsolPackage.REACTION_OBSERVATION:
				return createReactionObservation();
			case ConsolPackage.SEVERITY_OBSERVATION:
				return createSeverityObservation();
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return createProcedureActivityProcedure();
			case ConsolPackage.INDICATION:
				return createIndication();
			case ConsolPackage.SERVICE_DELIVERY_LOCATION:
				return createServiceDeliveryLocation();
			case ConsolPackage.MEDICATION_ACTIVITY:
				return createMedicationActivity();
			case ConsolPackage.MEDICATION_SUPPLY_ORDER:
				return createMedicationSupplyOrder();
			case ConsolPackage.INSTRUCTIONS:
				return createInstructions();
			case ConsolPackage.MEDICATION_DISPENSE:
				return createMedicationDispense();
			case ConsolPackage.DRUG_VEHICLE:
				return createDrugVehicle();
			case ConsolPackage.PRODUCT_INSTANCE:
				return createProductInstance();
			case ConsolPackage.AGE_OBSERVATION:
				return createAgeObservation();
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case ConsolPackage.COMMENT_ACTIVITY:
				return createCommentActivity();
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY:
				return createNonMedicinalSupplyActivity();
			case ConsolPackage.PROBLEM_CONCERN_ACT:
				return createProblemConcernAct();
			case ConsolPackage.PROBLEM_OBSERVATION:
				return createProblemObservation();
			case ConsolPackage.PROBLEM_STATUS:
				return createProblemStatus();
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return createContinuityOfCareDocument();
			case ConsolPackage.ALLERGIES_SECTION:
				return createAllergiesSection();
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
				return createAllergiesSectionEntriesOptional();
			case ConsolPackage.MEDICATIONS_SECTION:
				return createMedicationsSection();
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createMedicationsSectionEntriesOptional();
			case ConsolPackage.PROBLEM_SECTION:
				return createProblemSection();
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL:
				return createProblemSectionEntriesOptional();
			case ConsolPackage.PROCEDURES_SECTION:
				return createProceduresSection();
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL:
				return createProceduresSectionEntriesOptional();
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION:
				return createProcedureActivityObservation();
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT:
				return createProcedureActivityAct();
			case ConsolPackage.RESULTS_SECTION:
				return createResultsSection();
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL:
				return createResultsSectionEntriesOptional();
			case ConsolPackage.RESULT_ORGANIZER:
				return createResultOrganizer();
			case ConsolPackage.RESULT_OBSERVATION:
				return createResultObservation();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION:
				return createAdvanceDirectivesSection();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL:
				return createAdvanceDirectivesSectionEntriesOptional();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return createAdvanceDirectiveObservation();
			case ConsolPackage.ENCOUNTERS_SECTION:
				return createEncountersSection();
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL:
				return createEncountersSectionEntriesOptional();
			case ConsolPackage.ENCOUNTER_ACTIVITIES:
				return createEncounterActivities();
			case ConsolPackage.ENCOUNTER_DIAGNOSIS:
				return createEncounterDiagnosis();
			case ConsolPackage.FAMILY_HISTORY_SECTION:
				return createFamilyHistorySection();
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER:
				return createFamilyHistoryOrganizer();
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION:
				return createFamilyHistoryObservation();
			case ConsolPackage.FAMILY_HISTORY_DEATH_OBSERVATION:
				return createFamilyHistoryDeathObservation();
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION:
				return createFunctionalStatusSection();
			case ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER:
				return createFunctionalStatusResultOrganizer();
			case ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION:
				return createFunctionalStatusResultObservation();
			case ConsolPackage.CAREGIVER_CHARACTERISTICS:
				return createCaregiverCharacteristics();
			case ConsolPackage.ASSESSMENT_SCALE_OBSERVATION:
				return createAssessmentScaleObservation();
			case ConsolPackage.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION:
				return createAssessmentScaleSupportingObservation();
			case ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER:
				return createCognitiveStatusResultOrganizer();
			case ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION:
				return createCognitiveStatusResultObservation();
			case ConsolPackage.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION:
				return createFunctionalStatusProblemObservation();
			case ConsolPackage.COGNITIVE_STATUS_PROBLEM_OBSERVATION:
				return createCognitiveStatusProblemObservation();
			case ConsolPackage.PRESSURE_ULCER_OBSERVATION:
				return createPressureUlcerObservation();
			case ConsolPackage.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION:
				return createNumberOfPressureUlcersObservation();
			case ConsolPackage.HIGHEST_PRESSURE_ULCER_STAGE:
				return createHighestPressureUlcerStage();
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL:
				return createImmunizationsSectionEntriesOptional();
			case ConsolPackage.IMMUNIZATION_ACTIVITY:
				return createImmunizationActivity();
			case ConsolPackage.IMMUNIZATION_REFUSAL_REASON:
				return createImmunizationRefusalReason();
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION:
				return createMedicalEquipmentSection();
			case ConsolPackage.PAYERS_SECTION:
				return createPayersSection();
			case ConsolPackage.COVERAGE_ACTIVITY:
				return createCoverageActivity();
			case ConsolPackage.POLICY_ACTIVITY:
				return createPolicyActivity();
			case ConsolPackage.PLAN_OF_CARE_SECTION:
				return createPlanOfCareSection();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT:
				return createPlanOfCareActivityAct();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER:
				return createPlanOfCareActivityEncounter();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION:
				return createPlanOfCareActivityObservation();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return createPlanOfCareActivityProcedure();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return createPlanOfCareActivitySubstanceAdministration();
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY:
				return createPlanOfCareActivitySupply();
			case ConsolPackage.SOCIAL_HISTORY_SECTION:
				return createSocialHistorySection();
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION:
				return createSocialHistoryObservation();
			case ConsolPackage.PREGNANCY_OBSERVATION:
				return createPregnancyObservation();
			case ConsolPackage.ESTIMATED_DATE_OF_DELIVERY:
				return createEstimatedDateOfDelivery();
			case ConsolPackage.SMOKING_STATUS_OBSERVATION:
				return createSmokingStatusObservation();
			case ConsolPackage.TOBACCO_USE:
				return createTobaccoUse();
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL:
				return createVitalSignsSectionEntriesOptional();
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case ConsolPackage.VITAL_SIGN_OBSERVATION:
				return createVitalSignObservation();
			case ConsolPackage.IMMUNIZATIONS_SECTION:
				return createImmunizationsSection();
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return createVitalSignsSection();
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return createHistoryOfPastIllnessSection();
			case ConsolPackage.CHIEF_COMPLAINT_SECTION:
				return createChiefComplaintSection();
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION:
				return createReasonForReferralSection();
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS_SECTION:
				return createHistoryOfPresentIllnessSection();
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return createHospitalAdmissionDiagnosisSection();
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS:
				return createHospitalAdmissionDiagnosis();
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createHospitalAdmissionMedicationsSectionEntriesOptional();
			case ConsolPackage.ADMISSION_MEDICATION:
				return createAdmissionMedication();
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return createMedicationsAdministeredSection();
			case ConsolPackage.PHYSICAL_EXAM_SECTION:
				return createPhysicalExamSection();
			case ConsolPackage.GENERAL_STATUS_SECTION:
				return createGeneralStatusSection();
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION:
				return createReviewOfSystemsSection();
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION:
				return createAssessmentAndPlanSection();
			case ConsolPackage.SURGICAL_DRAINS_SECTION:
				return createSurgicalDrainsSection();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT:
				return createUnstructuredDocument();
			case ConsolPackage.MEDICATION_INFORMATION:
				return createMedicationInformation();
			case ConsolPackage.DISCHARGE_SUMMARY:
				return createDischargeSummary();
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION:
				return createHospitalDischargeDiagnosisSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS:
				return createHospitalDischargeDiagnosis();
			case ConsolPackage.DISCHARGE_DIET_SECTION:
				return createDischargeDietSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createHospitalDischargeMedicationsSectionEntriesOptional();
			case ConsolPackage.DISCHARGE_MEDICATION:
				return createDischargeMedication();
			case ConsolPackage.HOSPITAL_COURSE_SECTION:
				return createHospitalCourseSection();
			case ConsolPackage.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION:
				return createChiefComplaintAndReasonForVisitSection();
			case ConsolPackage.HOSPITAL_CONSULTATIONS_SECTION:
				return createHospitalConsultationsSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION:
				return createHospitalDischargeInstructionsSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_PHYSICAL_SECTION:
				return createHospitalDischargePhysicalSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION:
				return createHospitalDischargeStudiesSummarySection();
			case ConsolPackage.REASON_FOR_VISIT_SECTION:
				return createReasonForVisitSection();
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION:
				return createPreconditionForSubstanceAdministration();
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION:
				return createImmunizationMedicationInformation();
			case ConsolPackage.AUTHORIZATION_ACTIVITY:
				return createAuthorizationActivity();
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return createHospitalDischargeMedicationsSection();
			case ConsolPackage.ANESTHESIA_SECTION:
				return createAnesthesiaSection();
			case ConsolPackage.COMPLICATIONS_SECTION:
				return createComplicationsSection();
			case ConsolPackage.DICOM_OBJECT_CATALOG_SECTION:
				return createDICOMObjectCatalogSection();
			case ConsolPackage.STUDY_ACT:
				return createStudyAct();
			case ConsolPackage.SERIES_ACT:
				return createSeriesAct();
			case ConsolPackage.SOP_INSTANCE_OBSERVATION:
				return createSOPInstanceObservation();
			case ConsolPackage.PURPOSEOF_REFERENCE_OBSERVATION:
				return createPurposeofReferenceObservation();
			case ConsolPackage.REFERENCED_FRAMES_OBSERVATION:
				return createReferencedFramesObservation();
			case ConsolPackage.BOUNDARY_OBSERVATION:
				return createBoundaryObservation();
			case ConsolPackage.FINDINGS_SECTION:
				return createFindingsSection();
			case ConsolPackage.INTERVENTIONS_SECTION:
				return createInterventionsSection();
			case ConsolPackage.MEDICAL_HISTORY_SECTION:
				return createMedicalHistorySection();
			case ConsolPackage.OBJECTIVE_SECTION:
				return createObjectiveSection();
			case ConsolPackage.OPERATIVE_NOTE_FLUID_SECTION:
				return createOperativeNoteFluidSection();
			case ConsolPackage.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION:
				return createOperativeNoteSurgicalProcedureSection();
			case ConsolPackage.PLANNED_PROCEDURE_SECTION:
				return createPlannedProcedureSection();
			case ConsolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION:
				return createPostoperativeDiagnosisSection();
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION:
				return createPostprocedureDiagnosisSection();
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS:
				return createPostprocedureDiagnosis();
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION:
				return createPreoperativeDiagnosisSection();
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS:
				return createPreoperativeDiagnosis();
			case ConsolPackage.PROCEDURE_DESCRIPTION_SECTION:
				return createProcedureDescriptionSection();
			case ConsolPackage.PROCEDURE_DISPOSITION_SECTION:
				return createProcedureDispositionSection();
			case ConsolPackage.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION:
				return createProcedureEstimatedBloodLossSection();
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION:
				return createProcedureFindingsSection();
			case ConsolPackage.PROCEDURE_IMPLANTS_SECTION:
				return createProcedureImplantsSection();
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION:
				return createProcedureIndicationsSection();
			case ConsolPackage.PROCEDURE_SPECIMENS_TAKEN_SECTION:
				return createProcedureSpecimensTakenSection();
			case ConsolPackage.SUBJECTIVE_SECTION:
				return createSubjectiveSection();
			case ConsolPackage.CONSULTATION_NOTE:
				return createConsultationNote();
			case ConsolPackage.ASSESSMENT_SECTION:
				return createAssessmentSection();
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE:
				return createHistoryAndPhysicalNote();
			case ConsolPackage.INSTRUCTIONS_SECTION:
				return createInstructionsSection();
			case ConsolPackage.OPERATIVE_NOTE:
				return createOperativeNote();
			case ConsolPackage.PROCEDURE_NOTE:
				return createProcedureNote();
			case ConsolPackage.PROGRESS_NOTE:
				return createProgressNote();
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT:
				return createDiagnosticImagingReport();
			case ConsolPackage.PHYSICIAN_READING_STUDY_PERFORMER:
				return createPhysicianReadingStudyPerformer();
			case ConsolPackage.PHYSICIANOF_RECORD_PARTICIPANT:
				return createPhysicianofRecordParticipant();
			case ConsolPackage.TEXT_OBSERVATION:
				return createTextObservation();
			case ConsolPackage.QUANTITY_MEASUREMENT_OBSERVATION:
				return createQuantityMeasurementObservation();
			case ConsolPackage.CODE_OBSERVATIONS:
				return createCodeObservations();
			case ConsolPackage.PROCEDURE_CONTEXT:
				return createProcedureContext();
			case ConsolPackage.MEDICATION_USE_NONE_KNOWN:
				return createMedicationUseNoneKnown();
			case ConsolPackage.DECEASED_OBSERVATION:
				return createDeceasedObservation();
			case ConsolPackage.FETUS_SUBJECT_CONTEXT:
				return createFetusSubjectContext();
			case ConsolPackage.OBSERVER_CONTEXT:
				return createObserverContext();
			case ConsolPackage.ACT_REFERENCE:
				return createActReference();
			case ConsolPackage.ADVANCE_DIRECTIVE_ORGANIZER:
				return createAdvanceDirectiveOrganizer();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION2:
				return createAdvanceDirectiveObservation2();
			case ConsolPackage.CHARACTERISTICS_OF_HOME_ENVIRONMENT:
				return createCharacteristicsOfHomeEnvironment();
			case ConsolPackage.COGNITIVE_ABILITIES_OBSERVATION:
				return createCognitiveAbilitiesObservation();
			case ConsolPackage.CULTURAL_AND_RELIGIOUS_OBSERVATION:
				return createCulturalAndReligiousObservation();
			case ConsolPackage.DRUG_MONITORING_ACT:
				return createDrugMonitoringAct();
			case ConsolPackage.HANDOFF_COMMUNICATION:
				return createHandoffCommunication();
			case ConsolPackage.MEDICAL_EQUIPMENT_ORGANIZER:
				return createMedicalEquipmentOrganizer();
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY2:
				return createNonMedicinalSupplyActivity2();
			case ConsolPackage.INSTRUCTION2:
				return createInstruction2();
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE2:
				return createProcedureActivityProcedure2();
			case ConsolPackage.INDICATION2:
				return createIndication2();
			case ConsolPackage.MEDICATION_ACTIVITY2:
				return createMedicationActivity2();
			case ConsolPackage.SUBSTANCE_ADMINISTERED_ACT:
				return createSubstanceAdministeredAct();
			case ConsolPackage.MEDICATION_SUPPLY_ORDER2:
				return createMedicationSupplyOrder2();
			case ConsolPackage.MEDICATION_DISPENSE2:
				return createMedicationDispense2();
			case ConsolPackage.REACTION_OBSERVATION2:
				return createReactionObservation2();
			case ConsolPackage.SEVERITY_OBSERVATION2:
				return createSeverityObservation2();
			case ConsolPackage.MENTAL_STATUS_OBSERVATION:
				return createMentalStatusObservation();
			case ConsolPackage.NUTRITION_ASSESSMENT:
				return createNutritionAssessment();
			case ConsolPackage.NUTRITION_RECOMMENDATIONS:
				return createNutritionRecommendations();
			case ConsolPackage.NUTRITIONAL_STATUS_OBSERVATION:
				return createNutritionalStatusObservation();
			case ConsolPackage.OUTCOME_OBSERVATION:
				return createOutcomeObservation();
			case ConsolPackage.GOAL_OBSERVATION:
				return createGoalObservation();
			case ConsolPackage.PLANNED_OBSERVATION2:
				return createPlannedObservation2();
			case ConsolPackage.PROVIDER_PRIORITY_PREFERENCE:
				return createProviderPriorityPreference();
			case ConsolPackage.PLANNED_COVERAGE:
				return createPlannedCoverage();
			case ConsolPackage.PATIENT_PRIORITY_PREFERENCE:
				return createPatientPriorityPreference();
			case ConsolPackage.HEALTH_CONCERN_ACT:
				return createHealthConcernAct();
			case ConsolPackage.SELF_CARE_ACTIVITIES:
				return createSelfCareActivities();
			case ConsolPackage.SENSORY_AND_SPEECH_STATUS:
				return createSensoryAndSpeechStatus();
			case ConsolPackage.WOUND_OBSERVATION:
				return createWoundObservation();
			case ConsolPackage.PROBLEM_OBSERVATION2:
				return createProblemObservation2();
			case ConsolPackage.PROGNOSIS_OBSERVATION:
				return createPrognosisObservation();
			case ConsolPackage.WOUND_MEASUREMENT_OBSERVATION:
				return createWoundMeasurementObservation();
			case ConsolPackage.WOUND_CHARACTERISTICS:
				return createWoundCharacteristics();
			case ConsolPackage.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2:
				return createNumberOfPressureUlcersObservation2();
			case ConsolPackage.EXTERNAL_DOCUMENT_REFERENCE:
				return createExternalDocumentReference();
			case ConsolPackage.ALLERGY_OBSERVATION2:
				return createAllergyObservation2();
			case ConsolPackage.MENTAL_STATUS_OBSERVATION2:
				return createMentalStatusObservation2();
			case ConsolPackage.SMOKING_STATUS_MEANINGFUL_USE2:
				return createSmokingStatusMeaningfulUse2();
			case ConsolPackage.ENCOUNTER_DIAGNOSIS2:
				return createEncounterDiagnosis2();
			case ConsolPackage.FUNCTIONAL_STATUS_OBSERVATION2:
				return createFunctionalStatusObservation2();
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS2:
				return createHospitalAdmissionDiagnosis2();
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS2:
				return createPostprocedureDiagnosis2();
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS2:
				return createPreoperativeDiagnosis2();
			case ConsolPackage.RESULT_OBSERVATION2:
				return createResultObservation2();
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION2:
				return createSocialHistoryObservation2();
			case ConsolPackage.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2:
				return createSubstanceOrDeviceAllergyObservation2();
			case ConsolPackage.TOBACCO_USE2:
				return createTobaccoUse2();
			case ConsolPackage.VITAL_SIGN_OBSERVATION2:
				return createVitalSignObservation2();
			case ConsolPackage.RESULT_ORGANIZER2:
				return createResultOrganizer2();
			case ConsolPackage.PROBLEM_CONCERN_ACT2:
				return createProblemConcernAct2();
			case ConsolPackage.PLANNED_ENCOUNTER2:
				return createPlannedEncounter2();
			case ConsolPackage.PLANNED_PROCEDURE2:
				return createPlannedProcedure2();
			case ConsolPackage.PLANNED_MEDICATION_ACTIVITY2:
				return createPlannedMedicationActivity2();
			case ConsolPackage.PLANNED_SUPPLY2:
				return createPlannedSupply2();
			case ConsolPackage.PLANNED_ACT2:
				return createPlannedAct2();
			case ConsolPackage.PROGRESS_TOWARD_GOAL_OBSERVATION:
				return createProgressTowardGoalObservation();
			case ConsolPackage.INTERVENTION_ACT:
				return createInterventionAct();
			case ConsolPackage.IMMUNIZATION_ACTIVITY2:
				return createImmunizationActivity2();
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT2:
				return createProcedureActivityAct2();
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION2:
				return createProcedureActivityObservation2();
			case ConsolPackage.ENCOUNTER_ACTIVITY2:
				return createEncounterActivity2();
			case ConsolPackage.PATIENT_REFERRAL_ACT:
				return createPatientReferralAct();
			case ConsolPackage.PLANNED_IMMUNIZATION_ACTIVITY:
				return createPlannedImmunizationActivity();
			case ConsolPackage.GOALS_SECTION:
				return createGoalsSection();
			case ConsolPackage.HEALTH_CONCERNS_SECTION:
				return createHealthConcernsSection();
			case ConsolPackage.HEALTH_STATUS_OBSERVATION2:
				return createHealthStatusObservation2();
			case ConsolPackage.HEALTH_STATUS_EVALUATIONS_OUTCOMES_SECTION:
				return createHealthStatusEvaluationsOutcomesSection();
			case ConsolPackage.MENTAL_STATUS_SECTION:
				return createMentalStatusSection();
			case ConsolPackage.MENTAL_STATUS_ORGANIZER2:
				return createMentalStatusOrganizer2();
			case ConsolPackage.NUTRITION_SECTION:
				return createNutritionSection();
			case ConsolPackage.PHYSICAL_FINDINGS_OF_SKIN_SECTION:
				return createPhysicalFindingsOfSkinSection();
			case ConsolPackage.US_REALM_HEADER2:
				return createUSRealmHeader2();
			case ConsolPackage.CARE_PLAN:
				return createCarePlan();
			case ConsolPackage.INTERVENTIONS_SECTION2:
				return createInterventionsSection2();
			case ConsolPackage.REFERRAL_NOTE:
				return createReferralNote();
			case ConsolPackage.PLAN_OF_TREATMENT_SECTION2:
				return createPlanOfTreatmentSection2();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2:
				return createAdvanceDirectivesSectionEntriesOptional2();
			case ConsolPackage.IMMUNIZATIONS_SECTION2:
				return createImmunizationsSection2();
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2:
				return createImmunizationsSectionEntriesOptional2();
			case ConsolPackage.PROBLEM_SECTION2:
				return createProblemSection2();
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL2:
				return createProblemSectionEntriesOptional2();
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL2:
				return createProceduresSectionEntriesOptional2();
			case ConsolPackage.RESULTS_SECTION2:
				return createResultsSection2();
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL2:
				return createResultsSectionEntriesOptional2();
			case ConsolPackage.SOCIAL_HISTORY_SECTION2:
				return createSocialHistorySection2();
			case ConsolPackage.VITAL_SIGNS_SECTION2:
				return createVitalSignsSection2();
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2:
				return createVitalSignsSectionEntriesOptional2();
			case ConsolPackage.VITAL_SIGNS_ORGANIZER2:
				return createVitalSignsOrganizer2();
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION2:
				return createFunctionalStatusSection2();
			case ConsolPackage.FUNCTIONAL_STATUS_ORGANIZER2:
				return createFunctionalStatusOrganizer2();
			case ConsolPackage.PHYSICAL_EXAM_SECTION2:
				return createPhysicalExamSection2();
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION2:
				return createMedicalEquipmentSection2();
			case ConsolPackage.ALLERGIES_SECTION2:
				return createAllergiesSection2();
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL2:
				return createAllergiesSectionEntriesOptional2();
			case ConsolPackage.ALLERGY_CONCERN_ACT2:
				return createAllergyConcernAct2();
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION2:
				return createAssessmentAndPlanSection2();
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION2:
				return createHistoryOfPastIllnessSection2();
			case ConsolPackage.MEDICATIONS_SECTION2:
				return createMedicationsSection2();
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL2:
				return createMedicationsSectionEntriesOptional2();
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION2:
				return createReasonForReferralSection2();
			case ConsolPackage.TRANSFER_SUMMARY:
				return createTransferSummary();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION2:
				return createAdvanceDirectivesSection2();
			case ConsolPackage.ENCOUNTERS_SECTION2:
				return createEncountersSection2();
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2:
				return createEncountersSectionEntriesOptional2();
			case ConsolPackage.DISCHARGE_DIAGNOSIS_SECTION2:
				return createDischargeDiagnosisSection2();
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS2:
				return createHospitalDischargeDiagnosis2();
			case ConsolPackage.PAYERS_SECTION2:
				return createPayersSection2();
			case ConsolPackage.COVERAGE_ACTIVITY2:
				return createCoverageActivity2();
			case ConsolPackage.POLICY_ACTIVITY2:
				return createPolicyActivity2();
			case ConsolPackage.PROCEDURES_SECTION2:
				return createProceduresSection2();
			case ConsolPackage.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT:
				return createUSRealmHeaderPatientGeneratedDocument();
			case ConsolPackage.AUTHOR_PARTICIPATION:
				return createAuthorParticipation();
			case ConsolPackage.ADMISSION_MEDICATION2:
				return createAdmissionMedication2();
			case ConsolPackage.DECEASED_OBSERVATION2:
				return createDeceasedObservation2();
			case ConsolPackage.DISCHARGE_MEDICATION2:
				return createDischargeMedication2();
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION2:
				return createImmunizationMedicationInformation2();
			case ConsolPackage.MEDICATION_INFORMATION2:
				return createMedicationInformation2();
			case ConsolPackage.PHYSICIANOF_RECORD_PARTICIPANT2:
				return createPhysicianofRecordParticipant2();
			case ConsolPackage.ANESTHESIA_SECTION2:
				return createAnesthesiaSection2();
			case ConsolPackage.COMPLICATIONS_SECTION2:
				return createComplicationsSection2();
			case ConsolPackage.ADMISSION_DIAGNOSIS_SECTION2:
				return createAdmissionDiagnosisSection2();
			case ConsolPackage.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2:
				return createAdmissionMedicationsSectionEntriesOptional2();
			case ConsolPackage.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2:
				return createDischargeMedicationsSectionEntriesOptional2();
			case ConsolPackage.INSTRUCTIONS_SECTION2:
				return createInstructionsSection2();
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION2:
				return createMedicationsAdministeredSection2();
			case ConsolPackage.PLANNED_PROCEDURE_SECTION2:
				return createPlannedProcedureSection2();
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION2:
				return createPostprocedureDiagnosisSection2();
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION2:
				return createPreoperativeDiagnosisSection2();
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION2:
				return createProcedureFindingsSection2();
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION2:
				return createProcedureIndicationsSection2();
			case ConsolPackage.DISCHARGE_MEDICATIONS_SECTION2:
				return createDischargeMedicationsSection2();
			case ConsolPackage.CONSULTATION_NOTE2:
				return createConsultationNote2();
			case ConsolPackage.FAMILY_HISTORY_SECTION2:
				return createFamilyHistorySection2();
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER2:
				return createFamilyHistoryOrganizer2();
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION2:
				return createFamilyHistoryObservation2();
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT2:
				return createContinuityOfCareDocument2();
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT2:
				return createDiagnosticImagingReport2();
			case ConsolPackage.DISCHARGE_SUMMARY2:
				return createDischargeSummary2();
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE2:
				return createHistoryAndPhysicalNote2();
			case ConsolPackage.OPERATIVE_NOTE2:
				return createOperativeNote2();
			case ConsolPackage.PROCEDURE_NOTE2:
				return createProcedureNote2();
			case ConsolPackage.PROGRESS_NOTE2:
				return createProgressNote2();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT2:
				return createUnstructuredDocument2();
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2:
				return createPreconditionForSubstanceAdministration2();
			case ConsolPackage.PHYSICIAN_READING_STUDY_PERFORMER2:
				return createPhysicianReadingStudyPerformer2();
			case ConsolPackage.COURSE_OF_CARE_SECTION:
				return createCourseOfCareSection();
			case ConsolPackage.PLANNED_INTERVENTION_ACT:
				return createPlannedInterventionAct();
			case ConsolPackage.RISK_CONCERN_ACT:
				return createRiskConcernAct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyProblemAct createAllergyProblemAct() {
		AllergyProblemActImpl allergyProblemAct = new AllergyProblemActImpl();
		return allergyProblemAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyObservation createAllergyObservation() {
		AllergyObservationImpl allergyObservation = new AllergyObservationImpl();
		return allergyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceOrDeviceAllergyObservation createSubstanceOrDeviceAllergyObservation() {
		SubstanceOrDeviceAllergyObservationImpl substanceOrDeviceAllergyObservation = new SubstanceOrDeviceAllergyObservationImpl();
		return substanceOrDeviceAllergyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation createSeverityObservation() {
		SeverityObservationImpl severityObservation = new SeverityObservationImpl();
		return severityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyStatusObservation createAllergyStatusObservation() {
		AllergyStatusObservationImpl allergyStatusObservation = new AllergyStatusObservationImpl();
		return allergyStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentActivity createCommentActivity() {
		CommentActivityImpl commentActivity = new CommentActivityImpl();
		return commentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity createMedicationActivity() {
		MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
		return medicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonMedicinalSupplyActivity createNonMedicinalSupplyActivity() {
		NonMedicinalSupplyActivityImpl nonMedicinalSupplyActivity = new NonMedicinalSupplyActivityImpl();
		return nonMedicinalSupplyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructions createInstructions() {
		InstructionsImpl instructions = new InstructionsImpl();
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication createIndication() {
		IndicationImpl indication = new IndicationImpl();
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder createMedicationSupplyOrder() {
		MedicationSupplyOrderImpl medicationSupplyOrder = new MedicationSupplyOrderImpl();
		return medicationSupplyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugVehicle createDrugVehicle() {
		DrugVehicleImpl drugVehicle = new DrugVehicleImpl();
		return drugVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct createProblemConcernAct() {
		ProblemConcernActImpl problemConcernAct = new ProblemConcernActImpl();
		return problemConcernAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservation createProblemObservation() {
		ProblemObservationImpl problemObservation = new ProblemObservationImpl();
		return problemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemStatus createProblemStatus() {
		ProblemStatusImpl problemStatus = new ProblemStatusImpl();
		return problemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityOfCareDocument createContinuityOfCareDocument() {
		ContinuityOfCareDocumentImpl continuityOfCareDocument = new ContinuityOfCareDocumentImpl();
		return continuityOfCareDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSectionEntriesOptional createAdvanceDirectivesSectionEntriesOptional() {
		AdvanceDirectivesSectionEntriesOptionalImpl advanceDirectivesSectionEntriesOptional = new AdvanceDirectivesSectionEntriesOptionalImpl();
		return advanceDirectivesSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSection createAllergiesSection() {
		AllergiesSectionImpl allergiesSection = new AllergiesSectionImpl();
		return allergiesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional createAllergiesSectionEntriesOptional() {
		AllergiesSectionEntriesOptionalImpl allergiesSectionEntriesOptional = new AllergiesSectionEntriesOptionalImpl();
		return allergiesSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSectionEntriesOptional createEncountersSectionEntriesOptional() {
		EncountersSectionEntriesOptionalImpl encountersSectionEntriesOptional = new EncountersSectionEntriesOptionalImpl();
		return encountersSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSectionEntriesOptional createImmunizationsSectionEntriesOptional() {
		ImmunizationsSectionEntriesOptionalImpl immunizationsSectionEntriesOptional = new ImmunizationsSectionEntriesOptionalImpl();
		return immunizationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageActivity createCoverageActivity() {
		CoverageActivityImpl coverageActivity = new CoverageActivityImpl();
		return coverageActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity createPolicyActivity() {
		PolicyActivityImpl policyActivity = new PolicyActivityImpl();
		return policyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationActivity createAuthorizationActivity() {
		AuthorizationActivityImpl authorizationActivity = new AuthorizationActivityImpl();
		return authorizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionEntriesOptional createMedicationsSectionEntriesOptional() {
		MedicationsSectionEntriesOptionalImpl medicationsSectionEntriesOptional = new MedicationsSectionEntriesOptionalImpl();
		return medicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivityAct createPlanOfCareActivityAct() {
		PlanOfCareActivityActImpl planOfCareActivityAct = new PlanOfCareActivityActImpl();
		return planOfCareActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivityEncounter createPlanOfCareActivityEncounter() {
		PlanOfCareActivityEncounterImpl planOfCareActivityEncounter = new PlanOfCareActivityEncounterImpl();
		return planOfCareActivityEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivityObservation createPlanOfCareActivityObservation() {
		PlanOfCareActivityObservationImpl planOfCareActivityObservation = new PlanOfCareActivityObservationImpl();
		return planOfCareActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivityProcedure createPlanOfCareActivityProcedure() {
		PlanOfCareActivityProcedureImpl planOfCareActivityProcedure = new PlanOfCareActivityProcedureImpl();
		return planOfCareActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration() {
		PlanOfCareActivitySubstanceAdministrationImpl planOfCareActivitySubstanceAdministration = new PlanOfCareActivitySubstanceAdministrationImpl();
		return planOfCareActivitySubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareActivitySupply createPlanOfCareActivitySupply() {
		PlanOfCareActivitySupplyImpl planOfCareActivitySupply = new PlanOfCareActivitySupplyImpl();
		return planOfCareActivitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSection createProceduresSection() {
		ProceduresSectionImpl proceduresSection = new ProceduresSectionImpl();
		return proceduresSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionEntriesOptional createProceduresSectionEntriesOptional() {
		ProceduresSectionEntriesOptionalImpl proceduresSectionEntriesOptional = new ProceduresSectionEntriesOptionalImpl();
		return proceduresSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityObservation createProcedureActivityObservation() {
		ProcedureActivityObservationImpl procedureActivityObservation = new ProcedureActivityObservationImpl();
		return procedureActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityAct createProcedureActivityAct() {
		ProcedureActivityActImpl procedureActivityAct = new ProcedureActivityActImpl();
		return procedureActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityProcedure createProcedureActivityProcedure() {
		ProcedureActivityProcedureImpl procedureActivityProcedure = new ProcedureActivityProcedureImpl();
		return procedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSectionEntriesOptional createVitalSignsSectionEntriesOptional() {
		VitalSignsSectionEntriesOptionalImpl vitalSignsSectionEntriesOptional = new VitalSignsSectionEntriesOptionalImpl();
		return vitalSignsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryOrganizer createFamilyHistoryOrganizer() {
		FamilyHistoryOrganizerImpl familyHistoryOrganizer = new FamilyHistoryOrganizerImpl();
		return familyHistoryOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistoryDeathObservation createFamilyHistoryDeathObservation() {
		FamilyHistoryDeathObservationImpl familyHistoryDeathObservation = new FamilyHistoryDeathObservationImpl();
		return familyHistoryDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistoryObservation createSocialHistoryObservation() {
		SocialHistoryObservationImpl socialHistoryObservation = new SocialHistoryObservationImpl();
		return socialHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PregnancyObservation createPregnancyObservation() {
		PregnancyObservationImpl pregnancyObservation = new PregnancyObservationImpl();
		return pregnancyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EstimatedDateOfDelivery createEstimatedDateOfDelivery() {
		EstimatedDateOfDeliveryImpl estimatedDateOfDelivery = new EstimatedDateOfDeliveryImpl();
		return estimatedDateOfDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmokingStatusObservation createSmokingStatusObservation() {
		SmokingStatusObservationImpl smokingStatusObservation = new SmokingStatusObservationImpl();
		return smokingStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TobaccoUse createTobaccoUse() {
		TobaccoUseImpl tobaccoUse = new TobaccoUseImpl();
		return tobaccoUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSection createResultsSection() {
		ResultsSectionImpl resultsSection = new ResultsSectionImpl();
		return resultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSectionEntriesOptional createResultsSectionEntriesOptional() {
		ResultsSectionEntriesOptionalImpl resultsSectionEntriesOptional = new ResultsSectionEntriesOptionalImpl();
		return resultsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultObservation createResultObservation() {
		ResultObservationImpl resultObservation = new ResultObservationImpl();
		return resultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusResultOrganizer createFunctionalStatusResultOrganizer() {
		FunctionalStatusResultOrganizerImpl functionalStatusResultOrganizer = new FunctionalStatusResultOrganizerImpl();
		return functionalStatusResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusResultObservation createFunctionalStatusResultObservation() {
		FunctionalStatusResultObservationImpl functionalStatusResultObservation = new FunctionalStatusResultObservationImpl();
		return functionalStatusResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaregiverCharacteristics createCaregiverCharacteristics() {
		CaregiverCharacteristicsImpl caregiverCharacteristics = new CaregiverCharacteristicsImpl();
		return caregiverCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentScaleObservation createAssessmentScaleObservation() {
		AssessmentScaleObservationImpl assessmentScaleObservation = new AssessmentScaleObservationImpl();
		return assessmentScaleObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentScaleSupportingObservation createAssessmentScaleSupportingObservation() {
		AssessmentScaleSupportingObservationImpl assessmentScaleSupportingObservation = new AssessmentScaleSupportingObservationImpl();
		return assessmentScaleSupportingObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusResultOrganizer createCognitiveStatusResultOrganizer() {
		CognitiveStatusResultOrganizerImpl cognitiveStatusResultOrganizer = new CognitiveStatusResultOrganizerImpl();
		return cognitiveStatusResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusResultObservation createCognitiveStatusResultObservation() {
		CognitiveStatusResultObservationImpl cognitiveStatusResultObservation = new CognitiveStatusResultObservationImpl();
		return cognitiveStatusResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusProblemObservation createFunctionalStatusProblemObservation() {
		FunctionalStatusProblemObservationImpl functionalStatusProblemObservation = new FunctionalStatusProblemObservationImpl();
		return functionalStatusProblemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveStatusProblemObservation createCognitiveStatusProblemObservation() {
		CognitiveStatusProblemObservationImpl cognitiveStatusProblemObservation = new CognitiveStatusProblemObservationImpl();
		return cognitiveStatusProblemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureUlcerObservation createPressureUlcerObservation() {
		PressureUlcerObservationImpl pressureUlcerObservation = new PressureUlcerObservationImpl();
		return pressureUlcerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfPressureUlcersObservation createNumberOfPressureUlcersObservation() {
		NumberOfPressureUlcersObservationImpl numberOfPressureUlcersObservation = new NumberOfPressureUlcersObservationImpl();
		return numberOfPressureUlcersObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighestPressureUlcerStage createHighestPressureUlcerStage() {
		HighestPressureUlcerStageImpl highestPressureUlcerStage = new HighestPressureUlcerStageImpl();
		return highestPressureUlcerStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSection createProblemSection() {
		ProblemSectionImpl problemSection = new ProblemSectionImpl();
		return problemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionEntriesOptional createProblemSectionEntriesOptional() {
		ProblemSectionEntriesOptionalImpl problemSectionEntriesOptional = new ProblemSectionEntriesOptionalImpl();
		return problemSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveObservation createAdvanceDirectiveObservation() {
		AdvanceDirectiveObservationImpl advanceDirectiveObservation = new AdvanceDirectiveObservationImpl();
		return advanceDirectiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivities createEncounterActivities() {
		EncounterActivitiesImpl encounterActivities = new EncounterActivitiesImpl();
		return encounterActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis createEncounterDiagnosis() {
		EncounterDiagnosisImpl encounterDiagnosis = new EncounterDiagnosisImpl();
		return encounterDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDeliveryLocation createServiceDeliveryLocation() {
		ServiceDeliveryLocationImpl serviceDeliveryLocation = new ServiceDeliveryLocationImpl();
		return serviceDeliveryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity createImmunizationActivity() {
		ImmunizationActivityImpl immunizationActivity = new ImmunizationActivityImpl();
		return immunizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationRefusalReason createImmunizationRefusalReason() {
		ImmunizationRefusalReasonImpl immunizationRefusalReason = new ImmunizationRefusalReasonImpl();
		return immunizationRefusalReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation createVitalSignObservation() {
		VitalSignObservationImpl vitalSignObservation = new VitalSignObservationImpl();
		return vitalSignObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPresentIllnessSection createHistoryOfPresentIllnessSection() {
		HistoryOfPresentIllnessSectionImpl historyOfPresentIllnessSection = new HistoryOfPresentIllnessSectionImpl();
		return historyOfPresentIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosisSection createHospitalDischargeDiagnosisSection() {
		HospitalDischargeDiagnosisSectionImpl hospitalDischargeDiagnosisSection = new HospitalDischargeDiagnosisSectionImpl();
		return hospitalDischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionMedicationsSectionEntriesOptional createHospitalAdmissionMedicationsSectionEntriesOptional() {
		HospitalAdmissionMedicationsSectionEntriesOptionalImpl hospitalAdmissionMedicationsSectionEntriesOptional = new HospitalAdmissionMedicationsSectionEntriesOptionalImpl();
		return hospitalAdmissionMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionMedication createAdmissionMedication() {
		AdmissionMedicationImpl admissionMedication = new AdmissionMedicationImpl();
		return admissionMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargePhysicalSection createHospitalDischargePhysicalSection() {
		HospitalDischargePhysicalSectionImpl hospitalDischargePhysicalSection = new HospitalDischargePhysicalSectionImpl();
		return hospitalDischargePhysicalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintAndReasonForVisitSection createChiefComplaintAndReasonForVisitSection() {
		ChiefComplaintAndReasonForVisitSectionImpl chiefComplaintAndReasonForVisitSection = new ChiefComplaintAndReasonForVisitSectionImpl();
		return chiefComplaintAndReasonForVisitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForVisitSection createReasonForVisitSection() {
		ReasonForVisitSectionImpl reasonForVisitSection = new ReasonForVisitSectionImpl();
		return reasonForVisitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnesthesiaSection createAnesthesiaSection() {
		AnesthesiaSectionImpl anesthesiaSection = new AnesthesiaSectionImpl();
		return anesthesiaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplicationsSection createComplicationsSection() {
		ComplicationsSectionImpl complicationsSection = new ComplicationsSectionImpl();
		return complicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DICOMObjectCatalogSection createDICOMObjectCatalogSection() {
		DICOMObjectCatalogSectionImpl dicomObjectCatalogSection = new DICOMObjectCatalogSectionImpl();
		return dicomObjectCatalogSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyAct createStudyAct() {
		StudyActImpl studyAct = new StudyActImpl();
		return studyAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriesAct createSeriesAct() {
		SeriesActImpl seriesAct = new SeriesActImpl();
		return seriesAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SOPInstanceObservation createSOPInstanceObservation() {
		SOPInstanceObservationImpl sopInstanceObservation = new SOPInstanceObservationImpl();
		return sopInstanceObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurposeofReferenceObservation createPurposeofReferenceObservation() {
		PurposeofReferenceObservationImpl purposeofReferenceObservation = new PurposeofReferenceObservationImpl();
		return purposeofReferenceObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencedFramesObservation createReferencedFramesObservation() {
		ReferencedFramesObservationImpl referencedFramesObservation = new ReferencedFramesObservationImpl();
		return referencedFramesObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundaryObservation createBoundaryObservation() {
		BoundaryObservationImpl boundaryObservation = new BoundaryObservationImpl();
		return boundaryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingsSection createFindingsSection() {
		FindingsSectionImpl findingsSection = new FindingsSectionImpl();
		return findingsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalConsultationsSection createHospitalConsultationsSection() {
		HospitalConsultationsSectionImpl hospitalConsultationsSection = new HospitalConsultationsSectionImpl();
		return hospitalConsultationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionsSection createInterventionsSection() {
		InterventionsSectionImpl interventionsSection = new InterventionsSectionImpl();
		return interventionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalHistorySection createMedicalHistorySection() {
		MedicalHistorySectionImpl medicalHistorySection = new MedicalHistorySectionImpl();
		return medicalHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveSection createObjectiveSection() {
		ObjectiveSectionImpl objectiveSection = new ObjectiveSectionImpl();
		return objectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNoteFluidSection createOperativeNoteFluidSection() {
		OperativeNoteFluidSectionImpl operativeNoteFluidSection = new OperativeNoteFluidSectionImpl();
		return operativeNoteFluidSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNoteSurgicalProcedureSection createOperativeNoteSurgicalProcedureSection() {
		OperativeNoteSurgicalProcedureSectionImpl operativeNoteSurgicalProcedureSection = new OperativeNoteSurgicalProcedureSectionImpl();
		return operativeNoteSurgicalProcedureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedureSection createPlannedProcedureSection() {
		PlannedProcedureSectionImpl plannedProcedureSection = new PlannedProcedureSectionImpl();
		return plannedProcedureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostoperativeDiagnosisSection createPostoperativeDiagnosisSection() {
		PostoperativeDiagnosisSectionImpl postoperativeDiagnosisSection = new PostoperativeDiagnosisSectionImpl();
		return postoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection createPostprocedureDiagnosisSection() {
		PostprocedureDiagnosisSectionImpl postprocedureDiagnosisSection = new PostprocedureDiagnosisSectionImpl();
		return postprocedureDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosis createPostprocedureDiagnosis() {
		PostprocedureDiagnosisImpl postprocedureDiagnosis = new PostprocedureDiagnosisImpl();
		return postprocedureDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection createPreoperativeDiagnosisSection() {
		PreoperativeDiagnosisSectionImpl preoperativeDiagnosisSection = new PreoperativeDiagnosisSectionImpl();
		return preoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureDescriptionSection createProcedureDescriptionSection() {
		ProcedureDescriptionSectionImpl procedureDescriptionSection = new ProcedureDescriptionSectionImpl();
		return procedureDescriptionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureDispositionSection createProcedureDispositionSection() {
		ProcedureDispositionSectionImpl procedureDispositionSection = new ProcedureDispositionSectionImpl();
		return procedureDispositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureEstimatedBloodLossSection createProcedureEstimatedBloodLossSection() {
		ProcedureEstimatedBloodLossSectionImpl procedureEstimatedBloodLossSection = new ProcedureEstimatedBloodLossSectionImpl();
		return procedureEstimatedBloodLossSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection createProcedureFindingsSection() {
		ProcedureFindingsSectionImpl procedureFindingsSection = new ProcedureFindingsSectionImpl();
		return procedureFindingsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureImplantsSection createProcedureImplantsSection() {
		ProcedureImplantsSectionImpl procedureImplantsSection = new ProcedureImplantsSectionImpl();
		return procedureImplantsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureIndicationsSection createProcedureIndicationsSection() {
		ProcedureIndicationsSectionImpl procedureIndicationsSection = new ProcedureIndicationsSectionImpl();
		return procedureIndicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureSpecimensTakenSection createProcedureSpecimensTakenSection() {
		ProcedureSpecimensTakenSectionImpl procedureSpecimensTakenSection = new ProcedureSpecimensTakenSectionImpl();
		return procedureSpecimensTakenSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectiveSection createSubjectiveSection() {
		SubjectiveSectionImpl subjectiveSection = new SubjectiveSectionImpl();
		return subjectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote createConsultationNote() {
		ConsultationNoteImpl consultationNote = new ConsultationNoteImpl();
		return consultationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSection createAssessmentSection() {
		AssessmentSectionImpl assessmentSection = new AssessmentSectionImpl();
		return assessmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryAndPhysicalNote createHistoryAndPhysicalNote() {
		HistoryAndPhysicalNoteImpl historyAndPhysicalNote = new HistoryAndPhysicalNoteImpl();
		return historyAndPhysicalNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperativeNote createOperativeNote() {
		OperativeNoteImpl operativeNote = new OperativeNoteImpl();
		return operativeNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureNote createProcedureNote() {
		ProcedureNoteImpl procedureNote = new ProcedureNoteImpl();
		return procedureNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressNote createProgressNote() {
		ProgressNoteImpl progressNote = new ProgressNoteImpl();
		return progressNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosis createPreoperativeDiagnosis() {
		PreoperativeDiagnosisImpl preoperativeDiagnosis = new PreoperativeDiagnosisImpl();
		return preoperativeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstructionsSection createInstructionsSection() {
		InstructionsSectionImpl instructionsSection = new InstructionsSectionImpl();
		return instructionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosis createHospitalAdmissionDiagnosis() {
		HospitalAdmissionDiagnosisImpl hospitalAdmissionDiagnosis = new HospitalAdmissionDiagnosisImpl();
		return hospitalAdmissionDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagnosticImagingReport createDiagnosticImagingReport() {
		DiagnosticImagingReportImpl diagnosticImagingReport = new DiagnosticImagingReportImpl();
		return diagnosticImagingReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianReadingStudyPerformer createPhysicianReadingStudyPerformer() {
		PhysicianReadingStudyPerformerImpl physicianReadingStudyPerformer = new PhysicianReadingStudyPerformerImpl();
		return physicianReadingStudyPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant createPhysicianofRecordParticipant() {
		PhysicianofRecordParticipantImpl physicianofRecordParticipant = new PhysicianofRecordParticipantImpl();
		return physicianofRecordParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextObservation createTextObservation() {
		TextObservationImpl textObservation = new TextObservationImpl();
		return textObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityMeasurementObservation createQuantityMeasurementObservation() {
		QuantityMeasurementObservationImpl quantityMeasurementObservation = new QuantityMeasurementObservationImpl();
		return quantityMeasurementObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeObservations createCodeObservations() {
		CodeObservationsImpl codeObservations = new CodeObservationsImpl();
		return codeObservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureContext createProcedureContext() {
		ProcedureContextImpl procedureContext = new ProcedureContextImpl();
		return procedureContext;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationUseNoneKnown createMedicationUseNoneKnown() {
		MedicationUseNoneKnownImpl medicationUseNoneKnown = new MedicationUseNoneKnownImpl();
		return medicationUseNoneKnown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeceasedObservation createDeceasedObservation() {
		DeceasedObservationImpl deceasedObservation = new DeceasedObservationImpl();
		return deceasedObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FetusSubjectContext createFetusSubjectContext() {
		FetusSubjectContextImpl fetusSubjectContext = new FetusSubjectContextImpl();
		return fetusSubjectContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObserverContext createObserverContext() {
		ObserverContextImpl observerContext = new ObserverContextImpl();
		return observerContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActReference createActReference() {
		ActReferenceImpl actReference = new ActReferenceImpl();
		return actReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveOrganizer createAdvanceDirectiveOrganizer() {
		AdvanceDirectiveOrganizerImpl advanceDirectiveOrganizer = new AdvanceDirectiveOrganizerImpl();
		return advanceDirectiveOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacteristicsOfHomeEnvironment createCharacteristicsOfHomeEnvironment() {
		CharacteristicsOfHomeEnvironmentImpl characteristicsOfHomeEnvironment = new CharacteristicsOfHomeEnvironmentImpl();
		return characteristicsOfHomeEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveAbilitiesObservation createCognitiveAbilitiesObservation() {
		CognitiveAbilitiesObservationImpl cognitiveAbilitiesObservation = new CognitiveAbilitiesObservationImpl();
		return cognitiveAbilitiesObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CulturalAndReligiousObservation createCulturalAndReligiousObservation() {
		CulturalAndReligiousObservationImpl culturalAndReligiousObservation = new CulturalAndReligiousObservationImpl();
		return culturalAndReligiousObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugMonitoringAct createDrugMonitoringAct() {
		DrugMonitoringActImpl drugMonitoringAct = new DrugMonitoringActImpl();
		return drugMonitoringAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HandoffCommunication createHandoffCommunication() {
		HandoffCommunicationImpl handoffCommunication = new HandoffCommunicationImpl();
		return handoffCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipmentOrganizer createMedicalEquipmentOrganizer() {
		MedicalEquipmentOrganizerImpl medicalEquipmentOrganizer = new MedicalEquipmentOrganizerImpl();
		return medicalEquipmentOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusObservation createMentalStatusObservation() {
		MentalStatusObservationImpl mentalStatusObservation = new MentalStatusObservationImpl();
		return mentalStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionAssessment createNutritionAssessment() {
		NutritionAssessmentImpl nutritionAssessment = new NutritionAssessmentImpl();
		return nutritionAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionRecommendations createNutritionRecommendations() {
		NutritionRecommendationsImpl nutritionRecommendations = new NutritionRecommendationsImpl();
		return nutritionRecommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionalStatusObservation createNutritionalStatusObservation() {
		NutritionalStatusObservationImpl nutritionalStatusObservation = new NutritionalStatusObservationImpl();
		return nutritionalStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutcomeObservation createOutcomeObservation() {
		OutcomeObservationImpl outcomeObservation = new OutcomeObservationImpl();
		return outcomeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientPriorityPreference createPatientPriorityPreference() {
		PatientPriorityPreferenceImpl patientPriorityPreference = new PatientPriorityPreferenceImpl();
		return patientPriorityPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatientReferralAct createPatientReferralAct() {
		PatientReferralActImpl patientReferralAct = new PatientReferralActImpl();
		return patientReferralAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedCoverage createPlannedCoverage() {
		PlannedCoverageImpl plannedCoverage = new PlannedCoverageImpl();
		return plannedCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalObservation createGoalObservation() {
		GoalObservationImpl goalObservation = new GoalObservationImpl();
		return goalObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthConcernAct createHealthConcernAct() {
		HealthConcernActImpl healthConcernAct = new HealthConcernActImpl();
		return healthConcernAct;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionAct createInterventionAct() {
		InterventionActImpl interventionAct = new InterventionActImpl();
		return interventionAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalDocumentReference createExternalDocumentReference() {
		ExternalDocumentReferenceImpl externalDocumentReference = new ExternalDocumentReferenceImpl();
		return externalDocumentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedImmunizationActivity createPlannedImmunizationActivity() {
		PlannedImmunizationActivityImpl plannedImmunizationActivity = new PlannedImmunizationActivityImpl();
		return plannedImmunizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrognosisObservation createPrognosisObservation() {
		PrognosisObservationImpl prognosisObservation = new PrognosisObservationImpl();
		return prognosisObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgressTowardGoalObservation createProgressTowardGoalObservation() {
		ProgressTowardGoalObservationImpl progressTowardGoalObservation = new ProgressTowardGoalObservationImpl();
		return progressTowardGoalObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderPriorityPreference createProviderPriorityPreference() {
		ProviderPriorityPreferenceImpl providerPriorityPreference = new ProviderPriorityPreferenceImpl();
		return providerPriorityPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfCareActivities createSelfCareActivities() {
		SelfCareActivitiesImpl selfCareActivities = new SelfCareActivitiesImpl();
		return selfCareActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensoryAndSpeechStatus createSensoryAndSpeechStatus() {
		SensoryAndSpeechStatusImpl sensoryAndSpeechStatus = new SensoryAndSpeechStatusImpl();
		return sensoryAndSpeechStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAdministeredAct createSubstanceAdministeredAct() {
		SubstanceAdministeredActImpl substanceAdministeredAct = new SubstanceAdministeredActImpl();
		return substanceAdministeredAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundCharacteristics createWoundCharacteristics() {
		WoundCharacteristicsImpl woundCharacteristics = new WoundCharacteristicsImpl();
		return woundCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPressureUlcersObservation2 createNumberOfPressureUlcersObservation2() {
		NumberOfPressureUlcersObservation2Impl numberOfPressureUlcersObservation2 = new NumberOfPressureUlcersObservation2Impl();
		return numberOfPressureUlcersObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundMeasurementObservation createWoundMeasurementObservation() {
		WoundMeasurementObservationImpl woundMeasurementObservation = new WoundMeasurementObservationImpl();
		return woundMeasurementObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WoundObservation createWoundObservation() {
		WoundObservationImpl woundObservation = new WoundObservationImpl();
		return woundObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalsSection createGoalsSection() {
		GoalsSectionImpl goalsSection = new GoalsSectionImpl();
		return goalsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthConcernsSection createHealthConcernsSection() {
		HealthConcernsSectionImpl healthConcernsSection = new HealthConcernsSectionImpl();
		return healthConcernsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusEvaluationsOutcomesSection createHealthStatusEvaluationsOutcomesSection() {
		HealthStatusEvaluationsOutcomesSectionImpl healthStatusEvaluationsOutcomesSection = new HealthStatusEvaluationsOutcomesSectionImpl();
		return healthStatusEvaluationsOutcomesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MentalStatusSection createMentalStatusSection() {
		MentalStatusSectionImpl mentalStatusSection = new MentalStatusSectionImpl();
		return mentalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusOrganizer2 createMentalStatusOrganizer2() {
		MentalStatusOrganizer2Impl mentalStatusOrganizer2 = new MentalStatusOrganizer2Impl();
		return mentalStatusOrganizer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionSection createNutritionSection() {
		NutritionSectionImpl nutritionSection = new NutritionSectionImpl();
		return nutritionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalFindingsOfSkinSection createPhysicalFindingsOfSkinSection() {
		PhysicalFindingsOfSkinSectionImpl physicalFindingsOfSkinSection = new PhysicalFindingsOfSkinSectionImpl();
		return physicalFindingsOfSkinSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeader2 createUSRealmHeader2() {
		USRealmHeader2Impl usRealmHeader2 = new USRealmHeader2Impl();
		return usRealmHeader2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan createCarePlan() {
		CarePlanImpl carePlan = new CarePlanImpl();
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferralNote createReferralNote() {
		ReferralNoteImpl referralNote = new ReferralNoteImpl();
		return referralNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferSummary createTransferSummary() {
		TransferSummaryImpl transferSummary = new TransferSummaryImpl();
		return transferSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeaderPatientGeneratedDocument createUSRealmHeaderPatientGeneratedDocument() {
		USRealmHeaderPatientGeneratedDocumentImpl usRealmHeaderPatientGeneratedDocument = new USRealmHeaderPatientGeneratedDocumentImpl();
		return usRealmHeaderPatientGeneratedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorParticipation createAuthorParticipation() {
		AuthorParticipationImpl authorParticipation = new AuthorParticipationImpl();
		return authorParticipation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdmissionMedication2 createAdmissionMedication2() {
		AdmissionMedication2Impl admissionMedication2 = new AdmissionMedication2Impl();
		return admissionMedication2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectiveObservation2 createAdvanceDirectiveObservation2() {
		AdvanceDirectiveObservation2Impl advanceDirectiveObservation2 = new AdvanceDirectiveObservation2Impl();
		return advanceDirectiveObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyConcernAct2 createAllergyConcernAct2() {
		AllergyConcernAct2Impl allergyConcernAct2 = new AllergyConcernAct2Impl();
		return allergyConcernAct2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyObservation2 createAllergyObservation2() {
		AllergyObservation2Impl allergyObservation2 = new AllergyObservation2Impl();
		return allergyObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusObservation2 createMentalStatusObservation2() {
		MentalStatusObservation2Impl mentalStatusObservation2 = new MentalStatusObservation2Impl();
		return mentalStatusObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusMeaningfulUse2 createSmokingStatusMeaningfulUse2() {
		SmokingStatusMeaningfulUse2Impl smokingStatusMeaningfulUse2 = new SmokingStatusMeaningfulUse2Impl();
		return smokingStatusMeaningfulUse2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageActivity2 createCoverageActivity2() {
		CoverageActivity2Impl coverageActivity2 = new CoverageActivity2Impl();
		return coverageActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeceasedObservation2 createDeceasedObservation2() {
		DeceasedObservation2Impl deceasedObservation2 = new DeceasedObservation2Impl();
		return deceasedObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedication2 createDischargeMedication2() {
		DischargeMedication2Impl dischargeMedication2 = new DischargeMedication2Impl();
		return dischargeMedication2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterActivity2 createEncounterActivity2() {
		EncounterActivity2Impl encounterActivity2 = new EncounterActivity2Impl();
		return encounterActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncounterDiagnosis2 createEncounterDiagnosis2() {
		EncounterDiagnosis2Impl encounterDiagnosis2 = new EncounterDiagnosis2Impl();
		return encounterDiagnosis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusObservation2 createFunctionalStatusObservation2() {
		FunctionalStatusObservation2Impl functionalStatusObservation2 = new FunctionalStatusObservation2Impl();
		return functionalStatusObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusOrganizer2 createFunctionalStatusOrganizer2() {
		FunctionalStatusOrganizer2Impl functionalStatusOrganizer2 = new FunctionalStatusOrganizer2Impl();
		return functionalStatusOrganizer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusObservation2 createHealthStatusObservation2() {
		HealthStatusObservation2Impl healthStatusObservation2 = new HealthStatusObservation2Impl();
		return healthStatusObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAdmissionDiagnosis2 createHospitalAdmissionDiagnosis2() {
		HospitalAdmissionDiagnosis2Impl hospitalAdmissionDiagnosis2 = new HospitalAdmissionDiagnosis2Impl();
		return hospitalAdmissionDiagnosis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosis2 createHospitalDischargeDiagnosis2() {
		HospitalDischargeDiagnosis2Impl hospitalDischargeDiagnosis2 = new HospitalDischargeDiagnosis2Impl();
		return hospitalDischargeDiagnosis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationActivity2 createImmunizationActivity2() {
		ImmunizationActivity2Impl immunizationActivity2 = new ImmunizationActivity2Impl();
		return immunizationActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationMedicationInformation2 createImmunizationMedicationInformation2() {
		ImmunizationMedicationInformation2Impl immunizationMedicationInformation2 = new ImmunizationMedicationInformation2Impl();
		return immunizationMedicationInformation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication2 createIndication2() {
		Indication2Impl indication2 = new Indication2Impl();
		return indication2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction2 createInstruction2() {
		Instruction2Impl instruction2 = new Instruction2Impl();
		return instruction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationActivity2 createMedicationActivity2() {
		MedicationActivity2Impl medicationActivity2 = new MedicationActivity2Impl();
		return medicationActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationDispense2 createMedicationDispense2() {
		MedicationDispense2Impl medicationDispense2 = new MedicationDispense2Impl();
		return medicationDispense2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationInformation2 createMedicationInformation2() {
		MedicationInformation2Impl medicationInformation2 = new MedicationInformation2Impl();
		return medicationInformation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationSupplyOrder2 createMedicationSupplyOrder2() {
		MedicationSupplyOrder2Impl medicationSupplyOrder2 = new MedicationSupplyOrder2Impl();
		return medicationSupplyOrder2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonMedicinalSupplyActivity2 createNonMedicinalSupplyActivity2() {
		NonMedicinalSupplyActivity2Impl nonMedicinalSupplyActivity2 = new NonMedicinalSupplyActivity2Impl();
		return nonMedicinalSupplyActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant2 createPhysicianofRecordParticipant2() {
		PhysicianofRecordParticipant2Impl physicianofRecordParticipant2 = new PhysicianofRecordParticipant2Impl();
		return physicianofRecordParticipant2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedAct2 createPlannedAct2() {
		PlannedAct2Impl plannedAct2 = new PlannedAct2Impl();
		return plannedAct2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedEncounter2 createPlannedEncounter2() {
		PlannedEncounter2Impl plannedEncounter2 = new PlannedEncounter2Impl();
		return plannedEncounter2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedObservation2 createPlannedObservation2() {
		PlannedObservation2Impl plannedObservation2 = new PlannedObservation2Impl();
		return plannedObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedure2 createPlannedProcedure2() {
		PlannedProcedure2Impl plannedProcedure2 = new PlannedProcedure2Impl();
		return plannedProcedure2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedMedicationActivity2 createPlannedMedicationActivity2() {
		PlannedMedicationActivity2Impl plannedMedicationActivity2 = new PlannedMedicationActivity2Impl();
		return plannedMedicationActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedSupply2 createPlannedSupply2() {
		PlannedSupply2Impl plannedSupply2 = new PlannedSupply2Impl();
		return plannedSupply2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyActivity2 createPolicyActivity2() {
		PolicyActivity2Impl policyActivity2 = new PolicyActivity2Impl();
		return policyActivity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosis2 createPostprocedureDiagnosis2() {
		PostprocedureDiagnosis2Impl postprocedureDiagnosis2 = new PostprocedureDiagnosis2Impl();
		return postprocedureDiagnosis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosis2 createPreoperativeDiagnosis2() {
		PreoperativeDiagnosis2Impl preoperativeDiagnosis2 = new PreoperativeDiagnosis2Impl();
		return preoperativeDiagnosis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemConcernAct2 createProblemConcernAct2() {
		ProblemConcernAct2Impl problemConcernAct2 = new ProblemConcernAct2Impl();
		return problemConcernAct2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemObservation2 createProblemObservation2() {
		ProblemObservation2Impl problemObservation2 = new ProblemObservation2Impl();
		return problemObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityAct2 createProcedureActivityAct2() {
		ProcedureActivityAct2Impl procedureActivityAct2 = new ProcedureActivityAct2Impl();
		return procedureActivityAct2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityObservation2 createProcedureActivityObservation2() {
		ProcedureActivityObservation2Impl procedureActivityObservation2 = new ProcedureActivityObservation2Impl();
		return procedureActivityObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityProcedure2 createProcedureActivityProcedure2() {
		ProcedureActivityProcedure2Impl procedureActivityProcedure2 = new ProcedureActivityProcedure2Impl();
		return procedureActivityProcedure2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactionObservation2 createReactionObservation2() {
		ReactionObservation2Impl reactionObservation2 = new ReactionObservation2Impl();
		return reactionObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultObservation2 createResultObservation2() {
		ResultObservation2Impl resultObservation2 = new ResultObservation2Impl();
		return resultObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOrganizer2 createResultOrganizer2() {
		ResultOrganizer2Impl resultOrganizer2 = new ResultOrganizer2Impl();
		return resultOrganizer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 createSeverityObservation2() {
		SeverityObservation2Impl severityObservation2 = new SeverityObservation2Impl();
		return severityObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistoryObservation2 createSocialHistoryObservation2() {
		SocialHistoryObservation2Impl socialHistoryObservation2 = new SocialHistoryObservation2Impl();
		return socialHistoryObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceOrDeviceAllergyObservation2 createSubstanceOrDeviceAllergyObservation2() {
		SubstanceOrDeviceAllergyObservation2Impl substanceOrDeviceAllergyObservation2 = new SubstanceOrDeviceAllergyObservation2Impl();
		return substanceOrDeviceAllergyObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TobaccoUse2 createTobaccoUse2() {
		TobaccoUse2Impl tobaccoUse2 = new TobaccoUse2Impl();
		return tobaccoUse2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignObservation2 createVitalSignObservation2() {
		VitalSignObservation2Impl vitalSignObservation2 = new VitalSignObservation2Impl();
		return vitalSignObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsOrganizer2 createVitalSignsOrganizer2() {
		VitalSignsOrganizer2Impl vitalSignsOrganizer2 = new VitalSignsOrganizer2Impl();
		return vitalSignsOrganizer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnesthesiaSection2 createAnesthesiaSection2() {
		AnesthesiaSection2Impl anesthesiaSection2 = new AnesthesiaSection2Impl();
		return anesthesiaSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection2 createAssessmentAndPlanSection2() {
		AssessmentAndPlanSection2Impl assessmentAndPlanSection2 = new AssessmentAndPlanSection2Impl();
		return assessmentAndPlanSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplicationsSection2 createComplicationsSection2() {
		ComplicationsSection2Impl complicationsSection2 = new ComplicationsSection2Impl();
		return complicationsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionDiagnosisSection2 createAdmissionDiagnosisSection2() {
		AdmissionDiagnosisSection2Impl admissionDiagnosisSection2 = new AdmissionDiagnosisSection2Impl();
		return admissionDiagnosisSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedicationsSectionEntriesOptional2 createAdmissionMedicationsSectionEntriesOptional2() {
		AdmissionMedicationsSectionEntriesOptional2Impl admissionMedicationsSectionEntriesOptional2 = new AdmissionMedicationsSectionEntriesOptional2Impl();
		return admissionMedicationsSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedicationsSectionEntriesOptional2 createDischargeMedicationsSectionEntriesOptional2() {
		DischargeMedicationsSectionEntriesOptional2Impl dischargeMedicationsSectionEntriesOptional2 = new DischargeMedicationsSectionEntriesOptional2Impl();
		return dischargeMedicationsSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSectionEntriesOptional2 createEncountersSectionEntriesOptional2() {
		EncountersSectionEntriesOptional2Impl encountersSectionEntriesOptional2 = new EncountersSectionEntriesOptional2Impl();
		return encountersSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection2 createDischargeDiagnosisSection2() {
		DischargeDiagnosisSection2Impl dischargeDiagnosisSection2 = new DischargeDiagnosisSection2Impl();
		return dischargeDiagnosisSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection2 createFunctionalStatusSection2() {
		FunctionalStatusSection2Impl functionalStatusSection2 = new FunctionalStatusSection2Impl();
		return functionalStatusSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection2 createHistoryOfPastIllnessSection2() {
		HistoryOfPastIllnessSection2Impl historyOfPastIllnessSection2 = new HistoryOfPastIllnessSection2Impl();
		return historyOfPastIllnessSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSectionEntriesOptional2 createImmunizationsSectionEntriesOptional2() {
		ImmunizationsSectionEntriesOptional2Impl immunizationsSectionEntriesOptional2 = new ImmunizationsSectionEntriesOptional2Impl();
		return immunizationsSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstructionsSection2 createInstructionsSection2() {
		InstructionsSection2Impl instructionsSection2 = new InstructionsSection2Impl();
		return instructionsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionsSection2 createInterventionsSection2() {
		InterventionsSection2Impl interventionsSection2 = new InterventionsSection2Impl();
		return interventionsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalEquipmentSection2 createMedicalEquipmentSection2() {
		MedicalEquipmentSection2Impl medicalEquipmentSection2 = new MedicalEquipmentSection2Impl();
		return medicalEquipmentSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection2 createMedicationsAdministeredSection2() {
		MedicationsAdministeredSection2Impl medicationsAdministeredSection2 = new MedicationsAdministeredSection2Impl();
		return medicationsAdministeredSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayersSection2 createPayersSection2() {
		PayersSection2Impl payersSection2 = new PayersSection2Impl();
		return payersSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection2 createPhysicalExamSection2() {
		PhysicalExamSection2Impl physicalExamSection2 = new PhysicalExamSection2Impl();
		return physicalExamSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfTreatmentSection2 createPlanOfTreatmentSection2() {
		PlanOfTreatmentSection2Impl planOfTreatmentSection2 = new PlanOfTreatmentSection2Impl();
		return planOfTreatmentSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedureSection2 createPlannedProcedureSection2() {
		PlannedProcedureSection2Impl plannedProcedureSection2 = new PlannedProcedureSection2Impl();
		return plannedProcedureSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection2 createPostprocedureDiagnosisSection2() {
		PostprocedureDiagnosisSection2Impl postprocedureDiagnosisSection2 = new PostprocedureDiagnosisSection2Impl();
		return postprocedureDiagnosisSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection2 createPreoperativeDiagnosisSection2() {
		PreoperativeDiagnosisSection2Impl preoperativeDiagnosisSection2 = new PreoperativeDiagnosisSection2Impl();
		return preoperativeDiagnosisSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection2 createProcedureFindingsSection2() {
		ProcedureFindingsSection2Impl procedureFindingsSection2 = new ProcedureFindingsSection2Impl();
		return procedureFindingsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureIndicationsSection2 createProcedureIndicationsSection2() {
		ProcedureIndicationsSection2Impl procedureIndicationsSection2 = new ProcedureIndicationsSection2Impl();
		return procedureIndicationsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedicationsSection2 createDischargeMedicationsSection2() {
		DischargeMedicationsSection2Impl dischargeMedicationsSection2 = new DischargeMedicationsSection2Impl();
		return dischargeMedicationsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionEntriesOptional2 createProceduresSectionEntriesOptional2() {
		ProceduresSectionEntriesOptional2Impl proceduresSectionEntriesOptional2 = new ProceduresSectionEntriesOptional2Impl();
		return proceduresSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection2 createReasonForReferralSection2() {
		ReasonForReferralSection2Impl reasonForReferralSection2 = new ReasonForReferralSection2Impl();
		return reasonForReferralSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSectionEntriesOptional2 createResultsSectionEntriesOptional2() {
		ResultsSectionEntriesOptional2Impl resultsSectionEntriesOptional2 = new ResultsSectionEntriesOptional2Impl();
		return resultsSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection2 createSocialHistorySection2() {
		SocialHistorySection2Impl socialHistorySection2 = new SocialHistorySection2Impl();
		return socialHistorySection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSectionEntriesOptional2 createVitalSignsSectionEntriesOptional2() {
		VitalSignsSectionEntriesOptional2Impl vitalSignsSectionEntriesOptional2 = new VitalSignsSectionEntriesOptional2Impl();
		return vitalSignsSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSectionEntriesOptional2 createAdvanceDirectivesSectionEntriesOptional2() {
		AdvanceDirectivesSectionEntriesOptional2Impl advanceDirectivesSectionEntriesOptional2 = new AdvanceDirectivesSectionEntriesOptional2Impl();
		return advanceDirectivesSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionEntriesOptional2 createMedicationsSectionEntriesOptional2() {
		MedicationsSectionEntriesOptional2Impl medicationsSectionEntriesOptional2 = new MedicationsSectionEntriesOptional2Impl();
		return medicationsSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionEntriesOptional2 createProblemSectionEntriesOptional2() {
		ProblemSectionEntriesOptional2Impl problemSectionEntriesOptional2 = new ProblemSectionEntriesOptional2Impl();
		return problemSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirectivesSection2 createAdvanceDirectivesSection2() {
		AdvanceDirectivesSection2Impl advanceDirectivesSection2 = new AdvanceDirectivesSection2Impl();
		return advanceDirectivesSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional2 createAllergiesSectionEntriesOptional2() {
		AllergiesSectionEntriesOptional2Impl allergiesSectionEntriesOptional2 = new AllergiesSectionEntriesOptional2Impl();
		return allergiesSectionEntriesOptional2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSection2 createAllergiesSection2() {
		AllergiesSection2Impl allergiesSection2 = new AllergiesSection2Impl();
		return allergiesSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSection2 createEncountersSection2() {
		EncountersSection2Impl encountersSection2 = new EncountersSection2Impl();
		return encountersSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSection2 createImmunizationsSection2() {
		ImmunizationsSection2Impl immunizationsSection2 = new ImmunizationsSection2Impl();
		return immunizationsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSection2 createMedicationsSection2() {
		MedicationsSection2Impl medicationsSection2 = new MedicationsSection2Impl();
		return medicationsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSection2 createProblemSection2() {
		ProblemSection2Impl problemSection2 = new ProblemSection2Impl();
		return problemSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSection2 createProceduresSection2() {
		ProceduresSection2Impl proceduresSection2 = new ProceduresSection2Impl();
		return proceduresSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSection2 createResultsSection2() {
		ResultsSection2Impl resultsSection2 = new ResultsSection2Impl();
		return resultsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSection2 createVitalSignsSection2() {
		VitalSignsSection2Impl vitalSignsSection2 = new VitalSignsSection2Impl();
		return vitalSignsSection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationNote2 createConsultationNote2() {
		ConsultationNote2Impl consultationNote2 = new ConsultationNote2Impl();
		return consultationNote2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument2 createContinuityOfCareDocument2() {
		ContinuityOfCareDocument2Impl continuityOfCareDocument2 = new ContinuityOfCareDocument2Impl();
		return continuityOfCareDocument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport2 createDiagnosticImagingReport2() {
		DiagnosticImagingReport2Impl diagnosticImagingReport2 = new DiagnosticImagingReport2Impl();
		return diagnosticImagingReport2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeSummary2 createDischargeSummary2() {
		DischargeSummary2Impl dischargeSummary2 = new DischargeSummary2Impl();
		return dischargeSummary2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysicalNote2 createHistoryAndPhysicalNote2() {
		HistoryAndPhysicalNote2Impl historyAndPhysicalNote2 = new HistoryAndPhysicalNote2Impl();
		return historyAndPhysicalNote2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNote2 createOperativeNote2() {
		OperativeNote2Impl operativeNote2 = new OperativeNote2Impl();
		return operativeNote2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote2 createProcedureNote2() {
		ProcedureNote2Impl procedureNote2 = new ProcedureNote2Impl();
		return procedureNote2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote2 createProgressNote2() {
		ProgressNote2Impl progressNote2 = new ProgressNote2Impl();
		return progressNote2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument2 createUnstructuredDocument2() {
		UnstructuredDocument2Impl unstructuredDocument2 = new UnstructuredDocument2Impl();
		return unstructuredDocument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionForSubstanceAdministration2 createPreconditionForSubstanceAdministration2() {
		PreconditionForSubstanceAdministration2Impl preconditionForSubstanceAdministration2 = new PreconditionForSubstanceAdministration2Impl();
		return preconditionForSubstanceAdministration2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation2 createFamilyHistoryObservation2() {
		FamilyHistoryObservation2Impl familyHistoryObservation2 = new FamilyHistoryObservation2Impl();
		return familyHistoryObservation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer2 createFamilyHistoryOrganizer2() {
		FamilyHistoryOrganizer2Impl familyHistoryOrganizer2 = new FamilyHistoryOrganizer2Impl();
		return familyHistoryOrganizer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection2 createFamilyHistorySection2() {
		FamilyHistorySection2Impl familyHistorySection2 = new FamilyHistorySection2Impl();
		return familyHistorySection2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer2 createPhysicianReadingStudyPerformer2() {
		PhysicianReadingStudyPerformer2Impl physicianReadingStudyPerformer2 = new PhysicianReadingStudyPerformer2Impl();
		return physicianReadingStudyPerformer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseOfCareSection createCourseOfCareSection() {
		CourseOfCareSectionImpl courseOfCareSection = new CourseOfCareSectionImpl();
		return courseOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedInterventionAct createPlannedInterventionAct() {
		PlannedInterventionActImpl plannedInterventionAct = new PlannedInterventionActImpl();
		return plannedInterventionAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskConcernAct createRiskConcernAct() {
		RiskConcernActImpl riskConcernAct = new RiskConcernActImpl();
		return riskConcernAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStatusSection createGeneralStatusSection() {
		GeneralStatusSectionImpl generalStatusSection = new GeneralStatusSectionImpl();
		return generalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalCourseSection createHospitalCourseSection() {
		HospitalCourseSectionImpl hospitalCourseSection = new HospitalCourseSectionImpl();
		return hospitalCourseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurgicalDrainsSection createSurgicalDrainsSection() {
		SurgicalDrainsSectionImpl surgicalDrainsSection = new SurgicalDrainsSectionImpl();
		return surgicalDrainsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnstructuredDocument createUnstructuredDocument() {
		UnstructuredDocumentImpl unstructuredDocument = new UnstructuredDocumentImpl();
		return unstructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationInformation createMedicationInformation() {
		MedicationInformationImpl medicationInformation = new MedicationInformationImpl();
		return medicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeSummary createDischargeSummary() {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeDietSection createDischargeDietSection() {
		DischargeDietSectionImpl dischargeDietSection = new DischargeDietSectionImpl();
		return dischargeDietSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeMedicationsSectionEntriesOptional createHospitalDischargeMedicationsSectionEntriesOptional() {
		HospitalDischargeMedicationsSectionEntriesOptionalImpl hospitalDischargeMedicationsSectionEntriesOptional = new HospitalDischargeMedicationsSectionEntriesOptionalImpl();
		return hospitalDischargeMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreconditionForSubstanceAdministration createPreconditionForSubstanceAdministration() {
		PreconditionForSubstanceAdministrationImpl preconditionForSubstanceAdministration = new PreconditionForSubstanceAdministrationImpl();
		return preconditionForSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationMedicationInformation createImmunizationMedicationInformation() {
		ImmunizationMedicationInformationImpl immunizationMedicationInformation = new ImmunizationMedicationInformationImpl();
		return immunizationMedicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeStudiesSummarySection createHospitalDischargeStudiesSummarySection() {
		HospitalDischargeStudiesSummarySectionImpl hospitalDischargeStudiesSummarySection = new HospitalDischargeStudiesSummarySectionImpl();
		return hospitalDischargeStudiesSummarySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeMedication createDischargeMedication() {
		DischargeMedicationImpl dischargeMedication = new DischargeMedicationImpl();
		return dischargeMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeDiagnosis createHospitalDischargeDiagnosis() {
		HospitalDischargeDiagnosisImpl hospitalDischargeDiagnosis = new HospitalDischargeDiagnosisImpl();
		return hospitalDischargeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalDischargeInstructionsSection createHospitalDischargeInstructionsSection() {
		HospitalDischargeInstructionsSectionImpl hospitalDischargeInstructionsSection = new HospitalDischargeInstructionsSectionImpl();
		return hospitalDischargeInstructionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsolPackage getConsolPackage() {
		return (ConsolPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConsolPackage getPackage() {
		return ConsolPackage.eINSTANCE;
	}

} // ConsolFactoryImpl
