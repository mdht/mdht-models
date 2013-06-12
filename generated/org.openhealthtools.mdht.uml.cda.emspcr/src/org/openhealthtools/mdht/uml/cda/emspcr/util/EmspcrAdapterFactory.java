/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmspcrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspcrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmspcrPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmspcrSwitch<Adapter> modelSwitch =
		new EmspcrSwitch<Adapter>() {
			@Override
			public Adapter casePatientCareReport(PatientCareReport object) {
				return createPatientCareReportAdapter();
			}
			@Override
			public Adapter caseBillingSection(BillingSection object) {
				return createBillingSectionAdapter();
			}
			@Override
			public Adapter caseBillingCondition(BillingCondition object) {
				return createBillingConditionAdapter();
			}
			@Override
			public Adapter caseLevelOfServiceObservation(LevelOfServiceObservation object) {
				return createLevelOfServiceObservationAdapter();
			}
			@Override
			public Adapter caseCurrentMedicationSection(CurrentMedicationSection object) {
				return createCurrentMedicationSectionAdapter();
			}
			@Override
			public Adapter caseCurrentlyOnMedication(CurrentlyOnMedication object) {
				return createCurrentlyOnMedicationAdapter();
			}
			@Override
			public Adapter casePatientOnAnticoagulants(PatientOnAnticoagulants object) {
				return createPatientOnAnticoagulantsAdapter();
			}
			@Override
			public Adapter caseCurrentMedication(CurrentMedication object) {
				return createCurrentMedicationAdapter();
			}
			@Override
			public Adapter caseCardiacArrestEventSection(CardiacArrestEventSection object) {
				return createCardiacArrestEventSectionAdapter();
			}
			@Override
			public Adapter caseCardiacArrestExistence(CardiacArrestExistence object) {
				return createCardiacArrestExistenceAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
				return createAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseAdvancedDirectiveObservation(AdvancedDirectiveObservation object) {
				return createAdvancedDirectiveObservationAdapter();
			}
			@Override
			public Adapter caseAllergiesAndAdverseReactionsSection(AllergiesAndAdverseReactionsSection object) {
				return createAllergiesAndAdverseReactionsSectionAdapter();
			}
			@Override
			public Adapter caseExistenceOfDrugAllergyObservation(ExistenceOfDrugAllergyObservation object) {
				return createExistenceOfDrugAllergyObservationAdapter();
			}
			@Override
			public Adapter caseDrugAllergyProblemAct(DrugAllergyProblemAct object) {
				return createDrugAllergyProblemActAdapter();
			}
			@Override
			public Adapter caseEnvironmentalAllergies(EnvironmentalAllergies object) {
				return createEnvironmentalAllergiesAdapter();
			}
			@Override
			public Adapter caseExistenceOfEnvironmentalAllergy(ExistenceOfEnvironmentalAllergy object) {
				return createExistenceOfEnvironmentalAllergyAdapter();
			}
			@Override
			public Adapter caseEnvironmentalAllergy(EnvironmentalAllergy object) {
				return createEnvironmentalAllergyAdapter();
			}
			@Override
			public Adapter casePastMedicalHistorySection(PastMedicalHistorySection object) {
				return createPastMedicalHistorySectionAdapter();
			}
			@Override
			public Adapter caseExistenceOfHistoryOfCondition(ExistenceOfHistoryOfCondition object) {
				return createExistenceOfHistoryOfConditionAdapter();
			}
			@Override
			public Adapter caseHistoryOfCondition(HistoryOfCondition object) {
				return createHistoryOfConditionAdapter();
			}
			@Override
			public Adapter caseHistoryOfProceduresOrganizer(HistoryOfProceduresOrganizer object) {
				return createHistoryOfProceduresOrganizerAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(SocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseExistenceOfDrugUseIndication(ExistenceOfDrugUseIndication object) {
				return createExistenceOfDrugUseIndicationAdapter();
			}
			@Override
			public Adapter caseDrugUseIndication(DrugUseIndication object) {
				return createDrugUseIndicationAdapter();
			}
			@Override
			public Adapter casePhysicalAssessmentSection(PhysicalAssessmentSection object) {
				return createPhysicalAssessmentSectionAdapter();
			}
			@Override
			public Adapter casePhysicalAssessmentOrganizer(PhysicalAssessmentOrganizer object) {
				return createPhysicalAssessmentOrganizerAdapter();
			}
			@Override
			public Adapter caseSkinAssessment(SkinAssessment object) {
				return createSkinAssessmentAdapter();
			}
			@Override
			public Adapter casePatientPregnancy(PatientPregnancy object) {
				return createPatientPregnancyAdapter();
			}
			@Override
			public Adapter caseLastOralIntake(LastOralIntake object) {
				return createLastOralIntakeAdapter();
			}
			@Override
			public Adapter casePatientAge(PatientAge object) {
				return createPatientAgeAdapter();
			}
			@Override
			public Adapter caseThrombolyticContraindications(ThrombolyticContraindications object) {
				return createThrombolyticContraindicationsAdapter();
			}
			@Override
			public Adapter caseBarriersToPatientCare(BarriersToPatientCare object) {
				return createBarriersToPatientCareAdapter();
			}
			@Override
			public Adapter caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
				return createMedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter caseMedicationAdministered(MedicationAdministered object) {
				return createMedicationAdministeredAdapter();
			}
			@Override
			public Adapter caseProceduresPerformedSection(ProceduresPerformedSection object) {
				return createProceduresPerformedSectionAdapter();
			}
			@Override
			public Adapter caseProcedure(Procedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter casePatientCareNarrativeSection(PatientCareNarrativeSection object) {
				return createPatientCareNarrativeSectionAdapter();
			}
			@Override
			public Adapter caseSceneSection(SceneSection object) {
				return createSceneSectionAdapter();
			}
			@Override
			public Adapter caseFirstUnitIndicator(FirstUnitIndicator object) {
				return createFirstUnitIndicatorAdapter();
			}
			@Override
			public Adapter caseFirstUnitOnScene(FirstUnitOnScene object) {
				return createFirstUnitOnSceneAdapter();
			}
			@Override
			public Adapter caseScenePatientCount(ScenePatientCount object) {
				return createScenePatientCountAdapter();
			}
			@Override
			public Adapter caseMassCasualtyIndicator(MassCasualtyIndicator object) {
				return createMassCasualtyIndicatorAdapter();
			}
			@Override
			public Adapter caseLocationTypeObservation(LocationTypeObservation object) {
				return createLocationTypeObservationAdapter();
			}
			@Override
			public Adapter caseDispatchSection(DispatchSection object) {
				return createDispatchSectionAdapter();
			}
			@Override
			public Adapter caseEmergencyMedicalDispatchObservation(EmergencyMedicalDispatchObservation object) {
				return createEmergencyMedicalDispatchObservationAdapter();
			}
			@Override
			public Adapter caseComplaintReportedByDispatch(ComplaintReportedByDispatch object) {
				return createComplaintReportedByDispatchAdapter();
			}
			@Override
			public Adapter caseDispositionSection(DispositionSection object) {
				return createDispositionSectionAdapter();
			}
			@Override
			public Adapter caseTransportMethodObservation(TransportMethodObservation object) {
				return createTransportMethodObservationAdapter();
			}
			@Override
			public Adapter caseNumberOfPatientsObservation(NumberOfPatientsObservation object) {
				return createNumberOfPatientsObservationAdapter();
			}
			@Override
			public Adapter caseIncidentDispositionObservation(IncidentDispositionObservation object) {
				return createIncidentDispositionObservationAdapter();
			}
			@Override
			public Adapter caseTransportModeObservation(TransportModeObservation object) {
				return createTransportModeObservationAdapter();
			}
			@Override
			public Adapter caseReasonForChoosingDestinationObservation(ReasonForChoosingDestinationObservation object) {
				return createReasonForChoosingDestinationObservationAdapter();
			}
			@Override
			public Adapter casePrearrivalActivationObservation(PrearrivalActivationObservation object) {
				return createPrearrivalActivationObservationAdapter();
			}
			@Override
			public Adapter casePatientConditionChangeAtDestinationObservation(PatientConditionChangeAtDestinationObservation object) {
				return createPatientConditionChangeAtDestinationObservationAdapter();
			}
			@Override
			public Adapter casePersonnelAdverseEventSection(PersonnelAdverseEventSection object) {
				return createPersonnelAdverseEventSectionAdapter();
			}
			@Override
			public Adapter caseAdverseEventIndicator(AdverseEventIndicator object) {
				return createAdverseEventIndicatorAdapter();
			}
			@Override
			public Adapter caseAdverseEventTypeObservation(AdverseEventTypeObservation object) {
				return createAdverseEventTypeObservationAdapter();
			}
			@Override
			public Adapter caseProtocolSection(ProtocolSection object) {
				return createProtocolSectionAdapter();
			}
			@Override
			public Adapter caseProtocolObservation(ProtocolObservation object) {
				return createProtocolObservationAdapter();
			}
			@Override
			public Adapter caseCandidatePatientRegistryType(CandidatePatientRegistryType object) {
				return createCandidatePatientRegistryTypeAdapter();
			}
			@Override
			public Adapter caseResponseSection(ResponseSection object) {
				return createResponseSectionAdapter();
			}
			@Override
			public Adapter caseDelayOrganizer(DelayOrganizer object) {
				return createDelayOrganizerAdapter();
			}
			@Override
			public Adapter caseDispatchLocationOrganizer(DispatchLocationOrganizer object) {
				return createDispatchLocationOrganizerAdapter();
			}
			@Override
			public Adapter caseResponseOdometerReadingOrganizer(ResponseOdometerReadingOrganizer object) {
				return createResponseOdometerReadingOrganizerAdapter();
			}
			@Override
			public Adapter caseResponseModeToScene(ResponseModeToScene object) {
				return createResponseModeToSceneAdapter();
			}
			@Override
			public Adapter caseSituationSection(SituationSection object) {
				return createSituationSectionAdapter();
			}
			@Override
			public Adapter caseComplaint(Complaint object) {
				return createComplaintAdapter();
			}
			@Override
			public Adapter casePossibleInjury(PossibleInjury object) {
				return createPossibleInjuryAdapter();
			}
			@Override
			public Adapter caseProviderPrimaryImpression(ProviderPrimaryImpression object) {
				return createProviderPrimaryImpressionAdapter();
			}
			@Override
			public Adapter casePrimarySymptom(PrimarySymptom object) {
				return createPrimarySymptomAdapter();
			}
			@Override
			public Adapter caseOtherSymptoms(OtherSymptoms object) {
				return createOtherSymptomsAdapter();
			}
			@Override
			public Adapter caseProviderSecondaryImpressions(ProviderSecondaryImpressions object) {
				return createProviderSecondaryImpressionsAdapter();
			}
			@Override
			public Adapter caseInitialPatientAcuity(InitialPatientAcuity object) {
				return createInitialPatientAcuityAdapter();
			}
			@Override
			public Adapter caseTimesSection(TimesSection object) {
				return createTimesSectionAdapter();
			}
			@Override
			public Adapter caseCallTime(CallTime object) {
				return createCallTimeAdapter();
			}
			@Override
			public Adapter caseUnitNotifiedTime(UnitNotifiedTime object) {
				return createUnitNotifiedTimeAdapter();
			}
			@Override
			public Adapter caseUnitEnRouteTime(UnitEnRouteTime object) {
				return createUnitEnRouteTimeAdapter();
			}
			@Override
			public Adapter caseUnitOnSceneTime(UnitOnSceneTime object) {
				return createUnitOnSceneTimeAdapter();
			}
			@Override
			public Adapter caseUnitAtPatienttTime(UnitAtPatienttTime object) {
				return createUnitAtPatienttTimeAdapter();
			}
			@Override
			public Adapter caseUnitLeftSceneTime(UnitLeftSceneTime object) {
				return createUnitLeftSceneTimeAdapter();
			}
			@Override
			public Adapter casePatientArrivedAtDestinationTime(PatientArrivedAtDestinationTime object) {
				return createPatientArrivedAtDestinationTimeAdapter();
			}
			@Override
			public Adapter caseUnitBackInServiceTime(UnitBackInServiceTime object) {
				return createUnitBackInServiceTimeAdapter();
			}
			@Override
			public Adapter caseDispatchNotifiedTime(DispatchNotifiedTime object) {
				return createDispatchNotifiedTimeAdapter();
			}
			@Override
			public Adapter caseVitalSignsSection(VitalSignsSection object) {
				return createVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseVitalSignsOrganizer(VitalSignsOrganizer object) {
				return createVitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter casePriorAidVitals(PriorAidVitals object) {
				return createPriorAidVitalsAdapter();
			}
			@Override
			public Adapter caseAdditionalVitalSignsOrganizer(AdditionalVitalSignsOrganizer object) {
				return createAdditionalVitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter caseStrokeScore(StrokeScore object) {
				return createStrokeScoreAdapter();
			}
			@Override
			public Adapter casePainScore(PainScore object) {
				return createPainScoreAdapter();
			}
			@Override
			public Adapter caseLevelOfResponsiveness(LevelOfResponsiveness object) {
				return createLevelOfResponsivenessAdapter();
			}
			@Override
			public Adapter caseBloodGlucose(BloodGlucose object) {
				return createBloodGlucoseAdapter();
			}
			@Override
			public Adapter caseCarbonMonoxide(CarbonMonoxide object) {
				return createCarbonMonoxideAdapter();
			}
			@Override
			public Adapter caseCarbonDioxide(CarbonDioxide object) {
				return createCarbonDioxideAdapter();
			}
			@Override
			public Adapter caseCardiacRhythm(CardiacRhythm object) {
				return createCardiacRhythmAdapter();
			}
			@Override
			public Adapter caseGlasgowComaScoreOrganizer(GlasgowComaScoreOrganizer object) {
				return createGlasgowComaScoreOrganizerAdapter();
			}
			@Override
			public Adapter caseGlasgowEye(GlasgowEye object) {
				return createGlasgowEyeAdapter();
			}
			@Override
			public Adapter caseGlasgowMotor(GlasgowMotor object) {
				return createGlasgowMotorAdapter();
			}
			@Override
			public Adapter caseGlasgowQualifier(GlasgowQualifier object) {
				return createGlasgowQualifierAdapter();
			}
			@Override
			public Adapter caseGlasgowTotal(GlasgowTotal object) {
				return createGlasgowTotalAdapter();
			}
			@Override
			public Adapter caseGlasgowVerbal(GlasgowVerbal object) {
				return createGlasgowVerbalAdapter();
			}
			@Override
			public Adapter caseInjuryIncidentDescriptionSection(InjuryIncidentDescriptionSection object) {
				return createInjuryIncidentDescriptionSectionAdapter();
			}
			@Override
			public Adapter caseInjuryCauseCategory(InjuryCauseCategory object) {
				return createInjuryCauseCategoryAdapter();
			}
			@Override
			public Adapter caseInjuryMechanism(InjuryMechanism object) {
				return createInjuryMechanismAdapter();
			}
			@Override
			public Adapter caseTraumaCenterCriteria(TraumaCenterCriteria object) {
				return createTraumaCenterCriteriaAdapter();
			}
			@Override
			public Adapter caseInjuryRiskFactor(InjuryRiskFactor object) {
				return createInjuryRiskFactorAdapter();
			}
			@Override
			public Adapter caseVehicleImpactArea(VehicleImpactArea object) {
				return createVehicleImpactAreaAdapter();
			}
			@Override
			public Adapter casePatientLocationInVehicle(PatientLocationInVehicle object) {
				return createPatientLocationInVehicleAdapter();
			}
			@Override
			public Adapter caseVehicleOccupantSafetyEquipment(VehicleOccupantSafetyEquipment object) {
				return createVehicleOccupantSafetyEquipmentAdapter();
			}
			@Override
			public Adapter caseAirbagDeploymentStatus(AirbagDeploymentStatus object) {
				return createAirbagDeploymentStatusAdapter();
			}
			@Override
			public Adapter caseHeightOfFall(HeightOfFall object) {
				return createHeightOfFallAdapter();
			}
			@Override
			public Adapter caseDisasterType(DisasterType object) {
				return createDisasterTypeAdapter();
			}
			@Override
			public Adapter caseMedicationNotAdministeredReasonObservation(MedicationNotAdministeredReasonObservation object) {
				return createMedicationNotAdministeredReasonObservationAdapter();
			}
			@Override
			public Adapter caseMedicationResponseObservation(MedicationResponseObservation object) {
				return createMedicationResponseObservationAdapter();
			}
			@Override
			public Adapter caseMedicationComplicationObservation(MedicationComplicationObservation object) {
				return createMedicationComplicationObservationAdapter();
			}
			@Override
			public Adapter caseMedicationPriorAdministrationObservation(MedicationPriorAdministrationObservation object) {
				return createMedicationPriorAdministrationObservationAdapter();
			}
			@Override
			public Adapter casePatientBodyWeight(PatientBodyWeight object) {
				return createPatientBodyWeightAdapter();
			}
			@Override
			public Adapter caseLengthBasedPatientBodyWeightClass(LengthBasedPatientBodyWeightClass object) {
				return createLengthBasedPatientBodyWeightClassAdapter();
			}
			@Override
			public Adapter caseFaceAssessment(FaceAssessment object) {
				return createFaceAssessmentAdapter();
			}
			@Override
			public Adapter caseHeadAssessment(HeadAssessment object) {
				return createHeadAssessmentAdapter();
			}
			@Override
			public Adapter caseNeckAssessment(NeckAssessment object) {
				return createNeckAssessmentAdapter();
			}
			@Override
			public Adapter caseChestAndLungsAssessment(ChestAndLungsAssessment object) {
				return createChestAndLungsAssessmentAdapter();
			}
			@Override
			public Adapter caseHeartAssessment(HeartAssessment object) {
				return createHeartAssessmentAdapter();
			}
			@Override
			public Adapter caseAbdomenAssessment(AbdomenAssessment object) {
				return createAbdomenAssessmentAdapter();
			}
			@Override
			public Adapter casePelvicAndGenitourinaryAssessment(PelvicAndGenitourinaryAssessment object) {
				return createPelvicAndGenitourinaryAssessmentAdapter();
			}
			@Override
			public Adapter caseBackAndSpineAssessment(BackAndSpineAssessment object) {
				return createBackAndSpineAssessmentAdapter();
			}
			@Override
			public Adapter caseExtremitiesAssessment(ExtremitiesAssessment object) {
				return createExtremitiesAssessmentAdapter();
			}
			@Override
			public Adapter caseEyeAssessment(EyeAssessment object) {
				return createEyeAssessmentAdapter();
			}
			@Override
			public Adapter caseMentalStatusAssessment(MentalStatusAssessment object) {
				return createMentalStatusAssessmentAdapter();
			}
			@Override
			public Adapter caseCardiacArrestTiming(CardiacArrestTiming object) {
				return createCardiacArrestTimingAdapter();
			}
			@Override
			public Adapter caseCardiacArrestCause(CardiacArrestCause object) {
				return createCardiacArrestCauseAdapter();
			}
			@Override
			public Adapter casePriorCPR(PriorCPR object) {
				return createPriorCPRAdapter();
			}
			@Override
			public Adapter casePriorAEDUse(PriorAEDUse object) {
				return createPriorAEDUseAdapter();
			}
			@Override
			public Adapter caseArrestRhythm(ArrestRhythm object) {
				return createArrestRhythmAdapter();
			}
			@Override
			public Adapter caseReturnOfSpontaneousCirculation(ReturnOfSpontaneousCirculation object) {
				return createReturnOfSpontaneousCirculationAdapter();
			}
			@Override
			public Adapter caseDestinationRhythm(DestinationRhythm object) {
				return createDestinationRhythmAdapter();
			}
			@Override
			public Adapter caseAbandonedProcedureReasonObservation(AbandonedProcedureReasonObservation object) {
				return createAbandonedProcedureReasonObservationAdapter();
			}
			@Override
			public Adapter caseProcedurePriorIndicator(ProcedurePriorIndicator object) {
				return createProcedurePriorIndicatorAdapter();
			}
			@Override
			public Adapter caseProcedureNumberOfAttemptsObservation(ProcedureNumberOfAttemptsObservation object) {
				return createProcedureNumberOfAttemptsObservationAdapter();
			}
			@Override
			public Adapter caseProcedureSuccessfulObservation(ProcedureSuccessfulObservation object) {
				return createProcedureSuccessfulObservationAdapter();
			}
			@Override
			public Adapter caseProcedureComplicationsObservation(ProcedureComplicationsObservation object) {
				return createProcedureComplicationsObservationAdapter();
			}
			@Override
			public Adapter caseProcedurePatientResponseObservation(ProcedurePatientResponseObservation object) {
				return createProcedurePatientResponseObservationAdapter();
			}
			@Override
			public Adapter caseAirwayConfirmationObservation(AirwayConfirmationObservation object) {
				return createAirwayConfirmationObservationAdapter();
			}
			@Override
			public Adapter caseReasonProcedureNotAttemptedObservation(ReasonProcedureNotAttemptedObservation object) {
				return createReasonProcedureNotAttemptedObservationAdapter();
			}
			@Override
			public Adapter caseComplaintType(ComplaintType object) {
				return createComplaintTypeAdapter();
			}
			@Override
			public Adapter caseComplaintDuration(ComplaintDuration object) {
				return createComplaintDurationAdapter();
			}
			@Override
			public Adapter caseComplaintOrganSystem(ComplaintOrganSystem object) {
				return createComplaintOrganSystemAdapter();
			}
			@Override
			public Adapter caseNeurologicalAssessment(NeurologicalAssessment object) {
				return createNeurologicalAssessmentAdapter();
			}
			@Override
			public Adapter caseExistenceOfHistoryOfProcedures(ExistenceOfHistoryOfProcedures object) {
				return createExistenceOfHistoryOfProceduresAdapter();
			}
			@Override
			public Adapter caseSystolicBloodPressure(SystolicBloodPressure object) {
				return createSystolicBloodPressureAdapter();
			}
			@Override
			public Adapter caseDiastolicBloodPressure(DiastolicBloodPressure object) {
				return createDiastolicBloodPressureAdapter();
			}
			@Override
			public Adapter caseHeartRate(HeartRate object) {
				return createHeartRateAdapter();
			}
			@Override
			public Adapter caseRespiratoryRate(RespiratoryRate object) {
				return createRespiratoryRateAdapter();
			}
			@Override
			public Adapter caseBodyTemperature(BodyTemperature object) {
				return createBodyTemperatureAdapter();
			}
			@Override
			public Adapter caseOxygenSaturation(OxygenSaturation object) {
				return createOxygenSaturationAdapter();
			}
			@Override
			public Adapter caseProtocolAgeCategory(ProtocolAgeCategory object) {
				return createProtocolAgeCategoryAdapter();
			}
			@Override
			public Adapter caseDispatchLocationName(DispatchLocationName object) {
				return createDispatchLocationNameAdapter();
			}
			@Override
			public Adapter caseDispatchLocationLatitude(DispatchLocationLatitude object) {
				return createDispatchLocationLatitudeAdapter();
			}
			@Override
			public Adapter caseDispatchLocationLongitude(DispatchLocationLongitude object) {
				return createDispatchLocationLongitudeAdapter();
			}
			@Override
			public Adapter caseDispatchDelay(DispatchDelay object) {
				return createDispatchDelayAdapter();
			}
			@Override
			public Adapter caseResponseDelay(ResponseDelay object) {
				return createResponseDelayAdapter();
			}
			@Override
			public Adapter caseSceneDelay(SceneDelay object) {
				return createSceneDelayAdapter();
			}
			@Override
			public Adapter caseTransportDelay(TransportDelay object) {
				return createTransportDelayAdapter();
			}
			@Override
			public Adapter caseTurnaroundDelay(TurnaroundDelay object) {
				return createTurnaroundDelayAdapter();
			}
			@Override
			public Adapter caseResponseBeginningOdometerReading(ResponseBeginningOdometerReading object) {
				return createResponseBeginningOdometerReadingAdapter();
			}
			@Override
			public Adapter caseResponseOnSceneOdometerReading(ResponseOnSceneOdometerReading object) {
				return createResponseOnSceneOdometerReadingAdapter();
			}
			@Override
			public Adapter caseResponseDestinationOdometerReading(ResponseDestinationOdometerReading object) {
				return createResponseDestinationOdometerReadingAdapter();
			}
			@Override
			public Adapter caseResponseEndingOdometerReading(ResponseEndingOdometerReading object) {
				return createResponseEndingOdometerReadingAdapter();
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
			public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
				return createGeneralHeaderConstraintsAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
				return createMedicationsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseMedicationsSection(MedicationsSection object) {
				return createMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicationActivity(MedicationActivity object) {
				return createMedicationActivityAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter caseAllergyProblemAct(AllergyProblemAct object) {
				return createAllergyProblemActAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter casePhysicalExamSection(PhysicalExamSection object) {
				return createPhysicalExamSectionAdapter();
			}
			@Override
			public Adapter caseConsol_MedicationsAdministeredSection(org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection object) {
				return createConsol_MedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter caseProcedureDescriptionSection(ProcedureDescriptionSection object) {
				return createProcedureDescriptionSectionAdapter();
			}
			@Override
			public Adapter caseCDA_Procedure(org.openhealthtools.mdht.uml.cda.Procedure object) {
				return createCDA_ProcedureAdapter();
			}
			@Override
			public Adapter caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
				return createProcedureActivityProcedureAdapter();
			}
			@Override
			public Adapter caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
				return createVitalSignsSectionEntriesOptionalAdapter();
			}
			@Override
			public Adapter caseConsol_VitalSignsSection(org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection object) {
				return createConsol_VitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseConsol_VitalSignsOrganizer(org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer object) {
				return createConsol_VitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter caseVitalSignObservation(VitalSignObservation object) {
				return createVitalSignObservationAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport <em>Patient Care Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport
	 * @generated
	 */
	public Adapter createPatientCareReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingSection <em>Billing Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BillingSection
	 * @generated
	 */
	public Adapter createBillingSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition <em>Billing Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition
	 * @generated
	 */
	public Adapter createBillingConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation <em>Level Of Service Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation
	 * @generated
	 */
	public Adapter createLevelOfServiceObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection <em>Current Medication Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection
	 * @generated
	 */
	public Adapter createCurrentMedicationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication <em>Currently On Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CurrentlyOnMedication
	 * @generated
	 */
	public Adapter createCurrentlyOnMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants <em>Patient On Anticoagulants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants
	 * @generated
	 */
	public Adapter createPatientOnAnticoagulantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication <em>Current Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedication
	 * @generated
	 */
	public Adapter createCurrentMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection <em>Cardiac Arrest Event Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestEventSection
	 * @generated
	 */
	public Adapter createCardiacArrestEventSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence <em>Cardiac Arrest Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence
	 * @generated
	 */
	public Adapter createCardiacArrestExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation <em>Advanced Directive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation
	 * @generated
	 */
	public Adapter createAdvancedDirectiveObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection <em>Allergies And Adverse Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection
	 * @generated
	 */
	public Adapter createAllergiesAndAdverseReactionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation <em>Existence Of Drug Allergy Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugAllergyObservation
	 * @generated
	 */
	public Adapter createExistenceOfDrugAllergyObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct <em>Drug Allergy Problem Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct
	 * @generated
	 */
	public Adapter createDrugAllergyProblemActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies <em>Environmental Allergies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies
	 * @generated
	 */
	public Adapter createEnvironmentalAllergiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy <em>Existence Of Environmental Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy
	 * @generated
	 */
	public Adapter createExistenceOfEnvironmentalAllergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy <em>Environmental Allergy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy
	 * @generated
	 */
	public Adapter createEnvironmentalAllergyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection <em>Past Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection
	 * @generated
	 */
	public Adapter createPastMedicalHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition <em>Existence Of History Of Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition
	 * @generated
	 */
	public Adapter createExistenceOfHistoryOfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition <em>History Of Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition
	 * @generated
	 */
	public Adapter createHistoryOfConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer <em>History Of Procedures Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer
	 * @generated
	 */
	public Adapter createHistoryOfProceduresOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication <em>Existence Of Drug Use Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfDrugUseIndication
	 * @generated
	 */
	public Adapter createExistenceOfDrugUseIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication <em>Drug Use Indication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DrugUseIndication
	 * @generated
	 */
	public Adapter createDrugUseIndicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection <em>Physical Assessment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection
	 * @generated
	 */
	public Adapter createPhysicalAssessmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer <em>Physical Assessment Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer
	 * @generated
	 */
	public Adapter createPhysicalAssessmentOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment <em>Skin Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SkinAssessment
	 * @generated
	 */
	public Adapter createSkinAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy <em>Patient Pregnancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy
	 * @generated
	 */
	public Adapter createPatientPregnancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake <em>Last Oral Intake</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake
	 * @generated
	 */
	public Adapter createLastOralIntakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientAge <em>Patient Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientAge
	 * @generated
	 */
	public Adapter createPatientAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications <em>Thrombolytic Contraindications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications
	 * @generated
	 */
	public Adapter createThrombolyticContraindicationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare <em>Barriers To Patient Care</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare
	 * @generated
	 */
	public Adapter createBarriersToPatientCareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered <em>Medication Administered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered
	 * @generated
	 */
	public Adapter createMedicationAdministeredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection <em>Procedures Performed Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection
	 * @generated
	 */
	public Adapter createProceduresPerformedSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection <em>Patient Care Narrative Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientCareNarrativeSection
	 * @generated
	 */
	public Adapter createPatientCareNarrativeSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection <em>Scene Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SceneSection
	 * @generated
	 */
	public Adapter createSceneSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator <em>First Unit Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator
	 * @generated
	 */
	public Adapter createFirstUnitIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene <em>First Unit On Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene
	 * @generated
	 */
	public Adapter createFirstUnitOnSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount <em>Scene Patient Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount
	 * @generated
	 */
	public Adapter createScenePatientCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator <em>Mass Casualty Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator
	 * @generated
	 */
	public Adapter createMassCasualtyIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation <em>Location Type Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation
	 * @generated
	 */
	public Adapter createLocationTypeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection <em>Dispatch Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection
	 * @generated
	 */
	public Adapter createDispatchSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation <em>Emergency Medical Dispatch Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmergencyMedicalDispatchObservation
	 * @generated
	 */
	public Adapter createEmergencyMedicalDispatchObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch <em>Complaint Reported By Dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintReportedByDispatch
	 * @generated
	 */
	public Adapter createComplaintReportedByDispatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection <em>Disposition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection
	 * @generated
	 */
	public Adapter createDispositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation <em>Transport Method Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation
	 * @generated
	 */
	public Adapter createTransportMethodObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation <em>Number Of Patients Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation
	 * @generated
	 */
	public Adapter createNumberOfPatientsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation <em>Incident Disposition Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation
	 * @generated
	 */
	public Adapter createIncidentDispositionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation <em>Transport Mode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation
	 * @generated
	 */
	public Adapter createTransportModeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation <em>Reason For Choosing Destination Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation
	 * @generated
	 */
	public Adapter createReasonForChoosingDestinationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation <em>Prearrival Activation Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation
	 * @generated
	 */
	public Adapter createPrearrivalActivationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation <em>Patient Condition Change At Destination Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation
	 * @generated
	 */
	public Adapter createPatientConditionChangeAtDestinationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection <em>Personnel Adverse Event Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection
	 * @generated
	 */
	public Adapter createPersonnelAdverseEventSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator <em>Adverse Event Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator
	 * @generated
	 */
	public Adapter createAdverseEventIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation <em>Adverse Event Type Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation
	 * @generated
	 */
	public Adapter createAdverseEventTypeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection <em>Protocol Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection
	 * @generated
	 */
	public Adapter createProtocolSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation <em>Protocol Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation
	 * @generated
	 */
	public Adapter createProtocolObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType <em>Candidate Patient Registry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CandidatePatientRegistryType
	 * @generated
	 */
	public Adapter createCandidatePatientRegistryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection <em>Response Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection
	 * @generated
	 */
	public Adapter createResponseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer <em>Delay Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DelayOrganizer
	 * @generated
	 */
	public Adapter createDelayOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer <em>Dispatch Location Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationOrganizer
	 * @generated
	 */
	public Adapter createDispatchLocationOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer <em>Response Odometer Reading Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer
	 * @generated
	 */
	public Adapter createResponseOdometerReadingOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene <em>Response Mode To Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene
	 * @generated
	 */
	public Adapter createResponseModeToSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection <em>Situation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SituationSection
	 * @generated
	 */
	public Adapter createSituationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.Complaint <em>Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.Complaint
	 * @generated
	 */
	public Adapter createComplaintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury <em>Possible Injury</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury
	 * @generated
	 */
	public Adapter createPossibleInjuryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression <em>Provider Primary Impression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression
	 * @generated
	 */
	public Adapter createProviderPrimaryImpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom <em>Primary Symptom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom
	 * @generated
	 */
	public Adapter createPrimarySymptomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms <em>Other Symptoms</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms
	 * @generated
	 */
	public Adapter createOtherSymptomsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions <em>Provider Secondary Impressions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions
	 * @generated
	 */
	public Adapter createProviderSecondaryImpressionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity <em>Initial Patient Acuity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity
	 * @generated
	 */
	public Adapter createInitialPatientAcuityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection <em>Times Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TimesSection
	 * @generated
	 */
	public Adapter createTimesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime <em>Call Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CallTime
	 * @generated
	 */
	public Adapter createCallTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime <em>Unit Notified Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime
	 * @generated
	 */
	public Adapter createUnitNotifiedTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime <em>Unit En Route Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime
	 * @generated
	 */
	public Adapter createUnitEnRouteTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime <em>Unit On Scene Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime
	 * @generated
	 */
	public Adapter createUnitOnSceneTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime <em>Unit At Patientt Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime
	 * @generated
	 */
	public Adapter createUnitAtPatienttTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime <em>Unit Left Scene Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime
	 * @generated
	 */
	public Adapter createUnitLeftSceneTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime <em>Patient Arrived At Destination Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime
	 * @generated
	 */
	public Adapter createPatientArrivedAtDestinationTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime <em>Unit Back In Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime
	 * @generated
	 */
	public Adapter createUnitBackInServiceTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime <em>Dispatch Notified Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime
	 * @generated
	 */
	public Adapter createDispatchNotifiedTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals <em>Prior Aid Vitals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PriorAidVitals
	 * @generated
	 */
	public Adapter createPriorAidVitalsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer <em>Additional Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer
	 * @generated
	 */
	public Adapter createAdditionalVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore <em>Stroke Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore
	 * @generated
	 */
	public Adapter createStrokeScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PainScore <em>Pain Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PainScore
	 * @generated
	 */
	public Adapter createPainScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness <em>Level Of Responsiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness
	 * @generated
	 */
	public Adapter createLevelOfResponsivenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose <em>Blood Glucose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose
	 * @generated
	 */
	public Adapter createBloodGlucoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide <em>Carbon Monoxide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide
	 * @generated
	 */
	public Adapter createCarbonMonoxideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide <em>Carbon Dioxide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide
	 * @generated
	 */
	public Adapter createCarbonDioxideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm <em>Cardiac Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm
	 * @generated
	 */
	public Adapter createCardiacRhythmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer <em>Glasgow Coma Score Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer
	 * @generated
	 */
	public Adapter createGlasgowComaScoreOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye <em>Glasgow Eye</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye
	 * @generated
	 */
	public Adapter createGlasgowEyeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor <em>Glasgow Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor
	 * @generated
	 */
	public Adapter createGlasgowMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier <em>Glasgow Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier
	 * @generated
	 */
	public Adapter createGlasgowQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal <em>Glasgow Total</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowTotal
	 * @generated
	 */
	public Adapter createGlasgowTotalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal <em>Glasgow Verbal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal
	 * @generated
	 */
	public Adapter createGlasgowVerbalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection <em>Injury Incident Description Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection
	 * @generated
	 */
	public Adapter createInjuryIncidentDescriptionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory <em>Injury Cause Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory
	 * @generated
	 */
	public Adapter createInjuryCauseCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism <em>Injury Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InjuryMechanism
	 * @generated
	 */
	public Adapter createInjuryMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria <em>Trauma Center Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria
	 * @generated
	 */
	public Adapter createTraumaCenterCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor <em>Injury Risk Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor
	 * @generated
	 */
	public Adapter createInjuryRiskFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea <em>Vehicle Impact Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea
	 * @generated
	 */
	public Adapter createVehicleImpactAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle <em>Patient Location In Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientLocationInVehicle
	 * @generated
	 */
	public Adapter createPatientLocationInVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment <em>Vehicle Occupant Safety Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment
	 * @generated
	 */
	public Adapter createVehicleOccupantSafetyEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus <em>Airbag Deployment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AirbagDeploymentStatus
	 * @generated
	 */
	public Adapter createAirbagDeploymentStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall <em>Height Of Fall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall
	 * @generated
	 */
	public Adapter createHeightOfFallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType <em>Disaster Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DisasterType
	 * @generated
	 */
	public Adapter createDisasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation <em>Medication Not Administered Reason Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation
	 * @generated
	 */
	public Adapter createMedicationNotAdministeredReasonObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation <em>Medication Response Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation
	 * @generated
	 */
	public Adapter createMedicationResponseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation <em>Medication Complication Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation
	 * @generated
	 */
	public Adapter createMedicationComplicationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation <em>Medication Prior Administration Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation
	 * @generated
	 */
	public Adapter createMedicationPriorAdministrationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight <em>Patient Body Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PatientBodyWeight
	 * @generated
	 */
	public Adapter createPatientBodyWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass <em>Length Based Patient Body Weight Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass
	 * @generated
	 */
	public Adapter createLengthBasedPatientBodyWeightClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment <em>Face Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment
	 * @generated
	 */
	public Adapter createFaceAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment <em>Head Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment
	 * @generated
	 */
	public Adapter createHeadAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment <em>Neck Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment
	 * @generated
	 */
	public Adapter createNeckAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment <em>Chest And Lungs Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment
	 * @generated
	 */
	public Adapter createChestAndLungsAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment <em>Heart Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment
	 * @generated
	 */
	public Adapter createHeartAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment <em>Abdomen Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment
	 * @generated
	 */
	public Adapter createAbdomenAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment <em>Pelvic And Genitourinary Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment
	 * @generated
	 */
	public Adapter createPelvicAndGenitourinaryAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment <em>Back And Spine Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment
	 * @generated
	 */
	public Adapter createBackAndSpineAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment <em>Extremities Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment
	 * @generated
	 */
	public Adapter createExtremitiesAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment <em>Eye Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment
	 * @generated
	 */
	public Adapter createEyeAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment <em>Mental Status Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment
	 * @generated
	 */
	public Adapter createMentalStatusAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming <em>Cardiac Arrest Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestTiming
	 * @generated
	 */
	public Adapter createCardiacArrestTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause <em>Cardiac Arrest Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause
	 * @generated
	 */
	public Adapter createCardiacArrestCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR <em>Prior CPR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PriorCPR
	 * @generated
	 */
	public Adapter createPriorCPRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse <em>Prior AED Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.PriorAEDUse
	 * @generated
	 */
	public Adapter createPriorAEDUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm <em>Arrest Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm
	 * @generated
	 */
	public Adapter createArrestRhythmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation <em>Return Of Spontaneous Circulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation
	 * @generated
	 */
	public Adapter createReturnOfSpontaneousCirculationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm <em>Destination Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm
	 * @generated
	 */
	public Adapter createDestinationRhythmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation <em>Abandoned Procedure Reason Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AbandonedProcedureReasonObservation
	 * @generated
	 */
	public Adapter createAbandonedProcedureReasonObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator <em>Procedure Prior Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator
	 * @generated
	 */
	public Adapter createProcedurePriorIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation <em>Procedure Number Of Attempts Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation
	 * @generated
	 */
	public Adapter createProcedureNumberOfAttemptsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation <em>Procedure Successful Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedureSuccessfulObservation
	 * @generated
	 */
	public Adapter createProcedureSuccessfulObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation <em>Procedure Complications Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation
	 * @generated
	 */
	public Adapter createProcedureComplicationsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation <em>Procedure Patient Response Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation
	 * @generated
	 */
	public Adapter createProcedurePatientResponseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation <em>Airway Confirmation Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation
	 * @generated
	 */
	public Adapter createAirwayConfirmationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation <em>Reason Procedure Not Attempted Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation
	 * @generated
	 */
	public Adapter createReasonProcedureNotAttemptedObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType <em>Complaint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintType
	 * @generated
	 */
	public Adapter createComplaintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration <em>Complaint Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintDuration
	 * @generated
	 */
	public Adapter createComplaintDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem <em>Complaint Organ System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ComplaintOrganSystem
	 * @generated
	 */
	public Adapter createComplaintOrganSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment <em>Neurological Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment
	 * @generated
	 */
	public Adapter createNeurologicalAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures <em>Existence Of History Of Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures
	 * @generated
	 */
	public Adapter createExistenceOfHistoryOfProceduresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure <em>Systolic Blood Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SystolicBloodPressure
	 * @generated
	 */
	public Adapter createSystolicBloodPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure <em>Diastolic Blood Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure
	 * @generated
	 */
	public Adapter createDiastolicBloodPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate <em>Heart Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.HeartRate
	 * @generated
	 */
	public Adapter createHeartRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate <em>Respiratory Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate
	 * @generated
	 */
	public Adapter createRespiratoryRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature <em>Body Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature
	 * @generated
	 */
	public Adapter createBodyTemperatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation <em>Oxygen Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation
	 * @generated
	 */
	public Adapter createOxygenSaturationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory <em>Protocol Age Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory
	 * @generated
	 */
	public Adapter createProtocolAgeCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName <em>Dispatch Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName
	 * @generated
	 */
	public Adapter createDispatchLocationNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude <em>Dispatch Location Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude
	 * @generated
	 */
	public Adapter createDispatchLocationLatitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude <em>Dispatch Location Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude
	 * @generated
	 */
	public Adapter createDispatchLocationLongitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay <em>Dispatch Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay
	 * @generated
	 */
	public Adapter createDispatchDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay <em>Response Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay
	 * @generated
	 */
	public Adapter createResponseDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay <em>Scene Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay
	 * @generated
	 */
	public Adapter createSceneDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay <em>Transport Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TransportDelay
	 * @generated
	 */
	public Adapter createTransportDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay <em>Turnaround Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.TurnaroundDelay
	 * @generated
	 */
	public Adapter createTurnaroundDelayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading <em>Response Beginning Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading
	 * @generated
	 */
	public Adapter createResponseBeginningOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading <em>Response On Scene Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading
	 * @generated
	 */
	public Adapter createResponseOnSceneOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading <em>Response Destination Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading
	 * @generated
	 */
	public Adapter createResponseDestinationOdometerReadingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading <em>Response Ending Odometer Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading
	 * @generated
	 */
	public Adapter createResponseEndingOdometerReadingAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createConsol_MedicationsAdministeredSectionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createCDA_ProcedureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection
	 * @generated
	 */
	public Adapter createConsol_VitalSignsSectionAdapter() {
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
	public Adapter createConsol_VitalSignsOrganizerAdapter() {
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

} //EmspcrAdapterFactory
