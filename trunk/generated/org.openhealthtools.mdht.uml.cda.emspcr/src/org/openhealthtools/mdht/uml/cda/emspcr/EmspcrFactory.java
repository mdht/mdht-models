/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public interface EmspcrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmspcrFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.emspcr.impl.EmspcrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Patient Care Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Care Report</em>'.
	 * @generated
	 */
	PatientCareReport createPatientCareReport();

	/**
	 * Returns a new object of class '<em>Billing Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Section</em>'.
	 * @generated
	 */
	BillingSection createBillingSection();

	/**
	 * Returns a new object of class '<em>Billing Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Condition</em>'.
	 * @generated
	 */
	BillingCondition createBillingCondition();

	/**
	 * Returns a new object of class '<em>Level Of Service Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Of Service Observation</em>'.
	 * @generated
	 */
	LevelOfServiceObservation createLevelOfServiceObservation();

	/**
	 * Returns a new object of class '<em>Current Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Medication Section</em>'.
	 * @generated
	 */
	CurrentMedicationSection createCurrentMedicationSection();

	/**
	 * Returns a new object of class '<em>Currently On Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Currently On Medication</em>'.
	 * @generated
	 */
	CurrentlyOnMedication createCurrentlyOnMedication();

	/**
	 * Returns a new object of class '<em>Patient On Anticoagulants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient On Anticoagulants</em>'.
	 * @generated
	 */
	PatientOnAnticoagulants createPatientOnAnticoagulants();

	/**
	 * Returns a new object of class '<em>Current Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Medication</em>'.
	 * @generated
	 */
	CurrentMedication createCurrentMedication();

	/**
	 * Returns a new object of class '<em>Cardiac Arrest Event Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardiac Arrest Event Section</em>'.
	 * @generated
	 */
	CardiacArrestEventSection createCardiacArrestEventSection();

	/**
	 * Returns a new object of class '<em>Cardiac Arrest Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardiac Arrest Existence</em>'.
	 * @generated
	 */
	CardiacArrestExistence createCardiacArrestExistence();

	/**
	 * Returns a new object of class '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section</em>'.
	 * @generated
	 */
	AdvanceDirectivesSection createAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advanced Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advanced Directive Observation</em>'.
	 * @generated
	 */
	AdvancedDirectiveObservation createAdvancedDirectiveObservation();

	/**
	 * Returns a new object of class '<em>Allergies And Adverse Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies And Adverse Reactions Section</em>'.
	 * @generated
	 */
	AllergiesAndAdverseReactionsSection createAllergiesAndAdverseReactionsSection();

	/**
	 * Returns a new object of class '<em>Existence Of Drug Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence Of Drug Allergy Observation</em>'.
	 * @generated
	 */
	ExistenceOfDrugAllergyObservation createExistenceOfDrugAllergyObservation();

	/**
	 * Returns a new object of class '<em>Drug Allergy Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drug Allergy Problem Act</em>'.
	 * @generated
	 */
	DrugAllergyProblemAct createDrugAllergyProblemAct();

	/**
	 * Returns a new object of class '<em>Environmental Allergies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environmental Allergies</em>'.
	 * @generated
	 */
	EnvironmentalAllergies createEnvironmentalAllergies();

	/**
	 * Returns a new object of class '<em>Existence Of Environmental Allergy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence Of Environmental Allergy</em>'.
	 * @generated
	 */
	ExistenceOfEnvironmentalAllergy createExistenceOfEnvironmentalAllergy();

	/**
	 * Returns a new object of class '<em>Environmental Allergy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environmental Allergy</em>'.
	 * @generated
	 */
	EnvironmentalAllergy createEnvironmentalAllergy();

	/**
	 * Returns a new object of class '<em>Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Past Medical History Section</em>'.
	 * @generated
	 */
	PastMedicalHistorySection createPastMedicalHistorySection();

	/**
	 * Returns a new object of class '<em>Existence Of History Of Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence Of History Of Condition</em>'.
	 * @generated
	 */
	ExistenceOfHistoryOfCondition createExistenceOfHistoryOfCondition();

	/**
	 * Returns a new object of class '<em>History Of Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Condition</em>'.
	 * @generated
	 */
	HistoryOfCondition createHistoryOfCondition();

	/**
	 * Returns a new object of class '<em>History Of Procedures Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Procedures Organizer</em>'.
	 * @generated
	 */
	HistoryOfProceduresOrganizer createHistoryOfProceduresOrganizer();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	SocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Existence Of Drug Use Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence Of Drug Use Indication</em>'.
	 * @generated
	 */
	ExistenceOfDrugUseIndication createExistenceOfDrugUseIndication();

	/**
	 * Returns a new object of class '<em>Drug Use Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drug Use Indication</em>'.
	 * @generated
	 */
	DrugUseIndication createDrugUseIndication();

	/**
	 * Returns a new object of class '<em>Physical Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Assessment Section</em>'.
	 * @generated
	 */
	PhysicalAssessmentSection createPhysicalAssessmentSection();

	/**
	 * Returns a new object of class '<em>Physical Assessment Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Assessment Organizer</em>'.
	 * @generated
	 */
	PhysicalAssessmentOrganizer createPhysicalAssessmentOrganizer();

	/**
	 * Returns a new object of class '<em>Skin Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skin Assessment</em>'.
	 * @generated
	 */
	SkinAssessment createSkinAssessment();

	/**
	 * Returns a new object of class '<em>Patient Pregnancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Pregnancy</em>'.
	 * @generated
	 */
	PatientPregnancy createPatientPregnancy();

	/**
	 * Returns a new object of class '<em>Last Oral Intake</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Oral Intake</em>'.
	 * @generated
	 */
	LastOralIntake createLastOralIntake();

	/**
	 * Returns a new object of class '<em>Patient Age</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Age</em>'.
	 * @generated
	 */
	PatientAge createPatientAge();

	/**
	 * Returns a new object of class '<em>Thrombolytic Contraindications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thrombolytic Contraindications</em>'.
	 * @generated
	 */
	ThrombolyticContraindications createThrombolyticContraindications();

	/**
	 * Returns a new object of class '<em>Barriers To Patient Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Barriers To Patient Care</em>'.
	 * @generated
	 */
	BarriersToPatientCare createBarriersToPatientCare();

	/**
	 * Returns a new object of class '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section</em>'.
	 * @generated
	 */
	MedicationsAdministeredSection createMedicationsAdministeredSection();

	/**
	 * Returns a new object of class '<em>Medication Administered</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Administered</em>'.
	 * @generated
	 */
	MedicationAdministered createMedicationAdministered();

	/**
	 * Returns a new object of class '<em>Procedures Performed Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Performed Section</em>'.
	 * @generated
	 */
	ProceduresPerformedSection createProceduresPerformedSection();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Patient Care Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Care Narrative Section</em>'.
	 * @generated
	 */
	PatientCareNarrativeSection createPatientCareNarrativeSection();

	/**
	 * Returns a new object of class '<em>Scene Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Section</em>'.
	 * @generated
	 */
	SceneSection createSceneSection();

	/**
	 * Returns a new object of class '<em>First Unit Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Unit Indicator</em>'.
	 * @generated
	 */
	FirstUnitIndicator createFirstUnitIndicator();

	/**
	 * Returns a new object of class '<em>First Unit On Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Unit On Scene</em>'.
	 * @generated
	 */
	FirstUnitOnScene createFirstUnitOnScene();

	/**
	 * Returns a new object of class '<em>Scene Patient Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Patient Count</em>'.
	 * @generated
	 */
	ScenePatientCount createScenePatientCount();

	/**
	 * Returns a new object of class '<em>Mass Casualty Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mass Casualty Indicator</em>'.
	 * @generated
	 */
	MassCasualtyIndicator createMassCasualtyIndicator();

	/**
	 * Returns a new object of class '<em>Location Type Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Type Observation</em>'.
	 * @generated
	 */
	LocationTypeObservation createLocationTypeObservation();

	/**
	 * Returns a new object of class '<em>Dispatch Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Section</em>'.
	 * @generated
	 */
	DispatchSection createDispatchSection();

	/**
	 * Returns a new object of class '<em>Emergency Medical Dispatch Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emergency Medical Dispatch Observation</em>'.
	 * @generated
	 */
	EmergencyMedicalDispatchObservation createEmergencyMedicalDispatchObservation();

	/**
	 * Returns a new object of class '<em>Complaint Reported By Dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint Reported By Dispatch</em>'.
	 * @generated
	 */
	ComplaintReportedByDispatch createComplaintReportedByDispatch();

	/**
	 * Returns a new object of class '<em>Disposition Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disposition Section</em>'.
	 * @generated
	 */
	DispositionSection createDispositionSection();

	/**
	 * Returns a new object of class '<em>Transport Method Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Method Observation</em>'.
	 * @generated
	 */
	TransportMethodObservation createTransportMethodObservation();

	/**
	 * Returns a new object of class '<em>Number Of Patients Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Of Patients Observation</em>'.
	 * @generated
	 */
	NumberOfPatientsObservation createNumberOfPatientsObservation();

	/**
	 * Returns a new object of class '<em>Incident Disposition Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incident Disposition Observation</em>'.
	 * @generated
	 */
	IncidentDispositionObservation createIncidentDispositionObservation();

	/**
	 * Returns a new object of class '<em>Transport Mode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Mode Observation</em>'.
	 * @generated
	 */
	TransportModeObservation createTransportModeObservation();

	/**
	 * Returns a new object of class '<em>Reason For Choosing Destination Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Choosing Destination Observation</em>'.
	 * @generated
	 */
	ReasonForChoosingDestinationObservation createReasonForChoosingDestinationObservation();

	/**
	 * Returns a new object of class '<em>Prearrival Activation Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prearrival Activation Observation</em>'.
	 * @generated
	 */
	PrearrivalActivationObservation createPrearrivalActivationObservation();

	/**
	 * Returns a new object of class '<em>Patient Condition Change At Destination Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Condition Change At Destination Observation</em>'.
	 * @generated
	 */
	PatientConditionChangeAtDestinationObservation createPatientConditionChangeAtDestinationObservation();

	/**
	 * Returns a new object of class '<em>Personnel Adverse Event Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personnel Adverse Event Section</em>'.
	 * @generated
	 */
	PersonnelAdverseEventSection createPersonnelAdverseEventSection();

	/**
	 * Returns a new object of class '<em>Adverse Event Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adverse Event Indicator</em>'.
	 * @generated
	 */
	AdverseEventIndicator createAdverseEventIndicator();

	/**
	 * Returns a new object of class '<em>Adverse Event Type Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adverse Event Type Observation</em>'.
	 * @generated
	 */
	AdverseEventTypeObservation createAdverseEventTypeObservation();

	/**
	 * Returns a new object of class '<em>Protocol Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Section</em>'.
	 * @generated
	 */
	ProtocolSection createProtocolSection();

	/**
	 * Returns a new object of class '<em>Protocol Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Observation</em>'.
	 * @generated
	 */
	ProtocolObservation createProtocolObservation();

	/**
	 * Returns a new object of class '<em>Candidate Patient Registry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Candidate Patient Registry Type</em>'.
	 * @generated
	 */
	CandidatePatientRegistryType createCandidatePatientRegistryType();

	/**
	 * Returns a new object of class '<em>Response Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Section</em>'.
	 * @generated
	 */
	ResponseSection createResponseSection();

	/**
	 * Returns a new object of class '<em>Delay Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Organizer</em>'.
	 * @generated
	 */
	DelayOrganizer createDelayOrganizer();

	/**
	 * Returns a new object of class '<em>Dispatch Location Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Location Organizer</em>'.
	 * @generated
	 */
	DispatchLocationOrganizer createDispatchLocationOrganizer();

	/**
	 * Returns a new object of class '<em>Response Odometer Reading Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Odometer Reading Organizer</em>'.
	 * @generated
	 */
	ResponseOdometerReadingOrganizer createResponseOdometerReadingOrganizer();

	/**
	 * Returns a new object of class '<em>Response Mode To Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Mode To Scene</em>'.
	 * @generated
	 */
	ResponseModeToScene createResponseModeToScene();

	/**
	 * Returns a new object of class '<em>Situation Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Situation Section</em>'.
	 * @generated
	 */
	SituationSection createSituationSection();

	/**
	 * Returns a new object of class '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint</em>'.
	 * @generated
	 */
	Complaint createComplaint();

	/**
	 * Returns a new object of class '<em>Possible Injury</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Possible Injury</em>'.
	 * @generated
	 */
	PossibleInjury createPossibleInjury();

	/**
	 * Returns a new object of class '<em>Provider Primary Impression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider Primary Impression</em>'.
	 * @generated
	 */
	ProviderPrimaryImpression createProviderPrimaryImpression();

	/**
	 * Returns a new object of class '<em>Primary Symptom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Symptom</em>'.
	 * @generated
	 */
	PrimarySymptom createPrimarySymptom();

	/**
	 * Returns a new object of class '<em>Other Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Symptoms</em>'.
	 * @generated
	 */
	OtherSymptoms createOtherSymptoms();

	/**
	 * Returns a new object of class '<em>Provider Secondary Impressions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider Secondary Impressions</em>'.
	 * @generated
	 */
	ProviderSecondaryImpressions createProviderSecondaryImpressions();

	/**
	 * Returns a new object of class '<em>Initial Patient Acuity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Patient Acuity</em>'.
	 * @generated
	 */
	InitialPatientAcuity createInitialPatientAcuity();

	/**
	 * Returns a new object of class '<em>Times Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Times Section</em>'.
	 * @generated
	 */
	TimesSection createTimesSection();

	/**
	 * Returns a new object of class '<em>Call Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Time</em>'.
	 * @generated
	 */
	CallTime createCallTime();

	/**
	 * Returns a new object of class '<em>Unit Notified Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Notified Time</em>'.
	 * @generated
	 */
	UnitNotifiedTime createUnitNotifiedTime();

	/**
	 * Returns a new object of class '<em>Unit En Route Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit En Route Time</em>'.
	 * @generated
	 */
	UnitEnRouteTime createUnitEnRouteTime();

	/**
	 * Returns a new object of class '<em>Unit On Scene Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit On Scene Time</em>'.
	 * @generated
	 */
	UnitOnSceneTime createUnitOnSceneTime();

	/**
	 * Returns a new object of class '<em>Unit At Patientt Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit At Patientt Time</em>'.
	 * @generated
	 */
	UnitAtPatienttTime createUnitAtPatienttTime();

	/**
	 * Returns a new object of class '<em>Unit Left Scene Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Left Scene Time</em>'.
	 * @generated
	 */
	UnitLeftSceneTime createUnitLeftSceneTime();

	/**
	 * Returns a new object of class '<em>Patient Arrived At Destination Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Arrived At Destination Time</em>'.
	 * @generated
	 */
	PatientArrivedAtDestinationTime createPatientArrivedAtDestinationTime();

	/**
	 * Returns a new object of class '<em>Unit Back In Service Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Back In Service Time</em>'.
	 * @generated
	 */
	UnitBackInServiceTime createUnitBackInServiceTime();

	/**
	 * Returns a new object of class '<em>Dispatch Notified Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Notified Time</em>'.
	 * @generated
	 */
	DispatchNotifiedTime createDispatchNotifiedTime();

	/**
	 * Returns a new object of class '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section</em>'.
	 * @generated
	 */
	VitalSignsSection createVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer</em>'.
	 * @generated
	 */
	VitalSignsOrganizer createVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Prior Aid Vitals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior Aid Vitals</em>'.
	 * @generated
	 */
	PriorAidVitals createPriorAidVitals();

	/**
	 * Returns a new object of class '<em>Additional Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Vital Signs Organizer</em>'.
	 * @generated
	 */
	AdditionalVitalSignsOrganizer createAdditionalVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Stroke Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stroke Score</em>'.
	 * @generated
	 */
	StrokeScore createStrokeScore();

	/**
	 * Returns a new object of class '<em>Pain Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pain Score</em>'.
	 * @generated
	 */
	PainScore createPainScore();

	/**
	 * Returns a new object of class '<em>Level Of Responsiveness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Of Responsiveness</em>'.
	 * @generated
	 */
	LevelOfResponsiveness createLevelOfResponsiveness();

	/**
	 * Returns a new object of class '<em>Blood Glucose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blood Glucose</em>'.
	 * @generated
	 */
	BloodGlucose createBloodGlucose();

	/**
	 * Returns a new object of class '<em>Carbon Monoxide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carbon Monoxide</em>'.
	 * @generated
	 */
	CarbonMonoxide createCarbonMonoxide();

	/**
	 * Returns a new object of class '<em>Carbon Dioxide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carbon Dioxide</em>'.
	 * @generated
	 */
	CarbonDioxide createCarbonDioxide();

	/**
	 * Returns a new object of class '<em>Cardiac Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardiac Rhythm</em>'.
	 * @generated
	 */
	CardiacRhythm createCardiacRhythm();

	/**
	 * Returns a new object of class '<em>Glasgow Coma Score Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glasgow Coma Score Organizer</em>'.
	 * @generated
	 */
	GlasgowComaScoreOrganizer createGlasgowComaScoreOrganizer();

	/**
	 * Returns a new object of class '<em>Glasgow Eye</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glasgow Eye</em>'.
	 * @generated
	 */
	GlasgowEye createGlasgowEye();

	/**
	 * Returns a new object of class '<em>Glasgow Motor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glasgow Motor</em>'.
	 * @generated
	 */
	GlasgowMotor createGlasgowMotor();

	/**
	 * Returns a new object of class '<em>Glasgow Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glasgow Qualifier</em>'.
	 * @generated
	 */
	GlasgowQualifier createGlasgowQualifier();

	/**
	 * Returns a new object of class '<em>Glasgow Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glasgow Total</em>'.
	 * @generated
	 */
	GlasgowTotal createGlasgowTotal();

	/**
	 * Returns a new object of class '<em>Glasgow Verbal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glasgow Verbal</em>'.
	 * @generated
	 */
	GlasgowVerbal createGlasgowVerbal();

	/**
	 * Returns a new object of class '<em>Injury Incident Description Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Injury Incident Description Section</em>'.
	 * @generated
	 */
	InjuryIncidentDescriptionSection createInjuryIncidentDescriptionSection();

	/**
	 * Returns a new object of class '<em>Injury Cause Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Injury Cause Category</em>'.
	 * @generated
	 */
	InjuryCauseCategory createInjuryCauseCategory();

	/**
	 * Returns a new object of class '<em>Injury Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Injury Mechanism</em>'.
	 * @generated
	 */
	InjuryMechanism createInjuryMechanism();

	/**
	 * Returns a new object of class '<em>Trauma Center Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trauma Center Criteria</em>'.
	 * @generated
	 */
	TraumaCenterCriteria createTraumaCenterCriteria();

	/**
	 * Returns a new object of class '<em>Injury Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Injury Risk Factor</em>'.
	 * @generated
	 */
	InjuryRiskFactor createInjuryRiskFactor();

	/**
	 * Returns a new object of class '<em>Vehicle Impact Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Impact Area</em>'.
	 * @generated
	 */
	VehicleImpactArea createVehicleImpactArea();

	/**
	 * Returns a new object of class '<em>Patient Location In Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Location In Vehicle</em>'.
	 * @generated
	 */
	PatientLocationInVehicle createPatientLocationInVehicle();

	/**
	 * Returns a new object of class '<em>Vehicle Occupant Safety Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Occupant Safety Equipment</em>'.
	 * @generated
	 */
	VehicleOccupantSafetyEquipment createVehicleOccupantSafetyEquipment();

	/**
	 * Returns a new object of class '<em>Airbag Deployment Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Airbag Deployment Status</em>'.
	 * @generated
	 */
	AirbagDeploymentStatus createAirbagDeploymentStatus();

	/**
	 * Returns a new object of class '<em>Height Of Fall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Height Of Fall</em>'.
	 * @generated
	 */
	HeightOfFall createHeightOfFall();

	/**
	 * Returns a new object of class '<em>Disaster Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disaster Type</em>'.
	 * @generated
	 */
	DisasterType createDisasterType();

	/**
	 * Returns a new object of class '<em>Medication Not Administered Reason Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Not Administered Reason Observation</em>'.
	 * @generated
	 */
	MedicationNotAdministeredReasonObservation createMedicationNotAdministeredReasonObservation();

	/**
	 * Returns a new object of class '<em>Medication Response Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Response Observation</em>'.
	 * @generated
	 */
	MedicationResponseObservation createMedicationResponseObservation();

	/**
	 * Returns a new object of class '<em>Medication Complication Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Complication Observation</em>'.
	 * @generated
	 */
	MedicationComplicationObservation createMedicationComplicationObservation();

	/**
	 * Returns a new object of class '<em>Medication Prior Administration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Prior Administration Observation</em>'.
	 * @generated
	 */
	MedicationPriorAdministrationObservation createMedicationPriorAdministrationObservation();

	/**
	 * Returns a new object of class '<em>Patient Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Body Weight</em>'.
	 * @generated
	 */
	PatientBodyWeight createPatientBodyWeight();

	/**
	 * Returns a new object of class '<em>Length Based Patient Body Weight Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Based Patient Body Weight Class</em>'.
	 * @generated
	 */
	LengthBasedPatientBodyWeightClass createLengthBasedPatientBodyWeightClass();

	/**
	 * Returns a new object of class '<em>Face Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Face Assessment</em>'.
	 * @generated
	 */
	FaceAssessment createFaceAssessment();

	/**
	 * Returns a new object of class '<em>Head Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head Assessment</em>'.
	 * @generated
	 */
	HeadAssessment createHeadAssessment();

	/**
	 * Returns a new object of class '<em>Neck Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neck Assessment</em>'.
	 * @generated
	 */
	NeckAssessment createNeckAssessment();

	/**
	 * Returns a new object of class '<em>Chest And Lungs Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chest And Lungs Assessment</em>'.
	 * @generated
	 */
	ChestAndLungsAssessment createChestAndLungsAssessment();

	/**
	 * Returns a new object of class '<em>Heart Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heart Assessment</em>'.
	 * @generated
	 */
	HeartAssessment createHeartAssessment();

	/**
	 * Returns a new object of class '<em>Abdomen Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abdomen Assessment</em>'.
	 * @generated
	 */
	AbdomenAssessment createAbdomenAssessment();

	/**
	 * Returns a new object of class '<em>Pelvic And Genitourinary Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pelvic And Genitourinary Assessment</em>'.
	 * @generated
	 */
	PelvicAndGenitourinaryAssessment createPelvicAndGenitourinaryAssessment();

	/**
	 * Returns a new object of class '<em>Back And Spine Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Back And Spine Assessment</em>'.
	 * @generated
	 */
	BackAndSpineAssessment createBackAndSpineAssessment();

	/**
	 * Returns a new object of class '<em>Extremities Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extremities Assessment</em>'.
	 * @generated
	 */
	ExtremitiesAssessment createExtremitiesAssessment();

	/**
	 * Returns a new object of class '<em>Eye Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eye Assessment</em>'.
	 * @generated
	 */
	EyeAssessment createEyeAssessment();

	/**
	 * Returns a new object of class '<em>Mental Status Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mental Status Assessment</em>'.
	 * @generated
	 */
	MentalStatusAssessment createMentalStatusAssessment();

	/**
	 * Returns a new object of class '<em>Cardiac Arrest Timing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardiac Arrest Timing</em>'.
	 * @generated
	 */
	CardiacArrestTiming createCardiacArrestTiming();

	/**
	 * Returns a new object of class '<em>Cardiac Arrest Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardiac Arrest Cause</em>'.
	 * @generated
	 */
	CardiacArrestCause createCardiacArrestCause();

	/**
	 * Returns a new object of class '<em>Prior CPR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior CPR</em>'.
	 * @generated
	 */
	PriorCPR createPriorCPR();

	/**
	 * Returns a new object of class '<em>Prior AED Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior AED Use</em>'.
	 * @generated
	 */
	PriorAEDUse createPriorAEDUse();

	/**
	 * Returns a new object of class '<em>Arrest Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrest Rhythm</em>'.
	 * @generated
	 */
	ArrestRhythm createArrestRhythm();

	/**
	 * Returns a new object of class '<em>Return Of Spontaneous Circulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Of Spontaneous Circulation</em>'.
	 * @generated
	 */
	ReturnOfSpontaneousCirculation createReturnOfSpontaneousCirculation();

	/**
	 * Returns a new object of class '<em>Destination Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination Rhythm</em>'.
	 * @generated
	 */
	DestinationRhythm createDestinationRhythm();

	/**
	 * Returns a new object of class '<em>Abandoned Procedure Reason Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abandoned Procedure Reason Observation</em>'.
	 * @generated
	 */
	AbandonedProcedureReasonObservation createAbandonedProcedureReasonObservation();

	/**
	 * Returns a new object of class '<em>Procedure Prior Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Prior Indicator</em>'.
	 * @generated
	 */
	ProcedurePriorIndicator createProcedurePriorIndicator();

	/**
	 * Returns a new object of class '<em>Procedure Number Of Attempts Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Number Of Attempts Observation</em>'.
	 * @generated
	 */
	ProcedureNumberOfAttemptsObservation createProcedureNumberOfAttemptsObservation();

	/**
	 * Returns a new object of class '<em>Procedure Successful Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Successful Observation</em>'.
	 * @generated
	 */
	ProcedureSuccessfulObservation createProcedureSuccessfulObservation();

	/**
	 * Returns a new object of class '<em>Procedure Complications Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Complications Observation</em>'.
	 * @generated
	 */
	ProcedureComplicationsObservation createProcedureComplicationsObservation();

	/**
	 * Returns a new object of class '<em>Procedure Patient Response Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Patient Response Observation</em>'.
	 * @generated
	 */
	ProcedurePatientResponseObservation createProcedurePatientResponseObservation();

	/**
	 * Returns a new object of class '<em>Airway Confirmation Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Airway Confirmation Observation</em>'.
	 * @generated
	 */
	AirwayConfirmationObservation createAirwayConfirmationObservation();

	/**
	 * Returns a new object of class '<em>Reason Procedure Not Attempted Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason Procedure Not Attempted Observation</em>'.
	 * @generated
	 */
	ReasonProcedureNotAttemptedObservation createReasonProcedureNotAttemptedObservation();

	/**
	 * Returns a new object of class '<em>Complaint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint Type</em>'.
	 * @generated
	 */
	ComplaintType createComplaintType();

	/**
	 * Returns a new object of class '<em>Complaint Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint Duration</em>'.
	 * @generated
	 */
	ComplaintDuration createComplaintDuration();

	/**
	 * Returns a new object of class '<em>Complaint Organ System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint Organ System</em>'.
	 * @generated
	 */
	ComplaintOrganSystem createComplaintOrganSystem();

	/**
	 * Returns a new object of class '<em>Neurological Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neurological Assessment</em>'.
	 * @generated
	 */
	NeurologicalAssessment createNeurologicalAssessment();

	/**
	 * Returns a new object of class '<em>Existence Of History Of Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence Of History Of Procedures</em>'.
	 * @generated
	 */
	ExistenceOfHistoryOfProcedures createExistenceOfHistoryOfProcedures();

	/**
	 * Returns a new object of class '<em>Systolic Blood Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systolic Blood Pressure</em>'.
	 * @generated
	 */
	SystolicBloodPressure createSystolicBloodPressure();

	/**
	 * Returns a new object of class '<em>Diastolic Blood Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diastolic Blood Pressure</em>'.
	 * @generated
	 */
	DiastolicBloodPressure createDiastolicBloodPressure();

	/**
	 * Returns a new object of class '<em>Heart Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heart Rate</em>'.
	 * @generated
	 */
	HeartRate createHeartRate();

	/**
	 * Returns a new object of class '<em>Respiratory Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respiratory Rate</em>'.
	 * @generated
	 */
	RespiratoryRate createRespiratoryRate();

	/**
	 * Returns a new object of class '<em>Body Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body Temperature</em>'.
	 * @generated
	 */
	BodyTemperature createBodyTemperature();

	/**
	 * Returns a new object of class '<em>Oxygen Saturation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Oxygen Saturation</em>'.
	 * @generated
	 */
	OxygenSaturation createOxygenSaturation();

	/**
	 * Returns a new object of class '<em>Protocol Age Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Age Category</em>'.
	 * @generated
	 */
	ProtocolAgeCategory createProtocolAgeCategory();

	/**
	 * Returns a new object of class '<em>Dispatch Location Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Location Name</em>'.
	 * @generated
	 */
	DispatchLocationName createDispatchLocationName();

	/**
	 * Returns a new object of class '<em>Dispatch Location Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Location Latitude</em>'.
	 * @generated
	 */
	DispatchLocationLatitude createDispatchLocationLatitude();

	/**
	 * Returns a new object of class '<em>Dispatch Location Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Location Longitude</em>'.
	 * @generated
	 */
	DispatchLocationLongitude createDispatchLocationLongitude();

	/**
	 * Returns a new object of class '<em>Dispatch Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispatch Delay</em>'.
	 * @generated
	 */
	DispatchDelay createDispatchDelay();

	/**
	 * Returns a new object of class '<em>Response Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Delay</em>'.
	 * @generated
	 */
	ResponseDelay createResponseDelay();

	/**
	 * Returns a new object of class '<em>Scene Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Delay</em>'.
	 * @generated
	 */
	SceneDelay createSceneDelay();

	/**
	 * Returns a new object of class '<em>Transport Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Delay</em>'.
	 * @generated
	 */
	TransportDelay createTransportDelay();

	/**
	 * Returns a new object of class '<em>Turnaround Delay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turnaround Delay</em>'.
	 * @generated
	 */
	TurnaroundDelay createTurnaroundDelay();

	/**
	 * Returns a new object of class '<em>Response Beginning Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Beginning Odometer Reading</em>'.
	 * @generated
	 */
	ResponseBeginningOdometerReading createResponseBeginningOdometerReading();

	/**
	 * Returns a new object of class '<em>Response On Scene Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response On Scene Odometer Reading</em>'.
	 * @generated
	 */
	ResponseOnSceneOdometerReading createResponseOnSceneOdometerReading();

	/**
	 * Returns a new object of class '<em>Response Destination Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Destination Odometer Reading</em>'.
	 * @generated
	 */
	ResponseDestinationOdometerReading createResponseDestinationOdometerReading();

	/**
	 * Returns a new object of class '<em>Response Ending Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Ending Odometer Reading</em>'.
	 * @generated
	 */
	ResponseEndingOdometerReading createResponseEndingOdometerReading();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmspcrPackage getEmspcrPackage();

} //EmspcrFactory
