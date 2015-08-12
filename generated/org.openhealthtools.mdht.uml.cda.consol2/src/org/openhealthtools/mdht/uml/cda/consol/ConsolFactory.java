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
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public interface ConsolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsolFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.consol.impl.ConsolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns a new object of class '<em>Allergy Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Problem Act</em>'.
	 * @generated
	 */
	AllergyProblemAct createAllergyProblemAct();

	/**
	 * Returns a new object of class '<em>Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Observation</em>'.
	 * @generated
	 */
	AllergyObservation createAllergyObservation();

	/**
	 * Returns a new object of class '<em>Substance Or Device Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Or Device Allergy Observation</em>'.
	 * @generated
	 */
	SubstanceOrDeviceAllergyObservation createSubstanceOrDeviceAllergyObservation();

	/**
	 * Returns a new object of class '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Observation</em>'.
	 * @generated
	 */
	ReactionObservation createReactionObservation();

	/**
	 * Returns a new object of class '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity Observation</em>'.
	 * @generated
	 */
	SeverityObservation createSeverityObservation();

	/**
	 * Returns a new object of class '<em>Allergy Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Status Observation</em>'.
	 * @generated
	 */
	AllergyStatusObservation createAllergyStatusObservation();

	/**
	 * Returns a new object of class '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Observation</em>'.
	 * @generated
	 */
	AgeObservation createAgeObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	HealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Comment Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Activity</em>'.
	 * @generated
	 */
	CommentActivity createCommentActivity();

	/**
	 * Returns a new object of class '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Activity</em>'.
	 * @generated
	 */
	MedicationActivity createMedicationActivity();

	/**
	 * Returns a new object of class '<em>Non Medicinal Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Medicinal Supply Activity</em>'.
	 * @generated
	 */
	NonMedicinalSupplyActivity createNonMedicinalSupplyActivity();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructions</em>'.
	 * @generated
	 */
	Instructions createInstructions();

	/**
	 * Returns a new object of class '<em>Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indication</em>'.
	 * @generated
	 */
	Indication createIndication();

	/**
	 * Returns a new object of class '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense</em>'.
	 * @generated
	 */
	MedicationDispense createMedicationDispense();

	/**
	 * Returns a new object of class '<em>Medication Supply Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Supply Order</em>'.
	 * @generated
	 */
	MedicationSupplyOrder createMedicationSupplyOrder();

	/**
	 * Returns a new object of class '<em>Drug Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drug Vehicle</em>'.
	 * @generated
	 */
	DrugVehicle createDrugVehicle();

	/**
	 * Returns a new object of class '<em>Problem Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Concern Act</em>'.
	 * @generated
	 */
	ProblemConcernAct createProblemConcernAct();

	/**
	 * Returns a new object of class '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Observation</em>'.
	 * @generated
	 */
	ProblemObservation createProblemObservation();

	/**
	 * Returns a new object of class '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status</em>'.
	 * @generated
	 */
	ProblemStatus createProblemStatus();

	/**
	 * Returns a new object of class '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuity Of Care Document</em>'.
	 * @generated
	 */
	ContinuityOfCareDocument createContinuityOfCareDocument();

	/**
	 * Returns a new object of class '<em>Advance Directives Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section Entries Optional</em>'.
	 * @generated
	 */
	AdvanceDirectivesSectionEntriesOptional createAdvanceDirectivesSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Allergies Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Section</em>'.
	 * @generated
	 */
	AllergiesSection createAllergiesSection();

	/**
	 * Returns a new object of class '<em>Allergies Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Section Entries Optional</em>'.
	 * @generated
	 */
	AllergiesSectionEntriesOptional createAllergiesSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Encounters Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section Entries Optional</em>'.
	 * @generated
	 */
	EncountersSectionEntriesOptional createEncountersSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Immunizations Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section Entries Optional</em>'.
	 * @generated
	 */
	ImmunizationsSectionEntriesOptional createImmunizationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section</em>'.
	 * @generated
	 */
	PayersSection createPayersSection();

	/**
	 * Returns a new object of class '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Activity</em>'.
	 * @generated
	 */
	CoverageActivity createCoverageActivity();

	/**
	 * Returns a new object of class '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Activity</em>'.
	 * @generated
	 */
	PolicyActivity createPolicyActivity();

	/**
	 * Returns a new object of class '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Activity</em>'.
	 * @generated
	 */
	AuthorizationActivity createAuthorizationActivity();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	MedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section Entries Optional</em>'.
	 * @generated
	 */
	MedicationsSectionEntriesOptional createMedicationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Section</em>'.
	 * @generated
	 */
	PlanOfCareSection createPlanOfCareSection();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Act</em>'.
	 * @generated
	 */
	PlanOfCareActivityAct createPlanOfCareActivityAct();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Encounter</em>'.
	 * @generated
	 */
	PlanOfCareActivityEncounter createPlanOfCareActivityEncounter();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Observation</em>'.
	 * @generated
	 */
	PlanOfCareActivityObservation createPlanOfCareActivityObservation();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Procedure</em>'.
	 * @generated
	 */
	PlanOfCareActivityProcedure createPlanOfCareActivityProcedure();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @generated
	 */
	PlanOfCareActivitySubstanceAdministration createPlanOfCareActivitySubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Care Activity Supply</em>'.
	 * @generated
	 */
	PlanOfCareActivitySupply createPlanOfCareActivitySupply();

	/**
	 * Returns a new object of class '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Section</em>'.
	 * @generated
	 */
	ProceduresSection createProceduresSection();

	/**
	 * Returns a new object of class '<em>Procedures Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Section Entries Optional</em>'.
	 * @generated
	 */
	ProceduresSectionEntriesOptional createProceduresSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Observation</em>'.
	 * @generated
	 */
	ProcedureActivityObservation createProcedureActivityObservation();

	/**
	 * Returns a new object of class '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Act</em>'.
	 * @generated
	 */
	ProcedureActivityAct createProcedureActivityAct();

	/**
	 * Returns a new object of class '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Procedure</em>'.
	 * @generated
	 */
	ProcedureActivityProcedure createProcedureActivityProcedure();

	/**
	 * Returns a new object of class '<em>Vital Signs Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section Entries Optional</em>'.
	 * @generated
	 */
	VitalSignsSectionEntriesOptional createVitalSignsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Section</em>'.
	 * @generated
	 */
	FamilyHistorySection createFamilyHistorySection();

	/**
	 * Returns a new object of class '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Organizer</em>'.
	 * @generated
	 */
	FamilyHistoryOrganizer createFamilyHistoryOrganizer();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	FamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Family History Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Death Observation</em>'.
	 * @generated
	 */
	FamilyHistoryDeathObservation createFamilyHistoryDeathObservation();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	SocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Observation</em>'.
	 * @generated
	 */
	SocialHistoryObservation createSocialHistoryObservation();

	/**
	 * Returns a new object of class '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy Observation</em>'.
	 * @generated
	 */
	PregnancyObservation createPregnancyObservation();

	/**
	 * Returns a new object of class '<em>Estimated Date Of Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estimated Date Of Delivery</em>'.
	 * @generated
	 */
	EstimatedDateOfDelivery createEstimatedDateOfDelivery();

	/**
	 * Returns a new object of class '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Smoking Status Observation</em>'.
	 * @generated
	 */
	SmokingStatusObservation createSmokingStatusObservation();

	/**
	 * Returns a new object of class '<em>Tobacco Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tobacco Use</em>'.
	 * @generated
	 */
	TobaccoUse createTobaccoUse();

	/**
	 * Returns a new object of class '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section</em>'.
	 * @generated
	 */
	ResultsSection createResultsSection();

	/**
	 * Returns a new object of class '<em>Results Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section Entries Optional</em>'.
	 * @generated
	 */
	ResultsSectionEntriesOptional createResultsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	ResultOrganizer createResultOrganizer();

	/**
	 * Returns a new object of class '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation</em>'.
	 * @generated
	 */
	ResultObservation createResultObservation();

	/**
	 * Returns a new object of class '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Equipment Section</em>'.
	 * @generated
	 */
	MedicalEquipmentSection createMedicalEquipmentSection();

	/**
	 * Returns a new object of class '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Section</em>'.
	 * @generated
	 */
	FunctionalStatusSection createFunctionalStatusSection();

	/**
	 * Returns a new object of class '<em>Functional Status Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Result Organizer</em>'.
	 * @generated
	 */
	FunctionalStatusResultOrganizer createFunctionalStatusResultOrganizer();

	/**
	 * Returns a new object of class '<em>Functional Status Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Result Observation</em>'.
	 * @generated
	 */
	FunctionalStatusResultObservation createFunctionalStatusResultObservation();

	/**
	 * Returns a new object of class '<em>Caregiver Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caregiver Characteristics</em>'.
	 * @generated
	 */
	CaregiverCharacteristics createCaregiverCharacteristics();

	/**
	 * Returns a new object of class '<em>Assessment Scale Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Scale Observation</em>'.
	 * @generated
	 */
	AssessmentScaleObservation createAssessmentScaleObservation();

	/**
	 * Returns a new object of class '<em>Assessment Scale Supporting Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Scale Supporting Observation</em>'.
	 * @generated
	 */
	AssessmentScaleSupportingObservation createAssessmentScaleSupportingObservation();

	/**
	 * Returns a new object of class '<em>Cognitive Status Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognitive Status Result Organizer</em>'.
	 * @generated
	 */
	CognitiveStatusResultOrganizer createCognitiveStatusResultOrganizer();

	/**
	 * Returns a new object of class '<em>Cognitive Status Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognitive Status Result Observation</em>'.
	 * @generated
	 */
	CognitiveStatusResultObservation createCognitiveStatusResultObservation();

	/**
	 * Returns a new object of class '<em>Functional Status Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Problem Observation</em>'.
	 * @generated
	 */
	FunctionalStatusProblemObservation createFunctionalStatusProblemObservation();

	/**
	 * Returns a new object of class '<em>Cognitive Status Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognitive Status Problem Observation</em>'.
	 * @generated
	 */
	CognitiveStatusProblemObservation createCognitiveStatusProblemObservation();

	/**
	 * Returns a new object of class '<em>Pressure Ulcer Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pressure Ulcer Observation</em>'.
	 * @generated
	 */
	PressureUlcerObservation createPressureUlcerObservation();

	/**
	 * Returns a new object of class '<em>Number Of Pressure Ulcers Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Of Pressure Ulcers Observation</em>'.
	 * @generated
	 */
	NumberOfPressureUlcersObservation createNumberOfPressureUlcersObservation();

	/**
	 * Returns a new object of class '<em>Highest Pressure Ulcer Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Highest Pressure Ulcer Stage</em>'.
	 * @generated
	 */
	HighestPressureUlcerStage createHighestPressureUlcerStage();

	/**
	 * Returns a new object of class '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section</em>'.
	 * @generated
	 */
	ProblemSection createProblemSection();

	/**
	 * Returns a new object of class '<em>Problem Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section Entries Optional</em>'.
	 * @generated
	 */
	ProblemSectionEntriesOptional createProblemSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section</em>'.
	 * @generated
	 */
	AdvanceDirectivesSection createAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation createAdvanceDirectiveObservation();

	/**
	 * Returns a new object of class '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section</em>'.
	 * @generated
	 */
	EncountersSection createEncountersSection();

	/**
	 * Returns a new object of class '<em>Encounter Activities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Activities</em>'.
	 * @generated
	 */
	EncounterActivities createEncounterActivities();

	/**
	 * Returns a new object of class '<em>Encounter Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Diagnosis</em>'.
	 * @generated
	 */
	EncounterDiagnosis createEncounterDiagnosis();

	/**
	 * Returns a new object of class '<em>Service Delivery Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Delivery Location</em>'.
	 * @generated
	 */
	ServiceDeliveryLocation createServiceDeliveryLocation();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	ImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Activity</em>'.
	 * @generated
	 */
	ImmunizationActivity createImmunizationActivity();

	/**
	 * Returns a new object of class '<em>Immunization Refusal Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Refusal Reason</em>'.
	 * @generated
	 */
	ImmunizationRefusalReason createImmunizationRefusalReason();

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
	 * Returns a new object of class '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign Observation</em>'.
	 * @generated
	 */
	VitalSignObservation createVitalSignObservation();

	/**
	 * Returns a new object of class '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Past Illness Section</em>'.
	 * @generated
	 */
	HistoryOfPastIllnessSection createHistoryOfPastIllnessSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint Section</em>'.
	 * @generated
	 */
	ChiefComplaintSection createChiefComplaintSection();

	/**
	 * Returns a new object of class '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Referral Section</em>'.
	 * @generated
	 */
	ReasonForReferralSection createReasonForReferralSection();

	/**
	 * Returns a new object of class '<em>History Of Present Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Present Illness Section</em>'.
	 * @generated
	 */
	HistoryOfPresentIllnessSection createHistoryOfPresentIllnessSection();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Diagnosis Section</em>'.
	 * @generated
	 */
	HospitalDischargeDiagnosisSection createHospitalDischargeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * @generated
	 */
	HospitalAdmissionMedicationsSectionEntriesOptional createHospitalAdmissionMedicationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Admission Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Medication</em>'.
	 * @generated
	 */
	AdmissionMedication createAdmissionMedication();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * @generated
	 */
	HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Physical Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Physical Section</em>'.
	 * @generated
	 */
	HospitalDischargePhysicalSection createHospitalDischargePhysicalSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * @generated
	 */
	ChiefComplaintAndReasonForVisitSection createChiefComplaintAndReasonForVisitSection();

	/**
	 * Returns a new object of class '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Visit Section</em>'.
	 * @generated
	 */
	ReasonForVisitSection createReasonForVisitSection();

	/**
	 * Returns a new object of class '<em>Anesthesia Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anesthesia Section</em>'.
	 * @generated
	 */
	AnesthesiaSection createAnesthesiaSection();

	/**
	 * Returns a new object of class '<em>Complications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complications Section</em>'.
	 * @generated
	 */
	ComplicationsSection createComplicationsSection();

	/**
	 * Returns a new object of class '<em>DICOM Object Catalog Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DICOM Object Catalog Section</em>'.
	 * @generated
	 */
	DICOMObjectCatalogSection createDICOMObjectCatalogSection();

	/**
	 * Returns a new object of class '<em>Study Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Act</em>'.
	 * @generated
	 */
	StudyAct createStudyAct();

	/**
	 * Returns a new object of class '<em>Series Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Series Act</em>'.
	 * @generated
	 */
	SeriesAct createSeriesAct();

	/**
	 * Returns a new object of class '<em>SOP Instance Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SOP Instance Observation</em>'.
	 * @generated
	 */
	SOPInstanceObservation createSOPInstanceObservation();

	/**
	 * Returns a new object of class '<em>Purposeof Reference Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purposeof Reference Observation</em>'.
	 * @generated
	 */
	PurposeofReferenceObservation createPurposeofReferenceObservation();

	/**
	 * Returns a new object of class '<em>Referenced Frames Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Frames Observation</em>'.
	 * @generated
	 */
	ReferencedFramesObservation createReferencedFramesObservation();

	/**
	 * Returns a new object of class '<em>Boundary Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boundary Observation</em>'.
	 * @generated
	 */
	BoundaryObservation createBoundaryObservation();

	/**
	 * Returns a new object of class '<em>Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Findings Section</em>'.
	 * @generated
	 */
	FindingsSection createFindingsSection();

	/**
	 * Returns a new object of class '<em>Hospital Consultations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Consultations Section</em>'.
	 * @generated
	 */
	HospitalConsultationsSection createHospitalConsultationsSection();

	/**
	 * Returns a new object of class '<em>Interventions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interventions Section</em>'.
	 * @generated
	 */
	InterventionsSection createInterventionsSection();

	/**
	 * Returns a new object of class '<em>Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical History Section</em>'.
	 * @generated
	 */
	MedicalHistorySection createMedicalHistorySection();

	/**
	 * Returns a new object of class '<em>Objective Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Section</em>'.
	 * @generated
	 */
	ObjectiveSection createObjectiveSection();

	/**
	 * Returns a new object of class '<em>Operative Note Fluid Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operative Note Fluid Section</em>'.
	 * @generated
	 */
	OperativeNoteFluidSection createOperativeNoteFluidSection();

	/**
	 * Returns a new object of class '<em>Operative Note Surgical Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operative Note Surgical Procedure Section</em>'.
	 * @generated
	 */
	OperativeNoteSurgicalProcedureSection createOperativeNoteSurgicalProcedureSection();

	/**
	 * Returns a new object of class '<em>Planned Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Procedure Section</em>'.
	 * @generated
	 */
	PlannedProcedureSection createPlannedProcedureSection();

	/**
	 * Returns a new object of class '<em>Postoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postoperative Diagnosis Section</em>'.
	 * @generated
	 */
	PostoperativeDiagnosisSection createPostoperativeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Postprocedure Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postprocedure Diagnosis Section</em>'.
	 * @generated
	 */
	PostprocedureDiagnosisSection createPostprocedureDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Postprocedure Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postprocedure Diagnosis</em>'.
	 * @generated
	 */
	PostprocedureDiagnosis createPostprocedureDiagnosis();

	/**
	 * Returns a new object of class '<em>Preoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preoperative Diagnosis Section</em>'.
	 * @generated
	 */
	PreoperativeDiagnosisSection createPreoperativeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Procedure Description Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Description Section</em>'.
	 * @generated
	 */
	ProcedureDescriptionSection createProcedureDescriptionSection();

	/**
	 * Returns a new object of class '<em>Procedure Disposition Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Disposition Section</em>'.
	 * @generated
	 */
	ProcedureDispositionSection createProcedureDispositionSection();

	/**
	 * Returns a new object of class '<em>Procedure Estimated Blood Loss Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Estimated Blood Loss Section</em>'.
	 * @generated
	 */
	ProcedureEstimatedBloodLossSection createProcedureEstimatedBloodLossSection();

	/**
	 * Returns a new object of class '<em>Procedure Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Findings Section</em>'.
	 * @generated
	 */
	ProcedureFindingsSection createProcedureFindingsSection();

	/**
	 * Returns a new object of class '<em>Procedure Implants Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Implants Section</em>'.
	 * @generated
	 */
	ProcedureImplantsSection createProcedureImplantsSection();

	/**
	 * Returns a new object of class '<em>Procedure Indications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Indications Section</em>'.
	 * @generated
	 */
	ProcedureIndicationsSection createProcedureIndicationsSection();

	/**
	 * Returns a new object of class '<em>Procedure Specimens Taken Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Specimens Taken Section</em>'.
	 * @generated
	 */
	ProcedureSpecimensTakenSection createProcedureSpecimensTakenSection();

	/**
	 * Returns a new object of class '<em>Subjective Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subjective Section</em>'.
	 * @generated
	 */
	SubjectiveSection createSubjectiveSection();

	/**
	 * Returns a new object of class '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consultation Note</em>'.
	 * @generated
	 */
	ConsultationNote createConsultationNote();

	/**
	 * Returns a new object of class '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Section</em>'.
	 * @generated
	 */
	AssessmentSection createAssessmentSection();

	/**
	 * Returns a new object of class '<em>History And Physical Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History And Physical Note</em>'.
	 * @generated
	 */
	HistoryAndPhysicalNote createHistoryAndPhysicalNote();

	/**
	 * Returns a new object of class '<em>Operative Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operative Note</em>'.
	 * @generated
	 */
	OperativeNote createOperativeNote();

	/**
	 * Returns a new object of class '<em>Procedure Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Note</em>'.
	 * @generated
	 */
	ProcedureNote createProcedureNote();

	/**
	 * Returns a new object of class '<em>Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress Note</em>'.
	 * @generated
	 */
	ProgressNote createProgressNote();

	/**
	 * Returns a new object of class '<em>Preoperative Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preoperative Diagnosis</em>'.
	 * @generated
	 */
	PreoperativeDiagnosis createPreoperativeDiagnosis();

	/**
	 * Returns a new object of class '<em>Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructions Section</em>'.
	 * @generated
	 */
	InstructionsSection createInstructionsSection();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis</em>'.
	 * @generated
	 */
	HospitalAdmissionDiagnosis createHospitalAdmissionDiagnosis();

	/**
	 * Returns a new object of class '<em>Diagnostic Imaging Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Imaging Report</em>'.
	 * @generated
	 */
	DiagnosticImagingReport createDiagnosticImagingReport();

	/**
	 * Returns a new object of class '<em>Physician Reading Study Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physician Reading Study Performer</em>'.
	 * @generated
	 */
	PhysicianReadingStudyPerformer createPhysicianReadingStudyPerformer();

	/**
	 * Returns a new object of class '<em>Physicianof Record Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physicianof Record Participant</em>'.
	 * @generated
	 */
	PhysicianofRecordParticipant createPhysicianofRecordParticipant();

	/**
	 * Returns a new object of class '<em>Text Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Observation</em>'.
	 * @generated
	 */
	TextObservation createTextObservation();

	/**
	 * Returns a new object of class '<em>Quantity Measurement Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Measurement Observation</em>'.
	 * @generated
	 */
	QuantityMeasurementObservation createQuantityMeasurementObservation();

	/**
	 * Returns a new object of class '<em>Code Observations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Observations</em>'.
	 * @generated
	 */
	CodeObservations createCodeObservations();

	/**
	 * Returns a new object of class '<em>Procedure Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Context</em>'.
	 * @generated
	 */
	ProcedureContext createProcedureContext();

	/**
	 * Returns a new object of class '<em>Medication Use None Known</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Use None Known</em>'.
	 * @generated
	 */
	MedicationUseNoneKnown createMedicationUseNoneKnown();

	/**
	 * Returns a new object of class '<em>Deceased Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deceased Observation</em>'.
	 * @generated
	 */
	DeceasedObservation createDeceasedObservation();

	/**
	 * Returns a new object of class '<em>Fetus Subject Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fetus Subject Context</em>'.
	 * @generated
	 */
	FetusSubjectContext createFetusSubjectContext();

	/**
	 * Returns a new object of class '<em>Observer Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observer Context</em>'.
	 * @generated
	 */
	ObserverContext createObserverContext();

	/**
	 * Returns a new object of class '<em>Entry Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Reference</em>'.
	 * @generated
	 */
	EntryReference createEntryReference();

	/**
	 * Returns a new object of class '<em>Advance Directive Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Organizer</em>'.
	 * @generated
	 */
	AdvanceDirectiveOrganizer createAdvanceDirectiveOrganizer();

	/**
	 * Returns a new object of class '<em>Characteristics Of Home Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristics Of Home Environment</em>'.
	 * @generated
	 */
	CharacteristicsOfHomeEnvironment createCharacteristicsOfHomeEnvironment();

	/**
	 * Returns a new object of class '<em>Cognitive Abilities Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognitive Abilities Observation</em>'.
	 * @generated
	 */
	CognitiveAbilitiesObservation createCognitiveAbilitiesObservation();

	/**
	 * Returns a new object of class '<em>Cultural And Religious Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cultural And Religious Observation</em>'.
	 * @generated
	 */
	CulturalAndReligiousObservation createCulturalAndReligiousObservation();

	/**
	 * Returns a new object of class '<em>Drug Monitoring Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drug Monitoring Act</em>'.
	 * @generated
	 */
	DrugMonitoringAct createDrugMonitoringAct();

	/**
	 * Returns a new object of class '<em>Handoff Communication Participants</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handoff Communication Participants</em>'.
	 * @generated
	 */
	HandoffCommunicationParticipants createHandoffCommunicationParticipants();

	/**
	 * Returns a new object of class '<em>Medical Equipment Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Equipment Organizer</em>'.
	 * @generated
	 */
	MedicalEquipmentOrganizer createMedicalEquipmentOrganizer();

	/**
	 * Returns a new object of class '<em>Mental Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mental Status Observation</em>'.
	 * @generated
	 */
	MentalStatusObservation createMentalStatusObservation();

	/**
	 * Returns a new object of class '<em>Nutrition Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Assessment</em>'.
	 * @generated
	 */
	NutritionAssessment createNutritionAssessment();

	/**
	 * Returns a new object of class '<em>Nutrition Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Recommendation</em>'.
	 * @generated
	 */
	NutritionRecommendation createNutritionRecommendation();

	/**
	 * Returns a new object of class '<em>Nutritional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutritional Status Observation</em>'.
	 * @generated
	 */
	NutritionalStatusObservation createNutritionalStatusObservation();

	/**
	 * Returns a new object of class '<em>Outcome Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outcome Observation</em>'.
	 * @generated
	 */
	OutcomeObservation createOutcomeObservation();

	/**
	 * Returns a new object of class '<em>Patient Referral Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Referral Act</em>'.
	 * @generated
	 */
	PatientReferralAct createPatientReferralAct();

	/**
	 * Returns a new object of class '<em>Planned Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Coverage</em>'.
	 * @generated
	 */
	PlannedCoverage createPlannedCoverage();

	/**
	 * Returns a new object of class '<em>Goal Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Observation</em>'.
	 * @generated
	 */
	GoalObservation createGoalObservation();

	/**
	 * Returns a new object of class '<em>Health Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Concern Act</em>'.
	 * @generated
	 */
	HealthConcernAct createHealthConcernAct();

	/**
	 * Returns a new object of class '<em>Intervention Act</em>'.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervention Act</em>'.
	 * @generated
	 */
	InterventionAct createInterventionAct();

	/**
	 * Returns a new object of class '<em>External Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Document Reference</em>'.
	 * @generated
	 */
	ExternalDocumentReference createExternalDocumentReference();

	/**
	 * Returns a new object of class '<em>Planned Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Immunization Activity</em>'.
	 * @generated
	 */
	PlannedImmunizationActivity createPlannedImmunizationActivity();

	/**
	 * Returns a new object of class '<em>Prognosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Observation</em>'.
	 * @generated
	 */
	PrognosisObservation createPrognosisObservation();

	/**
	 * Returns a new object of class '<em>Progress Toward Goal Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress Toward Goal Observation</em>'.
	 * @generated
	 */
	ProgressTowardGoalObservation createProgressTowardGoalObservation();

	/**
	 * Returns a new object of class '<em>Self Care Activities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Care Activities</em>'.
	 * @generated
	 */
	SelfCareActivities createSelfCareActivities();

	/**
	 * Returns a new object of class '<em>Sensory Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensory Status</em>'.
	 * @generated
	 */
	SensoryStatus createSensoryStatus();

	/**
	 * Returns a new object of class '<em>Longitudinal Care Wound Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Longitudinal Care Wound Observation</em>'.
	 * @generated
	 */
	LongitudinalCareWoundObservation createLongitudinalCareWoundObservation();

	/**
	 * Returns a new object of class '<em>Substance Administered Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Administered Act</em>'.
	 * @generated
	 */
	SubstanceAdministeredAct createSubstanceAdministeredAct();

	/**
	 * Returns a new object of class '<em>Number Of Pressure Ulcers Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Of Pressure Ulcers Observation2</em>'.
	 * @generated
	 */
	NumberOfPressureUlcersObservation2 createNumberOfPressureUlcersObservation2();

	/**
	 * Returns a new object of class '<em>Wound Measurement Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wound Measurement Observation</em>'.
	 * @generated
	 */
	WoundMeasurementObservation createWoundMeasurementObservation();

	/**
	 * Returns a new object of class '<em>Wound Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wound Characteristic</em>'.
	 * @generated
	 */
	WoundCharacteristic createWoundCharacteristic();

	/**
	 * Returns a new object of class '<em>Goals Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goals Section</em>'.
	 * @generated
	 */
	GoalsSection createGoalsSection();

	/**
	 * Returns a new object of class '<em>Health Concerns Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Concerns Section</em>'.
	 * @generated
	 */
	HealthConcernsSection createHealthConcernsSection();

	/**
	 * Returns a new object of class '<em>Mental Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mental Status Section</em>'.
	 * @generated
	 */
	MentalStatusSection createMentalStatusSection();

	/**
	 * Returns a new object of class '<em>Mental Status Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mental Status Organizer2</em>'.
	 * @generated
	 */
	MentalStatusOrganizer2 createMentalStatusOrganizer2();

	/**
	 * Returns a new object of class '<em>Nutrition Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nutrition Section</em>'.
	 * @generated
	 */
	NutritionSection createNutritionSection();

	/**
	 * Returns a new object of class '<em>Physical Findings Of Skin Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Findings Of Skin Section</em>'.
	 * @generated
	 */
	PhysicalFindingsOfSkinSection createPhysicalFindingsOfSkinSection();

	/**
	 * Returns a new object of class '<em>US Realm Header2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>US Realm Header2</em>'.
	 * @generated
	 */
	USRealmHeader2 createUSRealmHeader2();

	/**
	 * Returns a new object of class '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan</em>'.
	 * @generated
	 */
	CarePlan createCarePlan();

	/**
	 * Returns a new object of class '<em>Referral Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referral Note</em>'.
	 * @generated
	 */
	ReferralNote createReferralNote();

	/**
	 * Returns a new object of class '<em>Transfer Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer Summary</em>'.
	 * @generated
	 */
	TransferSummary createTransferSummary();

	/**
	 * Returns a new object of class '<em>US Realm Header Patient Generated Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>US Realm Header Patient Generated Document</em>'.
	 * @generated
	 */
	USRealmHeaderPatientGeneratedDocument createUSRealmHeaderPatientGeneratedDocument();

	/**
	 * Returns a new object of class '<em>Author Participation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author Participation</em>'.
	 * @generated
	 */
	AuthorParticipation createAuthorParticipation();

	/**
	 * Returns a new object of class '<em>Admission Medication2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Medication2</em>'.
	 * @generated
	 */
	AdmissionMedication2 createAdmissionMedication2();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation2</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation2 createAdvanceDirectiveObservation2();

	/**
	 * Returns a new object of class '<em>Allergy Concern Act2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Concern Act2</em>'.
	 * @generated
	 */
	AllergyConcernAct2 createAllergyConcernAct2();

	/**
	 * Returns a new object of class '<em>Allergy Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Observation2</em>'.
	 * @generated
	 */
	AllergyObservation2 createAllergyObservation2();

	/**
	 * Returns a new object of class '<em>Mental Status Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mental Status Observation2</em>'.
	 * @generated
	 */
	MentalStatusObservation2 createMentalStatusObservation2();

	/**
	 * Returns a new object of class '<em>Smoking Status Meaningful Use2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smoking Status Meaningful Use2</em>'.
	 * @generated
	 */
	SmokingStatusMeaningfulUse2 createSmokingStatusMeaningfulUse2();

	/**
	 * Returns a new object of class '<em>Coverage Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Activity2</em>'.
	 * @generated
	 */
	CoverageActivity2 createCoverageActivity2();

	/**
	 * Returns a new object of class '<em>Deceased Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deceased Observation2</em>'.
	 * @generated
	 */
	DeceasedObservation2 createDeceasedObservation2();

	/**
	 * Returns a new object of class '<em>Discharge Medication2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Medication2</em>'.
	 * @generated
	 */
	DischargeMedication2 createDischargeMedication2();

	/**
	 * Returns a new object of class '<em>Encounter Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Activity2</em>'.
	 * @generated
	 */
	EncounterActivity2 createEncounterActivity2();

	/**
	 * Returns a new object of class '<em>Encounter Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Diagnosis2</em>'.
	 * @generated
	 */
	EncounterDiagnosis2 createEncounterDiagnosis2();

	/**
	 * Returns a new object of class '<em>Functional Status Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Observation2</em>'.
	 * @generated
	 */
	FunctionalStatusObservation2 createFunctionalStatusObservation2();

	/**
	 * Returns a new object of class '<em>Functional Status Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Organizer2</em>'.
	 * @generated
	 */
	FunctionalStatusOrganizer2 createFunctionalStatusOrganizer2();

	/**
	 * Returns a new object of class '<em>Health Status Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation2</em>'.
	 * @generated
	 */
	HealthStatusObservation2 createHealthStatusObservation2();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis2</em>'.
	 * @generated
	 */
	HospitalAdmissionDiagnosis2 createHospitalAdmissionDiagnosis2();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Diagnosis2</em>'.
	 * @generated
	 */
	HospitalDischargeDiagnosis2 createHospitalDischargeDiagnosis2();

	/**
	 * Returns a new object of class '<em>Immunization Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Activity2</em>'.
	 * @generated
	 */
	ImmunizationActivity2 createImmunizationActivity2();

	/**
	 * Returns a new object of class '<em>Immunization Medication Information2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Medication Information2</em>'.
	 * @generated
	 */
	ImmunizationMedicationInformation2 createImmunizationMedicationInformation2();

	/**
	 * Returns a new object of class '<em>Indication2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indication2</em>'.
	 * @generated
	 */
	Indication2 createIndication2();

	/**
	 * Returns a new object of class '<em>Instruction2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction2</em>'.
	 * @generated
	 */
	Instruction2 createInstruction2();

	/**
	 * Returns a new object of class '<em>Medication Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Activity2</em>'.
	 * @generated
	 */
	MedicationActivity2 createMedicationActivity2();

	/**
	 * Returns a new object of class '<em>Medication Dispense2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Dispense2</em>'.
	 * @generated
	 */
	MedicationDispense2 createMedicationDispense2();

	/**
	 * Returns a new object of class '<em>Medication Information2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information2</em>'.
	 * @generated
	 */
	MedicationInformation2 createMedicationInformation2();

	/**
	 * Returns a new object of class '<em>Medication Supply Order2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Supply Order2</em>'.
	 * @generated
	 */
	MedicationSupplyOrder2 createMedicationSupplyOrder2();

	/**
	 * Returns a new object of class '<em>Non Medicinal Supply Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Medicinal Supply Activity2</em>'.
	 * @generated
	 */
	NonMedicinalSupplyActivity2 createNonMedicinalSupplyActivity2();

	/**
	 * Returns a new object of class '<em>Physicianof Record Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physicianof Record Participant2</em>'.
	 * @generated
	 */
	PhysicianofRecordParticipant2 createPhysicianofRecordParticipant2();

	/**
	 * Returns a new object of class '<em>Planned Act2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Act2</em>'.
	 * @generated
	 */
	PlannedAct2 createPlannedAct2();

	/**
	 * Returns a new object of class '<em>Planned Encounter2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Encounter2</em>'.
	 * @generated
	 */
	PlannedEncounter2 createPlannedEncounter2();

	/**
	 * Returns a new object of class '<em>Priority Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority Preference</em>'.
	 * @generated
	 */
	PriorityPreference createPriorityPreference();

	/**
	 * Returns a new object of class '<em>Planned Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Observation2</em>'.
	 * @generated
	 */
	PlannedObservation2 createPlannedObservation2();

	/**
	 * Returns a new object of class '<em>Planned Procedure2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Procedure2</em>'.
	 * @generated
	 */
	PlannedProcedure2 createPlannedProcedure2();

	/**
	 * Returns a new object of class '<em>Planned Medication Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Medication Activity2</em>'.
	 * @generated
	 */
	PlannedMedicationActivity2 createPlannedMedicationActivity2();

	/**
	 * Returns a new object of class '<em>Planned Supply2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Supply2</em>'.
	 * @generated
	 */
	PlannedSupply2 createPlannedSupply2();

	/**
	 * Returns a new object of class '<em>Policy Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Activity2</em>'.
	 * @generated
	 */
	PolicyActivity2 createPolicyActivity2();

	/**
	 * Returns a new object of class '<em>Postprocedure Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postprocedure Diagnosis2</em>'.
	 * @generated
	 */
	PostprocedureDiagnosis2 createPostprocedureDiagnosis2();

	/**
	 * Returns a new object of class '<em>Preoperative Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preoperative Diagnosis2</em>'.
	 * @generated
	 */
	PreoperativeDiagnosis2 createPreoperativeDiagnosis2();

	/**
	 * Returns a new object of class '<em>Problem Concern Act2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Concern Act2</em>'.
	 * @generated
	 */
	ProblemConcernAct2 createProblemConcernAct2();

	/**
	 * Returns a new object of class '<em>Problem Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Observation2</em>'.
	 * @generated
	 */
	ProblemObservation2 createProblemObservation2();

	/**
	 * Returns a new object of class '<em>Procedure Activity Act2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Act2</em>'.
	 * @generated
	 */
	ProcedureActivityAct2 createProcedureActivityAct2();

	/**
	 * Returns a new object of class '<em>Procedure Activity Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Observation2</em>'.
	 * @generated
	 */
	ProcedureActivityObservation2 createProcedureActivityObservation2();

	/**
	 * Returns a new object of class '<em>Procedure Activity Procedure2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Procedure2</em>'.
	 * @generated
	 */
	ProcedureActivityProcedure2 createProcedureActivityProcedure2();

	/**
	 * Returns a new object of class '<em>Reaction Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Observation2</em>'.
	 * @generated
	 */
	ReactionObservation2 createReactionObservation2();

	/**
	 * Returns a new object of class '<em>Result Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Observation2</em>'.
	 * @generated
	 */
	ResultObservation2 createResultObservation2();

	/**
	 * Returns a new object of class '<em>Result Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer2</em>'.
	 * @generated
	 */
	ResultOrganizer2 createResultOrganizer2();

	/**
	 * Returns a new object of class '<em>Severity Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity Observation2</em>'.
	 * @generated
	 */
	SeverityObservation2 createSeverityObservation2();

	/**
	 * Returns a new object of class '<em>Medication Free Text Sig</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Free Text Sig</em>'.
	 * @generated
	 */
	MedicationFreeTextSig createMedicationFreeTextSig();

	/**
	 * Returns a new object of class '<em>Social History Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Observation2</em>'.
	 * @generated
	 */
	SocialHistoryObservation2 createSocialHistoryObservation2();

	/**
	 * Returns a new object of class '<em>Substance Or Device Allergy Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Or Device Allergy Observation2</em>'.
	 * @generated
	 */
	SubstanceOrDeviceAllergyObservation2 createSubstanceOrDeviceAllergyObservation2();

	/**
	 * Returns a new object of class '<em>Tobacco Use2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tobacco Use2</em>'.
	 * @generated
	 */
	TobaccoUse2 createTobaccoUse2();

	/**
	 * Returns a new object of class '<em>Vital Sign Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign Observation2</em>'.
	 * @generated
	 */
	VitalSignObservation2 createVitalSignObservation2();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer2</em>'.
	 * @generated
	 */
	VitalSignsOrganizer2 createVitalSignsOrganizer2();

	/**
	 * Returns a new object of class '<em>Anesthesia Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anesthesia Section2</em>'.
	 * @generated
	 */
	AnesthesiaSection2 createAnesthesiaSection2();

	/**
	 * Returns a new object of class '<em>Assessment And Plan Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment And Plan Section2</em>'.
	 * @generated
	 */
	AssessmentAndPlanSection2 createAssessmentAndPlanSection2();

	/**
	 * Returns a new object of class '<em>Complications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complications Section2</em>'.
	 * @generated
	 */
	ComplicationsSection2 createComplicationsSection2();

	/**
	 * Returns a new object of class '<em>Admission Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Diagnosis Section2</em>'.
	 * @generated
	 */
	AdmissionDiagnosisSection2 createAdmissionDiagnosisSection2();

	/**
	 * Returns a new object of class '<em>Admission Medications Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Medications Section Entries Optional2</em>'.
	 * @generated
	 */
	AdmissionMedicationsSectionEntriesOptional2 createAdmissionMedicationsSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Discharge Medications Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Medications Section Entries Optional2</em>'.
	 * @generated
	 */
	DischargeMedicationsSectionEntriesOptional2 createDischargeMedicationsSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Encounters Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section Entries Optional2</em>'.
	 * @generated
	 */
	EncountersSectionEntriesOptional2 createEncountersSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Discharge Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diagnosis Section2</em>'.
	 * @generated
	 */
	DischargeDiagnosisSection2 createDischargeDiagnosisSection2();

	/**
	 * Returns a new object of class '<em>Functional Status Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Section2</em>'.
	 * @generated
	 */
	FunctionalStatusSection2 createFunctionalStatusSection2();

	/**
	 * Returns a new object of class '<em>History Of Past Illness Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Past Illness Section2</em>'.
	 * @generated
	 */
	HistoryOfPastIllnessSection2 createHistoryOfPastIllnessSection2();

	/**
	 * Returns a new object of class '<em>Immunizations Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section Entries Optional2</em>'.
	 * @generated
	 */
	ImmunizationsSectionEntriesOptional2 createImmunizationsSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Instructions Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructions Section2</em>'.
	 * @generated
	 */
	InstructionsSection2 createInstructionsSection2();

	/**
	 * Returns a new object of class '<em>Interventions Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interventions Section2</em>'.
	 * @generated
	 */
	InterventionsSection2 createInterventionsSection2();

	/**
	 * Returns a new object of class '<em>Medical Equipment Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Equipment Section2</em>'.
	 * @generated
	 */
	MedicalEquipmentSection2 createMedicalEquipmentSection2();

	/**
	 * Returns a new object of class '<em>Medications Administered Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section2</em>'.
	 * @generated
	 */
	MedicationsAdministeredSection2 createMedicationsAdministeredSection2();

	/**
	 * Returns a new object of class '<em>Payers Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section2</em>'.
	 * @generated
	 */
	PayersSection2 createPayersSection2();

	/**
	 * Returns a new object of class '<em>Physical Exam Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Section2</em>'.
	 * @generated
	 */
	PhysicalExamSection2 createPhysicalExamSection2();

	/**
	 * Returns a new object of class '<em>Plan Of Treatment Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Of Treatment Section2</em>'.
	 * @generated
	 */
	PlanOfTreatmentSection2 createPlanOfTreatmentSection2();

	/**
	 * Returns a new object of class '<em>Planned Procedure Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Procedure Section2</em>'.
	 * @generated
	 */
	PlannedProcedureSection2 createPlannedProcedureSection2();

	/**
	 * Returns a new object of class '<em>Postprocedure Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postprocedure Diagnosis Section2</em>'.
	 * @generated
	 */
	PostprocedureDiagnosisSection2 createPostprocedureDiagnosisSection2();

	/**
	 * Returns a new object of class '<em>Preoperative Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preoperative Diagnosis Section2</em>'.
	 * @generated
	 */
	PreoperativeDiagnosisSection2 createPreoperativeDiagnosisSection2();

	/**
	 * Returns a new object of class '<em>Procedure Findings Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Findings Section2</em>'.
	 * @generated
	 */
	ProcedureFindingsSection2 createProcedureFindingsSection2();

	/**
	 * Returns a new object of class '<em>Procedure Indications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Indications Section2</em>'.
	 * @generated
	 */
	ProcedureIndicationsSection2 createProcedureIndicationsSection2();

	/**
	 * Returns a new object of class '<em>Discharge Medications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Medications Section2</em>'.
	 * @generated
	 */
	DischargeMedicationsSection2 createDischargeMedicationsSection2();

	/**
	 * Returns a new object of class '<em>Procedures Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Section Entries Optional2</em>'.
	 * @generated
	 */
	ProceduresSectionEntriesOptional2 createProceduresSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Reason For Referral Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Referral Section2</em>'.
	 * @generated
	 */
	ReasonForReferralSection2 createReasonForReferralSection2();

	/**
	 * Returns a new object of class '<em>Results Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section Entries Optional2</em>'.
	 * @generated
	 */
	ResultsSectionEntriesOptional2 createResultsSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Social History Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section2</em>'.
	 * @generated
	 */
	SocialHistorySection2 createSocialHistorySection2();

	/**
	 * Returns a new object of class '<em>Vital Signs Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section Entries Optional2</em>'.
	 * @generated
	 */
	VitalSignsSectionEntriesOptional2 createVitalSignsSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Advance Directives Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section Entries Optional2</em>'.
	 * @generated
	 */
	AdvanceDirectivesSectionEntriesOptional2 createAdvanceDirectivesSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Medications Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section Entries Optional2</em>'.
	 * @generated
	 */
	MedicationsSectionEntriesOptional2 createMedicationsSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Problem Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section Entries Optional2</em>'.
	 * @generated
	 */
	ProblemSectionEntriesOptional2 createProblemSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Advance Directives Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section2</em>'.
	 * @generated
	 */
	AdvanceDirectivesSection2 createAdvanceDirectivesSection2();

	/**
	 * Returns a new object of class '<em>Allergies Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Section Entries Optional2</em>'.
	 * @generated
	 */
	AllergiesSectionEntriesOptional2 createAllergiesSectionEntriesOptional2();

	/**
	 * Returns a new object of class '<em>Allergies Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Section2</em>'.
	 * @generated
	 */
	AllergiesSection2 createAllergiesSection2();

	/**
	 * Returns a new object of class '<em>Encounters Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounters Section2</em>'.
	 * @generated
	 */
	EncountersSection2 createEncountersSection2();

	/**
	 * Returns a new object of class '<em>Immunizations Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section2</em>'.
	 * @generated
	 */
	ImmunizationsSection2 createImmunizationsSection2();

	/**
	 * Returns a new object of class '<em>Medications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section2</em>'.
	 * @generated
	 */
	MedicationsSection2 createMedicationsSection2();

	/**
	 * Returns a new object of class '<em>Problem Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Section2</em>'.
	 * @generated
	 */
	ProblemSection2 createProblemSection2();

	/**
	 * Returns a new object of class '<em>Procedures Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures Section2</em>'.
	 * @generated
	 */
	ProceduresSection2 createProceduresSection2();

	/**
	 * Returns a new object of class '<em>Results Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Results Section2</em>'.
	 * @generated
	 */
	ResultsSection2 createResultsSection2();

	/**
	 * Returns a new object of class '<em>Vital Signs Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section2</em>'.
	 * @generated
	 */
	VitalSignsSection2 createVitalSignsSection2();

	/**
	 * Returns a new object of class '<em>Consultation Note2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consultation Note2</em>'.
	 * @generated
	 */
	ConsultationNote2 createConsultationNote2();

	/**
	 * Returns a new object of class '<em>Continuity Of Care Document2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuity Of Care Document2</em>'.
	 * @generated
	 */
	ContinuityOfCareDocument2 createContinuityOfCareDocument2();

	/**
	 * Returns a new object of class '<em>Diagnostic Imaging Report2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Imaging Report2</em>'.
	 * @generated
	 */
	DiagnosticImagingReport2 createDiagnosticImagingReport2();

	/**
	 * Returns a new object of class '<em>Discharge Summary2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary2</em>'.
	 * @generated
	 */
	DischargeSummary2 createDischargeSummary2();

	/**
	 * Returns a new object of class '<em>History And Physical Note2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History And Physical Note2</em>'.
	 * @generated
	 */
	HistoryAndPhysicalNote2 createHistoryAndPhysicalNote2();

	/**
	 * Returns a new object of class '<em>Operative Note2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operative Note2</em>'.
	 * @generated
	 */
	OperativeNote2 createOperativeNote2();

	/**
	 * Returns a new object of class '<em>Procedure Note2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Note2</em>'.
	 * @generated
	 */
	ProcedureNote2 createProcedureNote2();

	/**
	 * Returns a new object of class '<em>Progress Note2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Progress Note2</em>'.
	 * @generated
	 */
	ProgressNote2 createProgressNote2();

	/**
	 * Returns a new object of class '<em>Unstructured Document2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Document2</em>'.
	 * @generated
	 */
	UnstructuredDocument2 createUnstructuredDocument2();

	/**
	 * Returns a new object of class '<em>Precondition For Substance Administration2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition For Substance Administration2</em>'.
	 * @generated
	 */
	PreconditionForSubstanceAdministration2 createPreconditionForSubstanceAdministration2();

	/**
	 * Returns a new object of class '<em>Family History Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation2</em>'.
	 * @generated
	 */
	FamilyHistoryObservation2 createFamilyHistoryObservation2();

	/**
	 * Returns a new object of class '<em>Health Status Evaluations And Outcomes Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Evaluations And Outcomes Section</em>'.
	 * @generated
	 */
	HealthStatusEvaluationsAndOutcomesSection createHealthStatusEvaluationsAndOutcomesSection();

	/**
	 * Returns a new object of class '<em>Family History Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Organizer2</em>'.
	 * @generated
	 */
	FamilyHistoryOrganizer2 createFamilyHistoryOrganizer2();

	/**
	 * Returns a new object of class '<em>Family History Section2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Section2</em>'.
	 * @generated
	 */
	FamilyHistorySection2 createFamilyHistorySection2();

	/**
	 * Returns a new object of class '<em>Physician Reading Study Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physician Reading Study Performer2</em>'.
	 * @generated
	 */
	PhysicianReadingStudyPerformer2 createPhysicianReadingStudyPerformer2();

	/**
	 * Returns a new object of class '<em>Course Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Of Care Section</em>'.
	 * @generated
	 */
	CourseOfCareSection createCourseOfCareSection();

	/**
	 * Returns a new object of class '<em>Planned Intervention Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Planned Intervention Act</em>'.
	 * @generated
	 */
	PlannedInterventionAct createPlannedInterventionAct();

	/**
	 * Returns a new object of class '<em>Risk Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Concern Act</em>'.
	 * @generated
	 */
	RiskConcernAct createRiskConcernAct();

	/**
	 * Returns a new object of class '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section</em>'.
	 * @generated
	 */
	MedicationsAdministeredSection createMedicationsAdministeredSection();

	/**
	 * Returns a new object of class '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Section</em>'.
	 * @generated
	 */
	PhysicalExamSection createPhysicalExamSection();

	/**
	 * Returns a new object of class '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Status Section</em>'.
	 * @generated
	 */
	GeneralStatusSection createGeneralStatusSection();

	/**
	 * Returns a new object of class '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Review Of Systems Section</em>'.
	 * @generated
	 */
	ReviewOfSystemsSection createReviewOfSystemsSection();

	/**
	 * Returns a new object of class '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Course Section</em>'.
	 * @generated
	 */
	HospitalCourseSection createHospitalCourseSection();

	/**
	 * Returns a new object of class '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment And Plan Section</em>'.
	 * @generated
	 */
	AssessmentAndPlanSection createAssessmentAndPlanSection();

	/**
	 * Returns a new object of class '<em>Surgical Drains Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgical Drains Section</em>'.
	 * @generated
	 */
	SurgicalDrainsSection createSurgicalDrainsSection();

	/**
	 * Returns a new object of class '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Document</em>'.
	 * @generated
	 */
	UnstructuredDocument createUnstructuredDocument();

	/**
	 * Returns a new object of class '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information</em>'.
	 * @generated
	 */
	MedicationInformation createMedicationInformation();

	/**
	 * Returns a new object of class '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary</em>'.
	 * @generated
	 */
	DischargeSummary createDischargeSummary();

	/**
	 * Returns a new object of class '<em>Discharge Diet Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diet Section</em>'.
	 * @generated
	 */
	DischargeDietSection createDischargeDietSection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * @generated
	 */
	HospitalDischargeMedicationsSectionEntriesOptional createHospitalDischargeMedicationsSectionEntriesOptional();

	/**
	 * Returns a new object of class '<em>Precondition For Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition For Substance Administration</em>'.
	 * @generated
	 */
	PreconditionForSubstanceAdministration createPreconditionForSubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Immunization Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization Medication Information</em>'.
	 * @generated
	 */
	ImmunizationMedicationInformation createImmunizationMedicationInformation();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Studies Summary Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Studies Summary Section</em>'.
	 * @generated
	 */
	HospitalDischargeStudiesSummarySection createHospitalDischargeStudiesSummarySection();

	/**
	 * Returns a new object of class '<em>Discharge Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Medication</em>'.
	 * @generated
	 */
	DischargeMedication createDischargeMedication();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Diagnosis</em>'.
	 * @generated
	 */
	HospitalDischargeDiagnosis createHospitalDischargeDiagnosis();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Instructions Section</em>'.
	 * @generated
	 */
	HospitalDischargeInstructionsSection createHospitalDischargeInstructionsSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConsolPackage getConsolPackage();

} // ConsolFactory
