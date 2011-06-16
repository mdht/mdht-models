/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IDomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IDomainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseAllergyDrugSensitivity(IAllergyDrugSensitivity object) {
				return createAllergyDrugSensitivityAdapter();
			}
			@Override
			public Adapter caseMedication(IMedication object) {
				return createMedicationAdapter();
			}
			@Override
			public Adapter caseMedicationType(IMedicationType object) {
				return createMedicationTypeAdapter();
			}
			@Override
			public Adapter caseMedicationOrderInformation(IMedicationOrderInformation object) {
				return createMedicationOrderInformationAdapter();
			}
			@Override
			public Adapter caseCondition(ICondition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseProblemEntry(IProblemEntry object) {
				return createProblemEntryAdapter();
			}
			@Override
			public Adapter casePatientSummary(IPatientSummary object) {
				return createPatientSummaryAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection(IAdvanceDirectivesSection object) {
				return createAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseAllergiesReactionsSection(IAllergiesReactionsSection object) {
				return createAllergiesReactionsSectionAdapter();
			}
			@Override
			public Adapter caseComment(IComment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseProblemListSection(IProblemListSection object) {
				return createProblemListSectionAdapter();
			}
			@Override
			public Adapter caseEncountersSection(IEncountersSection object) {
				return createEncountersSectionAdapter();
			}
			@Override
			public Adapter caseEncounter(IEncounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseImmunizationsSection(IImmunizationsSection object) {
				return createImmunizationsSectionAdapter();
			}
			@Override
			public Adapter caseImmunization(IImmunization object) {
				return createImmunizationAdapter();
			}
			@Override
			public Adapter casePayersSection(IPayersSection object) {
				return createPayersSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsSection(IMedicationsSection object) {
				return createMedicationsSectionAdapter();
			}
			@Override
			public Adapter casePlanOfCareSection(IPlanOfCareSection object) {
				return createPlanOfCareSectionAdapter();
			}
			@Override
			public Adapter caseSurgeriesSection(ISurgeriesSection object) {
				return createSurgeriesSectionAdapter();
			}
			@Override
			public Adapter caseProcedure(IProcedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseSupport(ISupport object) {
				return createSupportAdapter();
			}
			@Override
			public Adapter caseVitalSignsSection(IVitalSignsSection object) {
				return createVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseDiagnosticResultsSection(IDiagnosticResultsSection object) {
				return createDiagnosticResultsSectionAdapter();
			}
			@Override
			public Adapter caseResult(IResult object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseVitalSign(IVitalSign object) {
				return createVitalSignAdapter();
			}
			@Override
			public Adapter caseHistoryOfPastIllnessSection(IHistoryOfPastIllnessSection object) {
				return createHistoryOfPastIllnessSectionAdapter();
			}
			@Override
			public Adapter caseChiefComplaintSection(IChiefComplaintSection object) {
				return createChiefComplaintSectionAdapter();
			}
			@Override
			public Adapter caseReasonForReferralSection(IReasonForReferralSection object) {
				return createReasonForReferralSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPresentIllness(IHistoryOfPresentIllness object) {
				return createHistoryOfPresentIllnessAdapter();
			}
			@Override
			public Adapter caseFunctionalStatusSection(IFunctionalStatusSection object) {
				return createFunctionalStatusSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionDiagnosisSection(IHospitalAdmissionDiagnosisSection object) {
				return createHospitalAdmissionDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseDischargeDiagnosisSection(IDischargeDiagnosisSection object) {
				return createDischargeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseAdmissionMedicationHistorySection(IAdmissionMedicationHistorySection object) {
				return createAdmissionMedicationHistorySectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeMedicationsSection(IHospitalDischargeMedicationsSection object) {
				return createHospitalDischargeMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsAdministeredSection(IMedicationsAdministeredSection object) {
				return createMedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter casePhysicalExamSection(IPhysicalExamSection object) {
				return createPhysicalExamSectionAdapter();
			}
			@Override
			public Adapter caseReviewOfSystemsSection(IReviewOfSystemsSection object) {
				return createReviewOfSystemsSectionAdapter();
			}
			@Override
			public Adapter caseHospitalCourseSection(IHospitalCourseSection object) {
				return createHospitalCourseSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection(IAssessmentAndPlanSection object) {
				return createAssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter caseFamilyHistorySection(IFamilyHistorySection object) {
				return createFamilyHistorySectionAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(ISocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseMedicalEquipmentSection(IMedicalEquipmentSection object) {
				return createMedicalEquipmentSectionAdapter();
			}
			@Override
			public Adapter caseLanguageSpoken(ILanguageSpoken object) {
				return createLanguageSpokenAdapter();
			}
			@Override
			public Adapter caseInsuranceProvider(IInsuranceProvider object) {
				return createInsuranceProviderAdapter();
			}
			@Override
			public Adapter caseHealthcareProvider(IHealthcareProvider object) {
				return createHealthcareProviderAdapter();
			}
			@Override
			public Adapter caseMedicationNormalDose(IMedicationNormalDose object) {
				return createMedicationNormalDoseAdapter();
			}
			@Override
			public Adapter caseMedicationSplitDose(IMedicationSplitDose object) {
				return createMedicationSplitDoseAdapter();
			}
			@Override
			public Adapter caseMedicationTaperedDose(IMedicationTaperedDose object) {
				return createMedicationTaperedDoseAdapter();
			}
			@Override
			public Adapter caseMedicationConditionalDose(IMedicationConditionalDose object) {
				return createMedicationConditionalDoseAdapter();
			}
			@Override
			public Adapter caseMedicationCombinationMedication(IMedicationCombinationMedication object) {
				return createMedicationCombinationMedicationAdapter();
			}
			@Override
			public Adapter caseSupportGuardian(ISupportGuardian object) {
				return createSupportGuardianAdapter();
			}
			@Override
			public Adapter caseSupportParticipant(ISupportParticipant object) {
				return createSupportParticipantAdapter();
			}
			@Override
			public Adapter caseUnstructuredDocument(IUnstructuredDocument object) {
				return createUnstructuredDocumentAdapter();
			}
			@Override
			public Adapter caseMedicationInformation(IMedicationInformation object) {
				return createMedicationInformationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergyDrugSensitivity
	 * @generated
	 */
	public Adapter createAllergyDrugSensitivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationType
	 * @generated
	 */
	public Adapter createMedicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation <em>Medication Order Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationOrderInformation
	 * @generated
	 */
	public Adapter createMedicationOrderInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry <em>Problem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemEntry
	 * @generated
	 */
	public Adapter createProblemEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary <em>Patient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPatientSummary
	 * @generated
	 */
	public Adapter createPatientSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAllergiesReactionsSection
	 * @generated
	 */
	public Adapter createAllergiesReactionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IComment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProblemListSection
	 * @generated
	 */
	public Adapter createProblemListSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncountersSection
	 * @generated
	 */
	public Adapter createEncountersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IEncounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IImmunization
	 * @generated
	 */
	public Adapter createImmunizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPayersSection
	 * @generated
	 */
	public Adapter createPayersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISurgeriesSection
	 * @generated
	 */
	public Adapter createSurgeriesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IProcedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupport
	 * @generated
	 */
	public Adapter createSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDiagnosticResultsSection
	 * @generated
	 */
	public Adapter createDiagnosticResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IResult
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSign
	 * @generated
	 */
	public Adapter createVitalSignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPastIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection <em>Admission Medication History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAdmissionMedicationHistorySection
	 * @generated
	 */
	public Adapter createAdmissionMedicationHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalDischargeMedicationsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection
	 * @generated
	 */
	public Adapter createPhysicalExamSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHospitalCourseSection
	 * @generated
	 */
	public Adapter createHospitalCourseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IAssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IFamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicalEquipmentSection
	 * @generated
	 */
	public Adapter createMedicalEquipmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken <em>Language Spoken</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ILanguageSpoken
	 * @generated
	 */
	public Adapter createLanguageSpokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider <em>Insurance Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IInsuranceProvider
	 * @generated
	 */
	public Adapter createInsuranceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider <em>Healthcare Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IHealthcareProvider
	 * @generated
	 */
	public Adapter createHealthcareProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationNormalDose <em>Medication Normal Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationNormalDose
	 * @generated
	 */
	public Adapter createMedicationNormalDoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSplitDose <em>Medication Split Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationSplitDose
	 * @generated
	 */
	public Adapter createMedicationSplitDoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationTaperedDose <em>Medication Tapered Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationTaperedDose
	 * @generated
	 */
	public Adapter createMedicationTaperedDoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationConditionalDose <em>Medication Conditional Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationConditionalDose
	 * @generated
	 */
	public Adapter createMedicationConditionalDoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationCombinationMedication <em>Medication Combination Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationCombinationMedication
	 * @generated
	 */
	public Adapter createMedicationCombinationMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian <em>Support Guardian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportGuardian
	 * @generated
	 */
	public Adapter createSupportGuardianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant <em>Support Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.ISupportParticipant
	 * @generated
	 */
	public Adapter createSupportParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument <em>Unstructured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IUnstructuredDocument
	 * @generated
	 */
	public Adapter createUnstructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation <em>Medication Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IMedicationInformation
	 * @generated
	 */
	public Adapter createMedicationInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DomainAdapterFactory
