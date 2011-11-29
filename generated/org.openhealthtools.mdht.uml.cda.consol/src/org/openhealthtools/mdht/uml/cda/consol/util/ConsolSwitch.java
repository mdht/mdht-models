/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;

import org.openhealthtools.mdht.uml.cda.consol.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
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
			case ConsolPackage.ALLERGY_PROBLEM_ACT: {
				AllergyProblemAct allergyProblemAct = (AllergyProblemAct) theEObject;
				T result = caseAllergyProblemAct(allergyProblemAct);
				if (result == null) {
					result = caseCDA_Act(allergyProblemAct);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyProblemAct);
				}
				if (result == null) {
					result = caseAct(allergyProblemAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyProblemAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION: {
				AllergyObservation allergyObservation = (AllergyObservation) theEObject;
				T result = caseAllergyObservation(allergyObservation);
				if (result == null) {
					result = caseObservation(allergyObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyObservation);
				}
				if (result == null) {
					result = caseAct(allergyObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyObservation);
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
			case ConsolPackage.SEVERITY_OBSERVATION: {
				SeverityObservation severityObservation = (SeverityObservation) theEObject;
				T result = caseSeverityObservation(severityObservation);
				if (result == null) {
					result = caseObservation(severityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(severityObservation);
				}
				if (result == null) {
					result = caseAct(severityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(severityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_STATUS_OBSERVATION: {
				AllergyStatusObservation allergyStatusObservation = (AllergyStatusObservation) theEObject;
				T result = caseAllergyStatusObservation(allergyStatusObservation);
				if (result == null) {
					result = caseObservation(allergyStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyStatusObservation);
				}
				if (result == null) {
					result = caseAct(allergyStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyStatusObservation);
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
			case ConsolPackage.MEDICATION_ACTIVITY: {
				MedicationActivity medicationActivity = (MedicationActivity) theEObject;
				T result = caseMedicationActivity(medicationActivity);
				if (result == null) {
					result = caseSubstanceAdministration(medicationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationActivity);
				}
				if (result == null) {
					result = caseAct(medicationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY: {
				NonMedicinalSupplyActivity nonMedicinalSupplyActivity = (NonMedicinalSupplyActivity) theEObject;
				T result = caseNonMedicinalSupplyActivity(nonMedicinalSupplyActivity);
				if (result == null) {
					result = caseSupply(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = caseAct(nonMedicinalSupplyActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nonMedicinalSupplyActivity);
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
			case ConsolPackage.INSTRUCTIONS: {
				Instructions instructions = (Instructions) theEObject;
				T result = caseInstructions(instructions);
				if (result == null) {
					result = caseCDA_Act(instructions);
				}
				if (result == null) {
					result = caseClinicalStatement(instructions);
				}
				if (result == null) {
					result = caseAct(instructions);
				}
				if (result == null) {
					result = caseInfrastructureRoot(instructions);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INDICATION: {
				Indication indication = (Indication) theEObject;
				T result = caseIndication(indication);
				if (result == null) {
					result = caseObservation(indication);
				}
				if (result == null) {
					result = caseClinicalStatement(indication);
				}
				if (result == null) {
					result = caseAct(indication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(indication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_DISPENSE: {
				MedicationDispense medicationDispense = (MedicationDispense) theEObject;
				T result = caseMedicationDispense(medicationDispense);
				if (result == null) {
					result = caseSupply(medicationDispense);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationDispense);
				}
				if (result == null) {
					result = caseAct(medicationDispense);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationDispense);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DRUG_VEHICLE: {
				DrugVehicle drugVehicle = (DrugVehicle) theEObject;
				T result = caseDrugVehicle(drugVehicle);
				if (result == null) {
					result = caseParticipantRole(drugVehicle);
				}
				if (result == null) {
					result = caseRole(drugVehicle);
				}
				if (result == null) {
					result = caseInfrastructureRoot(drugVehicle);
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
			case ConsolPackage.PROBLEM_CONCERN_ACT: {
				ProblemConcernAct problemConcernAct = (ProblemConcernAct) theEObject;
				T result = caseProblemConcernAct(problemConcernAct);
				if (result == null) {
					result = caseCDA_Act(problemConcernAct);
				}
				if (result == null) {
					result = caseClinicalStatement(problemConcernAct);
				}
				if (result == null) {
					result = caseAct(problemConcernAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemConcernAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_OBSERVATION: {
				ProblemObservation problemObservation = (ProblemObservation) theEObject;
				T result = caseProblemObservation(problemObservation);
				if (result == null) {
					result = caseObservation(problemObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(problemObservation);
				}
				if (result == null) {
					result = caseAct(problemObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_STATUS: {
				ProblemStatus problemStatus = (ProblemStatus) theEObject;
				T result = caseProblemStatus(problemStatus);
				if (result == null) {
					result = caseObservation(problemStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(problemStatus);
				}
				if (result == null) {
					result = caseAct(problemStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT: {
				ContinuityOfCareDocument continuityOfCareDocument = (ContinuityOfCareDocument) theEObject;
				T result = caseContinuityOfCareDocument(continuityOfCareDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(continuityOfCareDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(continuityOfCareDocument);
				}
				if (result == null) {
					result = caseAct(continuityOfCareDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(continuityOfCareDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL: {
				AdvanceDirectivesSectionEntriesOptional advanceDirectivesSectionEntriesOptional = (AdvanceDirectivesSectionEntriesOptional) theEObject;
				T result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSectionEntriesOptional);
				if (result == null) {
					result = caseSection(advanceDirectivesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(advanceDirectivesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectivesSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION: {
				AllergiesSection allergiesSection = (AllergiesSection) theEObject;
				T result = caseAllergiesSection(allergiesSection);
				if (result == null) {
					result = caseAllergiesSectionEntriesOptional(allergiesSection);
				}
				if (result == null) {
					result = caseSection(allergiesSection);
				}
				if (result == null) {
					result = caseAct(allergiesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL: {
				AllergiesSectionEntriesOptional allergiesSectionEntriesOptional = (AllergiesSectionEntriesOptional) theEObject;
				T result = caseAllergiesSectionEntriesOptional(allergiesSectionEntriesOptional);
				if (result == null) {
					result = caseSection(allergiesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(allergiesSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL: {
				EncountersSectionEntriesOptional encountersSectionEntriesOptional = (EncountersSectionEntriesOptional) theEObject;
				T result = caseEncountersSectionEntriesOptional(encountersSectionEntriesOptional);
				if (result == null) {
					result = caseSection(encountersSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(encountersSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL: {
				ImmunizationsSectionEntriesOptional immunizationsSectionEntriesOptional = (ImmunizationsSectionEntriesOptional) theEObject;
				T result = caseImmunizationsSectionEntriesOptional(immunizationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(immunizationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(immunizationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsSectionEntriesOptional);
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
			case ConsolPackage.COVERAGE_ACTIVITY: {
				CoverageActivity coverageActivity = (CoverageActivity) theEObject;
				T result = caseCoverageActivity(coverageActivity);
				if (result == null) {
					result = caseCDA_Act(coverageActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(coverageActivity);
				}
				if (result == null) {
					result = caseAct(coverageActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(coverageActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POLICY_ACTIVITY: {
				PolicyActivity policyActivity = (PolicyActivity) theEObject;
				T result = casePolicyActivity(policyActivity);
				if (result == null) {
					result = caseCDA_Act(policyActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(policyActivity);
				}
				if (result == null) {
					result = caseAct(policyActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(policyActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AUTHORIZATION_ACTIVITY: {
				AuthorizationActivity authorizationActivity = (AuthorizationActivity) theEObject;
				T result = caseAuthorizationActivity(authorizationActivity);
				if (result == null) {
					result = caseCDA_Act(authorizationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(authorizationActivity);
				}
				if (result == null) {
					result = caseAct(authorizationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(authorizationActivity);
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
					result = caseMedicationsSectionEntriesOptional(medicationsSection);
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
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				MedicationsSectionEntriesOptional medicationsSectionEntriesOptional = (MedicationsSectionEntriesOptional) theEObject;
				T result = caseMedicationsSectionEntriesOptional(medicationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(medicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(medicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_SECTION: {
				PlanOfCareSection planOfCareSection = (PlanOfCareSection) theEObject;
				T result = casePlanOfCareSection(planOfCareSection);
				if (result == null) {
					result = caseSection(planOfCareSection);
				}
				if (result == null) {
					result = caseAct(planOfCareSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT: {
				PlanOfCareActivityAct planOfCareActivityAct = (PlanOfCareActivityAct) theEObject;
				T result = casePlanOfCareActivityAct(planOfCareActivityAct);
				if (result == null) {
					result = caseCDA_Act(planOfCareActivityAct);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityAct);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: {
				PlanOfCareActivityEncounter planOfCareActivityEncounter = (PlanOfCareActivityEncounter) theEObject;
				T result = casePlanOfCareActivityEncounter(planOfCareActivityEncounter);
				if (result == null) {
					result = caseCDA_Encounter(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: {
				PlanOfCareActivityObservation planOfCareActivityObservation = (PlanOfCareActivityObservation) theEObject;
				T result = casePlanOfCareActivityObservation(planOfCareActivityObservation);
				if (result == null) {
					result = caseObservation(planOfCareActivityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityObservation);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				PlanOfCareActivityProcedure planOfCareActivityProcedure = (PlanOfCareActivityProcedure) theEObject;
				T result = casePlanOfCareActivityProcedure(planOfCareActivityProcedure);
				if (result == null) {
					result = caseCDA_Procedure(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseAct(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration = (PlanOfCareActivitySubstanceAdministration) theEObject;
				T result = casePlanOfCareActivitySubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) {
					result = caseSubstanceAdministration(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = caseAct(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: {
				PlanOfCareActivitySupply planOfCareActivitySupply = (PlanOfCareActivitySupply) theEObject;
				T result = casePlanOfCareActivitySupply(planOfCareActivitySupply);
				if (result == null) {
					result = caseSupply(planOfCareActivitySupply);
				}
				if (result == null) {
					result = caseClinicalStatement(planOfCareActivitySupply);
				}
				if (result == null) {
					result = caseAct(planOfCareActivitySupply);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfCareActivitySupply);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION: {
				ProceduresSection proceduresSection = (ProceduresSection) theEObject;
				T result = caseProceduresSection(proceduresSection);
				if (result == null) {
					result = caseProceduresSectionEntriesOptional(proceduresSection);
				}
				if (result == null) {
					result = caseSection(proceduresSection);
				}
				if (result == null) {
					result = caseAct(proceduresSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL: {
				ProceduresSectionEntriesOptional proceduresSectionEntriesOptional = (ProceduresSectionEntriesOptional) theEObject;
				T result = caseProceduresSectionEntriesOptional(proceduresSectionEntriesOptional);
				if (result == null) {
					result = caseSection(proceduresSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(proceduresSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSectionEntriesOptional);
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
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure) theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) {
					result = caseCDA_Procedure(procedureActivityProcedure);
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
			case ConsolPackage.PROCEDURE_ACIVITY_OBSERVATION: {
				ProcedureAcivityObservation procedureAcivityObservation = (ProcedureAcivityObservation) theEObject;
				T result = caseProcedureAcivityObservation(procedureAcivityObservation);
				if (result == null) {
					result = caseObservation(procedureAcivityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureAcivityObservation);
				}
				if (result == null) {
					result = caseAct(procedureAcivityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureAcivityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL: {
				VitalSignsSectionEntriesOptional vitalSignsSectionEntriesOptional = (VitalSignsSectionEntriesOptional) theEObject;
				T result = caseVitalSignsSectionEntriesOptional(vitalSignsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(vitalSignsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(vitalSignsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_SECTION: {
				FamilyHistorySection familyHistorySection = (FamilyHistorySection) theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
				if (result == null) {
					result = caseSection(familyHistorySection);
				}
				if (result == null) {
					result = caseAct(familyHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER: {
				FamilyHistoryOrganizer familyHistoryOrganizer = (FamilyHistoryOrganizer) theEObject;
				T result = caseFamilyHistoryOrganizer(familyHistoryOrganizer);
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
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION: {
				FamilyHistoryObservation familyHistoryObservation = (FamilyHistoryObservation) theEObject;
				T result = caseFamilyHistoryObservation(familyHistoryObservation);
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
			case ConsolPackage.FAMILY_HISTORY_DEATH_OBSERVATION: {
				FamilyHistoryDeathObservation familyHistoryDeathObservation = (FamilyHistoryDeathObservation) theEObject;
				T result = caseFamilyHistoryDeathObservation(familyHistoryDeathObservation);
				if (result == null) {
					result = caseObservation(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = caseAct(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryDeathObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection) theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
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
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION: {
				SocialHistoryObservation socialHistoryObservation = (SocialHistoryObservation) theEObject;
				T result = caseSocialHistoryObservation(socialHistoryObservation);
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
			case ConsolPackage.PREGNANCY_OBSERVATION: {
				PregnancyObservation pregnancyObservation = (PregnancyObservation) theEObject;
				T result = casePregnancyObservation(pregnancyObservation);
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
			case ConsolPackage.RESULTS_SECTION: {
				ResultsSection resultsSection = (ResultsSection) theEObject;
				T result = caseResultsSection(resultsSection);
				if (result == null) {
					result = caseResultsSectionEntriesOptional(resultsSection);
				}
				if (result == null) {
					result = caseSection(resultsSection);
				}
				if (result == null) {
					result = caseAct(resultsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL: {
				ResultsSectionEntriesOptional resultsSectionEntriesOptional = (ResultsSectionEntriesOptional) theEObject;
				T result = caseResultsSectionEntriesOptional(resultsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(resultsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(resultsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSectionEntriesOptional);
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
			case ConsolPackage.RESULT_OBSERVATION: {
				ResultObservation resultObservation = (ResultObservation) theEObject;
				T result = caseResultObservation(resultObservation);
				if (result == null) {
					result = caseObservation(resultObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(resultObservation);
				}
				if (result == null) {
					result = caseAct(resultObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION: {
				MedicalEquipmentSection medicalEquipmentSection = (MedicalEquipmentSection) theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) {
					result = caseSection(medicalEquipmentSection);
				}
				if (result == null) {
					result = caseAct(medicalEquipmentSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalEquipmentSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION: {
				FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection) theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
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
			case ConsolPackage.PROBLEM_SECTION: {
				ProblemSection problemSection = (ProblemSection) theEObject;
				T result = caseProblemSection(problemSection);
				if (result == null) {
					result = caseProblemSectionEntriesOptional(problemSection);
				}
				if (result == null) {
					result = caseSection(problemSection);
				}
				if (result == null) {
					result = caseAct(problemSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL: {
				ProblemSectionEntriesOptional problemSectionEntriesOptional = (ProblemSectionEntriesOptional) theEObject;
				T result = caseProblemSectionEntriesOptional(problemSectionEntriesOptional);
				if (result == null) {
					result = caseSection(problemSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(problemSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_STATUS_OBSERVATION: {
				SocialHistoryStatusObservation socialHistoryStatusObservation = (SocialHistoryStatusObservation) theEObject;
				T result = caseSocialHistoryStatusObservation(socialHistoryStatusObservation);
				if (result == null) {
					result = caseObservation(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = caseAct(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PURPOSE_SECTION: {
				PurposeSection purposeSection = (PurposeSection) theEObject;
				T result = casePurposeSection(purposeSection);
				if (result == null) {
					result = caseSection(purposeSection);
				}
				if (result == null) {
					result = caseAct(purposeSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(purposeSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PURPOSE_ACTIVITY: {
				PurposeActivity purposeActivity = (PurposeActivity) theEObject;
				T result = casePurposeActivity(purposeActivity);
				if (result == null) {
					result = caseCDA_Act(purposeActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(purposeActivity);
				}
				if (result == null) {
					result = caseAct(purposeActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(purposeActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection) theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) {
					result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSection);
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
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION: {
				AdvanceDirectiveObservation advanceDirectiveObservation = (AdvanceDirectiveObservation) theEObject;
				T result = caseAdvanceDirectiveObservation(advanceDirectiveObservation);
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
			case ConsolPackage.ADVANCE_DIRECTIVE_VERIFICATION: {
				AdvanceDirectiveVerification advanceDirectiveVerification = (AdvanceDirectiveVerification) theEObject;
				T result = caseAdvanceDirectiveVerification(advanceDirectiveVerification);
				if (result == null) {
					result = caseParticipant2(advanceDirectiveVerification);
				}
				if (result == null) {
					result = caseParticipation(advanceDirectiveVerification);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveVerification);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: {
				AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation = (AdvanceDirectiveStatusObservation) theEObject;
				T result = caseAdvanceDirectiveStatusObservation(advanceDirectiveStatusObservation);
				if (result == null) {
					result = caseObservation(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = caseAct(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_REFERENCE: {
				AdvanceDirectiveReference advanceDirectiveReference = (AdvanceDirectiveReference) theEObject;
				T result = caseAdvanceDirectiveReference(advanceDirectiveReference);
				if (result == null) {
					result = caseReference(advanceDirectiveReference);
				}
				if (result == null) {
					result = caseActRelationship(advanceDirectiveReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION: {
				EncountersSection encountersSection = (EncountersSection) theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) {
					result = caseEncountersSectionEntriesOptional(encountersSection);
				}
				if (result == null) {
					result = caseSection(encountersSection);
				}
				if (result == null) {
					result = caseAct(encountersSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_ACTIVITES: {
				EncountersActivites encountersActivites = (EncountersActivites) theEObject;
				T result = caseEncountersActivites(encountersActivites);
				if (result == null) {
					result = caseCDA_Encounter(encountersActivites);
				}
				if (result == null) {
					result = caseClinicalStatement(encountersActivites);
				}
				if (result == null) {
					result = caseAct(encountersActivites);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersActivites);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SERVICE_DELIVERY_LOCATION: {
				ServiceDeliveryLocation serviceDeliveryLocation = (ServiceDeliveryLocation) theEObject;
				T result = caseServiceDeliveryLocation(serviceDeliveryLocation);
				if (result == null) {
					result = caseParticipant2(serviceDeliveryLocation);
				}
				if (result == null) {
					result = caseParticipation(serviceDeliveryLocation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(serviceDeliveryLocation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER: {
				Encounter encounter = (Encounter) theEObject;
				T result = caseEncounter(encounter);
				if (result == null) {
					result = caseCDA_Encounter(encounter);
				}
				if (result == null) {
					result = caseClinicalStatement(encounter);
				}
				if (result == null) {
					result = caseAct(encounter);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounter);
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
					result = caseImmunizationsSectionEntriesOptional(immunizationsSection);
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
			case ConsolPackage.IMMUNIZATION_ACTIVITY: {
				ImmunizationActivity immunizationActivity = (ImmunizationActivity) theEObject;
				T result = caseImmunizationActivity(immunizationActivity);
				if (result == null) {
					result = caseSubstanceAdministration(immunizationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(immunizationActivity);
				}
				if (result == null) {
					result = caseAct(immunizationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_REFUSAL_REASON: {
				ImmunizationRefusalReason immunizationRefusalReason = (ImmunizationRefusalReason) theEObject;
				T result = caseImmunizationRefusalReason(immunizationRefusalReason);
				if (result == null) {
					result = caseObservation(immunizationRefusalReason);
				}
				if (result == null) {
					result = caseClinicalStatement(immunizationRefusalReason);
				}
				if (result == null) {
					result = caseAct(immunizationRefusalReason);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationRefusalReason);
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
			case ConsolPackage.PROCEDURE: {
				Procedure procedure = (Procedure) theEObject;
				T result = caseProcedure(procedure);
				if (result == null) {
					result = caseCDA_Procedure(procedure);
				}
				if (result == null) {
					result = caseClinicalStatement(procedure);
				}
				if (result == null) {
					result = caseAct(procedure);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREGNANCY_HISTORY_SECTION: {
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
			case ConsolPackage.SUPPORT: {
				Support support = (Support) theEObject;
				T result = caseSupport(support);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection) theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) {
					result = caseVitalSignsSectionEntriesOptional(vitalSignsSection);
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
			case ConsolPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer) theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
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
			case ConsolPackage.VITAL_SIGN_OBSERVATION: {
				VitalSignObservation vitalSignObservation = (VitalSignObservation) theEObject;
				T result = caseVitalSignObservation(vitalSignObservation);
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
			case ConsolPackage.DIAGNOSTIC_RESULTS_SECTION: {
				DiagnosticResultsSection diagnosticResultsSection = (DiagnosticResultsSection) theEObject;
				T result = caseDiagnosticResultsSection(diagnosticResultsSection);
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
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
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
			case ConsolPackage.CHIEF_COMPLAINT_SECTION: {
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
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION: {
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
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS: {
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
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
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
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION: {
				HospitalDischargeDiagnosisSection hospitalDischargeDiagnosisSection = (HospitalDischargeDiagnosisSection) theEObject;
				T result = caseHospitalDischargeDiagnosisSection(hospitalDischargeDiagnosisSection);
				if (result == null) {
					result = caseSection(hospitalDischargeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional = (HospitalAdmissionMedicationsSectionEntriesOptional) theEObject;
				T result = caseHospitalAdmissionMedicationsSectionEntriesOptional(hospitalAdmissionMedicationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(hospitalAdmissionMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(hospitalAdmissionMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalAdmissionMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
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
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION: {
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
			case ConsolPackage.PHYSICAL_EXAM_SECTION: {
				PhysicalExamSection physicalExamSection = (PhysicalExamSection) theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
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
			case ConsolPackage.GENERAL_STATUS_SECTION: {
				GeneralStatusSection generalStatusSection = (GeneralStatusSection) theEObject;
				T result = caseGeneralStatusSection(generalStatusSection);
				if (result == null) {
					result = caseSection(generalStatusSection);
				}
				if (result == null) {
					result = caseAct(generalStatusSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(generalStatusSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION: {
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
			case ConsolPackage.INTEGUMENTARY_SYSTEM_SECTION: {
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
			case ConsolPackage.HEAD_SECTION: {
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
			case ConsolPackage.EYES_SECTION: {
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
			case ConsolPackage.EARS_NOSE_MOUTH_THROAT_SECTION: {
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
			case ConsolPackage.EARS_SECTION: {
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
			case ConsolPackage.NOSE_SECTION: {
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
			case ConsolPackage.MOUTH_THROAT_TEETH_SECTION: {
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
			case ConsolPackage.NECK_SECTION: {
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
			case ConsolPackage.ENDOCRINE_SYSTEM_SECTION: {
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
			case ConsolPackage.THORAX_LUNGS_SECTION: {
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
			case ConsolPackage.CHEST_WALL_SECTION: {
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
			case ConsolPackage.BREAST_SECTION: {
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
			case ConsolPackage.HEART_SECTION: {
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
			case ConsolPackage.RESPIRATORY_SYSTEM_SECTION: {
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
			case ConsolPackage.ABDOMEN_SECTION: {
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
			case ConsolPackage.LYMPHATIC_SECTION: {
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
			case ConsolPackage.VESSELS_SECTION: {
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
			case ConsolPackage.MUSCULOSKELETAL_SYSTEM_SECTION: {
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
			case ConsolPackage.NEUROLOGIC_SYSTEM_SECTION: {
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
			case ConsolPackage.GENITALIA_SECTION: {
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
			case ConsolPackage.RECTUM_SECTION: {
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
			case ConsolPackage.EXTREMITIES_SECTION: {
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
			case ConsolPackage.REVIEW_OF_SYSTEMS_SECTION: {
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
			case ConsolPackage.HOSPITAL_COURSE_SECTION: {
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
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION: {
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
			case ConsolPackage.LANGUAGE_SPOKEN: {
				LanguageSpoken languageSpoken = (LanguageSpoken) theEObject;
				T result = caseLanguageSpoken(languageSpoken);
				if (result == null) {
					result = caseLanguageCommunication(languageSpoken);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTHCARE_PROVIDER: {
				HealthcareProvider healthcareProvider = (HealthcareProvider) theEObject;
				T result = caseHealthcareProvider(healthcareProvider);
				if (result == null) {
					result = casePerformer1(healthcareProvider);
				}
				if (result == null) {
					result = caseParticipation(healthcareProvider);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthcareProvider);
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
					result = caseMedicationActivity(medicationNormalDose);
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
					result = caseMedicationActivity(medicationSplitDose);
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
					result = caseMedicationActivity(medicationTaperedDose);
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
					result = caseMedicationActivity(medicationConditionalDose);
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
					result = caseMedicationActivity(medicationCombinationMedication);
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
			case ConsolPackage.SUPPORT_GUARDIAN: {
				SupportGuardian supportGuardian = (SupportGuardian) theEObject;
				T result = caseSupportGuardian(supportGuardian);
				if (result == null) {
					result = caseSupport(supportGuardian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUPPORT_PARTICIPANT: {
				SupportParticipant supportParticipant = (SupportParticipant) theEObject;
				T result = caseSupportParticipant(supportParticipant);
				if (result == null) {
					result = caseSupport(supportParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT: {
				UnstructuredDocument unstructuredDocument = (UnstructuredDocument) theEObject;
				T result = caseUnstructuredDocument(unstructuredDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(unstructuredDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(unstructuredDocument);
				}
				if (result == null) {
					result = caseAct(unstructuredDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(unstructuredDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SCAN_ORIGINAL_AUTHOR: {
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
			case ConsolPackage.SCANNING_DEVICE: {
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
			case ConsolPackage.SCAN_DATA_ENTERER: {
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
			case ConsolPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT: {
				UnstructuredOrScannedDocument unstructuredOrScannedDocument = (UnstructuredOrScannedDocument) theEObject;
				T result = caseUnstructuredOrScannedDocument(unstructuredOrScannedDocument);
				if (result == null) {
					result = caseGeneralHeaderConstraints(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = caseAct(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REFERRAL_SUMMARY: {
				ReferralSummary referralSummary = (ReferralSummary) theEObject;
				T result = caseReferralSummary(referralSummary);
				if (result == null) {
					result = caseGeneralHeaderConstraints(referralSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(referralSummary);
				}
				if (result == null) {
					result = caseAct(referralSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(referralSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_SUMMARY: {
				DischargeSummary dischargeSummary = (DischargeSummary) theEObject;
				T result = caseDischargeSummary(dischargeSummary);
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
			case ConsolPackage.DISCHARGE_DIET_SECTION: {
				DischargeDietSection dischargeDietSection = (DischargeDietSection) theEObject;
				T result = caseDischargeDietSection(dischargeDietSection);
				if (result == null) {
					result = caseSection(dischargeDietSection);
				}
				if (result == null) {
					result = caseAct(dischargeDietSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeDietSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION: {
				PreconditionForSubstanceAdministration preconditionForSubstanceAdministration = (PreconditionForSubstanceAdministration) theEObject;
				T result = casePreconditionForSubstanceAdministration(preconditionForSubstanceAdministration);
				if (result == null) {
					result = casePrecondition(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = caseActRelationship(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION: {
				ImmunizationMedicationInformation immunizationMedicationInformation = (ImmunizationMedicationInformation) theEObject;
				T result = caseImmunizationMedicationInformation(immunizationMedicationInformation);
				if (result == null) {
					result = caseManufacturedProduct(immunizationMedicationInformation);
				}
				if (result == null) {
					result = caseRole(immunizationMedicationInformation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationMedicationInformation);
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
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Problem Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyProblemAct(AllergyProblemAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservation(AllergyObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyStatusObservation(AllergyStatusObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonMedicinalSupplyActivity(NonMedicinalSupplyActivity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructions(Instructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndication(Indication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense(MedicationDispense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugVehicle(DrugVehicle object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemConcernAct(ProblemConcernAct object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemStatus(ProblemStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument(ContinuityOfCareDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSectionEntriesOptional(AdvanceDirectivesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSection(AllergiesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSectionEntriesOptional(AllergiesSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSectionEntriesOptional(ImmunizationsSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationActivity(AuthorizationActivity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySupply(PlanOfCareActivitySupply object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Acivity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Acivity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureAcivityObservation(ProcedureAcivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Family History Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Death Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryDeathObservation(FamilyHistoryDeathObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryStatusObservation(SocialHistoryStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeSection(PurposeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeActivity(PurposeActivity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveVerification(AdvanceDirectiveVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveReference(AdvanceDirectiveReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Activites</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Activites</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersActivites(EncountersActivites object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Delivery Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Delivery Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDeliveryLocation(ServiceDeliveryLocation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationActivity(ImmunizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Refusal Reason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Refusal Reason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationRefusalReason(ImmunizationRefusalReason object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosisSection(HospitalDischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionMedicationsSectionEntriesOptional(
			HospitalAdmissionMedicationsSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStatusSection(GeneralStatusSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageSpoken(LanguageSpoken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareProvider(HealthcareProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument(UnstructuredDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Or Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Or Scanned Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredOrScannedDocument(UnstructuredOrScannedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralSummary(ReferralSummary object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Diet Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Diet Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeDietSection(DischargeDietSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition For Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition For Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditionForSubstanceAdministration(PreconditionForSubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationMedicationInformation(ImmunizationMedicationInformation object) {
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
	public T caseCDA_Encounter(org.openhealthtools.mdht.uml.cda.Encounter object) {
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
	public T caseCDA_Procedure(org.openhealthtools.mdht.uml.cda.Procedure object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
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
