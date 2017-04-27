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
package org.openhealthtools.mdht.uml.cda.consol.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.Author;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Criterion;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.EncounterParticipant;
import org.eclipse.mdht.uml.cda.ExternalDocument;
import org.eclipse.mdht.uml.cda.ManufacturedProduct;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.ParticipantRole;
import org.eclipse.mdht.uml.cda.Performer1;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.RelatedSubject;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.cda.Supply;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.eclipse.mdht.uml.hl7.rim.Participation;
import org.eclipse.mdht.uml.hl7.rim.Role;
import org.openhealthtools.mdht.uml.cda.consol.*;

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
					result = caseSubstanceOrDeviceAllergyObservation(allergyObservation);
				}
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
			case ConsolPackage.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION: {
				SubstanceOrDeviceAllergyObservation substanceOrDeviceAllergyObservation = (SubstanceOrDeviceAllergyObservation) theEObject;
				T result = caseSubstanceOrDeviceAllergyObservation(substanceOrDeviceAllergyObservation);
				if (result == null) {
					result = caseObservation(substanceOrDeviceAllergyObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(substanceOrDeviceAllergyObservation);
				}
				if (result == null) {
					result = caseAct(substanceOrDeviceAllergyObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(substanceOrDeviceAllergyObservation);
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
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure) theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) {
					result = caseProcedure(procedureActivityProcedure);
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
			case ConsolPackage.SERVICE_DELIVERY_LOCATION: {
				ServiceDeliveryLocation serviceDeliveryLocation = (ServiceDeliveryLocation) theEObject;
				T result = caseServiceDeliveryLocation(serviceDeliveryLocation);
				if (result == null) {
					result = caseParticipantRole(serviceDeliveryLocation);
				}
				if (result == null) {
					result = caseRole(serviceDeliveryLocation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(serviceDeliveryLocation);
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
			case ConsolPackage.MEDICATION_SUPPLY_ORDER: {
				MedicationSupplyOrder medicationSupplyOrder = (MedicationSupplyOrder) theEObject;
				T result = caseMedicationSupplyOrder(medicationSupplyOrder);
				if (result == null) {
					result = caseSupply(medicationSupplyOrder);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationSupplyOrder);
				}
				if (result == null) {
					result = caseAct(medicationSupplyOrder);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationSupplyOrder);
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
			case ConsolPackage.COMMENT_ACTIVITY: {
				CommentActivity commentActivity = (CommentActivity) theEObject;
				T result = caseCommentActivity(commentActivity);
				if (result == null) {
					result = caseCDA_Act(commentActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(commentActivity);
				}
				if (result == null) {
					result = caseAct(commentActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(commentActivity);
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
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION: {
				ProcedureActivityObservation procedureActivityObservation = (ProcedureActivityObservation) theEObject;
				T result = caseProcedureActivityObservation(procedureActivityObservation);
				if (result == null) {
					result = caseObservation(procedureActivityObservation);
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
			case ConsolPackage.ENCOUNTER_ACTIVITIES: {
				EncounterActivities encounterActivities = (EncounterActivities) theEObject;
				T result = caseEncounterActivities(encounterActivities);
				if (result == null) {
					result = caseEncounter(encounterActivities);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterActivities);
				}
				if (result == null) {
					result = caseAct(encounterActivities);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterActivities);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_DIAGNOSIS: {
				EncounterDiagnosis encounterDiagnosis = (EncounterDiagnosis) theEObject;
				T result = caseEncounterDiagnosis(encounterDiagnosis);
				if (result == null) {
					result = caseCDA_Act(encounterDiagnosis);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterDiagnosis);
				}
				if (result == null) {
					result = caseAct(encounterDiagnosis);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterDiagnosis);
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
			case ConsolPackage.FUNCTIONAL_STATUS_RESULT_ORGANIZER: {
				FunctionalStatusResultOrganizer functionalStatusResultOrganizer = (FunctionalStatusResultOrganizer) theEObject;
				T result = caseFunctionalStatusResultOrganizer(functionalStatusResultOrganizer);
				if (result == null) {
					result = caseResultOrganizer(functionalStatusResultOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(functionalStatusResultOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(functionalStatusResultOrganizer);
				}
				if (result == null) {
					result = caseAct(functionalStatusResultOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusResultOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_RESULT_OBSERVATION: {
				FunctionalStatusResultObservation functionalStatusResultObservation = (FunctionalStatusResultObservation) theEObject;
				T result = caseFunctionalStatusResultObservation(functionalStatusResultObservation);
				if (result == null) {
					result = caseResultObservation(functionalStatusResultObservation);
				}
				if (result == null) {
					result = caseObservation(functionalStatusResultObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(functionalStatusResultObservation);
				}
				if (result == null) {
					result = caseAct(functionalStatusResultObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusResultObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CAREGIVER_CHARACTERISTICS: {
				CaregiverCharacteristics caregiverCharacteristics = (CaregiverCharacteristics) theEObject;
				T result = caseCaregiverCharacteristics(caregiverCharacteristics);
				if (result == null) {
					result = caseObservation(caregiverCharacteristics);
				}
				if (result == null) {
					result = caseClinicalStatement(caregiverCharacteristics);
				}
				if (result == null) {
					result = caseAct(caregiverCharacteristics);
				}
				if (result == null) {
					result = caseInfrastructureRoot(caregiverCharacteristics);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSESSMENT_SCALE_OBSERVATION: {
				AssessmentScaleObservation assessmentScaleObservation = (AssessmentScaleObservation) theEObject;
				T result = caseAssessmentScaleObservation(assessmentScaleObservation);
				if (result == null) {
					result = caseObservation(assessmentScaleObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(assessmentScaleObservation);
				}
				if (result == null) {
					result = caseAct(assessmentScaleObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentScaleObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSESSMENT_SCALE_SUPPORTING_OBSERVATION: {
				AssessmentScaleSupportingObservation assessmentScaleSupportingObservation = (AssessmentScaleSupportingObservation) theEObject;
				T result = caseAssessmentScaleSupportingObservation(assessmentScaleSupportingObservation);
				if (result == null) {
					result = caseObservation(assessmentScaleSupportingObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(assessmentScaleSupportingObservation);
				}
				if (result == null) {
					result = caseAct(assessmentScaleSupportingObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentScaleSupportingObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COGNITIVE_STATUS_RESULT_ORGANIZER: {
				CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer = (CognitiveStatusResultOrganizer) theEObject;
				T result = caseCognitiveStatusResultOrganizer(cognitiveStatusResultOrganizer);
				if (result == null) {
					result = caseResultOrganizer(cognitiveStatusResultOrganizer);
				}
				if (result == null) {
					result = caseOrganizer(cognitiveStatusResultOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(cognitiveStatusResultOrganizer);
				}
				if (result == null) {
					result = caseAct(cognitiveStatusResultOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(cognitiveStatusResultOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COGNITIVE_STATUS_RESULT_OBSERVATION: {
				CognitiveStatusResultObservation cognitiveStatusResultObservation = (CognitiveStatusResultObservation) theEObject;
				T result = caseCognitiveStatusResultObservation(cognitiveStatusResultObservation);
				if (result == null) {
					result = caseResultObservation(cognitiveStatusResultObservation);
				}
				if (result == null) {
					result = caseObservation(cognitiveStatusResultObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(cognitiveStatusResultObservation);
				}
				if (result == null) {
					result = caseAct(cognitiveStatusResultObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(cognitiveStatusResultObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_PROBLEM_OBSERVATION: {
				FunctionalStatusProblemObservation functionalStatusProblemObservation = (FunctionalStatusProblemObservation) theEObject;
				T result = caseFunctionalStatusProblemObservation(functionalStatusProblemObservation);
				if (result == null) {
					result = caseProblemObservation(functionalStatusProblemObservation);
				}
				if (result == null) {
					result = caseObservation(functionalStatusProblemObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(functionalStatusProblemObservation);
				}
				if (result == null) {
					result = caseAct(functionalStatusProblemObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusProblemObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COGNITIVE_STATUS_PROBLEM_OBSERVATION: {
				CognitiveStatusProblemObservation cognitiveStatusProblemObservation = (CognitiveStatusProblemObservation) theEObject;
				T result = caseCognitiveStatusProblemObservation(cognitiveStatusProblemObservation);
				if (result == null) {
					result = caseProblemObservation(cognitiveStatusProblemObservation);
				}
				if (result == null) {
					result = caseObservation(cognitiveStatusProblemObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(cognitiveStatusProblemObservation);
				}
				if (result == null) {
					result = caseAct(cognitiveStatusProblemObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(cognitiveStatusProblemObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRESSURE_ULCER_OBSERVATION: {
				PressureUlcerObservation pressureUlcerObservation = (PressureUlcerObservation) theEObject;
				T result = casePressureUlcerObservation(pressureUlcerObservation);
				if (result == null) {
					result = caseObservation(pressureUlcerObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(pressureUlcerObservation);
				}
				if (result == null) {
					result = caseAct(pressureUlcerObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(pressureUlcerObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION: {
				NumberOfPressureUlcersObservation numberOfPressureUlcersObservation = (NumberOfPressureUlcersObservation) theEObject;
				T result = caseNumberOfPressureUlcersObservation(numberOfPressureUlcersObservation);
				if (result == null) {
					result = caseObservation(numberOfPressureUlcersObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(numberOfPressureUlcersObservation);
				}
				if (result == null) {
					result = caseAct(numberOfPressureUlcersObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(numberOfPressureUlcersObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HIGHEST_PRESSURE_ULCER_STAGE: {
				HighestPressureUlcerStage highestPressureUlcerStage = (HighestPressureUlcerStage) theEObject;
				T result = caseHighestPressureUlcerStage(highestPressureUlcerStage);
				if (result == null) {
					result = caseObservation(highestPressureUlcerStage);
				}
				if (result == null) {
					result = caseClinicalStatement(highestPressureUlcerStage);
				}
				if (result == null) {
					result = caseAct(highestPressureUlcerStage);
				}
				if (result == null) {
					result = caseInfrastructureRoot(highestPressureUlcerStage);
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
					result = caseEncounter(planOfCareActivityEncounter);
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
					result = caseProcedure(planOfCareActivityProcedure);
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
			case ConsolPackage.ESTIMATED_DATE_OF_DELIVERY: {
				EstimatedDateOfDelivery estimatedDateOfDelivery = (EstimatedDateOfDelivery) theEObject;
				T result = caseEstimatedDateOfDelivery(estimatedDateOfDelivery);
				if (result == null) {
					result = caseObservation(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = caseClinicalStatement(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = caseAct(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = caseInfrastructureRoot(estimatedDateOfDelivery);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SMOKING_STATUS_OBSERVATION: {
				SmokingStatusObservation smokingStatusObservation = (SmokingStatusObservation) theEObject;
				T result = caseSmokingStatusObservation(smokingStatusObservation);
				if (result == null) {
					result = caseObservation(smokingStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(smokingStatusObservation);
				}
				if (result == null) {
					result = caseAct(smokingStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(smokingStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.TOBACCO_USE: {
				TobaccoUse tobaccoUse = (TobaccoUse) theEObject;
				T result = caseTobaccoUse(tobaccoUse);
				if (result == null) {
					result = caseObservation(tobaccoUse);
				}
				if (result == null) {
					result = caseClinicalStatement(tobaccoUse);
				}
				if (result == null) {
					result = caseAct(tobaccoUse);
				}
				if (result == null) {
					result = caseInfrastructureRoot(tobaccoUse);
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
			case ConsolPackage.HISTORY_OF_PRESENT_ILLNESS_SECTION: {
				HistoryOfPresentIllnessSection historyOfPresentIllnessSection = (HistoryOfPresentIllnessSection) theEObject;
				T result = caseHistoryOfPresentIllnessSection(historyOfPresentIllnessSection);
				if (result == null) {
					result = caseSection(historyOfPresentIllnessSection);
				}
				if (result == null) {
					result = caseAct(historyOfPresentIllnessSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyOfPresentIllnessSection);
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
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS: {
				HospitalAdmissionDiagnosis hospitalAdmissionDiagnosis = (HospitalAdmissionDiagnosis) theEObject;
				T result = caseHospitalAdmissionDiagnosis(hospitalAdmissionDiagnosis);
				if (result == null) {
					result = caseCDA_Act(hospitalAdmissionDiagnosis);
				}
				if (result == null) {
					result = caseClinicalStatement(hospitalAdmissionDiagnosis);
				}
				if (result == null) {
					result = caseAct(hospitalAdmissionDiagnosis);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalAdmissionDiagnosis);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalAdmissionMedicationsSectionEntriesOptional hospitalAdmissionMedicationsSectionEntriesOptional = (HospitalAdmissionMedicationsSectionEntriesOptional) theEObject;
				T result = caseHospitalAdmissionMedicationsSectionEntriesOptional(
					hospitalAdmissionMedicationsSectionEntriesOptional);
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
			case ConsolPackage.ADMISSION_MEDICATION: {
				AdmissionMedication admissionMedication = (AdmissionMedication) theEObject;
				T result = caseAdmissionMedication(admissionMedication);
				if (result == null) {
					result = caseCDA_Act(admissionMedication);
				}
				if (result == null) {
					result = caseClinicalStatement(admissionMedication);
				}
				if (result == null) {
					result = caseAct(admissionMedication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(admissionMedication);
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
			case ConsolPackage.SURGICAL_DRAINS_SECTION: {
				SurgicalDrainsSection surgicalDrainsSection = (SurgicalDrainsSection) theEObject;
				T result = caseSurgicalDrainsSection(surgicalDrainsSection);
				if (result == null) {
					result = caseSection(surgicalDrainsSection);
				}
				if (result == null) {
					result = caseAct(surgicalDrainsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(surgicalDrainsSection);
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
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS: {
				HospitalDischargeDiagnosis hospitalDischargeDiagnosis = (HospitalDischargeDiagnosis) theEObject;
				T result = caseHospitalDischargeDiagnosis(hospitalDischargeDiagnosis);
				if (result == null) {
					result = caseCDA_Act(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = caseClinicalStatement(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeDiagnosis);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeDiagnosis);
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
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL: {
				HospitalDischargeMedicationsSectionEntriesOptional hospitalDischargeMedicationsSectionEntriesOptional = (HospitalDischargeMedicationsSectionEntriesOptional) theEObject;
				T result = caseHospitalDischargeMedicationsSectionEntriesOptional(
					hospitalDischargeMedicationsSectionEntriesOptional);
				if (result == null) {
					result = caseSection(hospitalDischargeMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeMedicationsSectionEntriesOptional);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_MEDICATION: {
				DischargeMedication dischargeMedication = (DischargeMedication) theEObject;
				T result = caseDischargeMedication(dischargeMedication);
				if (result == null) {
					result = caseCDA_Act(dischargeMedication);
				}
				if (result == null) {
					result = caseClinicalStatement(dischargeMedication);
				}
				if (result == null) {
					result = caseAct(dischargeMedication);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeMedication);
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
			case ConsolPackage.CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION: {
				ChiefComplaintAndReasonForVisitSection chiefComplaintAndReasonForVisitSection = (ChiefComplaintAndReasonForVisitSection) theEObject;
				T result = caseChiefComplaintAndReasonForVisitSection(chiefComplaintAndReasonForVisitSection);
				if (result == null) {
					result = caseSection(chiefComplaintAndReasonForVisitSection);
				}
				if (result == null) {
					result = caseAct(chiefComplaintAndReasonForVisitSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(chiefComplaintAndReasonForVisitSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_CONSULTATIONS_SECTION: {
				HospitalConsultationsSection hospitalConsultationsSection = (HospitalConsultationsSection) theEObject;
				T result = caseHospitalConsultationsSection(hospitalConsultationsSection);
				if (result == null) {
					result = caseSection(hospitalConsultationsSection);
				}
				if (result == null) {
					result = caseAct(hospitalConsultationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalConsultationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION: {
				HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection = (HospitalDischargeInstructionsSection) theEObject;
				T result = caseHospitalDischargeInstructionsSection(hospitalDischargeInstructionsSection);
				if (result == null) {
					result = caseSection(hospitalDischargeInstructionsSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeInstructionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeInstructionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_PHYSICAL_SECTION: {
				HospitalDischargePhysicalSection hospitalDischargePhysicalSection = (HospitalDischargePhysicalSection) theEObject;
				T result = caseHospitalDischargePhysicalSection(hospitalDischargePhysicalSection);
				if (result == null) {
					result = caseSection(hospitalDischargePhysicalSection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargePhysicalSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargePhysicalSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION: {
				HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection = (HospitalDischargeStudiesSummarySection) theEObject;
				T result = caseHospitalDischargeStudiesSummarySection(hospitalDischargeStudiesSummarySection);
				if (result == null) {
					result = caseSection(hospitalDischargeStudiesSummarySection);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeStudiesSummarySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeStudiesSummarySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REASON_FOR_VISIT_SECTION: {
				ReasonForVisitSection reasonForVisitSection = (ReasonForVisitSection) theEObject;
				T result = caseReasonForVisitSection(reasonForVisitSection);
				if (result == null) {
					result = caseSection(reasonForVisitSection);
				}
				if (result == null) {
					result = caseAct(reasonForVisitSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reasonForVisitSection);
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
					result = caseCriterion(preconditionForSubstanceAdministration);
				}
				if (result == null) {
					result = caseAct(preconditionForSubstanceAdministration);
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
			case ConsolPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection) theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) {
					result = caseHospitalDischargeMedicationsSectionEntriesOptional(
						hospitalDischargeMedicationsSection);
				}
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
			case ConsolPackage.ANESTHESIA_SECTION: {
				AnesthesiaSection anesthesiaSection = (AnesthesiaSection) theEObject;
				T result = caseAnesthesiaSection(anesthesiaSection);
				if (result == null) {
					result = caseSection(anesthesiaSection);
				}
				if (result == null) {
					result = caseAct(anesthesiaSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(anesthesiaSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COMPLICATIONS_SECTION: {
				ComplicationsSection complicationsSection = (ComplicationsSection) theEObject;
				T result = caseComplicationsSection(complicationsSection);
				if (result == null) {
					result = caseSection(complicationsSection);
				}
				if (result == null) {
					result = caseAct(complicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(complicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DICOM_OBJECT_CATALOG_SECTION: {
				DICOMObjectCatalogSection dicomObjectCatalogSection = (DICOMObjectCatalogSection) theEObject;
				T result = caseDICOMObjectCatalogSection(dicomObjectCatalogSection);
				if (result == null) {
					result = caseSection(dicomObjectCatalogSection);
				}
				if (result == null) {
					result = caseAct(dicomObjectCatalogSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dicomObjectCatalogSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.STUDY_ACT: {
				StudyAct studyAct = (StudyAct) theEObject;
				T result = caseStudyAct(studyAct);
				if (result == null) {
					result = caseCDA_Act(studyAct);
				}
				if (result == null) {
					result = caseClinicalStatement(studyAct);
				}
				if (result == null) {
					result = caseAct(studyAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(studyAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SERIES_ACT: {
				SeriesAct seriesAct = (SeriesAct) theEObject;
				T result = caseSeriesAct(seriesAct);
				if (result == null) {
					result = caseCDA_Act(seriesAct);
				}
				if (result == null) {
					result = caseClinicalStatement(seriesAct);
				}
				if (result == null) {
					result = caseAct(seriesAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(seriesAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOP_INSTANCE_OBSERVATION: {
				SOPInstanceObservation sopInstanceObservation = (SOPInstanceObservation) theEObject;
				T result = caseSOPInstanceObservation(sopInstanceObservation);
				if (result == null) {
					result = caseObservation(sopInstanceObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(sopInstanceObservation);
				}
				if (result == null) {
					result = caseAct(sopInstanceObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(sopInstanceObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PURPOSEOF_REFERENCE_OBSERVATION: {
				PurposeofReferenceObservation purposeofReferenceObservation = (PurposeofReferenceObservation) theEObject;
				T result = casePurposeofReferenceObservation(purposeofReferenceObservation);
				if (result == null) {
					result = caseObservation(purposeofReferenceObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(purposeofReferenceObservation);
				}
				if (result == null) {
					result = caseAct(purposeofReferenceObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(purposeofReferenceObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REFERENCED_FRAMES_OBSERVATION: {
				ReferencedFramesObservation referencedFramesObservation = (ReferencedFramesObservation) theEObject;
				T result = caseReferencedFramesObservation(referencedFramesObservation);
				if (result == null) {
					result = caseObservation(referencedFramesObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(referencedFramesObservation);
				}
				if (result == null) {
					result = caseAct(referencedFramesObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(referencedFramesObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.BOUNDARY_OBSERVATION: {
				BoundaryObservation boundaryObservation = (BoundaryObservation) theEObject;
				T result = caseBoundaryObservation(boundaryObservation);
				if (result == null) {
					result = caseObservation(boundaryObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(boundaryObservation);
				}
				if (result == null) {
					result = caseAct(boundaryObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(boundaryObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FINDINGS_SECTION: {
				FindingsSection findingsSection = (FindingsSection) theEObject;
				T result = caseFindingsSection(findingsSection);
				if (result == null) {
					result = caseSection(findingsSection);
				}
				if (result == null) {
					result = caseAct(findingsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(findingsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTERVENTIONS_SECTION: {
				InterventionsSection interventionsSection = (InterventionsSection) theEObject;
				T result = caseInterventionsSection(interventionsSection);
				if (result == null) {
					result = caseSection(interventionsSection);
				}
				if (result == null) {
					result = caseAct(interventionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(interventionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICAL_HISTORY_SECTION: {
				MedicalHistorySection medicalHistorySection = (MedicalHistorySection) theEObject;
				T result = caseMedicalHistorySection(medicalHistorySection);
				if (result == null) {
					result = caseSection(medicalHistorySection);
				}
				if (result == null) {
					result = caseAct(medicalHistorySection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalHistorySection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OBJECTIVE_SECTION: {
				ObjectiveSection objectiveSection = (ObjectiveSection) theEObject;
				T result = caseObjectiveSection(objectiveSection);
				if (result == null) {
					result = caseSection(objectiveSection);
				}
				if (result == null) {
					result = caseAct(objectiveSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(objectiveSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_FLUID_SECTION: {
				OperativeNoteFluidSection operativeNoteFluidSection = (OperativeNoteFluidSection) theEObject;
				T result = caseOperativeNoteFluidSection(operativeNoteFluidSection);
				if (result == null) {
					result = caseSection(operativeNoteFluidSection);
				}
				if (result == null) {
					result = caseAct(operativeNoteFluidSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(operativeNoteFluidSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION: {
				OperativeNoteSurgicalProcedureSection operativeNoteSurgicalProcedureSection = (OperativeNoteSurgicalProcedureSection) theEObject;
				T result = caseOperativeNoteSurgicalProcedureSection(operativeNoteSurgicalProcedureSection);
				if (result == null) {
					result = caseSection(operativeNoteSurgicalProcedureSection);
				}
				if (result == null) {
					result = caseAct(operativeNoteSurgicalProcedureSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(operativeNoteSurgicalProcedureSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_PROCEDURE_SECTION: {
				PlannedProcedureSection plannedProcedureSection = (PlannedProcedureSection) theEObject;
				T result = casePlannedProcedureSection(plannedProcedureSection);
				if (result == null) {
					result = caseSection(plannedProcedureSection);
				}
				if (result == null) {
					result = caseAct(plannedProcedureSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedProcedureSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTOPERATIVE_DIAGNOSIS_SECTION: {
				PostoperativeDiagnosisSection postoperativeDiagnosisSection = (PostoperativeDiagnosisSection) theEObject;
				T result = casePostoperativeDiagnosisSection(postoperativeDiagnosisSection);
				if (result == null) {
					result = caseSection(postoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(postoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postoperativeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION: {
				PostprocedureDiagnosisSection postprocedureDiagnosisSection = (PostprocedureDiagnosisSection) theEObject;
				T result = casePostprocedureDiagnosisSection(postprocedureDiagnosisSection);
				if (result == null) {
					result = caseSection(postprocedureDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(postprocedureDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postprocedureDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS: {
				PostprocedureDiagnosis postprocedureDiagnosis = (PostprocedureDiagnosis) theEObject;
				T result = casePostprocedureDiagnosis(postprocedureDiagnosis);
				if (result == null) {
					result = caseCDA_Act(postprocedureDiagnosis);
				}
				if (result == null) {
					result = caseClinicalStatement(postprocedureDiagnosis);
				}
				if (result == null) {
					result = caseAct(postprocedureDiagnosis);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postprocedureDiagnosis);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION: {
				PreoperativeDiagnosisSection preoperativeDiagnosisSection = (PreoperativeDiagnosisSection) theEObject;
				T result = casePreoperativeDiagnosisSection(preoperativeDiagnosisSection);
				if (result == null) {
					result = caseSection(preoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseAct(preoperativeDiagnosisSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preoperativeDiagnosisSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS: {
				PreoperativeDiagnosis preoperativeDiagnosis = (PreoperativeDiagnosis) theEObject;
				T result = casePreoperativeDiagnosis(preoperativeDiagnosis);
				if (result == null) {
					result = caseCDA_Act(preoperativeDiagnosis);
				}
				if (result == null) {
					result = caseClinicalStatement(preoperativeDiagnosis);
				}
				if (result == null) {
					result = caseAct(preoperativeDiagnosis);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preoperativeDiagnosis);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_DESCRIPTION_SECTION: {
				ProcedureDescriptionSection procedureDescriptionSection = (ProcedureDescriptionSection) theEObject;
				T result = caseProcedureDescriptionSection(procedureDescriptionSection);
				if (result == null) {
					result = caseSection(procedureDescriptionSection);
				}
				if (result == null) {
					result = caseAct(procedureDescriptionSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureDescriptionSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_DISPOSITION_SECTION: {
				ProcedureDispositionSection procedureDispositionSection = (ProcedureDispositionSection) theEObject;
				T result = caseProcedureDispositionSection(procedureDispositionSection);
				if (result == null) {
					result = caseSection(procedureDispositionSection);
				}
				if (result == null) {
					result = caseAct(procedureDispositionSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureDispositionSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION: {
				ProcedureEstimatedBloodLossSection procedureEstimatedBloodLossSection = (ProcedureEstimatedBloodLossSection) theEObject;
				T result = caseProcedureEstimatedBloodLossSection(procedureEstimatedBloodLossSection);
				if (result == null) {
					result = caseSection(procedureEstimatedBloodLossSection);
				}
				if (result == null) {
					result = caseAct(procedureEstimatedBloodLossSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureEstimatedBloodLossSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION: {
				ProcedureFindingsSection procedureFindingsSection = (ProcedureFindingsSection) theEObject;
				T result = caseProcedureFindingsSection(procedureFindingsSection);
				if (result == null) {
					result = caseSection(procedureFindingsSection);
				}
				if (result == null) {
					result = caseAct(procedureFindingsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureFindingsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_IMPLANTS_SECTION: {
				ProcedureImplantsSection procedureImplantsSection = (ProcedureImplantsSection) theEObject;
				T result = caseProcedureImplantsSection(procedureImplantsSection);
				if (result == null) {
					result = caseSection(procedureImplantsSection);
				}
				if (result == null) {
					result = caseAct(procedureImplantsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureImplantsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION: {
				ProcedureIndicationsSection procedureIndicationsSection = (ProcedureIndicationsSection) theEObject;
				T result = caseProcedureIndicationsSection(procedureIndicationsSection);
				if (result == null) {
					result = caseSection(procedureIndicationsSection);
				}
				if (result == null) {
					result = caseAct(procedureIndicationsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureIndicationsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_SPECIMENS_TAKEN_SECTION: {
				ProcedureSpecimensTakenSection procedureSpecimensTakenSection = (ProcedureSpecimensTakenSection) theEObject;
				T result = caseProcedureSpecimensTakenSection(procedureSpecimensTakenSection);
				if (result == null) {
					result = caseSection(procedureSpecimensTakenSection);
				}
				if (result == null) {
					result = caseAct(procedureSpecimensTakenSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureSpecimensTakenSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUBJECTIVE_SECTION: {
				SubjectiveSection subjectiveSection = (SubjectiveSection) theEObject;
				T result = caseSubjectiveSection(subjectiveSection);
				if (result == null) {
					result = caseSection(subjectiveSection);
				}
				if (result == null) {
					result = caseAct(subjectiveSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(subjectiveSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONSULTATION_NOTE: {
				ConsultationNote consultationNote = (ConsultationNote) theEObject;
				T result = caseConsultationNote(consultationNote);
				if (result == null) {
					result = caseGeneralHeaderConstraints(consultationNote);
				}
				if (result == null) {
					result = caseClinicalDocument(consultationNote);
				}
				if (result == null) {
					result = caseAct(consultationNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(consultationNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSESSMENT_SECTION: {
				AssessmentSection assessmentSection = (AssessmentSection) theEObject;
				T result = caseAssessmentSection(assessmentSection);
				if (result == null) {
					result = caseSection(assessmentSection);
				}
				if (result == null) {
					result = caseAct(assessmentSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE: {
				HistoryAndPhysicalNote historyAndPhysicalNote = (HistoryAndPhysicalNote) theEObject;
				T result = caseHistoryAndPhysicalNote(historyAndPhysicalNote);
				if (result == null) {
					result = caseGeneralHeaderConstraints(historyAndPhysicalNote);
				}
				if (result == null) {
					result = caseClinicalDocument(historyAndPhysicalNote);
				}
				if (result == null) {
					result = caseAct(historyAndPhysicalNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyAndPhysicalNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INSTRUCTIONS_SECTION: {
				InstructionsSection instructionsSection = (InstructionsSection) theEObject;
				T result = caseInstructionsSection(instructionsSection);
				if (result == null) {
					result = caseSection(instructionsSection);
				}
				if (result == null) {
					result = caseAct(instructionsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(instructionsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE: {
				OperativeNote operativeNote = (OperativeNote) theEObject;
				T result = caseOperativeNote(operativeNote);
				if (result == null) {
					result = caseGeneralHeaderConstraints(operativeNote);
				}
				if (result == null) {
					result = caseClinicalDocument(operativeNote);
				}
				if (result == null) {
					result = caseAct(operativeNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(operativeNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE: {
				ProcedureNote procedureNote = (ProcedureNote) theEObject;
				T result = caseProcedureNote(procedureNote);
				if (result == null) {
					result = caseGeneralHeaderConstraints(procedureNote);
				}
				if (result == null) {
					result = caseClinicalDocument(procedureNote);
				}
				if (result == null) {
					result = caseAct(procedureNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROGRESS_NOTE: {
				ProgressNote progressNote = (ProgressNote) theEObject;
				T result = caseProgressNote(progressNote);
				if (result == null) {
					result = caseGeneralHeaderConstraints(progressNote);
				}
				if (result == null) {
					result = caseClinicalDocument(progressNote);
				}
				if (result == null) {
					result = caseAct(progressNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(progressNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT: {
				DiagnosticImagingReport diagnosticImagingReport = (DiagnosticImagingReport) theEObject;
				T result = caseDiagnosticImagingReport(diagnosticImagingReport);
				if (result == null) {
					result = caseGeneralHeaderConstraints(diagnosticImagingReport);
				}
				if (result == null) {
					result = caseClinicalDocument(diagnosticImagingReport);
				}
				if (result == null) {
					result = caseAct(diagnosticImagingReport);
				}
				if (result == null) {
					result = caseInfrastructureRoot(diagnosticImagingReport);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICIAN_READING_STUDY_PERFORMER: {
				PhysicianReadingStudyPerformer physicianReadingStudyPerformer = (PhysicianReadingStudyPerformer) theEObject;
				T result = casePhysicianReadingStudyPerformer(physicianReadingStudyPerformer);
				if (result == null) {
					result = casePerformer1(physicianReadingStudyPerformer);
				}
				if (result == null) {
					result = caseParticipation(physicianReadingStudyPerformer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicianReadingStudyPerformer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICIANOF_RECORD_PARTICIPANT: {
				PhysicianofRecordParticipant physicianofRecordParticipant = (PhysicianofRecordParticipant) theEObject;
				T result = casePhysicianofRecordParticipant(physicianofRecordParticipant);
				if (result == null) {
					result = caseEncounterParticipant(physicianofRecordParticipant);
				}
				if (result == null) {
					result = caseParticipation(physicianofRecordParticipant);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicianofRecordParticipant);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.TEXT_OBSERVATION: {
				TextObservation textObservation = (TextObservation) theEObject;
				T result = caseTextObservation(textObservation);
				if (result == null) {
					result = caseObservation(textObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(textObservation);
				}
				if (result == null) {
					result = caseAct(textObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(textObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.QUANTITY_MEASUREMENT_OBSERVATION: {
				QuantityMeasurementObservation quantityMeasurementObservation = (QuantityMeasurementObservation) theEObject;
				T result = caseQuantityMeasurementObservation(quantityMeasurementObservation);
				if (result == null) {
					result = caseObservation(quantityMeasurementObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(quantityMeasurementObservation);
				}
				if (result == null) {
					result = caseAct(quantityMeasurementObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(quantityMeasurementObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CODE_OBSERVATIONS: {
				CodeObservations codeObservations = (CodeObservations) theEObject;
				T result = caseCodeObservations(codeObservations);
				if (result == null) {
					result = caseObservation(codeObservations);
				}
				if (result == null) {
					result = caseClinicalStatement(codeObservations);
				}
				if (result == null) {
					result = caseAct(codeObservations);
				}
				if (result == null) {
					result = caseInfrastructureRoot(codeObservations);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_CONTEXT: {
				ProcedureContext procedureContext = (ProcedureContext) theEObject;
				T result = caseProcedureContext(procedureContext);
				if (result == null) {
					result = caseCDA_Act(procedureContext);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureContext);
				}
				if (result == null) {
					result = caseAct(procedureContext);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureContext);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_USE_NONE_KNOWN: {
				MedicationUseNoneKnown medicationUseNoneKnown = (MedicationUseNoneKnown) theEObject;
				T result = caseMedicationUseNoneKnown(medicationUseNoneKnown);
				if (result == null) {
					result = caseObservation(medicationUseNoneKnown);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationUseNoneKnown);
				}
				if (result == null) {
					result = caseAct(medicationUseNoneKnown);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationUseNoneKnown);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DECEASED_OBSERVATION: {
				DeceasedObservation deceasedObservation = (DeceasedObservation) theEObject;
				T result = caseDeceasedObservation(deceasedObservation);
				if (result == null) {
					result = caseObservation(deceasedObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(deceasedObservation);
				}
				if (result == null) {
					result = caseAct(deceasedObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(deceasedObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FETUS_SUBJECT_CONTEXT: {
				FetusSubjectContext fetusSubjectContext = (FetusSubjectContext) theEObject;
				T result = caseFetusSubjectContext(fetusSubjectContext);
				if (result == null) {
					result = caseRelatedSubject(fetusSubjectContext);
				}
				if (result == null) {
					result = caseRole(fetusSubjectContext);
				}
				if (result == null) {
					result = caseInfrastructureRoot(fetusSubjectContext);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OBSERVER_CONTEXT: {
				ObserverContext observerContext = (ObserverContext) theEObject;
				T result = caseObserverContext(observerContext);
				if (result == null) {
					result = caseAuthor(observerContext);
				}
				if (result == null) {
					result = caseParticipation(observerContext);
				}
				if (result == null) {
					result = caseInfrastructureRoot(observerContext);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENTRY_REFERENCE: {
				EntryReference entryReference = (EntryReference) theEObject;
				T result = caseEntryReference(entryReference);
				if (result == null) {
					result = caseCDA_Act(entryReference);
				}
				if (result == null) {
					result = caseClinicalStatement(entryReference);
				}
				if (result == null) {
					result = caseAct(entryReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(entryReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_ORGANIZER: {
				AdvanceDirectiveOrganizer advanceDirectiveOrganizer = (AdvanceDirectiveOrganizer) theEObject;
				T result = caseAdvanceDirectiveOrganizer(advanceDirectiveOrganizer);
				if (result == null) {
					result = caseOrganizer(advanceDirectiveOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(advanceDirectiveOrganizer);
				}
				if (result == null) {
					result = caseAct(advanceDirectiveOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVE_OBSERVATION2: {
				AdvanceDirectiveObservation2 advanceDirectiveObservation2 = (AdvanceDirectiveObservation2) theEObject;
				T result = caseAdvanceDirectiveObservation2(advanceDirectiveObservation2);
				if (result == null) {
					result = caseAdvanceDirectiveObservation(advanceDirectiveObservation2);
				}
				if (result == null) {
					result = caseObservation(advanceDirectiveObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(advanceDirectiveObservation2);
				}
				if (result == null) {
					result = caseAct(advanceDirectiveObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectiveObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CHARACTERISTICS_OF_HOME_ENVIRONMENT: {
				CharacteristicsOfHomeEnvironment characteristicsOfHomeEnvironment = (CharacteristicsOfHomeEnvironment) theEObject;
				T result = caseCharacteristicsOfHomeEnvironment(characteristicsOfHomeEnvironment);
				if (result == null) {
					result = caseObservation(characteristicsOfHomeEnvironment);
				}
				if (result == null) {
					result = caseClinicalStatement(characteristicsOfHomeEnvironment);
				}
				if (result == null) {
					result = caseAct(characteristicsOfHomeEnvironment);
				}
				if (result == null) {
					result = caseInfrastructureRoot(characteristicsOfHomeEnvironment);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COGNITIVE_ABILITIES_OBSERVATION: {
				CognitiveAbilitiesObservation cognitiveAbilitiesObservation = (CognitiveAbilitiesObservation) theEObject;
				T result = caseCognitiveAbilitiesObservation(cognitiveAbilitiesObservation);
				if (result == null) {
					result = caseObservation(cognitiveAbilitiesObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(cognitiveAbilitiesObservation);
				}
				if (result == null) {
					result = caseAct(cognitiveAbilitiesObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(cognitiveAbilitiesObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CULTURAL_AND_RELIGIOUS_OBSERVATION: {
				CulturalAndReligiousObservation culturalAndReligiousObservation = (CulturalAndReligiousObservation) theEObject;
				T result = caseCulturalAndReligiousObservation(culturalAndReligiousObservation);
				if (result == null) {
					result = caseObservation(culturalAndReligiousObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(culturalAndReligiousObservation);
				}
				if (result == null) {
					result = caseAct(culturalAndReligiousObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(culturalAndReligiousObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DRUG_MONITORING_ACT: {
				DrugMonitoringAct drugMonitoringAct = (DrugMonitoringAct) theEObject;
				T result = caseDrugMonitoringAct(drugMonitoringAct);
				if (result == null) {
					result = caseCDA_Act(drugMonitoringAct);
				}
				if (result == null) {
					result = caseClinicalStatement(drugMonitoringAct);
				}
				if (result == null) {
					result = caseAct(drugMonitoringAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(drugMonitoringAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HANDOFF_COMMUNICATION_PARTICIPANTS: {
				HandoffCommunicationParticipants handoffCommunicationParticipants = (HandoffCommunicationParticipants) theEObject;
				T result = caseHandoffCommunicationParticipants(handoffCommunicationParticipants);
				if (result == null) {
					result = caseCDA_Act(handoffCommunicationParticipants);
				}
				if (result == null) {
					result = caseClinicalStatement(handoffCommunicationParticipants);
				}
				if (result == null) {
					result = caseAct(handoffCommunicationParticipants);
				}
				if (result == null) {
					result = caseInfrastructureRoot(handoffCommunicationParticipants);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICAL_EQUIPMENT_ORGANIZER: {
				MedicalEquipmentOrganizer medicalEquipmentOrganizer = (MedicalEquipmentOrganizer) theEObject;
				T result = caseMedicalEquipmentOrganizer(medicalEquipmentOrganizer);
				if (result == null) {
					result = caseOrganizer(medicalEquipmentOrganizer);
				}
				if (result == null) {
					result = caseClinicalStatement(medicalEquipmentOrganizer);
				}
				if (result == null) {
					result = caseAct(medicalEquipmentOrganizer);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalEquipmentOrganizer);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NON_MEDICINAL_SUPPLY_ACTIVITY2: {
				NonMedicinalSupplyActivity2 nonMedicinalSupplyActivity2 = (NonMedicinalSupplyActivity2) theEObject;
				T result = caseNonMedicinalSupplyActivity2(nonMedicinalSupplyActivity2);
				if (result == null) {
					result = caseNonMedicinalSupplyActivity(nonMedicinalSupplyActivity2);
				}
				if (result == null) {
					result = caseSupply(nonMedicinalSupplyActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(nonMedicinalSupplyActivity2);
				}
				if (result == null) {
					result = caseAct(nonMedicinalSupplyActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nonMedicinalSupplyActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INSTRUCTION2: {
				Instruction2 instruction2 = (Instruction2) theEObject;
				T result = caseInstruction2(instruction2);
				if (result == null) {
					result = caseInstructions(instruction2);
				}
				if (result == null) {
					result = caseCDA_Act(instruction2);
				}
				if (result == null) {
					result = caseClinicalStatement(instruction2);
				}
				if (result == null) {
					result = caseAct(instruction2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(instruction2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_PROCEDURE2: {
				ProcedureActivityProcedure2 procedureActivityProcedure2 = (ProcedureActivityProcedure2) theEObject;
				T result = caseProcedureActivityProcedure2(procedureActivityProcedure2);
				if (result == null) {
					result = caseProcedureActivityProcedure(procedureActivityProcedure2);
				}
				if (result == null) {
					result = caseProcedure(procedureActivityProcedure2);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityProcedure2);
				}
				if (result == null) {
					result = caseAct(procedureActivityProcedure2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityProcedure2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INDICATION2: {
				Indication2 indication2 = (Indication2) theEObject;
				T result = caseIndication2(indication2);
				if (result == null) {
					result = caseIndication(indication2);
				}
				if (result == null) {
					result = caseObservation(indication2);
				}
				if (result == null) {
					result = caseClinicalStatement(indication2);
				}
				if (result == null) {
					result = caseAct(indication2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(indication2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_ACTIVITY2: {
				MedicationActivity2 medicationActivity2 = (MedicationActivity2) theEObject;
				T result = caseMedicationActivity2(medicationActivity2);
				if (result == null) {
					result = caseMedicationActivity(medicationActivity2);
				}
				if (result == null) {
					result = caseSubstanceAdministration(medicationActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationActivity2);
				}
				if (result == null) {
					result = caseAct(medicationActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUBSTANCE_ADMINISTERED_ACT: {
				SubstanceAdministeredAct substanceAdministeredAct = (SubstanceAdministeredAct) theEObject;
				T result = caseSubstanceAdministeredAct(substanceAdministeredAct);
				if (result == null) {
					result = caseCDA_Act(substanceAdministeredAct);
				}
				if (result == null) {
					result = caseClinicalStatement(substanceAdministeredAct);
				}
				if (result == null) {
					result = caseAct(substanceAdministeredAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(substanceAdministeredAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_SUPPLY_ORDER2: {
				MedicationSupplyOrder2 medicationSupplyOrder2 = (MedicationSupplyOrder2) theEObject;
				T result = caseMedicationSupplyOrder2(medicationSupplyOrder2);
				if (result == null) {
					result = caseMedicationSupplyOrder(medicationSupplyOrder2);
				}
				if (result == null) {
					result = caseSupply(medicationSupplyOrder2);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationSupplyOrder2);
				}
				if (result == null) {
					result = caseAct(medicationSupplyOrder2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationSupplyOrder2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_DISPENSE2: {
				MedicationDispense2 medicationDispense2 = (MedicationDispense2) theEObject;
				T result = caseMedicationDispense2(medicationDispense2);
				if (result == null) {
					result = caseMedicationDispense(medicationDispense2);
				}
				if (result == null) {
					result = caseSupply(medicationDispense2);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationDispense2);
				}
				if (result == null) {
					result = caseAct(medicationDispense2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationDispense2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REACTION_OBSERVATION2: {
				ReactionObservation2 reactionObservation2 = (ReactionObservation2) theEObject;
				T result = caseReactionObservation2(reactionObservation2);
				if (result == null) {
					result = caseReactionObservation(reactionObservation2);
				}
				if (result == null) {
					result = caseObservation(reactionObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(reactionObservation2);
				}
				if (result == null) {
					result = caseAct(reactionObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reactionObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SEVERITY_OBSERVATION2: {
				SeverityObservation2 severityObservation2 = (SeverityObservation2) theEObject;
				T result = caseSeverityObservation2(severityObservation2);
				if (result == null) {
					result = caseSeverityObservation(severityObservation2);
				}
				if (result == null) {
					result = caseObservation(severityObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(severityObservation2);
				}
				if (result == null) {
					result = caseAct(severityObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(severityObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_FREE_TEXT_SIG: {
				MedicationFreeTextSig medicationFreeTextSig = (MedicationFreeTextSig) theEObject;
				T result = caseMedicationFreeTextSig(medicationFreeTextSig);
				if (result == null) {
					result = caseSubstanceAdministration(medicationFreeTextSig);
				}
				if (result == null) {
					result = caseClinicalStatement(medicationFreeTextSig);
				}
				if (result == null) {
					result = caseAct(medicationFreeTextSig);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationFreeTextSig);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MENTAL_STATUS_OBSERVATION: {
				MentalStatusObservation mentalStatusObservation = (MentalStatusObservation) theEObject;
				T result = caseMentalStatusObservation(mentalStatusObservation);
				if (result == null) {
					result = caseObservation(mentalStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(mentalStatusObservation);
				}
				if (result == null) {
					result = caseAct(mentalStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(mentalStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NUTRITION_ASSESSMENT: {
				NutritionAssessment nutritionAssessment = (NutritionAssessment) theEObject;
				T result = caseNutritionAssessment(nutritionAssessment);
				if (result == null) {
					result = caseObservation(nutritionAssessment);
				}
				if (result == null) {
					result = caseClinicalStatement(nutritionAssessment);
				}
				if (result == null) {
					result = caseAct(nutritionAssessment);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nutritionAssessment);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NUTRITION_RECOMMENDATION: {
				NutritionRecommendation nutritionRecommendation = (NutritionRecommendation) theEObject;
				T result = caseNutritionRecommendation(nutritionRecommendation);
				if (result == null) {
					result = caseCDA_Act(nutritionRecommendation);
				}
				if (result == null) {
					result = caseClinicalStatement(nutritionRecommendation);
				}
				if (result == null) {
					result = caseAct(nutritionRecommendation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nutritionRecommendation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_ENCOUNTER2: {
				PlannedEncounter2 plannedEncounter2 = (PlannedEncounter2) theEObject;
				T result = casePlannedEncounter2(plannedEncounter2);
				if (result == null) {
					result = casePlanOfCareActivityEncounter(plannedEncounter2);
				}
				if (result == null) {
					result = caseEncounter(plannedEncounter2);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedEncounter2);
				}
				if (result == null) {
					result = caseAct(plannedEncounter2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedEncounter2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRIORITY_PREFERENCE: {
				PriorityPreference priorityPreference = (PriorityPreference) theEObject;
				T result = casePriorityPreference(priorityPreference);
				if (result == null) {
					result = caseObservation(priorityPreference);
				}
				if (result == null) {
					result = caseClinicalStatement(priorityPreference);
				}
				if (result == null) {
					result = caseAct(priorityPreference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(priorityPreference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_MEDICATION_ACTIVITY2: {
				PlannedMedicationActivity2 plannedMedicationActivity2 = (PlannedMedicationActivity2) theEObject;
				T result = casePlannedMedicationActivity2(plannedMedicationActivity2);
				if (result == null) {
					result = casePlanOfCareActivitySubstanceAdministration(plannedMedicationActivity2);
				}
				if (result == null) {
					result = caseSubstanceAdministration(plannedMedicationActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedMedicationActivity2);
				}
				if (result == null) {
					result = caseAct(plannedMedicationActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedMedicationActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_OBSERVATION2: {
				PlannedObservation2 plannedObservation2 = (PlannedObservation2) theEObject;
				T result = casePlannedObservation2(plannedObservation2);
				if (result == null) {
					result = casePlanOfCareActivityObservation(plannedObservation2);
				}
				if (result == null) {
					result = caseObservation(plannedObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedObservation2);
				}
				if (result == null) {
					result = caseAct(plannedObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_COVERAGE: {
				PlannedCoverage plannedCoverage = (PlannedCoverage) theEObject;
				T result = casePlannedCoverage(plannedCoverage);
				if (result == null) {
					result = caseCDA_Act(plannedCoverage);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedCoverage);
				}
				if (result == null) {
					result = caseAct(plannedCoverage);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedCoverage);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_PROCEDURE2: {
				PlannedProcedure2 plannedProcedure2 = (PlannedProcedure2) theEObject;
				T result = casePlannedProcedure2(plannedProcedure2);
				if (result == null) {
					result = casePlanOfCareActivityProcedure(plannedProcedure2);
				}
				if (result == null) {
					result = caseProcedure(plannedProcedure2);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedProcedure2);
				}
				if (result == null) {
					result = caseAct(plannedProcedure2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedProcedure2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_SUPPLY2: {
				PlannedSupply2 plannedSupply2 = (PlannedSupply2) theEObject;
				T result = casePlannedSupply2(plannedSupply2);
				if (result == null) {
					result = casePlanOfCareActivitySupply(plannedSupply2);
				}
				if (result == null) {
					result = caseSupply(plannedSupply2);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedSupply2);
				}
				if (result == null) {
					result = caseAct(plannedSupply2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedSupply2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_ACT2: {
				PlannedAct2 plannedAct2 = (PlannedAct2) theEObject;
				T result = casePlannedAct2(plannedAct2);
				if (result == null) {
					result = casePlanOfCareActivityAct(plannedAct2);
				}
				if (result == null) {
					result = caseCDA_Act(plannedAct2);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedAct2);
				}
				if (result == null) {
					result = caseAct(plannedAct2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedAct2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NUTRITIONAL_STATUS_OBSERVATION: {
				NutritionalStatusObservation nutritionalStatusObservation = (NutritionalStatusObservation) theEObject;
				T result = caseNutritionalStatusObservation(nutritionalStatusObservation);
				if (result == null) {
					result = caseObservation(nutritionalStatusObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(nutritionalStatusObservation);
				}
				if (result == null) {
					result = caseAct(nutritionalStatusObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nutritionalStatusObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OUTCOME_OBSERVATION: {
				OutcomeObservation outcomeObservation = (OutcomeObservation) theEObject;
				T result = caseOutcomeObservation(outcomeObservation);
				if (result == null) {
					result = caseObservation(outcomeObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(outcomeObservation);
				}
				if (result == null) {
					result = caseAct(outcomeObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(outcomeObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROGRESS_TOWARD_GOAL_OBSERVATION: {
				ProgressTowardGoalObservation progressTowardGoalObservation = (ProgressTowardGoalObservation) theEObject;
				T result = caseProgressTowardGoalObservation(progressTowardGoalObservation);
				if (result == null) {
					result = caseObservation(progressTowardGoalObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(progressTowardGoalObservation);
				}
				if (result == null) {
					result = caseAct(progressTowardGoalObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(progressTowardGoalObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PATIENT_REFERRAL_ACT: {
				PatientReferralAct patientReferralAct = (PatientReferralAct) theEObject;
				T result = casePatientReferralAct(patientReferralAct);
				if (result == null) {
					result = caseCDA_Act(patientReferralAct);
				}
				if (result == null) {
					result = caseClinicalStatement(patientReferralAct);
				}
				if (result == null) {
					result = caseAct(patientReferralAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(patientReferralAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GOAL_OBSERVATION: {
				GoalObservation goalObservation = (GoalObservation) theEObject;
				T result = caseGoalObservation(goalObservation);
				if (result == null) {
					result = caseObservation(goalObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(goalObservation);
				}
				if (result == null) {
					result = caseAct(goalObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(goalObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTH_CONCERN_ACT: {
				HealthConcernAct healthConcernAct = (HealthConcernAct) theEObject;
				T result = caseHealthConcernAct(healthConcernAct);
				if (result == null) {
					result = caseCDA_Act(healthConcernAct);
				}
				if (result == null) {
					result = caseClinicalStatement(healthConcernAct);
				}
				if (result == null) {
					result = caseAct(healthConcernAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthConcernAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_ORGANIZER2: {
				FamilyHistoryOrganizer2 familyHistoryOrganizer2 = (FamilyHistoryOrganizer2) theEObject;
				T result = caseFamilyHistoryOrganizer2(familyHistoryOrganizer2);
				if (result == null) {
					result = caseFamilyHistoryOrganizer(familyHistoryOrganizer2);
				}
				if (result == null) {
					result = caseOrganizer(familyHistoryOrganizer2);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryOrganizer2);
				}
				if (result == null) {
					result = caseAct(familyHistoryOrganizer2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryOrganizer2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_OBSERVATION2: {
				FamilyHistoryObservation2 familyHistoryObservation2 = (FamilyHistoryObservation2) theEObject;
				T result = caseFamilyHistoryObservation2(familyHistoryObservation2);
				if (result == null) {
					result = caseFamilyHistoryObservation(familyHistoryObservation2);
				}
				if (result == null) {
					result = caseObservation(familyHistoryObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(familyHistoryObservation2);
				}
				if (result == null) {
					result = caseAct(familyHistoryObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistoryObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SELF_CARE_ACTIVITIES: {
				SelfCareActivities selfCareActivities = (SelfCareActivities) theEObject;
				T result = caseSelfCareActivities(selfCareActivities);
				if (result == null) {
					result = caseObservation(selfCareActivities);
				}
				if (result == null) {
					result = caseClinicalStatement(selfCareActivities);
				}
				if (result == null) {
					result = caseAct(selfCareActivities);
				}
				if (result == null) {
					result = caseInfrastructureRoot(selfCareActivities);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SENSORY_STATUS: {
				SensoryStatus sensoryStatus = (SensoryStatus) theEObject;
				T result = caseSensoryStatus(sensoryStatus);
				if (result == null) {
					result = caseObservation(sensoryStatus);
				}
				if (result == null) {
					result = caseClinicalStatement(sensoryStatus);
				}
				if (result == null) {
					result = caseAct(sensoryStatus);
				}
				if (result == null) {
					result = caseInfrastructureRoot(sensoryStatus);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.LONGITUDINAL_CARE_WOUND_OBSERVATION: {
				LongitudinalCareWoundObservation longitudinalCareWoundObservation = (LongitudinalCareWoundObservation) theEObject;
				T result = caseLongitudinalCareWoundObservation(longitudinalCareWoundObservation);
				if (result == null) {
					result = caseProblemObservation2(longitudinalCareWoundObservation);
				}
				if (result == null) {
					result = caseProblemObservation(longitudinalCareWoundObservation);
				}
				if (result == null) {
					result = caseObservation(longitudinalCareWoundObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(longitudinalCareWoundObservation);
				}
				if (result == null) {
					result = caseAct(longitudinalCareWoundObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(longitudinalCareWoundObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_OBSERVATION2: {
				ProblemObservation2 problemObservation2 = (ProblemObservation2) theEObject;
				T result = caseProblemObservation2(problemObservation2);
				if (result == null) {
					result = caseProblemObservation(problemObservation2);
				}
				if (result == null) {
					result = caseObservation(problemObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(problemObservation2);
				}
				if (result == null) {
					result = caseAct(problemObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROGNOSIS_OBSERVATION: {
				PrognosisObservation prognosisObservation = (PrognosisObservation) theEObject;
				T result = casePrognosisObservation(prognosisObservation);
				if (result == null) {
					result = caseObservation(prognosisObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(prognosisObservation);
				}
				if (result == null) {
					result = caseAct(prognosisObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(prognosisObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.WOUND_MEASUREMENT_OBSERVATION: {
				WoundMeasurementObservation woundMeasurementObservation = (WoundMeasurementObservation) theEObject;
				T result = caseWoundMeasurementObservation(woundMeasurementObservation);
				if (result == null) {
					result = caseObservation(woundMeasurementObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(woundMeasurementObservation);
				}
				if (result == null) {
					result = caseAct(woundMeasurementObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(woundMeasurementObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.WOUND_CHARACTERISTIC: {
				WoundCharacteristic woundCharacteristic = (WoundCharacteristic) theEObject;
				T result = caseWoundCharacteristic(woundCharacteristic);
				if (result == null) {
					result = caseObservation(woundCharacteristic);
				}
				if (result == null) {
					result = caseClinicalStatement(woundCharacteristic);
				}
				if (result == null) {
					result = caseAct(woundCharacteristic);
				}
				if (result == null) {
					result = caseInfrastructureRoot(woundCharacteristic);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NUMBER_OF_PRESSURE_ULCERS_OBSERVATION2: {
				NumberOfPressureUlcersObservation2 numberOfPressureUlcersObservation2 = (NumberOfPressureUlcersObservation2) theEObject;
				T result = caseNumberOfPressureUlcersObservation2(numberOfPressureUlcersObservation2);
				if (result == null) {
					result = caseNumberOfPressureUlcersObservation(numberOfPressureUlcersObservation2);
				}
				if (result == null) {
					result = caseObservation(numberOfPressureUlcersObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(numberOfPressureUlcersObservation2);
				}
				if (result == null) {
					result = caseAct(numberOfPressureUlcersObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(numberOfPressureUlcersObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_OBSERVATION2: {
				AllergyObservation2 allergyObservation2 = (AllergyObservation2) theEObject;
				T result = caseAllergyObservation2(allergyObservation2);
				if (result == null) {
					result = caseAllergyObservation(allergyObservation2);
				}
				if (result == null) {
					result = caseSubstanceOrDeviceAllergyObservation(allergyObservation2);
				}
				if (result == null) {
					result = caseObservation(allergyObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyObservation2);
				}
				if (result == null) {
					result = caseAct(allergyObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CRITICALITY_OBSERVATION: {
				CriticalityObservation criticalityObservation = (CriticalityObservation) theEObject;
				T result = caseCriticalityObservation(criticalityObservation);
				if (result == null) {
					result = caseObservation(criticalityObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(criticalityObservation);
				}
				if (result == null) {
					result = caseAct(criticalityObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(criticalityObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MENTAL_STATUS_OBSERVATION2: {
				MentalStatusObservation2 mentalStatusObservation2 = (MentalStatusObservation2) theEObject;
				T result = caseMentalStatusObservation2(mentalStatusObservation2);
				if (result == null) {
					result = caseObservation(mentalStatusObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(mentalStatusObservation2);
				}
				if (result == null) {
					result = caseAct(mentalStatusObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(mentalStatusObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SMOKING_STATUS_MEANINGFUL_USE2: {
				SmokingStatusMeaningfulUse2 smokingStatusMeaningfulUse2 = (SmokingStatusMeaningfulUse2) theEObject;
				T result = caseSmokingStatusMeaningfulUse2(smokingStatusMeaningfulUse2);
				if (result == null) {
					result = caseSmokingStatusObservation(smokingStatusMeaningfulUse2);
				}
				if (result == null) {
					result = caseObservation(smokingStatusMeaningfulUse2);
				}
				if (result == null) {
					result = caseClinicalStatement(smokingStatusMeaningfulUse2);
				}
				if (result == null) {
					result = caseAct(smokingStatusMeaningfulUse2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(smokingStatusMeaningfulUse2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_DIAGNOSIS2: {
				EncounterDiagnosis2 encounterDiagnosis2 = (EncounterDiagnosis2) theEObject;
				T result = caseEncounterDiagnosis2(encounterDiagnosis2);
				if (result == null) {
					result = caseEncounterDiagnosis(encounterDiagnosis2);
				}
				if (result == null) {
					result = caseCDA_Act(encounterDiagnosis2);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterDiagnosis2);
				}
				if (result == null) {
					result = caseAct(encounterDiagnosis2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterDiagnosis2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_OBSERVATION2: {
				FunctionalStatusObservation2 functionalStatusObservation2 = (FunctionalStatusObservation2) theEObject;
				T result = caseFunctionalStatusObservation2(functionalStatusObservation2);
				if (result == null) {
					result = caseFunctionalStatusResultObservation(functionalStatusObservation2);
				}
				if (result == null) {
					result = caseResultObservation(functionalStatusObservation2);
				}
				if (result == null) {
					result = caseObservation(functionalStatusObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(functionalStatusObservation2);
				}
				if (result == null) {
					result = caseAct(functionalStatusObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_ADMISSION_DIAGNOSIS2: {
				HospitalAdmissionDiagnosis2 hospitalAdmissionDiagnosis2 = (HospitalAdmissionDiagnosis2) theEObject;
				T result = caseHospitalAdmissionDiagnosis2(hospitalAdmissionDiagnosis2);
				if (result == null) {
					result = caseHospitalAdmissionDiagnosis(hospitalAdmissionDiagnosis2);
				}
				if (result == null) {
					result = caseCDA_Act(hospitalAdmissionDiagnosis2);
				}
				if (result == null) {
					result = caseClinicalStatement(hospitalAdmissionDiagnosis2);
				}
				if (result == null) {
					result = caseAct(hospitalAdmissionDiagnosis2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalAdmissionDiagnosis2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS2: {
				PostprocedureDiagnosis2 postprocedureDiagnosis2 = (PostprocedureDiagnosis2) theEObject;
				T result = casePostprocedureDiagnosis2(postprocedureDiagnosis2);
				if (result == null) {
					result = casePostprocedureDiagnosis(postprocedureDiagnosis2);
				}
				if (result == null) {
					result = caseCDA_Act(postprocedureDiagnosis2);
				}
				if (result == null) {
					result = caseClinicalStatement(postprocedureDiagnosis2);
				}
				if (result == null) {
					result = caseAct(postprocedureDiagnosis2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postprocedureDiagnosis2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS2: {
				PreoperativeDiagnosis2 preoperativeDiagnosis2 = (PreoperativeDiagnosis2) theEObject;
				T result = casePreoperativeDiagnosis2(preoperativeDiagnosis2);
				if (result == null) {
					result = casePreoperativeDiagnosis(preoperativeDiagnosis2);
				}
				if (result == null) {
					result = caseCDA_Act(preoperativeDiagnosis2);
				}
				if (result == null) {
					result = caseClinicalStatement(preoperativeDiagnosis2);
				}
				if (result == null) {
					result = caseAct(preoperativeDiagnosis2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preoperativeDiagnosis2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULT_OBSERVATION2: {
				ResultObservation2 resultObservation2 = (ResultObservation2) theEObject;
				T result = caseResultObservation2(resultObservation2);
				if (result == null) {
					result = caseResultObservation(resultObservation2);
				}
				if (result == null) {
					result = caseObservation(resultObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(resultObservation2);
				}
				if (result == null) {
					result = caseAct(resultObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_OBSERVATION2: {
				SocialHistoryObservation2 socialHistoryObservation2 = (SocialHistoryObservation2) theEObject;
				T result = caseSocialHistoryObservation2(socialHistoryObservation2);
				if (result == null) {
					result = caseSocialHistoryObservation(socialHistoryObservation2);
				}
				if (result == null) {
					result = caseObservation(socialHistoryObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(socialHistoryObservation2);
				}
				if (result == null) {
					result = caseAct(socialHistoryObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistoryObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2: {
				SubstanceOrDeviceAllergyObservation2 substanceOrDeviceAllergyObservation2 = (SubstanceOrDeviceAllergyObservation2) theEObject;
				T result = caseSubstanceOrDeviceAllergyObservation2(substanceOrDeviceAllergyObservation2);
				if (result == null) {
					result = caseSubstanceOrDeviceAllergyObservation(substanceOrDeviceAllergyObservation2);
				}
				if (result == null) {
					result = caseObservation(substanceOrDeviceAllergyObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(substanceOrDeviceAllergyObservation2);
				}
				if (result == null) {
					result = caseAct(substanceOrDeviceAllergyObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(substanceOrDeviceAllergyObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.TOBACCO_USE2: {
				TobaccoUse2 tobaccoUse2 = (TobaccoUse2) theEObject;
				T result = caseTobaccoUse2(tobaccoUse2);
				if (result == null) {
					result = caseTobaccoUse(tobaccoUse2);
				}
				if (result == null) {
					result = caseObservation(tobaccoUse2);
				}
				if (result == null) {
					result = caseClinicalStatement(tobaccoUse2);
				}
				if (result == null) {
					result = caseAct(tobaccoUse2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(tobaccoUse2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGN_OBSERVATION2: {
				VitalSignObservation2 vitalSignObservation2 = (VitalSignObservation2) theEObject;
				T result = caseVitalSignObservation2(vitalSignObservation2);
				if (result == null) {
					result = caseVitalSignObservation(vitalSignObservation2);
				}
				if (result == null) {
					result = caseObservation(vitalSignObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignObservation2);
				}
				if (result == null) {
					result = caseAct(vitalSignObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULT_ORGANIZER2: {
				ResultOrganizer2 resultOrganizer2 = (ResultOrganizer2) theEObject;
				T result = caseResultOrganizer2(resultOrganizer2);
				if (result == null) {
					result = caseResultOrganizer(resultOrganizer2);
				}
				if (result == null) {
					result = caseOrganizer(resultOrganizer2);
				}
				if (result == null) {
					result = caseClinicalStatement(resultOrganizer2);
				}
				if (result == null) {
					result = caseAct(resultOrganizer2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultOrganizer2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_CONCERN_ACT2: {
				ProblemConcernAct2 problemConcernAct2 = (ProblemConcernAct2) theEObject;
				T result = caseProblemConcernAct2(problemConcernAct2);
				if (result == null) {
					result = caseProblemConcernAct(problemConcernAct2);
				}
				if (result == null) {
					result = caseCDA_Act(problemConcernAct2);
				}
				if (result == null) {
					result = caseClinicalStatement(problemConcernAct2);
				}
				if (result == null) {
					result = caseAct(problemConcernAct2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemConcernAct2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTERVENTION_ACT: {
				InterventionAct interventionAct = (InterventionAct) theEObject;
				T result = caseInterventionAct(interventionAct);
				if (result == null) {
					result = caseCDA_Act(interventionAct);
				}
				if (result == null) {
					result = caseClinicalStatement(interventionAct);
				}
				if (result == null) {
					result = caseAct(interventionAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(interventionAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_ACTIVITY2: {
				ImmunizationActivity2 immunizationActivity2 = (ImmunizationActivity2) theEObject;
				T result = caseImmunizationActivity2(immunizationActivity2);
				if (result == null) {
					result = caseImmunizationActivity(immunizationActivity2);
				}
				if (result == null) {
					result = caseSubstanceAdministration(immunizationActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(immunizationActivity2);
				}
				if (result == null) {
					result = caseAct(immunizationActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_ACT2: {
				ProcedureActivityAct2 procedureActivityAct2 = (ProcedureActivityAct2) theEObject;
				T result = caseProcedureActivityAct2(procedureActivityAct2);
				if (result == null) {
					result = caseProcedureActivityAct(procedureActivityAct2);
				}
				if (result == null) {
					result = caseCDA_Act(procedureActivityAct2);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityAct2);
				}
				if (result == null) {
					result = caseAct(procedureActivityAct2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityAct2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_ACTIVITY_OBSERVATION2: {
				ProcedureActivityObservation2 procedureActivityObservation2 = (ProcedureActivityObservation2) theEObject;
				T result = caseProcedureActivityObservation2(procedureActivityObservation2);
				if (result == null) {
					result = caseProcedureActivityObservation(procedureActivityObservation2);
				}
				if (result == null) {
					result = caseObservation(procedureActivityObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(procedureActivityObservation2);
				}
				if (result == null) {
					result = caseAct(procedureActivityObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureActivityObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTER_ACTIVITY2: {
				EncounterActivity2 encounterActivity2 = (EncounterActivity2) theEObject;
				T result = caseEncounterActivity2(encounterActivity2);
				if (result == null) {
					result = caseEncounterActivities(encounterActivity2);
				}
				if (result == null) {
					result = caseEncounter(encounterActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(encounterActivity2);
				}
				if (result == null) {
					result = caseAct(encounterActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encounterActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_INTERVENTION_ACT: {
				PlannedInterventionAct plannedInterventionAct = (PlannedInterventionAct) theEObject;
				T result = casePlannedInterventionAct(plannedInterventionAct);
				if (result == null) {
					result = caseCDA_Act(plannedInterventionAct);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedInterventionAct);
				}
				if (result == null) {
					result = caseAct(plannedInterventionAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedInterventionAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_IMMUNIZATION_ACTIVITY: {
				PlannedImmunizationActivity plannedImmunizationActivity = (PlannedImmunizationActivity) theEObject;
				T result = casePlannedImmunizationActivity(plannedImmunizationActivity);
				if (result == null) {
					result = caseSubstanceAdministration(plannedImmunizationActivity);
				}
				if (result == null) {
					result = caseClinicalStatement(plannedImmunizationActivity);
				}
				if (result == null) {
					result = caseAct(plannedImmunizationActivity);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedImmunizationActivity);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.EXTERNAL_DOCUMENT_REFERENCE: {
				ExternalDocumentReference externalDocumentReference = (ExternalDocumentReference) theEObject;
				T result = caseExternalDocumentReference(externalDocumentReference);
				if (result == null) {
					result = caseExternalDocument(externalDocumentReference);
				}
				if (result == null) {
					result = caseAct(externalDocumentReference);
				}
				if (result == null) {
					result = caseInfrastructureRoot(externalDocumentReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.GOALS_SECTION: {
				GoalsSection goalsSection = (GoalsSection) theEObject;
				T result = caseGoalsSection(goalsSection);
				if (result == null) {
					result = caseSection(goalsSection);
				}
				if (result == null) {
					result = caseAct(goalsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(goalsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTH_CONCERNS_SECTION: {
				HealthConcernsSection healthConcernsSection = (HealthConcernsSection) theEObject;
				T result = caseHealthConcernsSection(healthConcernsSection);
				if (result == null) {
					result = caseSection(healthConcernsSection);
				}
				if (result == null) {
					result = caseAct(healthConcernsSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthConcernsSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTH_STATUS_OBSERVATION2: {
				HealthStatusObservation2 healthStatusObservation2 = (HealthStatusObservation2) theEObject;
				T result = caseHealthStatusObservation2(healthStatusObservation2);
				if (result == null) {
					result = caseHealthStatusObservation(healthStatusObservation2);
				}
				if (result == null) {
					result = caseObservation(healthStatusObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(healthStatusObservation2);
				}
				if (result == null) {
					result = caseAct(healthStatusObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthStatusObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RISK_CONCERN_ACT: {
				RiskConcernAct riskConcernAct = (RiskConcernAct) theEObject;
				T result = caseRiskConcernAct(riskConcernAct);
				if (result == null) {
					result = caseCDA_Act(riskConcernAct);
				}
				if (result == null) {
					result = caseClinicalStatement(riskConcernAct);
				}
				if (result == null) {
					result = caseAct(riskConcernAct);
				}
				if (result == null) {
					result = caseInfrastructureRoot(riskConcernAct);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HEALTH_STATUS_EVALUATIONS_AND_OUTCOMES_SECTION: {
				HealthStatusEvaluationsAndOutcomesSection healthStatusEvaluationsAndOutcomesSection = (HealthStatusEvaluationsAndOutcomesSection) theEObject;
				T result = caseHealthStatusEvaluationsAndOutcomesSection(healthStatusEvaluationsAndOutcomesSection);
				if (result == null) {
					result = caseSection(healthStatusEvaluationsAndOutcomesSection);
				}
				if (result == null) {
					result = caseAct(healthStatusEvaluationsAndOutcomesSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(healthStatusEvaluationsAndOutcomesSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MENTAL_STATUS_SECTION: {
				MentalStatusSection mentalStatusSection = (MentalStatusSection) theEObject;
				T result = caseMentalStatusSection(mentalStatusSection);
				if (result == null) {
					result = caseSection(mentalStatusSection);
				}
				if (result == null) {
					result = caseAct(mentalStatusSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(mentalStatusSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MENTAL_STATUS_ORGANIZER2: {
				MentalStatusOrganizer2 mentalStatusOrganizer2 = (MentalStatusOrganizer2) theEObject;
				T result = caseMentalStatusOrganizer2(mentalStatusOrganizer2);
				if (result == null) {
					result = caseCognitiveStatusResultOrganizer(mentalStatusOrganizer2);
				}
				if (result == null) {
					result = caseResultOrganizer(mentalStatusOrganizer2);
				}
				if (result == null) {
					result = caseOrganizer(mentalStatusOrganizer2);
				}
				if (result == null) {
					result = caseClinicalStatement(mentalStatusOrganizer2);
				}
				if (result == null) {
					result = caseAct(mentalStatusOrganizer2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(mentalStatusOrganizer2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.NUTRITION_SECTION: {
				NutritionSection nutritionSection = (NutritionSection) theEObject;
				T result = caseNutritionSection(nutritionSection);
				if (result == null) {
					result = caseSection(nutritionSection);
				}
				if (result == null) {
					result = caseAct(nutritionSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(nutritionSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICAL_FINDINGS_OF_SKIN_SECTION: {
				PhysicalFindingsOfSkinSection physicalFindingsOfSkinSection = (PhysicalFindingsOfSkinSection) theEObject;
				T result = casePhysicalFindingsOfSkinSection(physicalFindingsOfSkinSection);
				if (result == null) {
					result = caseSection(physicalFindingsOfSkinSection);
				}
				if (result == null) {
					result = caseAct(physicalFindingsOfSkinSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicalFindingsOfSkinSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.US_REALM_HEADER2: {
				USRealmHeader2 usRealmHeader2 = (USRealmHeader2) theEObject;
				T result = caseUSRealmHeader2(usRealmHeader2);
				if (result == null) {
					result = caseGeneralHeaderConstraints(usRealmHeader2);
				}
				if (result == null) {
					result = caseClinicalDocument(usRealmHeader2);
				}
				if (result == null) {
					result = caseAct(usRealmHeader2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(usRealmHeader2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CARE_PLAN: {
				CarePlan carePlan = (CarePlan) theEObject;
				T result = caseCarePlan(carePlan);
				if (result == null) {
					result = caseUSRealmHeader2(carePlan);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(carePlan);
				}
				if (result == null) {
					result = caseClinicalDocument(carePlan);
				}
				if (result == null) {
					result = caseAct(carePlan);
				}
				if (result == null) {
					result = caseInfrastructureRoot(carePlan);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INTERVENTIONS_SECTION2: {
				InterventionsSection2 interventionsSection2 = (InterventionsSection2) theEObject;
				T result = caseInterventionsSection2(interventionsSection2);
				if (result == null) {
					result = caseInterventionsSection(interventionsSection2);
				}
				if (result == null) {
					result = caseSection(interventionsSection2);
				}
				if (result == null) {
					result = caseAct(interventionsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(interventionsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REFERRAL_NOTE: {
				ReferralNote referralNote = (ReferralNote) theEObject;
				T result = caseReferralNote(referralNote);
				if (result == null) {
					result = caseUSRealmHeader2(referralNote);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(referralNote);
				}
				if (result == null) {
					result = caseClinicalDocument(referralNote);
				}
				if (result == null) {
					result = caseAct(referralNote);
				}
				if (result == null) {
					result = caseInfrastructureRoot(referralNote);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLAN_OF_TREATMENT_SECTION2: {
				PlanOfTreatmentSection2 planOfTreatmentSection2 = (PlanOfTreatmentSection2) theEObject;
				T result = casePlanOfTreatmentSection2(planOfTreatmentSection2);
				if (result == null) {
					result = casePlanOfCareSection(planOfTreatmentSection2);
				}
				if (result == null) {
					result = caseSection(planOfTreatmentSection2);
				}
				if (result == null) {
					result = caseAct(planOfTreatmentSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(planOfTreatmentSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2: {
				AdvanceDirectivesSectionEntriesOptional2 advanceDirectivesSectionEntriesOptional2 = (AdvanceDirectivesSectionEntriesOptional2) theEObject;
				T result = caseAdvanceDirectivesSectionEntriesOptional2(advanceDirectivesSectionEntriesOptional2);
				if (result == null) {
					result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(advanceDirectivesSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(advanceDirectivesSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectivesSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION2: {
				ImmunizationsSection2 immunizationsSection2 = (ImmunizationsSection2) theEObject;
				T result = caseImmunizationsSection2(immunizationsSection2);
				if (result == null) {
					result = caseImmunizationsSectionEntriesOptional2(immunizationsSection2);
				}
				if (result == null) {
					result = caseImmunizationsSectionEntriesOptional(immunizationsSection2);
				}
				if (result == null) {
					result = caseSection(immunizationsSection2);
				}
				if (result == null) {
					result = caseAct(immunizationsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2: {
				ImmunizationsSectionEntriesOptional2 immunizationsSectionEntriesOptional2 = (ImmunizationsSectionEntriesOptional2) theEObject;
				T result = caseImmunizationsSectionEntriesOptional2(immunizationsSectionEntriesOptional2);
				if (result == null) {
					result = caseImmunizationsSectionEntriesOptional(immunizationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(immunizationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(immunizationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION2: {
				ProblemSection2 problemSection2 = (ProblemSection2) theEObject;
				T result = caseProblemSection2(problemSection2);
				if (result == null) {
					result = caseProblemSectionEntriesOptional2(problemSection2);
				}
				if (result == null) {
					result = caseProblemSectionEntriesOptional(problemSection2);
				}
				if (result == null) {
					result = caseSection(problemSection2);
				}
				if (result == null) {
					result = caseAct(problemSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROBLEM_SECTION_ENTRIES_OPTIONAL2: {
				ProblemSectionEntriesOptional2 problemSectionEntriesOptional2 = (ProblemSectionEntriesOptional2) theEObject;
				T result = caseProblemSectionEntriesOptional2(problemSectionEntriesOptional2);
				if (result == null) {
					result = caseProblemSectionEntriesOptional(problemSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(problemSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(problemSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(problemSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION_ENTRIES_OPTIONAL2: {
				ProceduresSectionEntriesOptional2 proceduresSectionEntriesOptional2 = (ProceduresSectionEntriesOptional2) theEObject;
				T result = caseProceduresSectionEntriesOptional2(proceduresSectionEntriesOptional2);
				if (result == null) {
					result = caseProceduresSectionEntriesOptional(proceduresSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(proceduresSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(proceduresSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULTS_SECTION2: {
				ResultsSection2 resultsSection2 = (ResultsSection2) theEObject;
				T result = caseResultsSection2(resultsSection2);
				if (result == null) {
					result = caseResultsSectionEntriesOptional2(resultsSection2);
				}
				if (result == null) {
					result = caseResultsSectionEntriesOptional(resultsSection2);
				}
				if (result == null) {
					result = caseSection(resultsSection2);
				}
				if (result == null) {
					result = caseAct(resultsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.RESULTS_SECTION_ENTRIES_OPTIONAL2: {
				ResultsSectionEntriesOptional2 resultsSectionEntriesOptional2 = (ResultsSectionEntriesOptional2) theEObject;
				T result = caseResultsSectionEntriesOptional2(resultsSectionEntriesOptional2);
				if (result == null) {
					result = caseResultsSectionEntriesOptional(resultsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(resultsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(resultsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(resultsSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.SOCIAL_HISTORY_SECTION2: {
				SocialHistorySection2 socialHistorySection2 = (SocialHistorySection2) theEObject;
				T result = caseSocialHistorySection2(socialHistorySection2);
				if (result == null) {
					result = caseSocialHistorySection(socialHistorySection2);
				}
				if (result == null) {
					result = caseSection(socialHistorySection2);
				}
				if (result == null) {
					result = caseAct(socialHistorySection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(socialHistorySection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.BIRTH_SEX_OBSERVATION: {
				BirthSexObservation birthSexObservation = (BirthSexObservation) theEObject;
				T result = caseBirthSexObservation(birthSexObservation);
				if (result == null) {
					result = caseObservation(birthSexObservation);
				}
				if (result == null) {
					result = caseClinicalStatement(birthSexObservation);
				}
				if (result == null) {
					result = caseAct(birthSexObservation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(birthSexObservation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION2: {
				VitalSignsSection2 vitalSignsSection2 = (VitalSignsSection2) theEObject;
				T result = caseVitalSignsSection2(vitalSignsSection2);
				if (result == null) {
					result = caseVitalSignsSectionEntriesOptional2(vitalSignsSection2);
				}
				if (result == null) {
					result = caseVitalSignsSectionEntriesOptional(vitalSignsSection2);
				}
				if (result == null) {
					result = caseSection(vitalSignsSection2);
				}
				if (result == null) {
					result = caseAct(vitalSignsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2: {
				VitalSignsSectionEntriesOptional2 vitalSignsSectionEntriesOptional2 = (VitalSignsSectionEntriesOptional2) theEObject;
				T result = caseVitalSignsSectionEntriesOptional2(vitalSignsSectionEntriesOptional2);
				if (result == null) {
					result = caseVitalSignsSectionEntriesOptional(vitalSignsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(vitalSignsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(vitalSignsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.VITAL_SIGNS_ORGANIZER2: {
				VitalSignsOrganizer2 vitalSignsOrganizer2 = (VitalSignsOrganizer2) theEObject;
				T result = caseVitalSignsOrganizer2(vitalSignsOrganizer2);
				if (result == null) {
					result = caseVitalSignsOrganizer(vitalSignsOrganizer2);
				}
				if (result == null) {
					result = caseOrganizer(vitalSignsOrganizer2);
				}
				if (result == null) {
					result = caseClinicalStatement(vitalSignsOrganizer2);
				}
				if (result == null) {
					result = caseAct(vitalSignsOrganizer2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(vitalSignsOrganizer2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_SECTION2: {
				FunctionalStatusSection2 functionalStatusSection2 = (FunctionalStatusSection2) theEObject;
				T result = caseFunctionalStatusSection2(functionalStatusSection2);
				if (result == null) {
					result = caseFunctionalStatusSection(functionalStatusSection2);
				}
				if (result == null) {
					result = caseSection(functionalStatusSection2);
				}
				if (result == null) {
					result = caseAct(functionalStatusSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FUNCTIONAL_STATUS_ORGANIZER2: {
				FunctionalStatusOrganizer2 functionalStatusOrganizer2 = (FunctionalStatusOrganizer2) theEObject;
				T result = caseFunctionalStatusOrganizer2(functionalStatusOrganizer2);
				if (result == null) {
					result = caseFunctionalStatusResultOrganizer(functionalStatusOrganizer2);
				}
				if (result == null) {
					result = caseResultOrganizer(functionalStatusOrganizer2);
				}
				if (result == null) {
					result = caseOrganizer(functionalStatusOrganizer2);
				}
				if (result == null) {
					result = caseClinicalStatement(functionalStatusOrganizer2);
				}
				if (result == null) {
					result = caseAct(functionalStatusOrganizer2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(functionalStatusOrganizer2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICAL_EXAM_SECTION2: {
				PhysicalExamSection2 physicalExamSection2 = (PhysicalExamSection2) theEObject;
				T result = casePhysicalExamSection2(physicalExamSection2);
				if (result == null) {
					result = casePhysicalExamSection(physicalExamSection2);
				}
				if (result == null) {
					result = caseSection(physicalExamSection2);
				}
				if (result == null) {
					result = caseAct(physicalExamSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicalExamSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICAL_EQUIPMENT_SECTION2: {
				MedicalEquipmentSection2 medicalEquipmentSection2 = (MedicalEquipmentSection2) theEObject;
				T result = caseMedicalEquipmentSection2(medicalEquipmentSection2);
				if (result == null) {
					result = caseMedicalEquipmentSection(medicalEquipmentSection2);
				}
				if (result == null) {
					result = caseSection(medicalEquipmentSection2);
				}
				if (result == null) {
					result = caseAct(medicalEquipmentSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicalEquipmentSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION2: {
				AllergiesSection2 allergiesSection2 = (AllergiesSection2) theEObject;
				T result = caseAllergiesSection2(allergiesSection2);
				if (result == null) {
					result = caseAllergiesSectionEntriesOptional2(allergiesSection2);
				}
				if (result == null) {
					result = caseAllergiesSectionEntriesOptional(allergiesSection2);
				}
				if (result == null) {
					result = caseSection(allergiesSection2);
				}
				if (result == null) {
					result = caseAct(allergiesSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGIES_SECTION_ENTRIES_OPTIONAL2: {
				AllergiesSectionEntriesOptional2 allergiesSectionEntriesOptional2 = (AllergiesSectionEntriesOptional2) theEObject;
				T result = caseAllergiesSectionEntriesOptional2(allergiesSectionEntriesOptional2);
				if (result == null) {
					result = caseAllergiesSectionEntriesOptional(allergiesSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(allergiesSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(allergiesSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergiesSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ALLERGY_CONCERN_ACT2: {
				AllergyConcernAct2 allergyConcernAct2 = (AllergyConcernAct2) theEObject;
				T result = caseAllergyConcernAct2(allergyConcernAct2);
				if (result == null) {
					result = caseAllergyProblemAct(allergyConcernAct2);
				}
				if (result == null) {
					result = caseCDA_Act(allergyConcernAct2);
				}
				if (result == null) {
					result = caseClinicalStatement(allergyConcernAct2);
				}
				if (result == null) {
					result = caseAct(allergyConcernAct2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(allergyConcernAct2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ASSESSMENT_AND_PLAN_SECTION2: {
				AssessmentAndPlanSection2 assessmentAndPlanSection2 = (AssessmentAndPlanSection2) theEObject;
				T result = caseAssessmentAndPlanSection2(assessmentAndPlanSection2);
				if (result == null) {
					result = caseAssessmentAndPlanSection(assessmentAndPlanSection2);
				}
				if (result == null) {
					result = caseSection(assessmentAndPlanSection2);
				}
				if (result == null) {
					result = caseAct(assessmentAndPlanSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(assessmentAndPlanSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HISTORY_OF_PAST_ILLNESS_SECTION2: {
				HistoryOfPastIllnessSection2 historyOfPastIllnessSection2 = (HistoryOfPastIllnessSection2) theEObject;
				T result = caseHistoryOfPastIllnessSection2(historyOfPastIllnessSection2);
				if (result == null) {
					result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection2);
				}
				if (result == null) {
					result = caseSection(historyOfPastIllnessSection2);
				}
				if (result == null) {
					result = caseAct(historyOfPastIllnessSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyOfPastIllnessSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATIONS_SECTION2: {
				MedicationsSection2 medicationsSection2 = (MedicationsSection2) theEObject;
				T result = caseMedicationsSection2(medicationsSection2);
				if (result == null) {
					result = caseMedicationsSectionEntriesOptional2(medicationsSection2);
				}
				if (result == null) {
					result = caseMedicationsSectionEntriesOptional(medicationsSection2);
				}
				if (result == null) {
					result = caseSection(medicationsSection2);
				}
				if (result == null) {
					result = caseAct(medicationsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATIONS_SECTION_ENTRIES_OPTIONAL2: {
				MedicationsSectionEntriesOptional2 medicationsSectionEntriesOptional2 = (MedicationsSectionEntriesOptional2) theEObject;
				T result = caseMedicationsSectionEntriesOptional2(medicationsSectionEntriesOptional2);
				if (result == null) {
					result = caseMedicationsSectionEntriesOptional(medicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(medicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(medicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.REASON_FOR_REFERRAL_SECTION2: {
				ReasonForReferralSection2 reasonForReferralSection2 = (ReasonForReferralSection2) theEObject;
				T result = caseReasonForReferralSection2(reasonForReferralSection2);
				if (result == null) {
					result = caseReasonForReferralSection(reasonForReferralSection2);
				}
				if (result == null) {
					result = caseSection(reasonForReferralSection2);
				}
				if (result == null) {
					result = caseAct(reasonForReferralSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(reasonForReferralSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.FAMILY_HISTORY_SECTION2: {
				FamilyHistorySection2 familyHistorySection2 = (FamilyHistorySection2) theEObject;
				T result = caseFamilyHistorySection2(familyHistorySection2);
				if (result == null) {
					result = caseFamilyHistorySection(familyHistorySection2);
				}
				if (result == null) {
					result = caseSection(familyHistorySection2);
				}
				if (result == null) {
					result = caseAct(familyHistorySection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(familyHistorySection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.TRANSFER_SUMMARY: {
				TransferSummary transferSummary = (TransferSummary) theEObject;
				T result = caseTransferSummary(transferSummary);
				if (result == null) {
					result = caseUSRealmHeader2(transferSummary);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(transferSummary);
				}
				if (result == null) {
					result = caseClinicalDocument(transferSummary);
				}
				if (result == null) {
					result = caseAct(transferSummary);
				}
				if (result == null) {
					result = caseInfrastructureRoot(transferSummary);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADVANCE_DIRECTIVES_SECTION2: {
				AdvanceDirectivesSection2 advanceDirectivesSection2 = (AdvanceDirectivesSection2) theEObject;
				T result = caseAdvanceDirectivesSection2(advanceDirectivesSection2);
				if (result == null) {
					result = caseAdvanceDirectivesSectionEntriesOptional2(advanceDirectivesSection2);
				}
				if (result == null) {
					result = caseAdvanceDirectivesSectionEntriesOptional(advanceDirectivesSection2);
				}
				if (result == null) {
					result = caseSection(advanceDirectivesSection2);
				}
				if (result == null) {
					result = caseAct(advanceDirectivesSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(advanceDirectivesSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION2: {
				EncountersSection2 encountersSection2 = (EncountersSection2) theEObject;
				T result = caseEncountersSection2(encountersSection2);
				if (result == null) {
					result = caseEncountersSectionEntriesOptional2(encountersSection2);
				}
				if (result == null) {
					result = caseEncountersSectionEntriesOptional(encountersSection2);
				}
				if (result == null) {
					result = caseSection(encountersSection2);
				}
				if (result == null) {
					result = caseAct(encountersSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2: {
				EncountersSectionEntriesOptional2 encountersSectionEntriesOptional2 = (EncountersSectionEntriesOptional2) theEObject;
				T result = caseEncountersSectionEntriesOptional2(encountersSectionEntriesOptional2);
				if (result == null) {
					result = caseEncountersSectionEntriesOptional(encountersSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(encountersSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(encountersSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(encountersSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PAYERS_SECTION2: {
				PayersSection2 payersSection2 = (PayersSection2) theEObject;
				T result = casePayersSection2(payersSection2);
				if (result == null) {
					result = casePayersSection(payersSection2);
				}
				if (result == null) {
					result = caseSection(payersSection2);
				}
				if (result == null) {
					result = caseAct(payersSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(payersSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COVERAGE_ACTIVITY2: {
				CoverageActivity2 coverageActivity2 = (CoverageActivity2) theEObject;
				T result = caseCoverageActivity2(coverageActivity2);
				if (result == null) {
					result = caseCoverageActivity(coverageActivity2);
				}
				if (result == null) {
					result = caseCDA_Act(coverageActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(coverageActivity2);
				}
				if (result == null) {
					result = caseAct(coverageActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(coverageActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POLICY_ACTIVITY2: {
				PolicyActivity2 policyActivity2 = (PolicyActivity2) theEObject;
				T result = casePolicyActivity2(policyActivity2);
				if (result == null) {
					result = casePolicyActivity(policyActivity2);
				}
				if (result == null) {
					result = caseCDA_Act(policyActivity2);
				}
				if (result == null) {
					result = caseClinicalStatement(policyActivity2);
				}
				if (result == null) {
					result = caseAct(policyActivity2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(policyActivity2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURES_SECTION2: {
				ProceduresSection2 proceduresSection2 = (ProceduresSection2) theEObject;
				T result = caseProceduresSection2(proceduresSection2);
				if (result == null) {
					result = caseProceduresSectionEntriesOptional2(proceduresSection2);
				}
				if (result == null) {
					result = caseProceduresSectionEntriesOptional(proceduresSection2);
				}
				if (result == null) {
					result = caseSection(proceduresSection2);
				}
				if (result == null) {
					result = caseAct(proceduresSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(proceduresSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_DIAGNOSIS_SECTION2: {
				DischargeDiagnosisSection2 dischargeDiagnosisSection2 = (DischargeDiagnosisSection2) theEObject;
				T result = caseDischargeDiagnosisSection2(dischargeDiagnosisSection2);
				if (result == null) {
					result = caseHospitalDischargeDiagnosisSection(dischargeDiagnosisSection2);
				}
				if (result == null) {
					result = caseSection(dischargeDiagnosisSection2);
				}
				if (result == null) {
					result = caseAct(dischargeDiagnosisSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeDiagnosisSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HOSPITAL_DISCHARGE_DIAGNOSIS2: {
				HospitalDischargeDiagnosis2 hospitalDischargeDiagnosis2 = (HospitalDischargeDiagnosis2) theEObject;
				T result = caseHospitalDischargeDiagnosis2(hospitalDischargeDiagnosis2);
				if (result == null) {
					result = caseHospitalDischargeDiagnosis(hospitalDischargeDiagnosis2);
				}
				if (result == null) {
					result = caseCDA_Act(hospitalDischargeDiagnosis2);
				}
				if (result == null) {
					result = caseClinicalStatement(hospitalDischargeDiagnosis2);
				}
				if (result == null) {
					result = caseAct(hospitalDischargeDiagnosis2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(hospitalDischargeDiagnosis2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2: {
				AdmissionMedicationsSectionEntriesOptional2 admissionMedicationsSectionEntriesOptional2 = (AdmissionMedicationsSectionEntriesOptional2) theEObject;
				T result = caseAdmissionMedicationsSectionEntriesOptional2(admissionMedicationsSectionEntriesOptional2);
				if (result == null) {
					result = caseHospitalAdmissionMedicationsSectionEntriesOptional(
						admissionMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(admissionMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(admissionMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(admissionMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADMISSION_MEDICATION2: {
				AdmissionMedication2 admissionMedication2 = (AdmissionMedication2) theEObject;
				T result = caseAdmissionMedication2(admissionMedication2);
				if (result == null) {
					result = caseAdmissionMedication(admissionMedication2);
				}
				if (result == null) {
					result = caseCDA_Act(admissionMedication2);
				}
				if (result == null) {
					result = caseClinicalStatement(admissionMedication2);
				}
				if (result == null) {
					result = caseAct(admissionMedication2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(admissionMedication2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ADMISSION_DIAGNOSIS_SECTION2: {
				AdmissionDiagnosisSection2 admissionDiagnosisSection2 = (AdmissionDiagnosisSection2) theEObject;
				T result = caseAdmissionDiagnosisSection2(admissionDiagnosisSection2);
				if (result == null) {
					result = caseHospitalAdmissionDiagnosisSection(admissionDiagnosisSection2);
				}
				if (result == null) {
					result = caseSection(admissionDiagnosisSection2);
				}
				if (result == null) {
					result = caseAct(admissionDiagnosisSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(admissionDiagnosisSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COURSE_OF_CARE_SECTION: {
				CourseOfCareSection courseOfCareSection = (CourseOfCareSection) theEObject;
				T result = caseCourseOfCareSection(courseOfCareSection);
				if (result == null) {
					result = caseSection(courseOfCareSection);
				}
				if (result == null) {
					result = caseAct(courseOfCareSection);
				}
				if (result == null) {
					result = caseInfrastructureRoot(courseOfCareSection);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.US_REALM_HEADER_PATIENT_GENERATED_DOCUMENT: {
				USRealmHeaderPatientGeneratedDocument usRealmHeaderPatientGeneratedDocument = (USRealmHeaderPatientGeneratedDocument) theEObject;
				T result = caseUSRealmHeaderPatientGeneratedDocument(usRealmHeaderPatientGeneratedDocument);
				if (result == null) {
					result = caseUSRealmHeader2(usRealmHeaderPatientGeneratedDocument);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(usRealmHeaderPatientGeneratedDocument);
				}
				if (result == null) {
					result = caseClinicalDocument(usRealmHeaderPatientGeneratedDocument);
				}
				if (result == null) {
					result = caseAct(usRealmHeaderPatientGeneratedDocument);
				}
				if (result == null) {
					result = caseInfrastructureRoot(usRealmHeaderPatientGeneratedDocument);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.AUTHOR_PARTICIPATION: {
				AuthorParticipation authorParticipation = (AuthorParticipation) theEObject;
				T result = caseAuthorParticipation(authorParticipation);
				if (result == null) {
					result = caseAuthor(authorParticipation);
				}
				if (result == null) {
					result = caseParticipation(authorParticipation);
				}
				if (result == null) {
					result = caseInfrastructureRoot(authorParticipation);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DECEASED_OBSERVATION2: {
				DeceasedObservation2 deceasedObservation2 = (DeceasedObservation2) theEObject;
				T result = caseDeceasedObservation2(deceasedObservation2);
				if (result == null) {
					result = caseDeceasedObservation(deceasedObservation2);
				}
				if (result == null) {
					result = caseObservation(deceasedObservation2);
				}
				if (result == null) {
					result = caseClinicalStatement(deceasedObservation2);
				}
				if (result == null) {
					result = caseAct(deceasedObservation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(deceasedObservation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_MEDICATION2: {
				DischargeMedication2 dischargeMedication2 = (DischargeMedication2) theEObject;
				T result = caseDischargeMedication2(dischargeMedication2);
				if (result == null) {
					result = caseDischargeMedication(dischargeMedication2);
				}
				if (result == null) {
					result = caseCDA_Act(dischargeMedication2);
				}
				if (result == null) {
					result = caseClinicalStatement(dischargeMedication2);
				}
				if (result == null) {
					result = caseAct(dischargeMedication2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeMedication2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.IMMUNIZATION_MEDICATION_INFORMATION2: {
				ImmunizationMedicationInformation2 immunizationMedicationInformation2 = (ImmunizationMedicationInformation2) theEObject;
				T result = caseImmunizationMedicationInformation2(immunizationMedicationInformation2);
				if (result == null) {
					result = caseImmunizationMedicationInformation(immunizationMedicationInformation2);
				}
				if (result == null) {
					result = caseManufacturedProduct(immunizationMedicationInformation2);
				}
				if (result == null) {
					result = caseRole(immunizationMedicationInformation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(immunizationMedicationInformation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATION_INFORMATION2: {
				MedicationInformation2 medicationInformation2 = (MedicationInformation2) theEObject;
				T result = caseMedicationInformation2(medicationInformation2);
				if (result == null) {
					result = caseMedicationInformation(medicationInformation2);
				}
				if (result == null) {
					result = caseManufacturedProduct(medicationInformation2);
				}
				if (result == null) {
					result = caseRole(medicationInformation2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationInformation2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICIANOF_RECORD_PARTICIPANT2: {
				PhysicianofRecordParticipant2 physicianofRecordParticipant2 = (PhysicianofRecordParticipant2) theEObject;
				T result = casePhysicianofRecordParticipant2(physicianofRecordParticipant2);
				if (result == null) {
					result = casePhysicianofRecordParticipant(physicianofRecordParticipant2);
				}
				if (result == null) {
					result = caseEncounterParticipant(physicianofRecordParticipant2);
				}
				if (result == null) {
					result = caseParticipation(physicianofRecordParticipant2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicianofRecordParticipant2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.ANESTHESIA_SECTION2: {
				AnesthesiaSection2 anesthesiaSection2 = (AnesthesiaSection2) theEObject;
				T result = caseAnesthesiaSection2(anesthesiaSection2);
				if (result == null) {
					result = caseAnesthesiaSection(anesthesiaSection2);
				}
				if (result == null) {
					result = caseSection(anesthesiaSection2);
				}
				if (result == null) {
					result = caseAct(anesthesiaSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(anesthesiaSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.COMPLICATIONS_SECTION2: {
				ComplicationsSection2 complicationsSection2 = (ComplicationsSection2) theEObject;
				T result = caseComplicationsSection2(complicationsSection2);
				if (result == null) {
					result = caseComplicationsSection(complicationsSection2);
				}
				if (result == null) {
					result = caseSection(complicationsSection2);
				}
				if (result == null) {
					result = caseAct(complicationsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(complicationsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2: {
				DischargeMedicationsSectionEntriesOptional2 dischargeMedicationsSectionEntriesOptional2 = (DischargeMedicationsSectionEntriesOptional2) theEObject;
				T result = caseDischargeMedicationsSectionEntriesOptional2(dischargeMedicationsSectionEntriesOptional2);
				if (result == null) {
					result = caseHospitalDischargeMedicationsSectionEntriesOptional(
						dischargeMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseSection(dischargeMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseAct(dischargeMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeMedicationsSectionEntriesOptional2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.INSTRUCTIONS_SECTION2: {
				InstructionsSection2 instructionsSection2 = (InstructionsSection2) theEObject;
				T result = caseInstructionsSection2(instructionsSection2);
				if (result == null) {
					result = caseInstructionsSection(instructionsSection2);
				}
				if (result == null) {
					result = caseSection(instructionsSection2);
				}
				if (result == null) {
					result = caseAct(instructionsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(instructionsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.MEDICATIONS_ADMINISTERED_SECTION2: {
				MedicationsAdministeredSection2 medicationsAdministeredSection2 = (MedicationsAdministeredSection2) theEObject;
				T result = caseMedicationsAdministeredSection2(medicationsAdministeredSection2);
				if (result == null) {
					result = caseMedicationsAdministeredSection(medicationsAdministeredSection2);
				}
				if (result == null) {
					result = caseSection(medicationsAdministeredSection2);
				}
				if (result == null) {
					result = caseAct(medicationsAdministeredSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(medicationsAdministeredSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PLANNED_PROCEDURE_SECTION2: {
				PlannedProcedureSection2 plannedProcedureSection2 = (PlannedProcedureSection2) theEObject;
				T result = casePlannedProcedureSection2(plannedProcedureSection2);
				if (result == null) {
					result = casePlannedProcedureSection(plannedProcedureSection2);
				}
				if (result == null) {
					result = caseSection(plannedProcedureSection2);
				}
				if (result == null) {
					result = caseAct(plannedProcedureSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(plannedProcedureSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.POSTPROCEDURE_DIAGNOSIS_SECTION2: {
				PostprocedureDiagnosisSection2 postprocedureDiagnosisSection2 = (PostprocedureDiagnosisSection2) theEObject;
				T result = casePostprocedureDiagnosisSection2(postprocedureDiagnosisSection2);
				if (result == null) {
					result = casePostprocedureDiagnosisSection(postprocedureDiagnosisSection2);
				}
				if (result == null) {
					result = caseSection(postprocedureDiagnosisSection2);
				}
				if (result == null) {
					result = caseAct(postprocedureDiagnosisSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(postprocedureDiagnosisSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PREOPERATIVE_DIAGNOSIS_SECTION2: {
				PreoperativeDiagnosisSection2 preoperativeDiagnosisSection2 = (PreoperativeDiagnosisSection2) theEObject;
				T result = casePreoperativeDiagnosisSection2(preoperativeDiagnosisSection2);
				if (result == null) {
					result = casePreoperativeDiagnosisSection(preoperativeDiagnosisSection2);
				}
				if (result == null) {
					result = caseSection(preoperativeDiagnosisSection2);
				}
				if (result == null) {
					result = caseAct(preoperativeDiagnosisSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preoperativeDiagnosisSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_FINDINGS_SECTION2: {
				ProcedureFindingsSection2 procedureFindingsSection2 = (ProcedureFindingsSection2) theEObject;
				T result = caseProcedureFindingsSection2(procedureFindingsSection2);
				if (result == null) {
					result = caseProcedureFindingsSection(procedureFindingsSection2);
				}
				if (result == null) {
					result = caseSection(procedureFindingsSection2);
				}
				if (result == null) {
					result = caseAct(procedureFindingsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureFindingsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_INDICATIONS_SECTION2: {
				ProcedureIndicationsSection2 procedureIndicationsSection2 = (ProcedureIndicationsSection2) theEObject;
				T result = caseProcedureIndicationsSection2(procedureIndicationsSection2);
				if (result == null) {
					result = caseProcedureIndicationsSection(procedureIndicationsSection2);
				}
				if (result == null) {
					result = caseSection(procedureIndicationsSection2);
				}
				if (result == null) {
					result = caseAct(procedureIndicationsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureIndicationsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_MEDICATIONS_SECTION2: {
				DischargeMedicationsSection2 dischargeMedicationsSection2 = (DischargeMedicationsSection2) theEObject;
				T result = caseDischargeMedicationsSection2(dischargeMedicationsSection2);
				if (result == null) {
					result = caseDischargeMedicationsSectionEntriesOptional2(dischargeMedicationsSection2);
				}
				if (result == null) {
					result = caseHospitalDischargeMedicationsSectionEntriesOptional(dischargeMedicationsSection2);
				}
				if (result == null) {
					result = caseSection(dischargeMedicationsSection2);
				}
				if (result == null) {
					result = caseAct(dischargeMedicationsSection2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeMedicationsSection2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONSULTATION_NOTE2: {
				ConsultationNote2 consultationNote2 = (ConsultationNote2) theEObject;
				T result = caseConsultationNote2(consultationNote2);
				if (result == null) {
					result = caseUSRealmHeader2(consultationNote2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(consultationNote2);
				}
				if (result == null) {
					result = caseClinicalDocument(consultationNote2);
				}
				if (result == null) {
					result = caseAct(consultationNote2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(consultationNote2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.CONTINUITY_OF_CARE_DOCUMENT2: {
				ContinuityOfCareDocument2 continuityOfCareDocument2 = (ContinuityOfCareDocument2) theEObject;
				T result = caseContinuityOfCareDocument2(continuityOfCareDocument2);
				if (result == null) {
					result = caseUSRealmHeader2(continuityOfCareDocument2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(continuityOfCareDocument2);
				}
				if (result == null) {
					result = caseClinicalDocument(continuityOfCareDocument2);
				}
				if (result == null) {
					result = caseAct(continuityOfCareDocument2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(continuityOfCareDocument2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DIAGNOSTIC_IMAGING_REPORT2: {
				DiagnosticImagingReport2 diagnosticImagingReport2 = (DiagnosticImagingReport2) theEObject;
				T result = caseDiagnosticImagingReport2(diagnosticImagingReport2);
				if (result == null) {
					result = caseUSRealmHeader2(diagnosticImagingReport2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(diagnosticImagingReport2);
				}
				if (result == null) {
					result = caseClinicalDocument(diagnosticImagingReport2);
				}
				if (result == null) {
					result = caseAct(diagnosticImagingReport2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(diagnosticImagingReport2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.DISCHARGE_SUMMARY2: {
				DischargeSummary2 dischargeSummary2 = (DischargeSummary2) theEObject;
				T result = caseDischargeSummary2(dischargeSummary2);
				if (result == null) {
					result = caseUSRealmHeader2(dischargeSummary2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(dischargeSummary2);
				}
				if (result == null) {
					result = caseClinicalDocument(dischargeSummary2);
				}
				if (result == null) {
					result = caseAct(dischargeSummary2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(dischargeSummary2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.HISTORY_AND_PHYSICAL_NOTE2: {
				HistoryAndPhysicalNote2 historyAndPhysicalNote2 = (HistoryAndPhysicalNote2) theEObject;
				T result = caseHistoryAndPhysicalNote2(historyAndPhysicalNote2);
				if (result == null) {
					result = caseUSRealmHeader2(historyAndPhysicalNote2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(historyAndPhysicalNote2);
				}
				if (result == null) {
					result = caseClinicalDocument(historyAndPhysicalNote2);
				}
				if (result == null) {
					result = caseAct(historyAndPhysicalNote2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(historyAndPhysicalNote2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.OPERATIVE_NOTE2: {
				OperativeNote2 operativeNote2 = (OperativeNote2) theEObject;
				T result = caseOperativeNote2(operativeNote2);
				if (result == null) {
					result = caseUSRealmHeader2(operativeNote2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(operativeNote2);
				}
				if (result == null) {
					result = caseClinicalDocument(operativeNote2);
				}
				if (result == null) {
					result = caseAct(operativeNote2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(operativeNote2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROCEDURE_NOTE2: {
				ProcedureNote2 procedureNote2 = (ProcedureNote2) theEObject;
				T result = caseProcedureNote2(procedureNote2);
				if (result == null) {
					result = caseUSRealmHeader2(procedureNote2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(procedureNote2);
				}
				if (result == null) {
					result = caseClinicalDocument(procedureNote2);
				}
				if (result == null) {
					result = caseAct(procedureNote2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(procedureNote2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PROGRESS_NOTE2: {
				ProgressNote2 progressNote2 = (ProgressNote2) theEObject;
				T result = caseProgressNote2(progressNote2);
				if (result == null) {
					result = caseUSRealmHeader2(progressNote2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(progressNote2);
				}
				if (result == null) {
					result = caseClinicalDocument(progressNote2);
				}
				if (result == null) {
					result = caseAct(progressNote2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(progressNote2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.UNSTRUCTURED_DOCUMENT2: {
				UnstructuredDocument2 unstructuredDocument2 = (UnstructuredDocument2) theEObject;
				T result = caseUnstructuredDocument2(unstructuredDocument2);
				if (result == null) {
					result = caseUSRealmHeader2(unstructuredDocument2);
				}
				if (result == null) {
					result = caseGeneralHeaderConstraints(unstructuredDocument2);
				}
				if (result == null) {
					result = caseClinicalDocument(unstructuredDocument2);
				}
				if (result == null) {
					result = caseAct(unstructuredDocument2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(unstructuredDocument2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION2: {
				PreconditionForSubstanceAdministration2 preconditionForSubstanceAdministration2 = (PreconditionForSubstanceAdministration2) theEObject;
				T result = casePreconditionForSubstanceAdministration2(preconditionForSubstanceAdministration2);
				if (result == null) {
					result = casePreconditionForSubstanceAdministration(preconditionForSubstanceAdministration2);
				}
				if (result == null) {
					result = caseCriterion(preconditionForSubstanceAdministration2);
				}
				if (result == null) {
					result = caseAct(preconditionForSubstanceAdministration2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(preconditionForSubstanceAdministration2);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case ConsolPackage.PHYSICIAN_READING_STUDY_PERFORMER2: {
				PhysicianReadingStudyPerformer2 physicianReadingStudyPerformer2 = (PhysicianReadingStudyPerformer2) theEObject;
				T result = casePhysicianReadingStudyPerformer2(physicianReadingStudyPerformer2);
				if (result == null) {
					result = casePhysicianReadingStudyPerformer(physicianReadingStudyPerformer2);
				}
				if (result == null) {
					result = casePerformer1(physicianReadingStudyPerformer2);
				}
				if (result == null) {
					result = caseParticipation(physicianReadingStudyPerformer2);
				}
				if (result == null) {
					result = caseInfrastructureRoot(physicianReadingStudyPerformer2);
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
	 * Returns the result of interpreting the object as an instance of '<em>Substance Or Device Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Or Device Allergy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceOrDeviceAllergyObservation(SubstanceOrDeviceAllergyObservation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Comment Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentActivity(CommentActivity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Supply Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Supply Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSupplyOrder(MedicationSupplyOrder object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEstimatedDateOfDelivery(EstimatedDateOfDelivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smoking Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmokingStatusObservation(SmokingStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tobacco Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tobacco Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTobaccoUse(TobaccoUse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusResultOrganizer(FunctionalStatusResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusResultObservation(FunctionalStatusResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caregiver Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caregiver Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaregiverCharacteristics(CaregiverCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Scale Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Scale Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentScaleObservation(AssessmentScaleObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Scale Supporting Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Scale Supporting Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentScaleSupportingObservation(AssessmentScaleSupportingObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cognitive Status Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cognitive Status Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitiveStatusResultOrganizer(CognitiveStatusResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cognitive Status Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cognitive Status Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitiveStatusResultObservation(CognitiveStatusResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusProblemObservation(FunctionalStatusProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cognitive Status Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cognitive Status Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitiveStatusProblemObservation(CognitiveStatusProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pressure Ulcer Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pressure Ulcer Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressureUlcerObservation(PressureUlcerObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Pressure Ulcers Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Pressure Ulcers Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfPressureUlcersObservation(NumberOfPressureUlcersObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Highest Pressure Ulcer Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Highest Pressure Ulcer Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHighestPressureUlcerStage(HighestPressureUlcerStage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterActivities(EncounterActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterDiagnosis(EncounterDiagnosis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Studies Summary Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Studies Summary Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeStudiesSummarySection(HospitalDischargeStudiesSummarySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeMedication(DischargeMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosis(HospitalDischargeDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeInstructionsSection(HospitalDischargeInstructionsSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPresentIllnessSection(HistoryOfPresentIllnessSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Admission Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmissionMedication(AdmissionMedication object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Physical Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Physical Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargePhysicalSection(HospitalDischargePhysicalSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint And Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintAndReasonForVisitSection(ChiefComplaintAndReasonForVisitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForVisitSection(ReasonForVisitSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Surgical Drains Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgical Drains Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgicalDrainsSection(SurgicalDrainsSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section Entries Optional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSectionEntriesOptional(
			HospitalDischargeMedicationsSectionEntriesOptional object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Anesthesia Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anesthesia Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnesthesiaSection(AnesthesiaSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplicationsSection(ComplicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICOM Object Catalog Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICOM Object Catalog Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICOMObjectCatalogSection(DICOMObjectCatalogSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyAct(StudyAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Series Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Series Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeriesAct(SeriesAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOP Instance Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOP Instance Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOPInstanceObservation(SOPInstanceObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purposeof Reference Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purposeof Reference Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeofReferenceObservation(PurposeofReferenceObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Frames Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Frames Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedFramesObservation(ReferencedFramesObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryObservation(BoundaryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Findings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindingsSection(FindingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Consultations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Consultations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalConsultationsSection(HospitalConsultationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interventions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interventions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterventionsSection(InterventionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalHistorySection(MedicalHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveSection(ObjectiveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Fluid Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Fluid Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNoteFluidSection(OperativeNoteFluidSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note Surgical Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note Surgical Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNoteSurgicalProcedureSection(OperativeNoteSurgicalProcedureSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Procedure Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Procedure Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedProcedureSection(PlannedProcedureSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostoperativeDiagnosisSection(PostoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosisSection(PostprocedureDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosis(PostprocedureDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosisSection(PreoperativeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Description Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Description Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDescriptionSection(ProcedureDescriptionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Disposition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Disposition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDispositionSection(ProcedureDispositionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Estimated Blood Loss Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Estimated Blood Loss Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEstimatedBloodLossSection(ProcedureEstimatedBloodLossSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Findings Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Findings Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFindingsSection(ProcedureFindingsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Implants Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Implants Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureImplantsSection(ProcedureImplantsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Indications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Indications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureIndicationsSection(ProcedureIndicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Specimens Taken Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Specimens Taken Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureSpecimensTakenSection(ProcedureSpecimensTakenSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subjective Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subjective Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectiveSection(SubjectiveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote(ConsultationNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSection(AssessmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History And Physical Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History And Physical Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryAndPhysicalNote(HistoryAndPhysicalNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNote(OperativeNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote(ProcedureNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressNote(ProgressNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosis(PreoperativeDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionsSection(InstructionsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosis(HospitalAdmissionDiagnosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport(DiagnosticImagingReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physician Reading Study Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physician Reading Study Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianReadingStudyPerformer(PhysicianReadingStudyPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physicianof Record Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physicianof Record Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianofRecordParticipant(PhysicianofRecordParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextObservation(TextObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Measurement Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Measurement Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityMeasurementObservation(QuantityMeasurementObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Observations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Observations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeObservations(CodeObservations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureContext(ProcedureContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Use None Known</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Use None Known</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationUseNoneKnown(MedicationUseNoneKnown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deceased Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deceased Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeceasedObservation(DeceasedObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fetus Subject Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fetus Subject Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFetusSubjectContext(FetusSubjectContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observer Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observer Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObserverContext(ObserverContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryReference(EntryReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveOrganizer(AdvanceDirectiveOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristics Of Home Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristics Of Home Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicsOfHomeEnvironment(CharacteristicsOfHomeEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cognitive Abilities Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cognitive Abilities Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCognitiveAbilitiesObservation(CognitiveAbilitiesObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cultural And Religious Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cultural And Religious Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCulturalAndReligiousObservation(CulturalAndReligiousObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Monitoring Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Monitoring Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugMonitoringAct(DrugMonitoringAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handoff Communication Participants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handoff Communication Participants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandoffCommunicationParticipants(HandoffCommunicationParticipants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Equipment Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Equipment Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalEquipmentOrganizer(MedicalEquipmentOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mental Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mental Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMentalStatusObservation(MentalStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionAssessment(NutritionAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionRecommendation(NutritionRecommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutritional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutritional Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionalStatusObservation(NutritionalStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outcome Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outcome Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutcomeObservation(OutcomeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Referral Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Referral Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientReferralAct(PatientReferralAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedCoverage(PlannedCoverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalObservation(GoalObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthConcernAct(HealthConcernAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervention Act</em>'.
	 * <!-- begin-user-doc -->
	* This implementation returns null;
	* returning a non-null result will terminate the switch.
	* <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervention Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterventionAct(InterventionAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Document Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Document Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocumentReference(ExternalDocumentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Immunization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedImmunizationActivity(PlannedImmunizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisObservation(PrognosisObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Toward Goal Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Toward Goal Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressTowardGoalObservation(ProgressTowardGoalObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Care Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Care Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfCareActivities(SelfCareActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensory Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensory Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensoryStatus(SensoryStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Longitudinal Care Wound Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Longitudinal Care Wound Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongitudinalCareWoundObservation(LongitudinalCareWoundObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administered Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administered Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministeredAct(SubstanceAdministeredAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Pressure Ulcers Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Pressure Ulcers Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfPressureUlcersObservation2(NumberOfPressureUlcersObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wound Measurement Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wound Measurement Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWoundMeasurementObservation(WoundMeasurementObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wound Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wound Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWoundCharacteristic(WoundCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goals Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goals Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalsSection(GoalsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Concerns Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Concerns Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthConcernsSection(HealthConcernsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mental Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mental Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMentalStatusSection(MentalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mental Status Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mental Status Organizer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMentalStatusOrganizer2(MentalStatusOrganizer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nutrition Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nutrition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutritionSection(NutritionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Findings Of Skin Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Findings Of Skin Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalFindingsOfSkinSection(PhysicalFindingsOfSkinSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>US Realm Header2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>US Realm Header2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSRealmHeader2(USRealmHeader2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlan(CarePlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referral Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referral Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferralNote(ReferralNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferSummary(TransferSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>US Realm Header Patient Generated Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>US Realm Header Patient Generated Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUSRealmHeaderPatientGeneratedDocument(USRealmHeaderPatientGeneratedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorParticipation(AuthorParticipation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admission Medication2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Medication2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmissionMedication2(AdmissionMedication2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation2(AdvanceDirectiveObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Concern Act2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Concern Act2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyConcernAct2(AllergyConcernAct2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyObservation2(AllergyObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mental Status Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mental Status Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMentalStatusObservation2(MentalStatusObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smoking Status Meaningful Use2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smoking Status Meaningful Use2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmokingStatusMeaningfulUse2(SmokingStatusMeaningfulUse2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageActivity2(CoverageActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deceased Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deceased Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeceasedObservation2(DeceasedObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Medication2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Medication2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeMedication2(DischargeMedication2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterActivity2(EncounterActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Diagnosis2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterDiagnosis2(EncounterDiagnosis2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusObservation2(FunctionalStatusObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Organizer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusOrganizer2(FunctionalStatusOrganizer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Status Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Status Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthStatusObservation2(HealthStatusObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosis2(HospitalAdmissionDiagnosis2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Diagnosis2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeDiagnosis2(HospitalDischargeDiagnosis2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationActivity2(ImmunizationActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization Medication Information2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization Medication Information2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationMedicationInformation2(ImmunizationMedicationInformation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indication2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indication2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndication2(Indication2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction2(Instruction2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationActivity2(MedicationActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Dispense2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Dispense2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationDispense2(MedicationDispense2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformation2(MedicationInformation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Supply Order2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Supply Order2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSupplyOrder2(MedicationSupplyOrder2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Medicinal Supply Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonMedicinalSupplyActivity2(NonMedicinalSupplyActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physicianof Record Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physicianof Record Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianofRecordParticipant2(PhysicianofRecordParticipant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Act2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Act2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedAct2(PlannedAct2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Encounter2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Encounter2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedEncounter2(PlannedEncounter2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityPreference(PriorityPreference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedObservation2(PlannedObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Procedure2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Procedure2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedProcedure2(PlannedProcedure2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Medication Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Medication Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedMedicationActivity2(PlannedMedicationActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Supply2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Supply2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedSupply2(PlannedSupply2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Activity2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Activity2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyActivity2(PolicyActivity2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosis2(PostprocedureDiagnosis2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosis2(PreoperativeDiagnosis2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern Act2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern Act2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemConcernAct2(ProblemConcernAct2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation2(ProblemObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityAct2(ProcedureActivityAct2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityObservation2(ProcedureActivityObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityProcedure2(ProcedureActivityProcedure2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionObservation2(ReactionObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation2(ResultObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer2(ResultOrganizer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Severity Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Severity Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeverityObservation2(SeverityObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Free Text Sig</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Free Text Sig</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationFreeTextSig(MedicationFreeTextSig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryObservation2(SocialHistoryObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Or Device Allergy Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Or Device Allergy Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceOrDeviceAllergyObservation2(SubstanceOrDeviceAllergyObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tobacco Use2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tobacco Use2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTobaccoUse2(TobaccoUse2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignObservation2(VitalSignObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsOrganizer2(VitalSignsOrganizer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anesthesia Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anesthesia Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnesthesiaSection2(AnesthesiaSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanSection2(AssessmentAndPlanSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complications Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplicationsSection2(ComplicationsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admission Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Diagnosis Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmissionDiagnosisSection2(AdmissionDiagnosisSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admission Medications Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Medications Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmissionMedicationsSectionEntriesOptional2(AdmissionMedicationsSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Medications Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Medications Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeMedicationsSectionEntriesOptional2(DischargeMedicationsSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSectionEntriesOptional2(EncountersSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeDiagnosisSection2(DischargeDiagnosisSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSection2(FunctionalStatusSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPastIllnessSection2(HistoryOfPastIllnessSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSectionEntriesOptional2(ImmunizationsSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionsSection2(InstructionsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interventions Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interventions Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterventionsSection2(InterventionsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Equipment Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Equipment Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalEquipmentSection2(MedicalEquipmentSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Administered Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Administered Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsAdministeredSection2(MedicationsAdministeredSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payers Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payers Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayersSection2(PayersSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamSection2(PhysicalExamSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Treatment Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Treatment Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfTreatmentSection2(PlanOfTreatmentSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Procedure Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Procedure Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedProcedureSection2(PlannedProcedureSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postprocedure Diagnosis Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostprocedureDiagnosisSection2(PostprocedureDiagnosisSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preoperative Diagnosis Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreoperativeDiagnosisSection2(PreoperativeDiagnosisSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Findings Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Findings Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureFindingsSection2(ProcedureFindingsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Indications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Indications Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureIndicationsSection2(ProcedureIndicationsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Medications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Medications Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeMedicationsSection2(DischargeMedicationsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSectionEntriesOptional2(ProceduresSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Referral Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForReferralSection2(ReasonForReferralSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSectionEntriesOptional2(ResultsSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistorySection2(SocialHistorySection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSectionEntriesOptional2(VitalSignsSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSectionEntriesOptional2(AdvanceDirectivesSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSectionEntriesOptional2(MedicationsSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSectionEntriesOptional2(ProblemSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSection2(AdvanceDirectivesSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section Entries Optional2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSectionEntriesOptional2(AllergiesSectionEntriesOptional2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesSection2(AllergiesSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection2(EncountersSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSection2(ImmunizationsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSection2(MedicationsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSection2(ProblemSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSection2(ProceduresSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection2(ResultsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSection2(VitalSignsSection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote2(ConsultationNote2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument2(ContinuityOfCareDocument2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Imaging Report2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticImagingReport2(DiagnosticImagingReport2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Summary2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Summary2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeSummary2(DischargeSummary2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History And Physical Note2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History And Physical Note2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryAndPhysicalNote2(HistoryAndPhysicalNote2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operative Note2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operative Note2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperativeNote2(OperativeNote2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Note2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Note2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNote2(ProcedureNote2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress Note2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress Note2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgressNote2(ProgressNote2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument2(UnstructuredDocument2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition For Substance Administration2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition For Substance Administration2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditionForSubstanceAdministration2(PreconditionForSubstanceAdministration2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Observation2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Observation2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryObservation2(FamilyHistoryObservation2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Status Evaluations And Outcomes Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Status Evaluations And Outcomes Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthStatusEvaluationsAndOutcomesSection(HealthStatusEvaluationsAndOutcomesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Organizer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Organizer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryOrganizer2(FamilyHistoryOrganizer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Section2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Section2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySection2(FamilyHistorySection2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physician Reading Study Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physician Reading Study Performer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicianReadingStudyPerformer2(PhysicianReadingStudyPerformer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criticality Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criticality Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriticalityObservation(CriticalityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birth Sex Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birth Sex Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthSexObservation(BirthSexObservation object) {
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
	public T caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterion(Criterion object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedSubject(RelatedSubject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocument(ExternalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseOfCareSection(CourseOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planned Intervention Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planned Intervention Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlannedInterventionAct(PlannedInterventionAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk Concern Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRiskConcernAct(RiskConcernAct object) {
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
