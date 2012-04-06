/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.*;

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
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage
 * @generated
 */
public class DomainSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IDomainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSwitch() {
		if (modelPackage == null) {
			modelPackage = IDomainPackage.eINSTANCE;
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
			case IDomainPackage.ALLERGY_DRUG_SENSITIVITY: {
				IAllergyDrugSensitivity allergyDrugSensitivity = (IAllergyDrugSensitivity) theEObject;
				T result = caseAllergyDrugSensitivity(allergyDrugSensitivity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.EPISODE_OBSERVATION: {
				IEpisodeObservation episodeObservation = (IEpisodeObservation) theEObject;
				T result = caseEpisodeObservation(episodeObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ALLERGY_INTOLERANCE: {
				IAllergyIntolerance allergyIntolerance = (IAllergyIntolerance) theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) {
					result = caseProblemEntry(allergyIntolerance);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROBLEM_ENTRY: {
				IProblemEntry problemEntry = (IProblemEntry) theEObject;
				T result = caseProblemEntry(problemEntry);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.AGE_OBSERVATION: {
				IAgeObservation ageObservation = (IAgeObservation) theEObject;
				T result = caseAgeObservation(ageObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SEVERITY: {
				ISeverity severity = (ISeverity) theEObject;
				T result = caseSeverity(severity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROBLEM_STATUS_OBSERVATION: {
				IProblemStatusObservation problemStatusObservation = (IProblemStatusObservation) theEObject;
				T result = caseProblemStatusObservation(problemStatusObservation);
				if (result == null) {
					result = caseStatusObservation(problemStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.STATUS_OBSERVATION: {
				IStatusObservation statusObservation = (IStatusObservation) theEObject;
				T result = caseStatusObservation(statusObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HEALTH_STATUS_OBSERVATION: {
				IHealthStatusObservation healthStatusObservation = (IHealthStatusObservation) theEObject;
				T result = caseHealthStatusObservation(healthStatusObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.COMMENT: {
				IComment comment = (IComment) theEObject;
				T result = caseComment(comment);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.CAUSE_OF_DEATH_OBSERVATION: {
				ICauseOfDeathObservation causeOfDeathObservation = (ICauseOfDeathObservation) theEObject;
				T result = caseCauseOfDeathObservation(causeOfDeathObservation);
				if (result == null) {
					result = caseFamilyHistoryObservation(causeOfDeathObservation);
				}
				if (result == null) {
					result = caseSimpleObservation(causeOfDeathObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.FAMILY_HISTORY_OBSERVATION: {
				IFamilyHistoryObservation familyHistoryObservation = (IFamilyHistoryObservation) theEObject;
				T result = caseFamilyHistoryObservation(familyHistoryObservation);
				if (result == null) {
					result = caseSimpleObservation(familyHistoryObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SIMPLE_OBSERVATION: {
				ISimpleObservation simpleObservation = (ISimpleObservation) theEObject;
				T result = caseSimpleObservation(simpleObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER: {
				IProblemEntryReactionObservationContainer problemEntryReactionObservationContainer = (IProblemEntryReactionObservationContainer) theEObject;
				T result = caseProblemEntryReactionObservationContainer(problemEntryReactionObservationContainer);
				if (result == null) {
					result = caseProblemEntry(problemEntryReactionObservationContainer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION: {
				IMedication medication = (IMedication) theEObject;
				T result = caseMedication(medication);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: {
				IMedicationSeriesNumberObservation medicationSeriesNumberObservation = (IMedicationSeriesNumberObservation) theEObject;
				T result = caseMedicationSeriesNumberObservation(medicationSeriesNumberObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_STATUS_OBSERVATION: {
				IMedicationStatusObservation medicationStatusObservation = (IMedicationStatusObservation) theEObject;
				T result = caseMedicationStatusObservation(medicationStatusObservation);
				if (result == null) {
					result = caseStatusObservation(medicationStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.REACTION_OBSERVATION: {
				IReactionObservation reactionObservation = (IReactionObservation) theEObject;
				T result = caseReactionObservation(reactionObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SEVERITY_OBSERVATION: {
				ISeverityObservation severityObservation = (ISeverityObservation) theEObject;
				T result = caseSeverityObservation(severityObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PRODUCT_INSTANCE: {
				IProductInstance productInstance = (IProductInstance) theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.INTERNAL_REFERENCE: {
				IInternalReference internalReference = (IInternalReference) theEObject;
				T result = caseInternalReference(internalReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PATIENT_MEDICAL_INSTRUCTIONS: {
				IPatientMedicalInstructions patientMedicalInstructions = (IPatientMedicalInstructions) theEObject;
				T result = casePatientMedicalInstructions(patientMedicalInstructions);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_TYPE: {
				IMedicationType medicationType = (IMedicationType) theEObject;
				T result = caseMedicationType(medicationType);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_ORDER_INFORMATION: {
				IMedicationOrderInformation medicationOrderInformation = (IMedicationOrderInformation) theEObject;
				T result = caseMedicationOrderInformation(medicationOrderInformation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS: {
				IMedicationFullfillmentInstructions medicationFullfillmentInstructions = (IMedicationFullfillmentInstructions) theEObject;
				T result = caseMedicationFullfillmentInstructions(medicationFullfillmentInstructions);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.CONDITION: {
				ICondition condition = (ICondition) theEObject;
				T result = caseCondition(condition);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PATIENT_SUMMARY: {
				IPatientSummary patientSummary = (IPatientSummary) theEObject;
				T result = casePatientSummary(patientSummary);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.FAMILY_HISTORY_SECTION: {
				IFamilyHistorySection familyHistorySection = (IFamilyHistorySection) theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.FAMILY_HISTORY: {
				IFamilyHistory familyHistory = (IFamilyHistory) theEObject;
				T result = caseFamilyHistory(familyHistory);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.FAMILY_HISTORY_ORGANIZER: {
				IFamilyHistoryOrganizer familyHistoryOrganizer = (IFamilyHistoryOrganizer) theEObject;
				T result = caseFamilyHistoryOrganizer(familyHistoryOrganizer);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SOCIAL_HISTORY_SECTION: {
				ISocialHistorySection socialHistorySection = (ISocialHistorySection) theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SOCIAL_HISTORY: {
				ISocialHistory socialHistory = (ISocialHistory) theEObject;
				T result = caseSocialHistory(socialHistory);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SOCIAL_HISTORY_STATUS_OBSERVATION: {
				ISocialHistoryStatusObservation socialHistoryStatusObservation = (ISocialHistoryStatusObservation) theEObject;
				T result = caseSocialHistoryStatusObservation(socialHistoryStatusObservation);
				if (result == null) {
					result = caseStatusObservation(socialHistoryStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SOCIAL_HISTORY_OBSERVATION: {
				ISocialHistoryObservation socialHistoryObservation = (ISocialHistoryObservation) theEObject;
				T result = caseSocialHistoryObservation(socialHistoryObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.RESULTS_SECTION: {
				IResultsSection resultsSection = (IResultsSection) theEObject;
				T result = caseResultsSection(resultsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.RESULT_ORGANIZER: {
				IResultOrganizer resultOrganizer = (IResultOrganizer) theEObject;
				T result = caseResultOrganizer(resultOrganizer);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.RESULT: {
				IResult result = (IResult) theEObject;
				T theResult = caseResult(result);
				if (theResult == null) {
					theResult = defaultCase(theEObject);
				}
				return theResult;
			}
			case IDomainPackage.RESULT_OBSERVATION: {
				IResultObservation resultObservation = (IResultObservation) theEObject;
				T result = caseResultObservation(resultObservation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICAL_EQUIPMENT_SECTION: {
				IMedicalEquipmentSection medicalEquipmentSection = (IMedicalEquipmentSection) theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SUPPLY_ACTIVITY: {
				ISupplyActivity supplyActivity = (ISupplyActivity) theEObject;
				T result = caseSupplyActivity(supplyActivity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.FULFILLMENT_INSTRUCTION: {
				IFulfillmentInstruction fulfillmentInstruction = (IFulfillmentInstruction) theEObject;
				T result = caseFulfillmentInstruction(fulfillmentInstruction);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_ACTIVITY: {
				IMedicationActivity medicationActivity = (IMedicationActivity) theEObject;
				T result = caseMedicationActivity(medicationActivity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PATIENT_INSTRUCTION: {
				IPatientInstruction patientInstruction = (IPatientInstruction) theEObject;
				T result = casePatientInstruction(patientInstruction);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.FUNCTIONAL_STATUS_SECTION: {
				IFunctionalStatusSection functionalStatusSection = (IFunctionalStatusSection) theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PURPOSE_SECTION: {
				IPurposeSection purposeSection = (IPurposeSection) theEObject;
				T result = casePurposeSection(purposeSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PURPOSE_ACTIVITY: {
				IPurposeActivity purposeActivity = (IPurposeActivity) theEObject;
				T result = casePurposeActivity(purposeActivity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ADVANCE_DIRECTIVES_SECTION: {
				IAdvanceDirectivesSection advanceDirectivesSection = (IAdvanceDirectivesSection) theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ADVANCE_DIRECTIVE: {
				IAdvanceDirective advanceDirective = (IAdvanceDirective) theEObject;
				T result = caseAdvanceDirective(advanceDirective);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ADVANCE_DIRECTIVE_VERIFICATION: {
				IAdvanceDirectiveVerification advanceDirectiveVerification = (IAdvanceDirectiveVerification) theEObject;
				T result = caseAdvanceDirectiveVerification(advanceDirectiveVerification);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: {
				IAdvanceDirectiveStatusObservation advanceDirectiveStatusObservation = (IAdvanceDirectiveStatusObservation) theEObject;
				T result = caseAdvanceDirectiveStatusObservation(advanceDirectiveStatusObservation);
				if (result == null) {
					result = caseStatusObservation(advanceDirectiveStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ADVANCE_DIRECTIVE_REFERENCE: {
				IAdvanceDirectiveReference advanceDirectiveReference = (IAdvanceDirectiveReference) theEObject;
				T result = caseAdvanceDirectiveReference(advanceDirectiveReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ALLERGIES_REACTIONS_SECTION: {
				IAllergiesReactionsSection allergiesReactionsSection = (IAllergiesReactionsSection) theEObject;
				T result = caseAllergiesReactionsSection(allergiesReactionsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROBLEM_LIST_SECTION: {
				IProblemListSection problemListSection = (IProblemListSection) theEObject;
				T result = caseProblemListSection(problemListSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ENCOUNTERS_SECTION: {
				IEncountersSection encountersSection = (IEncountersSection) theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ENCOUNTERS_ACTIVITY: {
				IEncountersActivity encountersActivity = (IEncountersActivity) theEObject;
				T result = caseEncountersActivity(encountersActivity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ENCOUNTER_LOCATION: {
				IEncounterLocation encounterLocation = (IEncounterLocation) theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ENCOUNTER: {
				IEncounter encounter = (IEncounter) theEObject;
				T result = caseEncounter(encounter);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.IMMUNIZATIONS_SECTION: {
				IImmunizationsSection immunizationsSection = (IImmunizationsSection) theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.IMMUNIZATION: {
				IImmunization immunization = (IImmunization) theEObject;
				T result = caseImmunization(immunization);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PAYERS_SECTION: {
				IPayersSection payersSection = (IPayersSection) theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.INSURANCE_PROVIDER: {
				IInsuranceProvider insuranceProvider = (IInsuranceProvider) theEObject;
				T result = caseInsuranceProvider(insuranceProvider);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PAYER_ENTRY: {
				IPayerEntry payerEntry = (IPayerEntry) theEObject;
				T result = casePayerEntry(payerEntry);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PAYER_ENTITY: {
				IPayerEntity payerEntity = (IPayerEntity) theEObject;
				T result = casePayerEntity(payerEntity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.COVERED_PARTY: {
				ICoveredParty coveredParty = (ICoveredParty) theEObject;
				T result = caseCoveredParty(coveredParty);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.POLICY_SUBSCRIBER: {
				IPolicySubscriber policySubscriber = (IPolicySubscriber) theEObject;
				T result = casePolicySubscriber(policySubscriber);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATIONS_SECTION: {
				IMedicationsSection medicationsSection = (IMedicationsSection) theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_SECTION: {
				IPlanOfCareSection planOfCareSection = (IPlanOfCareSection) theEObject;
				T result = casePlanOfCareSection(planOfCareSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_ACT: {
				IPlanOfCareActivityAct planOfCareActivityAct = (IPlanOfCareActivityAct) theEObject;
				T result = casePlanOfCareActivityAct(planOfCareActivityAct);
				if (result == null) {
					result = casePlanOfCareActivity(planOfCareActivityAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY: {
				IPlanOfCareActivity planOfCareActivity = (IPlanOfCareActivity) theEObject;
				T result = casePlanOfCareActivity(planOfCareActivity);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: {
				IPlanOfCareActivityEncounter planOfCareActivityEncounter = (IPlanOfCareActivityEncounter) theEObject;
				T result = casePlanOfCareActivityEncounter(planOfCareActivityEncounter);
				if (result == null) {
					result = casePlanOfCareActivity(planOfCareActivityEncounter);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: {
				IPlanOfCareActivityObservation planOfCareActivityObservation = (IPlanOfCareActivityObservation) theEObject;
				T result = casePlanOfCareActivityObservation(planOfCareActivityObservation);
				if (result == null) {
					result = casePlanOfCareActivity(planOfCareActivityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				IPlanOfCareActivityProcedure planOfCareActivityProcedure = (IPlanOfCareActivityProcedure) theEObject;
				T result = casePlanOfCareActivityProcedure(planOfCareActivityProcedure);
				if (result == null) {
					result = casePlanOfCareActivity(planOfCareActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				IPlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration = (IPlanOfCareActivitySubstanceAdministration) theEObject;
				T result = casePlanOfCareActivitySubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) {
					result = casePlanOfCareActivity(planOfCareActivitySubstanceAdministration);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: {
				IPlanOfCareActivitySupply planOfCareActivitySupply = (IPlanOfCareActivitySupply) theEObject;
				T result = casePlanOfCareActivitySupply(planOfCareActivitySupply);
				if (result == null) {
					result = casePlanOfCareActivity(planOfCareActivitySupply);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROCEDURE: {
				IProcedure procedure = (IProcedure) theEObject;
				T result = caseProcedure(procedure);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PREGNANCY_HISTORY_SECTION: {
				IPregnancyHistorySection pregnancyHistorySection = (IPregnancyHistorySection) theEObject;
				T result = casePregnancyHistorySection(pregnancyHistorySection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PREGNANCY_OBSERVATION: {
				IPregnancyObservation pregnancyObservation = (IPregnancyObservation) theEObject;
				T result = casePregnancyObservation(pregnancyObservation);
				if (result == null) {
					result = caseSimpleObservation(pregnancyObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SURGERIES_SECTION: {
				ISurgeriesSection surgeriesSection = (ISurgeriesSection) theEObject;
				T result = caseSurgeriesSection(surgeriesSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.EXTERNAL_REFERENCE: {
				IExternalReference externalReference = (IExternalReference) theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE: {
				IProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure = (IProcedureEntryProcedureActivityProcedure) theEObject;
				T result = caseProcedureEntryProcedureActivityProcedure(procedureEntryProcedureActivityProcedure);
				if (result == null) {
					result = caseProcedureEntry(procedureEntryProcedureActivityProcedure);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PROCEDURE_ENTRY: {
				IProcedureEntry procedureEntry = (IProcedureEntry) theEObject;
				T result = caseProcedureEntry(procedureEntry);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SUPPORT: {
				ISupport support = (ISupport) theEObject;
				T result = caseSupport(support);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.VITAL_SIGNS_SECTION: {
				IVitalSignsSection vitalSignsSection = (IVitalSignsSection) theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.VITAL_SIGNS_ORGANIZER: {
				IVitalSignsOrganizer vitalSignsOrganizer = (IVitalSignsOrganizer) theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) {
					result = caseResultOrganizer(vitalSignsOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.VITAL_SIGN_OBSERVATION: {
				IVitalSignObservation vitalSignObservation = (IVitalSignObservation) theEObject;
				T result = caseVitalSignObservation(vitalSignObservation);
				if (result == null) {
					result = caseSimpleObservation(vitalSignObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.DIAGNOSTIC_RESULTS_SECTION: {
				IDiagnosticResultsSection diagnosticResultsSection = (IDiagnosticResultsSection) theEObject;
				T result = caseDiagnosticResultsSection(diagnosticResultsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.VITAL_SIGN: {
				IVitalSign vitalSign = (IVitalSign) theEObject;
				T result = caseVitalSign(vitalSign);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
				IHistoryOfPastIllnessSection historyOfPastIllnessSection = (IHistoryOfPastIllnessSection) theEObject;
				T result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.CHIEF_COMPLAINT_SECTION: {
				IChiefComplaintSection chiefComplaintSection = (IChiefComplaintSection) theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.REASON_FOR_REFERRAL_SECTION: {
				IReasonForReferralSection reasonForReferralSection = (IReasonForReferralSection) theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HISTORY_OF_PRESENT_ILLNESS: {
				IHistoryOfPresentIllness historyOfPresentIllness = (IHistoryOfPresentIllness) theEObject;
				T result = caseHistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
				IHospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (IHospitalAdmissionDiagnosisSection) theEObject;
				T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.DISCHARGE_DIAGNOSIS_SECTION: {
				IDischargeDiagnosisSection dischargeDiagnosisSection = (IDischargeDiagnosisSection) theEObject;
				T result = caseDischargeDiagnosisSection(dischargeDiagnosisSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ADMISSION_MEDICATION_HISTORY_SECTION: {
				IAdmissionMedicationHistorySection admissionMedicationHistorySection = (IAdmissionMedicationHistorySection) theEObject;
				T result = caseAdmissionMedicationHistorySection(admissionMedicationHistorySection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				IHospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (IHospitalDischargeMedicationsSection) theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATIONS_ADMINISTERED_SECTION: {
				IMedicationsAdministeredSection medicationsAdministeredSection = (IMedicationsAdministeredSection) theEObject;
				T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.PHYSICAL_EXAM_SECTION: {
				IPhysicalExamSection physicalExamSection = (IPhysicalExamSection) theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.GENERAL_APPEARANCE_SECTION: {
				IGeneralAppearanceSection generalAppearanceSection = (IGeneralAppearanceSection) theEObject;
				T result = caseGeneralAppearanceSection(generalAppearanceSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION: {
				IVisibleImplantedMedicalDevicesSection visibleImplantedMedicalDevicesSection = (IVisibleImplantedMedicalDevicesSection) theEObject;
				T result = caseVisibleImplantedMedicalDevicesSection(visibleImplantedMedicalDevicesSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.INTEGUMENTARY_SYSTEM_SECTION: {
				IIntegumentarySystemSection integumentarySystemSection = (IIntegumentarySystemSection) theEObject;
				T result = caseIntegumentarySystemSection(integumentarySystemSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HEAD_SECTION: {
				IHeadSection headSection = (IHeadSection) theEObject;
				T result = caseHeadSection(headSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.EYES_SECTION: {
				IEyesSection eyesSection = (IEyesSection) theEObject;
				T result = caseEyesSection(eyesSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.EARS_NOSE_MOUTH_THROAT_SECTION: {
				IEarsNoseMouthThroatSection earsNoseMouthThroatSection = (IEarsNoseMouthThroatSection) theEObject;
				T result = caseEarsNoseMouthThroatSection(earsNoseMouthThroatSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.EARS_SECTION: {
				IEarsSection earsSection = (IEarsSection) theEObject;
				T result = caseEarsSection(earsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.NOSE_SECTION: {
				INoseSection noseSection = (INoseSection) theEObject;
				T result = caseNoseSection(noseSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MOUTH_THROAT_TEETH_SECTION: {
				IMouthThroatTeethSection mouthThroatTeethSection = (IMouthThroatTeethSection) theEObject;
				T result = caseMouthThroatTeethSection(mouthThroatTeethSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.NECK_SECTION: {
				INeckSection neckSection = (INeckSection) theEObject;
				T result = caseNeckSection(neckSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ENDOCRINE_SYSTEM_SECTION: {
				IEndocrineSystemSection endocrineSystemSection = (IEndocrineSystemSection) theEObject;
				T result = caseEndocrineSystemSection(endocrineSystemSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.THORAX_LUNGS_SECTION: {
				IThoraxLungsSection thoraxLungsSection = (IThoraxLungsSection) theEObject;
				T result = caseThoraxLungsSection(thoraxLungsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.CHEST_WALL_SECTION: {
				IChestWallSection chestWallSection = (IChestWallSection) theEObject;
				T result = caseChestWallSection(chestWallSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.BREAST_SECTION: {
				IBreastSection breastSection = (IBreastSection) theEObject;
				T result = caseBreastSection(breastSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HEART_SECTION: {
				IHeartSection heartSection = (IHeartSection) theEObject;
				T result = caseHeartSection(heartSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.RESPIRATORY_SYSTEM_SECTION: {
				IRespiratorySystemSection respiratorySystemSection = (IRespiratorySystemSection) theEObject;
				T result = caseRespiratorySystemSection(respiratorySystemSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ABDOMEN_SECTION: {
				IAbdomenSection abdomenSection = (IAbdomenSection) theEObject;
				T result = caseAbdomenSection(abdomenSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.LYMPHATIC_SECTION: {
				ILymphaticSection lymphaticSection = (ILymphaticSection) theEObject;
				T result = caseLymphaticSection(lymphaticSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.VESSELS_SECTION: {
				IVesselsSection vesselsSection = (IVesselsSection) theEObject;
				T result = caseVesselsSection(vesselsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MUSCULOSKELETAL_SYSTEM_SECTION: {
				IMusculoskeletalSystemSection musculoskeletalSystemSection = (IMusculoskeletalSystemSection) theEObject;
				T result = caseMusculoskeletalSystemSection(musculoskeletalSystemSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.NEUROLOGIC_SYSTEM_SECTION: {
				INeurologicSystemSection neurologicSystemSection = (INeurologicSystemSection) theEObject;
				T result = caseNeurologicSystemSection(neurologicSystemSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.GENITALIA_SECTION: {
				IGenitaliaSection genitaliaSection = (IGenitaliaSection) theEObject;
				T result = caseGenitaliaSection(genitaliaSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.RECTUM_SECTION: {
				IRectumSection rectumSection = (IRectumSection) theEObject;
				T result = caseRectumSection(rectumSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.EXTREMITIES_SECTION: {
				IExtremitiesSection extremitiesSection = (IExtremitiesSection) theEObject;
				T result = caseExtremitiesSection(extremitiesSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.REVIEW_OF_SYSTEMS_SECTION: {
				IReviewOfSystemsSection reviewOfSystemsSection = (IReviewOfSystemsSection) theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HOSPITAL_COURSE_SECTION: {
				IHospitalCourseSection hospitalCourseSection = (IHospitalCourseSection) theEObject;
				T result = caseHospitalCourseSection(hospitalCourseSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.ASSESSMENT_AND_PLAN_SECTION: {
				IAssessmentAndPlanSection assessmentAndPlanSection = (IAssessmentAndPlanSection) theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.LANGUAGE_SPOKEN: {
				ILanguageSpoken languageSpoken = (ILanguageSpoken) theEObject;
				T result = caseLanguageSpoken(languageSpoken);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.HEALTHCARE_PROVIDER: {
				IHealthcareProvider healthcareProvider = (IHealthcareProvider) theEObject;
				T result = caseHealthcareProvider(healthcareProvider);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_NORMAL_DOSE: {
				IMedicationNormalDose medicationNormalDose = (IMedicationNormalDose) theEObject;
				T result = caseMedicationNormalDose(medicationNormalDose);
				if (result == null) {
					result = caseMedication(medicationNormalDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_SPLIT_DOSE: {
				IMedicationSplitDose medicationSplitDose = (IMedicationSplitDose) theEObject;
				T result = caseMedicationSplitDose(medicationSplitDose);
				if (result == null) {
					result = caseMedication(medicationSplitDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_TAPERED_DOSE: {
				IMedicationTaperedDose medicationTaperedDose = (IMedicationTaperedDose) theEObject;
				T result = caseMedicationTaperedDose(medicationTaperedDose);
				if (result == null) {
					result = caseMedication(medicationTaperedDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_CONDITIONAL_DOSE: {
				IMedicationConditionalDose medicationConditionalDose = (IMedicationConditionalDose) theEObject;
				T result = caseMedicationConditionalDose(medicationConditionalDose);
				if (result == null) {
					result = caseMedication(medicationConditionalDose);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_COMBINATION_MEDICATION: {
				IMedicationCombinationMedication medicationCombinationMedication = (IMedicationCombinationMedication) theEObject;
				T result = caseMedicationCombinationMedication(medicationCombinationMedication);
				if (result == null) {
					result = caseMedication(medicationCombinationMedication);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SUPPORT_GUARDIAN: {
				ISupportGuardian supportGuardian = (ISupportGuardian) theEObject;
				T result = caseSupportGuardian(supportGuardian);
				if (result == null) {
					result = caseSupport(supportGuardian);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SUPPORT_PARTICIPANT: {
				ISupportParticipant supportParticipant = (ISupportParticipant) theEObject;
				T result = caseSupportParticipant(supportParticipant);
				if (result == null) {
					result = caseSupport(supportParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.UNSTRUCTURED_DOCUMENT: {
				IUnstructuredDocument unstructuredDocument = (IUnstructuredDocument) theEObject;
				T result = caseUnstructuredDocument(unstructuredDocument);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SCAN_ORIGINAL_AUTHOR: {
				IScanOriginalAuthor scanOriginalAuthor = (IScanOriginalAuthor) theEObject;
				T result = caseScanOriginalAuthor(scanOriginalAuthor);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SCANNING_DEVICE: {
				IScanningDevice scanningDevice = (IScanningDevice) theEObject;
				T result = caseScanningDevice(scanningDevice);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.SCAN_DATA_ENTERER: {
				IScanDataEnterer scanDataEnterer = (IScanDataEnterer) theEObject;
				T result = caseScanDataEnterer(scanDataEnterer);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.MEDICATION_INFORMATION: {
				IMedicationInformation medicationInformation = (IMedicationInformation) theEObject;
				T result = caseMedicationInformation(medicationInformation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.UNSTRUCTURED_OR_SCANNED_DOCUMENT: {
				IUnstructuredOrScannedDocument unstructuredOrScannedDocument = (IUnstructuredOrScannedDocument) theEObject;
				T result = caseUnstructuredOrScannedDocument(unstructuredOrScannedDocument);
				if (result == null) {
					result = caseUnstructuredDocument(unstructuredOrScannedDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.REFERRAL_SUMMARY: {
				IReferralSummary referralSummary = (IReferralSummary) theEObject;
				T result = caseReferralSummary(referralSummary);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.DISCHARGE_SUMMARY: {
				IDischargeSummary dischargeSummary = (IDischargeSummary) theEObject;
				T result = caseDischargeSummary(dischargeSummary);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case IDomainPackage.DISCHARGE_DIET: {
				IDischargeDiet dischargeDiet = (IDischargeDiet) theEObject;
				T result = caseDischargeDiet(dischargeDiet);
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
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Drug Sensitivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyDrugSensitivity(IAllergyDrugSensitivity object) {
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
	public T caseEpisodeObservation(IEpisodeObservation object) {
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
	public T caseAllergyIntolerance(IAllergyIntolerance object) {
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
	public T caseMedication(IMedication object) {
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
	public T caseMedicationSeriesNumberObservation(IMedicationSeriesNumberObservation object) {
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
	public T caseMedicationStatusObservation(IMedicationStatusObservation object) {
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
	public T caseReactionObservation(IReactionObservation object) {
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
	public T caseSeverityObservation(ISeverityObservation object) {
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
	public T caseProductInstance(IProductInstance object) {
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
	public T caseInternalReference(IInternalReference object) {
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
	public T casePatientMedicalInstructions(IPatientMedicalInstructions object) {
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
	public T caseMedicationType(IMedicationType object) {
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
	public T caseMedicationOrderInformation(IMedicationOrderInformation object) {
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
	public T caseMedicationFullfillmentInstructions(IMedicationFullfillmentInstructions object) {
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
	public T caseCondition(ICondition object) {
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
	public T caseProblemEntry(IProblemEntry object) {
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
	public T caseAgeObservation(IAgeObservation object) {
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
	public T caseSeverity(ISeverity object) {
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
	public T caseProblemStatusObservation(IProblemStatusObservation object) {
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
	public T caseStatusObservation(IStatusObservation object) {
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
	public T caseHealthStatusObservation(IHealthStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientSummary(IPatientSummary object) {
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
	public T caseAdvanceDirectivesSection(IAdvanceDirectivesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirective(IAdvanceDirective object) {
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
	public T caseAdvanceDirectiveVerification(IAdvanceDirectiveVerification object) {
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
	public T caseAdvanceDirectiveStatusObservation(IAdvanceDirectiveStatusObservation object) {
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
	public T caseAdvanceDirectiveReference(IAdvanceDirectiveReference object) {
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
	public T caseAllergiesReactionsSection(IAllergiesReactionsSection object) {
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
	public T caseComment(IComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cause Of Death Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCauseOfDeathObservation(ICauseOfDeathObservation object) {
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
	public T caseFamilyHistoryObservation(IFamilyHistoryObservation object) {
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
	public T caseSimpleObservation(ISimpleObservation object) {
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
	public T caseProblemEntryReactionObservationContainer(IProblemEntryReactionObservationContainer object) {
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
	public T caseProblemListSection(IProblemListSection object) {
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
	public T caseEncountersSection(IEncountersSection object) {
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
	public T caseEncountersActivity(IEncountersActivity object) {
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
	public T caseEncounterLocation(IEncounterLocation object) {
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
	public T caseEncounter(IEncounter object) {
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
	public T caseImmunizationsSection(IImmunizationsSection object) {
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
	public T caseImmunization(IImmunization object) {
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
	public T casePayersSection(IPayersSection object) {
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
	public T casePayerEntity(IPayerEntity object) {
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
	public T caseCoveredParty(ICoveredParty object) {
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
	public T casePolicySubscriber(IPolicySubscriber object) {
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
	public T caseMedicationsSection(IMedicationsSection object) {
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
	public T casePlanOfCareSection(IPlanOfCareSection object) {
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
	public T casePlanOfCareActivityAct(IPlanOfCareActivityAct object) {
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
	public T casePlanOfCareActivity(IPlanOfCareActivity object) {
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
	public T casePlanOfCareActivityEncounter(IPlanOfCareActivityEncounter object) {
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
	public T casePlanOfCareActivityObservation(IPlanOfCareActivityObservation object) {
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
	public T casePlanOfCareActivityProcedure(IPlanOfCareActivityProcedure object) {
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
	public T casePlanOfCareActivitySubstanceAdministration(IPlanOfCareActivitySubstanceAdministration object) {
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
	public T casePlanOfCareActivitySupply(IPlanOfCareActivitySupply object) {
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
	public T caseSurgeriesSection(ISurgeriesSection object) {
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
	public T caseExternalReference(IExternalReference object) {
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
	public T caseProcedureEntryProcedureActivityProcedure(IProcedureEntryProcedureActivityProcedure object) {
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
	public T caseProcedureEntry(IProcedureEntry object) {
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
	public T caseProcedure(IProcedure object) {
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
	public T casePregnancyHistorySection(IPregnancyHistorySection object) {
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
	public T casePregnancyObservation(IPregnancyObservation object) {
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
	public T caseSupport(ISupport object) {
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
	public T caseVitalSignsSection(IVitalSignsSection object) {
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
	public T caseVitalSignsOrganizer(IVitalSignsOrganizer object) {
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
	public T caseVitalSignObservation(IVitalSignObservation object) {
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
	public T caseDiagnosticResultsSection(IDiagnosticResultsSection object) {
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
	public T caseResult(IResult object) {
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
	public T caseVitalSign(IVitalSign object) {
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
	public T caseHistoryOfPastIllnessSection(IHistoryOfPastIllnessSection object) {
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
	public T caseChiefComplaintSection(IChiefComplaintSection object) {
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
	public T caseReasonForReferralSection(IReasonForReferralSection object) {
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
	public T caseHistoryOfPresentIllness(IHistoryOfPresentIllness object) {
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
	public T caseFunctionalStatusSection(IFunctionalStatusSection object) {
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
	public T casePurposeSection(IPurposeSection object) {
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
	public T casePurposeActivity(IPurposeActivity object) {
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
	public T caseHospitalAdmissionDiagnosisSection(IHospitalAdmissionDiagnosisSection object) {
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
	public T caseDischargeDiagnosisSection(IDischargeDiagnosisSection object) {
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
	public T caseAdmissionMedicationHistorySection(IAdmissionMedicationHistorySection object) {
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
	public T caseHospitalDischargeMedicationsSection(IHospitalDischargeMedicationsSection object) {
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
	public T caseMedicationsAdministeredSection(IMedicationsAdministeredSection object) {
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
	public T casePhysicalExamSection(IPhysicalExamSection object) {
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
	public T caseGeneralAppearanceSection(IGeneralAppearanceSection object) {
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
	public T caseVisibleImplantedMedicalDevicesSection(IVisibleImplantedMedicalDevicesSection object) {
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
	public T caseIntegumentarySystemSection(IIntegumentarySystemSection object) {
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
	public T caseHeadSection(IHeadSection object) {
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
	public T caseEyesSection(IEyesSection object) {
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
	public T caseEarsNoseMouthThroatSection(IEarsNoseMouthThroatSection object) {
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
	public T caseEarsSection(IEarsSection object) {
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
	public T caseNoseSection(INoseSection object) {
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
	public T caseMouthThroatTeethSection(IMouthThroatTeethSection object) {
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
	public T caseNeckSection(INeckSection object) {
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
	public T caseEndocrineSystemSection(IEndocrineSystemSection object) {
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
	public T caseThoraxLungsSection(IThoraxLungsSection object) {
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
	public T caseChestWallSection(IChestWallSection object) {
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
	public T caseBreastSection(IBreastSection object) {
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
	public T caseHeartSection(IHeartSection object) {
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
	public T caseRespiratorySystemSection(IRespiratorySystemSection object) {
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
	public T caseAbdomenSection(IAbdomenSection object) {
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
	public T caseLymphaticSection(ILymphaticSection object) {
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
	public T caseVesselsSection(IVesselsSection object) {
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
	public T caseMusculoskeletalSystemSection(IMusculoskeletalSystemSection object) {
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
	public T caseNeurologicSystemSection(INeurologicSystemSection object) {
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
	public T caseGenitaliaSection(IGenitaliaSection object) {
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
	public T caseRectumSection(IRectumSection object) {
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
	public T caseExtremitiesSection(IExtremitiesSection object) {
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
	public T caseReviewOfSystemsSection(IReviewOfSystemsSection object) {
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
	public T caseHospitalCourseSection(IHospitalCourseSection object) {
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
	public T caseAssessmentAndPlanSection(IAssessmentAndPlanSection object) {
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
	public T caseFamilyHistorySection(IFamilyHistorySection object) {
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
	public T caseSocialHistorySection(ISocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistory(ISocialHistory object) {
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
	public T caseSocialHistoryStatusObservation(ISocialHistoryStatusObservation object) {
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
	public T caseSocialHistoryObservation(ISocialHistoryObservation object) {
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
	public T caseResultsSection(IResultsSection object) {
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
	public T caseResultOrganizer(IResultOrganizer object) {
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
	public T caseResultObservation(IResultObservation object) {
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
	public T caseMedicalEquipmentSection(IMedicalEquipmentSection object) {
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
	public T caseSupplyActivity(ISupplyActivity object) {
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
	public T caseFulfillmentInstruction(IFulfillmentInstruction object) {
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
	public T caseMedicationActivity(IMedicationActivity object) {
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
	public T casePatientInstruction(IPatientInstruction object) {
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
	public T caseLanguageSpoken(ILanguageSpoken object) {
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
	public T caseInsuranceProvider(IInsuranceProvider object) {
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
	public T casePayerEntry(IPayerEntry object) {
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
	public T caseHealthcareProvider(IHealthcareProvider object) {
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
	public T caseMedicationNormalDose(IMedicationNormalDose object) {
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
	public T caseMedicationSplitDose(IMedicationSplitDose object) {
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
	public T caseMedicationTaperedDose(IMedicationTaperedDose object) {
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
	public T caseMedicationConditionalDose(IMedicationConditionalDose object) {
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
	public T caseMedicationCombinationMedication(IMedicationCombinationMedication object) {
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
	public T caseSupportGuardian(ISupportGuardian object) {
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
	public T caseSupportParticipant(ISupportParticipant object) {
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
	public T caseUnstructuredDocument(IUnstructuredDocument object) {
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
	public T caseScanOriginalAuthor(IScanOriginalAuthor object) {
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
	public T caseScanningDevice(IScanningDevice object) {
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
	public T caseScanDataEnterer(IScanDataEnterer object) {
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
	public T caseMedicationInformation(IMedicationInformation object) {
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
	public T caseUnstructuredOrScannedDocument(IUnstructuredOrScannedDocument object) {
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
	public T caseReferralSummary(IReferralSummary object) {
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
	public T caseDischargeSummary(IDischargeSummary object) {
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
	public T caseDischargeDiet(IDischargeDiet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistory(IFamilyHistory object) {
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
	public T caseFamilyHistoryOrganizer(IFamilyHistoryOrganizer object) {
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

} // DomainSwitch
