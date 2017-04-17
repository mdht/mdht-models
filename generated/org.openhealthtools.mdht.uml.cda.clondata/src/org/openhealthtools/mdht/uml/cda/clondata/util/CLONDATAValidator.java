/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
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
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPlugin;
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
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage
 * @generated
 */
public class CLONDATAValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CLONDATAValidator INSTANCE = new CLONDATAValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.clondata";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Template Id' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Class Code' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_CLASS_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Dose Quantity' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_DOSE_QUANTITY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Effective Time' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_EFFECTIVE_TIME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Mood Code' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_MOOD_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Status Code' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_STATUS_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Anthracyclines Lifetime Dose Consumable' of 'Anthracyclines Lifetime Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANTHRACYCLINES_LIFETIME_DOSE__ANTHRACYCLINES_LIFETIME_DOSE_CONSUMABLE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Template Id' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Class Code' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_CLASS_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Code P' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_CODE_P = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Code' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Effective Time' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_EFFECTIVE_TIME = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Mood Code' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_MOOD_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Status Code' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_STATUS_CODE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Metastasis Category Value' of 'Breast TNM Metastasis Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_METASTASIS_CATEGORY__BREAST_TNM_METASTASIS_CATEGORY_VALUE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Template Id' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Class Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_CLASS_CODE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Code P' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_CODE_P = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Effective Time' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_EFFECTIVE_TIME = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Id' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Mood Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_MOOD_CODE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Class Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Code P' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_CODE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Mood Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Status Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Status Code P' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation Value' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION_VALUE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Type Code' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_TYPE_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Clinical Category Entry Relationship Observation' of 'Breast TNM Clinical Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_CLINICAL_CATEGORY__BREAST_TNM_CLINICAL_CATEGORY_ENTRY_RELATIONSHIP_OBSERVATION = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Node Category Template Id' of 'Breast TNM Node Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_TEMPLATE_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Node Category Class Code' of 'Breast TNM Node Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_CLASS_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Node Category Code' of 'Breast TNM Node Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Node Category Effective Time' of 'Breast TNM Node Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_EFFECTIVE_TIME = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Node Category Mood Code' of 'Breast TNM Node Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_MOOD_CODE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Node Category Value' of 'Breast TNM Node Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_NODE_CATEGORY__BREAST_TNM_NODE_CATEGORY_VALUE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Template Id' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Class Code' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_CLASS_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Code P' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_CODE_P = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Code' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Effective Time' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_EFFECTIVE_TIME = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Mood Code' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_MOOD_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Status Code' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_STATUS_CODE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Value' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_VALUE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast TNM Tumor Category Value P' of 'Breast TNM Tumor Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_TNM_TUMOR_CATEGORY__BREAST_TNM_TUMOR_CATEGORY_VALUE_P = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Template Id' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Class Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Code P' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Effective Time' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Mood Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Status Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Value' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Class Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code P' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Mood Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code P' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Value' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation' of 'Chemotherapeutic Drug Therapy Discontinued'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Template Id' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Class Code' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_CLASS_CODE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Code P' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE_P = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Code' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Mood Code' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_MOOD_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Status Code P' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE_P = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Status Code' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_STATUS_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Reference' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Reference External Document Id' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_ID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Reference External Document Text' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT_TEXT = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Reference Type Code' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_TYPE_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Protocol Reference Reference External Document' of 'Chemotherapy Protocol Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_PROTOCOL_REFERENCE__CHEMOTHERAPY_PROTOCOL_REFERENCE_REFERENCE_EXTERNAL_DOCUMENT = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Template Id' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_TEMPLATE_ID = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Class Code' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_CLASS_CODE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Code P' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_CODE_P = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Code' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_CODE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Mood Code' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_MOOD_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Status Code P' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_STATUS_CODE_P = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Drug Trial Status Code' of 'Clinical Drug Trial'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DRUG_TRIAL__CLINICAL_DRUG_TRIAL_STATUS_CODE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospitalization With Reason Template Id' of 'Hospitalization With Reason'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITALIZATION_WITH_REASON__HOSPITALIZATION_WITH_REASON_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospitalization With Reason Code' of 'Hospitalization With Reason'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITALIZATION_WITH_REASON__HOSPITALIZATION_WITH_REASON_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospitalization With Reason Indication' of 'Hospitalization With Reason'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITALIZATION_WITH_REASON__HOSPITALIZATION_WITH_REASON_INDICATION = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Template Id' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_TEMPLATE_ID = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Class Code' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_CLASS_CODE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Code P' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_CODE_P = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Code' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_CODE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Negation Ind' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_NEGATION_IND = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Status Code P' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE_P = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Status Code' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_STATUS_CODE = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Historyof Cancer None Text' of 'Family Historyof Cancer None'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORYOF_CANCER_NONE__FAMILY_HISTORYOF_CANCER_NONE_TEXT = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Template Id' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_TEMPLATE_ID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Class Code' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_CLASS_CODE = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Code P' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_CODE_P = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Code' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_CODE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Mood Code' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_MOOD_CODE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Reference' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Reference External Observation Class Code' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_CLASS_CODE = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Reference External Observation Id' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_ID = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Reference External Observation Mood Code' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_MOOD_CODE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Pedigree Reference External Observation Text' of 'Family History Pedigree'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_PEDIGREE__FAMILY_HISTORY_PEDIGREE_REFERENCE_EXTERNAL_OBSERVATION_TEXT = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Template Id' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Class Code' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_CLASS_CODE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Code P' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_CODE_P = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Code' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Effective Time' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_EFFECTIVE_TIME = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Mood Code P' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_MOOD_CODE_P = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Mood Code' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_MOOD_CODE = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Last Menstrual Period Status Code' of 'Last Menstrual Period'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LAST_MENSTRUAL_PERIOD__LAST_MENSTRUAL_PERIOD_STATUS_CODE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Dose Quantity' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_DOSE_QUANTITY = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Effective Time' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_EFFECTIVE_TIME = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Repeat Number' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_REPEAT_NUMBER = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Route Code P' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE_P = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Route Code' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_ROUTE_CODE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Clinical Drug Trial' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_CLINICAL_DRUG_TRIAL = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Chemotherapy Protocol Reference' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__CHEMOTHERAPY_MEDICATION_ACTIVITY_CHEMOTHERAPY_PROTOCOL_REFERENCE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Chemotherapy Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Oncotype DX Score Code P' of 'Oncotype DX Score'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_CODE_P = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Oncotype DX Score Code' of 'Oncotype DX Score'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_CODE = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Oncotype DX Score Status Code P' of 'Oncotype DX Score'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_STATUS_CODE_P = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Oncotype DX Score Status Code' of 'Oncotype DX Score'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_STATUS_CODE = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Oncotype DX Score Value' of 'Oncotype DX Score'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_VALUE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Oncotype DX Score'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ONCOTYPE_DX_SCORE__RESULT_OBSERVATION_TEMPLATE_ID = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Template Id' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_TEMPLATE_ID = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Class Code' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CLASS_CODE = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Code P' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CODE_P = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Code' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CODE = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Effective Time' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_EFFECTIVE_TIME = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Status Code' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_STATUS_CODE = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Mood Code' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_MOOD_CODE = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Chemotherapy Medication Activity' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CHEMOTHERAPY_MEDICATION_ACTIVITY = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Regimen Plans Clinical Drug Trial' of 'Chemotherapy Regimen Plans'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_REGIMEN_PLANS__CHEMOTHERAPY_REGIMEN_PLANS_CLINICAL_DRUG_TRIAL = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planof Care Activity Reconstruction Procedure Code' of 'Planof Care Activity Reconstruction Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_CODE = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planof Care Activity Reconstruction Procedure Effective Time' of 'Planof Care Activity Reconstruction Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE_EFFECTIVE_TIME = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Template Id' of 'Planof Care Activity Reconstruction Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Effective Time' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_EFFECTIVE_TIME = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Repeat Number' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REPEAT_NUMBER = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Route Code P' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE_P = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Route Code' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_ROUTE_CODE = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Status Code' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_STATUS_CODE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Clinical Drug Trial' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CLINICAL_DRUG_TRIAL = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Reaction Observation' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_REACTION_OBSERVATION = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Chemotherapy Protocol Reference' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_CHEMOTHERAPY_PROTOCOL_REFERENCE = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chemotherapy Medication Activity Plan Medication Activity' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN_MEDICATION_ACTIVITY = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Template Id' of 'Chemotherapy Medication Activity Plan'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Template Id' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_TEMPLATE_ID = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Class Code' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_CLASS_CODE = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Code P' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_CODE_P = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Code' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_CODE = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Effective Time' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_EFFECTIVE_TIME = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Id' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_ID = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Mood Code' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_MOOD_CODE = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Status Code P' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_STATUS_CODE_P = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Status Code' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_STATUS_CODE = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Value' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_VALUE = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Treatment Disease Status Value P' of 'Post Treatment Disease Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POST_TREATMENT_DISEASE_STATUS__POST_TREATMENT_DISEASE_STATUS_VALUE_P = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Act Template Id' of 'Breast Cancer Concern Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_CONCERN_ACT__PROBLEM_CONCERN_ACT_TEMPLATE_ID = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Code P' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE_P = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Code' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_CODE = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Effective Time' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_EFFECTIVE_TIME = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Target Site Code P' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE_P = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Target Site Code' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_TARGET_SITE_CODE = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Value P' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE_P = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Diagnosis Observation Value' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__BREAST_CANCER_DIAGNOSIS_OBSERVATION_VALUE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Breast Cancer Diagnosis Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_DIAGNOSIS_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Template Id' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Class Code' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code P' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Id' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Mood Code' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Status Code' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Value' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Type Code' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation' of 'Neurotoxicity Impairmentof AD Ls'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Radiation Therapy Care Completed Code P' of 'Radiation Therapy Care Completed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_CODE_P = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Radiation Therapy Care Completed Code' of 'Radiation Therapy Care Completed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_CODE = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Radiation Therapy Care Completed Effective Time' of 'Radiation Therapy Care Completed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_EFFECTIVE_TIME = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Radiation Therapy Care Completed Negation Ind' of 'Radiation Therapy Care Completed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RADIATION_THERAPY_CARE_COMPLETED__RADIATION_THERAPY_CARE_COMPLETED_NEGATION_IND = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Template Id' of 'Radiation Therapy Care Completed'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RADIATION_THERAPY_CARE_COMPLETED__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Procedures Code P' of 'Breast Cancer Procedures'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_PROCEDURES__BREAST_CANCER_PROCEDURES_CODE_P = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Procedures Code' of 'Breast Cancer Procedures'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_PROCEDURES__BREAST_CANCER_PROCEDURES_CODE = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Breast Cancer Procedures Effective Time' of 'Breast Cancer Procedures'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_PROCEDURES__BREAST_CANCER_PROCEDURES_EFFECTIVE_TIME = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Template Id' of 'Breast Cancer Procedures'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BREAST_CANCER_PROCEDURES__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cardiac Function Observation Code' of 'Cardiac Function Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CARDIAC_FUNCTION_OBSERVATION__CARDIAC_FUNCTION_OBSERVATION_CODE = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cardiac Function Observation Method Code' of 'Cardiac Function Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CARDIAC_FUNCTION_OBSERVATION__CARDIAC_FUNCTION_OBSERVATION_METHOD_CODE = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Cardiac Function Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CARDIAC_FUNCTION_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Code P' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_CODE_P = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Code' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_CODE = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Interpretation Code P' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Interpretation Code' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Method Code P' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Method Code' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_METHOD_CODE = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Estrogen Receptor Status Value' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_VALUE = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Estrogen Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESTROGEN_RECEPTOR_STATUS__RESULT_OBSERVATION_TEMPLATE_ID = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HER2 Receptor Status Code P' of 'HER2 Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HER2_RECEPTOR_STATUS__HER2_RECEPTOR_STATUS_CODE_P = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HER2 Receptor Status Code' of 'HER2 Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HER2_RECEPTOR_STATUS__HER2_RECEPTOR_STATUS_CODE = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HER2 Receptor Status Interpretation Code P' of 'HER2 Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HER2_RECEPTOR_STATUS__HER2_RECEPTOR_STATUS_INTERPRETATION_CODE_P = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HER2 Receptor Status Interpretation Code' of 'HER2 Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HER2_RECEPTOR_STATUS__HER2_RECEPTOR_STATUS_INTERPRETATION_CODE = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HER2 Receptor Status Value' of 'HER2 Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HER2_RECEPTOR_STATUS__HER2_RECEPTOR_STATUS_VALUE = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'HER2 Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HER2_RECEPTOR_STATUS__RESULT_OBSERVATION_TEMPLATE_ID = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Lymph Nodes Positive Code P' of 'Numberof Lymph Nodes Positive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_POSITIVE__NUMBEROF_LYMPH_NODES_POSITIVE_CODE_P = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Lymph Nodes Positive Code' of 'Numberof Lymph Nodes Positive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_POSITIVE__NUMBEROF_LYMPH_NODES_POSITIVE_CODE = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Lymph Nodes Positive Value' of 'Numberof Lymph Nodes Positive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_POSITIVE__NUMBEROF_LYMPH_NODES_POSITIVE_VALUE = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Numberof Lymph Nodes Positive'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_POSITIVE__RESULT_OBSERVATION_TEMPLATE_ID = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Lymph Nodes Removedand Examined Code P' of 'Numberof Lymph Nodes Removedand Examined'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE_P = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Lymph Nodes Removedand Examined Code' of 'Numberof Lymph Nodes Removedand Examined'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_CODE = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Numberof Lymph Nodes Removedand Examined Value' of 'Numberof Lymph Nodes Removedand Examined'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED_VALUE = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Numberof Lymph Nodes Removedand Examined'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED__RESULT_OBSERVATION_TEMPLATE_ID = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progesterone Receptor Status Code' of 'Progesterone Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_CODE = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progesterone Receptor Status Interpretation Code P' of 'Progesterone Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progesterone Receptor Status Interpretation Code' of 'Progesterone Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Progesterone Receptor Status Value' of 'Progesterone Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_VALUE = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Progesterone Receptor Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGESTERONE_RECEPTOR_STATUS__RESULT_OBSERVATION_TEMPLATE_ID = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Class Code' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CLASS_CODE = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Code' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_CODE = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Effective Time' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_EFFECTIVE_TIME = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Status Code P' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE_P = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Status Code' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_STATUS_CODE = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Removedand Examined' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Numberof Lymph Nodes Positive' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_NUMBEROF_LYMPH_NODES_POSITIVE = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Reference External Document Code' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_REFERENCE_EXTERNAL_DOCUMENT_CODE = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Playing Entity Code' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_PLAYING_ENTITY_CODE = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Id' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_ID = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Lymph Node Sampling Result Organizer Specimen Specimen Role Specimen Playing Entity' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__LYMPH_NODE_SAMPLING_RESULT_ORGANIZER_SPECIMEN_SPECIMEN_ROLE_SPECIMEN_PLAYING_ENTITY = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Lymph Node Sampling Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LYMPH_NODE_SAMPLING_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Molecular Diagnostic Testing Organizer Code P' of 'Molecular Diagnostic Testing Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE_P = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Molecular Diagnostic Testing Organizer Code' of 'Molecular Diagnostic Testing Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_CODE = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Molecular Diagnostic Testing Organizer Oncotype DX Score' of 'Molecular Diagnostic Testing Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER_ONCOTYPE_DX_SCORE = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Molecular Diagnostic Testing Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Receptor Status Organizer Code P' of 'Receptor Status Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_CODE_P = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Receptor Status Organizer Code' of 'Receptor Status Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_CODE = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Receptor Status Organizer Estrogen Receptor Status' of 'Receptor Status Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_ESTROGEN_RECEPTOR_STATUS = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Receptor Status Organizer Progesterone Receptor Status' of 'Receptor Status Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_PROGESTERONE_RECEPTOR_STATUS = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Receptor Status Organizer HER2 Receptor Status' of 'Receptor Status Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTOR_STATUS_ORGANIZER__RECEPTOR_STATUS_ORGANIZER_HER2_RECEPTOR_STATUS = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Receptor Status Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPTOR_STATUS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Height Code P' of 'Body Height'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_HEIGHT__BODY_HEIGHT_CODE_P = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Height Code' of 'Body Height'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_HEIGHT__BODY_HEIGHT_CODE = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Height Value' of 'Body Height'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_HEIGHT__BODY_HEIGHT_VALUE = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Template Id' of 'Body Height'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_HEIGHT__VITAL_SIGN_OBSERVATION_TEMPLATE_ID = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Surface Area Code P' of 'Body Surface Area'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_SURFACE_AREA__BODY_SURFACE_AREA_CODE_P = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Surface Area Code' of 'Body Surface Area'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_SURFACE_AREA__BODY_SURFACE_AREA_CODE = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Surface Area Value' of 'Body Surface Area'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_SURFACE_AREA__BODY_SURFACE_AREA_VALUE = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Template Id' of 'Body Surface Area'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_SURFACE_AREA__VITAL_SIGN_OBSERVATION_TEMPLATE_ID = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weight Code P' of 'Body Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_WEIGHT__BODY_WEIGHT_CODE_P = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weight Code' of 'Body Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_WEIGHT__BODY_WEIGHT_CODE = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Weight Value' of 'Body Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_WEIGHT__BODY_WEIGHT_VALUE = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Template Id' of 'Body Weight'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BODY_WEIGHT__VITAL_SIGN_OBSERVATION_TEMPLATE_ID = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section BCTPS Hospitalization With Reason' of 'Encounters Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION_BCTPS__ENCOUNTERS_SECTION_BCTPS_HOSPITALIZATION_WITH_REASON = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Entries Optional Template Id' of 'Encounters Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION_BCTPS__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section BCTPS Family Historyof Cancer None' of 'Family History Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORYOF_CANCER_NONE = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section BCTPS Family History Pedigree' of 'Family History Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_PEDIGREE = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section BCTPS Family History Organizer' of 'Family History Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_BCTPS_FAMILY_HISTORY_ORGANIZER = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Template Id' of 'Family History Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION_BCTPS__FAMILY_HISTORY_SECTION_TEMPLATE_ID = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Template Id' of 'Functional Status Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION_BCTPS__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section BCTPS Anthracyclines Lifetime Dose' of 'Medications Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_BCTPS_ANTHRACYCLINES_LIFETIME_DOSE = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section BCTPS Chemotherapeutic Drug Therapy Discontinued' of 'Medications Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section BCTPS Chemotherapy Medication Activity' of 'Medications Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_BCTPS_CHEMOTHERAPY_MEDICATION_ACTIVITY = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Entries Optional Template Id' of 'Medications Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION_BCTPS__MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Planof Care Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_SECTION_BCTPS__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planof Care Radiation Activity Code' of 'Planof Care Radiation Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_RADIATION_ACTIVITY__PLANOF_CARE_RADIATION_ACTIVITY_CODE = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Planof Care Radiation Activity Mood Code' of 'Planof Care Radiation Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_RADIATION_ACTIVITY__PLANOF_CARE_RADIATION_ACTIVITY_MOOD_CODE = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Template Id' of 'Planof Care Radiation Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANOF_CARE_RADIATION_ACTIVITY__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section BCTPS Breast Cancer Concern Act' of 'Problem Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION_BCTPS__PROBLEM_SECTION_BCTPS_BREAST_CANCER_CONCERN_ACT = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section BCTPS Last Menstrual Period' of 'Problem Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION_BCTPS__PROBLEM_SECTION_BCTPS_LAST_MENSTRUAL_PERIOD = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Entries Optional Template Id' of 'Problem Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION_BCTPS__PROBLEM_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section BCTPS Breast Cancer Procedures' of 'Procedures Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION_BCTPS__PROCEDURES_SECTION_BCTPS_BREAST_CANCER_PROCEDURES = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section BCTPS Radiation Therapy Care Completed' of 'Procedures Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION_BCTPS__PROCEDURES_SECTION_BCTPS_RADIATION_THERAPY_CARE_COMPLETED = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Entries Optional Template Id' of 'Procedures Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION_BCTPS__PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Entries Optional Template Id' of 'Results Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION_BCTPS__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section BCTPS Template Id' of 'Vital Signs Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION_BCTPS__VITAL_SIGNS_SECTION_BCTPS_TEMPLATE_ID = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section BCTPS Vital Signs Organizer BCTPS' of 'Vital Signs Section BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION_BCTPS__VITAL_SIGNS_SECTION_BCTPS_VITAL_SIGNS_ORGANIZER_BCTPS = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer BCTPS Body Height' of 'Vital Signs Organizer BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_BCTPS_BODY_HEIGHT = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer BCTPS Body Weight' of 'Vital Signs Organizer BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_BCTPS_BODY_WEIGHT = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer BCTPS Body Surface Area' of 'Vital Signs Organizer BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_BCTPS_BODY_SURFACE_AREA = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Template Id' of 'Vital Signs Organizer BCTPS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER_BCTPS__VITAL_SIGNS_ORGANIZER_TEMPLATE_ID = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Allergies Section Entries Optional' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Medications Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_MEDICATIONS_SECTION_BCTPS = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Family History Section BCTPS2' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FAMILY_HISTORY_SECTION_BCTPS2 = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Problem Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROBLEM_SECTION_BCTPS = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Procedures Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PROCEDURES_SECTION_BCTPS = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Results Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_RESULTS_SECTION_BCTPS = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Vital Signs Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_VITAL_SIGNS_SECTION_BCTPS = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Planof Care Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_PLANOF_CARE_SECTION_BCTPS = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Functional Status Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_FUNCTIONAL_STATUS_SECTION_BCTPS = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Oncology Treatment Planand Summary Encounters Section BCTPS' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY_ENCOUNTERS_SECTION_BCTPS = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Clinical Oncology Treatment Planand Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 290;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 290;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolValidator consolValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLONDATAValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		consolValidator = ConsolValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CLONDATAPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case CLONDATAPackage.ANTHRACYCLINES_LIFETIME_DOSE:
				return validateAnthracyclinesLifetimeDose((AnthracyclinesLifetimeDose) value, diagnostics, context);
			case CLONDATAPackage.BREAST_TNM_METASTASIS_CATEGORY:
				return validateBreastTNMMetastasisCategory((BreastTNMMetastasisCategory) value, diagnostics, context);
			case CLONDATAPackage.BREAST_TNM_CLINICAL_CATEGORY:
				return validateBreastTNMClinicalCategory((BreastTNMClinicalCategory) value, diagnostics, context);
			case CLONDATAPackage.BREAST_TNM_NODE_CATEGORY:
				return validateBreastTNMNodeCategory((BreastTNMNodeCategory) value, diagnostics, context);
			case CLONDATAPackage.BREAST_TNM_TUMOR_CATEGORY:
				return validateBreastTNMTumorCategory((BreastTNMTumorCategory) value, diagnostics, context);
			case CLONDATAPackage.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED:
				return validateChemotherapeuticDrugTherapyDiscontinued(
					(ChemotherapeuticDrugTherapyDiscontinued) value, diagnostics, context);
			case CLONDATAPackage.CHEMOTHERAPY_PROTOCOL_REFERENCE:
				return validateChemotherapyProtocolReference(
					(ChemotherapyProtocolReference) value, diagnostics, context);
			case CLONDATAPackage.CLINICAL_DRUG_TRIAL:
				return validateClinicalDrugTrial((ClinicalDrugTrial) value, diagnostics, context);
			case CLONDATAPackage.HOSPITALIZATION_WITH_REASON:
				return validateHospitalizationWithReason((HospitalizationWithReason) value, diagnostics, context);
			case CLONDATAPackage.FAMILY_HISTORYOF_CANCER_NONE:
				return validateFamilyHistoryofCancerNone((FamilyHistoryofCancerNone) value, diagnostics, context);
			case CLONDATAPackage.FAMILY_HISTORY_PEDIGREE:
				return validateFamilyHistoryPedigree((FamilyHistoryPedigree) value, diagnostics, context);
			case CLONDATAPackage.LAST_MENSTRUAL_PERIOD:
				return validateLastMenstrualPeriod((LastMenstrualPeriod) value, diagnostics, context);
			case CLONDATAPackage.CHEMOTHERAPY_MEDICATION_ACTIVITY:
				return validateChemotherapyMedicationActivity(
					(ChemotherapyMedicationActivity) value, diagnostics, context);
			case CLONDATAPackage.ONCOTYPE_DX_SCORE:
				return validateOncotypeDXScore((OncotypeDXScore) value, diagnostics, context);
			case CLONDATAPackage.CHEMOTHERAPY_REGIMEN_PLANS:
				return validateChemotherapyRegimenPlans((ChemotherapyRegimenPlans) value, diagnostics, context);
			case CLONDATAPackage.PLANOF_CARE_ACTIVITY_RECONSTRUCTION_PROCEDURE:
				return validatePlanofCareActivityReconstructionProcedure(
					(PlanofCareActivityReconstructionProcedure) value, diagnostics, context);
			case CLONDATAPackage.CHEMOTHERAPY_MEDICATION_ACTIVITY_PLAN:
				return validateChemotherapyMedicationActivityPlan(
					(ChemotherapyMedicationActivityPlan) value, diagnostics, context);
			case CLONDATAPackage.POST_TREATMENT_DISEASE_STATUS:
				return validatePostTreatmentDiseaseStatus((PostTreatmentDiseaseStatus) value, diagnostics, context);
			case CLONDATAPackage.BREAST_CANCER_CONCERN_ACT:
				return validateBreastCancerConcernAct((BreastCancerConcernAct) value, diagnostics, context);
			case CLONDATAPackage.BREAST_CANCER_DIAGNOSIS_OBSERVATION:
				return validateBreastCancerDiagnosisObservation(
					(BreastCancerDiagnosisObservation) value, diagnostics, context);
			case CLONDATAPackage.NEUROTOXICITY_IMPAIRMENTOF_AD_LS:
				return validateNeurotoxicityImpairmentofADLs(
					(NeurotoxicityImpairmentofADLs) value, diagnostics, context);
			case CLONDATAPackage.RADIATION_THERAPY_CARE_COMPLETED:
				return validateRadiationTherapyCareCompleted(
					(RadiationTherapyCareCompleted) value, diagnostics, context);
			case CLONDATAPackage.BREAST_CANCER_PROCEDURES:
				return validateBreastCancerProcedures((BreastCancerProcedures) value, diagnostics, context);
			case CLONDATAPackage.CARDIAC_FUNCTION_OBSERVATION:
				return validateCardiacFunctionObservation((CardiacFunctionObservation) value, diagnostics, context);
			case CLONDATAPackage.ESTROGEN_RECEPTOR_STATUS:
				return validateEstrogenReceptorStatus((EstrogenReceptorStatus) value, diagnostics, context);
			case CLONDATAPackage.HER2_RECEPTOR_STATUS:
				return validateHER2ReceptorStatus((HER2ReceptorStatus) value, diagnostics, context);
			case CLONDATAPackage.NUMBEROF_LYMPH_NODES_POSITIVE:
				return validateNumberofLymphNodesPositive((NumberofLymphNodesPositive) value, diagnostics, context);
			case CLONDATAPackage.NUMBEROF_LYMPH_NODES_REMOVEDAND_EXAMINED:
				return validateNumberofLymphNodesRemovedandExamined(
					(NumberofLymphNodesRemovedandExamined) value, diagnostics, context);
			case CLONDATAPackage.PROGESTERONE_RECEPTOR_STATUS:
				return validateProgesteroneReceptorStatus((ProgesteroneReceptorStatus) value, diagnostics, context);
			case CLONDATAPackage.LYMPH_NODE_SAMPLING_RESULT_ORGANIZER:
				return validateLymphNodeSamplingResultOrganizer(
					(LymphNodeSamplingResultOrganizer) value, diagnostics, context);
			case CLONDATAPackage.MOLECULAR_DIAGNOSTIC_TESTING_ORGANIZER:
				return validateMolecularDiagnosticTestingOrganizer(
					(MolecularDiagnosticTestingOrganizer) value, diagnostics, context);
			case CLONDATAPackage.RECEPTOR_STATUS_ORGANIZER:
				return validateReceptorStatusOrganizer((ReceptorStatusOrganizer) value, diagnostics, context);
			case CLONDATAPackage.BODY_HEIGHT:
				return validateBodyHeight((BodyHeight) value, diagnostics, context);
			case CLONDATAPackage.BODY_SURFACE_AREA:
				return validateBodySurfaceArea((BodySurfaceArea) value, diagnostics, context);
			case CLONDATAPackage.BODY_WEIGHT:
				return validateBodyWeight((BodyWeight) value, diagnostics, context);
			case CLONDATAPackage.ENCOUNTERS_SECTION_BCTPS:
				return validateEncountersSectionBCTPS((EncountersSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.FAMILY_HISTORY_SECTION_BCTPS:
				return validateFamilyHistorySectionBCTPS((FamilyHistorySectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.FUNCTIONAL_STATUS_SECTION_BCTPS:
				return validateFunctionalStatusSectionBCTPS((FunctionalStatusSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.MEDICATIONS_SECTION_BCTPS:
				return validateMedicationsSectionBCTPS((MedicationsSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.PLANOF_CARE_SECTION_BCTPS:
				return validatePlanofCareSectionBCTPS((PlanofCareSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.PLANOF_CARE_RADIATION_ACTIVITY:
				return validatePlanofCareRadiationActivity((PlanofCareRadiationActivity) value, diagnostics, context);
			case CLONDATAPackage.PROBLEM_SECTION_BCTPS:
				return validateProblemSectionBCTPS((ProblemSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.PROCEDURES_SECTION_BCTPS:
				return validateProceduresSectionBCTPS((ProceduresSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.RESULTS_SECTION_BCTPS:
				return validateResultsSectionBCTPS((ResultsSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.VITAL_SIGNS_SECTION_BCTPS:
				return validateVitalSignsSectionBCTPS((VitalSignsSectionBCTPS) value, diagnostics, context);
			case CLONDATAPackage.VITAL_SIGNS_ORGANIZER_BCTPS:
				return validateVitalSignsOrganizerBCTPS((VitalSignsOrganizerBCTPS) value, diagnostics, context);
			case CLONDATAPackage.CLINICAL_ONCOLOGY_TREATMENT_PLANAND_SUMMARY:
				return validateClinicalOncologyTreatmentPlanandSummary(
					(ClinicalOncologyTreatmentPlanandSummary) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose(AnthracyclinesLifetimeDose anthracyclinesLifetimeDose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anthracyclinesLifetimeDose, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(anthracyclinesLifetimeDose, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseTemplateId(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseClassCode(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseDoseQuantity(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseEffectiveTime(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseMoodCode(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseStatusCode(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseConsumable(
				anthracyclinesLifetimeDose, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseTemplateId constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseTemplateId(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseClassCode constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseClassCode(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseDoseQuantity constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseDoseQuantity(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseEffectiveTime constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseEffectiveTime(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseMoodCode constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseMoodCode(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseStatusCode constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseStatusCode(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAnthracyclinesLifetimeDoseConsumable constraint of '<em>Anthracyclines Lifetime Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnthracyclinesLifetimeDose_validateAnthracyclinesLifetimeDoseConsumable(
			AnthracyclinesLifetimeDose anthracyclinesLifetimeDose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return anthracyclinesLifetimeDose.validateAnthracyclinesLifetimeDoseConsumable(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory(BreastTNMMetastasisCategory breastTNMMetastasisCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastTNMMetastasisCategory, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastTNMMetastasisCategory, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryTemplateId(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryClassCode(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryCodeP(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryCode(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryEffectiveTime(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryMoodCode(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryStatusCode(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryValue(
				breastTNMMetastasisCategory, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryTemplateId constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryTemplateId(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryClassCode constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryClassCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryCodeP constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryCodeP(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryCode constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryEffectiveTime constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryEffectiveTime(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryMoodCode constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryMoodCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryStatusCode constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryStatusCode(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMMetastasisCategoryValue constraint of '<em>Breast TNM Metastasis Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMMetastasisCategory_validateBreastTNMMetastasisCategoryValue(
			BreastTNMMetastasisCategory breastTNMMetastasisCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMMetastasisCategory.validateBreastTNMMetastasisCategoryValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory(BreastTNMClinicalCategory breastTNMClinicalCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastTNMClinicalCategory, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastTNMClinicalCategory, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryTemplateId(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryClassCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryCodeP(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEffectiveTime(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryId(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryMoodCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(
				breastTNMClinicalCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservation(
				breastTNMClinicalCategory, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryTemplateId constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryTemplateId(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryClassCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryClassCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryCodeP constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryCodeP(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEffectiveTime constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEffectiveTime(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryId constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryId(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryId(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryMoodCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryMoodCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationStatusCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservationValue constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservationValue(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipTypeCode constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipTypeCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMClinicalCategoryEntryRelationshipObservation constraint of '<em>Breast TNM Clinical Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMClinicalCategory_validateBreastTNMClinicalCategoryEntryRelationshipObservation(
			BreastTNMClinicalCategory breastTNMClinicalCategory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastTNMClinicalCategory.validateBreastTNMClinicalCategoryEntryRelationshipObservation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory(BreastTNMNodeCategory breastTNMNodeCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastTNMNodeCategory, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastTNMNodeCategory, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryTemplateId(
				breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryClassCode(
				breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryCode(
				breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryEffectiveTime(
				breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryMoodCode(
				breastTNMNodeCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryValue(
				breastTNMNodeCategory, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBreastTNMNodeCategoryTemplateId constraint of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryTemplateId(
			BreastTNMNodeCategory breastTNMNodeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMNodeCategory.validateBreastTNMNodeCategoryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMNodeCategoryClassCode constraint of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryClassCode(
			BreastTNMNodeCategory breastTNMNodeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMNodeCategory.validateBreastTNMNodeCategoryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMNodeCategoryCode constraint of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryCode(
			BreastTNMNodeCategory breastTNMNodeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMNodeCategory.validateBreastTNMNodeCategoryCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMNodeCategoryEffectiveTime constraint of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryEffectiveTime(
			BreastTNMNodeCategory breastTNMNodeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMNodeCategory.validateBreastTNMNodeCategoryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMNodeCategoryMoodCode constraint of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryMoodCode(
			BreastTNMNodeCategory breastTNMNodeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMNodeCategory.validateBreastTNMNodeCategoryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMNodeCategoryValue constraint of '<em>Breast TNM Node Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMNodeCategory_validateBreastTNMNodeCategoryValue(
			BreastTNMNodeCategory breastTNMNodeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMNodeCategory.validateBreastTNMNodeCategoryValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory(BreastTNMTumorCategory breastTNMTumorCategory,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastTNMTumorCategory, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastTNMTumorCategory, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryTemplateId(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryClassCode(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryCodeP(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryCode(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryEffectiveTime(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryMoodCode(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryStatusCode(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryValue(
				breastTNMTumorCategory, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryValueP(
				breastTNMTumorCategory, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryTemplateId constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryTemplateId(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryClassCode constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryClassCode(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryCodeP constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryCodeP(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryCode constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryCode(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryEffectiveTime constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryEffectiveTime(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryMoodCode constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryMoodCode(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryStatusCode constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryStatusCode(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryValue constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryValue(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryValue(diagnostics, context);
	}

	/**
	 * Validates the validateBreastTNMTumorCategoryValueP constraint of '<em>Breast TNM Tumor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastTNMTumorCategory_validateBreastTNMTumorCategoryValueP(
			BreastTNMTumorCategory breastTNMTumorCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastTNMTumorCategory.validateBreastTNMTumorCategoryValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedClassCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedCodeP(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedValue(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(
				chemotherapeuticDrugTherapyDiscontinued, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedTemplateId constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedClassCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedClassCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedCodeP constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedCodeP(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedMoodCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedStatusCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedValue constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedValue(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedValue(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation constraint of '<em>Chemotherapeutic Drug Therapy Discontinued</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapeuticDrugTherapyDiscontinued_validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chemotherapeuticDrugTherapyDiscontinued.validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference(ChemotherapyProtocolReference chemotherapyProtocolReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chemotherapyProtocolReference, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(chemotherapyProtocolReference, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceTemplateId(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceClassCode(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceCodeP(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceCode(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceMoodCode(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceStatusCode(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceStatusCodeP(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReference(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceExternalDocumentId(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceExternalDocumentText(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceTypeCode(
				chemotherapyProtocolReference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceExternalDocument(
				chemotherapyProtocolReference, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceTemplateId constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceTemplateId(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceClassCode constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceClassCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceCodeP constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceCodeP(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceCode constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceMoodCode constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceMoodCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceStatusCodeP constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceStatusCodeP(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceStatusCode constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceStatusCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceReference constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReference(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceReference(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceReferenceExternalDocumentId constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceExternalDocumentId(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceReferenceExternalDocumentId(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceReferenceExternalDocumentText constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceExternalDocumentText(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceReferenceExternalDocumentText(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceReferenceTypeCode constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceTypeCode(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceReferenceTypeCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyProtocolReferenceReferenceExternalDocument constraint of '<em>Chemotherapy Protocol Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyProtocolReference_validateChemotherapyProtocolReferenceReferenceExternalDocument(
			ChemotherapyProtocolReference chemotherapyProtocolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyProtocolReference.validateChemotherapyProtocolReferenceReferenceExternalDocument(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial(ClinicalDrugTrial clinicalDrugTrial, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clinicalDrugTrial, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(clinicalDrugTrial, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialTemplateId(
				clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialClassCode(
				clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialCodeP(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialCode(clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialMoodCode(
				clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialStatusCode(
				clinicalDrugTrial, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDrugTrial_validateClinicalDrugTrialStatusCodeP(
				clinicalDrugTrial, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClinicalDrugTrialTemplateId constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialTemplateId(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalDrugTrialClassCode constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialClassCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalDrugTrialCodeP constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialCodeP(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalDrugTrialCode constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialCode(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalDrugTrialMoodCode constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialMoodCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalDrugTrialStatusCodeP constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialStatusCodeP(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateClinicalDrugTrialStatusCode constraint of '<em>Clinical Drug Trial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrial_validateClinicalDrugTrialStatusCode(ClinicalDrugTrial clinicalDrugTrial,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDrugTrial.validateClinicalDrugTrialStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReason(HospitalizationWithReason hospitalizationWithReason,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalizationWithReason, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(hospitalizationWithReason, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalizationWithReason_validateHospitalizationWithReasonTemplateId(
				hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalizationWithReason_validateHospitalizationWithReasonCode(
				hospitalizationWithReason, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHospitalizationWithReason_validateHospitalizationWithReasonIndication(
				hospitalizationWithReason, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHospitalizationWithReasonTemplateId constraint of '<em>Hospitalization With Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReason_validateHospitalizationWithReasonTemplateId(
			HospitalizationWithReason hospitalizationWithReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalizationWithReason.validateHospitalizationWithReasonTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalizationWithReasonCode constraint of '<em>Hospitalization With Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReason_validateHospitalizationWithReasonCode(
			HospitalizationWithReason hospitalizationWithReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalizationWithReason.validateHospitalizationWithReasonCode(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalizationWithReasonIndication constraint of '<em>Hospitalization With Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReason_validateHospitalizationWithReasonIndication(
			HospitalizationWithReason hospitalizationWithReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return hospitalizationWithReason.validateHospitalizationWithReasonIndication(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone(FamilyHistoryofCancerNone familyHistoryofCancerNone,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryofCancerNone, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistoryofCancerNone, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneTemplateId(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneClassCode(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneCodeP(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneCode(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneNegationInd(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneStatusCode(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneStatusCodeP(
				familyHistoryofCancerNone, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneText(
				familyHistoryofCancerNone, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneTemplateId constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneTemplateId(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneClassCode constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneClassCode(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneCodeP constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneCodeP(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneCode constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneCode(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneNegationInd constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneNegationInd(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneNegationInd(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneStatusCodeP constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneStatusCodeP(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneStatusCode constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneStatusCode(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryofCancerNoneText constraint of '<em>Family Historyof Cancer None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryofCancerNone_validateFamilyHistoryofCancerNoneText(
			FamilyHistoryofCancerNone familyHistoryofCancerNone, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistoryofCancerNone.validateFamilyHistoryofCancerNoneText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree(FamilyHistoryPedigree familyHistoryPedigree,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryPedigree, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistoryPedigree, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeTemplateId(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeClassCode(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeCodeP(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeCode(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeMoodCode(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReference(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationId(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(
				familyHistoryPedigree, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationText(
				familyHistoryPedigree, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeTemplateId constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeTemplateId(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeClassCode constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeClassCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeCodeP constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeCodeP(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeCode constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeMoodCode constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeMoodCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeReference constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReference(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeReference(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeReferenceExternalObservationClassCode constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeReferenceExternalObservationClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeReferenceExternalObservationId constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationId(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeReferenceExternalObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeReferenceExternalObservationMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryPedigreeReferenceExternalObservationText constraint of '<em>Family History Pedigree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryPedigree_validateFamilyHistoryPedigreeReferenceExternalObservationText(
			FamilyHistoryPedigree familyHistoryPedigree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryPedigree.validateFamilyHistoryPedigreeReferenceExternalObservationText(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod(LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lastMenstrualPeriod, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(lastMenstrualPeriod, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodTemplateId(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodClassCode(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodCodeP(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodCode(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodEffectiveTime(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodMoodCodeP(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodMoodCode(
				lastMenstrualPeriod, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLastMenstrualPeriod_validateLastMenstrualPeriodStatusCode(
				lastMenstrualPeriod, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLastMenstrualPeriodTemplateId constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodTemplateId(
			LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodClassCode constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodClassCode(
			LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodCodeP constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodCodeP(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodCode constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodCode(LastMenstrualPeriod lastMenstrualPeriod,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodEffectiveTime constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodEffectiveTime(
			LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodMoodCodeP constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodMoodCodeP(
			LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodMoodCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodMoodCode constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodMoodCode(
			LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLastMenstrualPeriodStatusCode constraint of '<em>Last Menstrual Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriod_validateLastMenstrualPeriodStatusCode(
			LastMenstrualPeriod lastMenstrualPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lastMenstrualPeriod.validateLastMenstrualPeriodStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity(ChemotherapyMedicationActivity chemotherapyMedicationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chemotherapyMedicationActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(chemotherapyMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantityorrateQuantity(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityTextReference(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityReferenceValue(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityTextReferenceValue(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeIVLTSorTS(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeIVLTSLow(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeIVLTSHigh(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeTSValue(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimePIVLTS(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeOperator(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantityUnit(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityDrugVehicleTypeCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityInstructionsInversionInd(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityRateQuantityUnit(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateMedicationActivityTemplateId(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityClassCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityMoodCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityId(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityStatusCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityRouteCodeP(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityRouteCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityApproachSiteCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityApproachSiteCodeP(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityAdministrationUnitCodeP(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityAdministrationUnitCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityText(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityRepeatNumber(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityMedicationSupplyOrder(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityPerformer(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityInstructions(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityIndication(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityMedicationDispense(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityDrugVehicle(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityConsumable(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityPrecondition(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityConsumableMedicationInformation(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityPreconditionTypeCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationActivity_validateMedicationActivityPreconditionPreconditionForSubstanceAdministration(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityDoseQuantity(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityEffectiveTime(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityRepeatNumber(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityRouteCode(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityRouteCodeP(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityClinicalDrugTrial(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityChemotherapyProtocolReference(
				chemotherapyMedicationActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityDoseQuantity constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityDoseQuantity(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityEffectiveTime constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityEffectiveTime(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityRepeatNumber constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityRepeatNumber(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityRepeatNumber(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityRouteCodeP constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityRouteCodeP(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityRouteCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityRouteCode constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityRouteCode(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityRouteCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityClinicalDrugTrial constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityClinicalDrugTrial(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityClinicalDrugTrial(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityChemotherapyProtocolReference constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateChemotherapyMedicationActivityChemotherapyProtocolReference(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateChemotherapyMedicationActivityChemotherapyProtocolReference(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Chemotherapy Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivity_validateMedicationActivityTemplateId(
			ChemotherapyMedicationActivity chemotherapyMedicationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore(OncotypeDXScore oncotypeDXScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oncotypeDXScore, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(oncotypeDXScore, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOncotypeDXScore_validateResultObservationTemplateId(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOncotypeDXScore_validateOncotypeDXScoreCodeP(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOncotypeDXScore_validateOncotypeDXScoreCode(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOncotypeDXScore_validateOncotypeDXScoreStatusCodeP(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOncotypeDXScore_validateOncotypeDXScoreStatusCode(oncotypeDXScore, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOncotypeDXScore_validateOncotypeDXScoreValue(oncotypeDXScore, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateOncotypeDXScoreCodeP constraint of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore_validateOncotypeDXScoreCodeP(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return oncotypeDXScore.validateOncotypeDXScoreCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateOncotypeDXScoreCode constraint of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore_validateOncotypeDXScoreCode(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return oncotypeDXScore.validateOncotypeDXScoreCode(diagnostics, context);
	}

	/**
	 * Validates the validateOncotypeDXScoreStatusCodeP constraint of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore_validateOncotypeDXScoreStatusCodeP(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return oncotypeDXScore.validateOncotypeDXScoreStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateOncotypeDXScoreStatusCode constraint of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore_validateOncotypeDXScoreStatusCode(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return oncotypeDXScore.validateOncotypeDXScoreStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateOncotypeDXScoreValue constraint of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore_validateOncotypeDXScoreValue(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return oncotypeDXScore.validateOncotypeDXScoreValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Oncotype DX Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOncotypeDXScore_validateResultObservationTemplateId(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return oncotypeDXScore.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans(ChemotherapyRegimenPlans chemotherapyRegimenPlans,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chemotherapyRegimenPlans, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(chemotherapyRegimenPlans, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansTemplateId(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansClassCode(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansCode(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansCodeP(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansEffectiveTime(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansStatusCode(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansMoodCode(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansChemotherapyMedicationActivity(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansClinicalDrugTrial(
				chemotherapyRegimenPlans, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansTemplateId constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansTemplateId(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansClassCode constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansClassCode(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansCodeP constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansCodeP(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansCode constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansCode(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansEffectiveTime constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansEffectiveTime(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansStatusCode constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansStatusCode(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansMoodCode constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansMoodCode(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansChemotherapyMedicationActivity constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansChemotherapyMedicationActivity(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansChemotherapyMedicationActivity(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyRegimenPlansClinicalDrugTrial constraint of '<em>Chemotherapy Regimen Plans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyRegimenPlans_validateChemotherapyRegimenPlansClinicalDrugTrial(
			ChemotherapyRegimenPlans chemotherapyRegimenPlans, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyRegimenPlans.validateChemotherapyRegimenPlansClinicalDrugTrial(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareActivityReconstructionProcedure(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planofCareActivityReconstructionProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			planofCareActivityReconstructionProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareActivityReconstructionProcedure_validatePlanOfCareActivityProcedureTemplateId(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureClassCode(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareActivityReconstructionProcedure_validatePlanofCareActivityReconstructionProcedureCode(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareActivityReconstructionProcedure_validatePlanofCareActivityReconstructionProcedureEffectiveTime(
				planofCareActivityReconstructionProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanofCareActivityReconstructionProcedureCode constraint of '<em>Planof Care Activity Reconstruction Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareActivityReconstructionProcedure_validatePlanofCareActivityReconstructionProcedureCode(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planofCareActivityReconstructionProcedure.validatePlanofCareActivityReconstructionProcedureCode(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanofCareActivityReconstructionProcedureEffectiveTime constraint of '<em>Planof Care Activity Reconstruction Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareActivityReconstructionProcedure_validatePlanofCareActivityReconstructionProcedureEffectiveTime(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planofCareActivityReconstructionProcedure.validatePlanofCareActivityReconstructionProcedureEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureTemplateId constraint of '<em>Planof Care Activity Reconstruction Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareActivityReconstructionProcedure_validatePlanOfCareActivityProcedureTemplateId(
			PlanofCareActivityReconstructionProcedure planofCareActivityReconstructionProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planofCareActivityReconstructionProcedure.validatePlanOfCareActivityProcedureTemplateId(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chemotherapyMedicationActivityPlan, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(chemotherapyMedicationActivityPlan, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSubstanceAdministration_validateClassCode(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validatePlanOfCareActivitySubstanceAdministrationTemplateId(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationClassCode(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCode(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationId(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanEffectiveTime(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanRepeatNumber(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanRouteCode(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanRouteCodeP(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanStatusCode(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanClinicalDrugTrial(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanReactionObservation(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanMedicationActivity(
				chemotherapyMedicationActivityPlan, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanEffectiveTime constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanEffectiveTime(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanRepeatNumber constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanRepeatNumber(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanRepeatNumber(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanRouteCodeP constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanRouteCodeP(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanRouteCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanRouteCode constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanRouteCode(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanRouteCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanStatusCode constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanStatusCode(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanClinicalDrugTrial constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanClinicalDrugTrial(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanClinicalDrugTrial(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanReactionObservation constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanReactionObservation(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanReactionObservation(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanChemotherapyProtocolReference(
			diagnostics, context);
	}

	/**
	 * Validates the validateChemotherapyMedicationActivityPlanMedicationActivity constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validateChemotherapyMedicationActivityPlanMedicationActivity(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validateChemotherapyMedicationActivityPlanMedicationActivity(
			diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationTemplateId constraint of '<em>Chemotherapy Medication Activity Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChemotherapyMedicationActivityPlan_validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			ChemotherapyMedicationActivityPlan chemotherapyMedicationActivityPlan, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return chemotherapyMedicationActivityPlan.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus(PostTreatmentDiseaseStatus postTreatmentDiseaseStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(postTreatmentDiseaseStatus, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(postTreatmentDiseaseStatus, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusTemplateId(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusClassCode(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusCodeP(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusCode(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusEffectiveTime(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusId(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusMoodCode(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusStatusCode(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusStatusCodeP(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusValue(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusValueP(
				postTreatmentDiseaseStatus, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusTemplateId constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusTemplateId(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusClassCode constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusClassCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusCodeP constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusCodeP(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusCode constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusEffectiveTime constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusEffectiveTime(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusId constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusId(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusId(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusMoodCode constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusMoodCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusStatusCodeP constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusStatusCodeP(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusStatusCode constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusStatusCode(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusValue constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusValue(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusValue(diagnostics, context);
	}

	/**
	 * Validates the validatePostTreatmentDiseaseStatusValueP constraint of '<em>Post Treatment Disease Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostTreatmentDiseaseStatus_validatePostTreatmentDiseaseStatusValueP(
			PostTreatmentDiseaseStatus postTreatmentDiseaseStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return postTreatmentDiseaseStatus.validatePostTreatmentDiseaseStatusValueP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerConcernAct(BreastCancerConcernAct breastCancerConcernAct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastCancerConcernAct, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastCancerConcernAct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActEffectiveTimeLow(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActEffectiveTimeHigh(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerConcernAct_validateProblemConcernActTemplateId(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActClassCode(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActMoodCode(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActId(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActCodeP(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActCode(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActStatusCode(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActEffectiveTime(
				breastCancerConcernAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemConcernAct_validateProblemConcernActProblemObservation(
				breastCancerConcernAct, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemConcernActTemplateId constraint of '<em>Breast Cancer Concern Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerConcernAct_validateProblemConcernActTemplateId(
			BreastCancerConcernAct breastCancerConcernAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastCancerConcernAct.validateProblemConcernActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastCancerDiagnosisObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastCancerDiagnosisObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasTextReference(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationTextReferenceValue(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasTextReferenceValue(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasOnsetDate(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHasResolutionDate(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueNullFlavor(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationAgeObservationInversion(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueTranslation(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueTranslationCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateProblemObservationTemplateId(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationClassCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationMoodCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationNegationInd(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationId(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationCodeP(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationText(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationStatusCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationEffectiveTime(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValue(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationValueP(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationAgeObservation(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationHealthStatusObservation(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemObservation_validateProblemObservationProblemStatus(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationCodeP(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationEffectiveTime(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationTargetSiteCode(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationTargetSiteCodeP(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationValueP(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationValue(
				breastCancerDiagnosisObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationCodeP constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationCodeP(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationCode constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationCode(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationEffectiveTime constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationEffectiveTime(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationTargetSiteCodeP constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationTargetSiteCodeP(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationTargetSiteCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationTargetSiteCode constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationTargetSiteCode(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationTargetSiteCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationValueP constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationValueP(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationValueP(diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerDiagnosisObservationValue constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateBreastCancerDiagnosisObservationValue(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateBreastCancerDiagnosisObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Breast Cancer Diagnosis Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerDiagnosisObservation_validateProblemObservationTemplateId(
			BreastCancerDiagnosisObservation breastCancerDiagnosisObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return breastCancerDiagnosisObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs(NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(neurotoxicityImpairmentofADLs, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(neurotoxicityImpairmentofADLs, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsTemplateId(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationship(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(
				neurotoxicityImpairmentofADLs, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsTemplateId constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsTemplateId(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationship constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationship(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationship(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation constraint of '<em>Neurotoxicity Impairmentof AD Ls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeurotoxicityImpairmentofADLs_validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return neurotoxicityImpairmentofADLs.validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompleted(RadiationTherapyCareCompleted radiationTherapyCareCompleted,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(radiationTherapyCareCompleted, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(radiationTherapyCareCompleted, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActCodeOriginalText(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActOriginalTextReference(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActOriginalTextReferenceValue(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActReferenceValue(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActCodeCodeSystems(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActServiceDeliveryLocationTypeCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEncounterInversion(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActInstructionsInversion(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRadiationTherapyCareCompleted_validateProcedureActivityActTemplateId(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActClassCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActMoodCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActId(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActStatusCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEffectiveTime(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActPriorityCodeP(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActPriorityCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActPerformer(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActServiceDeliveryLocation(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActInstructions(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActIndication(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActMedicationActivity(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationship(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationId(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationName(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationTelecom(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityProcedureActRepresentedOrganizationAddr(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityId(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityAddr(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityTelecom(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerProcedureActAssignedEntityRepresentedOrganization(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActProcedureActPerformerAssignedEntity(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationshipProcedureActEncounterId(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationshipInversionInd(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationshipTypeCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityAct_validateProcedureActivityActEntryRelationshipProcedureActEncounter(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedCodeP(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedCode(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedEffectiveTime(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedNegationInd(
				radiationTherapyCareCompleted, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateRadiationTherapyCareCompletedCodeP constraint of '<em>Radiation Therapy Care Completed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedCodeP(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radiationTherapyCareCompleted.validateRadiationTherapyCareCompletedCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateRadiationTherapyCareCompletedCode constraint of '<em>Radiation Therapy Care Completed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedCode(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radiationTherapyCareCompleted.validateRadiationTherapyCareCompletedCode(diagnostics, context);
	}

	/**
	 * Validates the validateRadiationTherapyCareCompletedEffectiveTime constraint of '<em>Radiation Therapy Care Completed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedEffectiveTime(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radiationTherapyCareCompleted.validateRadiationTherapyCareCompletedEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateRadiationTherapyCareCompletedNegationInd constraint of '<em>Radiation Therapy Care Completed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompleted_validateRadiationTherapyCareCompletedNegationInd(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radiationTherapyCareCompleted.validateRadiationTherapyCareCompletedNegationInd(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityActTemplateId constraint of '<em>Radiation Therapy Care Completed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadiationTherapyCareCompleted_validateProcedureActivityActTemplateId(
			RadiationTherapyCareCompleted radiationTherapyCareCompleted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return radiationTherapyCareCompleted.validateProcedureActivityActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProcedures(BreastCancerProcedures breastCancerProcedures,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(breastCancerProcedures, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(breastCancerProcedures, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCodeCodeSystems(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCodeOriginalText(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureOriginalTextReference(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureOriginalTextReferenceValue(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureReferenceValue(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEncounterInversion(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProductInstanceTypeCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureServiceDeliveryLocationTypeCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureInstructionsInversion(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerProcedures_validateProcedureActivityProcedureTemplateId(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureClassCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMoodCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureId(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureStatusCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEffectiveTime(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePriorityCodeP(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePriorityCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMethodCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTargetSiteCodeP(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTargetSiteCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureIndication(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureSpecimen(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureServiceDeliveryLocation(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePerformer(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureMedicationActivity(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedurePatientInstruction(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProductInstance(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationship(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureSpecimenSpecimenRole(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleId(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationId(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationName(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecom(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddr(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityId(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganization(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterId(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipInversionInd(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipTypeCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounter(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerProcedures_validateBreastCancerProceduresCodeP(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerProcedures_validateBreastCancerProceduresCode(
				breastCancerProcedures, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBreastCancerProcedures_validateBreastCancerProceduresEffectiveTime(
				breastCancerProcedures, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBreastCancerProceduresCodeP constraint of '<em>Breast Cancer Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProcedures_validateBreastCancerProceduresCodeP(
			BreastCancerProcedures breastCancerProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastCancerProcedures.validateBreastCancerProceduresCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerProceduresCode constraint of '<em>Breast Cancer Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProcedures_validateBreastCancerProceduresCode(
			BreastCancerProcedures breastCancerProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastCancerProcedures.validateBreastCancerProceduresCode(diagnostics, context);
	}

	/**
	 * Validates the validateBreastCancerProceduresEffectiveTime constraint of '<em>Breast Cancer Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProcedures_validateBreastCancerProceduresEffectiveTime(
			BreastCancerProcedures breastCancerProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastCancerProcedures.validateBreastCancerProceduresEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProcedureActivityProcedureTemplateId constraint of '<em>Breast Cancer Procedures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreastCancerProcedures_validateProcedureActivityProcedureTemplateId(
			BreastCancerProcedures breastCancerProcedures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return breastCancerProcedures.validateProcedureActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacFunctionObservation(CardiacFunctionObservation cardiacFunctionObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardiacFunctionObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(cardiacFunctionObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCardiacFunctionObservation_validateResultObservationTemplateId(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCardiacFunctionObservation_validateCardiacFunctionObservationCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCardiacFunctionObservation_validateCardiacFunctionObservationMethodCode(
				cardiacFunctionObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateCardiacFunctionObservationCode constraint of '<em>Cardiac Function Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacFunctionObservation_validateCardiacFunctionObservationCode(
			CardiacFunctionObservation cardiacFunctionObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return cardiacFunctionObservation.validateCardiacFunctionObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateCardiacFunctionObservationMethodCode constraint of '<em>Cardiac Function Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacFunctionObservation_validateCardiacFunctionObservationMethodCode(
			CardiacFunctionObservation cardiacFunctionObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return cardiacFunctionObservation.validateCardiacFunctionObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Cardiac Function Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacFunctionObservation_validateResultObservationTemplateId(
			CardiacFunctionObservation cardiacFunctionObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return cardiacFunctionObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(estrogenReceptorStatus, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(estrogenReceptorStatus, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateResultObservationTemplateId(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusCodeP(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusInterpretationCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusInterpretationCodeP(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusMethodCodeP(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusMethodCode(
				estrogenReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEstrogenReceptorStatus_validateEstrogenReceptorStatusValue(
				estrogenReceptorStatus, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEstrogenReceptorStatusCodeP constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusCodeP(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateEstrogenReceptorStatusCode constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusCode(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateEstrogenReceptorStatusInterpretationCodeP constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusInterpretationCodeP(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusInterpretationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateEstrogenReceptorStatusInterpretationCode constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusInterpretationCode(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateEstrogenReceptorStatusMethodCodeP constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusMethodCodeP(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusMethodCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateEstrogenReceptorStatusMethodCode constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusMethodCode(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEstrogenReceptorStatusValue constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateEstrogenReceptorStatusValue(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateEstrogenReceptorStatusValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Estrogen Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEstrogenReceptorStatus_validateResultObservationTemplateId(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return estrogenReceptorStatus.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus(HER2ReceptorStatus her2ReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(her2ReceptorStatus, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(her2ReceptorStatus, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHER2ReceptorStatus_validateResultObservationTemplateId(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHER2ReceptorStatus_validateHER2ReceptorStatusCodeP(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHER2ReceptorStatus_validateHER2ReceptorStatusCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHER2ReceptorStatus_validateHER2ReceptorStatusInterpretationCode(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHER2ReceptorStatus_validateHER2ReceptorStatusInterpretationCodeP(
				her2ReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateHER2ReceptorStatus_validateHER2ReceptorStatusValue(
				her2ReceptorStatus, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateHER2ReceptorStatusCodeP constraint of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus_validateHER2ReceptorStatusCodeP(HER2ReceptorStatus her2ReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return her2ReceptorStatus.validateHER2ReceptorStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateHER2ReceptorStatusCode constraint of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus_validateHER2ReceptorStatusCode(HER2ReceptorStatus her2ReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return her2ReceptorStatus.validateHER2ReceptorStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateHER2ReceptorStatusInterpretationCodeP constraint of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus_validateHER2ReceptorStatusInterpretationCodeP(
			HER2ReceptorStatus her2ReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return her2ReceptorStatus.validateHER2ReceptorStatusInterpretationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateHER2ReceptorStatusInterpretationCode constraint of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus_validateHER2ReceptorStatusInterpretationCode(
			HER2ReceptorStatus her2ReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return her2ReceptorStatus.validateHER2ReceptorStatusInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateHER2ReceptorStatusValue constraint of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus_validateHER2ReceptorStatusValue(HER2ReceptorStatus her2ReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return her2ReceptorStatus.validateHER2ReceptorStatusValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>HER2 Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHER2ReceptorStatus_validateResultObservationTemplateId(HER2ReceptorStatus her2ReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return her2ReceptorStatus.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositive(NumberofLymphNodesPositive numberofLymphNodesPositive,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberofLymphNodesPositive, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(numberofLymphNodesPositive, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesPositive_validateResultObservationTemplateId(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesPositive_validateNumberofLymphNodesPositiveCodeP(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesPositive_validateNumberofLymphNodesPositiveCode(
				numberofLymphNodesPositive, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesPositive_validateNumberofLymphNodesPositiveValue(
				numberofLymphNodesPositive, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNumberofLymphNodesPositiveCodeP constraint of '<em>Numberof Lymph Nodes Positive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositive_validateNumberofLymphNodesPositiveCodeP(
			NumberofLymphNodesPositive numberofLymphNodesPositive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesPositive.validateNumberofLymphNodesPositiveCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLymphNodesPositiveCode constraint of '<em>Numberof Lymph Nodes Positive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositive_validateNumberofLymphNodesPositiveCode(
			NumberofLymphNodesPositive numberofLymphNodesPositive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesPositive.validateNumberofLymphNodesPositiveCode(diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLymphNodesPositiveValue constraint of '<em>Numberof Lymph Nodes Positive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositive_validateNumberofLymphNodesPositiveValue(
			NumberofLymphNodesPositive numberofLymphNodesPositive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesPositive.validateNumberofLymphNodesPositiveValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Numberof Lymph Nodes Positive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesPositive_validateResultObservationTemplateId(
			NumberofLymphNodesPositive numberofLymphNodesPositive, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesPositive.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExamined(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numberofLymphNodesRemovedandExamined, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(numberofLymphNodesRemovedandExamined, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesRemovedandExamined_validateResultObservationTemplateId(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesRemovedandExamined_validateNumberofLymphNodesRemovedandExaminedCodeP(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesRemovedandExamined_validateNumberofLymphNodesRemovedandExaminedCode(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNumberofLymphNodesRemovedandExamined_validateNumberofLymphNodesRemovedandExaminedValue(
				numberofLymphNodesRemovedandExamined, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateNumberofLymphNodesRemovedandExaminedCodeP constraint of '<em>Numberof Lymph Nodes Removedand Examined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExamined_validateNumberofLymphNodesRemovedandExaminedCodeP(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesRemovedandExamined.validateNumberofLymphNodesRemovedandExaminedCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLymphNodesRemovedandExaminedCode constraint of '<em>Numberof Lymph Nodes Removedand Examined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExamined_validateNumberofLymphNodesRemovedandExaminedCode(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesRemovedandExamined.validateNumberofLymphNodesRemovedandExaminedCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateNumberofLymphNodesRemovedandExaminedValue constraint of '<em>Numberof Lymph Nodes Removedand Examined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExamined_validateNumberofLymphNodesRemovedandExaminedValue(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesRemovedandExamined.validateNumberofLymphNodesRemovedandExaminedValue(
			diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Numberof Lymph Nodes Removedand Examined</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberofLymphNodesRemovedandExamined_validateResultObservationTemplateId(
			NumberofLymphNodesRemovedandExamined numberofLymphNodesRemovedandExamined, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return numberofLymphNodesRemovedandExamined.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgesteroneReceptorStatus(ProgesteroneReceptorStatus progesteroneReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(progesteroneReceptorStatus, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(progesteroneReceptorStatus, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReference(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationReferenceValue(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTextReferenceValue(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCodeValue(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationAuthorMultiplicity(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProgesteroneReceptorStatus_validateResultObservationTemplateId(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationClassCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMoodCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationId(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationText(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationStatusCodeP(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationEffectiveTime(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationValue(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationInterpretationCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationMethodCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultObservation_validateResultObservationTargetSiteCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusInterpretationCode(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusInterpretationCodeP(
				progesteroneReceptorStatus, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusValue(
				progesteroneReceptorStatus, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProgesteroneReceptorStatusCode constraint of '<em>Progesterone Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusCode(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return progesteroneReceptorStatus.validateProgesteroneReceptorStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateProgesteroneReceptorStatusInterpretationCodeP constraint of '<em>Progesterone Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusInterpretationCodeP(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return progesteroneReceptorStatus.validateProgesteroneReceptorStatusInterpretationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateProgesteroneReceptorStatusInterpretationCode constraint of '<em>Progesterone Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusInterpretationCode(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return progesteroneReceptorStatus.validateProgesteroneReceptorStatusInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateProgesteroneReceptorStatusValue constraint of '<em>Progesterone Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgesteroneReceptorStatus_validateProgesteroneReceptorStatusValue(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return progesteroneReceptorStatus.validateProgesteroneReceptorStatusValue(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Progesterone Receptor Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgesteroneReceptorStatus_validateResultObservationTemplateId(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return progesteroneReceptorStatus.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lymphNodeSamplingResultOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(lymphNodeSamplingResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerCodeValue(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCodeValue(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateResultOrganizerTemplateId(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerMoodCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerId(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCodeP(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerResultObservation(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerClassCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerEffectiveTime(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerStatusCodeP(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerStatusCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
				lymphNodeSamplingResultOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerClassCode constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerClassCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerCode constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerEffectiveTime constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerEffectiveTime(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerEffectiveTime(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerStatusCodeP constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerStatusCodeP(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerStatusCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerStatusCode constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerStatusCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerStatusCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerNumberofLymphNodesRemovedandExamined(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerNumberofLymphNodesPositive(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerReferenceExternalDocumentCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRolePlayingEntityCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleId(
			diagnostics, context);
	}

	/**
	 * Validates the validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateLymphNodeSamplingResultOrganizerSpecimenSpecimenRoleSpecimenPlayingEntity(
			diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Lymph Node Sampling Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLymphNodeSamplingResultOrganizer_validateResultOrganizerTemplateId(
			LymphNodeSamplingResultOrganizer lymphNodeSamplingResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lymphNodeSamplingResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizer(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(molecularDiagnosticTestingOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(molecularDiagnosticTestingOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerCodeValue(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCodeValue(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMolecularDiagnosticTestingOrganizer_validateResultOrganizerTemplateId(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCode(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerMoodCode(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerId(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCodeP(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCode(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerCode(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerResultObservation(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMolecularDiagnosticTestingOrganizer_validateMolecularDiagnosticTestingOrganizerCodeP(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMolecularDiagnosticTestingOrganizer_validateMolecularDiagnosticTestingOrganizerCode(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMolecularDiagnosticTestingOrganizer_validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(
				molecularDiagnosticTestingOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMolecularDiagnosticTestingOrganizerCodeP constraint of '<em>Molecular Diagnostic Testing Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizer_validateMolecularDiagnosticTestingOrganizerCodeP(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return molecularDiagnosticTestingOrganizer.validateMolecularDiagnosticTestingOrganizerCodeP(
			diagnostics, context);
	}

	/**
	 * Validates the validateMolecularDiagnosticTestingOrganizerCode constraint of '<em>Molecular Diagnostic Testing Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizer_validateMolecularDiagnosticTestingOrganizerCode(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return molecularDiagnosticTestingOrganizer.validateMolecularDiagnosticTestingOrganizerCode(
			diagnostics, context);
	}

	/**
	 * Validates the validateMolecularDiagnosticTestingOrganizerOncotypeDXScore constraint of '<em>Molecular Diagnostic Testing Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizer_validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return molecularDiagnosticTestingOrganizer.validateMolecularDiagnosticTestingOrganizerOncotypeDXScore(
			diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Molecular Diagnostic Testing Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMolecularDiagnosticTestingOrganizer_validateResultOrganizerTemplateId(
			MolecularDiagnosticTestingOrganizer molecularDiagnosticTestingOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return molecularDiagnosticTestingOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer(ReceptorStatusOrganizer receptorStatusOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(receptorStatusOrganizer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(receptorStatusOrganizer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerCodeValue(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCodeValue(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReceptorStatusOrganizer_validateResultOrganizerTemplateId(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerClassCode(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerMoodCode(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerId(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCodeP(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerStatusCode(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerCode(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultOrganizer_validateResultOrganizerResultObservation(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReceptorStatusOrganizer_validateReceptorStatusOrganizerCodeP(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReceptorStatusOrganizer_validateReceptorStatusOrganizerCode(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReceptorStatusOrganizer_validateReceptorStatusOrganizerEstrogenReceptorStatus(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReceptorStatusOrganizer_validateReceptorStatusOrganizerProgesteroneReceptorStatus(
				receptorStatusOrganizer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReceptorStatusOrganizer_validateReceptorStatusOrganizerHER2ReceptorStatus(
				receptorStatusOrganizer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateReceptorStatusOrganizerCodeP constraint of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer_validateReceptorStatusOrganizerCodeP(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receptorStatusOrganizer.validateReceptorStatusOrganizerCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateReceptorStatusOrganizerCode constraint of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer_validateReceptorStatusOrganizerCode(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receptorStatusOrganizer.validateReceptorStatusOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateReceptorStatusOrganizerEstrogenReceptorStatus constraint of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer_validateReceptorStatusOrganizerEstrogenReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receptorStatusOrganizer.validateReceptorStatusOrganizerEstrogenReceptorStatus(diagnostics, context);
	}

	/**
	 * Validates the validateReceptorStatusOrganizerProgesteroneReceptorStatus constraint of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer_validateReceptorStatusOrganizerProgesteroneReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receptorStatusOrganizer.validateReceptorStatusOrganizerProgesteroneReceptorStatus(diagnostics, context);
	}

	/**
	 * Validates the validateReceptorStatusOrganizerHER2ReceptorStatus constraint of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer_validateReceptorStatusOrganizerHER2ReceptorStatus(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receptorStatusOrganizer.validateReceptorStatusOrganizerHER2ReceptorStatus(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Receptor Status Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceptorStatusOrganizer_validateResultOrganizerTemplateId(
			ReceptorStatusOrganizer receptorStatusOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receptorStatusOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeight(BodyHeight bodyHeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bodyHeight, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(bodyHeight, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTextReference(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationReferenceValue(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTextReferenceValue(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyHeight_validateVitalSignObservationTemplateId(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationClassCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationMoodCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationId(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationCodeP(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationStatusCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationStatusCodeP(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationEffectiveTime(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationValue(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationInterpretationCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationMethodCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationText(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationAuthor(
				bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyHeight_validateBodyHeightCodeP(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyHeight_validateBodyHeightCode(bodyHeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyHeight_validateBodyHeightValue(bodyHeight, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBodyHeightCodeP constraint of '<em>Body Height</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeight_validateBodyHeightCodeP(BodyHeight bodyHeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bodyHeight.validateBodyHeightCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBodyHeightCode constraint of '<em>Body Height</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeight_validateBodyHeightCode(BodyHeight bodyHeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bodyHeight.validateBodyHeightCode(diagnostics, context);
	}

	/**
	 * Validates the validateBodyHeightValue constraint of '<em>Body Height</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeight_validateBodyHeightValue(BodyHeight bodyHeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bodyHeight.validateBodyHeightValue(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationTemplateId constraint of '<em>Body Height</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyHeight_validateVitalSignObservationTemplateId(BodyHeight bodyHeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bodyHeight.validateVitalSignObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceArea(BodySurfaceArea bodySurfaceArea, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bodySurfaceArea, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(bodySurfaceArea, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTextReference(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationReferenceValue(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTextReferenceValue(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodySurfaceArea_validateVitalSignObservationTemplateId(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationClassCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationMoodCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationId(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationCodeP(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationStatusCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationStatusCodeP(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationEffectiveTime(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationValue(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationInterpretationCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationMethodCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationText(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationAuthor(
				bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodySurfaceArea_validateBodySurfaceAreaCodeP(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodySurfaceArea_validateBodySurfaceAreaCode(bodySurfaceArea, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodySurfaceArea_validateBodySurfaceAreaValue(bodySurfaceArea, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBodySurfaceAreaCodeP constraint of '<em>Body Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceArea_validateBodySurfaceAreaCodeP(BodySurfaceArea bodySurfaceArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bodySurfaceArea.validateBodySurfaceAreaCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBodySurfaceAreaCode constraint of '<em>Body Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceArea_validateBodySurfaceAreaCode(BodySurfaceArea bodySurfaceArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bodySurfaceArea.validateBodySurfaceAreaCode(diagnostics, context);
	}

	/**
	 * Validates the validateBodySurfaceAreaValue constraint of '<em>Body Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceArea_validateBodySurfaceAreaValue(BodySurfaceArea bodySurfaceArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bodySurfaceArea.validateBodySurfaceAreaValue(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationTemplateId constraint of '<em>Body Surface Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodySurfaceArea_validateVitalSignObservationTemplateId(BodySurfaceArea bodySurfaceArea,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bodySurfaceArea.validateVitalSignObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyWeight(BodyWeight bodyWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bodyWeight, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(bodyWeight, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTextReference(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationReferenceValue(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTextReferenceValue(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyWeight_validateVitalSignObservationTemplateId(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationClassCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationMoodCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationId(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationCodeP(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationStatusCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationStatusCodeP(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationEffectiveTime(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationValue(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationInterpretationCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationMethodCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationText(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignObservation_validateVitalSignObservationAuthor(
				bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyWeight_validateBodyWeightCodeP(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyWeight_validateBodyWeightCode(bodyWeight, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBodyWeight_validateBodyWeightValue(bodyWeight, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBodyWeightCodeP constraint of '<em>Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyWeight_validateBodyWeightCodeP(BodyWeight bodyWeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bodyWeight.validateBodyWeightCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateBodyWeightCode constraint of '<em>Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyWeight_validateBodyWeightCode(BodyWeight bodyWeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bodyWeight.validateBodyWeightCode(diagnostics, context);
	}

	/**
	 * Validates the validateBodyWeightValue constraint of '<em>Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyWeight_validateBodyWeightValue(BodyWeight bodyWeight, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return bodyWeight.validateBodyWeightValue(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationTemplateId constraint of '<em>Body Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyWeight_validateVitalSignObservationTemplateId(BodyWeight bodyWeight,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bodyWeight.validateVitalSignObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionBCTPS(EncountersSectionBCTPS encountersSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(encountersSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSectionBCTPS_validateEncountersSectionEntriesOptionalTemplateId(
				encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalCode(
				encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalCodeP(
				encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalTitle(
				encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalText(
				encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateEncountersSectionEntriesOptional_validateEncountersSectionEntriesOptionalEncounterActivities(
				encountersSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncountersSectionBCTPS_validateEncountersSectionBCTPSHospitalizationWithReason(
				encountersSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateEncountersSectionBCTPSHospitalizationWithReason constraint of '<em>Encounters Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionBCTPS_validateEncountersSectionBCTPSHospitalizationWithReason(
			EncountersSectionBCTPS encountersSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSectionBCTPS.validateEncountersSectionBCTPSHospitalizationWithReason(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionEntriesOptionalTemplateId constraint of '<em>Encounters Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionBCTPS_validateEncountersSectionEntriesOptionalTemplateId(
			EncountersSectionBCTPS encountersSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSectionBCTPS.validateEncountersSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPS(FamilyHistorySectionBCTPS familyHistorySectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistorySectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(familyHistorySectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionTemplateId(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFamilyHistorySection_validateFamilyHistorySectionCode(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFamilyHistorySection_validateFamilyHistorySectionCodeP(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFamilyHistorySection_validateFamilyHistorySectionTitle(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFamilyHistorySection_validateFamilyHistorySectionText(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFamilyHistorySection_validateFamilyHistorySectionFamilyHistory(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(
				familyHistorySectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone constraint of '<em>Family History Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistorySectionBCTPS.validateFamilyHistorySectionBCTPSFamilyHistoryofCancerNone(
			diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionBCTPSFamilyHistoryPedigree constraint of '<em>Family History Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistorySectionBCTPS.validateFamilyHistorySectionBCTPSFamilyHistoryPedigree(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer constraint of '<em>Family History Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistorySectionBCTPS.validateFamilyHistorySectionBCTPSFamilyHistoryOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionTemplateId constraint of '<em>Family History Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySectionBCTPS_validateFamilyHistorySectionTemplateId(
			FamilyHistorySectionBCTPS familyHistorySectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return familyHistorySectionBCTPS.validateFamilyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionBCTPS(FunctionalStatusSectionBCTPS functionalStatusSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateFunctionalStatusSectionBCTPS_validateFunctionalStatusSectionTemplateId(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCode(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionText(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionFunctionalStatusResultOrganizer(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCognitiveStatusResultOrganizer(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionFunctionalStatusResultObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCognitiveStatusResultObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionFunctionalStatusProblemObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCognitiveStatusProblemObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCaregiverCharacteristics(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionAssessmentScaleObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionNonMedicinalSupplyActivity(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionPressureUlcerObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionNumberOfPressureUlcersObservation(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionHighestPressureUlcerStage(
				functionalStatusSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateFunctionalStatusSectionTemplateId constraint of '<em>Functional Status Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionBCTPS_validateFunctionalStatusSectionTemplateId(
			FunctionalStatusSectionBCTPS functionalStatusSectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return functionalStatusSectionBCTPS.validateFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPS(MedicationsSectionBCTPS medicationsSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(medicationsSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSectionBCTPS_validateMedicationsSectionEntriesOptionalTemplateId(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalCode(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalTitle(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalText(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalMedicationActivity(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSection_validateMedicationsSectionCode(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSection_validateMedicationsSectionTitle(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSection_validateMedicationsSectionText(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateMedicationsSection_validateMedicationsSectionMedication(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSectionBCTPS_validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSectionBCTPS_validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(
				medicationsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMedicationsSectionBCTPS_validateMedicationsSectionBCTPSChemotherapyMedicationActivity(
				medicationsSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose constraint of '<em>Medications Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPS_validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSectionBCTPS.validateMedicationsSectionBCTPSAnthracyclinesLifetimeDose(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued constraint of '<em>Medications Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPS_validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSectionBCTPS.validateMedicationsSectionBCTPSChemotherapeuticDrugTherapyDiscontinued(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionBCTPSChemotherapyMedicationActivity constraint of '<em>Medications Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPS_validateMedicationsSectionBCTPSChemotherapyMedicationActivity(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSectionBCTPS.validateMedicationsSectionBCTPSChemotherapyMedicationActivity(
			diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionEntriesOptionalTemplateId constraint of '<em>Medications Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSectionBCTPS_validateMedicationsSectionEntriesOptionalTemplateId(
			MedicationsSectionBCTPS medicationsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSectionBCTPS.validateMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareSectionBCTPS(PlanofCareSectionBCTPS planofCareSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planofCareSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planofCareSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareSectionBCTPS_validatePlanOfCareSectionTemplateId(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionCodeP(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionTitle(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(
				planofCareSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionInstructions(
				planofCareSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanOfCareSectionTemplateId constraint of '<em>Planof Care Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareSectionBCTPS_validatePlanOfCareSectionTemplateId(
			PlanofCareSectionBCTPS planofCareSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planofCareSectionBCTPS.validatePlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareRadiationActivity(PlanofCareRadiationActivity planofCareRadiationActivity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planofCareRadiationActivity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(planofCareRadiationActivity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareRadiationActivity_validatePlanOfCareActivityActTemplateId(
				planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivityAct_validatePlanOfCareActivityActClassCode(
				planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCode(
				planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validatePlanOfCareActivityAct_validatePlanOfCareActivityActId(
				planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareRadiationActivity_validatePlanofCareRadiationActivityCode(
				planofCareRadiationActivity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlanofCareRadiationActivity_validatePlanofCareRadiationActivityMoodCode(
				planofCareRadiationActivity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlanofCareRadiationActivityCode constraint of '<em>Planof Care Radiation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareRadiationActivity_validatePlanofCareRadiationActivityCode(
			PlanofCareRadiationActivity planofCareRadiationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planofCareRadiationActivity.validatePlanofCareRadiationActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlanofCareRadiationActivityMoodCode constraint of '<em>Planof Care Radiation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareRadiationActivity_validatePlanofCareRadiationActivityMoodCode(
			PlanofCareRadiationActivity planofCareRadiationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planofCareRadiationActivity.validatePlanofCareRadiationActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActTemplateId constraint of '<em>Planof Care Radiation Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanofCareRadiationActivity_validatePlanOfCareActivityActTemplateId(
			PlanofCareRadiationActivity planofCareRadiationActivity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return planofCareRadiationActivity.validatePlanOfCareActivityActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionBCTPS(ProblemSectionBCTPS problemSectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(problemSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSectionBCTPS_validateProblemSectionEntriesOptionalTemplateId(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemSectionEntriesOptional_validateProblemSectionEntriesOptionalCode(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemSectionEntriesOptional_validateProblemSectionEntriesOptionalCodeP(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemSectionEntriesOptional_validateProblemSectionEntriesOptionalTitle(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemSectionEntriesOptional_validateProblemSectionEntriesOptionalText(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProblemSectionEntriesOptional_validateProblemSectionEntriesOptionalProblemConcern(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSectionBCTPS_validateProblemSectionBCTPSBreastCancerConcernAct(
				problemSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProblemSectionBCTPS_validateProblemSectionBCTPSLastMenstrualPeriod(
				problemSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProblemSectionBCTPSBreastCancerConcernAct constraint of '<em>Problem Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionBCTPS_validateProblemSectionBCTPSBreastCancerConcernAct(
			ProblemSectionBCTPS problemSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSectionBCTPS.validateProblemSectionBCTPSBreastCancerConcernAct(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionBCTPSLastMenstrualPeriod constraint of '<em>Problem Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionBCTPS_validateProblemSectionBCTPSLastMenstrualPeriod(
			ProblemSectionBCTPS problemSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSectionBCTPS.validateProblemSectionBCTPSLastMenstrualPeriod(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionEntriesOptionalTemplateId constraint of '<em>Problem Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSectionBCTPS_validateProblemSectionEntriesOptionalTemplateId(
			ProblemSectionBCTPS problemSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSectionBCTPS.validateProblemSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionBCTPS(ProceduresSectionBCTPS proceduresSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(proceduresSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(proceduresSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSectionBCTPS_validateProceduresSectionEntriesOptionalTemplateId(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalCode(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalCodeP(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalTitle(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalText(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalProcedureActivityProcedure(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalProcedureActivityObservation(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateProceduresSectionEntriesOptional_validateProceduresSectionEntriesOptionalProcedureActivityAct(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSectionBCTPS_validateProceduresSectionBCTPSBreastCancerProcedures(
				proceduresSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProceduresSectionBCTPS_validateProceduresSectionBCTPSRadiationTherapyCareCompleted(
				proceduresSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateProceduresSectionBCTPSBreastCancerProcedures constraint of '<em>Procedures Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionBCTPS_validateProceduresSectionBCTPSBreastCancerProcedures(
			ProceduresSectionBCTPS proceduresSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSectionBCTPS.validateProceduresSectionBCTPSBreastCancerProcedures(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionBCTPSRadiationTherapyCareCompleted constraint of '<em>Procedures Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionBCTPS_validateProceduresSectionBCTPSRadiationTherapyCareCompleted(
			ProceduresSectionBCTPS proceduresSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSectionBCTPS.validateProceduresSectionBCTPSRadiationTherapyCareCompleted(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionEntriesOptionalTemplateId constraint of '<em>Procedures Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionBCTPS_validateProceduresSectionEntriesOptionalTemplateId(
			ProceduresSectionBCTPS proceduresSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSectionBCTPS.validateProceduresSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSectionBCTPS(ResultsSectionBCTPS resultsSectionBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultsSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(resultsSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResultsSectionBCTPS_validateResultsSectionEntriesOptionalTemplateId(
				resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalCode(
				resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalCodeP(
				resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalTitle(
				resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalText(
				resultsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateResultsSectionEntriesOptional_validateResultsSectionEntriesOptionalResultOrganizer(
				resultsSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateResultsSectionEntriesOptionalTemplateId constraint of '<em>Results Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSectionBCTPS_validateResultsSectionEntriesOptionalTemplateId(
			ResultsSectionBCTPS resultsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSectionBCTPS.validateResultsSectionEntriesOptionalTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSectionBCTPS(VitalSignsSectionBCTPS vitalSignsSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsSectionBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSectionBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateClassCode(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateSection_validateMoodCode(vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsSectionEntriesOptional_validateVitalSignsSectionEntriesOptionalTemplateId(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsSectionEntriesOptional_validateVitalSignsSectionEntriesOptionalCode(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsSectionEntriesOptional_validateVitalSignsSectionEntriesOptionalCodeP(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsSectionEntriesOptional_validateVitalSignsSectionEntriesOptionalTitle(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsSectionEntriesOptional_validateVitalSignsSectionEntriesOptionalText(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsSectionEntriesOptional_validateVitalSignsSectionEntriesOptionalVitalSignsOrganizer(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSectionBCTPS_validateVitalSignsSectionBCTPSTemplateId(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsSectionBCTPS_validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(
				vitalSignsSectionBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignsSectionBCTPSTemplateId constraint of '<em>Vital Signs Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSectionBCTPS_validateVitalSignsSectionBCTPSTemplateId(
			VitalSignsSectionBCTPS vitalSignsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSectionBCTPS.validateVitalSignsSectionBCTPSTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS constraint of '<em>Vital Signs Section BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSectionBCTPS_validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(
			VitalSignsSectionBCTPS vitalSignsSectionBCTPS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSectionBCTPS.validateVitalSignsSectionBCTPSVitalSignsOrganizerBCTPS(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPS(VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsOrganizerBCTPS, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizerBCTPS, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerTemplateId(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerClassCode(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerMoodCode(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerId(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerCode(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerCodeP(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerStatusCodeP(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerStatusCode(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerEffectiveTime(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerVitalSignObservation(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerBCTPSBodyHeight(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerBCTPSBodyWeight(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerBCTPSBodySurfaceArea(
				vitalSignsOrganizerBCTPS, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateVitalSignsOrganizerBCTPSBodyHeight constraint of '<em>Vital Signs Organizer BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerBCTPSBodyHeight(
			VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsOrganizerBCTPS.validateVitalSignsOrganizerBCTPSBodyHeight(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerBCTPSBodyWeight constraint of '<em>Vital Signs Organizer BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerBCTPSBodyWeight(
			VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsOrganizerBCTPS.validateVitalSignsOrganizerBCTPSBodyWeight(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerBCTPSBodySurfaceArea constraint of '<em>Vital Signs Organizer BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerBCTPSBodySurfaceArea(
			VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsOrganizerBCTPS.validateVitalSignsOrganizerBCTPSBodySurfaceArea(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsOrganizerTemplateId constraint of '<em>Vital Signs Organizer BCTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizerBCTPS_validateVitalSignsOrganizerTemplateId(
			VitalSignsOrganizerBCTPS vitalSignsOrganizerBCTPS, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return vitalSignsOrganizerBCTPS.validateVitalSignsOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clinicalOncologyTreatmentPlanandSummary, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(
			clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateClassCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= cdaValidator.validateClinicalDocument_validateMoodCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdRoot(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdVersionNumber(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumberSetId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateGeneralHeaderConstraintsTemplateId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOf(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorization(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheDayTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheMinuteTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorGeneralHeaderConstraintsUSRealmDateAndTimeDTMPreciseToTheSecondTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorGeneralHeaderConstraintsUSRealmDateAndTimeDTMIfMorePreciseThanDayIncludeTimeZoneOffsetTS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentId(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorizationConsent(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(
				clinicalOncologyTreatmentPlanandSummary, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryAllergiesSectionEntriesOptional(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryMedicationsSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2 constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryFamilyHistorySectionBCTPS2(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryProblemSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryProceduresSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryResultsSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryVitalSignsSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryPlanofCareSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryFunctionalStatusSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateClinicalOncologyTreatmentPlanandSummaryEncountersSectionBCTPS(
			diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Clinical Oncology Treatment Planand Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalOncologyTreatmentPlanandSummary_validateGeneralHeaderConstraintsTemplateId(
			ClinicalOncologyTreatmentPlanandSummary clinicalOncologyTreatmentPlanandSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalOncologyTreatmentPlanandSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CLONDATAPlugin.INSTANCE;
	}

} // CLONDATAValidator
