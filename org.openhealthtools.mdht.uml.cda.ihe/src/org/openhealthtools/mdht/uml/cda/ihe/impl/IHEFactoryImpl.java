/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IHEFactoryImpl extends EFactoryImpl implements IHEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IHEFactory init() {
		try {
			IHEFactory theIHEFactory = (IHEFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
			if (theIHEFactory != null) {
				return theIHEFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IHEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEFactoryImpl() {
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
			case IHEPackage.IMMUNIZATIONS_SECTION:
				return createImmunizationsSection();
			case IHEPackage.IMMUNIZATION:
				return createImmunization();
			case IHEPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return createMedicationsAdministeredSection();
			case IHEPackage.CONCERN_ENTRY:
				return createConcernEntry();
			case IHEPackage.MEDICAL_DOCUMENT:
				return createMedicalDocument();
			case IHEPackage.ACTIVE_PROBLEMS_SECTION:
				return createActiveProblemsSection();
			case IHEPackage.PROBLEM_CONCERN_ENTRY:
				return createProblemConcernEntry();
			case IHEPackage.PROBLEM_ENTRY:
				return createProblemEntry();
			case IHEPackage.SEVERITY:
				return createSeverity();
			case IHEPackage.PROBLEM_STATUS_OBSERVATION:
				return createProblemStatusObservation();
			case IHEPackage.HEALTH_STATUS_OBSERVATION:
				return createHealthStatusObservation();
			case IHEPackage.COMMENT:
				return createComment();
			case IHEPackage.INTERNAL_REFERENCE:
				return createInternalReference();
			case IHEPackage.PATIENT_MEDICAL_INSTRUCTIONS:
				return createPatientMedicalInstructions();
			case IHEPackage.SUPPLY_ENTRY:
				return createSupplyEntry();
			case IHEPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS:
				return createMedicationFullfillmentInstructions();
			case IHEPackage.MEDICATIONS_SECTION:
				return createMedicationsSection();
			case IHEPackage.ALLERGY_INTOLERANCE_CONCERN:
				return createAllergyIntoleranceConcern();
			case IHEPackage.ALLERGY_INTOLERANCE:
				return createAllergyIntolerance();
			case IHEPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER:
				return createProblemEntryReactionObservationContainer();
			case IHEPackage.ALLERGIES_REACTIONS_SECTION:
				return createAllergiesReactionsSection();
			case IHEPackage.NORMAL_DOSE:
				return createNormalDose();
			case IHEPackage.TAPERED_DOSE:
				return createTaperedDose();
			case IHEPackage.SPLIT_DOSE:
				return createSplitDose();
			case IHEPackage.CONDITIONAL_DOSE:
				return createConditionalDose();
			case IHEPackage.COMBINATION_MEDICATION:
				return createCombinationMedication();
			case IHEPackage.VITAL_SIGNS_SECTION:
				return createVitalSignsSection();
			case IHEPackage.CODED_VITAL_SIGNS_SECTION:
				return createCodedVitalSignsSection();
			case IHEPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case IHEPackage.VITAL_SIGN_OBSERVATION:
				return createVitalSignObservation();
			case IHEPackage.PAYERS_SECTION:
				return createPayersSection();
			case IHEPackage.COVERAGE_ENTRY:
				return createCoverageEntry();
			case IHEPackage.PAYER_ENTRY:
				return createPayerEntry();
			case IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return createHistoryOfPastIllnessSection();
			case IHEPackage.CHIEF_COMPLAINT_SECTION:
				return createChiefComplaintSection();
			case IHEPackage.REASON_FOR_REFERRAL_SECTION:
				return createReasonForReferralSection();
			case IHEPackage.HISTORY_OF_PRESENT_ILLNESS:
				return createHistoryOfPresentIllness();
			case IHEPackage.SURGERIES_SECTION:
				return createSurgeriesSection();
			case IHEPackage.CODED_SURGERIES_SECTION:
				return createCodedSurgeriesSection();
			case IHEPackage.EXTERNAL_REFERENCE:
				return createExternalReference();
			case IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE:
				return createProcedureEntryProcedureActivityProcedure();
			case IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return createHospitalAdmissionDiagnosisSection();
			case IHEPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return createDischargeDiagnosisSection();
			case IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return createAdmissionMedicationHistorySection();
			case IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return createHospitalDischargeMedicationsSection();
			case IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION:
				return createCodedAdvanceDirectivesSection();
			case IHEPackage.ADVANCE_DIRECTIVES_SECTION:
				return createAdvanceDirectivesSection();
			case IHEPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return createAdvanceDirectiveObservation();
			case IHEPackage.PHYSICAL_EXAM_NARRATIVE_SECTION:
				return createPhysicalExamNarrativeSection();
			case IHEPackage.PHYSICAL_EXAM_SECTION:
				return createPhysicalExamSection();
			case IHEPackage.GENERAL_APPEARANCE_SECTION:
				return createGeneralAppearanceSection();
			case IHEPackage.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION:
				return createVisibleImplantedMedicalDevicesSection();
			case IHEPackage.INTEGUMENTARY_SYSTEM_SECTION:
				return createIntegumentarySystemSection();
			case IHEPackage.HEAD_SECTION:
				return createHeadSection();
			case IHEPackage.EYES_SECTION:
				return createEyesSection();
			case IHEPackage.EARS_NOSE_MOUTH_THROAT_SECTION:
				return createEarsNoseMouthThroatSection();
			case IHEPackage.EARS_SECTION:
				return createEarsSection();
			case IHEPackage.NOSE_SECTION:
				return createNoseSection();
			case IHEPackage.MOUTH_THROAT_TEETH_SECTION:
				return createMouthThroatTeethSection();
			case IHEPackage.NECK_SECTION:
				return createNeckSection();
			case IHEPackage.ENDOCRINE_SYSTEM_SECTION:
				return createEndocrineSystemSection();
			case IHEPackage.THORAX_LUNGS_SECTION:
				return createThoraxLungsSection();
			case IHEPackage.CHEST_WALL_SECTION:
				return createChestWallSection();
			case IHEPackage.BREAST_SECTION:
				return createBreastSection();
			case IHEPackage.HEART_SECTION:
				return createHeartSection();
			case IHEPackage.RESPIRATORY_SYSTEM_SECTION:
				return createRespiratorySystemSection();
			case IHEPackage.ABDOMEN_SECTION:
				return createAbdomenSection();
			case IHEPackage.LYMPHATIC_SECTION:
				return createLymphaticSection();
			case IHEPackage.VESSELS_SECTION:
				return createVesselsSection();
			case IHEPackage.MUSCULOSKELETAL_SYSTEM_SECTION:
				return createMusculoskeletalSystemSection();
			case IHEPackage.NEUROLOGIC_SYSTEM_SECTION:
				return createNeurologicSystemSection();
			case IHEPackage.GENITALIA_SECTION:
				return createGenitaliaSection();
			case IHEPackage.RECTUM_SECTION:
				return createRectumSection();
			case IHEPackage.EXTREMITIES_SECTION:
				return createExtremitiesSection();
			case IHEPackage.REVIEW_OF_SYSTEMS_SECTION:
				return createReviewOfSystemsSection();
			case IHEPackage.HOSPITAL_COURSE_SECTION:
				return createHospitalCourseSection();
			case IHEPackage.CODED_RESULTS_SECTION:
				return createCodedResultsSection();
			case IHEPackage.ASSESSMENT_AND_PLAN_SECTION:
				return createAssessmentAndPlanSection();
			case IHEPackage.CARE_PLAN_SECTION:
				return createCarePlanSection();
			case IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION:
				return createFamilyMedicalHistorySection();
			case IHEPackage.SOCIAL_HISTORY_SECTION:
				return createSocialHistorySection();
			case IHEPackage.ENCOUNTER_HISTORY_SECTION:
				return createEncounterHistorySection();
			case IHEPackage.MEDICAL_DEVICES_SECTION:
				return createMedicalDevicesSection();
			case IHEPackage.LANGUAGE_COMMUNICATION:
				return createLanguageCommunication();
			case IHEPackage.MEDICAL_SUMMARY:
				return createMedicalSummary();
			case IHEPackage.DISCHARGE_SUMMARY:
				return createDischargeSummary();
			case IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES:
				return createHealthcareProvidersPharmacies();
			case IHEPackage.OBSERVATION_REQUEST_ENTRY:
				return createObservationRequestEntry();
			case IHEPackage.PRODUCT_ENTRY:
				return createProductEntry();
			case IHEPackage.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return createProcedureEntryPlanOfCareActivityProcedure();
			case IHEPackage.PHR_EXTRACT:
				return createPHRExtract();
			case IHEPackage.PHR_UPDATE:
				return createPHRUpdate();
			case IHEPackage.ENCOUNTER_ACTIVITY:
				return createEncounterActivity();
			case IHEPackage.ENCOUNTER_PLAN_OF_CARE:
				return createEncounterPlanOfCare();
			case IHEPackage.INTAKE_OUTPUT_SECTION:
				return createIntakeOutputSection();
			case IHEPackage.PREGNANCY_HISTORY_SECTION:
				return createPregnancyHistorySection();
			case IHEPackage.PREGNANCY_OBSERVATION:
				return createPregnancyObservation();
			case IHEPackage.PATIENT_CONTACT_GUARDIAN:
				return createPatientContactGuardian();
			case IHEPackage.PATIENT_CONTACT_PARTICIPANT:
				return createPatientContactParticipant();
			case IHEPackage.SCANNED_DOCUMENT:
				return createScannedDocument();
			case IHEPackage.SCAN_ORIGINAL_AUTHOR:
				return createScanOriginalAuthor();
			case IHEPackage.SCANNING_DEVICE:
				return createScanningDevice();
			case IHEPackage.SCAN_DATA_ENTERER:
				return createScanDataEnterer();
			case IHEPackage.DISCHARGE_DIET:
				return createDischargeDiet();
			case IHEPackage.HOSPITAL_DISCHARGE_PHYSICAL:
				return createHospitalDischargePhysical();
			case IHEPackage.CODED_FAMILY_MEDICAL_HISTORY_SECTION:
				return createCodedFamilyMedicalHistorySection();
			case IHEPackage.FAMILY_HISTORY_ORGANIZER:
				return createFamilyHistoryOrganizer();
			case IHEPackage.FAMILY_HISTORY_OBSERVATION:
				return createFamilyHistoryObservation();
			case IHEPackage.SOCIAL_HISTORY_OBSERVATION:
				return createSocialHistoryObservation();
			case IHEPackage.CODED_REASON_FOR_REFERRAL_SECTION:
				return createCodedReasonForReferralSection();
			case IHEPackage.IHE_REGISTRY_DELEGATE:
				return createIHERegistryDelegate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public MedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernEntry createConcernEntry() {
		ConcernEntryImpl concernEntry = new ConcernEntryImpl();
		return concernEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalDocument createMedicalDocument() {
		MedicalDocumentImpl medicalDocument = new MedicalDocumentImpl();
		return medicalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveProblemsSection createActiveProblemsSection() {
		ActiveProblemsSectionImpl activeProblemsSection = new ActiveProblemsSectionImpl();
		return activeProblemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernEntry createProblemConcernEntry() {
		ProblemConcernEntryImpl problemConcernEntry = new ProblemConcernEntryImpl();
		return problemConcernEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry createProblemEntry() {
		ProblemEntryImpl problemEntry = new ProblemEntryImpl();
		return problemEntry;
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
	public MedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntoleranceConcern createAllergyIntoleranceConcern() {
		AllergyIntoleranceConcernImpl allergyIntoleranceConcern = new AllergyIntoleranceConcernImpl();
		return allergyIntoleranceConcern;
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
	public AllergiesReactionsSection createAllergiesReactionsSection() {
		AllergiesReactionsSectionImpl allergiesReactionsSection = new AllergiesReactionsSectionImpl();
		return allergiesReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDose createNormalDose() {
		NormalDoseImpl normalDose = new NormalDoseImpl();
		return normalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaperedDose createTaperedDose() {
		TaperedDoseImpl taperedDose = new TaperedDoseImpl();
		return taperedDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitDose createSplitDose() {
		SplitDoseImpl splitDose = new SplitDoseImpl();
		return splitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDose createConditionalDose() {
		ConditionalDoseImpl conditionalDose = new ConditionalDoseImpl();
		return conditionalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinationMedication createCombinationMedication() {
		CombinationMedicationImpl combinationMedication = new CombinationMedicationImpl();
		return combinationMedication;
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
	public CodedVitalSignsSection createCodedVitalSignsSection() {
		CodedVitalSignsSectionImpl codedVitalSignsSection = new CodedVitalSignsSectionImpl();
		return codedVitalSignsSection;
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
	public VitalSignsOrganizer createVitalSignsOrganizer() {
		VitalSignsOrganizerImpl vitalSignsOrganizer = new VitalSignsOrganizerImpl();
		return vitalSignsOrganizer;
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
	public SurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodedSurgeriesSection createCodedSurgeriesSection() {
		CodedSurgeriesSectionImpl codedSurgeriesSection = new CodedSurgeriesSectionImpl();
		return codedSurgeriesSection;
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
	public CodedAdvanceDirectivesSection createCodedAdvanceDirectivesSection() {
		CodedAdvanceDirectivesSectionImpl codedAdvanceDirectivesSection = new CodedAdvanceDirectivesSectionImpl();
		return codedAdvanceDirectivesSection;
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
	public PhysicalExamNarrativeSection createPhysicalExamNarrativeSection() {
		PhysicalExamNarrativeSectionImpl physicalExamNarrativeSection = new PhysicalExamNarrativeSectionImpl();
		return physicalExamNarrativeSection;
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
	public CodedResultsSection createCodedResultsSection() {
		CodedResultsSectionImpl codedResultsSection = new CodedResultsSectionImpl();
		return codedResultsSection;
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
	public AssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlanSection createCarePlanSection() {
		CarePlanSectionImpl carePlanSection = new CarePlanSectionImpl();
		return carePlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMedicalHistorySection createFamilyMedicalHistorySection() {
		FamilyMedicalHistorySectionImpl familyMedicalHistorySection = new FamilyMedicalHistorySectionImpl();
		return familyMedicalHistorySection;
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
	public EncounterHistorySection createEncounterHistorySection() {
		EncounterHistorySectionImpl encounterHistorySection = new EncounterHistorySectionImpl();
		return encounterHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalDevicesSection createMedicalDevicesSection() {
		MedicalDevicesSectionImpl medicalDevicesSection = new MedicalDevicesSectionImpl();
		return medicalDevicesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageCommunication createLanguageCommunication() {
		LanguageCommunicationImpl languageCommunication = new LanguageCommunicationImpl();
		return languageCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalSummary createMedicalSummary() {
		MedicalSummaryImpl medicalSummary = new MedicalSummaryImpl();
		return medicalSummary;
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
	public CoverageEntry createCoverageEntry() {
		CoverageEntryImpl coverageEntry = new CoverageEntryImpl();
		return coverageEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareProvidersPharmacies createHealthcareProvidersPharmacies() {
		HealthcareProvidersPharmaciesImpl healthcareProvidersPharmacies = new HealthcareProvidersPharmaciesImpl();
		return healthcareProvidersPharmacies;
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
	public ObservationRequestEntry createObservationRequestEntry() {
		ObservationRequestEntryImpl observationRequestEntry = new ObservationRequestEntryImpl();
		return observationRequestEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductEntry createProductEntry() {
		ProductEntryImpl productEntry = new ProductEntryImpl();
		return productEntry;
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
	public ProcedureEntryPlanOfCareActivityProcedure createProcedureEntryPlanOfCareActivityProcedure() {
		ProcedureEntryPlanOfCareActivityProcedureImpl procedureEntryPlanOfCareActivityProcedure = new ProcedureEntryPlanOfCareActivityProcedureImpl();
		return procedureEntryPlanOfCareActivityProcedure;
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
	public PayerEntry createPayerEntry() {
		PayerEntryImpl payerEntry = new PayerEntryImpl();
		return payerEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHRExtract createPHRExtract() {
		PHRExtractImpl phrExtract = new PHRExtractImpl();
		return phrExtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHRUpdate createPHRUpdate() {
		PHRUpdateImpl phrUpdate = new PHRUpdateImpl();
		return phrUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterActivity createEncounterActivity() {
		EncounterActivityImpl encounterActivity = new EncounterActivityImpl();
		return encounterActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterPlanOfCare createEncounterPlanOfCare() {
		EncounterPlanOfCareImpl encounterPlanOfCare = new EncounterPlanOfCareImpl();
		return encounterPlanOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntakeOutputSection createIntakeOutputSection() {
		IntakeOutputSectionImpl intakeOutputSection = new IntakeOutputSectionImpl();
		return intakeOutputSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyEntry createSupplyEntry() {
		SupplyEntryImpl supplyEntry = new SupplyEntryImpl();
		return supplyEntry;
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
	public PatientContactGuardian createPatientContactGuardian() {
		PatientContactGuardianImpl patientContactGuardian = new PatientContactGuardianImpl();
		return patientContactGuardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientContactParticipant createPatientContactParticipant() {
		PatientContactParticipantImpl patientContactParticipant = new PatientContactParticipantImpl();
		return patientContactParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScannedDocument createScannedDocument() {
		ScannedDocumentImpl scannedDocument = new ScannedDocumentImpl();
		return scannedDocument;
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
	public DischargeDiet createDischargeDiet() {
		DischargeDietImpl dischargeDiet = new DischargeDietImpl();
		return dischargeDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargePhysical createHospitalDischargePhysical() {
		HospitalDischargePhysicalImpl hospitalDischargePhysical = new HospitalDischargePhysicalImpl();
		return hospitalDischargePhysical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodedFamilyMedicalHistorySection createCodedFamilyMedicalHistorySection() {
		CodedFamilyMedicalHistorySectionImpl codedFamilyMedicalHistorySection = new CodedFamilyMedicalHistorySectionImpl();
		return codedFamilyMedicalHistorySection;
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
	public SocialHistoryObservation createSocialHistoryObservation() {
		SocialHistoryObservationImpl socialHistoryObservation = new SocialHistoryObservationImpl();
		return socialHistoryObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodedReasonForReferralSection createCodedReasonForReferralSection() {
		CodedReasonForReferralSectionImpl codedReasonForReferralSection = new CodedReasonForReferralSectionImpl();
		return codedReasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHERegistryDelegate createIHERegistryDelegate() {
		IHERegistryDelegateImpl iheRegistryDelegate = new IHERegistryDelegateImpl();
		return iheRegistryDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEPackage getIHEPackage() {
		return (IHEPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IHEPackage getPackage() {
		return IHEPackage.eINSTANCE;
	}

} // IHEFactoryImpl
