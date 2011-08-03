/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupport;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredOrScannedDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection;

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
			case IDomainPackage.MEDICATION: {
				IMedication medication = (IMedication) theEObject;
				T result = caseMedication(medication);
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
			case IDomainPackage.CONDITION: {
				ICondition condition = (ICondition) theEObject;
				T result = caseCondition(condition);
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
			case IDomainPackage.PATIENT_SUMMARY: {
				IPatientSummary patientSummary = (IPatientSummary) theEObject;
				T result = casePatientSummary(patientSummary);
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
			case IDomainPackage.ALLERGIES_REACTIONS_SECTION: {
				IAllergiesReactionsSection allergiesReactionsSection = (IAllergiesReactionsSection) theEObject;
				T result = caseAllergiesReactionsSection(allergiesReactionsSection);
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
			case IDomainPackage.SURGERIES_SECTION: {
				ISurgeriesSection surgeriesSection = (ISurgeriesSection) theEObject;
				T result = caseSurgeriesSection(surgeriesSection);
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
			case IDomainPackage.DIAGNOSTIC_RESULTS_SECTION: {
				IDiagnosticResultsSection diagnosticResultsSection = (IDiagnosticResultsSection) theEObject;
				T result = caseDiagnosticResultsSection(diagnosticResultsSection);
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
			case IDomainPackage.FUNCTIONAL_STATUS_SECTION: {
				IFunctionalStatusSection functionalStatusSection = (IFunctionalStatusSection) theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
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
			case IDomainPackage.FAMILY_HISTORY_SECTION: {
				IFamilyHistorySection familyHistorySection = (IFamilyHistorySection) theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
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
			case IDomainPackage.MEDICAL_EQUIPMENT_SECTION: {
				IMedicalEquipmentSection medicalEquipmentSection = (IMedicalEquipmentSection) theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
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
			case IDomainPackage.INSURANCE_PROVIDER: {
				IInsuranceProvider insuranceProvider = (IInsuranceProvider) theEObject;
				T result = caseInsuranceProvider(insuranceProvider);
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
