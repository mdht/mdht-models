/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

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
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmspcrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmspcrSwitch() {
		if (modelPackage == null) {
			modelPackage = EmspcrPackage.eINSTANCE;
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
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
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
			case EmspcrPackage.PATIENT_CARE_REPORT: {
				PatientCareReport patientCareReport = (PatientCareReport)theEObject;
				T result = casePatientCareReport(patientCareReport);
				if (result == null) result = caseGeneralHeaderConstraints(patientCareReport);
				if (result == null) result = caseClinicalDocument(patientCareReport);
				if (result == null) result = caseAct(patientCareReport);
				if (result == null) result = caseInfrastructureRoot(patientCareReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION: {
				EMSCurrentMedicationSection emsCurrentMedicationSection = (EMSCurrentMedicationSection)theEObject;
				T result = caseEMSCurrentMedicationSection(emsCurrentMedicationSection);
				if (result == null) result = caseMedicationsSection(emsCurrentMedicationSection);
				if (result == null) result = caseMedicationsSectionEntriesOptional(emsCurrentMedicationSection);
				if (result == null) result = caseSection(emsCurrentMedicationSection);
				if (result == null) result = caseAct(emsCurrentMedicationSection);
				if (result == null) result = caseInfrastructureRoot(emsCurrentMedicationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CURRENTLY_ON_MEDICATION: {
				CurrentlyOnMedication currentlyOnMedication = (CurrentlyOnMedication)theEObject;
				T result = caseCurrentlyOnMedication(currentlyOnMedication);
				if (result == null) result = caseObservation(currentlyOnMedication);
				if (result == null) result = caseClinicalStatement(currentlyOnMedication);
				if (result == null) result = caseAct(currentlyOnMedication);
				if (result == null) result = caseInfrastructureRoot(currentlyOnMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_ON_ANTICOAGULANTS: {
				PatientOnAnticoagulants patientOnAnticoagulants = (PatientOnAnticoagulants)theEObject;
				T result = casePatientOnAnticoagulants(patientOnAnticoagulants);
				if (result == null) result = caseObservation(patientOnAnticoagulants);
				if (result == null) result = caseClinicalStatement(patientOnAnticoagulants);
				if (result == null) result = caseAct(patientOnAnticoagulants);
				if (result == null) result = caseInfrastructureRoot(patientOnAnticoagulants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CURRENT_MEDICATION: {
				CurrentMedication currentMedication = (CurrentMedication)theEObject;
				T result = caseCurrentMedication(currentMedication);
				if (result == null) result = caseMedicationActivity(currentMedication);
				if (result == null) result = caseSubstanceAdministration(currentMedication);
				if (result == null) result = caseClinicalStatement(currentMedication);
				if (result == null) result = caseAct(currentMedication);
				if (result == null) result = caseInfrastructureRoot(currentMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT_SECTION: {
				EMSCardiacArrestEventSection emsCardiacArrestEventSection = (EMSCardiacArrestEventSection)theEObject;
				T result = caseEMSCardiacArrestEventSection(emsCardiacArrestEventSection);
				if (result == null) result = caseSection(emsCardiacArrestEventSection);
				if (result == null) result = caseAct(emsCardiacArrestEventSection);
				if (result == null) result = caseInfrastructureRoot(emsCardiacArrestEventSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CARDIAC_ARREST: {
				CardiacArrest cardiacArrest = (CardiacArrest)theEObject;
				T result = caseCardiacArrest(cardiacArrest);
				if (result == null) result = caseObservation(cardiacArrest);
				if (result == null) result = caseClinicalStatement(cardiacArrest);
				if (result == null) result = caseAct(cardiacArrest);
				if (result == null) result = caseInfrastructureRoot(cardiacArrest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_ADVANCE_DIRECTIVES_SECTION: {
				EMSAdvanceDirectivesSection emsAdvanceDirectivesSection = (EMSAdvanceDirectivesSection)theEObject;
				T result = caseEMSAdvanceDirectivesSection(emsAdvanceDirectivesSection);
				if (result == null) result = caseSection(emsAdvanceDirectivesSection);
				if (result == null) result = caseAct(emsAdvanceDirectivesSection);
				if (result == null) result = caseInfrastructureRoot(emsAdvanceDirectivesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ADVANCE_DIRECTIVE_OBSERVATION: {
				AdvanceDirectiveObservation advanceDirectiveObservation = (AdvanceDirectiveObservation)theEObject;
				T result = caseAdvanceDirectiveObservation(advanceDirectiveObservation);
				if (result == null) result = caseObservation(advanceDirectiveObservation);
				if (result == null) result = caseClinicalStatement(advanceDirectiveObservation);
				if (result == null) result = caseAct(advanceDirectiveObservation);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION: {
				EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection = (EMSAllergiesAndAdverseReactionsSection)theEObject;
				T result = caseEMSAllergiesAndAdverseReactionsSection(emsAllergiesAndAdverseReactionsSection);
				if (result == null) result = caseSection(emsAllergiesAndAdverseReactionsSection);
				if (result == null) result = caseAct(emsAllergiesAndAdverseReactionsSection);
				if (result == null) result = caseInfrastructureRoot(emsAllergiesAndAdverseReactionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION: {
				ExistenceOfDrugAllergyObservation existenceOfDrugAllergyObservation = (ExistenceOfDrugAllergyObservation)theEObject;
				T result = caseExistenceOfDrugAllergyObservation(existenceOfDrugAllergyObservation);
				if (result == null) result = caseObservation(existenceOfDrugAllergyObservation);
				if (result == null) result = caseClinicalStatement(existenceOfDrugAllergyObservation);
				if (result == null) result = caseAct(existenceOfDrugAllergyObservation);
				if (result == null) result = caseInfrastructureRoot(existenceOfDrugAllergyObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DRUG_ALLERGY: {
				DrugAllergy drugAllergy = (DrugAllergy)theEObject;
				T result = caseDrugAllergy(drugAllergy);
				if (result == null) result = caseAllergyProblemAct(drugAllergy);
				if (result == null) result = caseCDA_Act(drugAllergy);
				if (result == null) result = caseClinicalStatement(drugAllergy);
				if (result == null) result = caseAct(drugAllergy);
				if (result == null) result = caseInfrastructureRoot(drugAllergy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.NON_DRUG_ALLERGY_ORGANIZER: {
				NonDrugAllergyOrganizer nonDrugAllergyOrganizer = (NonDrugAllergyOrganizer)theEObject;
				T result = caseNonDrugAllergyOrganizer(nonDrugAllergyOrganizer);
				if (result == null) result = caseOrganizer(nonDrugAllergyOrganizer);
				if (result == null) result = caseClinicalStatement(nonDrugAllergyOrganizer);
				if (result == null) result = caseAct(nonDrugAllergyOrganizer);
				if (result == null) result = caseInfrastructureRoot(nonDrugAllergyOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EXISTENCE_OF_NON_DRUG_ALLERGY: {
				ExistenceOfNonDrugAllergy existenceOfNonDrugAllergy = (ExistenceOfNonDrugAllergy)theEObject;
				T result = caseExistenceOfNonDrugAllergy(existenceOfNonDrugAllergy);
				if (result == null) result = caseObservation(existenceOfNonDrugAllergy);
				if (result == null) result = caseClinicalStatement(existenceOfNonDrugAllergy);
				if (result == null) result = caseAct(existenceOfNonDrugAllergy);
				if (result == null) result = caseInfrastructureRoot(existenceOfNonDrugAllergy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.NON_DRUG_ALLERGY: {
				NonDrugAllergy nonDrugAllergy = (NonDrugAllergy)theEObject;
				T result = caseNonDrugAllergy(nonDrugAllergy);
				if (result == null) result = caseObservation(nonDrugAllergy);
				if (result == null) result = caseClinicalStatement(nonDrugAllergy);
				if (result == null) result = caseAct(nonDrugAllergy);
				if (result == null) result = caseInfrastructureRoot(nonDrugAllergy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_PAST_MEDICAL_HISTORY_SECTION: {
				EMSPastMedicalHistorySection emsPastMedicalHistorySection = (EMSPastMedicalHistorySection)theEObject;
				T result = caseEMSPastMedicalHistorySection(emsPastMedicalHistorySection);
				if (result == null) result = caseSection(emsPastMedicalHistorySection);
				if (result == null) result = caseAct(emsPastMedicalHistorySection);
				if (result == null) result = caseInfrastructureRoot(emsPastMedicalHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EXISTENCE_OF_HISTORY_OF_CONDITION: {
				ExistenceOfHistoryOfCondition existenceOfHistoryOfCondition = (ExistenceOfHistoryOfCondition)theEObject;
				T result = caseExistenceOfHistoryOfCondition(existenceOfHistoryOfCondition);
				if (result == null) result = caseObservation(existenceOfHistoryOfCondition);
				if (result == null) result = caseClinicalStatement(existenceOfHistoryOfCondition);
				if (result == null) result = caseAct(existenceOfHistoryOfCondition);
				if (result == null) result = caseInfrastructureRoot(existenceOfHistoryOfCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.HISTORY_OF_CONDITION: {
				HistoryOfCondition historyOfCondition = (HistoryOfCondition)theEObject;
				T result = caseHistoryOfCondition(historyOfCondition);
				if (result == null) result = caseObservation(historyOfCondition);
				if (result == null) result = caseClinicalStatement(historyOfCondition);
				if (result == null) result = caseAct(historyOfCondition);
				if (result == null) result = caseInfrastructureRoot(historyOfCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_SOCIAL_HISTORY_SECTION: {
				EMSSocialHistorySection emsSocialHistorySection = (EMSSocialHistorySection)theEObject;
				T result = caseEMSSocialHistorySection(emsSocialHistorySection);
				if (result == null) result = caseSection(emsSocialHistorySection);
				if (result == null) result = caseAct(emsSocialHistorySection);
				if (result == null) result = caseInfrastructureRoot(emsSocialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EXISTENCE_OF_DRUG_USE_INDICATION: {
				ExistenceOfDrugUseIndication existenceOfDrugUseIndication = (ExistenceOfDrugUseIndication)theEObject;
				T result = caseExistenceOfDrugUseIndication(existenceOfDrugUseIndication);
				if (result == null) result = caseObservation(existenceOfDrugUseIndication);
				if (result == null) result = caseClinicalStatement(existenceOfDrugUseIndication);
				if (result == null) result = caseAct(existenceOfDrugUseIndication);
				if (result == null) result = caseInfrastructureRoot(existenceOfDrugUseIndication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DRUG_USE_INDICATION: {
				DrugUseIndication drugUseIndication = (DrugUseIndication)theEObject;
				T result = caseDrugUseIndication(drugUseIndication);
				if (result == null) result = caseObservation(drugUseIndication);
				if (result == null) result = caseClinicalStatement(drugUseIndication);
				if (result == null) result = caseAct(drugUseIndication);
				if (result == null) result = caseInfrastructureRoot(drugUseIndication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_PHYSICAL_ASSESSMENT_SECTION: {
				EMSPhysicalAssessmentSection emsPhysicalAssessmentSection = (EMSPhysicalAssessmentSection)theEObject;
				T result = caseEMSPhysicalAssessmentSection(emsPhysicalAssessmentSection);
				if (result == null) result = casePhysicalExamSection(emsPhysicalAssessmentSection);
				if (result == null) result = caseSection(emsPhysicalAssessmentSection);
				if (result == null) result = caseAct(emsPhysicalAssessmentSection);
				if (result == null) result = caseInfrastructureRoot(emsPhysicalAssessmentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PHYSICAL_ASSESSMENT_ORGANIZER: {
				PhysicalAssessmentOrganizer physicalAssessmentOrganizer = (PhysicalAssessmentOrganizer)theEObject;
				T result = casePhysicalAssessmentOrganizer(physicalAssessmentOrganizer);
				if (result == null) result = caseOrganizer(physicalAssessmentOrganizer);
				if (result == null) result = caseClinicalStatement(physicalAssessmentOrganizer);
				if (result == null) result = caseAct(physicalAssessmentOrganizer);
				if (result == null) result = caseInfrastructureRoot(physicalAssessmentOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.SKIN_ASSESSMENT: {
				SkinAssessment skinAssessment = (SkinAssessment)theEObject;
				T result = caseSkinAssessment(skinAssessment);
				if (result == null) result = caseObservation(skinAssessment);
				if (result == null) result = caseClinicalStatement(skinAssessment);
				if (result == null) result = caseAct(skinAssessment);
				if (result == null) result = caseInfrastructureRoot(skinAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_PREGNANCY: {
				PatientPregnancy patientPregnancy = (PatientPregnancy)theEObject;
				T result = casePatientPregnancy(patientPregnancy);
				if (result == null) result = caseObservation(patientPregnancy);
				if (result == null) result = caseClinicalStatement(patientPregnancy);
				if (result == null) result = caseAct(patientPregnancy);
				if (result == null) result = caseInfrastructureRoot(patientPregnancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.LAST_ORAL_INTAKE: {
				LastOralIntake lastOralIntake = (LastOralIntake)theEObject;
				T result = caseLastOralIntake(lastOralIntake);
				if (result == null) result = caseObservation(lastOralIntake);
				if (result == null) result = caseClinicalStatement(lastOralIntake);
				if (result == null) result = caseAct(lastOralIntake);
				if (result == null) result = caseInfrastructureRoot(lastOralIntake);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_AGE: {
				PatientAge patientAge = (PatientAge)theEObject;
				T result = casePatientAge(patientAge);
				if (result == null) result = caseObservation(patientAge);
				if (result == null) result = caseClinicalStatement(patientAge);
				if (result == null) result = caseAct(patientAge);
				if (result == null) result = caseInfrastructureRoot(patientAge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.THROMBOLYTIC_CONTRAINDICATIONS: {
				ThrombolyticContraindications thrombolyticContraindications = (ThrombolyticContraindications)theEObject;
				T result = caseThrombolyticContraindications(thrombolyticContraindications);
				if (result == null) result = caseObservation(thrombolyticContraindications);
				if (result == null) result = caseClinicalStatement(thrombolyticContraindications);
				if (result == null) result = caseAct(thrombolyticContraindications);
				if (result == null) result = caseInfrastructureRoot(thrombolyticContraindications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.BARRIERS_TO_PATIENT_CARE: {
				BarriersToPatientCare barriersToPatientCare = (BarriersToPatientCare)theEObject;
				T result = caseBarriersToPatientCare(barriersToPatientCare);
				if (result == null) result = caseObservation(barriersToPatientCare);
				if (result == null) result = caseClinicalStatement(barriersToPatientCare);
				if (result == null) result = caseAct(barriersToPatientCare);
				if (result == null) result = caseInfrastructureRoot(barriersToPatientCare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_MEDICATIONS_ADMINISTERED_SECTION: {
				EMSMedicationsAdministeredSection emsMedicationsAdministeredSection = (EMSMedicationsAdministeredSection)theEObject;
				T result = caseEMSMedicationsAdministeredSection(emsMedicationsAdministeredSection);
				if (result == null) result = caseMedicationsAdministeredSection(emsMedicationsAdministeredSection);
				if (result == null) result = caseSection(emsMedicationsAdministeredSection);
				if (result == null) result = caseAct(emsMedicationsAdministeredSection);
				if (result == null) result = caseInfrastructureRoot(emsMedicationsAdministeredSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MEDICATION_ADMINISTERED: {
				MedicationAdministered medicationAdministered = (MedicationAdministered)theEObject;
				T result = caseMedicationAdministered(medicationAdministered);
				if (result == null) result = caseMedicationActivity(medicationAdministered);
				if (result == null) result = caseSubstanceAdministration(medicationAdministered);
				if (result == null) result = caseClinicalStatement(medicationAdministered);
				if (result == null) result = caseAct(medicationAdministered);
				if (result == null) result = caseInfrastructureRoot(medicationAdministered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_PROCEDURES_PERFORMED_SECTION: {
				EMSProceduresPerformedSection emsProceduresPerformedSection = (EMSProceduresPerformedSection)theEObject;
				T result = caseEMSProceduresPerformedSection(emsProceduresPerformedSection);
				if (result == null) result = caseProcedureDescriptionSection(emsProceduresPerformedSection);
				if (result == null) result = caseSection(emsProceduresPerformedSection);
				if (result == null) result = caseAct(emsProceduresPerformedSection);
				if (result == null) result = caseInfrastructureRoot(emsProceduresPerformedSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseProcedureActivityProcedure(procedure);
				if (result == null) result = caseCDA_Procedure(procedure);
				if (result == null) result = caseClinicalStatement(procedure);
				if (result == null) result = caseAct(procedure);
				if (result == null) result = caseInfrastructureRoot(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_PATIENT_CARE_NARRATIVE_SECTION: {
				EMSPatientCareNarrativeSection emsPatientCareNarrativeSection = (EMSPatientCareNarrativeSection)theEObject;
				T result = caseEMSPatientCareNarrativeSection(emsPatientCareNarrativeSection);
				if (result == null) result = caseSection(emsPatientCareNarrativeSection);
				if (result == null) result = caseAct(emsPatientCareNarrativeSection);
				if (result == null) result = caseInfrastructureRoot(emsPatientCareNarrativeSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_SCENE_SECTION: {
				EMSSceneSection emsSceneSection = (EMSSceneSection)theEObject;
				T result = caseEMSSceneSection(emsSceneSection);
				if (result == null) result = caseSection(emsSceneSection);
				if (result == null) result = caseAct(emsSceneSection);
				if (result == null) result = caseInfrastructureRoot(emsSceneSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.FIRST_UNIT_INDICATOR: {
				FirstUnitIndicator firstUnitIndicator = (FirstUnitIndicator)theEObject;
				T result = caseFirstUnitIndicator(firstUnitIndicator);
				if (result == null) result = caseObservation(firstUnitIndicator);
				if (result == null) result = caseClinicalStatement(firstUnitIndicator);
				if (result == null) result = caseAct(firstUnitIndicator);
				if (result == null) result = caseInfrastructureRoot(firstUnitIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.FIRST_UNIT_ON_SCENE: {
				FirstUnitOnScene firstUnitOnScene = (FirstUnitOnScene)theEObject;
				T result = caseFirstUnitOnScene(firstUnitOnScene);
				if (result == null) result = caseObservation(firstUnitOnScene);
				if (result == null) result = caseClinicalStatement(firstUnitOnScene);
				if (result == null) result = caseAct(firstUnitOnScene);
				if (result == null) result = caseInfrastructureRoot(firstUnitOnScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.SCENE_PATIENT_COUNT: {
				ScenePatientCount scenePatientCount = (ScenePatientCount)theEObject;
				T result = caseScenePatientCount(scenePatientCount);
				if (result == null) result = caseObservation(scenePatientCount);
				if (result == null) result = caseClinicalStatement(scenePatientCount);
				if (result == null) result = caseAct(scenePatientCount);
				if (result == null) result = caseInfrastructureRoot(scenePatientCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MASS_CASUALTY_INDICATOR: {
				MassCasualtyIndicator massCasualtyIndicator = (MassCasualtyIndicator)theEObject;
				T result = caseMassCasualtyIndicator(massCasualtyIndicator);
				if (result == null) result = caseObservation(massCasualtyIndicator);
				if (result == null) result = caseClinicalStatement(massCasualtyIndicator);
				if (result == null) result = caseAct(massCasualtyIndicator);
				if (result == null) result = caseInfrastructureRoot(massCasualtyIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.LOCATION_TYPE_OBSERVATION: {
				LocationTypeObservation locationTypeObservation = (LocationTypeObservation)theEObject;
				T result = caseLocationTypeObservation(locationTypeObservation);
				if (result == null) result = caseObservation(locationTypeObservation);
				if (result == null) result = caseClinicalStatement(locationTypeObservation);
				if (result == null) result = caseAct(locationTypeObservation);
				if (result == null) result = caseInfrastructureRoot(locationTypeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_DISPATCH_SECTION: {
				EMSDispatchSection emsDispatchSection = (EMSDispatchSection)theEObject;
				T result = caseEMSDispatchSection(emsDispatchSection);
				if (result == null) result = caseSection(emsDispatchSection);
				if (result == null) result = caseAct(emsDispatchSection);
				if (result == null) result = caseInfrastructureRoot(emsDispatchSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMERGENCY_MEDICAL_DISPATCH_OBSERVATION: {
				EmergencyMedicalDispatchObservation emergencyMedicalDispatchObservation = (EmergencyMedicalDispatchObservation)theEObject;
				T result = caseEmergencyMedicalDispatchObservation(emergencyMedicalDispatchObservation);
				if (result == null) result = caseObservation(emergencyMedicalDispatchObservation);
				if (result == null) result = caseClinicalStatement(emergencyMedicalDispatchObservation);
				if (result == null) result = caseAct(emergencyMedicalDispatchObservation);
				if (result == null) result = caseInfrastructureRoot(emergencyMedicalDispatchObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.COMPLAINT_REPORTED_BY_DISPATCH: {
				ComplaintReportedByDispatch complaintReportedByDispatch = (ComplaintReportedByDispatch)theEObject;
				T result = caseComplaintReportedByDispatch(complaintReportedByDispatch);
				if (result == null) result = caseObservation(complaintReportedByDispatch);
				if (result == null) result = caseClinicalStatement(complaintReportedByDispatch);
				if (result == null) result = caseAct(complaintReportedByDispatch);
				if (result == null) result = caseInfrastructureRoot(complaintReportedByDispatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_DISPOSITION_SECTION: {
				EMSDispositionSection emsDispositionSection = (EMSDispositionSection)theEObject;
				T result = caseEMSDispositionSection(emsDispositionSection);
				if (result == null) result = caseSection(emsDispositionSection);
				if (result == null) result = caseAct(emsDispositionSection);
				if (result == null) result = caseInfrastructureRoot(emsDispositionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION: {
				NumberOfPatientsTransportedObservation numberOfPatientsTransportedObservation = (NumberOfPatientsTransportedObservation)theEObject;
				T result = caseNumberOfPatientsTransportedObservation(numberOfPatientsTransportedObservation);
				if (result == null) result = caseObservation(numberOfPatientsTransportedObservation);
				if (result == null) result = caseClinicalStatement(numberOfPatientsTransportedObservation);
				if (result == null) result = caseAct(numberOfPatientsTransportedObservation);
				if (result == null) result = caseInfrastructureRoot(numberOfPatientsTransportedObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.INCIDENT_DISPOSITION_OBSERVATION: {
				IncidentDispositionObservation incidentDispositionObservation = (IncidentDispositionObservation)theEObject;
				T result = caseIncidentDispositionObservation(incidentDispositionObservation);
				if (result == null) result = caseObservation(incidentDispositionObservation);
				if (result == null) result = caseClinicalStatement(incidentDispositionObservation);
				if (result == null) result = caseAct(incidentDispositionObservation);
				if (result == null) result = caseInfrastructureRoot(incidentDispositionObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.TRANSPORT_MODE_OBSERVATION: {
				TransportModeObservation transportModeObservation = (TransportModeObservation)theEObject;
				T result = caseTransportModeObservation(transportModeObservation);
				if (result == null) result = caseObservation(transportModeObservation);
				if (result == null) result = caseClinicalStatement(transportModeObservation);
				if (result == null) result = caseAct(transportModeObservation);
				if (result == null) result = caseInfrastructureRoot(transportModeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.TRANSPORT_METHOD_OBSERVATION: {
				TransportMethodObservation transportMethodObservation = (TransportMethodObservation)theEObject;
				T result = caseTransportMethodObservation(transportMethodObservation);
				if (result == null) result = caseObservation(transportMethodObservation);
				if (result == null) result = caseClinicalStatement(transportMethodObservation);
				if (result == null) result = caseAct(transportMethodObservation);
				if (result == null) result = caseInfrastructureRoot(transportMethodObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.REASON_FOR_CHOOSING_DESTINATION_OBSERVATION: {
				ReasonForChoosingDestinationObservation reasonForChoosingDestinationObservation = (ReasonForChoosingDestinationObservation)theEObject;
				T result = caseReasonForChoosingDestinationObservation(reasonForChoosingDestinationObservation);
				if (result == null) result = caseObservation(reasonForChoosingDestinationObservation);
				if (result == null) result = caseClinicalStatement(reasonForChoosingDestinationObservation);
				if (result == null) result = caseAct(reasonForChoosingDestinationObservation);
				if (result == null) result = caseInfrastructureRoot(reasonForChoosingDestinationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PREARRIVAL_ACTIVATION_OBSERVATION: {
				PrearrivalActivationObservation prearrivalActivationObservation = (PrearrivalActivationObservation)theEObject;
				T result = casePrearrivalActivationObservation(prearrivalActivationObservation);
				if (result == null) result = caseObservation(prearrivalActivationObservation);
				if (result == null) result = caseClinicalStatement(prearrivalActivationObservation);
				if (result == null) result = caseAct(prearrivalActivationObservation);
				if (result == null) result = caseInfrastructureRoot(prearrivalActivationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION: {
				PatientConditionChangeAtDestinationObservation patientConditionChangeAtDestinationObservation = (PatientConditionChangeAtDestinationObservation)theEObject;
				T result = casePatientConditionChangeAtDestinationObservation(patientConditionChangeAtDestinationObservation);
				if (result == null) result = caseObservation(patientConditionChangeAtDestinationObservation);
				if (result == null) result = caseClinicalStatement(patientConditionChangeAtDestinationObservation);
				if (result == null) result = caseAct(patientConditionChangeAtDestinationObservation);
				if (result == null) result = caseInfrastructureRoot(patientConditionChangeAtDestinationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_PERSONNEL_ADVERSE_EVENT_SECTION: {
				EMSPersonnelAdverseEventSection emsPersonnelAdverseEventSection = (EMSPersonnelAdverseEventSection)theEObject;
				T result = caseEMSPersonnelAdverseEventSection(emsPersonnelAdverseEventSection);
				if (result == null) result = caseSection(emsPersonnelAdverseEventSection);
				if (result == null) result = caseAct(emsPersonnelAdverseEventSection);
				if (result == null) result = caseInfrastructureRoot(emsPersonnelAdverseEventSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ADVERSE_EVENT_INDICATOR: {
				AdverseEventIndicator adverseEventIndicator = (AdverseEventIndicator)theEObject;
				T result = caseAdverseEventIndicator(adverseEventIndicator);
				if (result == null) result = caseObservation(adverseEventIndicator);
				if (result == null) result = caseClinicalStatement(adverseEventIndicator);
				if (result == null) result = caseAct(adverseEventIndicator);
				if (result == null) result = caseInfrastructureRoot(adverseEventIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ADVERSE_EVENT_TYPE_OBSERVATION: {
				AdverseEventTypeObservation adverseEventTypeObservation = (AdverseEventTypeObservation)theEObject;
				T result = caseAdverseEventTypeObservation(adverseEventTypeObservation);
				if (result == null) result = caseObservation(adverseEventTypeObservation);
				if (result == null) result = caseClinicalStatement(adverseEventTypeObservation);
				if (result == null) result = caseAct(adverseEventTypeObservation);
				if (result == null) result = caseInfrastructureRoot(adverseEventTypeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_PROTOCOL_SECTION: {
				EMSProtocolSection emsProtocolSection = (EMSProtocolSection)theEObject;
				T result = caseEMSProtocolSection(emsProtocolSection);
				if (result == null) result = caseSection(emsProtocolSection);
				if (result == null) result = caseAct(emsProtocolSection);
				if (result == null) result = caseInfrastructureRoot(emsProtocolSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROTOCOL_OBSERVATION: {
				ProtocolObservation protocolObservation = (ProtocolObservation)theEObject;
				T result = caseProtocolObservation(protocolObservation);
				if (result == null) result = caseObservation(protocolObservation);
				if (result == null) result = caseClinicalStatement(protocolObservation);
				if (result == null) result = caseAct(protocolObservation);
				if (result == null) result = caseInfrastructureRoot(protocolObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CANDIDATE_PATIENT_REGISTRY_TYPE: {
				CandidatePatientRegistryType candidatePatientRegistryType = (CandidatePatientRegistryType)theEObject;
				T result = caseCandidatePatientRegistryType(candidatePatientRegistryType);
				if (result == null) result = caseObservation(candidatePatientRegistryType);
				if (result == null) result = caseClinicalStatement(candidatePatientRegistryType);
				if (result == null) result = caseAct(candidatePatientRegistryType);
				if (result == null) result = caseInfrastructureRoot(candidatePatientRegistryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_RESPONSE_SECTION: {
				EMSResponseSection emsResponseSection = (EMSResponseSection)theEObject;
				T result = caseEMSResponseSection(emsResponseSection);
				if (result == null) result = caseSection(emsResponseSection);
				if (result == null) result = caseAct(emsResponseSection);
				if (result == null) result = caseInfrastructureRoot(emsResponseSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DELAY_ORGANIZER: {
				DelayOrganizer delayOrganizer = (DelayOrganizer)theEObject;
				T result = caseDelayOrganizer(delayOrganizer);
				if (result == null) result = caseOrganizer(delayOrganizer);
				if (result == null) result = caseClinicalStatement(delayOrganizer);
				if (result == null) result = caseAct(delayOrganizer);
				if (result == null) result = caseInfrastructureRoot(delayOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISPATCH_LOCATION_ORGANIZER: {
				DispatchLocationOrganizer dispatchLocationOrganizer = (DispatchLocationOrganizer)theEObject;
				T result = caseDispatchLocationOrganizer(dispatchLocationOrganizer);
				if (result == null) result = caseOrganizer(dispatchLocationOrganizer);
				if (result == null) result = caseClinicalStatement(dispatchLocationOrganizer);
				if (result == null) result = caseAct(dispatchLocationOrganizer);
				if (result == null) result = caseInfrastructureRoot(dispatchLocationOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_ODOMETER_READING_ORGANIZER: {
				ResponseOdometerReadingOrganizer responseOdometerReadingOrganizer = (ResponseOdometerReadingOrganizer)theEObject;
				T result = caseResponseOdometerReadingOrganizer(responseOdometerReadingOrganizer);
				if (result == null) result = caseOrganizer(responseOdometerReadingOrganizer);
				if (result == null) result = caseClinicalStatement(responseOdometerReadingOrganizer);
				if (result == null) result = caseAct(responseOdometerReadingOrganizer);
				if (result == null) result = caseInfrastructureRoot(responseOdometerReadingOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_MODE_TO_SCENE: {
				ResponseModeToScene responseModeToScene = (ResponseModeToScene)theEObject;
				T result = caseResponseModeToScene(responseModeToScene);
				if (result == null) result = caseObservation(responseModeToScene);
				if (result == null) result = caseClinicalStatement(responseModeToScene);
				if (result == null) result = caseAct(responseModeToScene);
				if (result == null) result = caseInfrastructureRoot(responseModeToScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_SITUATION_SECTION: {
				EMSSituationSection emsSituationSection = (EMSSituationSection)theEObject;
				T result = caseEMSSituationSection(emsSituationSection);
				if (result == null) result = caseSection(emsSituationSection);
				if (result == null) result = caseAct(emsSituationSection);
				if (result == null) result = caseInfrastructureRoot(emsSituationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.COMPLAINT: {
				Complaint complaint = (Complaint)theEObject;
				T result = caseComplaint(complaint);
				if (result == null) result = caseObservation(complaint);
				if (result == null) result = caseClinicalStatement(complaint);
				if (result == null) result = caseAct(complaint);
				if (result == null) result = caseInfrastructureRoot(complaint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.POSSIBLE_INJURY: {
				PossibleInjury possibleInjury = (PossibleInjury)theEObject;
				T result = casePossibleInjury(possibleInjury);
				if (result == null) result = caseObservation(possibleInjury);
				if (result == null) result = caseClinicalStatement(possibleInjury);
				if (result == null) result = caseAct(possibleInjury);
				if (result == null) result = caseInfrastructureRoot(possibleInjury);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROVIDER_PRIMARY_IMPRESSION: {
				ProviderPrimaryImpression providerPrimaryImpression = (ProviderPrimaryImpression)theEObject;
				T result = caseProviderPrimaryImpression(providerPrimaryImpression);
				if (result == null) result = caseObservation(providerPrimaryImpression);
				if (result == null) result = caseClinicalStatement(providerPrimaryImpression);
				if (result == null) result = caseAct(providerPrimaryImpression);
				if (result == null) result = caseInfrastructureRoot(providerPrimaryImpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PRIMARY_SYMPTOM: {
				PrimarySymptom primarySymptom = (PrimarySymptom)theEObject;
				T result = casePrimarySymptom(primarySymptom);
				if (result == null) result = caseObservation(primarySymptom);
				if (result == null) result = caseClinicalStatement(primarySymptom);
				if (result == null) result = caseAct(primarySymptom);
				if (result == null) result = caseInfrastructureRoot(primarySymptom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.OTHER_SYMPTOMS: {
				OtherSymptoms otherSymptoms = (OtherSymptoms)theEObject;
				T result = caseOtherSymptoms(otherSymptoms);
				if (result == null) result = caseObservation(otherSymptoms);
				if (result == null) result = caseClinicalStatement(otherSymptoms);
				if (result == null) result = caseAct(otherSymptoms);
				if (result == null) result = caseInfrastructureRoot(otherSymptoms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROVIDER_SECONDARY_IMPRESSIONS: {
				ProviderSecondaryImpressions providerSecondaryImpressions = (ProviderSecondaryImpressions)theEObject;
				T result = caseProviderSecondaryImpressions(providerSecondaryImpressions);
				if (result == null) result = caseObservation(providerSecondaryImpressions);
				if (result == null) result = caseClinicalStatement(providerSecondaryImpressions);
				if (result == null) result = caseAct(providerSecondaryImpressions);
				if (result == null) result = caseInfrastructureRoot(providerSecondaryImpressions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.INITIAL_PATIENT_ACUITY: {
				InitialPatientAcuity initialPatientAcuity = (InitialPatientAcuity)theEObject;
				T result = caseInitialPatientAcuity(initialPatientAcuity);
				if (result == null) result = caseObservation(initialPatientAcuity);
				if (result == null) result = caseClinicalStatement(initialPatientAcuity);
				if (result == null) result = caseAct(initialPatientAcuity);
				if (result == null) result = caseInfrastructureRoot(initialPatientAcuity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.TIMES_SECTION: {
				TimesSection timesSection = (TimesSection)theEObject;
				T result = caseTimesSection(timesSection);
				if (result == null) result = caseSection(timesSection);
				if (result == null) result = caseAct(timesSection);
				if (result == null) result = caseInfrastructureRoot(timesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CALL_TIME: {
				CallTime callTime = (CallTime)theEObject;
				T result = caseCallTime(callTime);
				if (result == null) result = caseObservation(callTime);
				if (result == null) result = caseClinicalStatement(callTime);
				if (result == null) result = caseAct(callTime);
				if (result == null) result = caseInfrastructureRoot(callTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.UNIT_NOTIFIED_TIME: {
				UnitNotifiedTime unitNotifiedTime = (UnitNotifiedTime)theEObject;
				T result = caseUnitNotifiedTime(unitNotifiedTime);
				if (result == null) result = caseObservation(unitNotifiedTime);
				if (result == null) result = caseClinicalStatement(unitNotifiedTime);
				if (result == null) result = caseAct(unitNotifiedTime);
				if (result == null) result = caseInfrastructureRoot(unitNotifiedTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.UNIT_EN_ROUTE_TIME: {
				UnitEnRouteTime unitEnRouteTime = (UnitEnRouteTime)theEObject;
				T result = caseUnitEnRouteTime(unitEnRouteTime);
				if (result == null) result = caseObservation(unitEnRouteTime);
				if (result == null) result = caseClinicalStatement(unitEnRouteTime);
				if (result == null) result = caseAct(unitEnRouteTime);
				if (result == null) result = caseInfrastructureRoot(unitEnRouteTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.UNIT_ON_SCENE_TIME: {
				UnitOnSceneTime unitOnSceneTime = (UnitOnSceneTime)theEObject;
				T result = caseUnitOnSceneTime(unitOnSceneTime);
				if (result == null) result = caseObservation(unitOnSceneTime);
				if (result == null) result = caseClinicalStatement(unitOnSceneTime);
				if (result == null) result = caseAct(unitOnSceneTime);
				if (result == null) result = caseInfrastructureRoot(unitOnSceneTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.UNIT_AT_PATIENT_TIME: {
				UnitAtPatientTime unitAtPatientTime = (UnitAtPatientTime)theEObject;
				T result = caseUnitAtPatientTime(unitAtPatientTime);
				if (result == null) result = caseObservation(unitAtPatientTime);
				if (result == null) result = caseClinicalStatement(unitAtPatientTime);
				if (result == null) result = caseAct(unitAtPatientTime);
				if (result == null) result = caseInfrastructureRoot(unitAtPatientTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.UNIT_LEFT_SCENE_TIME: {
				UnitLeftSceneTime unitLeftSceneTime = (UnitLeftSceneTime)theEObject;
				T result = caseUnitLeftSceneTime(unitLeftSceneTime);
				if (result == null) result = caseObservation(unitLeftSceneTime);
				if (result == null) result = caseClinicalStatement(unitLeftSceneTime);
				if (result == null) result = caseAct(unitLeftSceneTime);
				if (result == null) result = caseInfrastructureRoot(unitLeftSceneTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_ARRIVED_AT_DESTINATION_TIME: {
				PatientArrivedAtDestinationTime patientArrivedAtDestinationTime = (PatientArrivedAtDestinationTime)theEObject;
				T result = casePatientArrivedAtDestinationTime(patientArrivedAtDestinationTime);
				if (result == null) result = caseObservation(patientArrivedAtDestinationTime);
				if (result == null) result = caseClinicalStatement(patientArrivedAtDestinationTime);
				if (result == null) result = caseAct(patientArrivedAtDestinationTime);
				if (result == null) result = caseInfrastructureRoot(patientArrivedAtDestinationTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.UNIT_BACK_IN_SERVICE_TIME: {
				UnitBackInServiceTime unitBackInServiceTime = (UnitBackInServiceTime)theEObject;
				T result = caseUnitBackInServiceTime(unitBackInServiceTime);
				if (result == null) result = caseObservation(unitBackInServiceTime);
				if (result == null) result = caseClinicalStatement(unitBackInServiceTime);
				if (result == null) result = caseAct(unitBackInServiceTime);
				if (result == null) result = caseInfrastructureRoot(unitBackInServiceTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISPATCH_NOTIFIED_TIME: {
				DispatchNotifiedTime dispatchNotifiedTime = (DispatchNotifiedTime)theEObject;
				T result = caseDispatchNotifiedTime(dispatchNotifiedTime);
				if (result == null) result = caseObservation(dispatchNotifiedTime);
				if (result == null) result = caseClinicalStatement(dispatchNotifiedTime);
				if (result == null) result = caseAct(dispatchNotifiedTime);
				if (result == null) result = caseInfrastructureRoot(dispatchNotifiedTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_VITAL_SIGNS_SECTION: {
				EMSVitalSignsSection emsVitalSignsSection = (EMSVitalSignsSection)theEObject;
				T result = caseEMSVitalSignsSection(emsVitalSignsSection);
				if (result == null) result = caseVitalSignsSection(emsVitalSignsSection);
				if (result == null) result = caseVitalSignsSectionEntriesOptional(emsVitalSignsSection);
				if (result == null) result = caseSection(emsVitalSignsSection);
				if (result == null) result = caseAct(emsVitalSignsSection);
				if (result == null) result = caseInfrastructureRoot(emsVitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer)theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseConsol_VitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseClinicalStatement(vitalSignsOrganizer);
				if (result == null) result = caseAct(vitalSignsOrganizer);
				if (result == null) result = caseInfrastructureRoot(vitalSignsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PRIOR_AID_VITALS: {
				PriorAidVitals priorAidVitals = (PriorAidVitals)theEObject;
				T result = casePriorAidVitals(priorAidVitals);
				if (result == null) result = caseObservation(priorAidVitals);
				if (result == null) result = caseClinicalStatement(priorAidVitals);
				if (result == null) result = caseAct(priorAidVitals);
				if (result == null) result = caseInfrastructureRoot(priorAidVitals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ADDITIONAL_VITAL_SIGNS_ORGANIZER: {
				AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer = (AdditionalVitalSignsOrganizer)theEObject;
				T result = caseAdditionalVitalSignsOrganizer(additionalVitalSignsOrganizer);
				if (result == null) result = caseOrganizer(additionalVitalSignsOrganizer);
				if (result == null) result = caseClinicalStatement(additionalVitalSignsOrganizer);
				if (result == null) result = caseAct(additionalVitalSignsOrganizer);
				if (result == null) result = caseInfrastructureRoot(additionalVitalSignsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.STROKE_SCORE: {
				StrokeScore strokeScore = (StrokeScore)theEObject;
				T result = caseStrokeScore(strokeScore);
				if (result == null) result = caseObservation(strokeScore);
				if (result == null) result = caseClinicalStatement(strokeScore);
				if (result == null) result = caseAct(strokeScore);
				if (result == null) result = caseInfrastructureRoot(strokeScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PAIN_SCORE: {
				PainScore painScore = (PainScore)theEObject;
				T result = casePainScore(painScore);
				if (result == null) result = caseObservation(painScore);
				if (result == null) result = caseClinicalStatement(painScore);
				if (result == null) result = caseAct(painScore);
				if (result == null) result = caseInfrastructureRoot(painScore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.LEVEL_OF_RESPONSIVENESS: {
				LevelOfResponsiveness levelOfResponsiveness = (LevelOfResponsiveness)theEObject;
				T result = caseLevelOfResponsiveness(levelOfResponsiveness);
				if (result == null) result = caseObservation(levelOfResponsiveness);
				if (result == null) result = caseClinicalStatement(levelOfResponsiveness);
				if (result == null) result = caseAct(levelOfResponsiveness);
				if (result == null) result = caseInfrastructureRoot(levelOfResponsiveness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.BLOOD_GLUCOSE: {
				BloodGlucose bloodGlucose = (BloodGlucose)theEObject;
				T result = caseBloodGlucose(bloodGlucose);
				if (result == null) result = caseObservation(bloodGlucose);
				if (result == null) result = caseClinicalStatement(bloodGlucose);
				if (result == null) result = caseAct(bloodGlucose);
				if (result == null) result = caseInfrastructureRoot(bloodGlucose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CARBON_MONOXIDE: {
				CarbonMonoxide carbonMonoxide = (CarbonMonoxide)theEObject;
				T result = caseCarbonMonoxide(carbonMonoxide);
				if (result == null) result = caseObservation(carbonMonoxide);
				if (result == null) result = caseClinicalStatement(carbonMonoxide);
				if (result == null) result = caseAct(carbonMonoxide);
				if (result == null) result = caseInfrastructureRoot(carbonMonoxide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CARBON_DIOXIDE: {
				CarbonDioxide carbonDioxide = (CarbonDioxide)theEObject;
				T result = caseCarbonDioxide(carbonDioxide);
				if (result == null) result = caseObservation(carbonDioxide);
				if (result == null) result = caseClinicalStatement(carbonDioxide);
				if (result == null) result = caseAct(carbonDioxide);
				if (result == null) result = caseInfrastructureRoot(carbonDioxide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CARDIAC_RHYTHM: {
				CardiacRhythm cardiacRhythm = (CardiacRhythm)theEObject;
				T result = caseCardiacRhythm(cardiacRhythm);
				if (result == null) result = caseObservation(cardiacRhythm);
				if (result == null) result = caseClinicalStatement(cardiacRhythm);
				if (result == null) result = caseAct(cardiacRhythm);
				if (result == null) result = caseInfrastructureRoot(cardiacRhythm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.GLASGOW_COMA_SCORE_ORGANIZER: {
				GlasgowComaScoreOrganizer glasgowComaScoreOrganizer = (GlasgowComaScoreOrganizer)theEObject;
				T result = caseGlasgowComaScoreOrganizer(glasgowComaScoreOrganizer);
				if (result == null) result = caseOrganizer(glasgowComaScoreOrganizer);
				if (result == null) result = caseClinicalStatement(glasgowComaScoreOrganizer);
				if (result == null) result = caseAct(glasgowComaScoreOrganizer);
				if (result == null) result = caseInfrastructureRoot(glasgowComaScoreOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.GLASGOW_EYE: {
				GlasgowEye glasgowEye = (GlasgowEye)theEObject;
				T result = caseGlasgowEye(glasgowEye);
				if (result == null) result = caseObservation(glasgowEye);
				if (result == null) result = caseClinicalStatement(glasgowEye);
				if (result == null) result = caseAct(glasgowEye);
				if (result == null) result = caseInfrastructureRoot(glasgowEye);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.GLASGOW_MOTOR: {
				GlasgowMotor glasgowMotor = (GlasgowMotor)theEObject;
				T result = caseGlasgowMotor(glasgowMotor);
				if (result == null) result = caseObservation(glasgowMotor);
				if (result == null) result = caseClinicalStatement(glasgowMotor);
				if (result == null) result = caseAct(glasgowMotor);
				if (result == null) result = caseInfrastructureRoot(glasgowMotor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.GLASGOW_QUALIFIER: {
				GlasgowQualifier glasgowQualifier = (GlasgowQualifier)theEObject;
				T result = caseGlasgowQualifier(glasgowQualifier);
				if (result == null) result = caseObservation(glasgowQualifier);
				if (result == null) result = caseClinicalStatement(glasgowQualifier);
				if (result == null) result = caseAct(glasgowQualifier);
				if (result == null) result = caseInfrastructureRoot(glasgowQualifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.GLASGOW_TOTAL: {
				GlasgowTotal glasgowTotal = (GlasgowTotal)theEObject;
				T result = caseGlasgowTotal(glasgowTotal);
				if (result == null) result = caseObservation(glasgowTotal);
				if (result == null) result = caseClinicalStatement(glasgowTotal);
				if (result == null) result = caseAct(glasgowTotal);
				if (result == null) result = caseInfrastructureRoot(glasgowTotal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.GLASGOW_VERBAL: {
				GlasgowVerbal glasgowVerbal = (GlasgowVerbal)theEObject;
				T result = caseGlasgowVerbal(glasgowVerbal);
				if (result == null) result = caseObservation(glasgowVerbal);
				if (result == null) result = caseClinicalStatement(glasgowVerbal);
				if (result == null) result = caseAct(glasgowVerbal);
				if (result == null) result = caseInfrastructureRoot(glasgowVerbal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION: {
				EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection = (EMSInjuryIncidentDescriptionSection)theEObject;
				T result = caseEMSInjuryIncidentDescriptionSection(emsInjuryIncidentDescriptionSection);
				if (result == null) result = caseSection(emsInjuryIncidentDescriptionSection);
				if (result == null) result = caseAct(emsInjuryIncidentDescriptionSection);
				if (result == null) result = caseInfrastructureRoot(emsInjuryIncidentDescriptionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.INJURY_CAUSE_CATEGORY: {
				InjuryCauseCategory injuryCauseCategory = (InjuryCauseCategory)theEObject;
				T result = caseInjuryCauseCategory(injuryCauseCategory);
				if (result == null) result = caseObservation(injuryCauseCategory);
				if (result == null) result = caseClinicalStatement(injuryCauseCategory);
				if (result == null) result = caseAct(injuryCauseCategory);
				if (result == null) result = caseInfrastructureRoot(injuryCauseCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.INJURY_MECHANISM: {
				InjuryMechanism injuryMechanism = (InjuryMechanism)theEObject;
				T result = caseInjuryMechanism(injuryMechanism);
				if (result == null) result = caseObservation(injuryMechanism);
				if (result == null) result = caseClinicalStatement(injuryMechanism);
				if (result == null) result = caseAct(injuryMechanism);
				if (result == null) result = caseInfrastructureRoot(injuryMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.TRAUMA_CENTER_CRITERIA: {
				TraumaCenterCriteria traumaCenterCriteria = (TraumaCenterCriteria)theEObject;
				T result = caseTraumaCenterCriteria(traumaCenterCriteria);
				if (result == null) result = caseObservation(traumaCenterCriteria);
				if (result == null) result = caseClinicalStatement(traumaCenterCriteria);
				if (result == null) result = caseAct(traumaCenterCriteria);
				if (result == null) result = caseInfrastructureRoot(traumaCenterCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.INJURY_RISK_FACTOR: {
				InjuryRiskFactor injuryRiskFactor = (InjuryRiskFactor)theEObject;
				T result = caseInjuryRiskFactor(injuryRiskFactor);
				if (result == null) result = caseObservation(injuryRiskFactor);
				if (result == null) result = caseClinicalStatement(injuryRiskFactor);
				if (result == null) result = caseAct(injuryRiskFactor);
				if (result == null) result = caseInfrastructureRoot(injuryRiskFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.VEHICLE_IMPACT_AREA: {
				VehicleImpactArea vehicleImpactArea = (VehicleImpactArea)theEObject;
				T result = caseVehicleImpactArea(vehicleImpactArea);
				if (result == null) result = caseObservation(vehicleImpactArea);
				if (result == null) result = caseClinicalStatement(vehicleImpactArea);
				if (result == null) result = caseAct(vehicleImpactArea);
				if (result == null) result = caseInfrastructureRoot(vehicleImpactArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_LOCATION_IN_VEHICLE: {
				PatientLocationInVehicle patientLocationInVehicle = (PatientLocationInVehicle)theEObject;
				T result = casePatientLocationInVehicle(patientLocationInVehicle);
				if (result == null) result = caseObservation(patientLocationInVehicle);
				if (result == null) result = caseClinicalStatement(patientLocationInVehicle);
				if (result == null) result = caseAct(patientLocationInVehicle);
				if (result == null) result = caseInfrastructureRoot(patientLocationInVehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT: {
				VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment = (VehicleOccupantSafetyEquipment)theEObject;
				T result = caseVehicleOccupantSafetyEquipment(vehicleOccupantSafetyEquipment);
				if (result == null) result = caseObservation(vehicleOccupantSafetyEquipment);
				if (result == null) result = caseClinicalStatement(vehicleOccupantSafetyEquipment);
				if (result == null) result = caseAct(vehicleOccupantSafetyEquipment);
				if (result == null) result = caseInfrastructureRoot(vehicleOccupantSafetyEquipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.AIRBAG_DEPLOYMENT_STATUS: {
				AirbagDeploymentStatus airbagDeploymentStatus = (AirbagDeploymentStatus)theEObject;
				T result = caseAirbagDeploymentStatus(airbagDeploymentStatus);
				if (result == null) result = caseObservation(airbagDeploymentStatus);
				if (result == null) result = caseClinicalStatement(airbagDeploymentStatus);
				if (result == null) result = caseAct(airbagDeploymentStatus);
				if (result == null) result = caseInfrastructureRoot(airbagDeploymentStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.HEIGHT_OF_FALL: {
				HeightOfFall heightOfFall = (HeightOfFall)theEObject;
				T result = caseHeightOfFall(heightOfFall);
				if (result == null) result = caseObservation(heightOfFall);
				if (result == null) result = caseClinicalStatement(heightOfFall);
				if (result == null) result = caseAct(heightOfFall);
				if (result == null) result = caseInfrastructureRoot(heightOfFall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISASTER_TYPE: {
				DisasterType disasterType = (DisasterType)theEObject;
				T result = caseDisasterType(disasterType);
				if (result == null) result = caseObservation(disasterType);
				if (result == null) result = caseClinicalStatement(disasterType);
				if (result == null) result = caseAct(disasterType);
				if (result == null) result = caseInfrastructureRoot(disasterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EMS_BILLING_SECTION: {
				EMSBillingSection emsBillingSection = (EMSBillingSection)theEObject;
				T result = caseEMSBillingSection(emsBillingSection);
				if (result == null) result = caseSection(emsBillingSection);
				if (result == null) result = caseAct(emsBillingSection);
				if (result == null) result = caseInfrastructureRoot(emsBillingSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.BILLING_CONDITION: {
				BillingCondition billingCondition = (BillingCondition)theEObject;
				T result = caseBillingCondition(billingCondition);
				if (result == null) result = caseObservation(billingCondition);
				if (result == null) result = caseClinicalStatement(billingCondition);
				if (result == null) result = caseAct(billingCondition);
				if (result == null) result = caseInfrastructureRoot(billingCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.LEVEL_OF_SERVICE_OBSERVATION: {
				LevelOfServiceObservation levelOfServiceObservation = (LevelOfServiceObservation)theEObject;
				T result = caseLevelOfServiceObservation(levelOfServiceObservation);
				if (result == null) result = caseObservation(levelOfServiceObservation);
				if (result == null) result = caseClinicalStatement(levelOfServiceObservation);
				if (result == null) result = caseAct(levelOfServiceObservation);
				if (result == null) result = caseInfrastructureRoot(levelOfServiceObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION: {
				MedicationNotAdministeredReasonObservation medicationNotAdministeredReasonObservation = (MedicationNotAdministeredReasonObservation)theEObject;
				T result = caseMedicationNotAdministeredReasonObservation(medicationNotAdministeredReasonObservation);
				if (result == null) result = caseObservation(medicationNotAdministeredReasonObservation);
				if (result == null) result = caseClinicalStatement(medicationNotAdministeredReasonObservation);
				if (result == null) result = caseAct(medicationNotAdministeredReasonObservation);
				if (result == null) result = caseInfrastructureRoot(medicationNotAdministeredReasonObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MEDICATION_RESPONSE_OBSERVATION: {
				MedicationResponseObservation medicationResponseObservation = (MedicationResponseObservation)theEObject;
				T result = caseMedicationResponseObservation(medicationResponseObservation);
				if (result == null) result = caseObservation(medicationResponseObservation);
				if (result == null) result = caseClinicalStatement(medicationResponseObservation);
				if (result == null) result = caseAct(medicationResponseObservation);
				if (result == null) result = caseInfrastructureRoot(medicationResponseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MEDICATION_COMPLICATION_OBSERVATION: {
				MedicationComplicationObservation medicationComplicationObservation = (MedicationComplicationObservation)theEObject;
				T result = caseMedicationComplicationObservation(medicationComplicationObservation);
				if (result == null) result = caseObservation(medicationComplicationObservation);
				if (result == null) result = caseClinicalStatement(medicationComplicationObservation);
				if (result == null) result = caseAct(medicationComplicationObservation);
				if (result == null) result = caseInfrastructureRoot(medicationComplicationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION: {
				MedicationPriorAdministrationObservation medicationPriorAdministrationObservation = (MedicationPriorAdministrationObservation)theEObject;
				T result = caseMedicationPriorAdministrationObservation(medicationPriorAdministrationObservation);
				if (result == null) result = caseObservation(medicationPriorAdministrationObservation);
				if (result == null) result = caseClinicalStatement(medicationPriorAdministrationObservation);
				if (result == null) result = caseAct(medicationPriorAdministrationObservation);
				if (result == null) result = caseInfrastructureRoot(medicationPriorAdministrationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PATIENT_BODY_WEIGHT: {
				PatientBodyWeight patientBodyWeight = (PatientBodyWeight)theEObject;
				T result = casePatientBodyWeight(patientBodyWeight);
				if (result == null) result = caseObservation(patientBodyWeight);
				if (result == null) result = caseClinicalStatement(patientBodyWeight);
				if (result == null) result = caseAct(patientBodyWeight);
				if (result == null) result = caseInfrastructureRoot(patientBodyWeight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS: {
				LengthBasedPatientBodyWeightClass lengthBasedPatientBodyWeightClass = (LengthBasedPatientBodyWeightClass)theEObject;
				T result = caseLengthBasedPatientBodyWeightClass(lengthBasedPatientBodyWeightClass);
				if (result == null) result = caseObservation(lengthBasedPatientBodyWeightClass);
				if (result == null) result = caseClinicalStatement(lengthBasedPatientBodyWeightClass);
				if (result == null) result = caseAct(lengthBasedPatientBodyWeightClass);
				if (result == null) result = caseInfrastructureRoot(lengthBasedPatientBodyWeightClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.FACE_ASSESSMENT: {
				FaceAssessment faceAssessment = (FaceAssessment)theEObject;
				T result = caseFaceAssessment(faceAssessment);
				if (result == null) result = caseObservation(faceAssessment);
				if (result == null) result = caseClinicalStatement(faceAssessment);
				if (result == null) result = caseAct(faceAssessment);
				if (result == null) result = caseInfrastructureRoot(faceAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.HEAD_ASSESSMENT: {
				HeadAssessment headAssessment = (HeadAssessment)theEObject;
				T result = caseHeadAssessment(headAssessment);
				if (result == null) result = caseObservation(headAssessment);
				if (result == null) result = caseClinicalStatement(headAssessment);
				if (result == null) result = caseAct(headAssessment);
				if (result == null) result = caseInfrastructureRoot(headAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.NECK_ASSESSMENT: {
				NeckAssessment neckAssessment = (NeckAssessment)theEObject;
				T result = caseNeckAssessment(neckAssessment);
				if (result == null) result = caseObservation(neckAssessment);
				if (result == null) result = caseClinicalStatement(neckAssessment);
				if (result == null) result = caseAct(neckAssessment);
				if (result == null) result = caseInfrastructureRoot(neckAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CHEST_AND_LUNGS_ASSESSMENT: {
				ChestAndLungsAssessment chestAndLungsAssessment = (ChestAndLungsAssessment)theEObject;
				T result = caseChestAndLungsAssessment(chestAndLungsAssessment);
				if (result == null) result = caseObservation(chestAndLungsAssessment);
				if (result == null) result = caseClinicalStatement(chestAndLungsAssessment);
				if (result == null) result = caseAct(chestAndLungsAssessment);
				if (result == null) result = caseInfrastructureRoot(chestAndLungsAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.HEART_ASSESSMENT: {
				HeartAssessment heartAssessment = (HeartAssessment)theEObject;
				T result = caseHeartAssessment(heartAssessment);
				if (result == null) result = caseObservation(heartAssessment);
				if (result == null) result = caseClinicalStatement(heartAssessment);
				if (result == null) result = caseAct(heartAssessment);
				if (result == null) result = caseInfrastructureRoot(heartAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ABDOMEN_ASSESSMENT: {
				AbdomenAssessment abdomenAssessment = (AbdomenAssessment)theEObject;
				T result = caseAbdomenAssessment(abdomenAssessment);
				if (result == null) result = caseObservation(abdomenAssessment);
				if (result == null) result = caseClinicalStatement(abdomenAssessment);
				if (result == null) result = caseAct(abdomenAssessment);
				if (result == null) result = caseInfrastructureRoot(abdomenAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PELVIC_AND_GENITOURINARY_ASSESSMENT: {
				PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment = (PelvicAndGenitourinaryAssessment)theEObject;
				T result = casePelvicAndGenitourinaryAssessment(pelvicAndGenitourinaryAssessment);
				if (result == null) result = caseObservation(pelvicAndGenitourinaryAssessment);
				if (result == null) result = caseClinicalStatement(pelvicAndGenitourinaryAssessment);
				if (result == null) result = caseAct(pelvicAndGenitourinaryAssessment);
				if (result == null) result = caseInfrastructureRoot(pelvicAndGenitourinaryAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.BACK_AND_SPINE_ASSESSMENT: {
				BackAndSpineAssessment backAndSpineAssessment = (BackAndSpineAssessment)theEObject;
				T result = caseBackAndSpineAssessment(backAndSpineAssessment);
				if (result == null) result = caseObservation(backAndSpineAssessment);
				if (result == null) result = caseClinicalStatement(backAndSpineAssessment);
				if (result == null) result = caseAct(backAndSpineAssessment);
				if (result == null) result = caseInfrastructureRoot(backAndSpineAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EXTREMITIES_ASSESSMENT: {
				ExtremitiesAssessment extremitiesAssessment = (ExtremitiesAssessment)theEObject;
				T result = caseExtremitiesAssessment(extremitiesAssessment);
				if (result == null) result = caseObservation(extremitiesAssessment);
				if (result == null) result = caseClinicalStatement(extremitiesAssessment);
				if (result == null) result = caseAct(extremitiesAssessment);
				if (result == null) result = caseInfrastructureRoot(extremitiesAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.EYE_ASSESSMENT: {
				EyeAssessment eyeAssessment = (EyeAssessment)theEObject;
				T result = caseEyeAssessment(eyeAssessment);
				if (result == null) result = caseObservation(eyeAssessment);
				if (result == null) result = caseClinicalStatement(eyeAssessment);
				if (result == null) result = caseAct(eyeAssessment);
				if (result == null) result = caseInfrastructureRoot(eyeAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.MENTAL_STATUS_ASSESSMENT: {
				MentalStatusAssessment mentalStatusAssessment = (MentalStatusAssessment)theEObject;
				T result = caseMentalStatusAssessment(mentalStatusAssessment);
				if (result == null) result = caseObservation(mentalStatusAssessment);
				if (result == null) result = caseClinicalStatement(mentalStatusAssessment);
				if (result == null) result = caseAct(mentalStatusAssessment);
				if (result == null) result = caseInfrastructureRoot(mentalStatusAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CARDIAC_ARREST_WITH_TIMING: {
				CardiacArrestWithTiming cardiacArrestWithTiming = (CardiacArrestWithTiming)theEObject;
				T result = caseCardiacArrestWithTiming(cardiacArrestWithTiming);
				if (result == null) result = caseObservation(cardiacArrestWithTiming);
				if (result == null) result = caseClinicalStatement(cardiacArrestWithTiming);
				if (result == null) result = caseAct(cardiacArrestWithTiming);
				if (result == null) result = caseInfrastructureRoot(cardiacArrestWithTiming);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.CARDIAC_ARREST_CAUSE: {
				CardiacArrestCause cardiacArrestCause = (CardiacArrestCause)theEObject;
				T result = caseCardiacArrestCause(cardiacArrestCause);
				if (result == null) result = caseObservation(cardiacArrestCause);
				if (result == null) result = caseClinicalStatement(cardiacArrestCause);
				if (result == null) result = caseAct(cardiacArrestCause);
				if (result == null) result = caseInfrastructureRoot(cardiacArrestCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PRIOR_CPR: {
				PriorCPR priorCPR = (PriorCPR)theEObject;
				T result = casePriorCPR(priorCPR);
				if (result == null) result = caseObservation(priorCPR);
				if (result == null) result = caseClinicalStatement(priorCPR);
				if (result == null) result = caseAct(priorCPR);
				if (result == null) result = caseInfrastructureRoot(priorCPR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PRIOR_AED_USE: {
				PriorAEDUse priorAEDUse = (PriorAEDUse)theEObject;
				T result = casePriorAEDUse(priorAEDUse);
				if (result == null) result = caseObservation(priorAEDUse);
				if (result == null) result = caseClinicalStatement(priorAEDUse);
				if (result == null) result = caseAct(priorAEDUse);
				if (result == null) result = caseInfrastructureRoot(priorAEDUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ARREST_RHYTHM: {
				ArrestRhythm arrestRhythm = (ArrestRhythm)theEObject;
				T result = caseArrestRhythm(arrestRhythm);
				if (result == null) result = caseObservation(arrestRhythm);
				if (result == null) result = caseClinicalStatement(arrestRhythm);
				if (result == null) result = caseAct(arrestRhythm);
				if (result == null) result = caseInfrastructureRoot(arrestRhythm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RETURN_OF_SPONTANEOUS_CIRCULATION: {
				ReturnOfSpontaneousCirculation returnOfSpontaneousCirculation = (ReturnOfSpontaneousCirculation)theEObject;
				T result = caseReturnOfSpontaneousCirculation(returnOfSpontaneousCirculation);
				if (result == null) result = caseObservation(returnOfSpontaneousCirculation);
				if (result == null) result = caseClinicalStatement(returnOfSpontaneousCirculation);
				if (result == null) result = caseAct(returnOfSpontaneousCirculation);
				if (result == null) result = caseInfrastructureRoot(returnOfSpontaneousCirculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DESTINATION_RHYTHM: {
				DestinationRhythm destinationRhythm = (DestinationRhythm)theEObject;
				T result = caseDestinationRhythm(destinationRhythm);
				if (result == null) result = caseObservation(destinationRhythm);
				if (result == null) result = caseClinicalStatement(destinationRhythm);
				if (result == null) result = caseAct(destinationRhythm);
				if (result == null) result = caseInfrastructureRoot(destinationRhythm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.ABANDONED_PROCEDURE_REASON_OBSERVATION: {
				AbandonedProcedureReasonObservation abandonedProcedureReasonObservation = (AbandonedProcedureReasonObservation)theEObject;
				T result = caseAbandonedProcedureReasonObservation(abandonedProcedureReasonObservation);
				if (result == null) result = caseObservation(abandonedProcedureReasonObservation);
				if (result == null) result = caseClinicalStatement(abandonedProcedureReasonObservation);
				if (result == null) result = caseAct(abandonedProcedureReasonObservation);
				if (result == null) result = caseInfrastructureRoot(abandonedProcedureReasonObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROCEDURE_PRIOR_INDICATOR: {
				ProcedurePriorIndicator procedurePriorIndicator = (ProcedurePriorIndicator)theEObject;
				T result = caseProcedurePriorIndicator(procedurePriorIndicator);
				if (result == null) result = caseObservation(procedurePriorIndicator);
				if (result == null) result = caseClinicalStatement(procedurePriorIndicator);
				if (result == null) result = caseAct(procedurePriorIndicator);
				if (result == null) result = caseInfrastructureRoot(procedurePriorIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION: {
				ProcedureNumberOfAttemptsObservation procedureNumberOfAttemptsObservation = (ProcedureNumberOfAttemptsObservation)theEObject;
				T result = caseProcedureNumberOfAttemptsObservation(procedureNumberOfAttemptsObservation);
				if (result == null) result = caseObservation(procedureNumberOfAttemptsObservation);
				if (result == null) result = caseClinicalStatement(procedureNumberOfAttemptsObservation);
				if (result == null) result = caseAct(procedureNumberOfAttemptsObservation);
				if (result == null) result = caseInfrastructureRoot(procedureNumberOfAttemptsObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROCEDURE_SUCCESSFUL_OBSERVATION: {
				ProcedureSuccessfulObservation procedureSuccessfulObservation = (ProcedureSuccessfulObservation)theEObject;
				T result = caseProcedureSuccessfulObservation(procedureSuccessfulObservation);
				if (result == null) result = caseObservation(procedureSuccessfulObservation);
				if (result == null) result = caseClinicalStatement(procedureSuccessfulObservation);
				if (result == null) result = caseAct(procedureSuccessfulObservation);
				if (result == null) result = caseInfrastructureRoot(procedureSuccessfulObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROCEDURE_COMPLICATIONS_OBSERVATION: {
				ProcedureComplicationsObservation procedureComplicationsObservation = (ProcedureComplicationsObservation)theEObject;
				T result = caseProcedureComplicationsObservation(procedureComplicationsObservation);
				if (result == null) result = caseObservation(procedureComplicationsObservation);
				if (result == null) result = caseClinicalStatement(procedureComplicationsObservation);
				if (result == null) result = caseAct(procedureComplicationsObservation);
				if (result == null) result = caseInfrastructureRoot(procedureComplicationsObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROCEDURE_PATIENT_RESPONSE_OBSERVATION: {
				ProcedurePatientResponseObservation procedurePatientResponseObservation = (ProcedurePatientResponseObservation)theEObject;
				T result = caseProcedurePatientResponseObservation(procedurePatientResponseObservation);
				if (result == null) result = caseObservation(procedurePatientResponseObservation);
				if (result == null) result = caseClinicalStatement(procedurePatientResponseObservation);
				if (result == null) result = caseAct(procedurePatientResponseObservation);
				if (result == null) result = caseInfrastructureRoot(procedurePatientResponseObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.AIRWAY_CONFIRMATION_OBSERVATION: {
				AirwayConfirmationObservation airwayConfirmationObservation = (AirwayConfirmationObservation)theEObject;
				T result = caseAirwayConfirmationObservation(airwayConfirmationObservation);
				if (result == null) result = caseObservation(airwayConfirmationObservation);
				if (result == null) result = caseClinicalStatement(airwayConfirmationObservation);
				if (result == null) result = caseAct(airwayConfirmationObservation);
				if (result == null) result = caseInfrastructureRoot(airwayConfirmationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION: {
				ReasonProcedureNotAttemptedObservation reasonProcedureNotAttemptedObservation = (ReasonProcedureNotAttemptedObservation)theEObject;
				T result = caseReasonProcedureNotAttemptedObservation(reasonProcedureNotAttemptedObservation);
				if (result == null) result = caseObservation(reasonProcedureNotAttemptedObservation);
				if (result == null) result = caseClinicalStatement(reasonProcedureNotAttemptedObservation);
				if (result == null) result = caseAct(reasonProcedureNotAttemptedObservation);
				if (result == null) result = caseInfrastructureRoot(reasonProcedureNotAttemptedObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.COMPLAINT_TYPE: {
				ComplaintType complaintType = (ComplaintType)theEObject;
				T result = caseComplaintType(complaintType);
				if (result == null) result = caseObservation(complaintType);
				if (result == null) result = caseClinicalStatement(complaintType);
				if (result == null) result = caseAct(complaintType);
				if (result == null) result = caseInfrastructureRoot(complaintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.COMPLAINT_DURATION: {
				ComplaintDuration complaintDuration = (ComplaintDuration)theEObject;
				T result = caseComplaintDuration(complaintDuration);
				if (result == null) result = caseObservation(complaintDuration);
				if (result == null) result = caseClinicalStatement(complaintDuration);
				if (result == null) result = caseAct(complaintDuration);
				if (result == null) result = caseInfrastructureRoot(complaintDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.COMPLAINT_ORGAN_SYSTEM: {
				ComplaintOrganSystem complaintOrganSystem = (ComplaintOrganSystem)theEObject;
				T result = caseComplaintOrganSystem(complaintOrganSystem);
				if (result == null) result = caseObservation(complaintOrganSystem);
				if (result == null) result = caseClinicalStatement(complaintOrganSystem);
				if (result == null) result = caseAct(complaintOrganSystem);
				if (result == null) result = caseInfrastructureRoot(complaintOrganSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.NEUROLOGICAL_ASSESSMENT: {
				NeurologicalAssessment neurologicalAssessment = (NeurologicalAssessment)theEObject;
				T result = caseNeurologicalAssessment(neurologicalAssessment);
				if (result == null) result = caseObservation(neurologicalAssessment);
				if (result == null) result = caseClinicalStatement(neurologicalAssessment);
				if (result == null) result = caseAct(neurologicalAssessment);
				if (result == null) result = caseInfrastructureRoot(neurologicalAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.SYSTOLIC_BLOOD_PRESSURE: {
				SystolicBloodPressure systolicBloodPressure = (SystolicBloodPressure)theEObject;
				T result = caseSystolicBloodPressure(systolicBloodPressure);
				if (result == null) result = caseVitalSignObservation(systolicBloodPressure);
				if (result == null) result = caseObservation(systolicBloodPressure);
				if (result == null) result = caseClinicalStatement(systolicBloodPressure);
				if (result == null) result = caseAct(systolicBloodPressure);
				if (result == null) result = caseInfrastructureRoot(systolicBloodPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DIASTOLIC_BLOOD_PRESSURE: {
				DiastolicBloodPressure diastolicBloodPressure = (DiastolicBloodPressure)theEObject;
				T result = caseDiastolicBloodPressure(diastolicBloodPressure);
				if (result == null) result = caseVitalSignObservation(diastolicBloodPressure);
				if (result == null) result = caseObservation(diastolicBloodPressure);
				if (result == null) result = caseClinicalStatement(diastolicBloodPressure);
				if (result == null) result = caseAct(diastolicBloodPressure);
				if (result == null) result = caseInfrastructureRoot(diastolicBloodPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.HEART_RATE: {
				HeartRate heartRate = (HeartRate)theEObject;
				T result = caseHeartRate(heartRate);
				if (result == null) result = caseVitalSignObservation(heartRate);
				if (result == null) result = caseObservation(heartRate);
				if (result == null) result = caseClinicalStatement(heartRate);
				if (result == null) result = caseAct(heartRate);
				if (result == null) result = caseInfrastructureRoot(heartRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPIRATORY_RATE: {
				RespiratoryRate respiratoryRate = (RespiratoryRate)theEObject;
				T result = caseRespiratoryRate(respiratoryRate);
				if (result == null) result = caseVitalSignObservation(respiratoryRate);
				if (result == null) result = caseObservation(respiratoryRate);
				if (result == null) result = caseClinicalStatement(respiratoryRate);
				if (result == null) result = caseAct(respiratoryRate);
				if (result == null) result = caseInfrastructureRoot(respiratoryRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.BODY_TEMPERATURE: {
				BodyTemperature bodyTemperature = (BodyTemperature)theEObject;
				T result = caseBodyTemperature(bodyTemperature);
				if (result == null) result = caseVitalSignObservation(bodyTemperature);
				if (result == null) result = caseObservation(bodyTemperature);
				if (result == null) result = caseClinicalStatement(bodyTemperature);
				if (result == null) result = caseAct(bodyTemperature);
				if (result == null) result = caseInfrastructureRoot(bodyTemperature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.OXYGEN_SATURATION: {
				OxygenSaturation oxygenSaturation = (OxygenSaturation)theEObject;
				T result = caseOxygenSaturation(oxygenSaturation);
				if (result == null) result = caseObservation(oxygenSaturation);
				if (result == null) result = caseClinicalStatement(oxygenSaturation);
				if (result == null) result = caseAct(oxygenSaturation);
				if (result == null) result = caseInfrastructureRoot(oxygenSaturation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.PROTOCOL_AGE_CATEGORY: {
				ProtocolAgeCategory protocolAgeCategory = (ProtocolAgeCategory)theEObject;
				T result = caseProtocolAgeCategory(protocolAgeCategory);
				if (result == null) result = caseObservation(protocolAgeCategory);
				if (result == null) result = caseClinicalStatement(protocolAgeCategory);
				if (result == null) result = caseAct(protocolAgeCategory);
				if (result == null) result = caseInfrastructureRoot(protocolAgeCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISPATCH_LOCATION_NAME: {
				DispatchLocationName dispatchLocationName = (DispatchLocationName)theEObject;
				T result = caseDispatchLocationName(dispatchLocationName);
				if (result == null) result = caseObservation(dispatchLocationName);
				if (result == null) result = caseClinicalStatement(dispatchLocationName);
				if (result == null) result = caseAct(dispatchLocationName);
				if (result == null) result = caseInfrastructureRoot(dispatchLocationName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISPATCH_LOCATION_LATITUDE: {
				DispatchLocationLatitude dispatchLocationLatitude = (DispatchLocationLatitude)theEObject;
				T result = caseDispatchLocationLatitude(dispatchLocationLatitude);
				if (result == null) result = caseObservation(dispatchLocationLatitude);
				if (result == null) result = caseClinicalStatement(dispatchLocationLatitude);
				if (result == null) result = caseAct(dispatchLocationLatitude);
				if (result == null) result = caseInfrastructureRoot(dispatchLocationLatitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISPATCH_LOCATION_LONGITUDE: {
				DispatchLocationLongitude dispatchLocationLongitude = (DispatchLocationLongitude)theEObject;
				T result = caseDispatchLocationLongitude(dispatchLocationLongitude);
				if (result == null) result = caseObservation(dispatchLocationLongitude);
				if (result == null) result = caseClinicalStatement(dispatchLocationLongitude);
				if (result == null) result = caseAct(dispatchLocationLongitude);
				if (result == null) result = caseInfrastructureRoot(dispatchLocationLongitude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.DISPATCH_DELAY: {
				DispatchDelay dispatchDelay = (DispatchDelay)theEObject;
				T result = caseDispatchDelay(dispatchDelay);
				if (result == null) result = caseObservation(dispatchDelay);
				if (result == null) result = caseClinicalStatement(dispatchDelay);
				if (result == null) result = caseAct(dispatchDelay);
				if (result == null) result = caseInfrastructureRoot(dispatchDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_DELAY: {
				ResponseDelay responseDelay = (ResponseDelay)theEObject;
				T result = caseResponseDelay(responseDelay);
				if (result == null) result = caseObservation(responseDelay);
				if (result == null) result = caseClinicalStatement(responseDelay);
				if (result == null) result = caseAct(responseDelay);
				if (result == null) result = caseInfrastructureRoot(responseDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.SCENE_DELAY: {
				SceneDelay sceneDelay = (SceneDelay)theEObject;
				T result = caseSceneDelay(sceneDelay);
				if (result == null) result = caseObservation(sceneDelay);
				if (result == null) result = caseClinicalStatement(sceneDelay);
				if (result == null) result = caseAct(sceneDelay);
				if (result == null) result = caseInfrastructureRoot(sceneDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.TRANSPORT_DELAY: {
				TransportDelay transportDelay = (TransportDelay)theEObject;
				T result = caseTransportDelay(transportDelay);
				if (result == null) result = caseObservation(transportDelay);
				if (result == null) result = caseClinicalStatement(transportDelay);
				if (result == null) result = caseAct(transportDelay);
				if (result == null) result = caseInfrastructureRoot(transportDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.TURNAROUND_DELAY: {
				TurnaroundDelay turnaroundDelay = (TurnaroundDelay)theEObject;
				T result = caseTurnaroundDelay(turnaroundDelay);
				if (result == null) result = caseObservation(turnaroundDelay);
				if (result == null) result = caseClinicalStatement(turnaroundDelay);
				if (result == null) result = caseAct(turnaroundDelay);
				if (result == null) result = caseInfrastructureRoot(turnaroundDelay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_BEGINNING_ODOMETER_READING: {
				ResponseBeginningOdometerReading responseBeginningOdometerReading = (ResponseBeginningOdometerReading)theEObject;
				T result = caseResponseBeginningOdometerReading(responseBeginningOdometerReading);
				if (result == null) result = caseObservation(responseBeginningOdometerReading);
				if (result == null) result = caseClinicalStatement(responseBeginningOdometerReading);
				if (result == null) result = caseAct(responseBeginningOdometerReading);
				if (result == null) result = caseInfrastructureRoot(responseBeginningOdometerReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_ON_SCENE_ODOMETER_READING: {
				ResponseOnSceneOdometerReading responseOnSceneOdometerReading = (ResponseOnSceneOdometerReading)theEObject;
				T result = caseResponseOnSceneOdometerReading(responseOnSceneOdometerReading);
				if (result == null) result = caseObservation(responseOnSceneOdometerReading);
				if (result == null) result = caseClinicalStatement(responseOnSceneOdometerReading);
				if (result == null) result = caseAct(responseOnSceneOdometerReading);
				if (result == null) result = caseInfrastructureRoot(responseOnSceneOdometerReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_DESTINATION_ODOMETER_READING: {
				ResponseDestinationOdometerReading responseDestinationOdometerReading = (ResponseDestinationOdometerReading)theEObject;
				T result = caseResponseDestinationOdometerReading(responseDestinationOdometerReading);
				if (result == null) result = caseObservation(responseDestinationOdometerReading);
				if (result == null) result = caseClinicalStatement(responseDestinationOdometerReading);
				if (result == null) result = caseAct(responseDestinationOdometerReading);
				if (result == null) result = caseInfrastructureRoot(responseDestinationOdometerReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmspcrPackage.RESPONSE_ENDING_ODOMETER_READING: {
				ResponseEndingOdometerReading responseEndingOdometerReading = (ResponseEndingOdometerReading)theEObject;
				T result = caseResponseEndingOdometerReading(responseEndingOdometerReading);
				if (result == null) result = caseObservation(responseEndingOdometerReading);
				if (result == null) result = caseClinicalStatement(responseEndingOdometerReading);
				if (result == null) result = caseAct(responseEndingOdometerReading);
				if (result == null) result = caseInfrastructureRoot(responseEndingOdometerReading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Care Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Care Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientCareReport(PatientCareReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Current Medication Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Current Medication Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSCurrentMedicationSection(EMSCurrentMedicationSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Billing Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillingCondition(BillingCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Of Service Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Of Service Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelOfServiceObservation(LevelOfServiceObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currently On Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currently On Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentlyOnMedication(CurrentlyOnMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient On Anticoagulants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient On Anticoagulants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientOnAnticoagulants(PatientOnAnticoagulants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentMedication(CurrentMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Cardiac Arrest Event Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Cardiac Arrest Event Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSCardiacArrestEventSection(EMSCardiacArrestEventSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Cardiac Arrest</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardiac Arrest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCardiacArrest(CardiacArrest object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Advance Directives Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSAdvanceDirectivesSection(EMSAdvanceDirectivesSection object)
  {
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
  public T caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Allergies And Adverse Reactions Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Allergies And Adverse Reactions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSAllergiesAndAdverseReactionsSection(EMSAllergiesAndAdverseReactionsSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Of Drug Allergy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Of Drug Allergy Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceOfDrugAllergyObservation(ExistenceOfDrugAllergyObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Allergy</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Allergy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDrugAllergy(DrugAllergy object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Non Drug Allergy Organizer</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Drug Allergy Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNonDrugAllergyOrganizer(NonDrugAllergyOrganizer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Of Non Drug Allergy</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Of Non Drug Allergy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExistenceOfNonDrugAllergy(ExistenceOfNonDrugAllergy object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Non Drug Allergy</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Drug Allergy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNonDrugAllergy(NonDrugAllergy object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Past Medical History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSPastMedicalHistorySection(EMSPastMedicalHistorySection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Of History Of Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Of History Of Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceOfHistoryOfCondition(ExistenceOfHistoryOfCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfCondition(HistoryOfCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSSocialHistorySection(EMSSocialHistorySection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Of Drug Use Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Of Drug Use Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceOfDrugUseIndication(ExistenceOfDrugUseIndication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drug Use Indication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drug Use Indication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrugUseIndication(DrugUseIndication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Physical Assessment Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Physical Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSPhysicalAssessmentSection(EMSPhysicalAssessmentSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Assessment Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Assessment Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalAssessmentOrganizer(PhysicalAssessmentOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skin Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skin Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkinAssessment(SkinAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Pregnancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Pregnancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientPregnancy(PatientPregnancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Last Oral Intake</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Last Oral Intake</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLastOralIntake(LastOralIntake object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Age</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Age</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientAge(PatientAge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thrombolytic Contraindications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thrombolytic Contraindications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrombolyticContraindications(ThrombolyticContraindications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barriers To Patient Care</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barriers To Patient Care</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarriersToPatientCare(BarriersToPatientCare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSMedicationsAdministeredSection(EMSMedicationsAdministeredSection object)
  {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Administered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Administered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationAdministered(MedicationAdministered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Procedures Performed Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Procedures Performed Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSProceduresPerformedSection(EMSProceduresPerformedSection object)
  {
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
	 * Returns the result of interpreting the object as an instance of '<em>EMS Patient Care Narrative Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Patient Care Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSPatientCareNarrativeSection(EMSPatientCareNarrativeSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Scene Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Scene Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSSceneSection(EMSSceneSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>First Unit Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Unit Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstUnitIndicator(FirstUnitIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Unit On Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Unit On Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstUnitOnScene(FirstUnitOnScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Patient Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Patient Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenePatientCount(ScenePatientCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Casualty Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Casualty Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassCasualtyIndicator(MassCasualtyIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Type Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Type Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationTypeObservation(LocationTypeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Dispatch Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Dispatch Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSDispatchSection(EMSDispatchSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Emergency Medical Dispatch Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emergency Medical Dispatch Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergencyMedicalDispatchObservation(EmergencyMedicalDispatchObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint Reported By Dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint Reported By Dispatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaintReportedByDispatch(ComplaintReportedByDispatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Disposition Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Disposition Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSDispositionSection(EMSDispositionSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Patients Transported Observation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Patients Transported Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNumberOfPatientsTransportedObservation(NumberOfPatientsTransportedObservation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Method Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Method Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportMethodObservation(TransportMethodObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incident Disposition Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incident Disposition Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncidentDispositionObservation(IncidentDispositionObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Mode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Mode Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportModeObservation(TransportModeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Choosing Destination Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Choosing Destination Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForChoosingDestinationObservation(ReasonForChoosingDestinationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prearrival Activation Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prearrival Activation Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrearrivalActivationObservation(PrearrivalActivationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Condition Change At Destination Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Condition Change At Destination Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientConditionChangeAtDestinationObservation(PatientConditionChangeAtDestinationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Personnel Adverse Event Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Personnel Adverse Event Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSPersonnelAdverseEventSection(EMSPersonnelAdverseEventSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventIndicator(AdverseEventIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adverse Event Type Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adverse Event Type Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdverseEventTypeObservation(AdverseEventTypeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Protocol Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Protocol Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSProtocolSection(EMSProtocolSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolObservation(ProtocolObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate Patient Registry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate Patient Registry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidatePatientRegistryType(CandidatePatientRegistryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Response Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Response Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSResponseSection(EMSResponseSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayOrganizer(DelayOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Location Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Location Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchLocationOrganizer(DispatchLocationOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Odometer Reading Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Odometer Reading Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseOdometerReadingOrganizer(ResponseOdometerReadingOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Mode To Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Mode To Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseModeToScene(ResponseModeToScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Situation Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Situation Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSSituationSection(EMSSituationSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaint(Complaint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possible Injury</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possible Injury</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossibleInjury(PossibleInjury object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Primary Impression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Primary Impression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderPrimaryImpression(ProviderPrimaryImpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Symptom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Symptom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimarySymptom(PrimarySymptom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Symptoms</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherSymptoms(OtherSymptoms object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider Secondary Impressions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider Secondary Impressions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProviderSecondaryImpressions(ProviderSecondaryImpressions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Patient Acuity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Patient Acuity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialPatientAcuity(InitialPatientAcuity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Times Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Times Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimesSection(TimesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallTime(CallTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Notified Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Notified Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitNotifiedTime(UnitNotifiedTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit En Route Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit En Route Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitEnRouteTime(UnitEnRouteTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit On Scene Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit On Scene Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitOnSceneTime(UnitOnSceneTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit At Patient Time</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit At Patient Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseUnitAtPatientTime(UnitAtPatientTime object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Left Scene Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Left Scene Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitLeftSceneTime(UnitLeftSceneTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Arrived At Destination Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Arrived At Destination Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientArrivedAtDestinationTime(PatientArrivedAtDestinationTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Back In Service Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Back In Service Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitBackInServiceTime(UnitBackInServiceTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Notified Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Notified Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchNotifiedTime(DispatchNotifiedTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Vital Signs Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSVitalSignsSection(EMSVitalSignsSection object)
  {
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
	 * Returns the result of interpreting the object as an instance of '<em>Prior Aid Vitals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior Aid Vitals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorAidVitals(PriorAidVitals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Vital Signs Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalVitalSignsOrganizer(AdditionalVitalSignsOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeScore(StrokeScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pain Score</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pain Score</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePainScore(PainScore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Of Responsiveness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Of Responsiveness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelOfResponsiveness(LevelOfResponsiveness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blood Glucose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blood Glucose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloodGlucose(BloodGlucose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carbon Monoxide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carbon Monoxide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarbonMonoxide(CarbonMonoxide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carbon Dioxide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carbon Dioxide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarbonDioxide(CarbonDioxide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardiac Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardiac Rhythm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardiacRhythm(CardiacRhythm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glasgow Coma Score Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glasgow Coma Score Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlasgowComaScoreOrganizer(GlasgowComaScoreOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glasgow Eye</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glasgow Eye</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlasgowEye(GlasgowEye object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glasgow Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glasgow Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlasgowMotor(GlasgowMotor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glasgow Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glasgow Qualifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlasgowQualifier(GlasgowQualifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glasgow Total</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glasgow Total</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlasgowTotal(GlasgowTotal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glasgow Verbal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glasgow Verbal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlasgowVerbal(GlasgowVerbal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Injury Incident Description Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Injury Incident Description Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSInjuryIncidentDescriptionSection(EMSInjuryIncidentDescriptionSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Injury Cause Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injury Cause Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjuryCauseCategory(InjuryCauseCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injury Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injury Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjuryMechanism(InjuryMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trauma Center Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trauma Center Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraumaCenterCriteria(TraumaCenterCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Injury Risk Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Injury Risk Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInjuryRiskFactor(InjuryRiskFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Impact Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Impact Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleImpactArea(VehicleImpactArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Location In Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Location In Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientLocationInVehicle(PatientLocationInVehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Occupant Safety Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Occupant Safety Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleOccupantSafetyEquipment(VehicleOccupantSafetyEquipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airbag Deployment Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airbag Deployment Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirbagDeploymentStatus(AirbagDeploymentStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Height Of Fall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Height Of Fall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeightOfFall(HeightOfFall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disaster Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disaster Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisasterType(DisasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMS Billing Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMS Billing Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMSBillingSection(EMSBillingSection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Not Administered Reason Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Not Administered Reason Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationNotAdministeredReasonObservation(MedicationNotAdministeredReasonObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Response Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Response Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationResponseObservation(MedicationResponseObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Complication Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Complication Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationComplicationObservation(MedicationComplicationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Prior Administration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Prior Administration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationPriorAdministrationObservation(MedicationPriorAdministrationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Body Weight</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientBodyWeight(PatientBodyWeight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Based Patient Body Weight Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Based Patient Body Weight Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthBasedPatientBodyWeightClass(LengthBasedPatientBodyWeightClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Face Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Face Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaceAssessment(FaceAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadAssessment(HeadAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neck Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neck Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeckAssessment(NeckAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chest And Lungs Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chest And Lungs Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChestAndLungsAssessment(ChestAndLungsAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heart Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heart Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartAssessment(HeartAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abdomen Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abdomen Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbdomenAssessment(AbdomenAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pelvic And Genitourinary Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pelvic And Genitourinary Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePelvicAndGenitourinaryAssessment(PelvicAndGenitourinaryAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back And Spine Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back And Spine Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackAndSpineAssessment(BackAndSpineAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extremities Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extremities Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtremitiesAssessment(ExtremitiesAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eye Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eye Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEyeAssessment(EyeAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mental Status Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mental Status Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMentalStatusAssessment(MentalStatusAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardiac Arrest With Timing</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardiac Arrest With Timing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCardiacArrestWithTiming(CardiacArrestWithTiming object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Cardiac Arrest Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardiac Arrest Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardiacArrestCause(CardiacArrestCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prior CPR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior CPR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorCPR(PriorCPR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prior AED Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior AED Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorAEDUse(PriorAEDUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrest Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrest Rhythm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrestRhythm(ArrestRhythm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Of Spontaneous Circulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Of Spontaneous Circulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnOfSpontaneousCirculation(ReturnOfSpontaneousCirculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination Rhythm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination Rhythm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestinationRhythm(DestinationRhythm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abandoned Procedure Reason Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abandoned Procedure Reason Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbandonedProcedureReasonObservation(AbandonedProcedureReasonObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Prior Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Prior Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePriorIndicator(ProcedurePriorIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Number Of Attempts Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Number Of Attempts Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureNumberOfAttemptsObservation(ProcedureNumberOfAttemptsObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Successful Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Successful Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureSuccessfulObservation(ProcedureSuccessfulObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Complications Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Complications Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureComplicationsObservation(ProcedureComplicationsObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Patient Response Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Patient Response Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePatientResponseObservation(ProcedurePatientResponseObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Airway Confirmation Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Airway Confirmation Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAirwayConfirmationObservation(AirwayConfirmationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason Procedure Not Attempted Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason Procedure Not Attempted Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonProcedureNotAttemptedObservation(ReasonProcedureNotAttemptedObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaintType(ComplaintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaintDuration(ComplaintDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint Organ System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint Organ System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaintOrganSystem(ComplaintOrganSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neurological Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neurological Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeurologicalAssessment(NeurologicalAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systolic Blood Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systolic Blood Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystolicBloodPressure(SystolicBloodPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diastolic Blood Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diastolic Blood Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiastolicBloodPressure(DiastolicBloodPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heart Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heart Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeartRate(HeartRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respiratory Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respiratory Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespiratoryRate(RespiratoryRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Temperature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyTemperature(BodyTemperature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oxygen Saturation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oxygen Saturation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOxygenSaturation(OxygenSaturation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Age Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Age Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolAgeCategory(ProtocolAgeCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Location Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Location Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchLocationName(DispatchLocationName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Location Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Location Latitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchLocationLatitude(DispatchLocationLatitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Location Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Location Longitude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchLocationLongitude(DispatchLocationLongitude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dispatch Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dispatch Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispatchDelay(DispatchDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDelay(ResponseDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSceneDelay(SceneDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportDelay(TransportDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turnaround Delay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turnaround Delay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnaroundDelay(TurnaroundDelay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Beginning Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Beginning Odometer Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseBeginningOdometerReading(ResponseBeginningOdometerReading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response On Scene Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response On Scene Odometer Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseOnSceneOdometerReading(ResponseOnSceneOdometerReading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Destination Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Destination Odometer Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDestinationOdometerReading(ResponseDestinationOdometerReading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Ending Odometer Reading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Ending Odometer Reading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseEndingOdometerReading(ResponseEndingOdometerReading object) {
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
	public T caseConsol_VitalSignsOrganizer(org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer object) {
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

} // EmspcrSwitch
