/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements IDomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDomainFactory init() {
		try {
			IDomainFactory theDomainFactory = (IDomainFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp/domain");
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
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
			case IDomainPackage.ALLERGY_DRUG_SENSITIVITY:
				return (EObject) createAllergyDrugSensitivity();
			case IDomainPackage.EPISODE_OBSERVATION:
				return (EObject) createEpisodeObservation();
			case IDomainPackage.ALLERGY_INTOLERANCE:
				return (EObject) createAllergyIntolerance();
			case IDomainPackage.PROBLEM_ENTRY:
				return (EObject) createProblemEntry();
			case IDomainPackage.AGE_OBSERVATION:
				return (EObject) createAgeObservation();
			case IDomainPackage.SEVERITY:
				return (EObject) createSeverity();
			case IDomainPackage.PROBLEM_STATUS_OBSERVATION:
				return (EObject) createProblemStatusObservation();
			case IDomainPackage.STATUS_OBSERVATION:
				return (EObject) createStatusObservation();
			case IDomainPackage.HEALTH_STATUS_OBSERVATION:
				return (EObject) createHealthStatusObservation();
			case IDomainPackage.COMMENT:
				return (EObject) createComment();
			case IDomainPackage.CAUSE_OF_DEATH_OBSERVATION:
				return (EObject) createCauseOfDeathObservation();
			case IDomainPackage.FAMILY_HISTORY_OBSERVATION:
				return (EObject) createFamilyHistoryObservation();
			case IDomainPackage.SIMPLE_OBSERVATION:
				return (EObject) createSimpleObservation();
			case IDomainPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER:
				return (EObject) createProblemEntryReactionObservationContainer();
			case IDomainPackage.MEDICATION:
				return (EObject) createMedication();
			case IDomainPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return (EObject) createMedicationSeriesNumberObservation();
			case IDomainPackage.MEDICATION_STATUS_OBSERVATION:
				return (EObject) createMedicationStatusObservation();
			case IDomainPackage.REACTION_OBSERVATION:
				return (EObject) createReactionObservation();
			case IDomainPackage.SEVERITY_OBSERVATION:
				return (EObject) createSeverityObservation();
			case IDomainPackage.PRODUCT_INSTANCE:
				return (EObject) createProductInstance();
			case IDomainPackage.INTERNAL_REFERENCE:
				return (EObject) createInternalReference();
			case IDomainPackage.PATIENT_MEDICAL_INSTRUCTIONS:
				return (EObject) createPatientMedicalInstructions();
			case IDomainPackage.MEDICATION_TYPE:
				return (EObject) createMedicationType();
			case IDomainPackage.MEDICATION_ORDER_INFORMATION:
				return (EObject) createMedicationOrderInformation();
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return (EObject) createMedicationFullfillmentInstructions();
			case IDomainPackage.CONDITION:
				return (EObject) createCondition();
			case IDomainPackage.PATIENT_SUMMARY:
				return (EObject) createPatientSummary();
			case IDomainPackage.FAMILY_HISTORY_SECTION:
				return (EObject) createFamilyHistorySection();
			case IDomainPackage.FAMILY_HISTORY:
				return (EObject) createFamilyHistory();
			case IDomainPackage.FAMILY_HISTORY_ORGANIZER:
				return (EObject) createFamilyHistoryOrganizer();
			case IDomainPackage.SOCIAL_HISTORY_SECTION:
				return (EObject) createSocialHistorySection();
			case IDomainPackage.SOCIAL_HISTORY:
				return (EObject) createSocialHistory();
			case IDomainPackage.SOCIAL_HISTORY_STATUS_OBSERVATION:
				return (EObject) createSocialHistoryStatusObservation();
			case IDomainPackage.SOCIAL_HISTORY_OBSERVATION:
				return (EObject) createSocialHistoryObservation();
			case IDomainPackage.RESULTS_SECTION:
				return (EObject) createResultsSection();
			case IDomainPackage.RESULT_ORGANIZER:
				return (EObject) createResultOrganizer();
			case IDomainPackage.RESULT:
				return (EObject) createResult();
			case IDomainPackage.RESULT_OBSERVATION:
				return (EObject) createResultObservation();
			case IDomainPackage.MEDICAL_EQUIPMENT_SECTION:
				return (EObject) createMedicalEquipmentSection();
			case IDomainPackage.SUPPLY_ACTIVITY:
				return (EObject) createSupplyActivity();
			case IDomainPackage.FULFILLMENT_INSTRUCTION:
				return (EObject) createFulfillmentInstruction();
			case IDomainPackage.MEDICATION_ACTIVITY:
				return (EObject) createMedicationActivity();
			case IDomainPackage.PATIENT_INSTRUCTION:
				return (EObject) createPatientInstruction();
			case IDomainPackage.FUNCTIONAL_STATUS_SECTION:
				return (EObject) createFunctionalStatusSection();
			case IDomainPackage.PURPOSE_SECTION:
				return (EObject) createPurposeSection();
			case IDomainPackage.PURPOSE_ACTIVITY:
				return (EObject) createPurposeActivity();
			case IDomainPackage.ADVANCE_DIRECTIVES_SECTION:
				return (EObject) createAdvanceDirectivesSection();
			case IDomainPackage.ADVANCE_DIRECTIVE:
				return (EObject) createAdvanceDirective();
			case IDomainPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return (EObject) createAdvanceDirectiveVerification();
			case IDomainPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return (EObject) createAdvanceDirectiveStatusObservation();
			case IDomainPackage.ADVANCE_DIRECTIVE_REFERENCE:
				return (EObject) createAdvanceDirectiveReference();
			case IDomainPackage.ALLERGIES_REACTIONS_SECTION:
				return (EObject) createAllergiesReactionsSection();
			case IDomainPackage.PROBLEM_LIST_SECTION:
				return (EObject) createProblemListSection();
			case IDomainPackage.ENCOUNTERS_SECTION:
				return (EObject) createEncountersSection();
			case IDomainPackage.ENCOUNTERS_ACTIVITY:
				return (EObject) createEncountersActivity();
			case IDomainPackage.ENCOUNTER_LOCATION:
				return (EObject) createEncounterLocation();
			case IDomainPackage.ENCOUNTER:
				return (EObject) createEncounter();
			case IDomainPackage.IMMUNIZATIONS_SECTION:
				return (EObject) createImmunizationsSection();
			case IDomainPackage.IMMUNIZATION:
				return (EObject) createImmunization();
			case IDomainPackage.PAYERS_SECTION:
				return (EObject) createPayersSection();
			case IDomainPackage.INSURANCE_PROVIDER:
				return (EObject) createInsuranceProvider();
			case IDomainPackage.PAYER_ENTRY:
				return (EObject) createPayerEntry();
			case IDomainPackage.PAYER_ENTITY:
				return (EObject) createPayerEntity();
			case IDomainPackage.COVERED_PARTY:
				return (EObject) createCoveredParty();
			case IDomainPackage.POLICY_SUBSCRIBER:
				return (EObject) createPolicySubscriber();
			case IDomainPackage.MEDICATIONS_SECTION:
				return (EObject) createMedicationsSection();
			case IDomainPackage.PLAN_OF_CARE_SECTION:
				return (EObject) createPlanOfCareSection();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_ACT:
				return (EObject) createPlanOfCareActivityAct();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY:
				return (EObject) createPlanOfCareActivity();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER:
				return (EObject) createPlanOfCareActivityEncounter();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION:
				return (EObject) createPlanOfCareActivityObservation();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return (EObject) createPlanOfCareActivityProcedure();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return (EObject) createPlanOfCareActivitySubstanceAdministration();
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY:
				return (EObject) createPlanOfCareActivitySupply();
			case IDomainPackage.PROCEDURE:
				return (EObject) createProcedure();
			case IDomainPackage.PREGNANCY_HISTORY_SECTION:
				return (EObject) createPregnancyHistorySection();
			case IDomainPackage.PREGNANCY_OBSERVATION:
				return (EObject) createPregnancyObservation();
			case IDomainPackage.SURGERIES_SECTION:
				return (EObject) createSurgeriesSection();
			case IDomainPackage.EXTERNAL_REFERENCE:
				return (EObject) createExternalReference();
			case IDomainPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE:
				return (EObject) createProcedureEntryProcedureActivityProcedure();
			case IDomainPackage.PROCEDURE_ENTRY:
				return (EObject) createProcedureEntry();
			case IDomainPackage.SUPPORT:
				return (EObject) createSupport();
			case IDomainPackage.VITAL_SIGNS_SECTION:
				return (EObject) createVitalSignsSection();
			case IDomainPackage.VITAL_SIGNS_ORGANIZER:
				return (EObject) createVitalSignsOrganizer();
			case IDomainPackage.VITAL_SIGN_OBSERVATION:
				return (EObject) createVitalSignObservation();
			case IDomainPackage.DIAGNOSTIC_RESULTS_SECTION:
				return (EObject) createDiagnosticResultsSection();
			case IDomainPackage.VITAL_SIGN:
				return (EObject) createVitalSign();
			case IDomainPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return (EObject) createHistoryOfPastIllnessSection();
			case IDomainPackage.CHIEF_COMPLAINT_SECTION:
				return (EObject) createChiefComplaintSection();
			case IDomainPackage.REASON_FOR_REFERRAL_SECTION:
				return (EObject) createReasonForReferralSection();
			case IDomainPackage.HISTORY_OF_PRESENT_ILLNESS:
				return (EObject) createHistoryOfPresentIllness();
			case IDomainPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return (EObject) createHospitalAdmissionDiagnosisSection();
			case IDomainPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return (EObject) createDischargeDiagnosisSection();
			case IDomainPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return (EObject) createAdmissionMedicationHistorySection();
			case IDomainPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return (EObject) createHospitalDischargeMedicationsSection();
			case IDomainPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return (EObject) createMedicationsAdministeredSection();
			case IDomainPackage.PHYSICAL_EXAM_SECTION:
				return (EObject) createPhysicalExamSection();
			case IDomainPackage.GENERAL_APPEARANCE_SECTION:
				return (EObject) createGeneralAppearanceSection();
			case IDomainPackage.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION:
				return (EObject) createVisibleImplantedMedicalDevicesSection();
			case IDomainPackage.INTEGUMENTARY_SYSTEM_SECTION:
				return (EObject) createIntegumentarySystemSection();
			case IDomainPackage.HEAD_SECTION:
				return (EObject) createHeadSection();
			case IDomainPackage.EYES_SECTION:
				return (EObject) createEyesSection();
			case IDomainPackage.EARS_NOSE_MOUTH_THROAT_SECTION:
				return (EObject) createEarsNoseMouthThroatSection();
			case IDomainPackage.EARS_SECTION:
				return (EObject) createEarsSection();
			case IDomainPackage.NOSE_SECTION:
				return (EObject) createNoseSection();
			case IDomainPackage.MOUTH_THROAT_TEETH_SECTION:
				return (EObject) createMouthThroatTeethSection();
			case IDomainPackage.NECK_SECTION:
				return (EObject) createNeckSection();
			case IDomainPackage.ENDOCRINE_SYSTEM_SECTION:
				return (EObject) createEndocrineSystemSection();
			case IDomainPackage.THORAX_LUNGS_SECTION:
				return (EObject) createThoraxLungsSection();
			case IDomainPackage.CHEST_WALL_SECTION:
				return (EObject) createChestWallSection();
			case IDomainPackage.BREAST_SECTION:
				return (EObject) createBreastSection();
			case IDomainPackage.HEART_SECTION:
				return (EObject) createHeartSection();
			case IDomainPackage.RESPIRATORY_SYSTEM_SECTION:
				return (EObject) createRespiratorySystemSection();
			case IDomainPackage.ABDOMEN_SECTION:
				return (EObject) createAbdomenSection();
			case IDomainPackage.LYMPHATIC_SECTION:
				return (EObject) createLymphaticSection();
			case IDomainPackage.VESSELS_SECTION:
				return (EObject) createVesselsSection();
			case IDomainPackage.MUSCULOSKELETAL_SYSTEM_SECTION:
				return (EObject) createMusculoskeletalSystemSection();
			case IDomainPackage.NEUROLOGIC_SYSTEM_SECTION:
				return (EObject) createNeurologicSystemSection();
			case IDomainPackage.GENITALIA_SECTION:
				return (EObject) createGenitaliaSection();
			case IDomainPackage.RECTUM_SECTION:
				return (EObject) createRectumSection();
			case IDomainPackage.EXTREMITIES_SECTION:
				return (EObject) createExtremitiesSection();
			case IDomainPackage.REVIEW_OF_SYSTEMS_SECTION:
				return (EObject) createReviewOfSystemsSection();
			case IDomainPackage.HOSPITAL_COURSE_SECTION:
				return (EObject) createHospitalCourseSection();
			case IDomainPackage.ASSESSMENT_AND_PLAN_SECTION:
				return (EObject) createAssessmentAndPlanSection();
			case IDomainPackage.LANGUAGE_SPOKEN:
				return (EObject) createLanguageSpoken();
			case IDomainPackage.HEALTHCARE_PROVIDER:
				return (EObject) createHealthcareProvider();
			case IDomainPackage.MEDICATION_NORMAL_DOSE:
				return (EObject) createMedicationNormalDose();
			case IDomainPackage.MEDICATION_SPLIT_DOSE:
				return (EObject) createMedicationSplitDose();
			case IDomainPackage.MEDICATION_TAPERED_DOSE:
				return (EObject) createMedicationTaperedDose();
			case IDomainPackage.MEDICATION_CONDITIONAL_DOSE:
				return (EObject) createMedicationConditionalDose();
			case IDomainPackage.MEDICATION_COMBINATION_MEDICATION:
				return (EObject) createMedicationCombinationMedication();
			case IDomainPackage.SUPPORT_GUARDIAN:
				return (EObject) createSupportGuardian();
			case IDomainPackage.SUPPORT_PARTICIPANT:
				return (EObject) createSupportParticipant();
			case IDomainPackage.UNSTRUCTURED_DOCUMENT:
				return (EObject) createUnstructuredDocument();
			case IDomainPackage.SCAN_ORIGINAL_AUTHOR:
				return (EObject) createScanOriginalAuthor();
			case IDomainPackage.SCANNING_DEVICE:
				return (EObject) createScanningDevice();
			case IDomainPackage.SCAN_DATA_ENTERER:
				return (EObject) createScanDataEnterer();
			case IDomainPackage.MEDICATION_INFORMATION:
				return (EObject) createMedicationInformation();
			case IDomainPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT:
				return (EObject) createUnstructuredOrScannedDocument();
			case IDomainPackage.REFERRAL_SUMMARY:
				return (EObject) createReferralSummary();
			case IDomainPackage.DISCHARGE_SUMMARY:
				return (EObject) createDischargeSummary();
			case IDomainPackage.DISCHARGE_DIET:
				return (EObject) createDischargeDiet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyDrugSensitivity createAllergyDrugSensitivity() {
		AllergyDrugSensitivityImpl allergyDrugSensitivity = new AllergyDrugSensitivityImpl();
		return allergyDrugSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyIntolerance createAllergyIntolerance() {
		AllergyIntoleranceImpl allergyIntolerance = new AllergyIntoleranceImpl();
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationStatusObservation createMedicationStatusObservation() {
		MedicationStatusObservationImpl medicationStatusObservation = new MedicationStatusObservationImpl();
		return medicationStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReactionObservation createReactionObservation() {
		ReactionObservationImpl reactionObservation = new ReactionObservationImpl();
		return reactionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverityObservation createSeverityObservation() {
		SeverityObservationImpl severityObservation = new SeverityObservationImpl();
		return severityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientMedicalInstructions createPatientMedicalInstructions() {
		PatientMedicalInstructionsImpl patientMedicalInstructions = new PatientMedicalInstructionsImpl();
		return patientMedicalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationOrderInformation createMedicationOrderInformation() {
		MedicationOrderInformationImpl medicationOrderInformation = new MedicationOrderInformationImpl();
		return medicationOrderInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationFullfillmentInstructions createMedicationFullfillmentInstructions() {
		MedicationFullfillmentInstructionsImpl medicationFullfillmentInstructions = new MedicationFullfillmentInstructionsImpl();
		return medicationFullfillmentInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry createProblemEntry() {
		ProblemEntryImpl problemEntry = new ProblemEntryImpl();
		return problemEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation createAgeObservation() {
		AgeObservationImpl ageObservation = new AgeObservationImpl();
		return ageObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity createSeverity() {
		SeverityImpl severity = new SeverityImpl();
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemStatusObservation createProblemStatusObservation() {
		ProblemStatusObservationImpl problemStatusObservation = new ProblemStatusObservationImpl();
		return problemStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatusObservation createStatusObservation() {
		StatusObservationImpl statusObservation = new StatusObservationImpl();
		return statusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthStatusObservation createHealthStatusObservation() {
		HealthStatusObservationImpl healthStatusObservation = new HealthStatusObservationImpl();
		return healthStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientSummary createPatientSummary() {
		PatientSummaryImpl patientSummary = new PatientSummaryImpl();
		return patientSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirective createAdvanceDirective() {
		AdvanceDirectiveImpl advanceDirective = new AdvanceDirectiveImpl();
		return advanceDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveVerification createAdvanceDirectiveVerification() {
		AdvanceDirectiveVerificationImpl advanceDirectiveVerification = new AdvanceDirectiveVerificationImpl();
		return advanceDirectiveVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation() {
		AdvanceDirectiveStatusObservationImpl advanceDirectiveStatusObservation = new AdvanceDirectiveStatusObservationImpl();
		return advanceDirectiveStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectiveReference createAdvanceDirectiveReference() {
		AdvanceDirectiveReferenceImpl advanceDirectiveReference = new AdvanceDirectiveReferenceImpl();
		return advanceDirectiveReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection createAllergiesReactionsSection() {
		AllergiesReactionsSectionImpl allergiesReactionsSection = new AllergiesReactionsSectionImpl();
		return allergiesReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICauseOfDeathObservation createCauseOfDeathObservation() {
		CauseOfDeathObservationImpl causeOfDeathObservation = new CauseOfDeathObservationImpl();
		return causeOfDeathObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistoryObservation createFamilyHistoryObservation() {
		FamilyHistoryObservationImpl familyHistoryObservation = new FamilyHistoryObservationImpl();
		return familyHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISimpleObservation createSimpleObservation() {
		SimpleObservationImpl simpleObservation = new SimpleObservationImpl();
		return simpleObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntryReactionObservationContainer createProblemEntryReactionObservationContainer() {
		ProblemEntryReactionObservationContainerImpl problemEntryReactionObservationContainer = new ProblemEntryReactionObservationContainerImpl();
		return problemEntryReactionObservationContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection createProblemListSection() {
		ProblemListSectionImpl problemListSection = new ProblemListSectionImpl();
		return problemListSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncountersActivity createEncountersActivity() {
		EncountersActivityImpl encountersActivity = new EncountersActivityImpl();
		return encountersActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounterLocation createEncounterLocation() {
		EncounterLocationImpl encounterLocation = new EncounterLocationImpl();
		return encounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayerEntity createPayerEntity() {
		PayerEntityImpl payerEntity = new PayerEntityImpl();
		return payerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICoveredParty createCoveredParty() {
		CoveredPartyImpl coveredParty = new CoveredPartyImpl();
		return coveredParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPolicySubscriber createPolicySubscriber() {
		PolicySubscriberImpl policySubscriber = new PolicySubscriberImpl();
		return policySubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityAct createPlanOfCareActivityAct() {
		PlanOfCareActivityActImpl planOfCareActivityAct = new PlanOfCareActivityActImpl();
		return planOfCareActivityAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivity createPlanOfCareActivity() {
		PlanOfCareActivityImpl planOfCareActivity = new PlanOfCareActivityImpl();
		return planOfCareActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityEncounter createPlanOfCareActivityEncounter() {
		PlanOfCareActivityEncounterImpl planOfCareActivityEncounter = new PlanOfCareActivityEncounterImpl();
		return planOfCareActivityEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityObservation createPlanOfCareActivityObservation() {
		PlanOfCareActivityObservationImpl planOfCareActivityObservation = new PlanOfCareActivityObservationImpl();
		return planOfCareActivityObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivityProcedure createPlanOfCareActivityProcedure() {
		PlanOfCareActivityProcedureImpl planOfCareActivityProcedure = new PlanOfCareActivityProcedureImpl();
		return planOfCareActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration() {
		PlanOfCareActivitySubstanceAdministrationImpl planOfCareActivitySubstanceAdministration = new PlanOfCareActivitySubstanceAdministrationImpl();
		return planOfCareActivitySubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareActivitySupply createPlanOfCareActivitySupply() {
		PlanOfCareActivitySupplyImpl planOfCareActivitySupply = new PlanOfCareActivitySupplyImpl();
		return planOfCareActivitySupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedureEntryProcedureActivityProcedure createProcedureEntryProcedureActivityProcedure() {
		ProcedureEntryProcedureActivityProcedureImpl procedureEntryProcedureActivityProcedure = new ProcedureEntryProcedureActivityProcedureImpl();
		return procedureEntryProcedureActivityProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedureEntry createProcedureEntry() {
		ProcedureEntryImpl procedureEntry = new ProcedureEntryImpl();
		return procedureEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPregnancyHistorySection createPregnancyHistorySection() {
		PregnancyHistorySectionImpl pregnancyHistorySection = new PregnancyHistorySectionImpl();
		return pregnancyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPregnancyObservation createPregnancyObservation() {
		PregnancyObservationImpl pregnancyObservation = new PregnancyObservationImpl();
		return pregnancyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupport createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignObservation createVitalSignObservation() {
		VitalSignObservationImpl vitalSignObservation = new VitalSignObservationImpl();
		return vitalSignObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagnosticResultsSection createDiagnosticResultsSection() {
		DiagnosticResultsSectionImpl diagnosticResultsSection = new DiagnosticResultsSectionImpl();
		return diagnosticResultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResult createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSign createVitalSign() {
		VitalSignImpl vitalSign = new VitalSignImpl();
		return vitalSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPresentIllness createHistoryOfPresentIllness() {
		HistoryOfPresentIllnessImpl historyOfPresentIllness = new HistoryOfPresentIllnessImpl();
		return historyOfPresentIllness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPurposeSection createPurposeSection() {
		PurposeSectionImpl purposeSection = new PurposeSectionImpl();
		return purposeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPurposeActivity createPurposeActivity() {
		PurposeActivityImpl purposeActivity = new PurposeActivityImpl();
		return purposeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection createDischargeDiagnosisSection() {
		DischargeDiagnosisSectionImpl dischargeDiagnosisSection = new DischargeDiagnosisSectionImpl();
		return dischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdmissionMedicationHistorySection createAdmissionMedicationHistorySection() {
		AdmissionMedicationHistorySectionImpl admissionMedicationHistorySection = new AdmissionMedicationHistorySectionImpl();
		return admissionMedicationHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGeneralAppearanceSection createGeneralAppearanceSection() {
		GeneralAppearanceSectionImpl generalAppearanceSection = new GeneralAppearanceSectionImpl();
		return generalAppearanceSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisibleImplantedMedicalDevicesSection createVisibleImplantedMedicalDevicesSection() {
		VisibleImplantedMedicalDevicesSectionImpl visibleImplantedMedicalDevicesSection = new VisibleImplantedMedicalDevicesSectionImpl();
		return visibleImplantedMedicalDevicesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIntegumentarySystemSection createIntegumentarySystemSection() {
		IntegumentarySystemSectionImpl integumentarySystemSection = new IntegumentarySystemSectionImpl();
		return integumentarySystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHeadSection createHeadSection() {
		HeadSectionImpl headSection = new HeadSectionImpl();
		return headSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEyesSection createEyesSection() {
		EyesSectionImpl eyesSection = new EyesSectionImpl();
		return eyesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEarsNoseMouthThroatSection createEarsNoseMouthThroatSection() {
		EarsNoseMouthThroatSectionImpl earsNoseMouthThroatSection = new EarsNoseMouthThroatSectionImpl();
		return earsNoseMouthThroatSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEarsSection createEarsSection() {
		EarsSectionImpl earsSection = new EarsSectionImpl();
		return earsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INoseSection createNoseSection() {
		NoseSectionImpl noseSection = new NoseSectionImpl();
		return noseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMouthThroatTeethSection createMouthThroatTeethSection() {
		MouthThroatTeethSectionImpl mouthThroatTeethSection = new MouthThroatTeethSectionImpl();
		return mouthThroatTeethSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INeckSection createNeckSection() {
		NeckSectionImpl neckSection = new NeckSectionImpl();
		return neckSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEndocrineSystemSection createEndocrineSystemSection() {
		EndocrineSystemSectionImpl endocrineSystemSection = new EndocrineSystemSectionImpl();
		return endocrineSystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IThoraxLungsSection createThoraxLungsSection() {
		ThoraxLungsSectionImpl thoraxLungsSection = new ThoraxLungsSectionImpl();
		return thoraxLungsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChestWallSection createChestWallSection() {
		ChestWallSectionImpl chestWallSection = new ChestWallSectionImpl();
		return chestWallSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBreastSection createBreastSection() {
		BreastSectionImpl breastSection = new BreastSectionImpl();
		return breastSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHeartSection createHeartSection() {
		HeartSectionImpl heartSection = new HeartSectionImpl();
		return heartSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRespiratorySystemSection createRespiratorySystemSection() {
		RespiratorySystemSectionImpl respiratorySystemSection = new RespiratorySystemSectionImpl();
		return respiratorySystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAbdomenSection createAbdomenSection() {
		AbdomenSectionImpl abdomenSection = new AbdomenSectionImpl();
		return abdomenSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILymphaticSection createLymphaticSection() {
		LymphaticSectionImpl lymphaticSection = new LymphaticSectionImpl();
		return lymphaticSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVesselsSection createVesselsSection() {
		VesselsSectionImpl vesselsSection = new VesselsSectionImpl();
		return vesselsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMusculoskeletalSystemSection createMusculoskeletalSystemSection() {
		MusculoskeletalSystemSectionImpl musculoskeletalSystemSection = new MusculoskeletalSystemSectionImpl();
		return musculoskeletalSystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INeurologicSystemSection createNeurologicSystemSection() {
		NeurologicSystemSectionImpl neurologicSystemSection = new NeurologicSystemSectionImpl();
		return neurologicSystemSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGenitaliaSection createGenitaliaSection() {
		GenitaliaSectionImpl genitaliaSection = new GenitaliaSectionImpl();
		return genitaliaSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRectumSection createRectumSection() {
		RectumSectionImpl rectumSection = new RectumSectionImpl();
		return rectumSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExtremitiesSection createExtremitiesSection() {
		ExtremitiesSectionImpl extremitiesSection = new ExtremitiesSectionImpl();
		return extremitiesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalCourseSection createHospitalCourseSection() {
		HospitalCourseSectionImpl hospitalCourseSection = new HospitalCourseSectionImpl();
		return hospitalCourseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistory createSocialHistory() {
		SocialHistoryImpl socialHistory = new SocialHistoryImpl();
		return socialHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistoryStatusObservation createSocialHistoryStatusObservation() {
		SocialHistoryStatusObservationImpl socialHistoryStatusObservation = new SocialHistoryStatusObservationImpl();
		return socialHistoryStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistoryObservation createSocialHistoryObservation() {
		SocialHistoryObservationImpl socialHistoryObservation = new SocialHistoryObservationImpl();
		return socialHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResultsSection createResultsSection() {
		ResultsSectionImpl resultsSection = new ResultsSectionImpl();
		return resultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResultOrganizer createResultOrganizer() {
		ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
		return resultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResultObservation createResultObservation() {
		ResultObservationImpl resultObservation = new ResultObservationImpl();
		return resultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupplyActivity createSupplyActivity() {
		SupplyActivityImpl supplyActivity = new SupplyActivityImpl();
		return supplyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFulfillmentInstruction createFulfillmentInstruction() {
		FulfillmentInstructionImpl fulfillmentInstruction = new FulfillmentInstructionImpl();
		return fulfillmentInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationActivity createMedicationActivity() {
		MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
		return medicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientInstruction createPatientInstruction() {
		PatientInstructionImpl patientInstruction = new PatientInstructionImpl();
		return patientInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILanguageSpoken createLanguageSpoken() {
		LanguageSpokenImpl languageSpoken = new LanguageSpokenImpl();
		return languageSpoken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInsuranceProvider createInsuranceProvider() {
		InsuranceProviderImpl insuranceProvider = new InsuranceProviderImpl();
		return insuranceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayerEntry createPayerEntry() {
		PayerEntryImpl payerEntry = new PayerEntryImpl();
		return payerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthcareProvider createHealthcareProvider() {
		HealthcareProviderImpl healthcareProvider = new HealthcareProviderImpl();
		return healthcareProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationNormalDose createMedicationNormalDose() {
		MedicationNormalDoseImpl medicationNormalDose = new MedicationNormalDoseImpl();
		return medicationNormalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationSplitDose createMedicationSplitDose() {
		MedicationSplitDoseImpl medicationSplitDose = new MedicationSplitDoseImpl();
		return medicationSplitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationTaperedDose createMedicationTaperedDose() {
		MedicationTaperedDoseImpl medicationTaperedDose = new MedicationTaperedDoseImpl();
		return medicationTaperedDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationConditionalDose createMedicationConditionalDose() {
		MedicationConditionalDoseImpl medicationConditionalDose = new MedicationConditionalDoseImpl();
		return medicationConditionalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationCombinationMedication createMedicationCombinationMedication() {
		MedicationCombinationMedicationImpl medicationCombinationMedication = new MedicationCombinationMedicationImpl();
		return medicationCombinationMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupportGuardian createSupportGuardian() {
		SupportGuardianImpl supportGuardian = new SupportGuardianImpl();
		return supportGuardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupportParticipant createSupportParticipant() {
		SupportParticipantImpl supportParticipant = new SupportParticipantImpl();
		return supportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUnstructuredDocument createUnstructuredDocument() {
		UnstructuredDocumentImpl unstructuredDocument = new UnstructuredDocumentImpl();
		return unstructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IScanOriginalAuthor createScanOriginalAuthor() {
		ScanOriginalAuthorImpl scanOriginalAuthor = new ScanOriginalAuthorImpl();
		return scanOriginalAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IScanningDevice createScanningDevice() {
		ScanningDeviceImpl scanningDevice = new ScanningDeviceImpl();
		return scanningDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IScanDataEnterer createScanDataEnterer() {
		ScanDataEntererImpl scanDataEnterer = new ScanDataEntererImpl();
		return scanDataEnterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationInformation createMedicationInformation() {
		MedicationInformationImpl medicationInformation = new MedicationInformationImpl();
		return medicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUnstructuredOrScannedDocument createUnstructuredOrScannedDocument() {
		UnstructuredOrScannedDocumentImpl unstructuredOrScannedDocument = new UnstructuredOrScannedDocumentImpl();
		return unstructuredOrScannedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReferralSummary createReferralSummary() {
		ReferralSummaryImpl referralSummary = new ReferralSummaryImpl();
		return referralSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary createDischargeSummary() {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiet createDischargeDiet() {
		DischargeDietImpl dischargeDiet = new DischargeDietImpl();
		return dischargeDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistory createFamilyHistory() {
		FamilyHistoryImpl familyHistory = new FamilyHistoryImpl();
		return familyHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistoryOrganizer createFamilyHistoryOrganizer() {
		FamilyHistoryOrganizerImpl familyHistoryOrganizer = new FamilyHistoryOrganizerImpl();
		return familyHistoryOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDomainPackage getDomainPackage() {
		return (IDomainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IDomainPackage getPackage() {
		return IDomainPackage.eINSTANCE;
	}

} // DomainFactoryImpl
