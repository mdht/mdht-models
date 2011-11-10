/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
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
			ConsolFactory theConsolFactory = (ConsolFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/consol");
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
			case ConsolPackage.ALLERGY_DRUG_SENSITIVITY:
				return createAllergyDrugSensitivity();
			case ConsolPackage.EPISODE_OBSERVATION:
				return createEpisodeObservation();
			case ConsolPackage.ALLERGY_INTOLERANCE:
				return createAllergyIntolerance();
			case ConsolPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER:
				return createProblemEntryReactionObservationContainer();
			case ConsolPackage.AGE_OBSERVATION:
				return createAgeObservation();
			case ConsolPackage.SEVERITY:
				return createSeverity();
			case ConsolPackage.PROBLEM_STATUS_OBSERVATION:
				return createProblemStatusObservation();
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case ConsolPackage.COMMENT:
				return createComment();
			case ConsolPackage.MEDICATION:
				return createMedication();
			case ConsolPackage.MEDICATION_TYPE:
				return createMedicationType();
			case ConsolPackage.MEDICATION_ORDER_INFORMATION:
				return createMedicationOrderInformation();
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION:
				return createMedicationStatusObservation();
			case ConsolPackage.PRODUCT_INSTANCE:
				return createProductInstance();
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return createMedicationFullfillmentInstructions();
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return createMedicationSeriesNumberObservation();
			case ConsolPackage.INTERNAL_REFERENCE:
				return createInternalReference();
			case ConsolPackage.PATIENT_MEDICAL_INSTRUCTIONS:
				return createPatientMedicalInstructions();
			case ConsolPackage.CONDITION:
				return createCondition();
			case ConsolPackage.CONDITION_ENTRY:
				return createConditionEntry();
			case ConsolPackage.CAUSE_OF_DEATH_OBSERVATION:
				return createCauseOfDeathObservation();
			case ConsolPackage.PATIENT_SUMMARY:
				return createPatientSummary();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION:
				return createAdvanceDirectivesSection();
			case ConsolPackage.ADVANCE_DIRECTIVE:
				return createAdvanceDirective();
			case ConsolPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return createAdvanceDirectiveStatusObservation();
			case ConsolPackage.ALLERGIES_REACTIONS_SECTION:
				return createAllergiesReactionsSection();
			case ConsolPackage.PROBLEM_LIST_SECTION:
				return createProblemListSection();
			case ConsolPackage.ENCOUNTERS_SECTION:
				return createEncountersSection();
			case ConsolPackage.ENCOUNTER:
				return createEncounter();
			case ConsolPackage.ENCOUNTERS_ACTIVITY:
				return createEncountersActivity();
			case ConsolPackage.IMMUNIZATIONS_SECTION:
				return createImmunizationsSection();
			case ConsolPackage.IMMUNIZATION:
				return createImmunization();
			case ConsolPackage.PAYERS_SECTION:
				return createPayersSection();
			case ConsolPackage.INSURANCE_PROVIDER:
				return createInsuranceProvider();
			case ConsolPackage.PAYER_ENTRY:
				return createPayerEntry();
			case ConsolPackage.MEDICATIONS_SECTION:
				return createMedicationsSection();
			case ConsolPackage.PLAN_OF_CARE_SECTION:
				return createPlanOfCareSection();
			case ConsolPackage.PROCEDURE:
				return createProcedure();
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
			case ConsolPackage.PREGNANCY_HISTORY_SECTION:
				return createPregnancyHistorySection();
			case ConsolPackage.PREGNANCY_OBSERVATION:
				return createPregnancyObservation();
			case ConsolPackage.SURGERIES_SECTION:
				return createSurgeriesSection();
			case ConsolPackage.EXTERNAL_REFERENCE:
				return createExternalReference();
			case ConsolPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE:
				return createProcedureEntryProcedureActivityProcedure();
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return createVitalSignsSection();
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case ConsolPackage.VITAL_SIGN:
				return createVitalSign();
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION:
				return createDiagnosticResultsSection();
			case ConsolPackage.RESULT:
				return createResult();
			case ConsolPackage.RESULT_ORGANIZER:
				return createResultOrganizer();
			case ConsolPackage.FAMILY_HISTORY_SECTION:
				return createFamilyHistorySection();
			case ConsolPackage.FAMILY_HISTORY:
				return createFamilyHistory();
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION:
				return createFamilyHistoryObservation();
			case ConsolPackage.SOCIAL_HISTORY_SECTION:
				return createSocialHistorySection();
			case ConsolPackage.SOCIAL_HISTORY:
				return createSocialHistory();
			case ConsolPackage.SOCIAL_HISTORY_STATUS_OBSERVATION:
				return createSocialHistoryStatusObservation();
			case ConsolPackage.RESULTS_SECTION:
				return createResultsSection();
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION:
				return createMedicalEquipmentSection();
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION:
				return createFunctionalStatusSection();
			case ConsolPackage.PURPOSE_SECTION:
				return createPurposeSection();
			case ConsolPackage.PURPOSE_ACTIVITY:
				return createPurposeActivity();
			case ConsolPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return createAdvanceDirectiveVerification();
			case ConsolPackage.ADVANCE_DIRECTIVE_REFERENCE:
				return createAdvanceDirectiveReference();
			case ConsolPackage.ENCOUNTER_LOCATION:
				return createEncounterLocation();
			case ConsolPackage.PAYER_ENTITY:
				return createPayerEntity();
			case ConsolPackage.COVERED_PARTY:
				return createCoveredParty();
			case ConsolPackage.POLICY_SUBSCRIBER:
				return createPolicySubscriber();
			case ConsolPackage.SUPPORT_GUARDIAN:
				return createSupportGuardian();
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return createHistoryOfPastIllnessSection();
			case ConsolPackage.CHIEF_COMPLAINT_SECTION:
				return createChiefComplaintSection();
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION:
				return createReasonForReferralSection();
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS:
				return createHistoryOfPresentIllness();
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return createHospitalAdmissionDiagnosisSection();
			case ConsolPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return createDischargeDiagnosisSection();
			case ConsolPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return createAdmissionMedicationHistorySection();
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return createHospitalDischargeMedicationsSection();
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return createMedicationsAdministeredSection();
			case ConsolPackage.PHYSICAL_EXAM_SECTION:
				return createPhysicalExamSection();
			case ConsolPackage.GENERAL_APPEARANCE_SECTION:
				return createGeneralAppearanceSection();
			case ConsolPackage.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION:
				return createVisibleImplantedMedicalDevicesSection();
			case ConsolPackage.INTEGUMENTARY_SYSTEM_SECTION:
				return createIntegumentarySystemSection();
			case ConsolPackage.HEAD_SECTION:
				return createHeadSection();
			case ConsolPackage.EYES_SECTION:
				return createEyesSection();
			case ConsolPackage.EARS_NOSE_MOUTH_THROAT_SECTION:
				return createEarsNoseMouthThroatSection();
			case ConsolPackage.EARS_SECTION:
				return createEarsSection();
			case ConsolPackage.NOSE_SECTION:
				return createNoseSection();
			case ConsolPackage.MOUTH_THROAT_TEETH_SECTION:
				return createMouthThroatTeethSection();
			case ConsolPackage.NECK_SECTION:
				return createNeckSection();
			case ConsolPackage.ENDOCRINE_SYSTEM_SECTION:
				return createEndocrineSystemSection();
			case ConsolPackage.THORAX_LUNGS_SECTION:
				return createThoraxLungsSection();
			case ConsolPackage.CHEST_WALL_SECTION:
				return createChestWallSection();
			case ConsolPackage.BREAST_SECTION:
				return createBreastSection();
			case ConsolPackage.HEART_SECTION:
				return createHeartSection();
			case ConsolPackage.RESPIRATORY_SYSTEM_SECTION:
				return createRespiratorySystemSection();
			case ConsolPackage.ABDOMEN_SECTION:
				return createAbdomenSection();
			case ConsolPackage.LYMPHATIC_SECTION:
				return createLymphaticSection();
			case ConsolPackage.VESSELS_SECTION:
				return createVesselsSection();
			case ConsolPackage.MUSCULOSKELETAL_SYSTEM_SECTION:
				return createMusculoskeletalSystemSection();
			case ConsolPackage.NEUROLOGIC_SYSTEM_SECTION:
				return createNeurologicSystemSection();
			case ConsolPackage.GENITALIA_SECTION:
				return createGenitaliaSection();
			case ConsolPackage.RECTUM_SECTION:
				return createRectumSection();
			case ConsolPackage.EXTREMITIES_SECTION:
				return createExtremitiesSection();
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION:
				return createReviewOfSystemsSection();
			case ConsolPackage.HOSPITAL_COURSE_SECTION:
				return createHospitalCourseSection();
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION:
				return createAssessmentAndPlanSection();
			case ConsolPackage.LANGUAGE_SPOKEN:
				return createLanguageSpoken();
			case ConsolPackage.HEALTHCARE_PROVIDER:
				return createHealthcareProvider();
			case ConsolPackage.MEDICATION_NORMAL_DOSE:
				return createMedicationNormalDose();
			case ConsolPackage.MEDICATION_SPLIT_DOSE:
				return createMedicationSplitDose();
			case ConsolPackage.MEDICATION_TAPERED_DOSE:
				return createMedicationTaperedDose();
			case ConsolPackage.MEDICATION_CONDITIONAL_DOSE:
				return createMedicationConditionalDose();
			case ConsolPackage.MEDICATION_COMBINATION_MEDICATION:
				return createMedicationCombinationMedication();
			case ConsolPackage.SUPPORT_PARTICIPANT:
				return createSupportParticipant();
			case ConsolPackage.UNSTRUCTURED_DOCUMENT:
				return createUnstructuredDocument();
			case ConsolPackage.SCAN_ORIGINAL_AUTHOR:
				return createScanOriginalAuthor();
			case ConsolPackage.SCANNING_DEVICE:
				return createScanningDevice();
			case ConsolPackage.SCAN_DATA_ENTERER:
				return createScanDataEnterer();
			case ConsolPackage.MEDICATION_INFORMATION:
				return createMedicationInformation();
			case ConsolPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT:
				return createUnstructuredOrScannedDocument();
			case ConsolPackage.REFERRAL_SUMMARY:
				return createReferralSummary();
			case ConsolPackage.DISCHARGE_SUMMARY:
				return createDischargeSummary();
			case ConsolPackage.DISCHARGE_DIET:
				return createDischargeDiet();
			case ConsolPackage.HISTORY_AND_PHYSICAL:
				return createHistoryAndPhysical();
			case ConsolPackage.IHE_HISTORY_OF_PRESENT_ILLNESS:
				return createIHEHistoryOfPresentIllness();
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION_IHE:
				return createReviewOfSystemsSectionIHE();
			case ConsolPackage.CCD_VITAL_SIGNS_SECTION:
				return createCCDVitalSignsSection();
			case ConsolPackage.GENERAL_STATUS_SECTION:
				return createGeneralStatusSection();
			case ConsolPackage.DIAGNOSTIC_FINDINGS:
				return createDiagnosticFindings();
			case ConsolPackage.CONSULTATION_NOTE:
				return createConsultationNote();
			case ConsolPackage.PAST_MEDICAL_HISTORY_SECTION_CONSULT:
				return createPastMedicalHistorySectionConsult();
			case ConsolPackage.REASON_FOR_VISIT_SECTION_CONSULT:
				return createReasonForVisitSectionConsult();
			case ConsolPackage.LEVEL_ONE_CONFORMANCE:
				return createLevelOneConformance();
			case ConsolPackage.LEVEL_TWO_CONFORMANCE:
				return createLevelTwoConformance();
			case ConsolPackage.LEVEL_THREE_CONFORMANCE:
				return createLevelThreeConformance();
			case ConsolPackage.ASSESSMENT_SECTION:
				return createAssessmentSection();
			case ConsolPackage.PLAN_SECTION:
				return createPlanSection();
			case ConsolPackage.REASON_FOR_VISIT_SECTION:
				return createReasonForVisitSection();
			case ConsolPackage.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION:
				return createReasonForVisitAndChiefComplaintSection();
			case ConsolPackage.PROGRESS_NOTE:
				return createProgressNote();
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION_PROC_NOTE:
				return createAssessmentAndPlanSectionProcNote();
			case ConsolPackage.ASSESSMENT_SECTION_PROC_NOTE:
				return createAssessmentSectionProcNote();
			case ConsolPackage.CHIEF_COMPLAINT_SECTION_PROC_NOTE:
				return createChiefComplaintSectionProcNote();
			case ConsolPackage.OBJECTIVE_SECTION:
				return createObjectiveSection();
			case ConsolPackage.SUBJECTIVE_SECTION:
				return createSubjectiveSection();
			case ConsolPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION:
				return createHospitalDischargeStudiesSummarySection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyDrugSensitivity createAllergyDrugSensitivity() {
		AllergyDrugSensitivityImpl allergyDrugSensitivity = new AllergyDrugSensitivityImpl();
		return allergyDrugSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntryReactionObservationContainer createProblemEntryReactionObservationContainer() {
		ProblemEntryReactionObservationContainerImpl problemEntryReactionObservationContainer = new ProblemEntryReactionObservationContainerImpl();
		return problemEntryReactionObservationContainer;
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
	public Severity createSeverity() {
		SeverityImpl severity = new SeverityImpl();
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation createProblemStatusObservation() {
		ProblemStatusObservationImpl problemStatusObservation = new ProblemStatusObservationImpl();
		return problemStatusObservation;
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
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationOrderInformation createMedicationOrderInformation() {
		MedicationOrderInformationImpl medicationOrderInformation = new MedicationOrderInformationImpl();
		return medicationOrderInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatusObservation createMedicationStatusObservation() {
		MedicationStatusObservationImpl medicationStatusObservation = new MedicationStatusObservationImpl();
		return medicationStatusObservation;
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
	public MedicationFullfillmentInstructions createMedicationFullfillmentInstructions() {
		MedicationFullfillmentInstructionsImpl medicationFullfillmentInstructions = new MedicationFullfillmentInstructionsImpl();
		return medicationFullfillmentInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientMedicalInstructions createPatientMedicalInstructions() {
		PatientMedicalInstructionsImpl patientMedicalInstructions = new PatientMedicalInstructionsImpl();
		return patientMedicalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry createConditionEntry() {
		ConditionEntryImpl conditionEntry = new ConditionEntryImpl();
		return conditionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseOfDeathObservation createCauseOfDeathObservation() {
		CauseOfDeathObservationImpl causeOfDeathObservation = new CauseOfDeathObservationImpl();
		return causeOfDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientSummary createPatientSummary() {
		PatientSummaryImpl patientSummary = new PatientSummaryImpl();
		return patientSummary;
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
	public AdvanceDirective createAdvanceDirective() {
		AdvanceDirectiveImpl advanceDirective = new AdvanceDirectiveImpl();
		return advanceDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation() {
		AdvanceDirectiveStatusObservationImpl advanceDirectiveStatusObservation = new AdvanceDirectiveStatusObservationImpl();
		return advanceDirectiveStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesReactionsSection createAllergiesReactionsSection() {
		AllergiesReactionsSectionImpl allergiesReactionsSection = new AllergiesReactionsSectionImpl();
		return allergiesReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection createProblemListSection() {
		ProblemListSectionImpl problemListSection = new ProblemListSectionImpl();
		return problemListSection;
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
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersActivity createEncountersActivity() {
		EncountersActivityImpl encountersActivity = new EncountersActivityImpl();
		return encountersActivity;
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
	public Immunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
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
	public InsuranceProvider createInsuranceProvider() {
		InsuranceProviderImpl insuranceProvider = new InsuranceProviderImpl();
		return insuranceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerEntry createPayerEntry() {
		PayerEntryImpl payerEntry = new PayerEntryImpl();
		return payerEntry;
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
	public PlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
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
	public PregnancyHistorySection createPregnancyHistorySection() {
		PregnancyHistorySectionImpl pregnancyHistorySection = new PregnancyHistorySectionImpl();
		return pregnancyHistorySection;
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
	public SurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEntryProcedureActivityProcedure createProcedureEntryProcedureActivityProcedure() {
		ProcedureEntryProcedureActivityProcedureImpl procedureEntryProcedureActivityProcedure = new ProcedureEntryProcedureActivityProcedureImpl();
		return procedureEntryProcedureActivityProcedure;
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
	public VitalSign createVitalSign() {
		VitalSignImpl vitalSign = new VitalSignImpl();
		return vitalSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticResultsSection createDiagnosticResultsSection() {
		DiagnosticResultsSectionImpl diagnosticResultsSection = new DiagnosticResultsSectionImpl();
		return diagnosticResultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
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
	public FamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistory createFamilyHistory() {
		FamilyHistoryImpl familyHistory = new FamilyHistoryImpl();
		return familyHistory;
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
	public SocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistory createSocialHistory() {
		SocialHistoryImpl socialHistory = new SocialHistoryImpl();
		return socialHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistoryStatusObservation createSocialHistoryStatusObservation() {
		SocialHistoryStatusObservationImpl socialHistoryStatusObservation = new SocialHistoryStatusObservationImpl();
		return socialHistoryStatusObservation;
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
	public PurposeSection createPurposeSection() {
		PurposeSectionImpl purposeSection = new PurposeSectionImpl();
		return purposeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeActivity createPurposeActivity() {
		PurposeActivityImpl purposeActivity = new PurposeActivityImpl();
		return purposeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveVerification createAdvanceDirectiveVerification() {
		AdvanceDirectiveVerificationImpl advanceDirectiveVerification = new AdvanceDirectiveVerificationImpl();
		return advanceDirectiveVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveReference createAdvanceDirectiveReference() {
		AdvanceDirectiveReferenceImpl advanceDirectiveReference = new AdvanceDirectiveReferenceImpl();
		return advanceDirectiveReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerEntity createPayerEntity() {
		PayerEntityImpl payerEntity = new PayerEntityImpl();
		return payerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoveredParty createCoveredParty() {
		CoveredPartyImpl coveredParty = new CoveredPartyImpl();
		return coveredParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicySubscriber createPolicySubscriber() {
		PolicySubscriberImpl policySubscriber = new PolicySubscriberImpl();
		return policySubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportGuardian createSupportGuardian() {
		SupportGuardianImpl supportGuardian = new SupportGuardianImpl();
		return supportGuardian;
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
	public HistoryOfPresentIllness createHistoryOfPresentIllness() {
		HistoryOfPresentIllnessImpl historyOfPresentIllness = new HistoryOfPresentIllnessImpl();
		return historyOfPresentIllness;
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
	public DischargeDiagnosisSection createDischargeDiagnosisSection() {
		DischargeDiagnosisSectionImpl dischargeDiagnosisSection = new DischargeDiagnosisSectionImpl();
		return dischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmissionMedicationHistorySection createAdmissionMedicationHistorySection() {
		AdmissionMedicationHistorySectionImpl admissionMedicationHistorySection = new AdmissionMedicationHistorySectionImpl();
		return admissionMedicationHistorySection;
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
	public GeneralAppearanceSection createGeneralAppearanceSection() {
		GeneralAppearanceSectionImpl generalAppearanceSection = new GeneralAppearanceSectionImpl();
		return generalAppearanceSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleImplantedMedicalDevicesSection createVisibleImplantedMedicalDevicesSection() {
		VisibleImplantedMedicalDevicesSectionImpl visibleImplantedMedicalDevicesSection = new VisibleImplantedMedicalDevicesSectionImpl();
		return visibleImplantedMedicalDevicesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegumentarySystemSection createIntegumentarySystemSection() {
		IntegumentarySystemSectionImpl integumentarySystemSection = new IntegumentarySystemSectionImpl();
		return integumentarySystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadSection createHeadSection() {
		HeadSectionImpl headSection = new HeadSectionImpl();
		return headSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyesSection createEyesSection() {
		EyesSectionImpl eyesSection = new EyesSectionImpl();
		return eyesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarsNoseMouthThroatSection createEarsNoseMouthThroatSection() {
		EarsNoseMouthThroatSectionImpl earsNoseMouthThroatSection = new EarsNoseMouthThroatSectionImpl();
		return earsNoseMouthThroatSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarsSection createEarsSection() {
		EarsSectionImpl earsSection = new EarsSectionImpl();
		return earsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoseSection createNoseSection() {
		NoseSectionImpl noseSection = new NoseSectionImpl();
		return noseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MouthThroatTeethSection createMouthThroatTeethSection() {
		MouthThroatTeethSectionImpl mouthThroatTeethSection = new MouthThroatTeethSectionImpl();
		return mouthThroatTeethSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeckSection createNeckSection() {
		NeckSectionImpl neckSection = new NeckSectionImpl();
		return neckSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndocrineSystemSection createEndocrineSystemSection() {
		EndocrineSystemSectionImpl endocrineSystemSection = new EndocrineSystemSectionImpl();
		return endocrineSystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoraxLungsSection createThoraxLungsSection() {
		ThoraxLungsSectionImpl thoraxLungsSection = new ThoraxLungsSectionImpl();
		return thoraxLungsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChestWallSection createChestWallSection() {
		ChestWallSectionImpl chestWallSection = new ChestWallSectionImpl();
		return chestWallSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastSection createBreastSection() {
		BreastSectionImpl breastSection = new BreastSectionImpl();
		return breastSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeartSection createHeartSection() {
		HeartSectionImpl heartSection = new HeartSectionImpl();
		return heartSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespiratorySystemSection createRespiratorySystemSection() {
		RespiratorySystemSectionImpl respiratorySystemSection = new RespiratorySystemSectionImpl();
		return respiratorySystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbdomenSection createAbdomenSection() {
		AbdomenSectionImpl abdomenSection = new AbdomenSectionImpl();
		return abdomenSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LymphaticSection createLymphaticSection() {
		LymphaticSectionImpl lymphaticSection = new LymphaticSectionImpl();
		return lymphaticSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VesselsSection createVesselsSection() {
		VesselsSectionImpl vesselsSection = new VesselsSectionImpl();
		return vesselsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusculoskeletalSystemSection createMusculoskeletalSystemSection() {
		MusculoskeletalSystemSectionImpl musculoskeletalSystemSection = new MusculoskeletalSystemSectionImpl();
		return musculoskeletalSystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurologicSystemSection createNeurologicSystemSection() {
		NeurologicSystemSectionImpl neurologicSystemSection = new NeurologicSystemSectionImpl();
		return neurologicSystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenitaliaSection createGenitaliaSection() {
		GenitaliaSectionImpl genitaliaSection = new GenitaliaSectionImpl();
		return genitaliaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectumSection createRectumSection() {
		RectumSectionImpl rectumSection = new RectumSectionImpl();
		return rectumSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtremitiesSection createExtremitiesSection() {
		ExtremitiesSectionImpl extremitiesSection = new ExtremitiesSectionImpl();
		return extremitiesSection;
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
	public LanguageSpoken createLanguageSpoken() {
		LanguageSpokenImpl languageSpoken = new LanguageSpokenImpl();
		return languageSpoken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareProvider createHealthcareProvider() {
		HealthcareProviderImpl healthcareProvider = new HealthcareProviderImpl();
		return healthcareProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationNormalDose createMedicationNormalDose() {
		MedicationNormalDoseImpl medicationNormalDose = new MedicationNormalDoseImpl();
		return medicationNormalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationSplitDose createMedicationSplitDose() {
		MedicationSplitDoseImpl medicationSplitDose = new MedicationSplitDoseImpl();
		return medicationSplitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationTaperedDose createMedicationTaperedDose() {
		MedicationTaperedDoseImpl medicationTaperedDose = new MedicationTaperedDoseImpl();
		return medicationTaperedDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationConditionalDose createMedicationConditionalDose() {
		MedicationConditionalDoseImpl medicationConditionalDose = new MedicationConditionalDoseImpl();
		return medicationConditionalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationCombinationMedication createMedicationCombinationMedication() {
		MedicationCombinationMedicationImpl medicationCombinationMedication = new MedicationCombinationMedicationImpl();
		return medicationCombinationMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportParticipant createSupportParticipant() {
		SupportParticipantImpl supportParticipant = new SupportParticipantImpl();
		return supportParticipant;
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
	public ScanOriginalAuthor createScanOriginalAuthor() {
		ScanOriginalAuthorImpl scanOriginalAuthor = new ScanOriginalAuthorImpl();
		return scanOriginalAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningDevice createScanningDevice() {
		ScanningDeviceImpl scanningDevice = new ScanningDeviceImpl();
		return scanningDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanDataEnterer createScanDataEnterer() {
		ScanDataEntererImpl scanDataEnterer = new ScanDataEntererImpl();
		return scanDataEnterer;
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
	public UnstructuredOrScannedDocument createUnstructuredOrScannedDocument() {
		UnstructuredOrScannedDocumentImpl unstructuredOrScannedDocument = new UnstructuredOrScannedDocumentImpl();
		return unstructuredOrScannedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralSummary createReferralSummary() {
		ReferralSummaryImpl referralSummary = new ReferralSummaryImpl();
		return referralSummary;
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
	public DischargeDiet createDischargeDiet() {
		DischargeDietImpl dischargeDiet = new DischargeDietImpl();
		return dischargeDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysical createHistoryAndPhysical() {
		HistoryAndPhysicalImpl historyAndPhysical = new HistoryAndPhysicalImpl();
		return historyAndPhysical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEHistoryOfPresentIllness createIHEHistoryOfPresentIllness() {
		IHEHistoryOfPresentIllnessImpl iheHistoryOfPresentIllness = new IHEHistoryOfPresentIllnessImpl();
		return iheHistoryOfPresentIllness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSectionIHE createReviewOfSystemsSectionIHE() {
		ReviewOfSystemsSectionIHEImpl reviewOfSystemsSectionIHE = new ReviewOfSystemsSectionIHEImpl();
		return reviewOfSystemsSectionIHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDVitalSignsSection createCCDVitalSignsSection() {
		CCDVitalSignsSectionImpl ccdVitalSignsSection = new CCDVitalSignsSectionImpl();
		return ccdVitalSignsSection;
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
	public DiagnosticFindings createDiagnosticFindings() {
		DiagnosticFindingsImpl diagnosticFindings = new DiagnosticFindingsImpl();
		return diagnosticFindings;
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
	public PastMedicalHistorySectionConsult createPastMedicalHistorySectionConsult() {
		PastMedicalHistorySectionConsultImpl pastMedicalHistorySectionConsult = new PastMedicalHistorySectionConsultImpl();
		return pastMedicalHistorySectionConsult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSectionConsult createReasonForVisitSectionConsult() {
		ReasonForVisitSectionConsultImpl reasonForVisitSectionConsult = new ReasonForVisitSectionConsultImpl();
		return reasonForVisitSectionConsult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOneConformance createLevelOneConformance() {
		LevelOneConformanceImpl levelOneConformance = new LevelOneConformanceImpl();
		return levelOneConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelTwoConformance createLevelTwoConformance() {
		LevelTwoConformanceImpl levelTwoConformance = new LevelTwoConformanceImpl();
		return levelTwoConformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelThreeConformance createLevelThreeConformance() {
		LevelThreeConformanceImpl levelThreeConformance = new LevelThreeConformanceImpl();
		return levelThreeConformance;
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
	public PlanSection createPlanSection() {
		PlanSectionImpl planSection = new PlanSectionImpl();
		return planSection;
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
	public ReasonForVisitAndChiefComplaintSection createReasonForVisitAndChiefComplaintSection() {
		ReasonForVisitAndChiefComplaintSectionImpl reasonForVisitAndChiefComplaintSection = new ReasonForVisitAndChiefComplaintSectionImpl();
		return reasonForVisitAndChiefComplaintSection;
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
	public AssessmentAndPlanSectionProcNote createAssessmentAndPlanSectionProcNote() {
		AssessmentAndPlanSectionProcNoteImpl assessmentAndPlanSectionProcNote = new AssessmentAndPlanSectionProcNoteImpl();
		return assessmentAndPlanSectionProcNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSectionProcNote createAssessmentSectionProcNote() {
		AssessmentSectionProcNoteImpl assessmentSectionProcNote = new AssessmentSectionProcNoteImpl();
		return assessmentSectionProcNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSectionProcNote createChiefComplaintSectionProcNote() {
		ChiefComplaintSectionProcNoteImpl chiefComplaintSectionProcNote = new ChiefComplaintSectionProcNoteImpl();
		return chiefComplaintSectionProcNote;
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
	public SubjectiveSection createSubjectiveSection() {
		SubjectiveSectionImpl subjectiveSection = new SubjectiveSectionImpl();
		return subjectiveSection;
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
