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
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION:
				return createAllergyStatusObservation();
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
			case ConsolPackage.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION:
				return createSubstanceOrDeviceAllergyObservation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyProblemAct createAllergyProblemAct() {
		AllergyProblemActImpl allergyProblemAct = new AllergyProblemActImpl();
		return allergyProblemAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation createAllergyObservation() {
		AllergyObservationImpl allergyObservation = new AllergyObservationImpl();
		return allergyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation createSeverityObservation() {
		SeverityObservationImpl severityObservation = new SeverityObservationImpl();
		return severityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyStatusObservation createAllergyStatusObservation() {
		AllergyStatusObservationImpl allergyStatusObservation = new AllergyStatusObservationImpl();
		return allergyStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentActivity createCommentActivity() {
		CommentActivityImpl commentActivity = new CommentActivityImpl();
		return commentActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationActivity createMedicationActivity() {
		MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
		return medicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMedicinalSupplyActivity createNonMedicinalSupplyActivity() {
		NonMedicinalSupplyActivityImpl nonMedicinalSupplyActivity = new NonMedicinalSupplyActivityImpl();
		return nonMedicinalSupplyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions createInstructions() {
		InstructionsImpl instructions = new InstructionsImpl();
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indication createIndication() {
		IndicationImpl indication = new IndicationImpl();
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense createMedicationDispense() {
		MedicationDispenseImpl medicationDispense = new MedicationDispenseImpl();
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSupplyOrder createMedicationSupplyOrder() {
		MedicationSupplyOrderImpl medicationSupplyOrder = new MedicationSupplyOrderImpl();
		return medicationSupplyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugVehicle createDrugVehicle() {
		DrugVehicleImpl drugVehicle = new DrugVehicleImpl();
		return drugVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernAct createProblemConcernAct() {
		ProblemConcernActImpl problemConcernAct = new ProblemConcernActImpl();
		return problemConcernAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation createProblemObservation() {
		ProblemObservationImpl problemObservation = new ProblemObservationImpl();
		return problemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatus createProblemStatus() {
		ProblemStatusImpl problemStatus = new ProblemStatusImpl();
		return problemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument createContinuityOfCareDocument() {
		ContinuityOfCareDocumentImpl continuityOfCareDocument = new ContinuityOfCareDocumentImpl();
		return continuityOfCareDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSectionEntriesOptional createAdvanceDirectivesSectionEntriesOptional() {
		AdvanceDirectivesSectionEntriesOptionalImpl advanceDirectivesSectionEntriesOptional = new AdvanceDirectivesSectionEntriesOptionalImpl();
		return advanceDirectivesSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection createAllergiesSection() {
		AllergiesSectionImpl allergiesSection = new AllergiesSectionImpl();
		return allergiesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional createAllergiesSectionEntriesOptional() {
		AllergiesSectionEntriesOptionalImpl allergiesSectionEntriesOptional = new AllergiesSectionEntriesOptionalImpl();
		return allergiesSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionEntriesOptional createEncountersSectionEntriesOptional() {
		EncountersSectionEntriesOptionalImpl encountersSectionEntriesOptional = new EncountersSectionEntriesOptionalImpl();
		return encountersSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional createImmunizationsSectionEntriesOptional() {
		ImmunizationsSectionEntriesOptionalImpl immunizationsSectionEntriesOptional = new ImmunizationsSectionEntriesOptionalImpl();
		return immunizationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivity createCoverageActivity() {
		CoverageActivityImpl coverageActivity = new CoverageActivityImpl();
		return coverageActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity createPolicyActivity() {
		PolicyActivityImpl policyActivity = new PolicyActivityImpl();
		return policyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity createAuthorizationActivity() {
		AuthorizationActivityImpl authorizationActivity = new AuthorizationActivityImpl();
		return authorizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionEntriesOptional createMedicationsSectionEntriesOptional() {
		MedicationsSectionEntriesOptionalImpl medicationsSectionEntriesOptional = new MedicationsSectionEntriesOptionalImpl();
		return medicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityAct createPlanOfCareActivityAct() {
		PlanOfCareActivityActImpl planOfCareActivityAct = new PlanOfCareActivityActImpl();
		return planOfCareActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter createPlanOfCareActivityEncounter() {
		PlanOfCareActivityEncounterImpl planOfCareActivityEncounter = new PlanOfCareActivityEncounterImpl();
		return planOfCareActivityEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityObservation createPlanOfCareActivityObservation() {
		PlanOfCareActivityObservationImpl planOfCareActivityObservation = new PlanOfCareActivityObservationImpl();
		return planOfCareActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityProcedure createPlanOfCareActivityProcedure() {
		PlanOfCareActivityProcedureImpl planOfCareActivityProcedure = new PlanOfCareActivityProcedureImpl();
		return planOfCareActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration() {
		PlanOfCareActivitySubstanceAdministrationImpl planOfCareActivitySubstanceAdministration = new PlanOfCareActivitySubstanceAdministrationImpl();
		return planOfCareActivitySubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySupply createPlanOfCareActivitySupply() {
		PlanOfCareActivitySupplyImpl planOfCareActivitySupply = new PlanOfCareActivitySupplyImpl();
		return planOfCareActivitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection createProceduresSection() {
		ProceduresSectionImpl proceduresSection = new ProceduresSectionImpl();
		return proceduresSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional createProceduresSectionEntriesOptional() {
		ProceduresSectionEntriesOptionalImpl proceduresSectionEntriesOptional = new ProceduresSectionEntriesOptionalImpl();
		return proceduresSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityObservation createProcedureActivityObservation() {
		ProcedureActivityObservationImpl procedureActivityObservation = new ProcedureActivityObservationImpl();
		return procedureActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityAct createProcedureActivityAct() {
		ProcedureActivityActImpl procedureActivityAct = new ProcedureActivityActImpl();
		return procedureActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivityProcedure createProcedureActivityProcedure() {
		ProcedureActivityProcedureImpl procedureActivityProcedure = new ProcedureActivityProcedureImpl();
		return procedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional createVitalSignsSectionEntriesOptional() {
		VitalSignsSectionEntriesOptionalImpl vitalSignsSectionEntriesOptional = new VitalSignsSectionEntriesOptionalImpl();
		return vitalSignsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer createFamilyHistoryOrganizer() {
		FamilyHistoryOrganizerImpl familyHistoryOrganizer = new FamilyHistoryOrganizerImpl();
		return familyHistoryOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryDeathObservation createFamilyHistoryDeathObservation() {
		FamilyHistoryDeathObservationImpl familyHistoryDeathObservation = new FamilyHistoryDeathObservationImpl();
		return familyHistoryDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryObservation createSocialHistoryObservation() {
		SocialHistoryObservationImpl socialHistoryObservation = new SocialHistoryObservationImpl();
		return socialHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyObservation createPregnancyObservation() {
		PregnancyObservationImpl pregnancyObservation = new PregnancyObservationImpl();
		return pregnancyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstimatedDateOfDelivery createEstimatedDateOfDelivery() {
		EstimatedDateOfDeliveryImpl estimatedDateOfDelivery = new EstimatedDateOfDeliveryImpl();
		return estimatedDateOfDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusObservation createSmokingStatusObservation() {
		SmokingStatusObservationImpl smokingStatusObservation = new SmokingStatusObservationImpl();
		return smokingStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TobaccoUse createTobaccoUse() {
		TobaccoUseImpl tobaccoUse = new TobaccoUseImpl();
		return tobaccoUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection createResultsSection() {
		ResultsSectionImpl resultsSection = new ResultsSectionImpl();
		return resultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionEntriesOptional createResultsSectionEntriesOptional() {
		ResultsSectionEntriesOptionalImpl resultsSectionEntriesOptional = new ResultsSectionEntriesOptionalImpl();
		return resultsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservation createResultObservation() {
		ResultObservationImpl resultObservation = new ResultObservationImpl();
		return resultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusResultOrganizer createFunctionalStatusResultOrganizer() {
		FunctionalStatusResultOrganizerImpl functionalStatusResultOrganizer = new FunctionalStatusResultOrganizerImpl();
		return functionalStatusResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusResultObservation createFunctionalStatusResultObservation() {
		FunctionalStatusResultObservationImpl functionalStatusResultObservation = new FunctionalStatusResultObservationImpl();
		return functionalStatusResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaregiverCharacteristics createCaregiverCharacteristics() {
		CaregiverCharacteristicsImpl caregiverCharacteristics = new CaregiverCharacteristicsImpl();
		return caregiverCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleObservation createAssessmentScaleObservation() {
		AssessmentScaleObservationImpl assessmentScaleObservation = new AssessmentScaleObservationImpl();
		return assessmentScaleObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentScaleSupportingObservation createAssessmentScaleSupportingObservation() {
		AssessmentScaleSupportingObservationImpl assessmentScaleSupportingObservation = new AssessmentScaleSupportingObservationImpl();
		return assessmentScaleSupportingObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveStatusResultOrganizer createCognitiveStatusResultOrganizer() {
		CognitiveStatusResultOrganizerImpl cognitiveStatusResultOrganizer = new CognitiveStatusResultOrganizerImpl();
		return cognitiveStatusResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveStatusResultObservation createCognitiveStatusResultObservation() {
		CognitiveStatusResultObservationImpl cognitiveStatusResultObservation = new CognitiveStatusResultObservationImpl();
		return cognitiveStatusResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusProblemObservation createFunctionalStatusProblemObservation() {
		FunctionalStatusProblemObservationImpl functionalStatusProblemObservation = new FunctionalStatusProblemObservationImpl();
		return functionalStatusProblemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveStatusProblemObservation createCognitiveStatusProblemObservation() {
		CognitiveStatusProblemObservationImpl cognitiveStatusProblemObservation = new CognitiveStatusProblemObservationImpl();
		return cognitiveStatusProblemObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureUlcerObservation createPressureUlcerObservation() {
		PressureUlcerObservationImpl pressureUlcerObservation = new PressureUlcerObservationImpl();
		return pressureUlcerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPressureUlcersObservation createNumberOfPressureUlcersObservation() {
		NumberOfPressureUlcersObservationImpl numberOfPressureUlcersObservation = new NumberOfPressureUlcersObservationImpl();
		return numberOfPressureUlcersObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighestPressureUlcerStage createHighestPressureUlcerStage() {
		HighestPressureUlcerStageImpl highestPressureUlcerStage = new HighestPressureUlcerStageImpl();
		return highestPressureUlcerStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection createProblemSection() {
		ProblemSectionImpl problemSection = new ProblemSectionImpl();
		return problemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional createProblemSectionEntriesOptional() {
		ProblemSectionEntriesOptionalImpl problemSectionEntriesOptional = new ProblemSectionEntriesOptionalImpl();
		return problemSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation createAdvanceDirectiveObservation() {
		AdvanceDirectiveObservationImpl advanceDirectiveObservation = new AdvanceDirectiveObservationImpl();
		return advanceDirectiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterActivities createEncounterActivities() {
		EncounterActivitiesImpl encounterActivities = new EncounterActivitiesImpl();
		return encounterActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterDiagnosis createEncounterDiagnosis() {
		EncounterDiagnosisImpl encounterDiagnosis = new EncounterDiagnosisImpl();
		return encounterDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryLocation createServiceDeliveryLocation() {
		ServiceDeliveryLocationImpl serviceDeliveryLocation = new ServiceDeliveryLocationImpl();
		return serviceDeliveryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationActivity createImmunizationActivity() {
		ImmunizationActivityImpl immunizationActivity = new ImmunizationActivityImpl();
		return immunizationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRefusalReason createImmunizationRefusalReason() {
		ImmunizationRefusalReasonImpl immunizationRefusalReason = new ImmunizationRefusalReasonImpl();
		return immunizationRefusalReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignObservation createVitalSignObservation() {
		VitalSignObservationImpl vitalSignObservation = new VitalSignObservationImpl();
		return vitalSignObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection createHistoryOfPresentIllnessSection() {
		HistoryOfPresentIllnessSectionImpl historyOfPresentIllnessSection = new HistoryOfPresentIllnessSectionImpl();
		return historyOfPresentIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection createHospitalDischargeDiagnosisSection() {
		HospitalDischargeDiagnosisSectionImpl hospitalDischargeDiagnosisSection = new HospitalDischargeDiagnosisSectionImpl();
		return hospitalDischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional createHospitalAdmissionMedicationsSectionEntriesOptional() {
		HospitalAdmissionMedicationsSectionEntriesOptionalImpl hospitalAdmissionMedicationsSectionEntriesOptional = new HospitalAdmissionMedicationsSectionEntriesOptionalImpl();
		return hospitalAdmissionMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedication createAdmissionMedication() {
		AdmissionMedicationImpl admissionMedication = new AdmissionMedicationImpl();
		return admissionMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargePhysicalSection createHospitalDischargePhysicalSection() {
		HospitalDischargePhysicalSectionImpl hospitalDischargePhysicalSection = new HospitalDischargePhysicalSectionImpl();
		return hospitalDischargePhysicalSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection createChiefComplaintAndReasonForVisitSection() {
		ChiefComplaintAndReasonForVisitSectionImpl chiefComplaintAndReasonForVisitSection = new ChiefComplaintAndReasonForVisitSectionImpl();
		return chiefComplaintAndReasonForVisitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection createReasonForVisitSection() {
		ReasonForVisitSectionImpl reasonForVisitSection = new ReasonForVisitSectionImpl();
		return reasonForVisitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnesthesiaSection createAnesthesiaSection() {
		AnesthesiaSectionImpl anesthesiaSection = new AnesthesiaSectionImpl();
		return anesthesiaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplicationsSection createComplicationsSection() {
		ComplicationsSectionImpl complicationsSection = new ComplicationsSectionImpl();
		return complicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICOMObjectCatalogSection createDICOMObjectCatalogSection() {
		DICOMObjectCatalogSectionImpl dicomObjectCatalogSection = new DICOMObjectCatalogSectionImpl();
		return dicomObjectCatalogSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyAct createStudyAct() {
		StudyActImpl studyAct = new StudyActImpl();
		return studyAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesAct createSeriesAct() {
		SeriesActImpl seriesAct = new SeriesActImpl();
		return seriesAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOPInstanceObservation createSOPInstanceObservation() {
		SOPInstanceObservationImpl sopInstanceObservation = new SOPInstanceObservationImpl();
		return sopInstanceObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeofReferenceObservation createPurposeofReferenceObservation() {
		PurposeofReferenceObservationImpl purposeofReferenceObservation = new PurposeofReferenceObservationImpl();
		return purposeofReferenceObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedFramesObservation createReferencedFramesObservation() {
		ReferencedFramesObservationImpl referencedFramesObservation = new ReferencedFramesObservationImpl();
		return referencedFramesObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryObservation createBoundaryObservation() {
		BoundaryObservationImpl boundaryObservation = new BoundaryObservationImpl();
		return boundaryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindingsSection createFindingsSection() {
		FindingsSectionImpl findingsSection = new FindingsSectionImpl();
		return findingsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalConsultationsSection createHospitalConsultationsSection() {
		HospitalConsultationsSectionImpl hospitalConsultationsSection = new HospitalConsultationsSectionImpl();
		return hospitalConsultationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsSection createInterventionsSection() {
		InterventionsSectionImpl interventionsSection = new InterventionsSectionImpl();
		return interventionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalHistorySection createMedicalHistorySection() {
		MedicalHistorySectionImpl medicalHistorySection = new MedicalHistorySectionImpl();
		return medicalHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection createObjectiveSection() {
		ObjectiveSectionImpl objectiveSection = new ObjectiveSectionImpl();
		return objectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteFluidSection createOperativeNoteFluidSection() {
		OperativeNoteFluidSectionImpl operativeNoteFluidSection = new OperativeNoteFluidSectionImpl();
		return operativeNoteFluidSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteSurgicalProcedureSection createOperativeNoteSurgicalProcedureSection() {
		OperativeNoteSurgicalProcedureSectionImpl operativeNoteSurgicalProcedureSection = new OperativeNoteSurgicalProcedureSectionImpl();
		return operativeNoteSurgicalProcedureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedProcedureSection createPlannedProcedureSection() {
		PlannedProcedureSectionImpl plannedProcedureSection = new PlannedProcedureSectionImpl();
		return plannedProcedureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostoperativeDiagnosisSection createPostoperativeDiagnosisSection() {
		PostoperativeDiagnosisSectionImpl postoperativeDiagnosisSection = new PostoperativeDiagnosisSectionImpl();
		return postoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosisSection createPostprocedureDiagnosisSection() {
		PostprocedureDiagnosisSectionImpl postprocedureDiagnosisSection = new PostprocedureDiagnosisSectionImpl();
		return postprocedureDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostprocedureDiagnosis createPostprocedureDiagnosis() {
		PostprocedureDiagnosisImpl postprocedureDiagnosis = new PostprocedureDiagnosisImpl();
		return postprocedureDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection createPreoperativeDiagnosisSection() {
		PreoperativeDiagnosisSectionImpl preoperativeDiagnosisSection = new PreoperativeDiagnosisSectionImpl();
		return preoperativeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDescriptionSection createProcedureDescriptionSection() {
		ProcedureDescriptionSectionImpl procedureDescriptionSection = new ProcedureDescriptionSectionImpl();
		return procedureDescriptionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDispositionSection createProcedureDispositionSection() {
		ProcedureDispositionSectionImpl procedureDispositionSection = new ProcedureDispositionSectionImpl();
		return procedureDispositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEstimatedBloodLossSection createProcedureEstimatedBloodLossSection() {
		ProcedureEstimatedBloodLossSectionImpl procedureEstimatedBloodLossSection = new ProcedureEstimatedBloodLossSectionImpl();
		return procedureEstimatedBloodLossSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureFindingsSection createProcedureFindingsSection() {
		ProcedureFindingsSectionImpl procedureFindingsSection = new ProcedureFindingsSectionImpl();
		return procedureFindingsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureImplantsSection createProcedureImplantsSection() {
		ProcedureImplantsSectionImpl procedureImplantsSection = new ProcedureImplantsSectionImpl();
		return procedureImplantsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureIndicationsSection createProcedureIndicationsSection() {
		ProcedureIndicationsSectionImpl procedureIndicationsSection = new ProcedureIndicationsSectionImpl();
		return procedureIndicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimensTakenSection createProcedureSpecimensTakenSection() {
		ProcedureSpecimensTakenSectionImpl procedureSpecimensTakenSection = new ProcedureSpecimensTakenSectionImpl();
		return procedureSpecimensTakenSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveSection createSubjectiveSection() {
		SubjectiveSectionImpl subjectiveSection = new SubjectiveSectionImpl();
		return subjectiveSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationNote createConsultationNote() {
		ConsultationNoteImpl consultationNote = new ConsultationNoteImpl();
		return consultationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection createAssessmentSection() {
		AssessmentSectionImpl assessmentSection = new AssessmentSectionImpl();
		return assessmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysicalNote createHistoryAndPhysicalNote() {
		HistoryAndPhysicalNoteImpl historyAndPhysicalNote = new HistoryAndPhysicalNoteImpl();
		return historyAndPhysicalNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNote createOperativeNote() {
		OperativeNoteImpl operativeNote = new OperativeNoteImpl();
		return operativeNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNote createProcedureNote() {
		ProcedureNoteImpl procedureNote = new ProcedureNoteImpl();
		return procedureNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote createProgressNote() {
		ProgressNoteImpl progressNote = new ProgressNoteImpl();
		return progressNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosis createPreoperativeDiagnosis() {
		PreoperativeDiagnosisImpl preoperativeDiagnosis = new PreoperativeDiagnosisImpl();
		return preoperativeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection createInstructionsSection() {
		InstructionsSectionImpl instructionsSection = new InstructionsSectionImpl();
		return instructionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosis createHospitalAdmissionDiagnosis() {
		HospitalAdmissionDiagnosisImpl hospitalAdmissionDiagnosis = new HospitalAdmissionDiagnosisImpl();
		return hospitalAdmissionDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport createDiagnosticImagingReport() {
		DiagnosticImagingReportImpl diagnosticImagingReport = new DiagnosticImagingReportImpl();
		return diagnosticImagingReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer createPhysicianReadingStudyPerformer() {
		PhysicianReadingStudyPerformerImpl physicianReadingStudyPerformer = new PhysicianReadingStudyPerformerImpl();
		return physicianReadingStudyPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianofRecordParticipant createPhysicianofRecordParticipant() {
		PhysicianofRecordParticipantImpl physicianofRecordParticipant = new PhysicianofRecordParticipantImpl();
		return physicianofRecordParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextObservation createTextObservation() {
		TextObservationImpl textObservation = new TextObservationImpl();
		return textObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityMeasurementObservation createQuantityMeasurementObservation() {
		QuantityMeasurementObservationImpl quantityMeasurementObservation = new QuantityMeasurementObservationImpl();
		return quantityMeasurementObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeObservations createCodeObservations() {
		CodeObservationsImpl codeObservations = new CodeObservationsImpl();
		return codeObservations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureContext createProcedureContext() {
		ProcedureContextImpl procedureContext = new ProcedureContextImpl();
		return procedureContext;
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationUseNoneKnown createMedicationUseNoneKnown() {
		MedicationUseNoneKnownImpl medicationUseNoneKnown = new MedicationUseNoneKnownImpl();
		return medicationUseNoneKnown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeceasedObservation createDeceasedObservation() {
		DeceasedObservationImpl deceasedObservation = new DeceasedObservationImpl();
		return deceasedObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetusSubjectContext createFetusSubjectContext() {
		FetusSubjectContextImpl fetusSubjectContext = new FetusSubjectContextImpl();
		return fetusSubjectContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObserverContext createObserverContext() {
		ObserverContextImpl observerContext = new ObserverContextImpl();
		return observerContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation createSubstanceOrDeviceAllergyObservation() {
		SubstanceOrDeviceAllergyObservationImpl substanceOrDeviceAllergyObservation = new SubstanceOrDeviceAllergyObservationImpl();
		return substanceOrDeviceAllergyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection createGeneralStatusSection() {
		GeneralStatusSectionImpl generalStatusSection = new GeneralStatusSectionImpl();
		return generalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalCourseSection createHospitalCourseSection() {
		HospitalCourseSectionImpl hospitalCourseSection = new HospitalCourseSectionImpl();
		return hospitalCourseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgicalDrainsSection createSurgicalDrainsSection() {
		SurgicalDrainsSectionImpl surgicalDrainsSection = new SurgicalDrainsSectionImpl();
		return surgicalDrainsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument createUnstructuredDocument() {
		UnstructuredDocumentImpl unstructuredDocument = new UnstructuredDocumentImpl();
		return unstructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationInformation createMedicationInformation() {
		MedicationInformationImpl medicationInformation = new MedicationInformationImpl();
		return medicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeSummary createDischargeSummary() {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDietSection createDischargeDietSection() {
		DischargeDietSectionImpl dischargeDietSection = new DischargeDietSectionImpl();
		return dischargeDietSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSectionEntriesOptional createHospitalDischargeMedicationsSectionEntriesOptional() {
		HospitalDischargeMedicationsSectionEntriesOptionalImpl hospitalDischargeMedicationsSectionEntriesOptional = new HospitalDischargeMedicationsSectionEntriesOptionalImpl();
		return hospitalDischargeMedicationsSectionEntriesOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionForSubstanceAdministration createPreconditionForSubstanceAdministration() {
		PreconditionForSubstanceAdministrationImpl preconditionForSubstanceAdministration = new PreconditionForSubstanceAdministrationImpl();
		return preconditionForSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationMedicationInformation createImmunizationMedicationInformation() {
		ImmunizationMedicationInformationImpl immunizationMedicationInformation = new ImmunizationMedicationInformationImpl();
		return immunizationMedicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeStudiesSummarySection createHospitalDischargeStudiesSummarySection() {
		HospitalDischargeStudiesSummarySectionImpl hospitalDischargeStudiesSummarySection = new HospitalDischargeStudiesSummarySectionImpl();
		return hospitalDischargeStudiesSummarySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeMedication createDischargeMedication() {
		DischargeMedicationImpl dischargeMedication = new DischargeMedicationImpl();
		return dischargeMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosis createHospitalDischargeDiagnosis() {
		HospitalDischargeDiagnosisImpl hospitalDischargeDiagnosis = new HospitalDischargeDiagnosisImpl();
		return hospitalDischargeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection createHospitalDischargeInstructionsSection() {
		HospitalDischargeInstructionsSectionImpl hospitalDischargeInstructionsSection = new HospitalDischargeInstructionsSectionImpl();
		return hospitalDischargeInstructionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
