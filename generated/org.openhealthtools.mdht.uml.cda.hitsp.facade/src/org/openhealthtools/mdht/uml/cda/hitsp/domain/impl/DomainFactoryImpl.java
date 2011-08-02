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
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainFactory;
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
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements IDomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IDomainFactory init() {
		try {
			IDomainFactory theDomainFactory = (IDomainFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp/domain");
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IDomainPackage.ALLERGY_DRUG_SENSITIVITY:
				return (EObject) createAllergyDrugSensitivity();
			case IDomainPackage.MEDICATION:
				return (EObject) createMedication();
			case IDomainPackage.MEDICATION_TYPE:
				return (EObject) createMedicationType();
			case IDomainPackage.MEDICATION_ORDER_INFORMATION:
				return (EObject) createMedicationOrderInformation();
			case IDomainPackage.CONDITION:
				return (EObject) createCondition();
			case IDomainPackage.PROBLEM_ENTRY:
				return (EObject) createProblemEntry();
			case IDomainPackage.PATIENT_SUMMARY:
				return (EObject) createPatientSummary();
			case IDomainPackage.ADVANCE_DIRECTIVES_SECTION:
				return (EObject) createAdvanceDirectivesSection();
			case IDomainPackage.ALLERGIES_REACTIONS_SECTION:
				return (EObject) createAllergiesReactionsSection();
			case IDomainPackage.COMMENT:
				return (EObject) createComment();
			case IDomainPackage.PROBLEM_LIST_SECTION:
				return (EObject) createProblemListSection();
			case IDomainPackage.ENCOUNTERS_SECTION:
				return (EObject) createEncountersSection();
			case IDomainPackage.ENCOUNTER:
				return (EObject) createEncounter();
			case IDomainPackage.IMMUNIZATIONS_SECTION:
				return (EObject) createImmunizationsSection();
			case IDomainPackage.IMMUNIZATION:
				return (EObject) createImmunization();
			case IDomainPackage.PAYERS_SECTION:
				return (EObject) createPayersSection();
			case IDomainPackage.MEDICATIONS_SECTION:
				return (EObject) createMedicationsSection();
			case IDomainPackage.PLAN_OF_CARE_SECTION:
				return (EObject) createPlanOfCareSection();
			case IDomainPackage.SURGERIES_SECTION:
				return (EObject) createSurgeriesSection();
			case IDomainPackage.PROCEDURE:
				return (EObject) createProcedure();
			case IDomainPackage.SUPPORT:
				return (EObject) createSupport();
			case IDomainPackage.VITAL_SIGNS_SECTION:
				return (EObject) createVitalSignsSection();
			case IDomainPackage.DIAGNOSTIC_RESULTS_SECTION:
				return (EObject) createDiagnosticResultsSection();
			case IDomainPackage.RESULT:
				return (EObject) createResult();
			case IDomainPackage.VITAL_SIGN:
				return (EObject) createVitalSign();
			case IDomainPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return (EObject) createHistoryOfPastIllnessSection();
			case IDomainPackage.CHIEF_COMPLAINT_SECTION:
				return (EObject) createChiefComplaintSection();
			case IDomainPackage.REASON_FOR_REFERRAL_SECTION:
				return (EObject) createReasonForReferralSection();
			case IDomainPackage.HISTORY_OF_PRESENT_ILLNESS:
				return (EObject) createHistoryOfPresentIllness();
			case IDomainPackage.FUNCTIONAL_STATUS_SECTION:
				return (EObject) createFunctionalStatusSection();
			case IDomainPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return (EObject) createHospitalAdmissionDiagnosisSection();
			case IDomainPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return (EObject) createDischargeDiagnosisSection();
			case IDomainPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return (EObject) createAdmissionMedicationHistorySection();
			case IDomainPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return (EObject) createHospitalDischargeMedicationsSection();
			case IDomainPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return (EObject) createMedicationsAdministeredSection();
			case IDomainPackage.PHYSICAL_EXAM_SECTION:
				return (EObject) createPhysicalExamSection();
			case IDomainPackage.REVIEW_OF_SYSTEMS_SECTION:
				return (EObject) createReviewOfSystemsSection();
			case IDomainPackage.HOSPITAL_COURSE_SECTION:
				return (EObject) createHospitalCourseSection();
			case IDomainPackage.ASSESSMENT_AND_PLAN_SECTION:
				return (EObject) createAssessmentAndPlanSection();
			case IDomainPackage.FAMILY_HISTORY_SECTION:
				return (EObject) createFamilyHistorySection();
			case IDomainPackage.SOCIAL_HISTORY_SECTION:
				return (EObject) createSocialHistorySection();
			case IDomainPackage.MEDICAL_EQUIPMENT_SECTION:
				return (EObject) createMedicalEquipmentSection();
			case IDomainPackage.LANGUAGE_SPOKEN:
				return (EObject) createLanguageSpoken();
			case IDomainPackage.INSURANCE_PROVIDER:
				return (EObject) createInsuranceProvider();
			case IDomainPackage.HEALTHCARE_PROVIDER:
				return (EObject) createHealthcareProvider();
			case IDomainPackage.MEDICATION_NORMAL_DOSE:
				return (EObject) createMedicationNormalDose();
			case IDomainPackage.MEDICATION_SPLIT_DOSE:
				return (EObject) createMedicationSplitDose();
			case IDomainPackage.MEDICATION_TAPERED_DOSE:
				return (EObject) createMedicationTaperedDose();
			case IDomainPackage.MEDICATION_CONDITIONAL_DOSE:
				return (EObject) createMedicationConditionalDose();
			case IDomainPackage.MEDICATION_COMBINATION_MEDICATION:
				return (EObject) createMedicationCombinationMedication();
			case IDomainPackage.SUPPORT_GUARDIAN:
				return (EObject) createSupportGuardian();
			case IDomainPackage.SUPPORT_PARTICIPANT:
				return (EObject) createSupportParticipant();
			case IDomainPackage.UNSTRUCTURED_DOCUMENT:
				return (EObject) createUnstructuredDocument();
			case IDomainPackage.MEDICATION_INFORMATION:
				return (EObject) createMedicationInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergyDrugSensitivity createAllergyDrugSensitivity() {
		AllergyDrugSensitivityImpl allergyDrugSensitivity = new AllergyDrugSensitivityImpl();
		return allergyDrugSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationType createMedicationType() {
		MedicationTypeImpl medicationType = new MedicationTypeImpl();
		return medicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationOrderInformation createMedicationOrderInformation() {
		MedicationOrderInformationImpl medicationOrderInformation = new MedicationOrderInformationImpl();
		return medicationOrderInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemEntry createProblemEntry() {
		ProblemEntryImpl problemEntry = new ProblemEntryImpl();
		return problemEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientSummary createPatientSummary() {
		PatientSummaryImpl patientSummary = new PatientSummaryImpl();
		return patientSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectivesSection createAdvanceDirectivesSection() {
		AdvanceDirectivesSectionImpl advanceDirectivesSection = new AdvanceDirectivesSectionImpl();
		return advanceDirectivesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection createAllergiesReactionsSection() {
		AllergiesReactionsSectionImpl allergiesReactionsSection = new AllergiesReactionsSectionImpl();
		return allergiesReactionsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IComment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection createProblemListSection() {
		ProblemListSectionImpl problemListSection = new ProblemListSectionImpl();
		return problemListSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncountersSection createEncountersSection() {
		EncountersSectionImpl encountersSection = new EncountersSectionImpl();
		return encountersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEncounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection createImmunizationsSection() {
		ImmunizationsSectionImpl immunizationsSection = new ImmunizationsSectionImpl();
		return immunizationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization createImmunization() {
		ImmunizationImpl immunization = new ImmunizationImpl();
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayersSection createPayersSection() {
		PayersSectionImpl payersSection = new PayersSectionImpl();
		return payersSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationsSection createMedicationsSection() {
		MedicationsSectionImpl medicationsSection = new MedicationsSectionImpl();
		return medicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection createPlanOfCareSection() {
		PlanOfCareSectionImpl planOfCareSection = new PlanOfCareSectionImpl();
		return planOfCareSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection createSurgeriesSection() {
		SurgeriesSectionImpl surgeriesSection = new SurgeriesSectionImpl();
		return surgeriesSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProcedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupport createSupport() {
		SupportImpl support = new SupportImpl();
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection createVitalSignsSection() {
		VitalSignsSectionImpl vitalSignsSection = new VitalSignsSectionImpl();
		return vitalSignsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagnosticResultsSection createDiagnosticResultsSection() {
		DiagnosticResultsSectionImpl diagnosticResultsSection = new DiagnosticResultsSectionImpl();
		return diagnosticResultsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResult createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSign createVitalSign() {
		VitalSignImpl vitalSign = new VitalSignImpl();
		return vitalSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPastIllnessSection createHistoryOfPastIllnessSection() {
		HistoryOfPastIllnessSectionImpl historyOfPastIllnessSection = new HistoryOfPastIllnessSectionImpl();
		return historyOfPastIllnessSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChiefComplaintSection createChiefComplaintSection() {
		ChiefComplaintSectionImpl chiefComplaintSection = new ChiefComplaintSectionImpl();
		return chiefComplaintSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReasonForReferralSection createReasonForReferralSection() {
		ReasonForReferralSectionImpl reasonForReferralSection = new ReasonForReferralSectionImpl();
		return reasonForReferralSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPresentIllness createHistoryOfPresentIllness() {
		HistoryOfPresentIllnessImpl historyOfPresentIllness = new HistoryOfPresentIllnessImpl();
		return historyOfPresentIllness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunctionalStatusSection createFunctionalStatusSection() {
		FunctionalStatusSectionImpl functionalStatusSection = new FunctionalStatusSectionImpl();
		return functionalStatusSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection() {
		HospitalAdmissionDiagnosisSectionImpl hospitalAdmissionDiagnosisSection = new HospitalAdmissionDiagnosisSectionImpl();
		return hospitalAdmissionDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection createDischargeDiagnosisSection() {
		DischargeDiagnosisSectionImpl dischargeDiagnosisSection = new DischargeDiagnosisSectionImpl();
		return dischargeDiagnosisSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdmissionMedicationHistorySection createAdmissionMedicationHistorySection() {
		AdmissionMedicationHistorySectionImpl admissionMedicationHistorySection = new AdmissionMedicationHistorySectionImpl();
		return admissionMedicationHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection() {
		HospitalDischargeMedicationsSectionImpl hospitalDischargeMedicationsSection = new HospitalDischargeMedicationsSectionImpl();
		return hospitalDischargeMedicationsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationsAdministeredSection createMedicationsAdministeredSection() {
		MedicationsAdministeredSectionImpl medicationsAdministeredSection = new MedicationsAdministeredSectionImpl();
		return medicationsAdministeredSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection createPhysicalExamSection() {
		PhysicalExamSectionImpl physicalExamSection = new PhysicalExamSectionImpl();
		return physicalExamSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewOfSystemsSection createReviewOfSystemsSection() {
		ReviewOfSystemsSectionImpl reviewOfSystemsSection = new ReviewOfSystemsSectionImpl();
		return reviewOfSystemsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalCourseSection createHospitalCourseSection() {
		HospitalCourseSectionImpl hospitalCourseSection = new HospitalCourseSectionImpl();
		return hospitalCourseSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAssessmentAndPlanSection createAssessmentAndPlanSection() {
		AssessmentAndPlanSectionImpl assessmentAndPlanSection = new AssessmentAndPlanSectionImpl();
		return assessmentAndPlanSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistorySection createFamilyHistorySection() {
		FamilyHistorySectionImpl familyHistorySection = new FamilyHistorySectionImpl();
		return familyHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistorySection createSocialHistorySection() {
		SocialHistorySectionImpl socialHistorySection = new SocialHistorySectionImpl();
		return socialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicalEquipmentSection createMedicalEquipmentSection() {
		MedicalEquipmentSectionImpl medicalEquipmentSection = new MedicalEquipmentSectionImpl();
		return medicalEquipmentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILanguageSpoken createLanguageSpoken() {
		LanguageSpokenImpl languageSpoken = new LanguageSpokenImpl();
		return languageSpoken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IInsuranceProvider createInsuranceProvider() {
		InsuranceProviderImpl insuranceProvider = new InsuranceProviderImpl();
		return insuranceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHealthcareProvider createHealthcareProvider() {
		HealthcareProviderImpl healthcareProvider = new HealthcareProviderImpl();
		return healthcareProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationNormalDose createMedicationNormalDose() {
		MedicationNormalDoseImpl medicationNormalDose = new MedicationNormalDoseImpl();
		return medicationNormalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationSplitDose createMedicationSplitDose() {
		MedicationSplitDoseImpl medicationSplitDose = new MedicationSplitDoseImpl();
		return medicationSplitDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationTaperedDose createMedicationTaperedDose() {
		MedicationTaperedDoseImpl medicationTaperedDose = new MedicationTaperedDoseImpl();
		return medicationTaperedDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationConditionalDose createMedicationConditionalDose() {
		MedicationConditionalDoseImpl medicationConditionalDose = new MedicationConditionalDoseImpl();
		return medicationConditionalDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationCombinationMedication createMedicationCombinationMedication() {
		MedicationCombinationMedicationImpl medicationCombinationMedication = new MedicationCombinationMedicationImpl();
		return medicationCombinationMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupportGuardian createSupportGuardian() {
		SupportGuardianImpl supportGuardian = new SupportGuardianImpl();
		return supportGuardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISupportParticipant createSupportParticipant() {
		SupportParticipantImpl supportParticipant = new SupportParticipantImpl();
		return supportParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IUnstructuredDocument createUnstructuredDocument() {
		UnstructuredDocumentImpl unstructuredDocument = new UnstructuredDocumentImpl();
		return unstructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationInformation createMedicationInformation() {
		MedicationInformationImpl medicationInformation = new MedicationInformationImpl();
		return medicationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDomainPackage getDomainPackage() {
		return (IDomainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IDomainPackage getPackage() {
		return IDomainPackage.eINSTANCE;
	}

} // DomainFactoryImpl
