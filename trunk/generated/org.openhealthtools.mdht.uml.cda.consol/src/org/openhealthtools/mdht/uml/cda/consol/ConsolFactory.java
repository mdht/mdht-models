/*******************************************************************************
 * Copyright (c) 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
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
	 * Returns a new object of class '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Observation</em>'.
	 * @generated
	 */
	StatusObservation createStatusObservation();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Episode Observation</em>'.
	 * @generated
	 */
	EpisodeObservation createEpisodeObservation();

	/**
	 * Returns a new object of class '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Entry</em>'.
	 * @generated
	 */
	ConditionEntry createConditionEntry();

	/**
	 * Returns a new object of class '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Observation</em>'.
	 * @generated
	 */
	AgeObservation createAgeObservation();

	/**
	 * Returns a new object of class '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity</em>'.
	 * @generated
	 */
	Severity createSeverity();

	/**
	 * Returns a new object of class '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status Observation</em>'.
	 * @generated
	 */
	ProblemStatusObservation createProblemStatusObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	HealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem List Section</em>'.
	 * @generated
	 */
	ProblemListSection createProblemListSection();

	/**
	 * Returns a new object of class '<em>Problem List Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem List Narrative Section</em>'.
	 * @generated
	 */
	ProblemListNarrativeSection createProblemListNarrativeSection();

	/**
	 * Returns a new object of class '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Results Section</em>'.
	 * @generated
	 */
	DiagnosticResultsSection createDiagnosticResultsSection();

	/**
	 * Returns a new object of class '<em>Diagnostic Results Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Results Narrative Section</em>'.
	 * @generated
	 */
	DiagnosticResultsNarrativeSection createDiagnosticResultsNarrativeSection();

	/**
	 * Returns a new object of class '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Organizer</em>'.
	 * @generated
	 */
	ResultOrganizer createResultOrganizer();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	Result createResult();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section</em>'.
	 * @generated
	 */
	VitalSignsSection createVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Vital Signs Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Narrative Section</em>'.
	 * @generated
	 */
	VitalSignsNarrativeSection createVitalSignsNarrativeSection();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer</em>'.
	 * @generated
	 */
	VitalSignsOrganizer createVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign</em>'.
	 * @generated
	 */
	VitalSign createVitalSign();

	/**
	 * Returns a new object of class '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Header Constraints</em>'.
	 * @generated
	 */
	GeneralHeaderConstraints createGeneralHeaderConstraints();

	/**
	 * Returns a new object of class '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Awareness</em>'.
	 * @generated
	 */
	PatientAwareness createPatientAwareness();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Series Number Observation</em>'.
	 * @generated
	 */
	MedicationSeriesNumberObservation createMedicationSeriesNumberObservation();

	/**
	 * Returns a new object of class '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Status Observation</em>'.
	 * @generated
	 */
	MedicationStatusObservation createMedicationStatusObservation();

	/**
	 * Returns a new object of class '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Observation</em>'.
	 * @generated
	 */
	ReactionObservation createReactionObservation();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reference</em>'.
	 * @generated
	 */
	InternalReference createInternalReference();

	/**
	 * Returns a new object of class '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Medical Instructions</em>'.
	 * @generated
	 */
	PatientMedicalInstructions createPatientMedicalInstructions();

	/**
	 * Returns a new object of class '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Type</em>'.
	 * @generated
	 */
	MedicationType createMedicationType();

	/**
	 * Returns a new object of class '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Order Information</em>'.
	 * @generated
	 */
	MedicationOrderInformation createMedicationOrderInformation();

	/**
	 * Returns a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * @generated
	 */
	MedicationFullfillmentInstructions createMedicationFullfillmentInstructions();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	MedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Medications Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Narrative Section</em>'.
	 * @generated
	 */
	MedicationsNarrativeSection createMedicationsNarrativeSection();

	/**
	 * Returns a new object of class '<em>Medication Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Normal Dose</em>'.
	 * @generated
	 */
	MedicationNormalDose createMedicationNormalDose();

	/**
	 * Returns a new object of class '<em>Medication Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Split Dose</em>'.
	 * @generated
	 */
	MedicationSplitDose createMedicationSplitDose();

	/**
	 * Returns a new object of class '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Tapered Dose</em>'.
	 * @generated
	 */
	MedicationTaperedDose createMedicationTaperedDose();

	/**
	 * Returns a new object of class '<em>Medication Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Conditional Dose</em>'.
	 * @generated
	 */
	MedicationConditionalDose createMedicationConditionalDose();

	/**
	 * Returns a new object of class '<em>Medication Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Combination Medication</em>'.
	 * @generated
	 */
	MedicationCombinationMedication createMedicationCombinationMedication();

	/**
	 * Returns a new object of class '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Information</em>'.
	 * @generated
	 */
	MedicationInformation createMedicationInformation();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	Immunization createImmunization();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	ImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Immunizations Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Narrative Section</em>'.
	 * @generated
	 */
	ImmunizationsNarrativeSection createImmunizationsNarrativeSection();

	/**
	 * Returns a new object of class '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Location</em>'.
	 * @generated
	 */
	EncounterLocation createEncounterLocation();

	/**
	 * Returns a new object of class '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgeries Section</em>'.
	 * @generated
	 */
	SurgeriesSection createSurgeriesSection();

	/**
	 * Returns a new object of class '<em>Surgeries Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgeries Narrative Section</em>'.
	 * @generated
	 */
	SurgeriesNarrativeSection createSurgeriesNarrativeSection();

	/**
	 * Returns a new object of class '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section</em>'.
	 * @generated
	 */
	PayersSection createPayersSection();

	/**
	 * Returns a new object of class '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Provider</em>'.
	 * @generated
	 */
	InsuranceProvider createInsuranceProvider();

	/**
	 * Returns a new object of class '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entry</em>'.
	 * @generated
	 */
	PayerEntry createPayerEntry();

	/**
	 * Returns a new object of class '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entity</em>'.
	 * @generated
	 */
	PayerEntity createPayerEntity();

	/**
	 * Returns a new object of class '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Covered Party</em>'.
	 * @generated
	 */
	CoveredParty createCoveredParty();

	/**
	 * Returns a new object of class '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Subscriber</em>'.
	 * @generated
	 */
	PolicySubscriber createPolicySubscriber();

	/**
	 * Returns a new object of class '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Procedure</em>'.
	 * @generated
	 */
	ProcedureActivityProcedure createProcedureActivityProcedure();

	/**
	 * Returns a new object of class '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Act</em>'.
	 * @generated
	 */
	ProcedureActivityAct createProcedureActivityAct();

	/**
	 * Returns a new object of class '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Activity Observation</em>'.
	 * @generated
	 */
	ProcedureActivityObservation createProcedureActivityObservation();

	/**
	 * Returns a new object of class '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Delegate</em>'.
	 * @generated
	 */
	ConsolRegistryDelegate createConsolRegistryDelegate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConsolPackage getConsolPackage();

} // ConsolFactory
