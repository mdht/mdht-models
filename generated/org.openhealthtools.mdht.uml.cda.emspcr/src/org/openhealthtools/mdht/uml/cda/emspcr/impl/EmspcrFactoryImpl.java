/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrFactoryImpl extends EFactoryImpl implements EmspcrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmspcrFactory init() {
		try {
			EmspcrFactory theEmspcrFactory = (EmspcrFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/emspcr");
			if (theEmspcrFactory != null) {
				return theEmspcrFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmspcrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspcrFactoryImpl() {
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
			case EmspcrPackage.PATIENT_CARE_REPORT:
				return createPatientCareReport();
			case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION:
				return createEMSCurrentMedicationSection();
			case EmspcrPackage.CURRENTLY_ON_MEDICATION:
				return createCurrentlyOnMedication();
			case EmspcrPackage.PATIENT_ON_ANTICOAGULANTS:
				return createPatientOnAnticoagulants();
			case EmspcrPackage.CURRENT_MEDICATION:
				return createCurrentMedication();
			case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT_SECTION:
				return createEMSCardiacArrestEventSection();
			case EmspcrPackage.CARDIAC_ARREST:
				return createCardiacArrest();
			case EmspcrPackage.EMS_ADVANCE_DIRECTIVES_SECTION:
				return createEMSAdvanceDirectivesSection();
			case EmspcrPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return createAdvanceDirectiveObservation();
			case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION:
				return createEMSAllergiesAndAdverseReactionsSection();
			case EmspcrPackage.NON_DRUG_ALLERGY_ORGANIZER:
				return createNonDrugAllergyOrganizer();
			case EmspcrPackage.EXISTENCE_OF_NON_DRUG_ALLERGY:
				return createExistenceOfNonDrugAllergy();
			case EmspcrPackage.NON_DRUG_ALLERGY:
				return createNonDrugAllergy();
			case EmspcrPackage.EMS_PAST_MEDICAL_HISTORY_SECTION:
				return createEMSPastMedicalHistorySection();
			case EmspcrPackage.EXISTENCE_OF_HISTORY_OF_CONDITION:
				return createExistenceOfHistoryOfCondition();
			case EmspcrPackage.HISTORY_OF_CONDITION:
				return createHistoryOfCondition();
			case EmspcrPackage.EMS_SOCIAL_HISTORY_SECTION:
				return createEMSSocialHistorySection();
			case EmspcrPackage.EXISTENCE_OF_DRUG_USE_INDICATION:
				return createExistenceOfDrugUseIndication();
			case EmspcrPackage.DRUG_USE_INDICATION:
				return createDrugUseIndication();
			case EmspcrPackage.EMS_PHYSICAL_ASSESSMENT_SECTION:
				return createEMSPhysicalAssessmentSection();
			case EmspcrPackage.PHYSICAL_ASSESSMENT_ORGANIZER:
				return createPhysicalAssessmentOrganizer();
			case EmspcrPackage.SKIN_ASSESSMENT:
				return createSkinAssessment();
			case EmspcrPackage.PATIENT_PREGNANCY:
				return createPatientPregnancy();
			case EmspcrPackage.LAST_ORAL_INTAKE:
				return createLastOralIntake();
			case EmspcrPackage.PATIENT_AGE:
				return createPatientAge();
			case EmspcrPackage.THROMBOLYTIC_CONTRAINDICATIONS:
				return createThrombolyticContraindications();
			case EmspcrPackage.BARRIERS_TO_PATIENT_CARE:
				return createBarriersToPatientCare();
			case EmspcrPackage.EMS_MEDICATIONS_ADMINISTERED_SECTION:
				return createEMSMedicationsAdministeredSection();
			case EmspcrPackage.MEDICATION_ADMINISTERED:
				return createMedicationAdministered();
			case EmspcrPackage.EMS_PROCEDURES_PERFORMED_SECTION:
				return createEMSProceduresPerformedSection();
			case EmspcrPackage.PROCEDURE:
				return createProcedure();
			case EmspcrPackage.EMS_PATIENT_CARE_NARRATIVE_SECTION:
				return createEMSPatientCareNarrativeSection();
			case EmspcrPackage.EMS_SCENE_SECTION:
				return createEMSSceneSection();
			case EmspcrPackage.FIRST_UNIT_INDICATOR:
				return createFirstUnitIndicator();
			case EmspcrPackage.FIRST_UNIT_ON_SCENE:
				return createFirstUnitOnScene();
			case EmspcrPackage.SCENE_PATIENT_COUNT:
				return createScenePatientCount();
			case EmspcrPackage.MASS_CASUALTY_INDICATOR:
				return createMassCasualtyIndicator();
			case EmspcrPackage.LOCATION_TYPE_OBSERVATION:
				return createLocationTypeObservation();
			case EmspcrPackage.EMS_DISPATCH_SECTION:
				return createEMSDispatchSection();
			case EmspcrPackage.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION:
				return createEmergencyMedicalDispatchObservation();
			case EmspcrPackage.COMPLAINT_REPORTED_BY_DISPATCH:
				return createComplaintReportedByDispatch();
			case EmspcrPackage.EMS_DISPOSITION_SECTION:
				return createEMSDispositionSection();
			case EmspcrPackage.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION:
				return createNumberOfPatientsTransportedObservation();
			case EmspcrPackage.INCIDENT_DISPOSITION_OBSERVATION:
				return createIncidentDispositionObservation();
			case EmspcrPackage.TRANSPORT_MODE_OBSERVATION:
				return createTransportModeObservation();
			case EmspcrPackage.TRANSPORT_METHOD_OBSERVATION:
				return createTransportMethodObservation();
			case EmspcrPackage.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION:
				return createReasonForChoosingDestinationObservation();
			case EmspcrPackage.PREARRIVAL_ACTIVATION_OBSERVATION:
				return createPrearrivalActivationObservation();
			case EmspcrPackage.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION:
				return createPatientConditionChangeAtDestinationObservation();
			case EmspcrPackage.EMS_PERSONNEL_ADVERSE_EVENT_SECTION:
				return createEMSPersonnelAdverseEventSection();
			case EmspcrPackage.ADVERSE_EVENT_INDICATOR:
				return createAdverseEventIndicator();
			case EmspcrPackage.ADVERSE_EVENT_TYPE_OBSERVATION:
				return createAdverseEventTypeObservation();
			case EmspcrPackage.EMS_PROTOCOL_SECTION:
				return createEMSProtocolSection();
			case EmspcrPackage.PROTOCOL_OBSERVATION:
				return createProtocolObservation();
			case EmspcrPackage.CANDIDATE_PATIENT_REGISTRY_TYPE:
				return createCandidatePatientRegistryType();
			case EmspcrPackage.EMS_RESPONSE_SECTION:
				return createEMSResponseSection();
			case EmspcrPackage.DELAY_ORGANIZER:
				return createDelayOrganizer();
			case EmspcrPackage.DISPATCH_LOCATION_ORGANIZER:
				return createDispatchLocationOrganizer();
			case EmspcrPackage.RESPONSE_ODOMETER_READING_ORGANIZER:
				return createResponseOdometerReadingOrganizer();
			case EmspcrPackage.RESPONSE_MODE_TO_SCENE:
				return createResponseModeToScene();
			case EmspcrPackage.EMS_SITUATION_SECTION:
				return createEMSSituationSection();
			case EmspcrPackage.COMPLAINT:
				return createComplaint();
			case EmspcrPackage.POSSIBLE_INJURY:
				return createPossibleInjury();
			case EmspcrPackage.PROVIDER_PRIMARY_IMPRESSION:
				return createProviderPrimaryImpression();
			case EmspcrPackage.PRIMARY_SYMPTOM:
				return createPrimarySymptom();
			case EmspcrPackage.OTHER_SYMPTOMS:
				return createOtherSymptoms();
			case EmspcrPackage.PROVIDER_SECONDARY_IMPRESSIONS:
				return createProviderSecondaryImpressions();
			case EmspcrPackage.INITIAL_PATIENT_ACUITY:
				return createInitialPatientAcuity();
			case EmspcrPackage.TIMES_SECTION:
				return createTimesSection();
			case EmspcrPackage.CALL_TIME:
				return createCallTime();
			case EmspcrPackage.UNIT_NOTIFIED_TIME:
				return createUnitNotifiedTime();
			case EmspcrPackage.UNIT_EN_ROUTE_TIME:
				return createUnitEnRouteTime();
			case EmspcrPackage.UNIT_ON_SCENE_TIME:
				return createUnitOnSceneTime();
			case EmspcrPackage.UNIT_AT_PATIENT_TIME:
				return createUnitAtPatientTime();
			case EmspcrPackage.UNIT_LEFT_SCENE_TIME:
				return createUnitLeftSceneTime();
			case EmspcrPackage.PATIENT_ARRIVED_AT_DESTINATION_TIME:
				return createPatientArrivedAtDestinationTime();
			case EmspcrPackage.UNIT_BACK_IN_SERVICE_TIME:
				return createUnitBackInServiceTime();
			case EmspcrPackage.DISPATCH_NOTIFIED_TIME:
				return createDispatchNotifiedTime();
			case EmspcrPackage.EMS_VITAL_SIGNS_SECTION:
				return createEMSVitalSignsSection();
			case EmspcrPackage.VITAL_SIGNS_ORGANIZER:
				return createVitalSignsOrganizer();
			case EmspcrPackage.PRIOR_AID_VITALS:
				return createPriorAidVitals();
			case EmspcrPackage.ADDITIONAL_VITAL_SIGNS_ORGANIZER:
				return createAdditionalVitalSignsOrganizer();
			case EmspcrPackage.STROKE_SCORE:
				return createStrokeScore();
			case EmspcrPackage.PAIN_SCORE:
				return createPainScore();
			case EmspcrPackage.LEVEL_OF_RESPONSIVENESS:
				return createLevelOfResponsiveness();
			case EmspcrPackage.BLOOD_GLUCOSE:
				return createBloodGlucose();
			case EmspcrPackage.CARBON_MONOXIDE:
				return createCarbonMonoxide();
			case EmspcrPackage.CARBON_DIOXIDE:
				return createCarbonDioxide();
			case EmspcrPackage.CARDIAC_RHYTHM:
				return createCardiacRhythm();
			case EmspcrPackage.GLASGOW_COMA_SCORE_ORGANIZER:
				return createGlasgowComaScoreOrganizer();
			case EmspcrPackage.GLASGOW_EYE:
				return createGlasgowEye();
			case EmspcrPackage.GLASGOW_MOTOR:
				return createGlasgowMotor();
			case EmspcrPackage.GLASGOW_QUALIFIER:
				return createGlasgowQualifier();
			case EmspcrPackage.GLASGOW_TOTAL:
				return createGlasgowTotal();
			case EmspcrPackage.GLASGOW_VERBAL:
				return createGlasgowVerbal();
			case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION:
				return createEMSInjuryIncidentDescriptionSection();
			case EmspcrPackage.INJURY_CAUSE_CATEGORY:
				return createInjuryCauseCategory();
			case EmspcrPackage.INJURY_MECHANISM:
				return createInjuryMechanism();
			case EmspcrPackage.TRAUMA_CENTER_CRITERIA:
				return createTraumaCenterCriteria();
			case EmspcrPackage.INJURY_RISK_FACTOR:
				return createInjuryRiskFactor();
			case EmspcrPackage.VEHICLE_IMPACT_AREA:
				return createVehicleImpactArea();
			case EmspcrPackage.PATIENT_LOCATION_IN_VEHICLE:
				return createPatientLocationInVehicle();
			case EmspcrPackage.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT:
				return createVehicleOccupantSafetyEquipment();
			case EmspcrPackage.AIRBAG_DEPLOYMENT_STATUS:
				return createAirbagDeploymentStatus();
			case EmspcrPackage.HEIGHT_OF_FALL:
				return createHeightOfFall();
			case EmspcrPackage.DISASTER_TYPE:
				return createDisasterType();
			case EmspcrPackage.EMS_BILLING_SECTION:
				return createEMSBillingSection();
			case EmspcrPackage.BILLING_CONDITION:
				return createBillingCondition();
			case EmspcrPackage.LEVEL_OF_SERVICE_OBSERVATION:
				return createLevelOfServiceObservation();
			case EmspcrPackage.EMS_DRUG_ALLERGY:
				return createEMSDrugAllergy();
			case EmspcrPackage.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION:
				return createExistenceOfDrugAllergyObservation();
			case EmspcrPackage.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION:
				return createMedicationNotAdministeredReasonObservation();
			case EmspcrPackage.MEDICATION_RESPONSE_OBSERVATION:
				return createMedicationResponseObservation();
			case EmspcrPackage.MEDICATION_COMPLICATION_OBSERVATION:
				return createMedicationComplicationObservation();
			case EmspcrPackage.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION:
				return createMedicationPriorAdministrationObservation();
			case EmspcrPackage.PATIENT_BODY_WEIGHT:
				return createPatientBodyWeight();
			case EmspcrPackage.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS:
				return createLengthBasedPatientBodyWeightClass();
			case EmspcrPackage.FACE_ASSESSMENT:
				return createFaceAssessment();
			case EmspcrPackage.HEAD_ASSESSMENT:
				return createHeadAssessment();
			case EmspcrPackage.NECK_ASSESSMENT:
				return createNeckAssessment();
			case EmspcrPackage.CHEST_AND_LUNGS_ASSESSMENT:
				return createChestAndLungsAssessment();
			case EmspcrPackage.HEART_ASSESSMENT:
				return createHeartAssessment();
			case EmspcrPackage.ABDOMEN_ASSESSMENT:
				return createAbdomenAssessment();
			case EmspcrPackage.PELVIC_AND_GENITOURINARY_ASSESSMENT:
				return createPelvicAndGenitourinaryAssessment();
			case EmspcrPackage.BACK_AND_SPINE_ASSESSMENT:
				return createBackAndSpineAssessment();
			case EmspcrPackage.EXTREMITIES_ASSESSMENT:
				return createExtremitiesAssessment();
			case EmspcrPackage.EYE_ASSESSMENT:
				return createEyeAssessment();
			case EmspcrPackage.MENTAL_STATUS_ASSESSMENT:
				return createMentalStatusAssessment();
			case EmspcrPackage.CARDIAC_ARREST_WITH_TIMING:
				return createCardiacArrestWithTiming();
			case EmspcrPackage.CARDIAC_ARREST_CAUSE:
				return createCardiacArrestCause();
			case EmspcrPackage.PRIOR_CPR:
				return createPriorCPR();
			case EmspcrPackage.PRIOR_AED_USE:
				return createPriorAEDUse();
			case EmspcrPackage.ARREST_RHYTHM:
				return createArrestRhythm();
			case EmspcrPackage.RETURN_OF_SPONTANEOUS_CIRCULATION:
				return createReturnOfSpontaneousCirculation();
			case EmspcrPackage.DESTINATION_RHYTHM:
				return createDestinationRhythm();
			case EmspcrPackage.ABANDONED_PROCEDURE_REASON_OBSERVATION:
				return createAbandonedProcedureReasonObservation();
			case EmspcrPackage.PROCEDURE_PRIOR_INDICATOR:
				return createProcedurePriorIndicator();
			case EmspcrPackage.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION:
				return createProcedureNumberOfAttemptsObservation();
			case EmspcrPackage.PROCEDURE_SUCCESSFUL_OBSERVATION:
				return createProcedureSuccessfulObservation();
			case EmspcrPackage.PROCEDURE_COMPLICATIONS_OBSERVATION:
				return createProcedureComplicationsObservation();
			case EmspcrPackage.PROCEDURE_PATIENT_RESPONSE_OBSERVATION:
				return createProcedurePatientResponseObservation();
			case EmspcrPackage.AIRWAY_CONFIRMATION_OBSERVATION:
				return createAirwayConfirmationObservation();
			case EmspcrPackage.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION:
				return createReasonProcedureNotAttemptedObservation();
			case EmspcrPackage.COMPLAINT_TYPE:
				return createComplaintType();
			case EmspcrPackage.COMPLAINT_DURATION:
				return createComplaintDuration();
			case EmspcrPackage.COMPLAINT_ORGAN_SYSTEM:
				return createComplaintOrganSystem();
			case EmspcrPackage.NEUROLOGICAL_ASSESSMENT:
				return createNeurologicalAssessment();
			case EmspcrPackage.SYSTOLIC_BLOOD_PRESSURE:
				return createSystolicBloodPressure();
			case EmspcrPackage.DIASTOLIC_BLOOD_PRESSURE:
				return createDiastolicBloodPressure();
			case EmspcrPackage.HEART_RATE:
				return createHeartRate();
			case EmspcrPackage.RESPIRATORY_RATE:
				return createRespiratoryRate();
			case EmspcrPackage.BODY_TEMPERATURE:
				return createBodyTemperature();
			case EmspcrPackage.OXYGEN_SATURATION:
				return createOxygenSaturation();
			case EmspcrPackage.PROTOCOL_AGE_CATEGORY:
				return createProtocolAgeCategory();
			case EmspcrPackage.DISPATCH_LOCATION_NAME:
				return createDispatchLocationName();
			case EmspcrPackage.DISPATCH_LOCATION_LATITUDE:
				return createDispatchLocationLatitude();
			case EmspcrPackage.DISPATCH_LOCATION_LONGITUDE:
				return createDispatchLocationLongitude();
			case EmspcrPackage.DISPATCH_DELAY:
				return createDispatchDelay();
			case EmspcrPackage.RESPONSE_DELAY:
				return createResponseDelay();
			case EmspcrPackage.SCENE_DELAY:
				return createSceneDelay();
			case EmspcrPackage.TRANSPORT_DELAY:
				return createTransportDelay();
			case EmspcrPackage.TURNAROUND_DELAY:
				return createTurnaroundDelay();
			case EmspcrPackage.RESPONSE_BEGINNING_ODOMETER_READING:
				return createResponseBeginningOdometerReading();
			case EmspcrPackage.RESPONSE_ON_SCENE_ODOMETER_READING:
				return createResponseOnSceneOdometerReading();
			case EmspcrPackage.RESPONSE_DESTINATION_ODOMETER_READING:
				return createResponseDestinationOdometerReading();
			case EmspcrPackage.RESPONSE_ENDING_ODOMETER_READING:
				return createResponseEndingOdometerReading();
			case EmspcrPackage.NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG:
				return createNonDrugAllergyOrganizerActuallyDreg();
			case EmspcrPackage.EMS_DRUG_ALLERGY_ORGANIZER:
				return createEMSDrugAllergyOrganizer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientCareReport createPatientCareReport() {
		PatientCareReportImpl patientCareReport = new PatientCareReportImpl();
		return patientCareReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCurrentMedicationSection createEMSCurrentMedicationSection() {
		EMSCurrentMedicationSectionImpl emsCurrentMedicationSection = new EMSCurrentMedicationSectionImpl();
		return emsCurrentMedicationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentlyOnMedication createCurrentlyOnMedication() {
		CurrentlyOnMedicationImpl currentlyOnMedication = new CurrentlyOnMedicationImpl();
		return currentlyOnMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientOnAnticoagulants createPatientOnAnticoagulants() {
		PatientOnAnticoagulantsImpl patientOnAnticoagulants = new PatientOnAnticoagulantsImpl();
		return patientOnAnticoagulants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentMedication createCurrentMedication() {
		CurrentMedicationImpl currentMedication = new CurrentMedicationImpl();
		return currentMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCardiacArrestEventSection createEMSCardiacArrestEventSection() {
		EMSCardiacArrestEventSectionImpl emsCardiacArrestEventSection = new EMSCardiacArrestEventSectionImpl();
		return emsCardiacArrestEventSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrest createCardiacArrest() {
		CardiacArrestImpl cardiacArrest = new CardiacArrestImpl();
		return cardiacArrest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSAdvanceDirectivesSection createEMSAdvanceDirectivesSection() {
		EMSAdvanceDirectivesSectionImpl emsAdvanceDirectivesSection = new EMSAdvanceDirectivesSectionImpl();
		return emsAdvanceDirectivesSection;
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
	public EMSAllergiesAndAdverseReactionsSection createEMSAllergiesAndAdverseReactionsSection() {
		EMSAllergiesAndAdverseReactionsSectionImpl emsAllergiesAndAdverseReactionsSection = new EMSAllergiesAndAdverseReactionsSectionImpl();
		return emsAllergiesAndAdverseReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergyOrganizer createNonDrugAllergyOrganizer() {
		NonDrugAllergyOrganizerImpl nonDrugAllergyOrganizer = new NonDrugAllergyOrganizerImpl();
		return nonDrugAllergyOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfNonDrugAllergy createExistenceOfNonDrugAllergy() {
		ExistenceOfNonDrugAllergyImpl existenceOfNonDrugAllergy = new ExistenceOfNonDrugAllergyImpl();
		return existenceOfNonDrugAllergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergy createNonDrugAllergy() {
		NonDrugAllergyImpl nonDrugAllergy = new NonDrugAllergyImpl();
		return nonDrugAllergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPastMedicalHistorySection createEMSPastMedicalHistorySection() {
		EMSPastMedicalHistorySectionImpl emsPastMedicalHistorySection = new EMSPastMedicalHistorySectionImpl();
		return emsPastMedicalHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfHistoryOfCondition createExistenceOfHistoryOfCondition() {
		ExistenceOfHistoryOfConditionImpl existenceOfHistoryOfCondition = new ExistenceOfHistoryOfConditionImpl();
		return existenceOfHistoryOfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfCondition createHistoryOfCondition() {
		HistoryOfConditionImpl historyOfCondition = new HistoryOfConditionImpl();
		return historyOfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSocialHistorySection createEMSSocialHistorySection() {
		EMSSocialHistorySectionImpl emsSocialHistorySection = new EMSSocialHistorySectionImpl();
		return emsSocialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugUseIndication createExistenceOfDrugUseIndication() {
		ExistenceOfDrugUseIndicationImpl existenceOfDrugUseIndication = new ExistenceOfDrugUseIndicationImpl();
		return existenceOfDrugUseIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugUseIndication createDrugUseIndication() {
		DrugUseIndicationImpl drugUseIndication = new DrugUseIndicationImpl();
		return drugUseIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPhysicalAssessmentSection createEMSPhysicalAssessmentSection() {
		EMSPhysicalAssessmentSectionImpl emsPhysicalAssessmentSection = new EMSPhysicalAssessmentSectionImpl();
		return emsPhysicalAssessmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAssessmentOrganizer createPhysicalAssessmentOrganizer() {
		PhysicalAssessmentOrganizerImpl physicalAssessmentOrganizer = new PhysicalAssessmentOrganizerImpl();
		return physicalAssessmentOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkinAssessment createSkinAssessment() {
		SkinAssessmentImpl skinAssessment = new SkinAssessmentImpl();
		return skinAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientPregnancy createPatientPregnancy() {
		PatientPregnancyImpl patientPregnancy = new PatientPregnancyImpl();
		return patientPregnancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastOralIntake createLastOralIntake() {
		LastOralIntakeImpl lastOralIntake = new LastOralIntakeImpl();
		return lastOralIntake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAge createPatientAge() {
		PatientAgeImpl patientAge = new PatientAgeImpl();
		return patientAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrombolyticContraindications createThrombolyticContraindications() {
		ThrombolyticContraindicationsImpl thrombolyticContraindications = new ThrombolyticContraindicationsImpl();
		return thrombolyticContraindications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarriersToPatientCare createBarriersToPatientCare() {
		BarriersToPatientCareImpl barriersToPatientCare = new BarriersToPatientCareImpl();
		return barriersToPatientCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSMedicationsAdministeredSection createEMSMedicationsAdministeredSection() {
		EMSMedicationsAdministeredSectionImpl emsMedicationsAdministeredSection = new EMSMedicationsAdministeredSectionImpl();
		return emsMedicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministered createMedicationAdministered() {
		MedicationAdministeredImpl medicationAdministered = new MedicationAdministeredImpl();
		return medicationAdministered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProceduresPerformedSection createEMSProceduresPerformedSection() {
		EMSProceduresPerformedSectionImpl emsProceduresPerformedSection = new EMSProceduresPerformedSectionImpl();
		return emsProceduresPerformedSection;
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
	public EMSPatientCareNarrativeSection createEMSPatientCareNarrativeSection() {
		EMSPatientCareNarrativeSectionImpl emsPatientCareNarrativeSection = new EMSPatientCareNarrativeSectionImpl();
		return emsPatientCareNarrativeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSceneSection createEMSSceneSection() {
		EMSSceneSectionImpl emsSceneSection = new EMSSceneSectionImpl();
		return emsSceneSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUnitIndicator createFirstUnitIndicator() {
		FirstUnitIndicatorImpl firstUnitIndicator = new FirstUnitIndicatorImpl();
		return firstUnitIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstUnitOnScene createFirstUnitOnScene() {
		FirstUnitOnSceneImpl firstUnitOnScene = new FirstUnitOnSceneImpl();
		return firstUnitOnScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenePatientCount createScenePatientCount() {
		ScenePatientCountImpl scenePatientCount = new ScenePatientCountImpl();
		return scenePatientCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassCasualtyIndicator createMassCasualtyIndicator() {
		MassCasualtyIndicatorImpl massCasualtyIndicator = new MassCasualtyIndicatorImpl();
		return massCasualtyIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationTypeObservation createLocationTypeObservation() {
		LocationTypeObservationImpl locationTypeObservation = new LocationTypeObservationImpl();
		return locationTypeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispatchSection createEMSDispatchSection() {
		EMSDispatchSectionImpl emsDispatchSection = new EMSDispatchSectionImpl();
		return emsDispatchSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyMedicalDispatchObservation createEmergencyMedicalDispatchObservation() {
		EmergencyMedicalDispatchObservationImpl emergencyMedicalDispatchObservation = new EmergencyMedicalDispatchObservationImpl();
		return emergencyMedicalDispatchObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintReportedByDispatch createComplaintReportedByDispatch() {
		ComplaintReportedByDispatchImpl complaintReportedByDispatch = new ComplaintReportedByDispatchImpl();
		return complaintReportedByDispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispositionSection createEMSDispositionSection() {
		EMSDispositionSectionImpl emsDispositionSection = new EMSDispositionSectionImpl();
		return emsDispositionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfPatientsTransportedObservation createNumberOfPatientsTransportedObservation() {
		NumberOfPatientsTransportedObservationImpl numberOfPatientsTransportedObservation = new NumberOfPatientsTransportedObservationImpl();
		return numberOfPatientsTransportedObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentDispositionObservation createIncidentDispositionObservation() {
		IncidentDispositionObservationImpl incidentDispositionObservation = new IncidentDispositionObservationImpl();
		return incidentDispositionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModeObservation createTransportModeObservation() {
		TransportModeObservationImpl transportModeObservation = new TransportModeObservationImpl();
		return transportModeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodObservation createTransportMethodObservation() {
		TransportMethodObservationImpl transportMethodObservation = new TransportMethodObservationImpl();
		return transportMethodObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForChoosingDestinationObservation createReasonForChoosingDestinationObservation() {
		ReasonForChoosingDestinationObservationImpl reasonForChoosingDestinationObservation = new ReasonForChoosingDestinationObservationImpl();
		return reasonForChoosingDestinationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrearrivalActivationObservation createPrearrivalActivationObservation() {
		PrearrivalActivationObservationImpl prearrivalActivationObservation = new PrearrivalActivationObservationImpl();
		return prearrivalActivationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionChangeAtDestinationObservation createPatientConditionChangeAtDestinationObservation() {
		PatientConditionChangeAtDestinationObservationImpl patientConditionChangeAtDestinationObservation = new PatientConditionChangeAtDestinationObservationImpl();
		return patientConditionChangeAtDestinationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPersonnelAdverseEventSection createEMSPersonnelAdverseEventSection() {
		EMSPersonnelAdverseEventSectionImpl emsPersonnelAdverseEventSection = new EMSPersonnelAdverseEventSectionImpl();
		return emsPersonnelAdverseEventSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventIndicator createAdverseEventIndicator() {
		AdverseEventIndicatorImpl adverseEventIndicator = new AdverseEventIndicatorImpl();
		return adverseEventIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdverseEventTypeObservation createAdverseEventTypeObservation() {
		AdverseEventTypeObservationImpl adverseEventTypeObservation = new AdverseEventTypeObservationImpl();
		return adverseEventTypeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSProtocolSection createEMSProtocolSection() {
		EMSProtocolSectionImpl emsProtocolSection = new EMSProtocolSectionImpl();
		return emsProtocolSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolObservation createProtocolObservation() {
		ProtocolObservationImpl protocolObservation = new ProtocolObservationImpl();
		return protocolObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidatePatientRegistryType createCandidatePatientRegistryType() {
		CandidatePatientRegistryTypeImpl candidatePatientRegistryType = new CandidatePatientRegistryTypeImpl();
		return candidatePatientRegistryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSResponseSection createEMSResponseSection() {
		EMSResponseSectionImpl emsResponseSection = new EMSResponseSectionImpl();
		return emsResponseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayOrganizer createDelayOrganizer() {
		DelayOrganizerImpl delayOrganizer = new DelayOrganizerImpl();
		return delayOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationOrganizer createDispatchLocationOrganizer() {
		DispatchLocationOrganizerImpl dispatchLocationOrganizer = new DispatchLocationOrganizerImpl();
		return dispatchLocationOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOdometerReadingOrganizer createResponseOdometerReadingOrganizer() {
		ResponseOdometerReadingOrganizerImpl responseOdometerReadingOrganizer = new ResponseOdometerReadingOrganizerImpl();
		return responseOdometerReadingOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseModeToScene createResponseModeToScene() {
		ResponseModeToSceneImpl responseModeToScene = new ResponseModeToSceneImpl();
		return responseModeToScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSSituationSection createEMSSituationSection() {
		EMSSituationSectionImpl emsSituationSection = new EMSSituationSectionImpl();
		return emsSituationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complaint createComplaint() {
		ComplaintImpl complaint = new ComplaintImpl();
		return complaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleInjury createPossibleInjury() {
		PossibleInjuryImpl possibleInjury = new PossibleInjuryImpl();
		return possibleInjury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderPrimaryImpression createProviderPrimaryImpression() {
		ProviderPrimaryImpressionImpl providerPrimaryImpression = new ProviderPrimaryImpressionImpl();
		return providerPrimaryImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarySymptom createPrimarySymptom() {
		PrimarySymptomImpl primarySymptom = new PrimarySymptomImpl();
		return primarySymptom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSymptoms createOtherSymptoms() {
		OtherSymptomsImpl otherSymptoms = new OtherSymptomsImpl();
		return otherSymptoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderSecondaryImpressions createProviderSecondaryImpressions() {
		ProviderSecondaryImpressionsImpl providerSecondaryImpressions = new ProviderSecondaryImpressionsImpl();
		return providerSecondaryImpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPatientAcuity createInitialPatientAcuity() {
		InitialPatientAcuityImpl initialPatientAcuity = new InitialPatientAcuityImpl();
		return initialPatientAcuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimesSection createTimesSection() {
		TimesSectionImpl timesSection = new TimesSectionImpl();
		return timesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTime createCallTime() {
		CallTimeImpl callTime = new CallTimeImpl();
		return callTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitNotifiedTime createUnitNotifiedTime() {
		UnitNotifiedTimeImpl unitNotifiedTime = new UnitNotifiedTimeImpl();
		return unitNotifiedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitEnRouteTime createUnitEnRouteTime() {
		UnitEnRouteTimeImpl unitEnRouteTime = new UnitEnRouteTimeImpl();
		return unitEnRouteTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOnSceneTime createUnitOnSceneTime() {
		UnitOnSceneTimeImpl unitOnSceneTime = new UnitOnSceneTimeImpl();
		return unitOnSceneTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAtPatientTime createUnitAtPatientTime() {
		UnitAtPatientTimeImpl unitAtPatientTime = new UnitAtPatientTimeImpl();
		return unitAtPatientTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLeftSceneTime createUnitLeftSceneTime() {
		UnitLeftSceneTimeImpl unitLeftSceneTime = new UnitLeftSceneTimeImpl();
		return unitLeftSceneTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientArrivedAtDestinationTime createPatientArrivedAtDestinationTime() {
		PatientArrivedAtDestinationTimeImpl patientArrivedAtDestinationTime = new PatientArrivedAtDestinationTimeImpl();
		return patientArrivedAtDestinationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitBackInServiceTime createUnitBackInServiceTime() {
		UnitBackInServiceTimeImpl unitBackInServiceTime = new UnitBackInServiceTimeImpl();
		return unitBackInServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchNotifiedTime createDispatchNotifiedTime() {
		DispatchNotifiedTimeImpl dispatchNotifiedTime = new DispatchNotifiedTimeImpl();
		return dispatchNotifiedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSVitalSignsSection createEMSVitalSignsSection() {
		EMSVitalSignsSectionImpl emsVitalSignsSection = new EMSVitalSignsSectionImpl();
		return emsVitalSignsSection;
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
	public PriorAidVitals createPriorAidVitals() {
		PriorAidVitalsImpl priorAidVitals = new PriorAidVitalsImpl();
		return priorAidVitals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalVitalSignsOrganizer createAdditionalVitalSignsOrganizer() {
		AdditionalVitalSignsOrganizerImpl additionalVitalSignsOrganizer = new AdditionalVitalSignsOrganizerImpl();
		return additionalVitalSignsOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrokeScore createStrokeScore() {
		StrokeScoreImpl strokeScore = new StrokeScoreImpl();
		return strokeScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PainScore createPainScore() {
		PainScoreImpl painScore = new PainScoreImpl();
		return painScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfResponsiveness createLevelOfResponsiveness() {
		LevelOfResponsivenessImpl levelOfResponsiveness = new LevelOfResponsivenessImpl();
		return levelOfResponsiveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloodGlucose createBloodGlucose() {
		BloodGlucoseImpl bloodGlucose = new BloodGlucoseImpl();
		return bloodGlucose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbonMonoxide createCarbonMonoxide() {
		CarbonMonoxideImpl carbonMonoxide = new CarbonMonoxideImpl();
		return carbonMonoxide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbonDioxide createCarbonDioxide() {
		CarbonDioxideImpl carbonDioxide = new CarbonDioxideImpl();
		return carbonDioxide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacRhythm createCardiacRhythm() {
		CardiacRhythmImpl cardiacRhythm = new CardiacRhythmImpl();
		return cardiacRhythm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowComaScoreOrganizer createGlasgowComaScoreOrganizer() {
		GlasgowComaScoreOrganizerImpl glasgowComaScoreOrganizer = new GlasgowComaScoreOrganizerImpl();
		return glasgowComaScoreOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowEye createGlasgowEye() {
		GlasgowEyeImpl glasgowEye = new GlasgowEyeImpl();
		return glasgowEye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowMotor createGlasgowMotor() {
		GlasgowMotorImpl glasgowMotor = new GlasgowMotorImpl();
		return glasgowMotor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowQualifier createGlasgowQualifier() {
		GlasgowQualifierImpl glasgowQualifier = new GlasgowQualifierImpl();
		return glasgowQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowTotal createGlasgowTotal() {
		GlasgowTotalImpl glasgowTotal = new GlasgowTotalImpl();
		return glasgowTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlasgowVerbal createGlasgowVerbal() {
		GlasgowVerbalImpl glasgowVerbal = new GlasgowVerbalImpl();
		return glasgowVerbal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSInjuryIncidentDescriptionSection createEMSInjuryIncidentDescriptionSection() {
		EMSInjuryIncidentDescriptionSectionImpl emsInjuryIncidentDescriptionSection = new EMSInjuryIncidentDescriptionSectionImpl();
		return emsInjuryIncidentDescriptionSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryCauseCategory createInjuryCauseCategory() {
		InjuryCauseCategoryImpl injuryCauseCategory = new InjuryCauseCategoryImpl();
		return injuryCauseCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryMechanism createInjuryMechanism() {
		InjuryMechanismImpl injuryMechanism = new InjuryMechanismImpl();
		return injuryMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraumaCenterCriteria createTraumaCenterCriteria() {
		TraumaCenterCriteriaImpl traumaCenterCriteria = new TraumaCenterCriteriaImpl();
		return traumaCenterCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryRiskFactor createInjuryRiskFactor() {
		InjuryRiskFactorImpl injuryRiskFactor = new InjuryRiskFactorImpl();
		return injuryRiskFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleImpactArea createVehicleImpactArea() {
		VehicleImpactAreaImpl vehicleImpactArea = new VehicleImpactAreaImpl();
		return vehicleImpactArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocationInVehicle createPatientLocationInVehicle() {
		PatientLocationInVehicleImpl patientLocationInVehicle = new PatientLocationInVehicleImpl();
		return patientLocationInVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleOccupantSafetyEquipment createVehicleOccupantSafetyEquipment() {
		VehicleOccupantSafetyEquipmentImpl vehicleOccupantSafetyEquipment = new VehicleOccupantSafetyEquipmentImpl();
		return vehicleOccupantSafetyEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirbagDeploymentStatus createAirbagDeploymentStatus() {
		AirbagDeploymentStatusImpl airbagDeploymentStatus = new AirbagDeploymentStatusImpl();
		return airbagDeploymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeightOfFall createHeightOfFall() {
		HeightOfFallImpl heightOfFall = new HeightOfFallImpl();
		return heightOfFall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisasterType createDisasterType() {
		DisasterTypeImpl disasterType = new DisasterTypeImpl();
		return disasterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSBillingSection createEMSBillingSection() {
		EMSBillingSectionImpl emsBillingSection = new EMSBillingSectionImpl();
		return emsBillingSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingCondition createBillingCondition() {
		BillingConditionImpl billingCondition = new BillingConditionImpl();
		return billingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelOfServiceObservation createLevelOfServiceObservation() {
		LevelOfServiceObservationImpl levelOfServiceObservation = new LevelOfServiceObservationImpl();
		return levelOfServiceObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDrugAllergy createEMSDrugAllergy() {
		EMSDrugAllergyImpl emsDrugAllergy = new EMSDrugAllergyImpl();
		return emsDrugAllergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfDrugAllergyObservation createExistenceOfDrugAllergyObservation() {
		ExistenceOfDrugAllergyObservationImpl existenceOfDrugAllergyObservation = new ExistenceOfDrugAllergyObservationImpl();
		return existenceOfDrugAllergyObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationNotAdministeredReasonObservation createMedicationNotAdministeredReasonObservation() {
		MedicationNotAdministeredReasonObservationImpl medicationNotAdministeredReasonObservation = new MedicationNotAdministeredReasonObservationImpl();
		return medicationNotAdministeredReasonObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationResponseObservation createMedicationResponseObservation() {
		MedicationResponseObservationImpl medicationResponseObservation = new MedicationResponseObservationImpl();
		return medicationResponseObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationComplicationObservation createMedicationComplicationObservation() {
		MedicationComplicationObservationImpl medicationComplicationObservation = new MedicationComplicationObservationImpl();
		return medicationComplicationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPriorAdministrationObservation createMedicationPriorAdministrationObservation() {
		MedicationPriorAdministrationObservationImpl medicationPriorAdministrationObservation = new MedicationPriorAdministrationObservationImpl();
		return medicationPriorAdministrationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientBodyWeight createPatientBodyWeight() {
		PatientBodyWeightImpl patientBodyWeight = new PatientBodyWeightImpl();
		return patientBodyWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthBasedPatientBodyWeightClass createLengthBasedPatientBodyWeightClass() {
		LengthBasedPatientBodyWeightClassImpl lengthBasedPatientBodyWeightClass = new LengthBasedPatientBodyWeightClassImpl();
		return lengthBasedPatientBodyWeightClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceAssessment createFaceAssessment() {
		FaceAssessmentImpl faceAssessment = new FaceAssessmentImpl();
		return faceAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadAssessment createHeadAssessment() {
		HeadAssessmentImpl headAssessment = new HeadAssessmentImpl();
		return headAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeckAssessment createNeckAssessment() {
		NeckAssessmentImpl neckAssessment = new NeckAssessmentImpl();
		return neckAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChestAndLungsAssessment createChestAndLungsAssessment() {
		ChestAndLungsAssessmentImpl chestAndLungsAssessment = new ChestAndLungsAssessmentImpl();
		return chestAndLungsAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeartAssessment createHeartAssessment() {
		HeartAssessmentImpl heartAssessment = new HeartAssessmentImpl();
		return heartAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbdomenAssessment createAbdomenAssessment() {
		AbdomenAssessmentImpl abdomenAssessment = new AbdomenAssessmentImpl();
		return abdomenAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelvicAndGenitourinaryAssessment createPelvicAndGenitourinaryAssessment() {
		PelvicAndGenitourinaryAssessmentImpl pelvicAndGenitourinaryAssessment = new PelvicAndGenitourinaryAssessmentImpl();
		return pelvicAndGenitourinaryAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackAndSpineAssessment createBackAndSpineAssessment() {
		BackAndSpineAssessmentImpl backAndSpineAssessment = new BackAndSpineAssessmentImpl();
		return backAndSpineAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtremitiesAssessment createExtremitiesAssessment() {
		ExtremitiesAssessmentImpl extremitiesAssessment = new ExtremitiesAssessmentImpl();
		return extremitiesAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EyeAssessment createEyeAssessment() {
		EyeAssessmentImpl eyeAssessment = new EyeAssessmentImpl();
		return eyeAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusAssessment createMentalStatusAssessment() {
		MentalStatusAssessmentImpl mentalStatusAssessment = new MentalStatusAssessmentImpl();
		return mentalStatusAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestWithTiming createCardiacArrestWithTiming() {
		CardiacArrestWithTimingImpl cardiacArrestWithTiming = new CardiacArrestWithTimingImpl();
		return cardiacArrestWithTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestCause createCardiacArrestCause() {
		CardiacArrestCauseImpl cardiacArrestCause = new CardiacArrestCauseImpl();
		return cardiacArrestCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorCPR createPriorCPR() {
		PriorCPRImpl priorCPR = new PriorCPRImpl();
		return priorCPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAEDUse createPriorAEDUse() {
		PriorAEDUseImpl priorAEDUse = new PriorAEDUseImpl();
		return priorAEDUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrestRhythm createArrestRhythm() {
		ArrestRhythmImpl arrestRhythm = new ArrestRhythmImpl();
		return arrestRhythm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnOfSpontaneousCirculation createReturnOfSpontaneousCirculation() {
		ReturnOfSpontaneousCirculationImpl returnOfSpontaneousCirculation = new ReturnOfSpontaneousCirculationImpl();
		return returnOfSpontaneousCirculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationRhythm createDestinationRhythm() {
		DestinationRhythmImpl destinationRhythm = new DestinationRhythmImpl();
		return destinationRhythm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbandonedProcedureReasonObservation createAbandonedProcedureReasonObservation() {
		AbandonedProcedureReasonObservationImpl abandonedProcedureReasonObservation = new AbandonedProcedureReasonObservationImpl();
		return abandonedProcedureReasonObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePriorIndicator createProcedurePriorIndicator() {
		ProcedurePriorIndicatorImpl procedurePriorIndicator = new ProcedurePriorIndicatorImpl();
		return procedurePriorIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureNumberOfAttemptsObservation createProcedureNumberOfAttemptsObservation() {
		ProcedureNumberOfAttemptsObservationImpl procedureNumberOfAttemptsObservation = new ProcedureNumberOfAttemptsObservationImpl();
		return procedureNumberOfAttemptsObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureSuccessfulObservation createProcedureSuccessfulObservation() {
		ProcedureSuccessfulObservationImpl procedureSuccessfulObservation = new ProcedureSuccessfulObservationImpl();
		return procedureSuccessfulObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureComplicationsObservation createProcedureComplicationsObservation() {
		ProcedureComplicationsObservationImpl procedureComplicationsObservation = new ProcedureComplicationsObservationImpl();
		return procedureComplicationsObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePatientResponseObservation createProcedurePatientResponseObservation() {
		ProcedurePatientResponseObservationImpl procedurePatientResponseObservation = new ProcedurePatientResponseObservationImpl();
		return procedurePatientResponseObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirwayConfirmationObservation createAirwayConfirmationObservation() {
		AirwayConfirmationObservationImpl airwayConfirmationObservation = new AirwayConfirmationObservationImpl();
		return airwayConfirmationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonProcedureNotAttemptedObservation createReasonProcedureNotAttemptedObservation() {
		ReasonProcedureNotAttemptedObservationImpl reasonProcedureNotAttemptedObservation = new ReasonProcedureNotAttemptedObservationImpl();
		return reasonProcedureNotAttemptedObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintType createComplaintType() {
		ComplaintTypeImpl complaintType = new ComplaintTypeImpl();
		return complaintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintDuration createComplaintDuration() {
		ComplaintDurationImpl complaintDuration = new ComplaintDurationImpl();
		return complaintDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintOrganSystem createComplaintOrganSystem() {
		ComplaintOrganSystemImpl complaintOrganSystem = new ComplaintOrganSystemImpl();
		return complaintOrganSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurologicalAssessment createNeurologicalAssessment() {
		NeurologicalAssessmentImpl neurologicalAssessment = new NeurologicalAssessmentImpl();
		return neurologicalAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystolicBloodPressure createSystolicBloodPressure() {
		SystolicBloodPressureImpl systolicBloodPressure = new SystolicBloodPressureImpl();
		return systolicBloodPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiastolicBloodPressure createDiastolicBloodPressure() {
		DiastolicBloodPressureImpl diastolicBloodPressure = new DiastolicBloodPressureImpl();
		return diastolicBloodPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeartRate createHeartRate() {
		HeartRateImpl heartRate = new HeartRateImpl();
		return heartRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespiratoryRate createRespiratoryRate() {
		RespiratoryRateImpl respiratoryRate = new RespiratoryRateImpl();
		return respiratoryRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyTemperature createBodyTemperature() {
		BodyTemperatureImpl bodyTemperature = new BodyTemperatureImpl();
		return bodyTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OxygenSaturation createOxygenSaturation() {
		OxygenSaturationImpl oxygenSaturation = new OxygenSaturationImpl();
		return oxygenSaturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolAgeCategory createProtocolAgeCategory() {
		ProtocolAgeCategoryImpl protocolAgeCategory = new ProtocolAgeCategoryImpl();
		return protocolAgeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationName createDispatchLocationName() {
		DispatchLocationNameImpl dispatchLocationName = new DispatchLocationNameImpl();
		return dispatchLocationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationLatitude createDispatchLocationLatitude() {
		DispatchLocationLatitudeImpl dispatchLocationLatitude = new DispatchLocationLatitudeImpl();
		return dispatchLocationLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchLocationLongitude createDispatchLocationLongitude() {
		DispatchLocationLongitudeImpl dispatchLocationLongitude = new DispatchLocationLongitudeImpl();
		return dispatchLocationLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchDelay createDispatchDelay() {
		DispatchDelayImpl dispatchDelay = new DispatchDelayImpl();
		return dispatchDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDelay createResponseDelay() {
		ResponseDelayImpl responseDelay = new ResponseDelayImpl();
		return responseDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneDelay createSceneDelay() {
		SceneDelayImpl sceneDelay = new SceneDelayImpl();
		return sceneDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportDelay createTransportDelay() {
		TransportDelayImpl transportDelay = new TransportDelayImpl();
		return transportDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnaroundDelay createTurnaroundDelay() {
		TurnaroundDelayImpl turnaroundDelay = new TurnaroundDelayImpl();
		return turnaroundDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBeginningOdometerReading createResponseBeginningOdometerReading() {
		ResponseBeginningOdometerReadingImpl responseBeginningOdometerReading = new ResponseBeginningOdometerReadingImpl();
		return responseBeginningOdometerReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseOnSceneOdometerReading createResponseOnSceneOdometerReading() {
		ResponseOnSceneOdometerReadingImpl responseOnSceneOdometerReading = new ResponseOnSceneOdometerReadingImpl();
		return responseOnSceneOdometerReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDestinationOdometerReading createResponseDestinationOdometerReading() {
		ResponseDestinationOdometerReadingImpl responseDestinationOdometerReading = new ResponseDestinationOdometerReadingImpl();
		return responseDestinationOdometerReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEndingOdometerReading createResponseEndingOdometerReading() {
		ResponseEndingOdometerReadingImpl responseEndingOdometerReading = new ResponseEndingOdometerReadingImpl();
		return responseEndingOdometerReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergyOrganizerActuallyDreg createNonDrugAllergyOrganizerActuallyDreg() {
		NonDrugAllergyOrganizerActuallyDregImpl nonDrugAllergyOrganizerActuallyDreg = new NonDrugAllergyOrganizerActuallyDregImpl();
		return nonDrugAllergyOrganizerActuallyDreg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDrugAllergyOrganizer createEMSDrugAllergyOrganizer() {
		EMSDrugAllergyOrganizerImpl emsDrugAllergyOrganizer = new EMSDrugAllergyOrganizerImpl();
		return emsDrugAllergyOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspcrPackage getEmspcrPackage() {
		return (EmspcrPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmspcrPackage getPackage() {
		return EmspcrPackage.eINSTANCE;
	}

} // EmspcrFactoryImpl
