/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.ClinicalStatement;
import org.eclipse.mdht.uml.cda.Encounter;
import org.eclipse.mdht.uml.cda.Observation;
import org.eclipse.mdht.uml.cda.Organizer;
import org.eclipse.mdht.uml.cda.Procedure;
import org.eclipse.mdht.uml.cda.Section;
import org.eclipse.mdht.uml.cda.SubstanceAdministration;
import org.eclipse.mdht.uml.hl7.rim.Act;
import org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose;
import org.openhealthtools.mdht.uml.cda.clondata.BodyHeight;
import org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea;
import org.openhealthtools.mdht.uml.cda.clondata.BodyWeight;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerConcernAct;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation;
import org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory;
import org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.CardiacFunctionObservation;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary;
import org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone;
import org.openhealthtools.mdht.uml.cda.clondata.FunctionalStatusSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason;
import org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod;
import org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive;
import org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined;
import org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareRadiationActivity;
import org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus;
import org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted;
import org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage
 * @generated
 */
public class CLONDATAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CLONDATAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CLONDATAPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLONDATASwitch<Adapter> modelSwitch = new CLONDATASwitch<Adapter>() {
		@Override
		public Adapter caseAnthracyclinesLifetimeDose(AnthracyclinesLifetimeDose object) {
			return createAnthracyclinesLifetimeDoseAdapter();
		}

		@Override
		public Adapter caseBreastTNMMetastasisCategory(BreastTNMMetastasisCategory object) {
			return createBreastTNMMetastasisCategoryAdapter();
		}

		@Override
		public Adapter caseBreastTNMClinicalCategory(BreastTNMClinicalCategory object) {
			return createBreastTNMClinicalCategoryAdapter();
		}

		@Override
		public Adapter caseBreastTNMNodeCategory(BreastTNMNodeCategory object) {
			return createBreastTNMNodeCategoryAdapter();
		}

		@Override
		public Adapter caseBreastTNMTumorCategory(BreastTNMTumorCategory object) {
			return createBreastTNMTumorCategoryAdapter();
		}

		@Override
		public Adapter caseChemotherapeuticDrugTherapyDiscontinued(ChemotherapeuticDrugTherapyDiscontinued object) {
			return createChemotherapeuticDrugTherapyDiscontinuedAdapter();
		}

		@Override
		public Adapter caseChemotherapyProtocolReference(ChemotherapyProtocolReference object) {
			return createChemotherapyProtocolReferenceAdapter();
		}

		@Override
		public Adapter caseClinicalDrugTrial(ClinicalDrugTrial object) {
			return createClinicalDrugTrialAdapter();
		}

		@Override
		public Adapter caseHospitalizationWithReason(HospitalizationWithReason object) {
			return createHospitalizationWithReasonAdapter();
		}

		@Override
		public Adapter caseFamilyHistoryofCancerNone(FamilyHistoryofCancerNone object) {
			return createFamilyHistoryofCancerNoneAdapter();
		}

		@Override
		public Adapter caseFamilyHistoryPedigree(FamilyHistoryPedigree object) {
			return createFamilyHistoryPedigreeAdapter();
		}

		@Override
		public Adapter caseLastMenstrualPeriod(LastMenstrualPeriod object) {
			return createLastMenstrualPeriodAdapter();
		}

		@Override
		public Adapter caseChemotherapyMedicationActivity(ChemotherapyMedicationActivity object) {
			return createChemotherapyMedicationActivityAdapter();
		}

		@Override
		public Adapter caseOncotypeDXScore(OncotypeDXScore object) {
			return createOncotypeDXScoreAdapter();
		}

		@Override
		public Adapter caseChemotherapyRegimenPlans(ChemotherapyRegimenPlans object) {
			return createChemotherapyRegimenPlansAdapter();
		}

		@Override
		public Adapter casePlanofCareActivityReconstructionProcedure(PlanofCareActivityReconstructionProcedure object) {
			return createPlanofCareActivityReconstructionProcedureAdapter();
		}

		@Override
		public Adapter caseChemotherapyMedicationActivityPlan(ChemotherapyMedicationActivityPlan object) {
			return createChemotherapyMedicationActivityPlanAdapter();
		}

		@Override
		public Adapter casePostTreatmentDiseaseStatus(PostTreatmentDiseaseStatus object) {
			return createPostTreatmentDiseaseStatusAdapter();
		}

		@Override
		public Adapter caseBreastCancerConcernAct(BreastCancerConcernAct object) {
			return createBreastCancerConcernActAdapter();
		}

		@Override
		public Adapter caseBreastCancerDiagnosisObservation(BreastCancerDiagnosisObservation object) {
			return createBreastCancerDiagnosisObservationAdapter();
		}

		@Override
		public Adapter caseNeurotoxicityImpairmentofADLs(NeurotoxicityImpairmentofADLs object) {
			return createNeurotoxicityImpairmentofADLsAdapter();
		}

		@Override
		public Adapter caseRadiationTherapyCareCompleted(RadiationTherapyCareCompleted object) {
			return createRadiationTherapyCareCompletedAdapter();
		}

		@Override
		public Adapter caseBreastCancerProcedures(BreastCancerProcedures object) {
			return createBreastCancerProceduresAdapter();
		}

		@Override
		public Adapter caseCardiacFunctionObservation(CardiacFunctionObservation object) {
			return createCardiacFunctionObservationAdapter();
		}

		@Override
		public Adapter caseEstrogenReceptorStatus(EstrogenReceptorStatus object) {
			return createEstrogenReceptorStatusAdapter();
		}

		@Override
		public Adapter caseHER2ReceptorStatus(HER2ReceptorStatus object) {
			return createHER2ReceptorStatusAdapter();
		}

		@Override
		public Adapter caseNumberofLymphNodesPositive(NumberofLymphNodesPositive object) {
			return createNumberofLymphNodesPositiveAdapter();
		}

		@Override
		public Adapter caseNumberofLymphNodesRemovedandExamined(NumberofLymphNodesRemovedandExamined object) {
			return createNumberofLymphNodesRemovedandExaminedAdapter();
		}

		@Override
		public Adapter caseProgesteroneReceptorStatus(ProgesteroneReceptorStatus object) {
			return createProgesteroneReceptorStatusAdapter();
		}

		@Override
		public Adapter caseLymphNodeSamplingResultOrganizer(LymphNodeSamplingResultOrganizer object) {
			return createLymphNodeSamplingResultOrganizerAdapter();
		}

		@Override
		public Adapter caseMolecularDiagnosticTestingOrganizer(MolecularDiagnosticTestingOrganizer object) {
			return createMolecularDiagnosticTestingOrganizerAdapter();
		}

		@Override
		public Adapter caseReceptorStatusOrganizer(ReceptorStatusOrganizer object) {
			return createReceptorStatusOrganizerAdapter();
		}

		@Override
		public Adapter caseBodyHeight(BodyHeight object) {
			return createBodyHeightAdapter();
		}

		@Override
		public Adapter caseBodySurfaceArea(BodySurfaceArea object) {
			return createBodySurfaceAreaAdapter();
		}

		@Override
		public Adapter caseBodyWeight(BodyWeight object) {
			return createBodyWeightAdapter();
		}

		@Override
		public Adapter caseEncountersSectionBCTPS(EncountersSectionBCTPS object) {
			return createEncountersSectionBCTPSAdapter();
		}

		@Override
		public Adapter caseFamilyHistorySectionBCTPS(FamilyHistorySectionBCTPS object) {
			return createFamilyHistorySectionBCTPSAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusSectionBCTPS(FunctionalStatusSectionBCTPS object) {
			return createFunctionalStatusSectionBCTPSAdapter();
		}

		@Override
		public Adapter caseMedicationsSectionBCTPS(MedicationsSectionBCTPS object) {
			return createMedicationsSectionBCTPSAdapter();
		}

		@Override
		public Adapter casePlanofCareSectionBCTPS(PlanofCareSectionBCTPS object) {
			return createPlanofCareSectionBCTPSAdapter();
		}

		@Override
		public Adapter casePlanofCareRadiationActivity(PlanofCareRadiationActivity object) {
			return createPlanofCareRadiationActivityAdapter();
		}

		@Override
		public Adapter caseProblemSectionBCTPS(ProblemSectionBCTPS object) {
			return createProblemSectionBCTPSAdapter();
		}

		@Override
		public Adapter caseProceduresSectionBCTPS(ProceduresSectionBCTPS object) {
			return createProceduresSectionBCTPSAdapter();
		}

		@Override
		public Adapter caseResultsSectionBCTPS(ResultsSectionBCTPS object) {
			return createResultsSectionBCTPSAdapter();
		}

		@Override
		public Adapter caseVitalSignsSectionBCTPS(VitalSignsSectionBCTPS object) {
			return createVitalSignsSectionBCTPSAdapter();
		}

		@Override
		public Adapter caseVitalSignsOrganizerBCTPS(VitalSignsOrganizerBCTPS object) {
			return createVitalSignsOrganizerBCTPSAdapter();
		}

		@Override
		public Adapter caseClinicalOncologyTreatmentPlanandSummary(ClinicalOncologyTreatmentPlanandSummary object) {
			return createClinicalOncologyTreatmentPlanandSummaryAdapter();
		}

		@Override
		public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
			return createInfrastructureRootAdapter();
		}

		@Override
		public Adapter caseAct(Act object) {
			return createActAdapter();
		}

		@Override
		public Adapter caseClinicalStatement(ClinicalStatement object) {
			return createClinicalStatementAdapter();
		}

		@Override
		public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
			return createSubstanceAdministrationAdapter();
		}

		@Override
		public Adapter caseObservation(Observation object) {
			return createObservationAdapter();
		}

		@Override
		public Adapter caseCDA_Act(org.eclipse.mdht.uml.cda.Act object) {
			return createCDA_ActAdapter();
		}

		@Override
		public Adapter caseEncounter(Encounter object) {
			return createEncounterAdapter();
		}

		@Override
		public Adapter caseMedicationActivity(MedicationActivity object) {
			return createMedicationActivityAdapter();
		}

		@Override
		public Adapter caseResultObservation(ResultObservation object) {
			return createResultObservationAdapter();
		}

		@Override
		public Adapter caseProcedure(Procedure object) {
			return createProcedureAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
			return createPlanOfCareActivityProcedureAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
			return createPlanOfCareActivitySubstanceAdministrationAdapter();
		}

		@Override
		public Adapter caseProblemConcernAct(ProblemConcernAct object) {
			return createProblemConcernActAdapter();
		}

		@Override
		public Adapter caseProblemObservation(ProblemObservation object) {
			return createProblemObservationAdapter();
		}

		@Override
		public Adapter caseProcedureActivityAct(ProcedureActivityAct object) {
			return createProcedureActivityActAdapter();
		}

		@Override
		public Adapter caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
			return createProcedureActivityProcedureAdapter();
		}

		@Override
		public Adapter caseOrganizer(Organizer object) {
			return createOrganizerAdapter();
		}

		@Override
		public Adapter caseResultOrganizer(ResultOrganizer object) {
			return createResultOrganizerAdapter();
		}

		@Override
		public Adapter caseVitalSignObservation(VitalSignObservation object) {
			return createVitalSignObservationAdapter();
		}

		@Override
		public Adapter caseSection(Section object) {
			return createSectionAdapter();
		}

		@Override
		public Adapter caseEncountersSectionEntriesOptional(EncountersSectionEntriesOptional object) {
			return createEncountersSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseFamilyHistorySection(FamilyHistorySection object) {
			return createFamilyHistorySectionAdapter();
		}

		@Override
		public Adapter caseFunctionalStatusSection(FunctionalStatusSection object) {
			return createFunctionalStatusSectionAdapter();
		}

		@Override
		public Adapter caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
			return createMedicationsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseMedicationsSection(MedicationsSection object) {
			return createMedicationsSectionAdapter();
		}

		@Override
		public Adapter casePlanOfCareSection(PlanOfCareSection object) {
			return createPlanOfCareSectionAdapter();
		}

		@Override
		public Adapter casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
			return createPlanOfCareActivityActAdapter();
		}

		@Override
		public Adapter caseProblemSectionEntriesOptional(ProblemSectionEntriesOptional object) {
			return createProblemSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseProceduresSectionEntriesOptional(ProceduresSectionEntriesOptional object) {
			return createProceduresSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseResultsSectionEntriesOptional(ResultsSectionEntriesOptional object) {
			return createResultsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseVitalSignsSectionEntriesOptional(VitalSignsSectionEntriesOptional object) {
			return createVitalSignsSectionEntriesOptionalAdapter();
		}

		@Override
		public Adapter caseVitalSignsOrganizer(VitalSignsOrganizer object) {
			return createVitalSignsOrganizerAdapter();
		}

		@Override
		public Adapter caseClinicalDocument(ClinicalDocument object) {
			return createClinicalDocumentAdapter();
		}

		@Override
		public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
			return createGeneralHeaderConstraintsAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose <em>Anthracyclines Lifetime Dose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.AnthracyclinesLifetimeDose
	 * @generated
	 */
	public Adapter createAnthracyclinesLifetimeDoseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory <em>Breast TNM Metastasis Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastTNMMetastasisCategory
	 * @generated
	 */
	public Adapter createBreastTNMMetastasisCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory <em>Breast TNM Clinical Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastTNMClinicalCategory
	 * @generated
	 */
	public Adapter createBreastTNMClinicalCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory <em>Breast TNM Node Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastTNMNodeCategory
	 * @generated
	 */
	public Adapter createBreastTNMNodeCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory <em>Breast TNM Tumor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastTNMTumorCategory
	 * @generated
	 */
	public Adapter createBreastTNMTumorCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued <em>Chemotherapeutic Drug Therapy Discontinued</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued
	 * @generated
	 */
	public Adapter createChemotherapeuticDrugTherapyDiscontinuedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference <em>Chemotherapy Protocol Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyProtocolReference
	 * @generated
	 */
	public Adapter createChemotherapyProtocolReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial <em>Clinical Drug Trial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial
	 * @generated
	 */
	public Adapter createClinicalDrugTrialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason <em>Hospitalization With Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason
	 * @generated
	 */
	public Adapter createHospitalizationWithReasonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone <em>Family Historyof Cancer None</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryofCancerNone
	 * @generated
	 */
	public Adapter createFamilyHistoryofCancerNoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree <em>Family History Pedigree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.FamilyHistoryPedigree
	 * @generated
	 */
	public Adapter createFamilyHistoryPedigreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod <em>Last Menstrual Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod
	 * @generated
	 */
	public Adapter createLastMenstrualPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity <em>Chemotherapy Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivity
	 * @generated
	 */
	public Adapter createChemotherapyMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore <em>Oncotype DX Score</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore
	 * @generated
	 */
	public Adapter createOncotypeDXScoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans <em>Chemotherapy Regimen Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyRegimenPlans
	 * @generated
	 */
	public Adapter createChemotherapyRegimenPlansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure <em>Planof Care Activity Reconstruction Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.PlanofCareActivityReconstructionProcedure
	 * @generated
	 */
	public Adapter createPlanofCareActivityReconstructionProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan <em>Chemotherapy Medication Activity Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ChemotherapyMedicationActivityPlan
	 * @generated
	 */
	public Adapter createChemotherapyMedicationActivityPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus <em>Post Treatment Disease Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.PostTreatmentDiseaseStatus
	 * @generated
	 */
	public Adapter createPostTreatmentDiseaseStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerConcernAct <em>Breast Cancer Concern Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastCancerConcernAct
	 * @generated
	 */
	public Adapter createBreastCancerConcernActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation <em>Breast Cancer Diagnosis Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastCancerDiagnosisObservation
	 * @generated
	 */
	public Adapter createBreastCancerDiagnosisObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs <em>Neurotoxicity Impairmentof AD Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs
	 * @generated
	 */
	public Adapter createNeurotoxicityImpairmentofADLsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted <em>Radiation Therapy Care Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.RadiationTherapyCareCompleted
	 * @generated
	 */
	public Adapter createRadiationTherapyCareCompletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures <em>Breast Cancer Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BreastCancerProcedures
	 * @generated
	 */
	public Adapter createBreastCancerProceduresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.CardiacFunctionObservation <em>Cardiac Function Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.CardiacFunctionObservation
	 * @generated
	 */
	public Adapter createCardiacFunctionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus <em>Estrogen Receptor Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus
	 * @generated
	 */
	public Adapter createEstrogenReceptorStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus <em>HER2 Receptor Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.HER2ReceptorStatus
	 * @generated
	 */
	public Adapter createHER2ReceptorStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive <em>Numberof Lymph Nodes Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesPositive
	 * @generated
	 */
	public Adapter createNumberofLymphNodesPositiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined <em>Numberof Lymph Nodes Removedand Examined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.NumberofLymphNodesRemovedandExamined
	 * @generated
	 */
	public Adapter createNumberofLymphNodesRemovedandExaminedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus <em>Progesterone Receptor Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus
	 * @generated
	 */
	public Adapter createProgesteroneReceptorStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer <em>Lymph Node Sampling Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.LymphNodeSamplingResultOrganizer
	 * @generated
	 */
	public Adapter createLymphNodeSamplingResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer <em>Molecular Diagnostic Testing Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.MolecularDiagnosticTestingOrganizer
	 * @generated
	 */
	public Adapter createMolecularDiagnosticTestingOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer <em>Receptor Status Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer
	 * @generated
	 */
	public Adapter createReceptorStatusOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BodyHeight <em>Body Height</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BodyHeight
	 * @generated
	 */
	public Adapter createBodyHeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea <em>Body Surface Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BodySurfaceArea
	 * @generated
	 */
	public Adapter createBodySurfaceAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.BodyWeight <em>Body Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.BodyWeight
	 * @generated
	 */
	public Adapter createBodyWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS <em>Encounters Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS
	 * @generated
	 */
	public Adapter createEncountersSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS <em>Family History Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.FamilyHistorySectionBCTPS
	 * @generated
	 */
	public Adapter createFamilyHistorySectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.FunctionalStatusSectionBCTPS <em>Functional Status Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.FunctionalStatusSectionBCTPS
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS <em>Medications Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.MedicationsSectionBCTPS
	 * @generated
	 */
	public Adapter createMedicationsSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS <em>Planof Care Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.PlanofCareSectionBCTPS
	 * @generated
	 */
	public Adapter createPlanofCareSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.PlanofCareRadiationActivity <em>Planof Care Radiation Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.PlanofCareRadiationActivity
	 * @generated
	 */
	public Adapter createPlanofCareRadiationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS <em>Problem Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ProblemSectionBCTPS
	 * @generated
	 */
	public Adapter createProblemSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS <em>Procedures Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ProceduresSectionBCTPS
	 * @generated
	 */
	public Adapter createProceduresSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS <em>Results Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS
	 * @generated
	 */
	public Adapter createResultsSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS <em>Vital Signs Section BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.VitalSignsSectionBCTPS
	 * @generated
	 */
	public Adapter createVitalSignsSectionBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS <em>Vital Signs Organizer BCTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.VitalSignsOrganizerBCTPS
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerBCTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary <em>Clinical Oncology Treatment Planand Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.clondata.ClinicalOncologyTreatmentPlanandSummary
	 * @generated
	 */
	public Adapter createClinicalOncologyTreatmentPlanandSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
	public Adapter createGeneralHeaderConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Encounter <em>Encounter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Encounter
	 * @generated
	 */
	public Adapter createEncounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
	 * @generated
	 */
	public Adapter createMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Procedure
	 * @generated
	 */
	public Adapter createProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure <em>Plan Of Care Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure
	 * @generated
	 */
	public Adapter createPlanOfCareActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration <em>Plan Of Care Activity Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration
	 * @generated
	 */
	public Adapter createPlanOfCareActivitySubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct <em>Problem Concern Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct
	 * @generated
	 */
	public Adapter createProblemConcernActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct <em>Procedure Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct
	 * @generated
	 */
	public Adapter createProcedureActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure <em>Procedure Activity Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure
	 * @generated
	 */
	public Adapter createProcedureActivityProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer
	 * @generated
	 */
	public Adapter createResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation
	 * @generated
	 */
	public Adapter createVitalSignObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional <em>Encounters Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional
	 * @generated
	 */
	public Adapter createEncountersSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional <em>Medications Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createMedicationsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct
	 * @generated
	 */
	public Adapter createPlanOfCareActivityActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional <em>Problem Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProblemSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional <em>Procedures Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional
	 * @generated
	 */
	public Adapter createProceduresSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional <em>Results Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createResultsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional <em>Vital Signs Section Entries Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional
	 * @generated
	 */
	public Adapter createVitalSignsSectionEntriesOptionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer <em>Vital Signs Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer
	 * @generated
	 */
	public Adapter createVitalSignsOrganizerAdapter() {
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

} // CLONDATAAdapterFactory
