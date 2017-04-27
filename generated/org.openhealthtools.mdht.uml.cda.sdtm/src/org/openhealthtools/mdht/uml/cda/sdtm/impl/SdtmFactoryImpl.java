/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication;
import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.DeathRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.DoseAdjustmentReason;
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.EventDuration;
import org.openhealthtools.mdht.uml.cda.sdtm.EventOutcome;
import org.openhealthtools.mdht.uml.cda.sdtm.EventPattern;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.EventorFindingSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.Indication;
import org.openhealthtools.mdht.uml.cda.sdtm.IntendedRegimen;
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification;
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentSection;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.PositionofSubject;
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SeriousEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.StartRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StopRelativetoReferencePeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTreatmentCausality;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool;
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.Toxicity;
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdtmFactoryImpl extends EFactoryImpl implements SdtmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SdtmFactory init() {
		try {
			SdtmFactory theSdtmFactory = (SdtmFactory)EPackage.Registry.INSTANCE.getEFactory(SdtmPackage.eNS_URI);
			if (theSdtmFactory != null) {
				return theSdtmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SdtmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdtmFactoryImpl() {
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
			case SdtmPackage.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS: return createSubjectDataHumanClinicalTrials();
			case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_SECTION: return createHumanClinicalSubjectDataDocumentSection();
			case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS: return createHumanClinicalSubjectDemographics();
			case SdtmPackage.DATA_COLLECTION: return createDataCollection();
			case SdtmPackage.EVENT_STUDY_DAY: return createEventStudyDay();
			case SdtmPackage.STUDY_ARM: return createStudyArm();
			case SdtmPackage.COMMENT: return createComment();
			case SdtmPackage.DOMAIN_ASSIGNMENT: return createDomainAssignment();
			case SdtmPackage.RELATED_RECORD: return createRelatedRecord();
			case SdtmPackage.SUPPLEMENTAL_VALUE: return createSupplementalValue();
			case SdtmPackage.REFERENCE_PERIOD: return createReferencePeriod();
			case SdtmPackage.FINDING_ABOUT: return createFindingAbout();
			case SdtmPackage.GROUP_IDENTIFIER: return createGroupIdentifier();
			case SdtmPackage.NON_PERFORMANCE_REASON: return createNonPerformanceReason();
			case SdtmPackage.CATEGORY: return createCategory();
			case SdtmPackage.SUB_CATEGORY: return createSubCategory();
			case SdtmPackage.VISIT: return createVisit();
			case SdtmPackage.VITAL_SIGN: return createVitalSign();
			case SdtmPackage.TIMING_REFERENCE: return createTimingReference();
			case SdtmPackage.PLANNED_STUDY_DAY: return createPlannedStudyDay();
			case SdtmPackage.STUDY_DAY_PERIOD: return createStudyDayPeriod();
			case SdtmPackage.EXCLUSION_REASON: return createExclusionReason();
			case SdtmPackage.POSITIONOF_SUBJECT: return createPositionofSubject();
			case SdtmPackage.ECG_TEST_RESULT: return createECGTestResult();
			case SdtmPackage.PHYSICAL_EXAMINATION_FINDING: return createPhysicalExaminationFinding();
			case SdtmPackage.BODY_SYSTEMOR_ORGAN_CLASS: return createBodySystemorOrganClass();
			case SdtmPackage.MICROBIOLOGY_SPECIMEN_FINDING: return createMicrobiologySpecimenFinding();
			case SdtmPackage.SPECIMEN_INFORMATION: return createSpecimenInformation();
			case SdtmPackage.RESULT_CATEGORY: return createResultCategory();
			case SdtmPackage.MICROBIOLOGY_SUSCEPTIBILITY: return createMicrobiologySusceptibility();
			case SdtmPackage.PHARMACOKINETIC_CONCENTRATION_FINDING: return createPharmacokineticConcentrationFinding();
			case SdtmPackage.FASTING_STATUS: return createFastingStatus();
			case SdtmPackage.ASSAY_QUANTITATION: return createAssayQuantitation();
			case SdtmPackage.DRUG_ACCOUNTABILITY: return createDrugAccountability();
			case SdtmPackage.HUMAN_CLINICAL_LABORATORY_TEST_RESULT: return createHumanClinicalLaboratoryTestResult();
			case SdtmPackage.TOXICITY: return createToxicity();
			case SdtmPackage.QUESTIONNAIRE_FINDING: return createQuestionnaireFinding();
			case SdtmPackage.PHARMACOKINETIC_PARAMETER_FINDING: return createPharmacokineticParameterFinding();
			case SdtmPackage.SUBJECT_ELEMENT: return createSubjectElement();
			case SdtmPackage.STUDY_EPOCH: return createStudyEpoch();
			case SdtmPackage.HUMAN_CLINICAL_DISPOSITION: return createHumanClinicalDisposition();
			case SdtmPackage.MEDICAL_HISTORY_ITEM: return createMedicalHistoryItem();
			case SdtmPackage.PRE_SPECIFIED_EVENT: return createPreSpecifiedEvent();
			case SdtmPackage.START_RELATIVETO_REFERENCE_PERIOD: return createStartRelativetoReferencePeriod();
			case SdtmPackage.STOP_RELATIVETO_REFERENCE_PERIOD: return createStopRelativetoReferencePeriod();
			case SdtmPackage.PROTOCOL_DEVIATION: return createProtocolDeviation();
			case SdtmPackage.CLINICAL_EVENT: return createClinicalEvent();
			case SdtmPackage.EVENTOR_FINDING_SEVERITY: return createEventorFindingSeverity();
			case SdtmPackage.SUBJECT_CHARACTERISTIC: return createSubjectCharacteristic();
			case SdtmPackage.STUDY_SUBJECT_EVENT: return createStudySubjectEvent();
			case SdtmPackage.SERIOUS_EVENT: return createSeriousEvent();
			case SdtmPackage.STUDY_TREATMENT_ACTION_TAKEN: return createStudyTreatmentActionTaken();
			case SdtmPackage.OTHER_TREATMENT_ACTION_TAKEN: return createOtherTreatmentActionTaken();
			case SdtmPackage.STUDY_TREATMENT_CAUSALITY: return createStudyTreatmentCausality();
			case SdtmPackage.NON_STUDY_TREATMENT_RELATIONSHIP: return createNonStudyTreatmentRelationship();
			case SdtmPackage.EVENT_PATTERN: return createEventPattern();
			case SdtmPackage.EVENT_OUTCOME: return createEventOutcome();
			case SdtmPackage.CONCOMITANT_TREATMENT: return createConcomitantTreatment();
			case SdtmPackage.EVENT_DURATION: return createEventDuration();
			case SdtmPackage.STUDY_SUBJECT_FINDING: return createStudySubjectFinding();
			case SdtmPackage.DEATH_RELATIONSHIP: return createDeathRelationship();
			case SdtmPackage.STUDY_SUBJECT_INTERVENTION: return createStudySubjectIntervention();
			case SdtmPackage.INDICATION: return createIndication();
			case SdtmPackage.INTENDED_REGIMEN: return createIntendedRegimen();
			case SdtmPackage.DOSE_ADJUSTMENT_REASON: return createDoseAdjustmentReason();
			case SdtmPackage.ADVERSE_EVENT: return createAdverseEvent();
			case SdtmPackage.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET: return createInclusionorExclusionCriteriaNotMet();
			case SdtmPackage.CONCOMITANT_MEDICATION: return createConcomitantMedication();
			case SdtmPackage.CONSUMABLE_MATERIAL: return createConsumableMaterial();
			case SdtmPackage.HUMAN_CLINICAL_EXPOSURE: return createHumanClinicalExposure();
			case SdtmPackage.SUBSTANCE_USE: return createSubstanceUse();
			case SdtmPackage.NONHUMAN_LABORATORY_TEST_RESULT: return createNonhumanLaboratoryTestResult();
			case SdtmPackage.STUDY_TEST_ORGANIZATION: return createStudyTestOrganization();
			case SdtmPackage.STUDY_FINDING_EVALUATOR: return createStudyFindingEvaluator();
			case SdtmPackage.SUBJECT_DATA_NON_CLINICAL_TRIALS: return createSubjectDataNonClinicalTrials();
			case SdtmPackage.NONHUMAN_SUBJECT_DATA_DOCUMENT_SECTION: return createNonhumanSubjectDataDocumentSection();
			case SdtmPackage.NONHUMAN_SUBJECT_DEMOGRAPHICS: return createNonhumanSubjectDemographics();
			case SdtmPackage.NONHUMAN_DISPOSITION: return createNonhumanDisposition();
			case SdtmPackage.NONHUMAN_EXPOSURE: return createNonhumanExposure();
			case SdtmPackage.BODY_WEIGHT: return createBodyWeight();
			case SdtmPackage.BODY_WEIGHT_GAIN: return createBodyWeightGain();
			case SdtmPackage.CLINICAL_OBSERVATION: return createClinicalObservation();
			case SdtmPackage.DEATH_DIAGNOSIS: return createDeathDiagnosis();
			case SdtmPackage.FOODAND_WATER_CONSUMPTION: return createFoodandWaterConsumption();
			case SdtmPackage.MACROSCOPIC_FINDING: return createMacroscopicFinding();
			case SdtmPackage.MICROSCOPIC_FINDING: return createMicroscopicFinding();
			case SdtmPackage.ORGAN_MEASUREMENT: return createOrganMeasurement();
			case SdtmPackage.PALPABLE_MASS: return createPalpableMass();
			case SdtmPackage.TUMOR_FINDING: return createTumorFinding();
			case SdtmPackage.SUBJECT_POOL: return createSubjectPool();
			case SdtmPackage.MASS_IDENTIFICATION: return createMassIdentification();
			case SdtmPackage.REFERENCE_RANGE: return createReferenceRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectDataHumanClinicalTrials createSubjectDataHumanClinicalTrials() {
		SubjectDataHumanClinicalTrialsImpl subjectDataHumanClinicalTrials = new SubjectDataHumanClinicalTrialsImpl();
		return subjectDataHumanClinicalTrials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalSubjectDataDocumentSection createHumanClinicalSubjectDataDocumentSection() {
		HumanClinicalSubjectDataDocumentSectionImpl humanClinicalSubjectDataDocumentSection = new HumanClinicalSubjectDataDocumentSectionImpl();
		return humanClinicalSubjectDataDocumentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalSubjectDemographics createHumanClinicalSubjectDemographics() {
		HumanClinicalSubjectDemographicsImpl humanClinicalSubjectDemographics = new HumanClinicalSubjectDemographicsImpl();
		return humanClinicalSubjectDemographics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCollection createDataCollection() {
		DataCollectionImpl dataCollection = new DataCollectionImpl();
		return dataCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventStudyDay createEventStudyDay() {
		EventStudyDayImpl eventStudyDay = new EventStudyDayImpl();
		return eventStudyDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyArm createStudyArm() {
		StudyArmImpl studyArm = new StudyArmImpl();
		return studyArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment createDomainAssignment() {
		DomainAssignmentImpl domainAssignment = new DomainAssignmentImpl();
		return domainAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedRecord createRelatedRecord() {
		RelatedRecordImpl relatedRecord = new RelatedRecordImpl();
		return relatedRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplementalValue createSupplementalValue() {
		SupplementalValueImpl supplementalValue = new SupplementalValueImpl();
		return supplementalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencePeriod createReferencePeriod() {
		ReferencePeriodImpl referencePeriod = new ReferencePeriodImpl();
		return referencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingAbout createFindingAbout() {
		FindingAboutImpl findingAbout = new FindingAboutImpl();
		return findingAbout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupIdentifier createGroupIdentifier() {
		GroupIdentifierImpl groupIdentifier = new GroupIdentifierImpl();
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonPerformanceReason createNonPerformanceReason() {
		NonPerformanceReasonImpl nonPerformanceReason = new NonPerformanceReasonImpl();
		return nonPerformanceReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubCategory createSubCategory() {
		SubCategoryImpl subCategory = new SubCategoryImpl();
		return subCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visit createVisit() {
		VisitImpl visit = new VisitImpl();
		return visit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSign createVitalSign() {
		VitalSignImpl vitalSign = new VitalSignImpl();
		return vitalSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingReference createTimingReference() {
		TimingReferenceImpl timingReference = new TimingReferenceImpl();
		return timingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedStudyDay createPlannedStudyDay() {
		PlannedStudyDayImpl plannedStudyDay = new PlannedStudyDayImpl();
		return plannedStudyDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyDayPeriod createStudyDayPeriod() {
		StudyDayPeriodImpl studyDayPeriod = new StudyDayPeriodImpl();
		return studyDayPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExclusionReason createExclusionReason() {
		ExclusionReasonImpl exclusionReason = new ExclusionReasonImpl();
		return exclusionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionofSubject createPositionofSubject() {
		PositionofSubjectImpl positionofSubject = new PositionofSubjectImpl();
		return positionofSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECGTestResult createECGTestResult() {
		ECGTestResultImpl ecgTestResult = new ECGTestResultImpl();
		return ecgTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExaminationFinding createPhysicalExaminationFinding() {
		PhysicalExaminationFindingImpl physicalExaminationFinding = new PhysicalExaminationFindingImpl();
		return physicalExaminationFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodySystemorOrganClass createBodySystemorOrganClass() {
		BodySystemorOrganClassImpl bodySystemorOrganClass = new BodySystemorOrganClassImpl();
		return bodySystemorOrganClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobiologySpecimenFinding createMicrobiologySpecimenFinding() {
		MicrobiologySpecimenFindingImpl microbiologySpecimenFinding = new MicrobiologySpecimenFindingImpl();
		return microbiologySpecimenFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecimenInformation createSpecimenInformation() {
		SpecimenInformationImpl specimenInformation = new SpecimenInformationImpl();
		return specimenInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultCategory createResultCategory() {
		ResultCategoryImpl resultCategory = new ResultCategoryImpl();
		return resultCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobiologySusceptibility createMicrobiologySusceptibility() {
		MicrobiologySusceptibilityImpl microbiologySusceptibility = new MicrobiologySusceptibilityImpl();
		return microbiologySusceptibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PharmacokineticConcentrationFinding createPharmacokineticConcentrationFinding() {
		PharmacokineticConcentrationFindingImpl pharmacokineticConcentrationFinding = new PharmacokineticConcentrationFindingImpl();
		return pharmacokineticConcentrationFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FastingStatus createFastingStatus() {
		FastingStatusImpl fastingStatus = new FastingStatusImpl();
		return fastingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssayQuantitation createAssayQuantitation() {
		AssayQuantitationImpl assayQuantitation = new AssayQuantitationImpl();
		return assayQuantitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DrugAccountability createDrugAccountability() {
		DrugAccountabilityImpl drugAccountability = new DrugAccountabilityImpl();
		return drugAccountability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalLaboratoryTestResult createHumanClinicalLaboratoryTestResult() {
		HumanClinicalLaboratoryTestResultImpl humanClinicalLaboratoryTestResult = new HumanClinicalLaboratoryTestResultImpl();
		return humanClinicalLaboratoryTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toxicity createToxicity() {
		ToxicityImpl toxicity = new ToxicityImpl();
		return toxicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionnaireFinding createQuestionnaireFinding() {
		QuestionnaireFindingImpl questionnaireFinding = new QuestionnaireFindingImpl();
		return questionnaireFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PharmacokineticParameterFinding createPharmacokineticParameterFinding() {
		PharmacokineticParameterFindingImpl pharmacokineticParameterFinding = new PharmacokineticParameterFindingImpl();
		return pharmacokineticParameterFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectElement createSubjectElement() {
		SubjectElementImpl subjectElement = new SubjectElementImpl();
		return subjectElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyEpoch createStudyEpoch() {
		StudyEpochImpl studyEpoch = new StudyEpochImpl();
		return studyEpoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalDisposition createHumanClinicalDisposition() {
		HumanClinicalDispositionImpl humanClinicalDisposition = new HumanClinicalDispositionImpl();
		return humanClinicalDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalHistoryItem createMedicalHistoryItem() {
		MedicalHistoryItemImpl medicalHistoryItem = new MedicalHistoryItemImpl();
		return medicalHistoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreSpecifiedEvent createPreSpecifiedEvent() {
		PreSpecifiedEventImpl preSpecifiedEvent = new PreSpecifiedEventImpl();
		return preSpecifiedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartRelativetoReferencePeriod createStartRelativetoReferencePeriod() {
		StartRelativetoReferencePeriodImpl startRelativetoReferencePeriod = new StartRelativetoReferencePeriodImpl();
		return startRelativetoReferencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StopRelativetoReferencePeriod createStopRelativetoReferencePeriod() {
		StopRelativetoReferencePeriodImpl stopRelativetoReferencePeriod = new StopRelativetoReferencePeriodImpl();
		return stopRelativetoReferencePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolDeviation createProtocolDeviation() {
		ProtocolDeviationImpl protocolDeviation = new ProtocolDeviationImpl();
		return protocolDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalEvent createClinicalEvent() {
		ClinicalEventImpl clinicalEvent = new ClinicalEventImpl();
		return clinicalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventorFindingSeverity createEventorFindingSeverity() {
		EventorFindingSeverityImpl eventorFindingSeverity = new EventorFindingSeverityImpl();
		return eventorFindingSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectCharacteristic createSubjectCharacteristic() {
		SubjectCharacteristicImpl subjectCharacteristic = new SubjectCharacteristicImpl();
		return subjectCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudySubjectEvent createStudySubjectEvent() {
		StudySubjectEventImpl studySubjectEvent = new StudySubjectEventImpl();
		return studySubjectEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeriousEvent createSeriousEvent() {
		SeriousEventImpl seriousEvent = new SeriousEventImpl();
		return seriousEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentActionTaken createStudyTreatmentActionTaken() {
		StudyTreatmentActionTakenImpl studyTreatmentActionTaken = new StudyTreatmentActionTakenImpl();
		return studyTreatmentActionTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OtherTreatmentActionTaken createOtherTreatmentActionTaken() {
		OtherTreatmentActionTakenImpl otherTreatmentActionTaken = new OtherTreatmentActionTakenImpl();
		return otherTreatmentActionTaken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTreatmentCausality createStudyTreatmentCausality() {
		StudyTreatmentCausalityImpl studyTreatmentCausality = new StudyTreatmentCausalityImpl();
		return studyTreatmentCausality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonStudyTreatmentRelationship createNonStudyTreatmentRelationship() {
		NonStudyTreatmentRelationshipImpl nonStudyTreatmentRelationship = new NonStudyTreatmentRelationshipImpl();
		return nonStudyTreatmentRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventPattern createEventPattern() {
		EventPatternImpl eventPattern = new EventPatternImpl();
		return eventPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventOutcome createEventOutcome() {
		EventOutcomeImpl eventOutcome = new EventOutcomeImpl();
		return eventOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcomitantTreatment createConcomitantTreatment() {
		ConcomitantTreatmentImpl concomitantTreatment = new ConcomitantTreatmentImpl();
		return concomitantTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventDuration createEventDuration() {
		EventDurationImpl eventDuration = new EventDurationImpl();
		return eventDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudySubjectFinding createStudySubjectFinding() {
		StudySubjectFindingImpl studySubjectFinding = new StudySubjectFindingImpl();
		return studySubjectFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathRelationship createDeathRelationship() {
		DeathRelationshipImpl deathRelationship = new DeathRelationshipImpl();
		return deathRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudySubjectIntervention createStudySubjectIntervention() {
		StudySubjectInterventionImpl studySubjectIntervention = new StudySubjectInterventionImpl();
		return studySubjectIntervention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Indication createIndication() {
		IndicationImpl indication = new IndicationImpl();
		return indication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntendedRegimen createIntendedRegimen() {
		IntendedRegimenImpl intendedRegimen = new IntendedRegimenImpl();
		return intendedRegimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoseAdjustmentReason createDoseAdjustmentReason() {
		DoseAdjustmentReasonImpl doseAdjustmentReason = new DoseAdjustmentReasonImpl();
		return doseAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdverseEvent createAdverseEvent() {
		AdverseEventImpl adverseEvent = new AdverseEventImpl();
		return adverseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InclusionorExclusionCriteriaNotMet createInclusionorExclusionCriteriaNotMet() {
		InclusionorExclusionCriteriaNotMetImpl inclusionorExclusionCriteriaNotMet = new InclusionorExclusionCriteriaNotMetImpl();
		return inclusionorExclusionCriteriaNotMet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcomitantMedication createConcomitantMedication() {
		ConcomitantMedicationImpl concomitantMedication = new ConcomitantMedicationImpl();
		return concomitantMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumableMaterial createConsumableMaterial() {
		ConsumableMaterialImpl consumableMaterial = new ConsumableMaterialImpl();
		return consumableMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HumanClinicalExposure createHumanClinicalExposure() {
		HumanClinicalExposureImpl humanClinicalExposure = new HumanClinicalExposureImpl();
		return humanClinicalExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceUse createSubstanceUse() {
		SubstanceUseImpl substanceUse = new SubstanceUseImpl();
		return substanceUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanLaboratoryTestResult createNonhumanLaboratoryTestResult() {
		NonhumanLaboratoryTestResultImpl nonhumanLaboratoryTestResult = new NonhumanLaboratoryTestResultImpl();
		return nonhumanLaboratoryTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyTestOrganization createStudyTestOrganization() {
		StudyTestOrganizationImpl studyTestOrganization = new StudyTestOrganizationImpl();
		return studyTestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyFindingEvaluator createStudyFindingEvaluator() {
		StudyFindingEvaluatorImpl studyFindingEvaluator = new StudyFindingEvaluatorImpl();
		return studyFindingEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectDataNonClinicalTrials createSubjectDataNonClinicalTrials() {
		SubjectDataNonClinicalTrialsImpl subjectDataNonClinicalTrials = new SubjectDataNonClinicalTrialsImpl();
		return subjectDataNonClinicalTrials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanSubjectDataDocumentSection createNonhumanSubjectDataDocumentSection() {
		NonhumanSubjectDataDocumentSectionImpl nonhumanSubjectDataDocumentSection = new NonhumanSubjectDataDocumentSectionImpl();
		return nonhumanSubjectDataDocumentSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanSubjectDemographics createNonhumanSubjectDemographics() {
		NonhumanSubjectDemographicsImpl nonhumanSubjectDemographics = new NonhumanSubjectDemographicsImpl();
		return nonhumanSubjectDemographics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanDisposition createNonhumanDisposition() {
		NonhumanDispositionImpl nonhumanDisposition = new NonhumanDispositionImpl();
		return nonhumanDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonhumanExposure createNonhumanExposure() {
		NonhumanExposureImpl nonhumanExposure = new NonhumanExposureImpl();
		return nonhumanExposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyWeight createBodyWeight() {
		BodyWeightImpl bodyWeight = new BodyWeightImpl();
		return bodyWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyWeightGain createBodyWeightGain() {
		BodyWeightGainImpl bodyWeightGain = new BodyWeightGainImpl();
		return bodyWeightGain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClinicalObservation createClinicalObservation() {
		ClinicalObservationImpl clinicalObservation = new ClinicalObservationImpl();
		return clinicalObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeathDiagnosis createDeathDiagnosis() {
		DeathDiagnosisImpl deathDiagnosis = new DeathDiagnosisImpl();
		return deathDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FoodandWaterConsumption createFoodandWaterConsumption() {
		FoodandWaterConsumptionImpl foodandWaterConsumption = new FoodandWaterConsumptionImpl();
		return foodandWaterConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacroscopicFinding createMacroscopicFinding() {
		MacroscopicFindingImpl macroscopicFinding = new MacroscopicFindingImpl();
		return macroscopicFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroscopicFinding createMicroscopicFinding() {
		MicroscopicFindingImpl microscopicFinding = new MicroscopicFindingImpl();
		return microscopicFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganMeasurement createOrganMeasurement() {
		OrganMeasurementImpl organMeasurement = new OrganMeasurementImpl();
		return organMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PalpableMass createPalpableMass() {
		PalpableMassImpl palpableMass = new PalpableMassImpl();
		return palpableMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TumorFinding createTumorFinding() {
		TumorFindingImpl tumorFinding = new TumorFindingImpl();
		return tumorFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectPool createSubjectPool() {
		SubjectPoolImpl subjectPool = new SubjectPoolImpl();
		return subjectPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassIdentification createMassIdentification() {
		MassIdentificationImpl massIdentification = new MassIdentificationImpl();
		return massIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceRange createReferenceRange() {
		ReferenceRangeImpl referenceRange = new ReferenceRangeImpl();
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SdtmPackage getSdtmPackage() {
		return (SdtmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SdtmPackage getPackage() {
		return SdtmPackage.eINSTANCE;
	}

} //SdtmFactoryImpl
