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
package org.openhealthtools.mdht.uml.cda.ihe.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.Support;
import org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.ihe.*;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage
 * @generated
 */
public class IHESwitch<T> extends Switch<T> {
	/**
	* The cached model package
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected static IHEPackage modelPackage;

	/**
	* Creates an instance of the switch.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public IHESwitch() {
		if (modelPackage == null) {
			modelPackage = IHEPackage.eINSTANCE;
		}
	}

	/**
	* Checks whether this is a switch for the given package.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @parameter ePackage the package in question.
	* @return whether this is a switch for the given package.
	* @generated
	*/
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IHEPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection) theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) {
					result = caseCCD_ImmunizationsSection(immunizationsSection);
				}
				if (result == null) {
					result = caseSection(immunizationsSection);
				}
				if (result == null) {
					result = caseAct(immunizationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization) theEObject;
				T result = caseImmunization(immunization);
				if (result == null) {
					result = caseMedicationActivity(immunization);
				}
				if (result == null) {
					result = caseSubstanceAdministration(immunization);
				}
				if (result == null) {
					result = caseClinicalStatement(immunization);
				}
				if (result == null) {
					result = caseAct(immunization);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunization);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICATIONS_ADMINISTERED_SECTION: {
				MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection) theEObject;
				T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) {
					result = caseSection(medicationsAdministeredSection);
				}
				if (result == null) {
					result = caseAct(medicationsAdministeredSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsAdministeredSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CONCERN_ENTRY: {
				ConcernEntry concernEntry = (ConcernEntry) theEObject;
				T result = caseConcernEntry(concernEntry);
				if (result == null) {
					result = caseProblemAct(concernEntry);
				}
				if (result == null) {
					result = caseCDA_Act(concernEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(concernEntry);
				}
				if (result == null) {
					result = caseAct(concernEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(concernEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICAL_DOCUMENT: {
				MedicalDocument medicalDocument = (MedicalDocument) theEObject;
				T result = caseMedicalDocument(medicalDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(medicalDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(medicalDocument);
				}
				if (result == null) {
					result = caseAct(medicalDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ACTIVE_PROBLEMS_SECTION: {
				ActiveProblemsSection activeProblemsSection = (ActiveProblemsSection) theEObject;
				T result = caseActiveProblemsSection(activeProblemsSection);
				if (result == null) {
					result = caseProblemSection(activeProblemsSection);
				}
				if (result == null) {
					result = caseSection(activeProblemsSection);
				}
				if (result == null) {
					result = caseAct(activeProblemsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(activeProblemsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROBLEM_CONCERN_ENTRY: {
				ProblemConcernEntry problemConcernEntry = (ProblemConcernEntry) theEObject;
				T result = caseProblemConcernEntry(problemConcernEntry);
				if (result == null) {
					result = caseConcernEntry(problemConcernEntry);
				}
				if (result == null) {
					result = caseProblemAct(problemConcernEntry);
				}
				if (result == null) {
					result = caseCDA_Act(problemConcernEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(problemConcernEntry);
				}
				if (result == null) {
					result = caseAct(problemConcernEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemConcernEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROBLEM_ENTRY: {
				ProblemEntry problemEntry = (ProblemEntry) theEObject;
				T result = caseProblemEntry(problemEntry);
				if (result == null) {
					result = caseProblemObservation(problemEntry);
				}
				if (result == null) {
					result = caseObservation(problemEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(problemEntry);
				}
				if (result == null) {
					result = caseAct(problemEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SEVERITY: {
				Severity severity = (Severity) theEObject;
				T result = caseSeverity(severity);
				if (result == null) {
					result = caseSeverityObservation(severity);
				}
				if (result == null) {
					result = caseObservation(severity);
				}
				if (result == null) {
					result = caseClinicalStatement(severity);
				}
				if (result == null) {
					result = caseAct(severity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(severity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROBLEM_STATUS_OBSERVATION: {
				ProblemStatusObservation problemStatusObservation = (ProblemStatusObservation) theEObject;
				T result = caseProblemStatusObservation(problemStatusObservation);
				if (result == null) {
					result = caseCCD_ProblemStatusObservation(problemStatusObservation);
				}
				if (result == null) {
					result = caseStatusObservation(problemStatusObservation);
				}
				if (result == null) {
					result = caseObservation(problemStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(problemStatusObservation);
				}
				if (result == null) {
					result = caseAct(problemStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HEALTH_STATUS_OBSERVATION: {
				HealthStatusObservation healthStatusObservation = (HealthStatusObservation) theEObject;
				T result = caseHealthStatusObservation(healthStatusObservation);
				if (result == null) {
					result = caseProblemHealthStatusObservation(healthStatusObservation);
				}
				if (result == null) {
					result = caseStatusObservation(healthStatusObservation);
				}
				if (result == null) {
					result = caseObservation(healthStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(healthStatusObservation);
				}
				if (result == null) {
					result = caseAct(healthStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.COMMENT: {
				Comment comment = (Comment) theEObject;
				T result = caseComment(comment);
				if (result == null) {
					result = caseCCD_Comment(comment);
				}
				if (result == null) {
					result = caseCDA_Act(comment);
				}
				if (result == null) {
					result = caseClinicalStatement(comment);
				}
				if (result == null) {
					result = caseAct(comment);
				}
				if (result == null) {
					result = caseInfrastructureRoot(comment);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICATION: {
				Medication medication = (Medication) theEObject;
				T result = caseMedication(medication);
				if (result == null) {
					result = caseMedicationActivity(medication);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medication);
				}
				if (result == null) {
					result = caseClinicalStatement(medication);
				}
				if (result == null) {
					result = caseAct(medication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.INTERNAL_REFERENCE: {
				InternalReference internalReference = (InternalReference) theEObject;
				T result = caseInternalReference(internalReference);
				if (result == null) {
					result = caseCDA_Act(internalReference);
				}
				if (result == null) {
					result = caseClinicalStatement(internalReference);
				}
				if (result == null) {
					result = caseAct(internalReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(internalReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PATIENT_MEDICAL_INSTRUCTIONS: {
				PatientMedicalInstructions patientMedicalInstructions = (PatientMedicalInstructions) theEObject;
				T result = casePatientMedicalInstructions(patientMedicalInstructions);
				if (result == null) {
					result = casePatientInstruction(patientMedicalInstructions);
				}
				if (result == null) {
					result = caseCDA_Act(patientMedicalInstructions);
				}
				if (result == null) {
					result = caseClinicalStatement(patientMedicalInstructions);
				}
				if (result == null) {
					result = caseAct(patientMedicalInstructions);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientMedicalInstructions);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SUPPLY_ENTRY: {
				SupplyEntry supplyEntry = (SupplyEntry) theEObject;
				T result = caseSupplyEntry(supplyEntry);
				if (result == null) {
					result = caseSupplyActivity(supplyEntry);
				}
				if (result == null) {
					result = caseSupply(supplyEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(supplyEntry);
				}
				if (result == null) {
					result = caseAct(supplyEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(supplyEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS: {
				MedicationFullfillmentInstructions medicationFullfillmentInstructions = (MedicationFullfillmentInstructions) theEObject;
				T result = caseMedicationFullfillmentInstructions(medicationFullfillmentInstructions);
				if (result == null) {
					result = caseFulfillmentInstruction(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseCDA_Act(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseAct(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationFullfillmentInstructions);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection) theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) {
					result = caseCCD_MedicationsSection(medicationsSection);
				}
				if (result == null) {
					result = caseSection(medicationsSection);
				}
				if (result == null) {
					result = caseAct(medicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ALLERGY_INTOLERANCE_CONCERN: {
				AllergyIntoleranceConcern allergyIntoleranceConcern = (AllergyIntoleranceConcern) theEObject;
				T result = caseAllergyIntoleranceConcern(allergyIntoleranceConcern);
				if (result == null) {
					result = caseConcernEntry(allergyIntoleranceConcern);
				}
				if (result == null) {
					result = caseProblemAct(allergyIntoleranceConcern);
				}
				if (result == null) {
					result = caseCDA_Act(allergyIntoleranceConcern);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyIntoleranceConcern);
				}
				if (result == null) {
					result = caseAct(allergyIntoleranceConcern);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyIntoleranceConcern);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance) theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) {
					result = caseProblemEntry(allergyIntolerance);
				}
				if (result == null) {
					result = caseProblemObservation(allergyIntolerance);
				}
				if (result == null) {
					result = caseObservation(allergyIntolerance);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyIntolerance);
				}
				if (result == null) {
					result = caseAct(allergyIntolerance);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyIntolerance);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER: {
				ProblemEntryReactionObservationContainer problemEntryReactionObservationContainer = (ProblemEntryReactionObservationContainer) theEObject;
				T result = caseProblemEntryReactionObservationContainer(problemEntryReactionObservationContainer);
				if (result == null) {
					result = caseProblemEntry(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = caseReactionObservation(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = caseProblemObservation(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = caseObservation(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = caseClinicalStatement(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = caseAct(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ALLERGIES_REACTIONS_SECTION: {
				AllergiesReactionsSection allergiesReactionsSection = (AllergiesReactionsSection) theEObject;
				T result = caseAllergiesReactionsSection(allergiesReactionsSection);
				if (result == null) {
					result = caseAlertsSection(allergiesReactionsSection);
				}
				if (result == null) {
					result = caseSection(allergiesReactionsSection);
				}
				if (result == null) {
					result = caseAct(allergiesReactionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesReactionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.NORMAL_DOSE: {
				NormalDose normalDose = (NormalDose) theEObject;
				T result = caseNormalDose(normalDose);
				if (result == null) {
					result = caseMedication(normalDose);
				}
				if (result == null) {
					result = caseMedicationActivity(normalDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(normalDose);
				}
				if (result == null) {
					result = caseClinicalStatement(normalDose);
				}
				if (result == null) {
					result = caseAct(normalDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(normalDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.TAPERED_DOSE: {
				TaperedDose taperedDose = (TaperedDose) theEObject;
				T result = caseTaperedDose(taperedDose);
				if (result == null) {
					result = caseMedication(taperedDose);
				}
				if (result == null) {
					result = caseMedicationActivity(taperedDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(taperedDose);
				}
				if (result == null) {
					result = caseClinicalStatement(taperedDose);
				}
				if (result == null) {
					result = caseAct(taperedDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(taperedDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SPLIT_DOSE: {
				SplitDose splitDose = (SplitDose) theEObject;
				T result = caseSplitDose(splitDose);
				if (result == null) {
					result = caseMedication(splitDose);
				}
				if (result == null) {
					result = caseMedicationActivity(splitDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(splitDose);
				}
				if (result == null) {
					result = caseClinicalStatement(splitDose);
				}
				if (result == null) {
					result = caseAct(splitDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(splitDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CONDITIONAL_DOSE: {
				ConditionalDose conditionalDose = (ConditionalDose) theEObject;
				T result = caseConditionalDose(conditionalDose);
				if (result == null) {
					result = caseMedication(conditionalDose);
				}
				if (result == null) {
					result = caseMedicationActivity(conditionalDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(conditionalDose);
				}
				if (result == null) {
					result = caseClinicalStatement(conditionalDose);
				}
				if (result == null) {
					result = caseAct(conditionalDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(conditionalDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.COMBINATION_MEDICATION: {
				CombinationMedication combinationMedication = (CombinationMedication) theEObject;
				T result = caseCombinationMedication(combinationMedication);
				if (result == null) {
					result = caseMedication(combinationMedication);
				}
				if (result == null) {
					result = caseMedicationActivity(combinationMedication);
				}
				if (result == null) {
					result = caseSubstanceAdministration(combinationMedication);
				}
				if (result == null) {
					result = caseClinicalStatement(combinationMedication);
				}
				if (result == null) {
					result = caseAct(combinationMedication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(combinationMedication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection) theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) {
					result = caseCCD_VitalSignsSection(vitalSignsSection);
				}
				if (result == null) {
					result = caseSection(vitalSignsSection);
				}
				if (result == null) {
					result = caseAct(vitalSignsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_VITAL_SIGNS_SECTION: {
				CodedVitalSignsSection codedVitalSignsSection = (CodedVitalSignsSection) theEObject;
				T result = caseCodedVitalSignsSection(codedVitalSignsSection);
				if (result == null) {
					result = caseVitalSignsSection(codedVitalSignsSection);
				}
				if (result == null) {
					result = caseCCD_VitalSignsSection(codedVitalSignsSection);
				}
				if (result == null) {
					result = caseSection(codedVitalSignsSection);
				}
				if (result == null) {
					result = caseAct(codedVitalSignsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedVitalSignsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer) theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) {
					result = caseCCD_VitalSignsOrganizer(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseResultOrganizer(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseAct(vitalSignsOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.VITAL_SIGN_OBSERVATION: {
				VitalSignObservation vitalSignObservation = (VitalSignObservation) theEObject;
				T result = caseVitalSignObservation(vitalSignObservation);
				if (result == null) {
					result = caseResultObservation(vitalSignObservation);
				}
				if (result == null) {
					result = caseSimpleObservation(vitalSignObservation);
				}
				if (result == null) {
					result = caseObservation(vitalSignObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignObservation);
				}
				if (result == null) {
					result = caseAct(vitalSignObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SIMPLE_OBSERVATION: {
				SimpleObservation simpleObservation = (SimpleObservation) theEObject;
				T result = caseSimpleObservation(simpleObservation);
				if (result == null) {
					result = caseObservation(simpleObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(simpleObservation);
				}
				if (result == null) {
					result = caseAct(simpleObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(simpleObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection) theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) {
					result = caseCCD_PayersSection(payersSection);
				}
				if (result == null) {
					result = caseSection(payersSection);
				}
				if (result == null) {
					result = caseAct(payersSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(payersSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.COVERAGE_ENTRY: {
				CoverageEntry coverageEntry = (CoverageEntry) theEObject;
				T result = caseCoverageEntry(coverageEntry);
				if (result == null) {
					result = caseCoverageActivity(coverageEntry);
				}
				if (result == null) {
					result = caseCDA_Act(coverageEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(coverageEntry);
				}
				if (result == null) {
					result = caseAct(coverageEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(coverageEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PAYER_ENTRY: {
				PayerEntry payerEntry = (PayerEntry) theEObject;
				T result = casePayerEntry(payerEntry);
				if (result == null) {
					result = casePolicyActivity(payerEntry);
				}
				if (result == null) {
					result = caseCDA_Act(payerEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(payerEntry);
				}
				if (result == null) {
					result = caseAct(payerEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(payerEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
				HistoryOfPastIllnessSection historyOfPastIllnessSection = (HistoryOfPastIllnessSection) theEObject;
				T result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) {
					result = caseSection(historyOfPastIllnessSection);
				}
				if (result == null) {
					result = caseAct(historyOfPastIllnessSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyOfPastIllnessSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CHIEF_COMPLAINT_SECTION: {
				ChiefComplaintSection chiefComplaintSection = (ChiefComplaintSection) theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) {
					result = caseSection(chiefComplaintSection);
				}
				if (result == null) {
					result = caseAct(chiefComplaintSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chiefComplaintSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.REASON_FOR_REFERRAL_SECTION: {
				ReasonForReferralSection reasonForReferralSection = (ReasonForReferralSection) theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) {
					result = caseSection(reasonForReferralSection);
				}
				if (result == null) {
					result = caseAct(reasonForReferralSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reasonForReferralSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HISTORY_OF_PRESENT_ILLNESS: {
				HistoryOfPresentIllness historyOfPresentIllness = (HistoryOfPresentIllness) theEObject;
				T result = caseHistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) {
					result = caseSection(historyOfPresentIllness);
				}
				if (result == null) {
					result = caseAct(historyOfPresentIllness);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyOfPresentIllness);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SURGERIES_SECTION: {
				SurgeriesSection surgeriesSection = (SurgeriesSection) theEObject;
				T result = caseSurgeriesSection(surgeriesSection);
				if (result == null) {
					result = caseProceduresSection(surgeriesSection);
				}
				if (result == null) {
					result = caseSection(surgeriesSection);
				}
				if (result == null) {
					result = caseAct(surgeriesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(surgeriesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_SURGERIES_SECTION: {
				CodedSurgeriesSection codedSurgeriesSection = (CodedSurgeriesSection) theEObject;
				T result = caseCodedSurgeriesSection(codedSurgeriesSection);
				if (result == null) {
					result = caseSurgeriesSection(codedSurgeriesSection);
				}
				if (result == null) {
					result = caseProceduresSection(codedSurgeriesSection);
				}
				if (result == null) {
					result = caseSection(codedSurgeriesSection);
				}
				if (result == null) {
					result = caseAct(codedSurgeriesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedSurgeriesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.EXTERNAL_REFERENCE: {
				ExternalReference externalReference = (ExternalReference) theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) {
					result = caseCDA_Act(externalReference);
				}
				if (result == null) {
					result = caseClinicalStatement(externalReference);
				}
				if (result == null) {
					result = caseAct(externalReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(externalReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure = (ProcedureEntryProcedureActivityProcedure) theEObject;
				T result = caseProcedureEntryProcedureActivityProcedure(procedureEntryProcedureActivityProcedure);
				if (result == null) {
					result = caseProcedureActivityProcedure(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = caseProcedureEntry(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = caseProcedure(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = caseProcedureActivity(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = caseAct(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROCEDURE_ENTRY: {
				ProcedureEntry procedureEntry = (ProcedureEntry) theEObject;
				T result = caseProcedureEntry(procedureEntry);
				if (result == null) {
					result = caseProcedure(procedureEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureEntry);
				}
				if (result == null) {
					result = caseAct(procedureEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
				HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (HospitalAdmissionDiagnosisSection) theEObject;
				T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) {
					result = caseSection(hospitalAdmissionDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(hospitalAdmissionDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalAdmissionDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.DISCHARGE_DIAGNOSIS_SECTION: {
				DischargeDiagnosisSection dischargeDiagnosisSection = (DischargeDiagnosisSection) theEObject;
				T result = caseDischargeDiagnosisSection(dischargeDiagnosisSection);
				if (result == null) {
					result = caseSection(dischargeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(dischargeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION: {
				AdmissionMedicationHistorySection admissionMedicationHistorySection = (AdmissionMedicationHistorySection) theEObject;
				T result = caseAdmissionMedicationHistorySection(admissionMedicationHistorySection);
				if (result == null) {
					result = caseSection(admissionMedicationHistorySection);
				}
				if (result == null) {
					result = caseAct(admissionMedicationHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(admissionMedicationHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection) theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) {
					result = caseSection(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeMedicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION: {
				CodedAdvanceDirectivesSection codedAdvanceDirectivesSection = (CodedAdvanceDirectivesSection) theEObject;
				T result = caseCodedAdvanceDirectivesSection(codedAdvanceDirectivesSection);
				if (result == null) {
					result = caseAdvanceDirectivesSection(codedAdvanceDirectivesSection);
				}
				if (result == null) {
					result = caseCCD_AdvanceDirectivesSection(codedAdvanceDirectivesSection);
				}
				if (result == null) {
					result = caseSection(codedAdvanceDirectivesSection);
				}
				if (result == null) {
					result = caseAct(codedAdvanceDirectivesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedAdvanceDirectivesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection) theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) {
					result = caseCCD_AdvanceDirectivesSection(advanceDirectivesSection);
				}
				if (result == null) {
					result = caseSection(advanceDirectivesSection);
				}
				if (result == null) {
					result = caseAct(advanceDirectivesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectivesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ADVANCE_DIRECTIVE_OBSERVATION: {
				AdvanceDirectiveObservation advanceDirectiveObservation = (AdvanceDirectiveObservation) theEObject;
				T result = caseAdvanceDirectiveObservation(advanceDirectiveObservation);
				if (result == null) {
					result = caseCCD_AdvanceDirectiveObservation(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseSimpleObservation(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseObservation(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseAct(advanceDirectiveObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PHYSICAL_EXAM_NARRATIVE_SECTION: {
				PhysicalExamNarrativeSection physicalExamNarrativeSection = (PhysicalExamNarrativeSection) theEObject;
				T result = casePhysicalExamNarrativeSection(physicalExamNarrativeSection);
				if (result == null) {
					result = caseSection(physicalExamNarrativeSection);
				}
				if (result == null) {
					result = caseAct(physicalExamNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicalExamNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PHYSICAL_EXAM_SECTION: {
				PhysicalExamSection physicalExamSection = (PhysicalExamSection) theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
				if (result == null) {
					result = casePhysicalExamNarrativeSection(physicalExamSection);
				}
				if (result == null) {
					result = caseSection(physicalExamSection);
				}
				if (result == null) {
					result = caseAct(physicalExamSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicalExamSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.GENERAL_APPEARANCE_SECTION: {
				GeneralAppearanceSection generalAppearanceSection = (GeneralAppearanceSection) theEObject;
				T result = caseGeneralAppearanceSection(generalAppearanceSection);
				if (result == null) {
					result = caseSection(generalAppearanceSection);
				}
				if (result == null) {
					result = caseAct(generalAppearanceSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalAppearanceSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION: {
				VisibleImplantedMedicalDevicesSection visibleImplantedMedicalDevicesSection = (VisibleImplantedMedicalDevicesSection) theEObject;
				T result = caseVisibleImplantedMedicalDevicesSection(visibleImplantedMedicalDevicesSection);
				if (result == null) {
					result = caseSection(visibleImplantedMedicalDevicesSection);
				}
				if (result == null) {
					result = caseAct(visibleImplantedMedicalDevicesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(visibleImplantedMedicalDevicesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.INTEGUMENTARY_SYSTEM_SECTION: {
				IntegumentarySystemSection integumentarySystemSection = (IntegumentarySystemSection) theEObject;
				T result = caseIntegumentarySystemSection(integumentarySystemSection);
				if (result == null) {
					result = caseSection(integumentarySystemSection);
				}
				if (result == null) {
					result = caseAct(integumentarySystemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(integumentarySystemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HEAD_SECTION: {
				HeadSection headSection = (HeadSection) theEObject;
				T result = caseHeadSection(headSection);
				if (result == null) {
					result = caseSection(headSection);
				}
				if (result == null) {
					result = caseAct(headSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(headSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.EYES_SECTION: {
				EyesSection eyesSection = (EyesSection) theEObject;
				T result = caseEyesSection(eyesSection);
				if (result == null) {
					result = caseSection(eyesSection);
				}
				if (result == null) {
					result = caseAct(eyesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(eyesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.EARS_NOSE_MOUTH_THROAT_SECTION: {
				EarsNoseMouthThroatSection earsNoseMouthThroatSection = (EarsNoseMouthThroatSection) theEObject;
				T result = caseEarsNoseMouthThroatSection(earsNoseMouthThroatSection);
				if (result == null) {
					result = caseSection(earsNoseMouthThroatSection);
				}
				if (result == null) {
					result = caseAct(earsNoseMouthThroatSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(earsNoseMouthThroatSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.EARS_SECTION: {
				EarsSection earsSection = (EarsSection) theEObject;
				T result = caseEarsSection(earsSection);
				if (result == null) {
					result = caseSection(earsSection);
				}
				if (result == null) {
					result = caseAct(earsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(earsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.NOSE_SECTION: {
				NoseSection noseSection = (NoseSection) theEObject;
				T result = caseNoseSection(noseSection);
				if (result == null) {
					result = caseSection(noseSection);
				}
				if (result == null) {
					result = caseAct(noseSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(noseSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MOUTH_THROAT_TEETH_SECTION: {
				MouthThroatTeethSection mouthThroatTeethSection = (MouthThroatTeethSection) theEObject;
				T result = caseMouthThroatTeethSection(mouthThroatTeethSection);
				if (result == null) {
					result = caseSection(mouthThroatTeethSection);
				}
				if (result == null) {
					result = caseAct(mouthThroatTeethSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(mouthThroatTeethSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.NECK_SECTION: {
				NeckSection neckSection = (NeckSection) theEObject;
				T result = caseNeckSection(neckSection);
				if (result == null) {
					result = caseSection(neckSection);
				}
				if (result == null) {
					result = caseAct(neckSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(neckSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ENDOCRINE_SYSTEM_SECTION: {
				EndocrineSystemSection endocrineSystemSection = (EndocrineSystemSection) theEObject;
				T result = caseEndocrineSystemSection(endocrineSystemSection);
				if (result == null) {
					result = caseSection(endocrineSystemSection);
				}
				if (result == null) {
					result = caseAct(endocrineSystemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(endocrineSystemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.THORAX_LUNGS_SECTION: {
				ThoraxLungsSection thoraxLungsSection = (ThoraxLungsSection) theEObject;
				T result = caseThoraxLungsSection(thoraxLungsSection);
				if (result == null) {
					result = caseSection(thoraxLungsSection);
				}
				if (result == null) {
					result = caseAct(thoraxLungsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(thoraxLungsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CHEST_WALL_SECTION: {
				ChestWallSection chestWallSection = (ChestWallSection) theEObject;
				T result = caseChestWallSection(chestWallSection);
				if (result == null) {
					result = caseSection(chestWallSection);
				}
				if (result == null) {
					result = caseAct(chestWallSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chestWallSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.BREAST_SECTION: {
				BreastSection breastSection = (BreastSection) theEObject;
				T result = caseBreastSection(breastSection);
				if (result == null) {
					result = caseSection(breastSection);
				}
				if (result == null) {
					result = caseAct(breastSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(breastSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HEART_SECTION: {
				HeartSection heartSection = (HeartSection) theEObject;
				T result = caseHeartSection(heartSection);
				if (result == null) {
					result = caseSection(heartSection);
				}
				if (result == null) {
					result = caseAct(heartSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(heartSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.RESPIRATORY_SYSTEM_SECTION: {
				RespiratorySystemSection respiratorySystemSection = (RespiratorySystemSection) theEObject;
				T result = caseRespiratorySystemSection(respiratorySystemSection);
				if (result == null) {
					result = caseSection(respiratorySystemSection);
				}
				if (result == null) {
					result = caseAct(respiratorySystemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(respiratorySystemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ABDOMEN_SECTION: {
				AbdomenSection abdomenSection = (AbdomenSection) theEObject;
				T result = caseAbdomenSection(abdomenSection);
				if (result == null) {
					result = caseSection(abdomenSection);
				}
				if (result == null) {
					result = caseAct(abdomenSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(abdomenSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.LYMPHATIC_SECTION: {
				LymphaticSection lymphaticSection = (LymphaticSection) theEObject;
				T result = caseLymphaticSection(lymphaticSection);
				if (result == null) {
					result = caseSection(lymphaticSection);
				}
				if (result == null) {
					result = caseAct(lymphaticSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(lymphaticSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.VESSELS_SECTION: {
				VesselsSection vesselsSection = (VesselsSection) theEObject;
				T result = caseVesselsSection(vesselsSection);
				if (result == null) {
					result = caseSection(vesselsSection);
				}
				if (result == null) {
					result = caseAct(vesselsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vesselsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MUSCULOSKELETAL_SYSTEM_SECTION: {
				MusculoskeletalSystemSection musculoskeletalSystemSection = (MusculoskeletalSystemSection) theEObject;
				T result = caseMusculoskeletalSystemSection(musculoskeletalSystemSection);
				if (result == null) {
					result = caseSection(musculoskeletalSystemSection);
				}
				if (result == null) {
					result = caseAct(musculoskeletalSystemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(musculoskeletalSystemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.NEUROLOGIC_SYSTEM_SECTION: {
				NeurologicSystemSection neurologicSystemSection = (NeurologicSystemSection) theEObject;
				T result = caseNeurologicSystemSection(neurologicSystemSection);
				if (result == null) {
					result = caseSection(neurologicSystemSection);
				}
				if (result == null) {
					result = caseAct(neurologicSystemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(neurologicSystemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.GENITALIA_SECTION: {
				GenitaliaSection genitaliaSection = (GenitaliaSection) theEObject;
				T result = caseGenitaliaSection(genitaliaSection);
				if (result == null) {
					result = caseSection(genitaliaSection);
				}
				if (result == null) {
					result = caseAct(genitaliaSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(genitaliaSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.RECTUM_SECTION: {
				RectumSection rectumSection = (RectumSection) theEObject;
				T result = caseRectumSection(rectumSection);
				if (result == null) {
					result = caseSection(rectumSection);
				}
				if (result == null) {
					result = caseAct(rectumSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(rectumSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.EXTREMITIES_SECTION: {
				ExtremitiesSection extremitiesSection = (ExtremitiesSection) theEObject;
				T result = caseExtremitiesSection(extremitiesSection);
				if (result == null) {
					result = caseSection(extremitiesSection);
				}
				if (result == null) {
					result = caseAct(extremitiesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(extremitiesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.REVIEW_OF_SYSTEMS_SECTION: {
				ReviewOfSystemsSection reviewOfSystemsSection = (ReviewOfSystemsSection) theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) {
					result = caseSection(reviewOfSystemsSection);
				}
				if (result == null) {
					result = caseAct(reviewOfSystemsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reviewOfSystemsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HOSPITAL_COURSE_SECTION: {
				HospitalCourseSection hospitalCourseSection = (HospitalCourseSection) theEObject;
				T result = caseHospitalCourseSection(hospitalCourseSection);
				if (result == null) {
					result = caseSection(hospitalCourseSection);
				}
				if (result == null) {
					result = caseAct(hospitalCourseSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalCourseSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_RESULTS_SECTION: {
				CodedResultsSection codedResultsSection = (CodedResultsSection) theEObject;
				T result = caseCodedResultsSection(codedResultsSection);
				if (result == null) {
					result = caseSection(codedResultsSection);
				}
				if (result == null) {
					result = caseAct(codedResultsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedResultsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ASSESSMENT_AND_PLAN_SECTION: {
				AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection) theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) {
					result = caseSection(assessmentAndPlanSection);
				}
				if (result == null) {
					result = caseAct(assessmentAndPlanSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentAndPlanSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CARE_PLAN_SECTION: {
				CarePlanSection carePlanSection = (CarePlanSection) theEObject;
				T result = caseCarePlanSection(carePlanSection);
				if (result == null) {
					result = casePlanOfCareSection(carePlanSection);
				}
				if (result == null) {
					result = caseSection(carePlanSection);
				}
				if (result == null) {
					result = caseAct(carePlanSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(carePlanSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION: {
				FamilyMedicalHistorySection familyMedicalHistorySection = (FamilyMedicalHistorySection) theEObject;
				T result = caseFamilyMedicalHistorySection(familyMedicalHistorySection);
				if (result == null) {
					result = caseFamilyHistorySection(familyMedicalHistorySection);
				}
				if (result == null) {
					result = caseSection(familyMedicalHistorySection);
				}
				if (result == null) {
					result = caseAct(familyMedicalHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyMedicalHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection) theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) {
					result = caseCCD_SocialHistorySection(socialHistorySection);
				}
				if (result == null) {
					result = caseSection(socialHistorySection);
				}
				if (result == null) {
					result = caseAct(socialHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ENCOUNTER_HISTORY_SECTION: {
				EncounterHistorySection encounterHistorySection = (EncounterHistorySection) theEObject;
				T result = caseEncounterHistorySection(encounterHistorySection);
				if (result == null) {
					result = caseEncountersSection(encounterHistorySection);
				}
				if (result == null) {
					result = caseSection(encounterHistorySection);
				}
				if (result == null) {
					result = caseAct(encounterHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ENCOUNTER_ENTRY: {
				EncounterEntry encounterEntry = (EncounterEntry) theEObject;
				T result = caseEncounterEntry(encounterEntry);
				if (result == null) {
					result = caseEncounter(encounterEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterEntry);
				}
				if (result == null) {
					result = caseAct(encounterEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICAL_DEVICES_SECTION: {
				MedicalDevicesSection medicalDevicesSection = (MedicalDevicesSection) theEObject;
				T result = caseMedicalDevicesSection(medicalDevicesSection);
				if (result == null) {
					result = caseMedicalEquipmentSection(medicalDevicesSection);
				}
				if (result == null) {
					result = caseSection(medicalDevicesSection);
				}
				if (result == null) {
					result = caseAct(medicalDevicesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalDevicesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.LANGUAGE_COMMUNICATION: {
				LanguageCommunication languageCommunication = (LanguageCommunication) theEObject;
				T result = caseLanguageCommunication(languageCommunication);
				if (result == null) {
					result = caseCDA_LanguageCommunication(languageCommunication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.MEDICAL_SUMMARY: {
				MedicalSummary medicalSummary = (MedicalSummary) theEObject;
				T result = caseMedicalSummary(medicalSummary);
				if (result == null) {
					result = caseMedicalDocument(medicalSummary);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(medicalSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(medicalSummary);
				}
				if (result == null) {
					result = caseAct(medicalSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.DISCHARGE_SUMMARY: {
				DischargeSummary dischargeSummary = (DischargeSummary) theEObject;
				T result = caseDischargeSummary(dischargeSummary);
				if (result == null) {
					result = caseMedicalSummary(dischargeSummary);
				}
				if (result == null) {
					result = caseMedicalDocument(dischargeSummary);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(dischargeSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(dischargeSummary);
				}
				if (result == null) {
					result = caseAct(dischargeSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES: {
				HealthcareProvidersPharmacies healthcareProvidersPharmacies = (HealthcareProvidersPharmacies) theEObject;
				T result = caseHealthcareProvidersPharmacies(healthcareProvidersPharmacies);
				if (result == null) {
					result = casePerformer1(healthcareProvidersPharmacies);
				}
				if (result == null) {
					result = caseParticipation(healthcareProvidersPharmacies);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthcareProvidersPharmacies);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.OBSERVATION_REQUEST_ENTRY: {
				ObservationRequestEntry observationRequestEntry = (ObservationRequestEntry) theEObject;
				T result = caseObservationRequestEntry(observationRequestEntry);
				if (result == null) {
					result = casePlanOfCareActivityObservation(observationRequestEntry);
				}
				if (result == null) {
					result = caseObservation(observationRequestEntry);
				}
				if (result == null) {
					result = casePlanOfCareActivity(observationRequestEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(observationRequestEntry);
				}
				if (result == null) {
					result = caseAct(observationRequestEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(observationRequestEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PRODUCT_ENTRY: {
				ProductEntry productEntry = (ProductEntry) theEObject;
				T result = caseProductEntry(productEntry);
				if (result == null) {
					result = caseProduct(productEntry);
				}
				if (result == null) {
					result = caseManufacturedProduct(productEntry);
				}
				if (result == null) {
					result = caseRole(productEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(productEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				ProcedureEntryPlanOfCareActivityProcedure procedureEntryPlanOfCareActivityProcedure = (ProcedureEntryPlanOfCareActivityProcedure) theEObject;
				T result = caseProcedureEntryPlanOfCareActivityProcedure(procedureEntryPlanOfCareActivityProcedure);
				if (result == null) {
					result = casePlanOfCareActivityProcedure(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseProcedureEntry(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseProcedure(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = casePlanOfCareActivity(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseAct(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureEntryPlanOfCareActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PHR_EXTRACT: {
				PHRExtract phrExtract = (PHRExtract) theEObject;
				T result = casePHRExtract(phrExtract);
				if (result == null) {
					result = caseMedicalSummary(phrExtract);
				}
				if (result == null) {
					result = caseMedicalDocument(phrExtract);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(phrExtract);
				}
				if (result == null) {
					result = caseClinicalDocument(phrExtract);
				}
				if (result == null) {
					result = caseAct(phrExtract);
				}
				if (result == null) {
					result = caseInfrastructureRoot(phrExtract);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PHR_UPDATE: {
				PHRUpdate phrUpdate = (PHRUpdate) theEObject;
				T result = casePHRUpdate(phrUpdate);
				if (result == null) {
					result = caseMedicalSummary(phrUpdate);
				}
				if (result == null) {
					result = caseMedicalDocument(phrUpdate);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(phrUpdate);
				}
				if (result == null) {
					result = caseClinicalDocument(phrUpdate);
				}
				if (result == null) {
					result = caseAct(phrUpdate);
				}
				if (result == null) {
					result = caseInfrastructureRoot(phrUpdate);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ENCOUNTER_ACTIVITY: {
				EncounterActivity encounterActivity = (EncounterActivity) theEObject;
				T result = caseEncounterActivity(encounterActivity);
				if (result == null) {
					result = caseEncounterEntry(encounterActivity);
				}
				if (result == null) {
					result = caseEncountersActivity(encounterActivity);
				}
				if (result == null) {
					result = caseEncounter(encounterActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterActivity);
				}
				if (result == null) {
					result = caseAct(encounterActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.ENCOUNTER_PLAN_OF_CARE: {
				EncounterPlanOfCare encounterPlanOfCare = (EncounterPlanOfCare) theEObject;
				T result = caseEncounterPlanOfCare(encounterPlanOfCare);
				if (result == null) {
					result = caseEncounterEntry(encounterPlanOfCare);
				}
				if (result == null) {
					result = casePlanOfCareActivityEncounter(encounterPlanOfCare);
				}
				if (result == null) {
					result = caseEncounter(encounterPlanOfCare);
				}
				if (result == null) {
					result = casePlanOfCareActivity(encounterPlanOfCare);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterPlanOfCare);
				}
				if (result == null) {
					result = caseAct(encounterPlanOfCare);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterPlanOfCare);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.INTAKE_OUTPUT_SECTION: {
				IntakeOutputSection intakeOutputSection = (IntakeOutputSection) theEObject;
				T result = caseIntakeOutputSection(intakeOutputSection);
				if (result == null) {
					result = caseSection(intakeOutputSection);
				}
				if (result == null) {
					result = caseAct(intakeOutputSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(intakeOutputSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PREGNANCY_HISTORY_SECTION: {
				PregnancyHistorySection pregnancyHistorySection = (PregnancyHistorySection) theEObject;
				T result = casePregnancyHistorySection(pregnancyHistorySection);
				if (result == null) {
					result = caseSection(pregnancyHistorySection);
				}
				if (result == null) {
					result = caseAct(pregnancyHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(pregnancyHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PREGNANCY_OBSERVATION: {
				PregnancyObservation pregnancyObservation = (PregnancyObservation) theEObject;
				T result = casePregnancyObservation(pregnancyObservation);
				if (result == null) {
					result = caseSimpleObservation(pregnancyObservation);
				}
				if (result == null) {
					result = caseObservation(pregnancyObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(pregnancyObservation);
				}
				if (result == null) {
					result = caseAct(pregnancyObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(pregnancyObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PATIENT_CONTACT: {
				PatientContact patientContact = (PatientContact) theEObject;
				T result = casePatientContact(patientContact);
				if (result == null) {
					result = caseSupport(patientContact);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PATIENT_CONTACT_GUARDIAN: {
				PatientContactGuardian patientContactGuardian = (PatientContactGuardian) theEObject;
				T result = casePatientContactGuardian(patientContactGuardian);
				if (result == null) {
					result = caseSupportGuardian(patientContactGuardian);
				}
				if (result == null) {
					result = casePatientContact(patientContactGuardian);
				}
				if (result == null) {
					result = caseGuardian(patientContactGuardian);
				}
				if (result == null) {
					result = caseSupport(patientContactGuardian);
				}
				if (result == null) {
					result = caseRole(patientContactGuardian);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientContactGuardian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PATIENT_CONTACT_PARTICIPANT: {
				PatientContactParticipant patientContactParticipant = (PatientContactParticipant) theEObject;
				T result = casePatientContactParticipant(patientContactParticipant);
				if (result == null) {
					result = caseSupportParticipant(patientContactParticipant);
				}
				if (result == null) {
					result = casePatientContact(patientContactParticipant);
				}
				if (result == null) {
					result = caseParticipant1(patientContactParticipant);
				}
				if (result == null) {
					result = caseSupport(patientContactParticipant);
				}
				if (result == null) {
					result = caseParticipation(patientContactParticipant);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientContactParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SCANNED_DOCUMENT: {
				ScannedDocument scannedDocument = (ScannedDocument) theEObject;
				T result = caseScannedDocument(scannedDocument);
				if (result == null) {
					result = caseClinicalDocument(scannedDocument);
				}
				if (result == null) {
					result = caseAct(scannedDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scannedDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SCAN_ORIGINAL_AUTHOR: {
				ScanOriginalAuthor scanOriginalAuthor = (ScanOriginalAuthor) theEObject;
				T result = caseScanOriginalAuthor(scanOriginalAuthor);
				if (result == null) {
					result = caseAuthor(scanOriginalAuthor);
				}
				if (result == null) {
					result = caseParticipation(scanOriginalAuthor);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scanOriginalAuthor);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SCANNING_DEVICE: {
				ScanningDevice scanningDevice = (ScanningDevice) theEObject;
				T result = caseScanningDevice(scanningDevice);
				if (result == null) {
					result = caseAuthor(scanningDevice);
				}
				if (result == null) {
					result = caseParticipation(scanningDevice);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scanningDevice);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SCAN_DATA_ENTERER: {
				ScanDataEnterer scanDataEnterer = (ScanDataEnterer) theEObject;
				T result = caseScanDataEnterer(scanDataEnterer);
				if (result == null) {
					result = caseDataEnterer(scanDataEnterer);
				}
				if (result == null) {
					result = caseParticipation(scanDataEnterer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(scanDataEnterer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.DISCHARGE_DIET: {
				DischargeDiet dischargeDiet = (DischargeDiet) theEObject;
				T result = caseDischargeDiet(dischargeDiet);
				if (result == null) {
					result = caseSection(dischargeDiet);
				}
				if (result == null) {
					result = caseAct(dischargeDiet);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeDiet);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.HOSPITAL_DISCHARGE_PHYSICAL: {
				HospitalDischargePhysical hospitalDischargePhysical = (HospitalDischargePhysical) theEObject;
				T result = caseHospitalDischargePhysical(hospitalDischargePhysical);
				if (result == null) {
					result = caseSection(hospitalDischargePhysical);
				}
				if (result == null) {
					result = caseAct(hospitalDischargePhysical);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargePhysical);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_FAMILY_MEDICAL_HISTORY_SECTION: {
				CodedFamilyMedicalHistorySection codedFamilyMedicalHistorySection = (CodedFamilyMedicalHistorySection) theEObject;
				T result = caseCodedFamilyMedicalHistorySection(codedFamilyMedicalHistorySection);
				if (result == null) {
					result = caseFamilyMedicalHistorySection(codedFamilyMedicalHistorySection);
				}
				if (result == null) {
					result = caseFamilyHistorySection(codedFamilyMedicalHistorySection);
				}
				if (result == null) {
					result = caseSection(codedFamilyMedicalHistorySection);
				}
				if (result == null) {
					result = caseAct(codedFamilyMedicalHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedFamilyMedicalHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.FAMILY_HISTORY_ORGANIZER: {
				FamilyHistoryOrganizer familyHistoryOrganizer = (FamilyHistoryOrganizer) theEObject;
				T result = caseFamilyHistoryOrganizer(familyHistoryOrganizer);
				if (result == null) {
					result = caseCCD_FamilyHistoryOrganizer(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseAct(familyHistoryOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.FAMILY_HISTORY_OBSERVATION: {
				FamilyHistoryObservation familyHistoryObservation = (FamilyHistoryObservation) theEObject;
				T result = caseFamilyHistoryObservation(familyHistoryObservation);
				if (result == null) {
					result = caseCCD_FamilyHistoryObservation(familyHistoryObservation);
				}
				if (result == null) {
					result = caseSimpleObservation(familyHistoryObservation);
				}
				if (result == null) {
					result = caseObservation(familyHistoryObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryObservation);
				}
				if (result == null) {
					result = caseAct(familyHistoryObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.SOCIAL_HISTORY_OBSERVATION: {
				SocialHistoryObservation socialHistoryObservation = (SocialHistoryObservation) theEObject;
				T result = caseSocialHistoryObservation(socialHistoryObservation);
				if (result == null) {
					result = caseSimpleObservation(socialHistoryObservation);
				}
				if (result == null) {
					result = caseCCD_SocialHistoryObservation(socialHistoryObservation);
				}
				if (result == null) {
					result = caseObservation(socialHistoryObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(socialHistoryObservation);
				}
				if (result == null) {
					result = caseAct(socialHistoryObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistoryObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_REASON_FOR_REFERRAL_SECTION: {
				CodedReasonForReferralSection codedReasonForReferralSection = (CodedReasonForReferralSection) theEObject;
				T result = caseCodedReasonForReferralSection(codedReasonForReferralSection);
				if (result == null) {
					result = caseReasonForReferralSection(codedReasonForReferralSection);
				}
				if (result == null) {
					result = caseSection(codedReasonForReferralSection);
				}
				if (result == null) {
					result = caseAct(codedReasonForReferralSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedReasonForReferralSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.CODED_SOCIAL_HISTORY_SECTION: {
				CodedSocialHistorySection codedSocialHistorySection = (CodedSocialHistorySection) theEObject;
				T result = caseCodedSocialHistorySection(codedSocialHistorySection);
				if (result == null) {
					result = caseCCD_SocialHistorySection(codedSocialHistorySection);
				}
				if (result == null) {
					result = caseSection(codedSocialHistorySection);
				}
				if (result == null) {
					result = caseAct(codedSocialHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codedSocialHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.FUNCTIONAL_STATUS_SECTION: {
				FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection) theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
				if (result == null) {
					result = caseCCD_FunctionalStatusSection(functionalStatusSection);
				}
				if (result == null) {
					result = caseSection(functionalStatusSection);
				}
				if (result == null) {
					result = caseAct(functionalStatusSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.PROCEDURES_AND_INTERVENTIONS_SECTION: {
				ProceduresAndInterventionsSection proceduresAndInterventionsSection = (ProceduresAndInterventionsSection) theEObject;
				T result = caseProceduresAndInterventionsSection(proceduresAndInterventionsSection);
				if (result == null) {
					result = caseSection(proceduresAndInterventionsSection);
				}
				if (result == null) {
					result = caseAct(proceduresAndInterventionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresAndInterventionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IHEPackage.IHE_REGISTRY_DELEGATE: {
				IHERegistryDelegate iheRegistryDelegate = (IHERegistryDelegate) theEObject;
				T result = caseIHERegistryDelegate(iheRegistryDelegate);
				if (result == null) {
					result = caseRegistryDelegate(iheRegistryDelegate);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseImmunizationsSection(ImmunizationsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Immunization</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Immunization</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseImmunization(Immunization object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Concern Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Concern Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseConcernEntry(ConcernEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medical Document</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medical Document</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicalDocument(MedicalDocument object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Active Problems Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Active Problems Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseActiveProblemsSection(ActiveProblemsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Concern Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Concern Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemConcernEntry(ProblemConcernEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemEntry(ProblemEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Severity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Severity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSeverity(Severity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Status Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Status Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemStatusObservation(ProblemStatusObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Health Status Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Health Status Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHealthStatusObservation(HealthStatusObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseComment(Comment object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Internal Reference</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Internal Reference</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseInternalReference(InternalReference object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Patient Medical Instructions</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Patient Medical Instructions</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePatientMedicalInstructions(PatientMedicalInstructions object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Supply Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Supply Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSupplyEntry(SupplyEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medication Fullfillment Instructions</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medication Fullfillment Instructions</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicationFullfillmentInstructions(MedicationFullfillmentInstructions object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicationsSection(MedicationsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Concern</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Concern</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAllergyIntoleranceConcern(AllergyIntoleranceConcern object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAllergyIntolerance(AllergyIntolerance object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Entry Reaction Observation Container</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Entry Reaction Observation Container</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemEntryReactionObservationContainer(ProblemEntryReactionObservationContainer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Allergies Reactions Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Allergies Reactions Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAllergiesReactionsSection(AllergiesReactionsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Normal Dose</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Normal Dose</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseNormalDose(NormalDose object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Tapered Dose</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Tapered Dose</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseTaperedDose(TaperedDose object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Split Dose</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Split Dose</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSplitDose(SplitDose object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Conditional Dose</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Conditional Dose</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseConditionalDose(ConditionalDose object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Combination Medication</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Combination Medication</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCombinationMedication(CombinationMedication object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseVitalSignsSection(VitalSignsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Vital Signs Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Vital Signs Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedVitalSignsSection(CodedVitalSignsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseVitalSignsOrganizer(VitalSignsOrganizer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseVitalSignObservation(VitalSignObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Simple Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Simple Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSimpleObservation(SimpleObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePayersSection(PayersSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coverage Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coverage Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCoverageEntry(CoverageEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Payer Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Payer Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePayerEntry(PayerEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseChiefComplaintSection(ChiefComplaintSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseReasonForReferralSection(ReasonForReferralSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSurgeriesSection(SurgeriesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Surgeries Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Surgeries Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedSurgeriesSection(CodedSurgeriesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseExternalReference(ExternalReference object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProcedureEntryProcedureActivityProcedure(ProcedureEntryProcedureActivityProcedure object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedure Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedure Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProcedureEntry(ProcedureEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseDischargeDiagnosisSection(DischargeDiagnosisSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Admission Medication History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Admission Medication History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAdmissionMedicationHistorySection(AdmissionMedicationHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Advance Directives Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Advance Directives Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedAdvanceDirectivesSection(CodedAdvanceDirectivesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Physical Exam Narrative Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Physical Exam Narrative Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePhysicalExamNarrativeSection(PhysicalExamNarrativeSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePhysicalExamSection(PhysicalExamSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>General Appearance Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>General Appearance Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseGeneralAppearanceSection(GeneralAppearanceSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Visible Implanted Medical Devices Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Visible Implanted Medical Devices Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseVisibleImplantedMedicalDevicesSection(VisibleImplantedMedicalDevicesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Integumentary System Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Integumentary System Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseIntegumentarySystemSection(IntegumentarySystemSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Head Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Head Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHeadSection(HeadSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Eyes Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Eyes Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEyesSection(EyesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Ears Nose Mouth Throat Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Ears Nose Mouth Throat Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEarsNoseMouthThroatSection(EarsNoseMouthThroatSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Ears Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Ears Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEarsSection(EarsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Nose Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Nose Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseNoseSection(NoseSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Mouth Throat Teeth Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Mouth Throat Teeth Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMouthThroatTeethSection(MouthThroatTeethSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Neck Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Neck Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseNeckSection(NeckSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Endocrine System Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Endocrine System Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEndocrineSystemSection(EndocrineSystemSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Thorax Lungs Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Thorax Lungs Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseThoraxLungsSection(ThoraxLungsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Chest Wall Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Chest Wall Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseChestWallSection(ChestWallSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Breast Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Breast Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseBreastSection(BreastSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Heart Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Heart Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHeartSection(HeartSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Respiratory System Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Respiratory System Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseRespiratorySystemSection(RespiratorySystemSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Abdomen Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Abdomen Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAbdomenSection(AbdomenSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Lymphatic Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Lymphatic Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseLymphaticSection(LymphaticSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Vessels Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Vessels Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseVesselsSection(VesselsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Musculoskeletal System Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Musculoskeletal System Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMusculoskeletalSystemSection(MusculoskeletalSystemSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Neurologic System Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Neurologic System Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseNeurologicSystemSection(NeurologicSystemSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Genitalia Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Genitalia Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseGenitaliaSection(GenitaliaSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Rectum Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Rectum Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseRectumSection(RectumSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Extremities Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Extremities Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseExtremitiesSection(ExtremitiesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHospitalCourseSection(HospitalCourseSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Results Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Results Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedResultsSection(CodedResultsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Care Plan Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Care Plan Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCarePlanSection(CarePlanSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Family Medical History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Family Medical History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseFamilyMedicalHistorySection(FamilyMedicalHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSocialHistorySection(SocialHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounter History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounter History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncounterHistorySection(EncounterHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounter Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounter Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncounterEntry(EncounterEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medical Devices Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medical Devices Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicalDevicesSection(MedicalDevicesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseLanguageCommunication(LanguageCommunication object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medical Summary</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medical Summary</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicalSummary(MedicalSummary object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseDischargeSummary(DischargeSummary object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Healthcare Providers Pharmacies</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Healthcare Providers Pharmacies</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHealthcareProvidersPharmacies(HealthcareProvidersPharmacies object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Observation Request Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Observation Request Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseObservationRequestEntry(ObservationRequestEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Product Entry</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Product Entry</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProductEntry(ProductEntry object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedure Entry Plan Of Care Activity Procedure</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedure Entry Plan Of Care Activity Procedure</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProcedureEntryPlanOfCareActivityProcedure(ProcedureEntryPlanOfCareActivityProcedure object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>PHR Extract</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>PHR Extract</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePHRExtract(PHRExtract object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>PHR Update</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>PHR Update</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePHRUpdate(PHRUpdate object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounter Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounter Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncounterActivity(EncounterActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounter Plan Of Care</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounter Plan Of Care</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncounterPlanOfCare(EncounterPlanOfCare object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Intake Output Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Intake Output Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseIntakeOutputSection(IntakeOutputSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Pregnancy History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Pregnancy History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePregnancyHistorySection(PregnancyHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePregnancyObservation(PregnancyObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePatientContact(PatientContact object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Patient Contact Guardian</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Patient Contact Guardian</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePatientContactGuardian(PatientContactGuardian object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Patient Contact Participant</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Patient Contact Participant</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePatientContactParticipant(PatientContactParticipant object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Scanned Document</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Scanned Document</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseScannedDocument(ScannedDocument object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Scan Original Author</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Scan Original Author</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseScanOriginalAuthor(ScanOriginalAuthor object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Scanning Device</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Scanning Device</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseScanningDevice(ScanningDevice object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Scan Data Enterer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Scan Data Enterer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseScanDataEnterer(ScanDataEnterer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Discharge Diet</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Discharge Diet</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseDischargeDiet(DischargeDiet object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Physical</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Hospital Discharge Physical</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseHospitalDischargePhysical(HospitalDischargePhysical object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Family Medical History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Family Medical History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedFamilyMedicalHistorySection(CodedFamilyMedicalHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseFamilyHistoryOrganizer(FamilyHistoryOrganizer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseFamilyHistoryObservation(FamilyHistoryObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSocialHistoryObservation(SocialHistoryObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Reason For Referral Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Reason For Referral Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedReasonForReferralSection(CodedReasonForReferralSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coded Social History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coded Social History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCodedSocialHistorySection(CodedSocialHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedures And Interventions Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedures And Interventions Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProceduresAndInterventionsSection(ProceduresAndInterventionsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseIHERegistryDelegate(IHERegistryDelegate object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Act</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAct(Act object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSection(Section object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_ImmunizationsSection(org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSubstanceAdministration(SubstanceAdministration object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicationActivity(MedicationActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Act</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Act</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Act</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemAct(ProblemAct object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemSection(ProblemSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSeverityObservation(SeverityObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Status Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Status Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseStatusObservation(StatusObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Status Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Status Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_ProblemStatusObservation(org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Problem Health Status Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Problem Health Status Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProblemHealthStatusObservation(ProblemHealthStatusObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_Comment(org.openhealthtools.mdht.uml.cda.ccd.Comment object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Patient Instruction</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Patient Instruction</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePatientInstruction(PatientInstruction object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Supply</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Supply</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSupply(Supply object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Supply Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Supply Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSupplyActivity(SupplyActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Fulfillment Instruction</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Fulfillment Instruction</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseFulfillmentInstruction(FulfillmentInstruction object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_MedicationsSection(org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseReactionObservation(ReactionObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Alerts Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Alerts Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAlertsSection(AlertsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_VitalSignsSection(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_VitalSignsOrganizer(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_PayersSection(org.openhealthtools.mdht.uml.cda.ccd.PayersSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCoverageActivity(CoverageActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePolicyActivity(PolicyActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProceduresSection(ProceduresSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedure Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedure Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProcedureActivity(ProcedureActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_AdvanceDirectivesSection(org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_AdvanceDirectiveObservation(org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePlanOfCareSection(PlanOfCareSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseFamilyHistorySection(FamilyHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_SocialHistorySection(org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncountersSection(EncountersSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseMedicalEquipmentSection(MedicalEquipmentSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCDA_LanguageCommunication(org.openhealthtools.mdht.uml.cda.LanguageCommunication object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Performer1</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Performer1</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePerformer1(Performer1 object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePlanOfCareActivity(PlanOfCareActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Role</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseRole(Role object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseManufacturedProduct(ManufacturedProduct object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Product</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseProduct(Product object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Encounters Activity</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Encounters Activity</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseEncountersActivity(EncountersActivity object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Support</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Support</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSupport(Support object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Guardian</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Guardian</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseGuardian(Guardian object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSupportGuardian(SupportGuardian object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Participant1</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Participant1</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseParticipant1(Participant1 object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseSupportParticipant(SupportParticipant object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Author</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseDataEnterer(DataEnterer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_FamilyHistoryOrganizer(org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_FamilyHistoryObservation(org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_SocialHistoryObservation(org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseCCD_FunctionalStatusSection(org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	* @generated
	*/
	public T caseRegistryDelegate(RegistryDelegate object) {
		return null;
	}

	/**
	* Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	* <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	* @param object the target of the switch.
	* @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	* @see #doSwitch(org.eclipse.emf.ecore.EObject)
	* @generated
	*/
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // IHESwitch
