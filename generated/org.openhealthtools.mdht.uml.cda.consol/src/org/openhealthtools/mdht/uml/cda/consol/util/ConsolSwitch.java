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
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.Condition;
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.consol.CoveredParty;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.Immunization;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Medication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.consol.MedicationType;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.consol.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.consol.PayerEntity;
import org.openhealthtools.mdht.uml.cda.consol.PayerEntry;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PolicySubscriber;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.Result;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.Severity;
import org.openhealthtools.mdht.uml.cda.consol.StatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSign;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
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
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage
 * @generated
 */
public class ConsolSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsolSwitch() {
		if (modelPackage == null) {
			modelPackage = ConsolPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty()
					? defaultCase(theEObject)
					: doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConsolPackage.STATUS_OBSERVATION: {
				StatusObservation statusObservation = (StatusObservation) theEObject;
				T result = caseStatusObservation(statusObservation);
				if (result == null) {
					result = caseObservation(statusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(statusObservation);
				}
				if (result == null) {
					result = caseAct(statusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(statusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONDITION: {
				Condition condition = (Condition) theEObject;
				T result = caseCondition(condition);
				if (result == null) {
					result = caseCDA_Act(condition);
				}
				if (result == null) {
					result = caseClinicalStatement(condition);
				}
				if (result == null) {
					result = caseAct(condition);
				}
				if (result == null) {
					result = caseInfrastructureRoot(condition);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.EPISODE_OBSERVATION: {
				EpisodeObservation episodeObservation = (EpisodeObservation) theEObject;
				T result = caseEpisodeObservation(episodeObservation);
				if (result == null) {
					result = caseObservation(episodeObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(episodeObservation);
				}
				if (result == null) {
					result = caseAct(episodeObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(episodeObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONDITION_ENTRY: {
				ConditionEntry conditionEntry = (ConditionEntry) theEObject;
				T result = caseConditionEntry(conditionEntry);
				if (result == null) {
					result = caseObservation(conditionEntry);
				}
				if (result == null) {
					result = caseClinicalStatement(conditionEntry);
				}
				if (result == null) {
					result = caseAct(conditionEntry);
				}
				if (result == null) {
					result = caseInfrastructureRoot(conditionEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AGE_OBSERVATION: {
				AgeObservation ageObservation = (AgeObservation) theEObject;
				T result = caseAgeObservation(ageObservation);
				if (result == null) {
					result = caseObservation(ageObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(ageObservation);
				}
				if (result == null) {
					result = caseAct(ageObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(ageObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_STATUS_OBSERVATION: {
				ProblemStatusObservation problemStatusObservation = (ProblemStatusObservation) theEObject;
				T result = caseProblemStatusObservation(problemStatusObservation);
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
			case ConsolPackage.HEALTH_STATUS_OBSERVATION: {
				HealthStatusObservation healthStatusObservation = (HealthStatusObservation) theEObject;
				T result = caseHealthStatusObservation(healthStatusObservation);
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
			case ConsolPackage.SEVERITY: {
				Severity severity = (Severity) theEObject;
				T result = caseSeverity(severity);
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
			case ConsolPackage.COMMENT: {
				Comment comment = (Comment) theEObject;
				T result = caseComment(comment);
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
			case ConsolPackage.PROBLEM_LIST_SECTION: {
				ProblemListSection problemListSection = (ProblemListSection) theEObject;
				T result = caseProblemListSection(problemListSection);
				if (result == null) {
					result = caseProblemListNarrativeSection(problemListSection);
				}
				if (result == null) {
					result = caseSection(problemListSection);
				}
				if (result == null) {
					result = caseAct(problemListSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemListSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_LIST_NARRATIVE_SECTION: {
				ProblemListNarrativeSection problemListNarrativeSection = (ProblemListNarrativeSection) theEObject;
				T result = caseProblemListNarrativeSection(problemListNarrativeSection);
				if (result == null) {
					result = caseSection(problemListNarrativeSection);
				}
				if (result == null) {
					result = caseAct(problemListNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemListNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION: {
				DiagnosticResultsSection diagnosticResultsSection = (DiagnosticResultsSection) theEObject;
				T result = caseDiagnosticResultsSection(diagnosticResultsSection);
				if (result == null) {
					result = caseDiagnosticResultsNarrativeSection(diagnosticResultsSection);
				}
				if (result == null) {
					result = caseSection(diagnosticResultsSection);
				}
				if (result == null) {
					result = caseAct(diagnosticResultsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(diagnosticResultsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_RESULTS_NARRATIVE_SECTION: {
				DiagnosticResultsNarrativeSection diagnosticResultsNarrativeSection = (DiagnosticResultsNarrativeSection) theEObject;
				T result = caseDiagnosticResultsNarrativeSection(diagnosticResultsNarrativeSection);
				if (result == null) {
					result = caseSection(diagnosticResultsNarrativeSection);
				}
				if (result == null) {
					result = caseAct(diagnosticResultsNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(diagnosticResultsNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULT_ORGANIZER: {
				ResultOrganizer resultOrganizer = (ResultOrganizer) theEObject;
				T result = caseResultOrganizer(resultOrganizer);
				if (result == null) {
					result = caseOrganizer(resultOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(resultOrganizer);
				}
				if (result == null) {
					result = caseAct(resultOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULT: {
				Result result = (Result) theEObject;
				T theResult = caseResult(result);
				if (theResult == null) {
					theResult = caseObservation(result);
				}
				if (theResult == null) {
					theResult = caseClinicalStatement(result);
				}
				if (theResult == null) {
					theResult = caseAct(result);
				}
				if (theResult == null) {
					theResult = caseInfrastructureRoot(result);
				}
				if (theResult == null) {
					theResult = defaultCase(theEObject);
				}
				return theResult;
			}
			case ConsolPackage.EXTERNAL_REFERENCE: {
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
			case ConsolPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection) theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) {
					result = caseVitalSignsNarrativeSection(vitalSignsSection);
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
			case ConsolPackage.VITAL_SIGNS_NARRATIVE_SECTION: {
				VitalSignsNarrativeSection vitalSignsNarrativeSection = (VitalSignsNarrativeSection) theEObject;
				T result = caseVitalSignsNarrativeSection(vitalSignsNarrativeSection);
				if (result == null) {
					result = caseSection(vitalSignsNarrativeSection);
				}
				if (result == null) {
					result = caseAct(vitalSignsNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer) theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
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
			case ConsolPackage.VITAL_SIGN: {
				VitalSign vitalSign = (VitalSign) theEObject;
				T result = caseVitalSign(vitalSign);
				if (result == null) {
					result = caseResult(vitalSign);
				}
				if (result == null) {
					result = caseObservation(vitalSign);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSign);
				}
				if (result == null) {
					result = caseAct(vitalSign);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSign);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GENERAL_HEADER_CONSTRAINTS: {
				GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints) theEObject;
				T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
				if (result == null) {
					result = caseClinicalDocument(generalHeaderConstraints);
				}
				if (result == null) {
					result = caseAct(generalHeaderConstraints);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalHeaderConstraints);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_AWARENESS: {
				PatientAwareness patientAwareness = (PatientAwareness) theEObject;
				T result = casePatientAwareness(patientAwareness);
				if (result == null) {
					result = caseParticipant2(patientAwareness);
				}
				if (result == null) {
					result = caseParticipation(patientAwareness);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientAwareness);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION: {
				Medication medication = (Medication) theEObject;
				T result = caseMedication(medication);
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
			case ConsolPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: {
				MedicationSeriesNumberObservation medicationSeriesNumberObservation = (MedicationSeriesNumberObservation) theEObject;
				T result = caseMedicationSeriesNumberObservation(medicationSeriesNumberObservation);
				if (result == null) {
					result = caseObservation(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = caseAct(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationSeriesNumberObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_STATUS_OBSERVATION: {
				MedicationStatusObservation medicationStatusObservation = (MedicationStatusObservation) theEObject;
				T result = caseMedicationStatusObservation(medicationStatusObservation);
				if (result == null) {
					result = caseStatusObservation(medicationStatusObservation);
				}
				if (result == null) {
					result = caseObservation(medicationStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationStatusObservation);
				}
				if (result == null) {
					result = caseAct(medicationStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REACTION_OBSERVATION: {
				ReactionObservation reactionObservation = (ReactionObservation) theEObject;
				T result = caseReactionObservation(reactionObservation);
				if (result == null) {
					result = caseObservation(reactionObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(reactionObservation);
				}
				if (result == null) {
					result = caseAct(reactionObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reactionObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance) theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) {
					result = caseParticipantRole(productInstance);
				}
				if (result == null) {
					result = caseRole(productInstance);
				}
				if (result == null) {
					result = caseInfrastructureRoot(productInstance);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTERNAL_REFERENCE: {
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
			case ConsolPackage.PATIENT_MEDICAL_INSTRUCTIONS: {
				PatientMedicalInstructions patientMedicalInstructions = (PatientMedicalInstructions) theEObject;
				T result = casePatientMedicalInstructions(patientMedicalInstructions);
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
			case ConsolPackage.MEDICATION_TYPE: {
				MedicationType medicationType = (MedicationType) theEObject;
				T result = caseMedicationType(medicationType);
				if (result == null) {
					result = caseObservation(medicationType);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationType);
				}
				if (result == null) {
					result = caseAct(medicationType);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationType);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_ORDER_INFORMATION: {
				MedicationOrderInformation medicationOrderInformation = (MedicationOrderInformation) theEObject;
				T result = caseMedicationOrderInformation(medicationOrderInformation);
				if (result == null) {
					result = caseSupply(medicationOrderInformation);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationOrderInformation);
				}
				if (result == null) {
					result = caseAct(medicationOrderInformation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationOrderInformation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS: {
				MedicationFullfillmentInstructions medicationFullfillmentInstructions = (MedicationFullfillmentInstructions) theEObject;
				T result = caseMedicationFullfillmentInstructions(medicationFullfillmentInstructions);
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
			case ConsolPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection) theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) {
					result = caseMedicationsNarrativeSection(medicationsSection);
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
			case ConsolPackage.MEDICATIONS_NARRATIVE_SECTION: {
				MedicationsNarrativeSection medicationsNarrativeSection = (MedicationsNarrativeSection) theEObject;
				T result = caseMedicationsNarrativeSection(medicationsNarrativeSection);
				if (result == null) {
					result = caseSection(medicationsNarrativeSection);
				}
				if (result == null) {
					result = caseAct(medicationsNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_NORMAL_DOSE: {
				MedicationNormalDose medicationNormalDose = (MedicationNormalDose) theEObject;
				T result = caseMedicationNormalDose(medicationNormalDose);
				if (result == null) {
					result = caseMedication(medicationNormalDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medicationNormalDose);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationNormalDose);
				}
				if (result == null) {
					result = caseAct(medicationNormalDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationNormalDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_SPLIT_DOSE: {
				MedicationSplitDose medicationSplitDose = (MedicationSplitDose) theEObject;
				T result = caseMedicationSplitDose(medicationSplitDose);
				if (result == null) {
					result = caseMedication(medicationSplitDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medicationSplitDose);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationSplitDose);
				}
				if (result == null) {
					result = caseAct(medicationSplitDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationSplitDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_TAPERED_DOSE: {
				MedicationTaperedDose medicationTaperedDose = (MedicationTaperedDose) theEObject;
				T result = caseMedicationTaperedDose(medicationTaperedDose);
				if (result == null) {
					result = caseMedication(medicationTaperedDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medicationTaperedDose);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationTaperedDose);
				}
				if (result == null) {
					result = caseAct(medicationTaperedDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationTaperedDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_CONDITIONAL_DOSE: {
				MedicationConditionalDose medicationConditionalDose = (MedicationConditionalDose) theEObject;
				T result = caseMedicationConditionalDose(medicationConditionalDose);
				if (result == null) {
					result = caseMedication(medicationConditionalDose);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medicationConditionalDose);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationConditionalDose);
				}
				if (result == null) {
					result = caseAct(medicationConditionalDose);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationConditionalDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_COMBINATION_MEDICATION: {
				MedicationCombinationMedication medicationCombinationMedication = (MedicationCombinationMedication) theEObject;
				T result = caseMedicationCombinationMedication(medicationCombinationMedication);
				if (result == null) {
					result = caseMedication(medicationCombinationMedication);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medicationCombinationMedication);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationCombinationMedication);
				}
				if (result == null) {
					result = caseAct(medicationCombinationMedication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationCombinationMedication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_INFORMATION: {
				MedicationInformation medicationInformation = (MedicationInformation) theEObject;
				T result = caseMedicationInformation(medicationInformation);
				if (result == null) {
					result = caseManufacturedProduct(medicationInformation);
				}
				if (result == null) {
					result = caseRole(medicationInformation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationInformation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization) theEObject;
				T result = caseImmunization(immunization);
				if (result == null) {
					result = caseMedication(immunization);
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
			case ConsolPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection) theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) {
					result = caseImmunizationsNarrativeSection(immunizationsSection);
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
			case ConsolPackage.IMMUNIZATIONS_NARRATIVE_SECTION: {
				ImmunizationsNarrativeSection immunizationsNarrativeSection = (ImmunizationsNarrativeSection) theEObject;
				T result = caseImmunizationsNarrativeSection(immunizationsNarrativeSection);
				if (result == null) {
					result = caseSection(immunizationsNarrativeSection);
				}
				if (result == null) {
					result = caseAct(immunizationsNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY: {
				ProcedureActivity procedureActivity = (ProcedureActivity) theEObject;
				T result = caseProcedureActivity(procedureActivity);
				if (result == null) {
					result = caseClinicalStatement(procedureActivity);
				}
				if (result == null) {
					result = caseAct(procedureActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation) theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) {
					result = caseParticipant2(encounterLocation);
				}
				if (result == null) {
					result = caseParticipation(encounterLocation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterLocation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SURGERIES_SECTION: {
				SurgeriesSection surgeriesSection = (SurgeriesSection) theEObject;
				T result = caseSurgeriesSection(surgeriesSection);
				if (result == null) {
					result = caseSurgeriesNarrativeSection(surgeriesSection);
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
			case ConsolPackage.SURGERIES_NARRATIVE_SECTION: {
				SurgeriesNarrativeSection surgeriesNarrativeSection = (SurgeriesNarrativeSection) theEObject;
				T result = caseSurgeriesNarrativeSection(surgeriesNarrativeSection);
				if (result == null) {
					result = caseSection(surgeriesNarrativeSection);
				}
				if (result == null) {
					result = caseAct(surgeriesNarrativeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(surgeriesNarrativeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure) theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) {
					result = caseProcedure(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseProcedureActivity(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseAct(procedureActivityProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT: {
				ProcedureActivityAct procedureActivityAct = (ProcedureActivityAct) theEObject;
				T result = caseProcedureActivityAct(procedureActivityAct);
				if (result == null) {
					result = caseCDA_Act(procedureActivityAct);
				}
				if (result == null) {
					result = caseProcedureActivity(procedureActivityAct);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityAct);
				}
				if (result == null) {
					result = caseAct(procedureActivityAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION: {
				ProcedureActivityObservation procedureActivityObservation = (ProcedureActivityObservation) theEObject;
				T result = caseProcedureActivityObservation(procedureActivityObservation);
				if (result == null) {
					result = caseObservation(procedureActivityObservation);
				}
				if (result == null) {
					result = caseProcedureActivity(procedureActivityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityObservation);
				}
				if (result == null) {
					result = caseAct(procedureActivityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection) theEObject;
				T result = casePayersSection(payersSection);
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
			case ConsolPackage.INSURANCE_PROVIDER: {
				InsuranceProvider insuranceProvider = (InsuranceProvider) theEObject;
				T result = caseInsuranceProvider(insuranceProvider);
				if (result == null) {
					result = caseCDA_Act(insuranceProvider);
				}
				if (result == null) {
					result = caseClinicalStatement(insuranceProvider);
				}
				if (result == null) {
					result = caseAct(insuranceProvider);
				}
				if (result == null) {
					result = caseInfrastructureRoot(insuranceProvider);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PAYER_ENTRY: {
				PayerEntry payerEntry = (PayerEntry) theEObject;
				T result = casePayerEntry(payerEntry);
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
			case ConsolPackage.PAYER_ENTITY: {
				PayerEntity payerEntity = (PayerEntity) theEObject;
				T result = casePayerEntity(payerEntity);
				if (result == null) {
					result = caseAssignedEntity(payerEntity);
				}
				if (result == null) {
					result = caseRole(payerEntity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(payerEntity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COVERED_PARTY: {
				CoveredParty coveredParty = (CoveredParty) theEObject;
				T result = caseCoveredParty(coveredParty);
				if (result == null) {
					result = caseParticipantRole(coveredParty);
				}
				if (result == null) {
					result = caseRole(coveredParty);
				}
				if (result == null) {
					result = caseInfrastructureRoot(coveredParty);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POLICY_SUBSCRIBER: {
				PolicySubscriber policySubscriber = (PolicySubscriber) theEObject;
				T result = casePolicySubscriber(policySubscriber);
				if (result == null) {
					result = caseParticipantRole(policySubscriber);
				}
				if (result == null) {
					result = caseRole(policySubscriber);
				}
				if (result == null) {
					result = caseInfrastructureRoot(policySubscriber);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONSOL_REGISTRY_DELEGATE: {
				ConsolRegistryDelegate consolRegistryDelegate = (ConsolRegistryDelegate) theEObject;
				T result = caseConsolRegistryDelegate(consolRegistryDelegate);
				if (result == null) {
					result = caseRegistryDelegate(consolRegistryDelegate);
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
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeObservation(EpisodeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEntry(ConditionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeObservation(AgeObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem List Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemListSection(ProblemListSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem List Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem List Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemListNarrativeSection(ProblemListNarrativeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticResultsSection(DiagnosticResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Results Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Results Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticResultsNarrativeSection(DiagnosticResultsNarrativeSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsNarrativeSection(VitalSignsNarrativeSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSign(VitalSign object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Awareness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientAwareness(PatientAwareness object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Series Number Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSeriesNumberObservation(MedicationSeriesNumberObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatusObservation(MedicationStatusObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationType(MedicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Order Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Order Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationOrderInformation(MedicationOrderInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medications Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsNarrativeSection(MedicationsNarrativeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Normal Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationNormalDose(MedicationNormalDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Split Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSplitDose(MedicationSplitDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Tapered Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationTaperedDose(MedicationTaperedDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Conditional Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationConditionalDose(MedicationConditionalDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Combination Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationCombinationMedication(MedicationCombinationMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformation(MedicationInformation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsNarrativeSection(ImmunizationsNarrativeSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocation(EncounterLocation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Surgeries Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgeries Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgeriesNarrativeSection(SurgeriesNarrativeSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceProvider(InsuranceProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payer Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayerEntity(PayerEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoveredParty(CoveredParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicySubscriber(PolicySubscriber object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityAct(ProcedureActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityObservation(ProcedureActivityObservation object) {
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
	public T caseConsolRegistryDelegate(ConsolRegistryDelegate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRole(ParticipantRole object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedEntity(AssignedEntity object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} // ConsolSwitch
