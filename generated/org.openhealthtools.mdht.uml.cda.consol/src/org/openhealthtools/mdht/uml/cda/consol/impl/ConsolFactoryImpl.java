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
			case ConsolPackage.MEDICATION_ACTIVITY:
				return createMedicationActivity();
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY:
				return createNonMedicinalSupplyActivity();
			case ConsolPackage.PRODUCT_INSTANCE:
				return createProductInstance();
			case ConsolPackage.INSTRUCTIONS:
				return createInstructions();
			case ConsolPackage.MEDICATION_DISPENSE:
				return createMedicationDispense();
			case ConsolPackage.MEDICATION_SUPPLY_ORDER:
				return createMedicationSupplyOrder();
			case ConsolPackage.DRUG_VEHICLE:
				return createDrugVehicle();
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION:
				return createAllergyStatusObservation();
			case ConsolPackage.EPISODE_OBSERVATION:
				return createEpisodeObservation();
			case ConsolPackage.AGE_OBSERVATION:
				return createAgeObservation();
			case ConsolPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case ConsolPackage.COMMENT:
				return createComment();
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return createMedicationSeriesNumberObservation();
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION:
				return createMedicationStatusObservation();
			case ConsolPackage.INTERNAL_REFERENCE:
				return createInternalReference();
			case ConsolPackage.MEDICATION_TYPE:
				return createMedicationType();
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return createMedicationFullfillmentInstructions();
			case ConsolPackage.PROBLEM_CONCERN_ACT:
				return createProblemConcernAct();
			case ConsolPackage.PROBLEM_OBSERVATION:
				return createProblemObservation();
			case ConsolPackage.PROBLEM_STATUS:
				return createProblemStatus();
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return createContinuityOfCareDocument();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL:
				return createAdvanceDirectivesSectionEntriesOptional();
			case ConsolPackage.ALLERGIES_SECTION:
				return createAllergiesSection();
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL:
				return createAllergiesSectionEntriesOptional();
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL:
				return createEncountersSectionEntriesOptional();
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL:
				return createImmunizationsSectionEntriesOptional();
			case ConsolPackage.PAYERS_SECTION:
				return createPayersSection();
			case ConsolPackage.COVERAGE_ACTIVITY:
				return createCoverageActivity();
			case ConsolPackage.POLICY_ACTIVITY:
				return createPolicyActivity();
			case ConsolPackage.AUTHORIZATION_ACTIVITY:
				return createAuthorizationActivity();
			case ConsolPackage.MEDICATIONS_SECTION:
				return createMedicationsSection();
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createMedicationsSectionEntriesOptional();
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
			case ConsolPackage.PROCEDURES_SECTION:
				return createProceduresSection();
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL:
				return createProceduresSectionEntriesOptional();
			case ConsolPackage.PROCEDURE_ACIVITY_OBSERVATION:
				return createProcedureAcivityObservation();
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT:
				return createProcedureActivityAct();
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL:
				return createVitalSignsSectionEntriesOptional();
			case ConsolPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case ConsolPackage.VITAL_SIGN_OBSERVATION:
				return createVitalSignObservation();
			case ConsolPackage.FAMILY_HISTORY_SECTION:
				return createFamilyHistorySection();
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER:
				return createFamilyHistoryOrganizer();
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION:
				return createFamilyHistoryObservation();
			case ConsolPackage.FAMILY_HISTORY_DEATH_OBSERVATION:
				return createFamilyHistoryDeathObservation();
			case ConsolPackage.SOCIAL_HISTORY_SECTION:
				return createSocialHistorySection();
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION:
				return createSocialHistoryObservation();
			case ConsolPackage.PREGNANCY_OBSERVATION:
				return createPregnancyObservation();
			case ConsolPackage.ESTIMATED_DATE_OF_DELIVERY:
				return createEstimatedDateOfDelivery();
			case ConsolPackage.RESULTS_SECTION:
				return createResultsSection();
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL:
				return createResultsSectionEntriesOptional();
			case ConsolPackage.RESULT_ORGANIZER:
				return createResultOrganizer();
			case ConsolPackage.RESULT_OBSERVATION:
				return createResultObservation();
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION:
				return createMedicalEquipmentSection();
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION:
				return createFunctionalStatusSection();
			case ConsolPackage.PROBLEM_SECTION:
				return createProblemSection();
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL:
				return createProblemSectionEntriesOptional();
			case ConsolPackage.SOCIAL_HISTORY_STATUS_OBSERVATION:
				return createSocialHistoryStatusObservation();
			case ConsolPackage.PURPOSE_SECTION:
				return createPurposeSection();
			case ConsolPackage.PURPOSE_ACTIVITY:
				return createPurposeActivity();
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION:
				return createAdvanceDirectivesSection();
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return createAdvanceDirectiveObservation();
			case ConsolPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return createAdvanceDirectiveVerification();
			case ConsolPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return createAdvanceDirectiveStatusObservation();
			case ConsolPackage.ADVANCE_DIRECTIVE_REFERENCE:
				return createAdvanceDirectiveReference();
			case ConsolPackage.ENCOUNTERS_SECTION:
				return createEncountersSection();
			case ConsolPackage.ENCOUNTERS_ACTIVITES:
				return createEncountersActivites();
			case ConsolPackage.SERVICE_DELIVERY_LOCATION:
				return createServiceDeliveryLocation();
			case ConsolPackage.ENCOUNTER:
				return createEncounter();
			case ConsolPackage.IMMUNIZATIONS_SECTION:
				return createImmunizationsSection();
			case ConsolPackage.IMMUNIZATION_ACTIVITY:
				return createImmunizationActivity();
			case ConsolPackage.IMMUNIZATION_REFUSAL_REASON:
				return createImmunizationRefusalReason();
			case ConsolPackage.INSURANCE_PROVIDER:
				return createInsuranceProvider();
			case ConsolPackage.PAYER_ENTRY:
				return createPayerEntry();
			case ConsolPackage.COVERED_PARTY:
				return createCoveredParty();
			case ConsolPackage.POLICY_SUBSCRIBER:
				return createPolicySubscriber();
			case ConsolPackage.PREGNANCY_HISTORY_SECTION:
				return createPregnancyHistorySection();
			case ConsolPackage.EXTERNAL_REFERENCE:
				return createExternalReference();
			case ConsolPackage.SUPPORT:
				return createSupport();
			case ConsolPackage.VITAL_SIGNS_SECTION:
				return createVitalSignsSection();
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION:
				return createDiagnosticResultsSection();
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
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION:
				return createHospitalDischargeDiagnosisSection();
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL:
				return createHospitalAdmissionMedicationsSectionEntriesOptional();
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return createHospitalDischargeMedicationsSection();
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return createMedicationsAdministeredSection();
			case ConsolPackage.PHYSICAL_EXAM_SECTION:
				return createPhysicalExamSection();
			case ConsolPackage.GENERAL_STATUS_SECTION:
				return createGeneralStatusSection();
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
			case ConsolPackage.CONDITION_ENTRY:
				return createConditionEntry();
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
			case ConsolPackage.SUPPORT_GUARDIAN:
				return createSupportGuardian();
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
			case ConsolPackage.DISCHARGE_DIET_SECTION:
				return createDischargeDietSection();
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION:
				return createPreconditionForSubstanceAdministration();
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION:
				return createImmunizationMedicationInformation();
			case ConsolPackage.PROCEDURE:
				return createProcedure();
			case ConsolPackage.PROCEDURE_SPECIMEN:
				return createProcedureSpecimen();
			case ConsolPackage.PROCEDURE_PERFORMER:
				return createProcedurePerformer();
			case ConsolPackage.PROCEDURE_ENCOUNTER:
				return createProcedureEncounter();
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
	public EpisodeObservation createEpisodeObservation() {
		EpisodeObservationImpl episodeObservation = new EpisodeObservationImpl();
		return episodeObservation;
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
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
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
	public MedicationSeriesNumberObservation createMedicationSeriesNumberObservation() {
		MedicationSeriesNumberObservationImpl medicationSeriesNumberObservation = new MedicationSeriesNumberObservationImpl();
		return medicationSeriesNumberObservation;
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
	public InternalReference createInternalReference() {
		InternalReferenceImpl internalReference = new InternalReferenceImpl();
		return internalReference;
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
	public MedicationFullfillmentInstructions createMedicationFullfillmentInstructions() {
		MedicationFullfillmentInstructionsImpl medicationFullfillmentInstructions = new MedicationFullfillmentInstructionsImpl();
		return medicationFullfillmentInstructions;
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
	public ProcedureAcivityObservation createProcedureAcivityObservation() {
		ProcedureAcivityObservationImpl procedureAcivityObservation = new ProcedureAcivityObservationImpl();
		return procedureAcivityObservation;
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
	public SocialHistoryStatusObservation createSocialHistoryStatusObservation() {
		SocialHistoryStatusObservationImpl socialHistoryStatusObservation = new SocialHistoryStatusObservationImpl();
		return socialHistoryStatusObservation;
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
	public AdvanceDirectiveVerification createAdvanceDirectiveVerification() {
		AdvanceDirectiveVerificationImpl advanceDirectiveVerification = new AdvanceDirectiveVerificationImpl();
		return advanceDirectiveVerification;
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
	public AdvanceDirectiveReference createAdvanceDirectiveReference() {
		AdvanceDirectiveReferenceImpl advanceDirectiveReference = new AdvanceDirectiveReferenceImpl();
		return advanceDirectiveReference;
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
	public EncountersActivites createEncountersActivites() {
		EncountersActivitesImpl encountersActivites = new EncountersActivitesImpl();
		return encountersActivites;
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
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
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
	public PregnancyHistorySection createPregnancyHistorySection() {
		PregnancyHistorySectionImpl pregnancyHistorySection = new PregnancyHistorySectionImpl();
		return pregnancyHistorySection;
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
	public Support createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
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
	public DiagnosticResultsSection createDiagnosticResultsSection() {
		DiagnosticResultsSectionImpl diagnosticResultsSection = new DiagnosticResultsSectionImpl();
		return diagnosticResultsSection;
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
	public GeneralStatusSection createGeneralStatusSection() {
		GeneralStatusSectionImpl generalStatusSection = new GeneralStatusSectionImpl();
		return generalStatusSection;
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
	public ConditionEntry createConditionEntry() {
		ConditionEntryImpl conditionEntry = new ConditionEntryImpl();
		return conditionEntry;
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
	public SupportGuardian createSupportGuardian() {
		SupportGuardianImpl supportGuardian = new SupportGuardianImpl();
		return supportGuardian;
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
	public DischargeDietSection createDischargeDietSection() {
		DischargeDietSectionImpl dischargeDietSection = new DischargeDietSectionImpl();
		return dischargeDietSection;
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
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSpecimen createProcedureSpecimen() {
		ProcedureSpecimenImpl procedureSpecimen = new ProcedureSpecimenImpl();
		return procedureSpecimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePerformer createProcedurePerformer() {
		ProcedurePerformerImpl procedurePerformer = new ProcedurePerformerImpl();
		return procedurePerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEncounter createProcedureEncounter() {
		ProcedureEncounterImpl procedureEncounter = new ProcedureEncounterImpl();
		return procedureEncounter;
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
