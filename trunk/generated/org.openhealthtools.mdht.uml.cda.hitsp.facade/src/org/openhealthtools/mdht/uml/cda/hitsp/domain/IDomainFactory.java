/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage
 * @generated
 */
public interface IDomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IDomainFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Drug Sensitivity</em>'.
	 * @generated
	 */
	IAllergyDrugSensitivity createAllergyDrugSensitivity();

	/**
	 * Returns a new object of class '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Observation</em>'.
	 * @generated
	 */
	IEpisodeObservation createEpisodeObservation();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance</em>'.
	 * @generated
	 */
	IAllergyIntolerance createAllergyIntolerance();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	IMedication createMedication();

	/**
	 * Returns a new object of class '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Series Number Observation</em>'.
	 * @generated
	 */
	IMedicationSeriesNumberObservation createMedicationSeriesNumberObservation();

	/**
	 * Returns a new object of class '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Status Observation</em>'.
	 * @generated
	 */
	IMedicationStatusObservation createMedicationStatusObservation();

	/**
	 * Returns a new object of class '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Observation</em>'.
	 * @generated
	 */
	IReactionObservation createReactionObservation();

	/**
	 * Returns a new object of class '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity Observation</em>'.
	 * @generated
	 */
	ISeverityObservation createSeverityObservation();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	IProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reference</em>'.
	 * @generated
	 */
	IInternalReference createInternalReference();

	/**
	 * Returns a new object of class '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Medical Instructions</em>'.
	 * @generated
	 */
	IPatientMedicalInstructions createPatientMedicalInstructions();

	/**
	 * Returns a new object of class '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Type</em>'.
	 * @generated
	 */
	IMedicationType createMedicationType();

	/**
	 * Returns a new object of class '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Information</em>'.
	 * @generated
	 */
	IMedicationOrderInformation createMedicationOrderInformation();

	/**
	 * Returns a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * @generated
	 */
	IMedicationFullfillmentInstructions createMedicationFullfillmentInstructions();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	ICondition createCondition();

	/**
	 * Returns a new object of class '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Entry</em>'.
	 * @generated
	 */
	IProblemEntry createProblemEntry();

	/**
	 * Returns a new object of class '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Observation</em>'.
	 * @generated
	 */
	IAgeObservation createAgeObservation();

	/**
	 * Returns a new object of class '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity</em>'.
	 * @generated
	 */
	ISeverity createSeverity();

	/**
	 * Returns a new object of class '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status Observation</em>'.
	 * @generated
	 */
	IProblemStatusObservation createProblemStatusObservation();

	/**
	 * Returns a new object of class '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Observation</em>'.
	 * @generated
	 */
	IStatusObservation createStatusObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	IHealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Summary</em>'.
	 * @generated
	 */
	IPatientSummary createPatientSummary();

	/**
	 * Returns a new object of class '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section</em>'.
	 * @generated
	 */
	IAdvanceDirectivesSection createAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive</em>'.
	 * @generated
	 */
	IAdvanceDirective createAdvanceDirective();

	/**
	 * Returns a new object of class '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Verification</em>'.
	 * @generated
	 */
	IAdvanceDirectiveVerification createAdvanceDirectiveVerification();

	/**
	 * Returns a new object of class '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Status Observation</em>'.
	 * @generated
	 */
	IAdvanceDirectiveStatusObservation createAdvanceDirectiveStatusObservation();

	/**
	 * Returns a new object of class '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Reference</em>'.
	 * @generated
	 */
	IAdvanceDirectiveReference createAdvanceDirectiveReference();

	/**
	 * Returns a new object of class '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Reactions Section</em>'.
	 * @generated
	 */
	IAllergiesReactionsSection createAllergiesReactionsSection();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	IComment createComment();

	/**
	 * Returns a new object of class '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause Of Death Observation</em>'.
	 * @generated
	 */
	ICauseOfDeathObservation createCauseOfDeathObservation();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	IFamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Observation</em>'.
	 * @generated
	 */
	ISimpleObservation createSimpleObservation();

	/**
	 * Returns a new object of class '<em>Problem Entry Reaction Observation Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Entry Reaction Observation Container</em>'.
	 * @generated
	 */
	IProblemEntryReactionObservationContainer createProblemEntryReactionObservationContainer();

	/**
	 * Returns a new object of class '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem List Section</em>'.
	 * @generated
	 */
	IProblemListSection createProblemListSection();

	/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	IEncountersSection createEncountersSection();

	/**
	 * Returns a new object of class '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Activity</em>'.
	 * @generated
	 */
	IEncountersActivity createEncountersActivity();

	/**
	 * Returns a new object of class '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Location</em>'.
	 * @generated
	 */
	IEncounterLocation createEncounterLocation();

	/**
	 * Returns a new object of class '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter</em>'.
	 * @generated
	 */
	IEncounter createEncounter();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	IImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	IImmunization createImmunization();

	/**
	 * Returns a new object of class '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section</em>'.
	 * @generated
	 */
	IPayersSection createPayersSection();

	/**
	 * Returns a new object of class '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entity</em>'.
	 * @generated
	 */
	IPayerEntity createPayerEntity();

	/**
	 * Returns a new object of class '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Covered Party</em>'.
	 * @generated
	 */
	ICoveredParty createCoveredParty();

	/**
	 * Returns a new object of class '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Subscriber</em>'.
	 * @generated
	 */
	IPolicySubscriber createPolicySubscriber();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	IMedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Section</em>'.
	 * @generated
	 */
	IPlanOfCareSection createPlanOfCareSection();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * @generated
	 */
	IPlanOfCareActivityAct createPlanOfCareActivityAct();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity</em>'.
	 * @generated
	 */
	IPlanOfCareActivity createPlanOfCareActivity();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * @generated
	 */
	IPlanOfCareActivityEncounter createPlanOfCareActivityEncounter();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * @generated
	 */
	IPlanOfCareActivityObservation createPlanOfCareActivityObservation();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * @generated
	 */
	IPlanOfCareActivityProcedure createPlanOfCareActivityProcedure();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @generated
	 */
	IPlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * @generated
	 */
	IPlanOfCareActivitySupply createPlanOfCareActivitySupply();

	/**
	 * Returns a new object of class '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgeries Section</em>'.
	 * @generated
	 */
	ISurgeriesSection createSurgeriesSection();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	IExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @generated
	 */
	IProcedureEntryProcedureActivityProcedure createProcedureEntryProcedureActivityProcedure();

	/**
	 * Returns a new object of class '<em>Procedure Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Entry</em>'.
	 * @generated
	 */
	IProcedureEntry createProcedureEntry();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	IProcedure createProcedure();

	/**
	 * Returns a new object of class '<em>Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy History Section</em>'.
	 * @generated
	 */
	IPregnancyHistorySection createPregnancyHistorySection();

	/**
	 * Returns a new object of class '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy Observation</em>'.
	 * @generated
	 */
	IPregnancyObservation createPregnancyObservation();

	/**
	 * Returns a new object of class '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support</em>'.
	 * @generated
	 */
	ISupport createSupport();

	/**
	 * Returns a new object of class '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section</em>'.
	 * @generated
	 */
	IVitalSignsSection createVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer</em>'.
	 * @generated
	 */
	IVitalSignsOrganizer createVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign Observation</em>'.
	 * @generated
	 */
	IVitalSignObservation createVitalSignObservation();

	/**
	 * Returns a new object of class '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Results Section</em>'.
	 * @generated
	 */
	IDiagnosticResultsSection createDiagnosticResultsSection();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	IResult createResult();

	/**
	 * Returns a new object of class '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign</em>'.
	 * @generated
	 */
	IVitalSign createVitalSign();

	/**
	 * Returns a new object of class '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Past Illness Section</em>'.
	 * @generated
	 */
	IHistoryOfPastIllnessSection createHistoryOfPastIllnessSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint Section</em>'.
	 * @generated
	 */
	IChiefComplaintSection createChiefComplaintSection();

	/**
	 * Returns a new object of class '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Referral Section</em>'.
	 * @generated
	 */
	IReasonForReferralSection createReasonForReferralSection();

	/**
	 * Returns a new object of class '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Present Illness</em>'.
	 * @generated
	 */
	IHistoryOfPresentIllness createHistoryOfPresentIllness();

	/**
	 * Returns a new object of class '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Section</em>'.
	 * @generated
	 */
	IFunctionalStatusSection createFunctionalStatusSection();

	/**
	 * Returns a new object of class '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose Section</em>'.
	 * @generated
	 */
	IPurposeSection createPurposeSection();

	/**
	 * Returns a new object of class '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose Activity</em>'.
	 * @generated
	 */
	IPurposeActivity createPurposeActivity();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @generated
	 */
	IHospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diagnosis Section</em>'.
	 * @generated
	 */
	IDischargeDiagnosisSection createDischargeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Medication History Section</em>'.
	 * @generated
	 */
	IAdmissionMedicationHistorySection createAdmissionMedicationHistorySection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * @generated
	 */
	IHospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection();

	/**
	 * Returns a new object of class '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section</em>'.
	 * @generated
	 */
	IMedicationsAdministeredSection createMedicationsAdministeredSection();

	/**
	 * Returns a new object of class '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Section</em>'.
	 * @generated
	 */
	IPhysicalExamSection createPhysicalExamSection();

	/**
	 * Returns a new object of class '<em>General Appearance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Appearance Section</em>'.
	 * @generated
	 */
	IGeneralAppearanceSection createGeneralAppearanceSection();

	/**
	 * Returns a new object of class '<em>Visible Implanted Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visible Implanted Medical Devices Section</em>'.
	 * @generated
	 */
	IVisibleImplantedMedicalDevicesSection createVisibleImplantedMedicalDevicesSection();

	/**
	 * Returns a new object of class '<em>Integumentary System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integumentary System Section</em>'.
	 * @generated
	 */
	IIntegumentarySystemSection createIntegumentarySystemSection();

	/**
	 * Returns a new object of class '<em>Head Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head Section</em>'.
	 * @generated
	 */
	IHeadSection createHeadSection();

	/**
	 * Returns a new object of class '<em>Eyes Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eyes Section</em>'.
	 * @generated
	 */
	IEyesSection createEyesSection();

	/**
	 * Returns a new object of class '<em>Ears Nose Mouth Throat Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ears Nose Mouth Throat Section</em>'.
	 * @generated
	 */
	IEarsNoseMouthThroatSection createEarsNoseMouthThroatSection();

	/**
	 * Returns a new object of class '<em>Ears Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ears Section</em>'.
	 * @generated
	 */
	IEarsSection createEarsSection();

	/**
	 * Returns a new object of class '<em>Nose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nose Section</em>'.
	 * @generated
	 */
	INoseSection createNoseSection();

	/**
	 * Returns a new object of class '<em>Mouth Throat Teeth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouth Throat Teeth Section</em>'.
	 * @generated
	 */
	IMouthThroatTeethSection createMouthThroatTeethSection();

	/**
	 * Returns a new object of class '<em>Neck Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neck Section</em>'.
	 * @generated
	 */
	INeckSection createNeckSection();

	/**
	 * Returns a new object of class '<em>Endocrine System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endocrine System Section</em>'.
	 * @generated
	 */
	IEndocrineSystemSection createEndocrineSystemSection();

	/**
	 * Returns a new object of class '<em>Thorax Lungs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thorax Lungs Section</em>'.
	 * @generated
	 */
	IThoraxLungsSection createThoraxLungsSection();

	/**
	 * Returns a new object of class '<em>Chest Wall Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chest Wall Section</em>'.
	 * @generated
	 */
	IChestWallSection createChestWallSection();

	/**
	 * Returns a new object of class '<em>Breast Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breast Section</em>'.
	 * @generated
	 */
	IBreastSection createBreastSection();

	/**
	 * Returns a new object of class '<em>Heart Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heart Section</em>'.
	 * @generated
	 */
	IHeartSection createHeartSection();

	/**
	 * Returns a new object of class '<em>Respiratory System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respiratory System Section</em>'.
	 * @generated
	 */
	IRespiratorySystemSection createRespiratorySystemSection();

	/**
	 * Returns a new object of class '<em>Abdomen Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abdomen Section</em>'.
	 * @generated
	 */
	IAbdomenSection createAbdomenSection();

	/**
	 * Returns a new object of class '<em>Lymphatic Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lymphatic Section</em>'.
	 * @generated
	 */
	ILymphaticSection createLymphaticSection();

	/**
	 * Returns a new object of class '<em>Vessels Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vessels Section</em>'.
	 * @generated
	 */
	IVesselsSection createVesselsSection();

	/**
	 * Returns a new object of class '<em>Musculoskeletal System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Musculoskeletal System Section</em>'.
	 * @generated
	 */
	IMusculoskeletalSystemSection createMusculoskeletalSystemSection();

	/**
	 * Returns a new object of class '<em>Neurologic System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neurologic System Section</em>'.
	 * @generated
	 */
	INeurologicSystemSection createNeurologicSystemSection();

	/**
	 * Returns a new object of class '<em>Genitalia Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genitalia Section</em>'.
	 * @generated
	 */
	IGenitaliaSection createGenitaliaSection();

	/**
	 * Returns a new object of class '<em>Rectum Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectum Section</em>'.
	 * @generated
	 */
	IRectumSection createRectumSection();

	/**
	 * Returns a new object of class '<em>Extremities Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extremities Section</em>'.
	 * @generated
	 */
	IExtremitiesSection createExtremitiesSection();

	/**
	 * Returns a new object of class '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Review Of Systems Section</em>'.
	 * @generated
	 */
	IReviewOfSystemsSection createReviewOfSystemsSection();

	/**
	 * Returns a new object of class '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Course Section</em>'.
	 * @generated
	 */
	IHospitalCourseSection createHospitalCourseSection();

	/**
	 * Returns a new object of class '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment And Plan Section</em>'.
	 * @generated
	 */
	IAssessmentAndPlanSection createAssessmentAndPlanSection();

	/**
	 * Returns a new object of class '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Section</em>'.
	 * @generated
	 */
	IFamilyHistorySection createFamilyHistorySection();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	ISocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History</em>'.
	 * @generated
	 */
	ISocialHistory createSocialHistory();

	/**
	 * Returns a new object of class '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Status Observation</em>'.
	 * @generated
	 */
	ISocialHistoryStatusObservation createSocialHistoryStatusObservation();

	/**
	 * Returns a new object of class '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Observation</em>'.
	 * @generated
	 */
	ISocialHistoryObservation createSocialHistoryObservation();

	/**
	 * Returns a new object of class '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section</em>'.
	 * @generated
	 */
	IResultsSection createResultsSection();

	/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	IResultOrganizer createResultOrganizer();

	/**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	IResultObservation createResultObservation();

	/**
	 * Returns a new object of class '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Equipment Section</em>'.
	 * @generated
	 */
	IMedicalEquipmentSection createMedicalEquipmentSection();

	/**
	 * Returns a new object of class '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Activity</em>'.
	 * @generated
	 */
	ISupplyActivity createSupplyActivity();

	/**
	 * Returns a new object of class '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fulfillment Instruction</em>'.
	 * @generated
	 */
	IFulfillmentInstruction createFulfillmentInstruction();

	/**
	 * Returns a new object of class '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Activity</em>'.
	 * @generated
	 */
	IMedicationActivity createMedicationActivity();

	/**
	 * Returns a new object of class '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Instruction</em>'.
	 * @generated
	 */
	IPatientInstruction createPatientInstruction();

	/**
	 * Returns a new object of class '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Spoken</em>'.
	 * @generated
	 */
	ILanguageSpoken createLanguageSpoken();

	/**
	 * Returns a new object of class '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Provider</em>'.
	 * @generated
	 */
	IInsuranceProvider createInsuranceProvider();

	/**
	 * Returns a new object of class '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entry</em>'.
	 * @generated
	 */
	IPayerEntry createPayerEntry();

	/**
	 * Returns a new object of class '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Provider</em>'.
	 * @generated
	 */
	IHealthcareProvider createHealthcareProvider();

	/**
	 * Returns a new object of class '<em>Medication Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Normal Dose</em>'.
	 * @generated
	 */
	IMedicationNormalDose createMedicationNormalDose();

	/**
	 * Returns a new object of class '<em>Medication Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Split Dose</em>'.
	 * @generated
	 */
	IMedicationSplitDose createMedicationSplitDose();

	/**
	 * Returns a new object of class '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Tapered Dose</em>'.
	 * @generated
	 */
	IMedicationTaperedDose createMedicationTaperedDose();

	/**
	 * Returns a new object of class '<em>Medication Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Conditional Dose</em>'.
	 * @generated
	 */
	IMedicationConditionalDose createMedicationConditionalDose();

	/**
	 * Returns a new object of class '<em>Medication Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Combination Medication</em>'.
	 * @generated
	 */
	IMedicationCombinationMedication createMedicationCombinationMedication();

	/**
	 * Returns a new object of class '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Guardian</em>'.
	 * @generated
	 */
	ISupportGuardian createSupportGuardian();

	/**
	 * Returns a new object of class '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Support Participant</em>'.
	 * @generated
	 */
	ISupportParticipant createSupportParticipant();

	/**
	 * Returns a new object of class '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Document</em>'.
	 * @generated
	 */
	IUnstructuredDocument createUnstructuredDocument();

	/**
	 * Returns a new object of class '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Original Author</em>'.
	 * @generated
	 */
	IScanOriginalAuthor createScanOriginalAuthor();

	/**
	 * Returns a new object of class '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanning Device</em>'.
	 * @generated
	 */
	IScanningDevice createScanningDevice();

	/**
	 * Returns a new object of class '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Data Enterer</em>'.
	 * @generated
	 */
	IScanDataEnterer createScanDataEnterer();

	/**
	 * Returns a new object of class '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information</em>'.
	 * @generated
	 */
	IMedicationInformation createMedicationInformation();

	/**
	 * Returns a new object of class '<em>Unstructured Or Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Or Scanned Document</em>'.
	 * @generated
	 */
	IUnstructuredOrScannedDocument createUnstructuredOrScannedDocument();

	/**
	 * Returns a new object of class '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Summary</em>'.
	 * @generated
	 */
	IReferralSummary createReferralSummary();

	/**
	 * Returns a new object of class '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary</em>'.
	 * @generated
	 */
	IDischargeSummary createDischargeSummary();

	/**
	 * Returns a new object of class '<em>Discharge Diet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diet</em>'.
	 * @generated
	 */
	IDischargeDiet createDischargeDiet();

	/**
	 * Returns a new object of class '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History</em>'.
	 * @generated
	 */
	IFamilyHistory createFamilyHistory();

	/**
	 * Returns a new object of class '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Organizer</em>'.
	 * @generated
	 */
	IFamilyHistoryOrganizer createFamilyHistoryOrganizer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IDomainPackage getDomainPackage();

} // IDomainFactory
