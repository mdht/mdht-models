/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmspcrPackageImpl extends EPackageImpl implements EmspcrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "emspcr.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientCareReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOfServiceObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentMedicationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentlyOnMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientOnAnticoagulantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardiacArrestEventSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardiacArrestExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advanceDirectivesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advancedDirectiveObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergiesAndAdverseReactionsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceOfDrugAllergyObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugAllergyProblemActEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalAllergiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceOfEnvironmentalAllergyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalAllergyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pastMedicalHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceOfHistoryOfConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyOfProceduresOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialHistorySectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceOfDrugUseIndicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugUseIndicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalAssessmentSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalAssessmentOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skinAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientPregnancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastOralIntakeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thrombolyticContraindicationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barriersToPatientCareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationsAdministeredSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministeredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proceduresPerformedSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientCareNarrativeSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstUnitIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstUnitOnSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenePatientCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massCasualtyIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergencyMedicalDispatchObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintReportedByDispatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispositionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportMethodObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfPatientsObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incidentDispositionObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportModeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonForChoosingDestinationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prearrivalActivationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientConditionChangeAtDestinationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personnelAdverseEventSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adverseEventIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adverseEventTypeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidatePatientRegistryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchLocationOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseOdometerReadingOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseModeToSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possibleInjuryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerPrimaryImpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primarySymptomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherSymptomsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerSecondaryImpressionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialPatientAcuityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timesSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitNotifiedTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEnRouteTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitOnSceneTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitAtPatienttTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitLeftSceneTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientArrivedAtDestinationTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitBackInServiceTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchNotifiedTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalSignsOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorAidVitalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalVitalSignsOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass painScoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelOfResponsivenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloodGlucoseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carbonMonoxideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carbonDioxideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardiacRhythmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glasgowComaScoreOrganizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glasgowEyeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glasgowMotorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glasgowQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glasgowTotalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glasgowVerbalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injuryIncidentDescriptionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injuryCauseCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injuryMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traumaCenterCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass injuryRiskFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleImpactAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientLocationInVehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleOccupantSafetyEquipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airbagDeploymentStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heightOfFallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disasterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationNotAdministeredReasonObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationResponseObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationComplicationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPriorAdministrationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientBodyWeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthBasedPatientBodyWeightClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faceAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neckAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chestAndLungsAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abdomenAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pelvicAndGenitourinaryAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backAndSpineAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extremitiesAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eyeAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mentalStatusAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardiacArrestTimingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardiacArrestCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorCPREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorAEDUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrestRhythmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnOfSpontaneousCirculationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationRhythmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abandonedProcedureReasonObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePriorIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureNumberOfAttemptsObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureSuccessfulObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureComplicationsObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePatientResponseObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass airwayConfirmationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasonProcedureNotAttemptedObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintOrganSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neurologicalAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceOfHistoryOfProceduresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systolicBloodPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diastolicBloodPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respiratoryRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oxygenSaturationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolAgeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchLocationNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchLocationLatitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchLocationLongitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatchDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnaroundDelayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseBeginningOdometerReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseOnSceneOdometerReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDestinationOdometerReadingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEndingOdometerReadingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmspcrPackageImpl() {
		super(eNS_URI, EmspcrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmspcrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static EmspcrPackage init() {
		if (isInited) {
			return (EmspcrPackage) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI);
		}

		// Obtain or create and register package
		EmspcrPackageImpl theEmspcrPackage = (EmspcrPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmspcrPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new EmspcrPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConsolPackage.eINSTANCE.eClass();

		// Load packages
		theEmspcrPackage.loadPackage();

		// Fix loaded packages
		theEmspcrPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theEmspcrPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return EmspcrValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theEmspcrPackage.freeze();

		// publish my initializers in the registry
		Initializer.Registry.INSTANCE.registerFactory(
			"org.openhealthtools.mdht.uml.cda.emspcr", AnnotationBasedInitializer.FACTORY);
		Initializer.Registry.INSTANCE.initializeEPackage(theEmspcrPackage);

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmspcrPackage.eNS_URI, theEmspcrPackage);
		return theEmspcrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientCareReport() {
		if (patientCareReportEClass == null) {
			patientCareReportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				0);
		}
		return patientCareReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillingSection() {
		if (billingSectionEClass == null) {
			billingSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				1);
		}
		return billingSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillingCondition() {
		if (billingConditionEClass == null) {
			billingConditionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				2);
		}
		return billingConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelOfServiceObservation() {
		if (levelOfServiceObservationEClass == null) {
			levelOfServiceObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				3);
		}
		return levelOfServiceObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentMedicationSection() {
		if (currentMedicationSectionEClass == null) {
			currentMedicationSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				4);
		}
		return currentMedicationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentlyOnMedication() {
		if (currentlyOnMedicationEClass == null) {
			currentlyOnMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				5);
		}
		return currentlyOnMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientOnAnticoagulants() {
		if (patientOnAnticoagulantsEClass == null) {
			patientOnAnticoagulantsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				6);
		}
		return patientOnAnticoagulantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentMedication() {
		if (currentMedicationEClass == null) {
			currentMedicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				7);
		}
		return currentMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardiacArrestEventSection() {
		if (cardiacArrestEventSectionEClass == null) {
			cardiacArrestEventSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				8);
		}
		return cardiacArrestEventSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardiacArrestExistence() {
		if (cardiacArrestExistenceEClass == null) {
			cardiacArrestExistenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				9);
		}
		return cardiacArrestExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvanceDirectivesSection() {
		if (advanceDirectivesSectionEClass == null) {
			advanceDirectivesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				10);
		}
		return advanceDirectivesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvancedDirectiveObservation() {
		if (advancedDirectiveObservationEClass == null) {
			advancedDirectiveObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				11);
		}
		return advancedDirectiveObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergiesAndAdverseReactionsSection() {
		if (allergiesAndAdverseReactionsSectionEClass == null) {
			allergiesAndAdverseReactionsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(12);
		}
		return allergiesAndAdverseReactionsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistenceOfDrugAllergyObservation() {
		if (existenceOfDrugAllergyObservationEClass == null) {
			existenceOfDrugAllergyObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(13);
		}
		return existenceOfDrugAllergyObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugAllergyProblemAct() {
		if (drugAllergyProblemActEClass == null) {
			drugAllergyProblemActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				14);
		}
		return drugAllergyProblemActEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentalAllergies() {
		if (environmentalAllergiesEClass == null) {
			environmentalAllergiesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				15);
		}
		return environmentalAllergiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistenceOfEnvironmentalAllergy() {
		if (existenceOfEnvironmentalAllergyEClass == null) {
			existenceOfEnvironmentalAllergyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(16);
		}
		return existenceOfEnvironmentalAllergyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentalAllergy() {
		if (environmentalAllergyEClass == null) {
			environmentalAllergyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				17);
		}
		return environmentalAllergyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPastMedicalHistorySection() {
		if (pastMedicalHistorySectionEClass == null) {
			pastMedicalHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				18);
		}
		return pastMedicalHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistenceOfHistoryOfCondition() {
		if (existenceOfHistoryOfConditionEClass == null) {
			existenceOfHistoryOfConditionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				19);
		}
		return existenceOfHistoryOfConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfCondition() {
		if (historyOfConditionEClass == null) {
			historyOfConditionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				20);
		}
		return historyOfConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryOfProceduresOrganizer() {
		if (historyOfProceduresOrganizerEClass == null) {
			historyOfProceduresOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				111);
		}
		return historyOfProceduresOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialHistorySection() {
		if (socialHistorySectionEClass == null) {
			socialHistorySectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				21);
		}
		return socialHistorySectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistenceOfDrugUseIndication() {
		if (existenceOfDrugUseIndicationEClass == null) {
			existenceOfDrugUseIndicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				22);
		}
		return existenceOfDrugUseIndicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugUseIndication() {
		if (drugUseIndicationEClass == null) {
			drugUseIndicationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				23);
		}
		return drugUseIndicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalAssessmentSection() {
		if (physicalAssessmentSectionEClass == null) {
			physicalAssessmentSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				24);
		}
		return physicalAssessmentSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalAssessmentOrganizer() {
		if (physicalAssessmentOrganizerEClass == null) {
			physicalAssessmentOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				25);
		}
		return physicalAssessmentOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkinAssessment() {
		if (skinAssessmentEClass == null) {
			skinAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				26);
		}
		return skinAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientPregnancy() {
		if (patientPregnancyEClass == null) {
			patientPregnancyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				27);
		}
		return patientPregnancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastOralIntake() {
		if (lastOralIntakeEClass == null) {
			lastOralIntakeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				28);
		}
		return lastOralIntakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAge() {
		if (patientAgeEClass == null) {
			patientAgeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				29);
		}
		return patientAgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrombolyticContraindications() {
		if (thrombolyticContraindicationsEClass == null) {
			thrombolyticContraindicationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				30);
		}
		return thrombolyticContraindicationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarriersToPatientCare() {
		if (barriersToPatientCareEClass == null) {
			barriersToPatientCareEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				31);
		}
		return barriersToPatientCareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationsAdministeredSection() {
		if (medicationsAdministeredSectionEClass == null) {
			medicationsAdministeredSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(32);
		}
		return medicationsAdministeredSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministered() {
		if (medicationAdministeredEClass == null) {
			medicationAdministeredEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				33);
		}
		return medicationAdministeredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProceduresPerformedSection() {
		if (proceduresPerformedSectionEClass == null) {
			proceduresPerformedSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				34);
		}
		return proceduresPerformedSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				35);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientCareNarrativeSection() {
		if (patientCareNarrativeSectionEClass == null) {
			patientCareNarrativeSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				36);
		}
		return patientCareNarrativeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneSection() {
		if (sceneSectionEClass == null) {
			sceneSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				37);
		}
		return sceneSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstUnitIndicator() {
		if (firstUnitIndicatorEClass == null) {
			firstUnitIndicatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				38);
		}
		return firstUnitIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstUnitOnScene() {
		if (firstUnitOnSceneEClass == null) {
			firstUnitOnSceneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				39);
		}
		return firstUnitOnSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenePatientCount() {
		if (scenePatientCountEClass == null) {
			scenePatientCountEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				40);
		}
		return scenePatientCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMassCasualtyIndicator() {
		if (massCasualtyIndicatorEClass == null) {
			massCasualtyIndicatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				41);
		}
		return massCasualtyIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationTypeObservation() {
		if (locationTypeObservationEClass == null) {
			locationTypeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				42);
		}
		return locationTypeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchSection() {
		if (dispatchSectionEClass == null) {
			dispatchSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				43);
		}
		return dispatchSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergencyMedicalDispatchObservation() {
		if (emergencyMedicalDispatchObservationEClass == null) {
			emergencyMedicalDispatchObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(44);
		}
		return emergencyMedicalDispatchObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaintReportedByDispatch() {
		if (complaintReportedByDispatchEClass == null) {
			complaintReportedByDispatchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				45);
		}
		return complaintReportedByDispatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispositionSection() {
		if (dispositionSectionEClass == null) {
			dispositionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				46);
		}
		return dispositionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportMethodObservation() {
		if (transportMethodObservationEClass == null) {
			transportMethodObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				50);
		}
		return transportMethodObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberOfPatientsObservation() {
		if (numberOfPatientsObservationEClass == null) {
			numberOfPatientsObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				47);
		}
		return numberOfPatientsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncidentDispositionObservation() {
		if (incidentDispositionObservationEClass == null) {
			incidentDispositionObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(48);
		}
		return incidentDispositionObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportModeObservation() {
		if (transportModeObservationEClass == null) {
			transportModeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				49);
		}
		return transportModeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonForChoosingDestinationObservation() {
		if (reasonForChoosingDestinationObservationEClass == null) {
			reasonForChoosingDestinationObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(51);
		}
		return reasonForChoosingDestinationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrearrivalActivationObservation() {
		if (prearrivalActivationObservationEClass == null) {
			prearrivalActivationObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(52);
		}
		return prearrivalActivationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientConditionChangeAtDestinationObservation() {
		if (patientConditionChangeAtDestinationObservationEClass == null) {
			patientConditionChangeAtDestinationObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(53);
		}
		return patientConditionChangeAtDestinationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonnelAdverseEventSection() {
		if (personnelAdverseEventSectionEClass == null) {
			personnelAdverseEventSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				54);
		}
		return personnelAdverseEventSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdverseEventIndicator() {
		if (adverseEventIndicatorEClass == null) {
			adverseEventIndicatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				55);
		}
		return adverseEventIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdverseEventTypeObservation() {
		if (adverseEventTypeObservationEClass == null) {
			adverseEventTypeObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				56);
		}
		return adverseEventTypeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolSection() {
		if (protocolSectionEClass == null) {
			protocolSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				57);
		}
		return protocolSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolObservation() {
		if (protocolObservationEClass == null) {
			protocolObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				58);
		}
		return protocolObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCandidatePatientRegistryType() {
		if (candidatePatientRegistryTypeEClass == null) {
			candidatePatientRegistryTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				59);
		}
		return candidatePatientRegistryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseSection() {
		if (responseSectionEClass == null) {
			responseSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				60);
		}
		return responseSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayOrganizer() {
		if (delayOrganizerEClass == null) {
			delayOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				61);
		}
		return delayOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchLocationOrganizer() {
		if (dispatchLocationOrganizerEClass == null) {
			dispatchLocationOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				62);
		}
		return dispatchLocationOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseOdometerReadingOrganizer() {
		if (responseOdometerReadingOrganizerEClass == null) {
			responseOdometerReadingOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(63);
		}
		return responseOdometerReadingOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseModeToScene() {
		if (responseModeToSceneEClass == null) {
			responseModeToSceneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				64);
		}
		return responseModeToSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSituationSection() {
		if (situationSectionEClass == null) {
			situationSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				65);
		}
		return situationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaint() {
		if (complaintEClass == null) {
			complaintEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				66);
		}
		return complaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossibleInjury() {
		if (possibleInjuryEClass == null) {
			possibleInjuryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				67);
		}
		return possibleInjuryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderPrimaryImpression() {
		if (providerPrimaryImpressionEClass == null) {
			providerPrimaryImpressionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				68);
		}
		return providerPrimaryImpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimarySymptom() {
		if (primarySymptomEClass == null) {
			primarySymptomEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				69);
		}
		return primarySymptomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherSymptoms() {
		if (otherSymptomsEClass == null) {
			otherSymptomsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				70);
		}
		return otherSymptomsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderSecondaryImpressions() {
		if (providerSecondaryImpressionsEClass == null) {
			providerSecondaryImpressionsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				71);
		}
		return providerSecondaryImpressionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialPatientAcuity() {
		if (initialPatientAcuityEClass == null) {
			initialPatientAcuityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				72);
		}
		return initialPatientAcuityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimesSection() {
		if (timesSectionEClass == null) {
			timesSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				73);
		}
		return timesSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallTime() {
		if (callTimeEClass == null) {
			callTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				74);
		}
		return callTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitNotifiedTime() {
		if (unitNotifiedTimeEClass == null) {
			unitNotifiedTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				75);
		}
		return unitNotifiedTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitEnRouteTime() {
		if (unitEnRouteTimeEClass == null) {
			unitEnRouteTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				76);
		}
		return unitEnRouteTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitOnSceneTime() {
		if (unitOnSceneTimeEClass == null) {
			unitOnSceneTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				77);
		}
		return unitOnSceneTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitAtPatienttTime() {
		if (unitAtPatienttTimeEClass == null) {
			unitAtPatienttTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				78);
		}
		return unitAtPatienttTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitLeftSceneTime() {
		if (unitLeftSceneTimeEClass == null) {
			unitLeftSceneTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				79);
		}
		return unitLeftSceneTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientArrivedAtDestinationTime() {
		if (patientArrivedAtDestinationTimeEClass == null) {
			patientArrivedAtDestinationTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(80);
		}
		return patientArrivedAtDestinationTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitBackInServiceTime() {
		if (unitBackInServiceTimeEClass == null) {
			unitBackInServiceTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				81);
		}
		return unitBackInServiceTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchNotifiedTime() {
		if (dispatchNotifiedTimeEClass == null) {
			dispatchNotifiedTimeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				82);
		}
		return dispatchNotifiedTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsSection() {
		if (vitalSignsSectionEClass == null) {
			vitalSignsSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				83);
		}
		return vitalSignsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalSignsOrganizer() {
		if (vitalSignsOrganizerEClass == null) {
			vitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				84);
		}
		return vitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorAidVitals() {
		if (priorAidVitalsEClass == null) {
			priorAidVitalsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				85);
		}
		return priorAidVitalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalVitalSignsOrganizer() {
		if (additionalVitalSignsOrganizerEClass == null) {
			additionalVitalSignsOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				86);
		}
		return additionalVitalSignsOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrokeScore() {
		if (strokeScoreEClass == null) {
			strokeScoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				87);
		}
		return strokeScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPainScore() {
		if (painScoreEClass == null) {
			painScoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				88);
		}
		return painScoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLevelOfResponsiveness() {
		if (levelOfResponsivenessEClass == null) {
			levelOfResponsivenessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				89);
		}
		return levelOfResponsivenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBloodGlucose() {
		if (bloodGlucoseEClass == null) {
			bloodGlucoseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				90);
		}
		return bloodGlucoseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarbonMonoxide() {
		if (carbonMonoxideEClass == null) {
			carbonMonoxideEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				91);
		}
		return carbonMonoxideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarbonDioxide() {
		if (carbonDioxideEClass == null) {
			carbonDioxideEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				92);
		}
		return carbonDioxideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardiacRhythm() {
		if (cardiacRhythmEClass == null) {
			cardiacRhythmEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				93);
		}
		return cardiacRhythmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlasgowComaScoreOrganizer() {
		if (glasgowComaScoreOrganizerEClass == null) {
			glasgowComaScoreOrganizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				94);
		}
		return glasgowComaScoreOrganizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlasgowEye() {
		if (glasgowEyeEClass == null) {
			glasgowEyeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				95);
		}
		return glasgowEyeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlasgowMotor() {
		if (glasgowMotorEClass == null) {
			glasgowMotorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				96);
		}
		return glasgowMotorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlasgowQualifier() {
		if (glasgowQualifierEClass == null) {
			glasgowQualifierEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				97);
		}
		return glasgowQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlasgowTotal() {
		if (glasgowTotalEClass == null) {
			glasgowTotalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				98);
		}
		return glasgowTotalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlasgowVerbal() {
		if (glasgowVerbalEClass == null) {
			glasgowVerbalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				99);
		}
		return glasgowVerbalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjuryIncidentDescriptionSection() {
		if (injuryIncidentDescriptionSectionEClass == null) {
			injuryIncidentDescriptionSectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(100);
		}
		return injuryIncidentDescriptionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjuryCauseCategory() {
		if (injuryCauseCategoryEClass == null) {
			injuryCauseCategoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				101);
		}
		return injuryCauseCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjuryMechanism() {
		if (injuryMechanismEClass == null) {
			injuryMechanismEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				102);
		}
		return injuryMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraumaCenterCriteria() {
		if (traumaCenterCriteriaEClass == null) {
			traumaCenterCriteriaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				103);
		}
		return traumaCenterCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInjuryRiskFactor() {
		if (injuryRiskFactorEClass == null) {
			injuryRiskFactorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				104);
		}
		return injuryRiskFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleImpactArea() {
		if (vehicleImpactAreaEClass == null) {
			vehicleImpactAreaEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				105);
		}
		return vehicleImpactAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientLocationInVehicle() {
		if (patientLocationInVehicleEClass == null) {
			patientLocationInVehicleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				106);
		}
		return patientLocationInVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleOccupantSafetyEquipment() {
		if (vehicleOccupantSafetyEquipmentEClass == null) {
			vehicleOccupantSafetyEquipmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(107);
		}
		return vehicleOccupantSafetyEquipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirbagDeploymentStatus() {
		if (airbagDeploymentStatusEClass == null) {
			airbagDeploymentStatusEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				108);
		}
		return airbagDeploymentStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeightOfFall() {
		if (heightOfFallEClass == null) {
			heightOfFallEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				109);
		}
		return heightOfFallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisasterType() {
		if (disasterTypeEClass == null) {
			disasterTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				110);
		}
		return disasterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationNotAdministeredReasonObservation() {
		if (medicationNotAdministeredReasonObservationEClass == null) {
			medicationNotAdministeredReasonObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(112);
		}
		return medicationNotAdministeredReasonObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationResponseObservation() {
		if (medicationResponseObservationEClass == null) {
			medicationResponseObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				113);
		}
		return medicationResponseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationComplicationObservation() {
		if (medicationComplicationObservationEClass == null) {
			medicationComplicationObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(114);
		}
		return medicationComplicationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPriorAdministrationObservation() {
		if (medicationPriorAdministrationObservationEClass == null) {
			medicationPriorAdministrationObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(115);
		}
		return medicationPriorAdministrationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientBodyWeight() {
		if (patientBodyWeightEClass == null) {
			patientBodyWeightEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				116);
		}
		return patientBodyWeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLengthBasedPatientBodyWeightClass() {
		if (lengthBasedPatientBodyWeightClassEClass == null) {
			lengthBasedPatientBodyWeightClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(117);
		}
		return lengthBasedPatientBodyWeightClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaceAssessment() {
		if (faceAssessmentEClass == null) {
			faceAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				118);
		}
		return faceAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadAssessment() {
		if (headAssessmentEClass == null) {
			headAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				119);
		}
		return headAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeckAssessment() {
		if (neckAssessmentEClass == null) {
			neckAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				120);
		}
		return neckAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChestAndLungsAssessment() {
		if (chestAndLungsAssessmentEClass == null) {
			chestAndLungsAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				121);
		}
		return chestAndLungsAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartAssessment() {
		if (heartAssessmentEClass == null) {
			heartAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				122);
		}
		return heartAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbdomenAssessment() {
		if (abdomenAssessmentEClass == null) {
			abdomenAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				123);
		}
		return abdomenAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPelvicAndGenitourinaryAssessment() {
		if (pelvicAndGenitourinaryAssessmentEClass == null) {
			pelvicAndGenitourinaryAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(124);
		}
		return pelvicAndGenitourinaryAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackAndSpineAssessment() {
		if (backAndSpineAssessmentEClass == null) {
			backAndSpineAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				125);
		}
		return backAndSpineAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtremitiesAssessment() {
		if (extremitiesAssessmentEClass == null) {
			extremitiesAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				126);
		}
		return extremitiesAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEyeAssessment() {
		if (eyeAssessmentEClass == null) {
			eyeAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				127);
		}
		return eyeAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMentalStatusAssessment() {
		if (mentalStatusAssessmentEClass == null) {
			mentalStatusAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				128);
		}
		return mentalStatusAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardiacArrestTiming() {
		if (cardiacArrestTimingEClass == null) {
			cardiacArrestTimingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				129);
		}
		return cardiacArrestTimingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardiacArrestCause() {
		if (cardiacArrestCauseEClass == null) {
			cardiacArrestCauseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				130);
		}
		return cardiacArrestCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorCPR() {
		if (priorCPREClass == null) {
			priorCPREClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				131);
		}
		return priorCPREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorAEDUse() {
		if (priorAEDUseEClass == null) {
			priorAEDUseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				132);
		}
		return priorAEDUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrestRhythm() {
		if (arrestRhythmEClass == null) {
			arrestRhythmEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				133);
		}
		return arrestRhythmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnOfSpontaneousCirculation() {
		if (returnOfSpontaneousCirculationEClass == null) {
			returnOfSpontaneousCirculationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(134);
		}
		return returnOfSpontaneousCirculationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestinationRhythm() {
		if (destinationRhythmEClass == null) {
			destinationRhythmEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				135);
		}
		return destinationRhythmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbandonedProcedureReasonObservation() {
		if (abandonedProcedureReasonObservationEClass == null) {
			abandonedProcedureReasonObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(136);
		}
		return abandonedProcedureReasonObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePriorIndicator() {
		if (procedurePriorIndicatorEClass == null) {
			procedurePriorIndicatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				137);
		}
		return procedurePriorIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureNumberOfAttemptsObservation() {
		if (procedureNumberOfAttemptsObservationEClass == null) {
			procedureNumberOfAttemptsObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(138);
		}
		return procedureNumberOfAttemptsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureSuccessfulObservation() {
		if (procedureSuccessfulObservationEClass == null) {
			procedureSuccessfulObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(139);
		}
		return procedureSuccessfulObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureComplicationsObservation() {
		if (procedureComplicationsObservationEClass == null) {
			procedureComplicationsObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(140);
		}
		return procedureComplicationsObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePatientResponseObservation() {
		if (procedurePatientResponseObservationEClass == null) {
			procedurePatientResponseObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(141);
		}
		return procedurePatientResponseObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAirwayConfirmationObservation() {
		if (airwayConfirmationObservationEClass == null) {
			airwayConfirmationObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				142);
		}
		return airwayConfirmationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasonProcedureNotAttemptedObservation() {
		if (reasonProcedureNotAttemptedObservationEClass == null) {
			reasonProcedureNotAttemptedObservationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(143);
		}
		return reasonProcedureNotAttemptedObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaintType() {
		if (complaintTypeEClass == null) {
			complaintTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				144);
		}
		return complaintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaintDuration() {
		if (complaintDurationEClass == null) {
			complaintDurationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				145);
		}
		return complaintDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaintOrganSystem() {
		if (complaintOrganSystemEClass == null) {
			complaintOrganSystemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				146);
		}
		return complaintOrganSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeurologicalAssessment() {
		if (neurologicalAssessmentEClass == null) {
			neurologicalAssessmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				147);
		}
		return neurologicalAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistenceOfHistoryOfProcedures() {
		if (existenceOfHistoryOfProceduresEClass == null) {
			existenceOfHistoryOfProceduresEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(148);
		}
		return existenceOfHistoryOfProceduresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystolicBloodPressure() {
		if (systolicBloodPressureEClass == null) {
			systolicBloodPressureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				149);
		}
		return systolicBloodPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiastolicBloodPressure() {
		if (diastolicBloodPressureEClass == null) {
			diastolicBloodPressureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				150);
		}
		return diastolicBloodPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartRate() {
		if (heartRateEClass == null) {
			heartRateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				151);
		}
		return heartRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespiratoryRate() {
		if (respiratoryRateEClass == null) {
			respiratoryRateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				152);
		}
		return respiratoryRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyTemperature() {
		if (bodyTemperatureEClass == null) {
			bodyTemperatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				153);
		}
		return bodyTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOxygenSaturation() {
		if (oxygenSaturationEClass == null) {
			oxygenSaturationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				154);
		}
		return oxygenSaturationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolAgeCategory() {
		if (protocolAgeCategoryEClass == null) {
			protocolAgeCategoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				155);
		}
		return protocolAgeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchLocationName() {
		if (dispatchLocationNameEClass == null) {
			dispatchLocationNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				156);
		}
		return dispatchLocationNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchLocationLatitude() {
		if (dispatchLocationLatitudeEClass == null) {
			dispatchLocationLatitudeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				157);
		}
		return dispatchLocationLatitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchLocationLongitude() {
		if (dispatchLocationLongitudeEClass == null) {
			dispatchLocationLongitudeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				158);
		}
		return dispatchLocationLongitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatchDelay() {
		if (dispatchDelayEClass == null) {
			dispatchDelayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				159);
		}
		return dispatchDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDelay() {
		if (responseDelayEClass == null) {
			responseDelayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				160);
		}
		return responseDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneDelay() {
		if (sceneDelayEClass == null) {
			sceneDelayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				161);
		}
		return sceneDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportDelay() {
		if (transportDelayEClass == null) {
			transportDelayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				162);
		}
		return transportDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnaroundDelay() {
		if (turnaroundDelayEClass == null) {
			turnaroundDelayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				163);
		}
		return turnaroundDelayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseBeginningOdometerReading() {
		if (responseBeginningOdometerReadingEClass == null) {
			responseBeginningOdometerReadingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(164);
		}
		return responseBeginningOdometerReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseOnSceneOdometerReading() {
		if (responseOnSceneOdometerReadingEClass == null) {
			responseOnSceneOdometerReadingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(165);
		}
		return responseOnSceneOdometerReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDestinationOdometerReading() {
		if (responseDestinationOdometerReadingEClass == null) {
			responseDestinationOdometerReadingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				EmspcrPackage.eNS_URI).getEClassifiers().get(166);
		}
		return responseDestinationOdometerReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseEndingOdometerReading() {
		if (responseEndingOdometerReadingEClass == null) {
			responseEndingOdometerReadingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(EmspcrPackage.eNS_URI).getEClassifiers().get(
				167);
		}
		return responseEndingOdometerReadingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspcrFactory getEmspcrFactory() {
		return (EmspcrFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) {
			return;
		}
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) {
			return;
		}
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.emspcr." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // EmspcrPackageImpl
