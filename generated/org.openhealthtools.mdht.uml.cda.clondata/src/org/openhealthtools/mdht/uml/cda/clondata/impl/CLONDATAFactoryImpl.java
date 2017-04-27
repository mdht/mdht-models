/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CLONDATAFactoryImpl extends EFactoryImpl implements CLONDATAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLONDATAFactory init() {
		try {
			CLONDATAFactory theCLONDATAFactory = (CLONDATAFactory) EPackage.Registry.INSTANCE.getEFactory(
				CLONDATAPackage.eNS_URI);
			if (theCLONDATAFactory != null) {
				return theCLONDATAFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CLONDATAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATAFactoryImpl() {
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
			case CLONDATAPackage.ANTHRACYCLINES_LIFETIME_DOSE:
				return createAnthracyclinesLifetimeDose();
			case CLONDATAPackage.BREAST_TNM_METASTASIS_CATEGORY:
				return createBreastTNMMetastasisCategory();
			case CLONDATAPackage.BREAST_TNM_CLINICAL_CATEGORY:
				return createBreastTNMClinicalCategory();
			case CLONDATAPackage.BREAST_TNM_NODE_CATEGORY:
				return createBreastTNMNodeCategory();
			case CLONDATAPackage.BREAST_TNM_TUMOR_CATEGORY:
				return createBreastTNMTumorCategory();
			case CLONDATAPackage.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED:
				return createChemotherapeuticDrugTherapyDiscontinued();
			case CLONDATAPackage.CHEMOTHERAPY_PROTOCOL_REFERENCE:
				return createChemotherapyProtocolReference();
			case CLONDATAPackage.CLINICAL_DRUG_TRIAL:
				return createClinicalDrugTrial();
			case CLONDATAPackage.HOSPITALIZATION_WITH_REASON:
				return createHospitalizationWithReason();
			case CLONDATAPackage.FAMILY_HISTORYOF_CANCER_NONE:
				return createFamilyHistoryofCancerNone();
			case CLONDATAPackage.FAMILY_HISTORY_PEDIGREE:
				return createFamilyHistoryPedigree();
			case CLONDATAPackage.LAST_MENSTRUAL_PERIOD:
				return createLastMenstrualPeriod();
			case CLONDATAPackage.CHEMOTHERAPY_MEDICATION_ACTIVITY:
				return createChemotherapyMedicationActivity();
			case CLONDATAPackage.ONCOTYPE_DX_SCORE:
				return createOncotypeDXScore();
			case CLONDATAPackage.CHEMOTHERAPY_REGIMEN_PLANS:
				return createChemotherapyRegimenPlans();
			case CLONDATAPackage.PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE:
				return createPlanofCareActivityReconstructionProcedure();
			case CLONDATAPackage.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN:
				return createChemotherapyMedicationActivityPlan();
			case CLONDATAPackage.POST_TREATMENT_DISEASE_STATUS:
				return createPostTreatmentDiseaseStatus();
			case CLONDATAPackage.BREAST_CANCER_CONCERN_ACT:
				return createBreastCancerConcernAct();
			case CLONDATAPackage.BREAST_CANCER_DIAGNOSIS_OBSERVATION:
				return createBreastCancerDiagnosisObservation();
			case CLONDATAPackage.NEUROTOXICITY_IMPAIRMENTOF_AD_LS:
				return createNeurotoxicityImpairmentofADLs();
			case CLONDATAPackage.RADIATION_THERAPY_CARE_COMPLETED:
				return createRadiationTherapyCareCompleted();
			case CLONDATAPackage.BREAST_CANCER_PROCEDURES:
				return createBreastCancerProcedures();
			case CLONDATAPackage.CARDIAC_FUNCTION_OBSERVATION:
				return createCardiacFunctionObservation();
			case CLONDATAPackage.ESTROGEN_RECEPTOR_STATUS:
				return createEstrogenReceptorStatus();
			case CLONDATAPackage.HER2_RECEPTOR_STATUS:
				return createHER2ReceptorStatus();
			case CLONDATAPackage.NUMBEROF_LYMPH_NODES_POSITIVE:
				return createNumberofLymphNodesPositive();
			case CLONDATAPackage.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED:
				return createNumberofLymphNodesRemovedandExamined();
			case CLONDATAPackage.PROGESTERONE_RECEPTOR_STATUS:
				return createProgesteroneReceptorStatus();
			case CLONDATAPackage.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER:
				return createLymphNodeSamplingResultOrganizer();
			case CLONDATAPackage.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER:
				return createMolecularDiagnosticTestingOrganizer();
			case CLONDATAPackage.RECEPTOR_STATUS_ORGANIZER:
				return createReceptorStatusOrganizer();
			case CLONDATAPackage.BODY_HEIGHT:
				return createBodyHeight();
			case CLONDATAPackage.BODY_SURFACE_AREA:
				return createBodySurfaceArea();
			case CLONDATAPackage.BODY_WEIGHT:
				return createBodyWeight();
			case CLONDATAPackage.ENCOUNTERS_SECTION_BCTPS:
				return createEncountersSectionBCTPS();
			case CLONDATAPackage.FAMILY_HISTORY_SECTION_BCTPS:
				return createFamilyHistorySectionBCTPS();
			case CLONDATAPackage.FUNCTIONAL_STATUS_SECTION_BCTPS:
				return createFunctionalStatusSectionBCTPS();
			case CLONDATAPackage.MEDICATIONS_SECTION_BCTPS:
				return createMedicationsSectionBCTPS();
			case CLONDATAPackage.PLANOF_CARE_SECTION_BCTPS:
				return createPlanofCareSectionBCTPS();
			case CLONDATAPackage.PLANOF_CARE_RADIATION_ACTIVITY:
				return createPlanofCareRadiationActivity();
			case CLONDATAPackage.PROBLEM_SECTION_BCTPS:
				return createProblemSectionBCTPS();
			case CLONDATAPackage.PROCEDURES_SECTION_BCTPS:
				return createProceduresSectionBCTPS();
			case CLONDATAPackage.RESULTS_SECTION_BCTPS:
				return createResultsSectionBCTPS();
			case CLONDATAPackage.VITAL_SIGNS_SECTION_BCTPS:
				return createVitalSignsSectionBCTPS();
			case CLONDATAPackage.VITAL_SIGNS_ORGANIZER_BCTPS:
				return createVitalSignsOrganizerBCTPS();
			case CLONDATAPackage.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY:
				return createClinicalOncologyTreatmentPlanandSummary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnthracyclinesLifetimeDose createAnthracyclinesLifetimeDose() {
		AnthracyclinesLifetimeDoseImpl anthracyclinesLifetimeDose = new AnthracyclinesLifetimeDoseImpl();
		return anthracyclinesLifetimeDose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMMetastasisCategory createBreastTNMMetastasisCategory() {
		BreastTNMMetastasisCategoryImpl breastTNMMetastasisCategory = new BreastTNMMetastasisCategoryImpl();
		return breastTNMMetastasisCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMClinicalCategory createBreastTNMClinicalCategory() {
		BreastTNMClinicalCategoryImpl breastTNMClinicalCategory = new BreastTNMClinicalCategoryImpl();
		return breastTNMClinicalCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMNodeCategory createBreastTNMNodeCategory() {
		BreastTNMNodeCategoryImpl breastTNMNodeCategory = new BreastTNMNodeCategoryImpl();
		return breastTNMNodeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastTNMTumorCategory createBreastTNMTumorCategory() {
		BreastTNMTumorCategoryImpl breastTNMTumorCategory = new BreastTNMTumorCategoryImpl();
		return breastTNMTumorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapeuticDrugTherapyDiscontinued createChemotherapeuticDrugTherapyDiscontinued() {
		ChemotherapeuticDrugTherapyDiscontinuedImpl chemotherapeuticDrugTherapyDiscontinued = new ChemotherapeuticDrugTherapyDiscontinuedImpl();
		return chemotherapeuticDrugTherapyDiscontinued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyProtocolReference createChemotherapyProtocolReference() {
		ChemotherapyProtocolReferenceImpl chemotherapyProtocolReference = new ChemotherapyProtocolReferenceImpl();
		return chemotherapyProtocolReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDrugTrial createClinicalDrugTrial() {
		ClinicalDrugTrialImpl clinicalDrugTrial = new ClinicalDrugTrialImpl();
		return clinicalDrugTrial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalizationWithReason createHospitalizationWithReason() {
		HospitalizationWithReasonImpl hospitalizationWithReason = new HospitalizationWithReasonImpl();
		return hospitalizationWithReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryofCancerNone createFamilyHistoryofCancerNone() {
		FamilyHistoryofCancerNoneImpl familyHistoryofCancerNone = new FamilyHistoryofCancerNoneImpl();
		return familyHistoryofCancerNone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryPedigree createFamilyHistoryPedigree() {
		FamilyHistoryPedigreeImpl familyHistoryPedigree = new FamilyHistoryPedigreeImpl();
		return familyHistoryPedigree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastMenstrualPeriod createLastMenstrualPeriod() {
		LastMenstrualPeriodImpl lastMenstrualPeriod = new LastMenstrualPeriodImpl();
		return lastMenstrualPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyMedicationActivity createChemotherapyMedicationActivity() {
		ChemotherapyMedicationActivityImpl chemotherapyMedicationActivity = new ChemotherapyMedicationActivityImpl();
		return chemotherapyMedicationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OncotypeDXScore createOncotypeDXScore() {
		OncotypeDXScoreImpl oncotypeDXScore = new OncotypeDXScoreImpl();
		return oncotypeDXScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyRegimenPlans createChemotherapyRegimenPlans() {
		ChemotherapyRegimenPlansImpl chemotherapyRegimenPlans = new ChemotherapyRegimenPlansImpl();
		return chemotherapyRegimenPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareActivityReconstructionProcedure createPlanofCareActivityReconstructionProcedure() {
		PlanofCareActivityReconstructionProcedureImpl planofCareActivityReconstructionProcedure = new PlanofCareActivityReconstructionProcedureImpl();
		return planofCareActivityReconstructionProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChemotherapyMedicationActivityPlan createChemotherapyMedicationActivityPlan() {
		ChemotherapyMedicationActivityPlanImpl chemotherapyMedicationActivityPlan = new ChemotherapyMedicationActivityPlanImpl();
		return chemotherapyMedicationActivityPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTreatmentDiseaseStatus createPostTreatmentDiseaseStatus() {
		PostTreatmentDiseaseStatusImpl postTreatmentDiseaseStatus = new PostTreatmentDiseaseStatusImpl();
		return postTreatmentDiseaseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastCancerConcernAct createBreastCancerConcernAct() {
		BreastCancerConcernActImpl breastCancerConcernAct = new BreastCancerConcernActImpl();
		return breastCancerConcernAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastCancerDiagnosisObservation createBreastCancerDiagnosisObservation() {
		BreastCancerDiagnosisObservationImpl breastCancerDiagnosisObservation = new BreastCancerDiagnosisObservationImpl();
		return breastCancerDiagnosisObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeurotoxicityImpairmentofADLs createNeurotoxicityImpairmentofADLs() {
		NeurotoxicityImpairmentofADLsImpl neurotoxicityImpairmentofADLs = new NeurotoxicityImpairmentofADLsImpl();
		return neurotoxicityImpairmentofADLs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadiationTherapyCareCompleted createRadiationTherapyCareCompleted() {
		RadiationTherapyCareCompletedImpl radiationTherapyCareCompleted = new RadiationTherapyCareCompletedImpl();
		return radiationTherapyCareCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreastCancerProcedures createBreastCancerProcedures() {
		BreastCancerProceduresImpl breastCancerProcedures = new BreastCancerProceduresImpl();
		return breastCancerProcedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacFunctionObservation createCardiacFunctionObservation() {
		CardiacFunctionObservationImpl cardiacFunctionObservation = new CardiacFunctionObservationImpl();
		return cardiacFunctionObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstrogenReceptorStatus createEstrogenReceptorStatus() {
		EstrogenReceptorStatusImpl estrogenReceptorStatus = new EstrogenReceptorStatusImpl();
		return estrogenReceptorStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HER2ReceptorStatus createHER2ReceptorStatus() {
		HER2ReceptorStatusImpl her2ReceptorStatus = new HER2ReceptorStatusImpl();
		return her2ReceptorStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLymphNodesPositive createNumberofLymphNodesPositive() {
		NumberofLymphNodesPositiveImpl numberofLymphNodesPositive = new NumberofLymphNodesPositiveImpl();
		return numberofLymphNodesPositive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofLymphNodesRemovedandExamined createNumberofLymphNodesRemovedandExamined() {
		NumberofLymphNodesRemovedandExaminedImpl numberofLymphNodesRemovedandExamined = new NumberofLymphNodesRemovedandExaminedImpl();
		return numberofLymphNodesRemovedandExamined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgesteroneReceptorStatus createProgesteroneReceptorStatus() {
		ProgesteroneReceptorStatusImpl progesteroneReceptorStatus = new ProgesteroneReceptorStatusImpl();
		return progesteroneReceptorStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LymphNodeSamplingResultOrganizer createLymphNodeSamplingResultOrganizer() {
		LymphNodeSamplingResultOrganizerImpl lymphNodeSamplingResultOrganizer = new LymphNodeSamplingResultOrganizerImpl();
		return lymphNodeSamplingResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolecularDiagnosticTestingOrganizer createMolecularDiagnosticTestingOrganizer() {
		MolecularDiagnosticTestingOrganizerImpl molecularDiagnosticTestingOrganizer = new MolecularDiagnosticTestingOrganizerImpl();
		return molecularDiagnosticTestingOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceptorStatusOrganizer createReceptorStatusOrganizer() {
		ReceptorStatusOrganizerImpl receptorStatusOrganizer = new ReceptorStatusOrganizerImpl();
		return receptorStatusOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyHeight createBodyHeight() {
		BodyHeightImpl bodyHeight = new BodyHeightImpl();
		return bodyHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySurfaceArea createBodySurfaceArea() {
		BodySurfaceAreaImpl bodySurfaceArea = new BodySurfaceAreaImpl();
		return bodySurfaceArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyWeight createBodyWeight() {
		BodyWeightImpl bodyWeight = new BodyWeightImpl();
		return bodyWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSectionBCTPS createEncountersSectionBCTPS() {
		EncountersSectionBCTPSImpl encountersSectionBCTPS = new EncountersSectionBCTPSImpl();
		return encountersSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySectionBCTPS createFamilyHistorySectionBCTPS() {
		FamilyHistorySectionBCTPSImpl familyHistorySectionBCTPS = new FamilyHistorySectionBCTPSImpl();
		return familyHistorySectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSectionBCTPS createFunctionalStatusSectionBCTPS() {
		FunctionalStatusSectionBCTPSImpl functionalStatusSectionBCTPS = new FunctionalStatusSectionBCTPSImpl();
		return functionalStatusSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionBCTPS createMedicationsSectionBCTPS() {
		MedicationsSectionBCTPSImpl medicationsSectionBCTPS = new MedicationsSectionBCTPSImpl();
		return medicationsSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareSectionBCTPS createPlanofCareSectionBCTPS() {
		PlanofCareSectionBCTPSImpl planofCareSectionBCTPS = new PlanofCareSectionBCTPSImpl();
		return planofCareSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanofCareRadiationActivity createPlanofCareRadiationActivity() {
		PlanofCareRadiationActivityImpl planofCareRadiationActivity = new PlanofCareRadiationActivityImpl();
		return planofCareRadiationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionBCTPS createProblemSectionBCTPS() {
		ProblemSectionBCTPSImpl problemSectionBCTPS = new ProblemSectionBCTPSImpl();
		return problemSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionBCTPS createProceduresSectionBCTPS() {
		ProceduresSectionBCTPSImpl proceduresSectionBCTPS = new ProceduresSectionBCTPSImpl();
		return proceduresSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionBCTPS createResultsSectionBCTPS() {
		ResultsSectionBCTPSImpl resultsSectionBCTPS = new ResultsSectionBCTPSImpl();
		return resultsSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionBCTPS createVitalSignsSectionBCTPS() {
		VitalSignsSectionBCTPSImpl vitalSignsSectionBCTPS = new VitalSignsSectionBCTPSImpl();
		return vitalSignsSectionBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsOrganizerBCTPS createVitalSignsOrganizerBCTPS() {
		VitalSignsOrganizerBCTPSImpl vitalSignsOrganizerBCTPS = new VitalSignsOrganizerBCTPSImpl();
		return vitalSignsOrganizerBCTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalOncologyTreatmentPlanandSummary createClinicalOncologyTreatmentPlanandSummary() {
		ClinicalOncologyTreatmentPlanandSummaryImpl clinicalOncologyTreatmentPlanandSummary = new ClinicalOncologyTreatmentPlanandSummaryImpl();
		return clinicalOncologyTreatmentPlanandSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATAPackage getCLONDATAPackage() {
		return (CLONDATAPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CLONDATAPackage getPackage() {
		return CLONDATAPackage.eINSTANCE;
	}

} // CLONDATAFactoryImpl
