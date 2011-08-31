/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IComment;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedication;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntryReactionObservationContainer;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IResult;
import org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistoryStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage
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
	protected DomainSwitch<Adapter> modelSwitch = new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseDischargeSummary(IDischargeSummary object) {
				return createDischargeSummaryAdapter();
			}
			@Override
			public Adapter caseAllergiesReactionsSection(IAllergiesReactionsSection object) {
				return createAllergiesReactionsSectionAdapter();
			}
			@Override
			public Adapter caseAllergyDrugSensitivity(IAllergyDrugSensitivity object) {
				return createAllergyDrugSensitivityAdapter();
			}
			@Override
			public Adapter caseEpisodeObservation(IEpisodeObservation object) {
				return createEpisodeObservationAdapter();
			}
			@Override
			public Adapter caseAllergyIntolerance(IAllergyIntolerance object) {
				return createAllergyIntoleranceAdapter();
			}
			@Override
			public Adapter caseProblemEntry(IProblemEntry object) {
				return createProblemEntryAdapter();
			}
			@Override
			public Adapter caseAgeObservation(IAgeObservation object) {
				return createAgeObservationAdapter();
			}
			@Override
			public Adapter caseSeverity(ISeverity object) {
				return createSeverityAdapter();
			}
			@Override
			public Adapter caseProblemStatusObservation(IProblemStatusObservation object) {
				return createProblemStatusObservationAdapter();
			}
			@Override
			public Adapter caseStatusObservation(IStatusObservation object) {
				return createStatusObservationAdapter();
			}
			@Override
			public Adapter caseHealthStatusObservation(IHealthStatusObservation object) {
				return createHealthStatusObservationAdapter();
			}
			@Override
			public Adapter caseComment(IComment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseCauseOfDeathObservation(ICauseOfDeathObservation object) {
				return createCauseOfDeathObservationAdapter();
			}
			@Override
			public Adapter caseFamilyHistoryObservation(IFamilyHistoryObservation object) {
				return createFamilyHistoryObservationAdapter();
			}
			@Override
			public Adapter caseSimpleObservation(ISimpleObservation object) {
				return createSimpleObservationAdapter();
			}
			@Override
			public Adapter caseProblemEntryReactionObservationContainer(IProblemEntryReactionObservationContainer object) {
				return createProblemEntryReactionObservationContainerAdapter();
			}
			@Override
			public Adapter caseProblemListSection(IProblemListSection object) {
				return createProblemListSectionAdapter();
			}
			@Override
			public Adapter caseCondition(ICondition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseHospitalCourseSection(IHospitalCourseSection object) {
				return createHospitalCourseSectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeMedicationsSection(IHospitalDischargeMedicationsSection object) {
				return createHospitalDischargeMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseMedication(IMedication object) {
				return createMedicationAdapter();
			}
			@Override
			public Adapter caseMedicationSeriesNumberObservation(IMedicationSeriesNumberObservation object) {
				return createMedicationSeriesNumberObservationAdapter();
			}
			@Override
			public Adapter caseMedicationStatusObservation(IMedicationStatusObservation object) {
				return createMedicationStatusObservationAdapter();
			}
			@Override
			public Adapter caseReactionObservation(IReactionObservation object) {
				return createReactionObservationAdapter();
			}
			@Override
			public Adapter caseSeverityObservation(ISeverityObservation object) {
				return createSeverityObservationAdapter();
			}
			@Override
			public Adapter caseProductInstance(IProductInstance object) {
				return createProductInstanceAdapter();
			}
			@Override
			public Adapter caseInternalReference(IInternalReference object) {
				return createInternalReferenceAdapter();
			}
			@Override
			public Adapter casePatientMedicalInstructions(IPatientMedicalInstructions object) {
				return createPatientMedicalInstructionsAdapter();
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
			public Adapter caseMedicationFullfillmentInstructions(IMedicationFullfillmentInstructions object) {
				return createMedicationFullfillmentInstructionsAdapter();
			}
			@Override
			public Adapter caseDischargeDiagnosisSection(IDischargeDiagnosisSection object) {
				return createDischargeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter casePlanOfCareSection(IPlanOfCareSection object) {
				return createPlanOfCareSectionAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityAct(IPlanOfCareActivityAct object) {
				return createPlanOfCareActivityActAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivity(IPlanOfCareActivity object) {
				return createPlanOfCareActivityAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityEncounter(IPlanOfCareActivityEncounter object) {
				return createPlanOfCareActivityEncounterAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityObservation(IPlanOfCareActivityObservation object) {
				return createPlanOfCareActivityObservationAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivityProcedure(IPlanOfCareActivityProcedure object) {
				return createPlanOfCareActivityProcedureAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivitySubstanceAdministration(IPlanOfCareActivitySubstanceAdministration object) {
				return createPlanOfCareActivitySubstanceAdministrationAdapter();
			}
			@Override
			public Adapter casePlanOfCareActivitySupply(IPlanOfCareActivitySupply object) {
				return createPlanOfCareActivitySupplyAdapter();
			}
			@Override
			public Adapter caseImmunization(IImmunization object) {
				return createImmunizationAdapter();
			}
			@Override
			public Adapter casePatientInstruction(IPatientInstruction object) {
				return createPatientInstructionAdapter();
			}
			@Override
			public Adapter caseEncounter(IEncounter object) {
				return createEncounterAdapter();
			}
			@Override
			public Adapter caseProcedure(IProcedure object) {
				return createProcedureAdapter();
			}
			@Override
			public Adapter caseSurgeriesSection(ISurgeriesSection object) {
				return createSurgeriesSectionAdapter();
			}
			@Override
			public Adapter caseExternalReference(IExternalReference object) {
				return createExternalReferenceAdapter();
			}
			@Override
			public Adapter caseProcedureEntryProcedureActivityProcedure(IProcedureEntryProcedureActivityProcedure object) {
				return createProcedureEntryProcedureActivityProcedureAdapter();
			}
			@Override
			public Adapter caseProcedureEntry(IProcedureEntry object) {
				return createProcedureEntryAdapter();
			}
			@Override
			public Adapter caseEncounterLocation(IEncounterLocation object) {
				return createEncounterLocationAdapter();
			}
			@Override
			public Adapter caseMedicationActivity(IMedicationActivity object) {
				return createMedicationActivityAdapter();
			}
			@Override
			public Adapter caseChiefComplaintSection(IChiefComplaintSection object) {
				return createChiefComplaintSectionAdapter();
			}
			@Override
			public Adapter caseDischargeDiet(IDischargeDiet object) {
				return createDischargeDietAdapter();
			}
			@Override
			public Adapter caseFamilyHistorySection(IFamilyHistorySection object) {
				return createFamilyHistorySectionAdapter();
			}
			@Override
			public Adapter caseFamilyHistory(IFamilyHistory object) {
				return createFamilyHistoryAdapter();
			}
			@Override
			public Adapter caseFunctionalStatusSection(IFunctionalStatusSection object) {
				return createFunctionalStatusSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPresentIllness(IHistoryOfPresentIllness object) {
				return createHistoryOfPresentIllnessAdapter();
			}
			@Override
			public Adapter caseHospitalDischargePhysical(IHospitalDischargePhysical object) {
				return createHospitalDischargePhysicalAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeStudiesSummarySection(IHospitalDischargeStudiesSummarySection object) {
				return createHospitalDischargeStudiesSummarySectionAdapter();
			}
			@Override
			public Adapter caseImmunizationsSection(IImmunizationsSection object) {
				return createImmunizationsSectionAdapter();
			}
			@Override
			public Adapter caseSupplyActivity(ISupplyActivity object) {
				return createSupplyActivityAdapter();
			}
			@Override
			public Adapter caseFulfillmentInstruction(IFulfillmentInstruction object) {
				return createFulfillmentInstructionAdapter();
			}
			@Override
			public Adapter caseReviewOfSystemsSection(IReviewOfSystemsSection object) {
				return createReviewOfSystemsSectionAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(ISocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseSocialHistory(ISocialHistory object) {
				return createSocialHistoryAdapter();
			}
			@Override
			public Adapter caseSocialHistoryStatusObservation(ISocialHistoryStatusObservation object) {
				return createSocialHistoryStatusObservationAdapter();
			}
			@Override
			public Adapter caseVitalSignsSection(IVitalSignsSection object) {
				return createVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseVitalSignsOrganizer(IVitalSignsOrganizer object) {
				return createVitalSignsOrganizerAdapter();
			}
			@Override
			public Adapter caseVitalSignObservation(IVitalSignObservation object) {
				return createVitalSignObservationAdapter();
			}
			@Override
			public Adapter caseDischargeInstructions(IDischargeInstructions object) {
				return createDischargeInstructionsAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection(IAdvanceDirectivesSection object) {
				return createAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseAdvanceDirective(IAdvanceDirective object) {
				return createAdvanceDirectiveAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveVerification(IAdvanceDirectiveVerification object) {
				return createAdvanceDirectiveVerificationAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveStatusObservation(IAdvanceDirectiveStatusObservation object) {
				return createAdvanceDirectiveStatusObservationAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectiveReference(IAdvanceDirectiveReference object) {
				return createAdvanceDirectiveReferenceAdapter();
			}
			@Override
			public Adapter caseMedicalEquipmentSection(IMedicalEquipmentSection object) {
				return createMedicalEquipmentSectionAdapter();
			}
			@Override
			public Adapter caseConsultationSummary(IConsultationSummary object) {
				return createConsultationSummaryAdapter();
			}
			@Override
			public Adapter caseMedicationsSection(IMedicationsSection object) {
				return createMedicationsSectionAdapter();
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
			public Adapter caseResultOrganizer(IResultOrganizer object) {
				return createResultOrganizerAdapter();
			}
			@Override
			public Adapter caseEncountersSection(IEncountersSection object) {
				return createEncountersSectionAdapter();
			}
			@Override
			public Adapter caseEncountersActivity(IEncountersActivity object) {
				return createEncountersActivityAdapter();
			}
			@Override
			public Adapter casePayersSection(IPayersSection object) {
				return createPayersSectionAdapter();
			}
			@Override
			public Adapter caseCoverageEntry(ICoverageEntry object) {
				return createCoverageEntryAdapter();
			}
			@Override
			public Adapter casePolicyActivity(IPolicyActivity object) {
				return createPolicyActivityAdapter();
			}
			@Override
			public Adapter casePayerEntity(IPayerEntity object) {
				return createPayerEntityAdapter();
			}
			@Override
			public Adapter caseCoveredParty(ICoveredParty object) {
				return createCoveredPartyAdapter();
			}
			@Override
			public Adapter casePolicySubscriber(IPolicySubscriber object) {
				return createPolicySubscriberAdapter();
			}
			@Override
			public Adapter caseConsultationRequest(IConsultationRequest object) {
				return createConsultationRequestAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection(IAssessmentAndPlanSection object) {
				return createAssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter casePhysicalExamSection(IPhysicalExamSection object) {
				return createPhysicalExamSectionAdapter();
			}
			@Override
			public Adapter caseReasonForReferralSection(IReasonForReferralSection object) {
				return createReasonForReferralSectionAdapter();
			}
			@Override
			public Adapter caseGeneralStatusSection(IGeneralStatusSection object) {
				return createGeneralStatusSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPastIllnessSection(IHistoryOfPastIllnessSection object) {
				return createHistoryOfPastIllnessSectionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary
	 * @generated
	 */
	public Adapter createDischargeSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection
	 * @generated
	 */
	public Adapter createAllergiesReactionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyDrugSensitivity
	 * @generated
	 */
	public Adapter createAllergyDrugSensitivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation <em>Episode Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEpisodeObservation
	 * @generated
	 */
	public Adapter createEpisodeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyIntolerance <em>Allergy Intolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAllergyIntolerance
	 * @generated
	 */
	public Adapter createAllergyIntoleranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry <em>Problem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntry
	 * @generated
	 */
	public Adapter createProblemEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation <em>Age Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAgeObservation
	 * @generated
	 */
	public Adapter createAgeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISeverity
	 * @generated
	 */
	public Adapter createSeverityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemStatusObservation <em>Problem Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemStatusObservation
	 * @generated
	 */
	public Adapter createProblemStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation <em>Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IStatusObservation
	 * @generated
	 */
	public Adapter createStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation <em>Health Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHealthStatusObservation
	 * @generated
	 */
	public Adapter createHealthStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IComment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICauseOfDeathObservation <em>Cause Of Death Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICauseOfDeathObservation
	 * @generated
	 */
	public Adapter createCauseOfDeathObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistoryObservation <em>Family History Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistoryObservation
	 * @generated
	 */
	public Adapter createFamilyHistoryObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntryReactionObservationContainer <em>Problem Entry Reaction Observation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemEntryReactionObservationContainer
	 * @generated
	 */
	public Adapter createProblemEntryReactionObservationContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection
	 * @generated
	 */
	public Adapter createProblemListSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICondition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection
	 * @generated
	 */
	public Adapter createHospitalCourseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation <em>Medication Series Number Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation
	 * @generated
	 */
	public Adapter createMedicationSeriesNumberObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation <em>Medication Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation
	 * @generated
	 */
	public Adapter createMedicationStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation <em>Reaction Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation
	 * @generated
	 */
	public Adapter createReactionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation <em>Severity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISeverityObservation
	 * @generated
	 */
	public Adapter createSeverityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance
	 * @generated
	 */
	public Adapter createProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference <em>Internal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IInternalReference
	 * @generated
	 */
	public Adapter createInternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions <em>Patient Medical Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPatientMedicalInstructions
	 * @generated
	 */
	public Adapter createPatientMedicalInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType <em>Medication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationType
	 * @generated
	 */
	public Adapter createMedicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation <em>Medication Order Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationOrderInformation
	 * @generated
	 */
	public Adapter createMedicationOrderInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions <em>Medication Fullfillment Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions
	 * @generated
	 */
	public Adapter createMedicationFullfillmentInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityAct
	 * @generated
	 */
	public Adapter createPlanOfCareActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivity <em>Plan Of Care Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivity
	 * @generated
	 */
	public Adapter createPlanOfCareActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityEncounter
	 * @generated
	 */
	public Adapter createPlanOfCareActivityEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityObservation
	 * @generated
	 */
	public Adapter createPlanOfCareActivityObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivityProcedure
	 * @generated
	 */
	public Adapter createPlanOfCareActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply <em>Plan Of Care Activity Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareActivitySupply
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization <em>Immunization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization
	 * @generated
	 */
	public Adapter createImmunizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction <em>Patient Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction
	 * @generated
	 */
	public Adapter createPatientInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection
	 * @generated
	 */
	public Adapter createSurgeriesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IExternalReference
	 * @generated
	 */
	public Adapter createExternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntryProcedureActivityProcedure <em>Procedure Entry Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntryProcedureActivityProcedure
	 * @generated
	 */
	public Adapter createProcedureEntryProcedureActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry <em>Procedure Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IProcedureEntry
	 * @generated
	 */
	public Adapter createProcedureEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation <em>Encounter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncounterLocation
	 * @generated
	 */
	public Adapter createEncounterLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationActivity
	 * @generated
	 */
	public Adapter createMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet <em>Discharge Diet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet
	 * @generated
	 */
	public Adapter createDischargeDietAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory <em>Family History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistory
	 * @generated
	 */
	public Adapter createFamilyHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical <em>Hospital Discharge Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical
	 * @generated
	 */
	public Adapter createHospitalDischargePhysicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection <em>Hospital Discharge Studies Summary Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection
	 * @generated
	 */
	public Adapter createHospitalDischargeStudiesSummarySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity <em>Supply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISupplyActivity
	 * @generated
	 */
	public Adapter createSupplyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction <em>Fulfillment Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IFulfillmentInstruction
	 * @generated
	 */
	public Adapter createFulfillmentInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory <em>Social History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistory
	 * @generated
	 */
	public Adapter createSocialHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistoryStatusObservation <em>Social History Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistoryStatusObservation
	 * @generated
	 */
	public Adapter createSocialHistoryStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsOrganizer
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignObservation
	 * @generated
	 */
	public Adapter createVitalSignObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation <em>Simple Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ISimpleObservation
	 * @generated
	 */
	public Adapter createSimpleObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions <em>Discharge Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions
	 * @generated
	 */
	public Adapter createDischargeInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective <em>Advance Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirective
	 * @generated
	 */
	public Adapter createAdvanceDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification <em>Advance Directive Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveVerification
	 * @generated
	 */
	public Adapter createAdvanceDirectiveVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveStatusObservation <em>Advance Directive Status Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveStatusObservation
	 * @generated
	 */
	public Adapter createAdvanceDirectiveStatusObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference <em>Advance Directive Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectiveReference
	 * @generated
	 */
	public Adapter createAdvanceDirectiveReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection
	 * @generated
	 */
	public Adapter createMedicalEquipmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary <em>Consultation Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary
	 * @generated
	 */
	public Adapter createConsultationSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDiagnosticResultsSection
	 * @generated
	 */
	public Adapter createDiagnosticResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IResult
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IResultOrganizer
	 * @generated
	 */
	public Adapter createResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersSection
	 * @generated
	 */
	public Adapter createEncountersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity <em>Encounters Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IEncountersActivity
	 * @generated
	 */
	public Adapter createEncountersActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPayersSection
	 * @generated
	 */
	public Adapter createPayersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry <em>Coverage Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICoverageEntry
	 * @generated
	 */
	public Adapter createCoverageEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity <em>Policy Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPolicyActivity
	 * @generated
	 */
	public Adapter createPolicyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity <em>Payer Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntity
	 * @generated
	 */
	public Adapter createPayerEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty <em>Covered Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.ICoveredParty
	 * @generated
	 */
	public Adapter createCoveredPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber <em>Policy Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPolicySubscriber
	 * @generated
	 */
	public Adapter createPolicySubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest <em>Consultation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationRequest
	 * @generated
	 */
	public Adapter createConsultationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IPhysicalExamSection
	 * @generated
	 */
	public Adapter createPhysicalExamSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection <em>General Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IGeneralStatusSection
	 * @generated
	 */
	public Adapter createGeneralStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPastIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSectionAdapter() {
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

} // DomainAdapterFactory
