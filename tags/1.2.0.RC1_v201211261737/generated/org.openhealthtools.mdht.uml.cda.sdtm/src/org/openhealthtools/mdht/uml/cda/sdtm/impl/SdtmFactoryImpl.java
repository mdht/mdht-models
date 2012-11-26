/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.sdtm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdtmFactoryImpl extends EFactoryImpl implements SdtmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SdtmFactory init()
  {
    try
    {
      SdtmFactory theSdtmFactory = (SdtmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/sdtm"); 
      if (theSdtmFactory != null)
      {
        return theSdtmFactory;
      }
    }
    catch (Exception exception)
    {
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
  public SdtmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SdtmPackage.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS: return createSubjectDataHumanClinicalTrials();
      case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY: return createHumanClinicalSubjectDataDocumentBody();
      case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS: return createHumanClinicalSubjectDemographics();
      case SdtmPackage.DATA_COLLECTION: return createDataCollection();
      case SdtmPackage.EVENT_STUDY_DAY: return createEventStudyDay();
      case SdtmPackage.STUDY_ARM: return createStudyArm();
      case SdtmPackage.VISIT: return createVisit();
      case SdtmPackage.ADVERSE_EVENT: return createAdverseEvent();
      case SdtmPackage.GROUP_IDENTIFIER: return createGroupIdentifier();
      case SdtmPackage.BODY_SYSTEMOR_ORGAN_CLASS: return createBodySystemorOrganClass();
      case SdtmPackage.EVENT_SEVERITY: return createEventSeverity();
      case SdtmPackage.PRE_SPECIFIED_EVENT: return createPreSpecifiedEvent();
      case SdtmPackage.STUDY_DAY_PERIOD: return createStudyDayPeriod();
      case SdtmPackage.VITAL_SIGN: return createVitalSign();
      case SdtmPackage.TIMING_REFERENCE: return createTimingReference();
      case SdtmPackage.NON_PERFORMANCE_REASON: return createNonPerformanceReason();
      case SdtmPackage.PLANNED_STUDY_DAY: return createPlannedStudyDay();
      case SdtmPackage.EXCLUSION_REASON: return createExclusionReason();
      case SdtmPackage.ECG_TEST_RESULT: return createECGTestResult();
      case SdtmPackage.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET: return createInclusionorExclusionCriteriaNotMet();
      case SdtmPackage.NONHUMAN_LABORATORY_TEST_RESULT: return createNonhumanLaboratoryTestResult();
      case SdtmPackage.SPECIMEN_INFORMATION: return createSpecimenInformation();
      case SdtmPackage.PHYSICAL_EXAMINATION_FINDING: return createPhysicalExaminationFinding();
      case SdtmPackage.MICROBIOLOGY_SPECIMEN_FINDING: return createMicrobiologySpecimenFinding();
      case SdtmPackage.MICROBIOLOGY_SUSCEPTIBILITY: return createMicrobiologySusceptibility();
      case SdtmPackage.PHARMACOKINETIC_CONCENTRATION_FINDING: return createPharmacokineticConcentrationFinding();
      case SdtmPackage.FINDING_ABOUT: return createFindingAbout();
      case SdtmPackage.DRUG_ACCOUNTABILITY: return createDrugAccountability();
      case SdtmPackage.SUBJECT_ELEMENT: return createSubjectElement();
      case SdtmPackage.STUDY_EPOCH: return createStudyEpoch();
      case SdtmPackage.SUBSTANCE_USE: return createSubstanceUse();
      case SdtmPackage.ACTIVITY_START_TIMING_REFERENCE: return createActivityStartTimingReference();
      case SdtmPackage.ACTIVITY_END_TIMING_REFERENCE: return createActivityEndTimingReference();
      case SdtmPackage.HUMAN_CLINICAL_DISPOSITION: return createHumanClinicalDisposition();
      case SdtmPackage.MEDICAL_HISTORY_ITEM: return createMedicalHistoryItem();
      case SdtmPackage.PROTOCOL_DEVIATION: return createProtocolDeviation();
      case SdtmPackage.CLINICAL_EVENT: return createClinicalEvent();
      case SdtmPackage.SUBJECT_CHARACTERISTIC: return createSubjectCharacteristic();
      case SdtmPackage.PHARMACOKINETIC_PARAMETER_FINDING: return createPharmacokineticParameterFinding();
      case SdtmPackage.CONCOMITANT_MEDICATION: return createConcomitantMedication();
      case SdtmPackage.CONSUMABLE_MATERIAL: return createConsumableMaterial();
      case SdtmPackage.HUMAN_CLINICAL_EXPOSURE: return createHumanClinicalExposure();
      case SdtmPackage.STUDY_TEST_ORGANIZATION: return createStudyTestOrganization();
      case SdtmPackage.QUESTIONNAIRE_FINDING: return createQuestionnaireFinding();
      case SdtmPackage.STUDY_FINDING_EVALUATOR: return createStudyFindingEvaluator();
      case SdtmPackage.SUBJECT_DATA_NON_CLINICAL_TRIALS: return createSubjectDataNonClinicalTrials();
      case SdtmPackage.NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY: return createNonhumanSubjectDataDocumentBody();
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
      case SdtmPackage.HUMAN_CLINICAL_LABORATORY_TEST_RESULT: return createHumanClinicalLaboratoryTestResult();
      case SdtmPackage.SUBJECT_POOL: return createSubjectPool();
      case SdtmPackage.MASS_IDENTIFICATION: return createMassIdentification();
      case SdtmPackage.STUDY_SUBJECT_INTERVENTION: return createStudySubjectIntervention();
      case SdtmPackage.STUDY_SUBJECT_EVENT: return createStudySubjectEvent();
      case SdtmPackage.STUDY_SUBJECT_FINDING: return createStudySubjectFinding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectDataHumanClinicalTrials createSubjectDataHumanClinicalTrials()
  {
    SubjectDataHumanClinicalTrialsImpl subjectDataHumanClinicalTrials = new SubjectDataHumanClinicalTrialsImpl();
    return subjectDataHumanClinicalTrials;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalSubjectDataDocumentBody createHumanClinicalSubjectDataDocumentBody()
  {
    HumanClinicalSubjectDataDocumentBodyImpl humanClinicalSubjectDataDocumentBody = new HumanClinicalSubjectDataDocumentBodyImpl();
    return humanClinicalSubjectDataDocumentBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalSubjectDemographics createHumanClinicalSubjectDemographics()
  {
    HumanClinicalSubjectDemographicsImpl humanClinicalSubjectDemographics = new HumanClinicalSubjectDemographicsImpl();
    return humanClinicalSubjectDemographics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection createDataCollection()
  {
    DataCollectionImpl dataCollection = new DataCollectionImpl();
    return dataCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventStudyDay createEventStudyDay()
  {
    EventStudyDayImpl eventStudyDay = new EventStudyDayImpl();
    return eventStudyDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyArm createStudyArm()
  {
    StudyArmImpl studyArm = new StudyArmImpl();
    return studyArm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visit createVisit()
  {
    VisitImpl visit = new VisitImpl();
    return visit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdverseEvent createAdverseEvent()
  {
    AdverseEventImpl adverseEvent = new AdverseEventImpl();
    return adverseEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupIdentifier createGroupIdentifier()
  {
    GroupIdentifierImpl groupIdentifier = new GroupIdentifierImpl();
    return groupIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodySystemorOrganClass createBodySystemorOrganClass()
  {
    BodySystemorOrganClassImpl bodySystemorOrganClass = new BodySystemorOrganClassImpl();
    return bodySystemorOrganClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSeverity createEventSeverity()
  {
    EventSeverityImpl eventSeverity = new EventSeverityImpl();
    return eventSeverity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreSpecifiedEvent createPreSpecifiedEvent()
  {
    PreSpecifiedEventImpl preSpecifiedEvent = new PreSpecifiedEventImpl();
    return preSpecifiedEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod createStudyDayPeriod()
  {
    StudyDayPeriodImpl studyDayPeriod = new StudyDayPeriodImpl();
    return studyDayPeriod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VitalSign createVitalSign()
  {
    VitalSignImpl vitalSign = new VitalSignImpl();
    return vitalSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay createPlannedStudyDay()
  {
    PlannedStudyDayImpl plannedStudyDay = new PlannedStudyDayImpl();
    return plannedStudyDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason createExclusionReason()
  {
    ExclusionReasonImpl exclusionReason = new ExclusionReasonImpl();
    return exclusionReason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimingReference createTimingReference()
  {
    TimingReferenceImpl timingReference = new TimingReferenceImpl();
    return timingReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason createNonPerformanceReason()
  {
    NonPerformanceReasonImpl nonPerformanceReason = new NonPerformanceReasonImpl();
    return nonPerformanceReason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECGTestResult createECGTestResult()
  {
    ECGTestResultImpl ecgTestResult = new ECGTestResultImpl();
    return ecgTestResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InclusionorExclusionCriteriaNotMet createInclusionorExclusionCriteriaNotMet()
  {
    InclusionorExclusionCriteriaNotMetImpl inclusionorExclusionCriteriaNotMet = new InclusionorExclusionCriteriaNotMetImpl();
    return inclusionorExclusionCriteriaNotMet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanLaboratoryTestResult createNonhumanLaboratoryTestResult()
  {
    NonhumanLaboratoryTestResultImpl nonhumanLaboratoryTestResult = new NonhumanLaboratoryTestResultImpl();
    return nonhumanLaboratoryTestResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecimenInformation createSpecimenInformation()
  {
    SpecimenInformationImpl specimenInformation = new SpecimenInformationImpl();
    return specimenInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhysicalExaminationFinding createPhysicalExaminationFinding()
  {
    PhysicalExaminationFindingImpl physicalExaminationFinding = new PhysicalExaminationFindingImpl();
    return physicalExaminationFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySpecimenFinding createMicrobiologySpecimenFinding()
  {
    MicrobiologySpecimenFindingImpl microbiologySpecimenFinding = new MicrobiologySpecimenFindingImpl();
    return microbiologySpecimenFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicrobiologySusceptibility createMicrobiologySusceptibility()
  {
    MicrobiologySusceptibilityImpl microbiologySusceptibility = new MicrobiologySusceptibilityImpl();
    return microbiologySusceptibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticConcentrationFinding createPharmacokineticConcentrationFinding()
  {
    PharmacokineticConcentrationFindingImpl pharmacokineticConcentrationFinding = new PharmacokineticConcentrationFindingImpl();
    return pharmacokineticConcentrationFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FindingAbout createFindingAbout()
  {
    FindingAboutImpl findingAbout = new FindingAboutImpl();
    return findingAbout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DrugAccountability createDrugAccountability()
  {
    DrugAccountabilityImpl drugAccountability = new DrugAccountabilityImpl();
    return drugAccountability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectElement createSubjectElement()
  {
    SubjectElementImpl subjectElement = new SubjectElementImpl();
    return subjectElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyEpoch createStudyEpoch()
  {
    StudyEpochImpl studyEpoch = new StudyEpochImpl();
    return studyEpoch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubstanceUse createSubstanceUse()
  {
    SubstanceUseImpl substanceUse = new SubstanceUseImpl();
    return substanceUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityStartTimingReference createActivityStartTimingReference()
  {
    ActivityStartTimingReferenceImpl activityStartTimingReference = new ActivityStartTimingReferenceImpl();
    return activityStartTimingReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityEndTimingReference createActivityEndTimingReference()
  {
    ActivityEndTimingReferenceImpl activityEndTimingReference = new ActivityEndTimingReferenceImpl();
    return activityEndTimingReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalDisposition createHumanClinicalDisposition()
  {
    HumanClinicalDispositionImpl humanClinicalDisposition = new HumanClinicalDispositionImpl();
    return humanClinicalDisposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicalHistoryItem createMedicalHistoryItem()
  {
    MedicalHistoryItemImpl medicalHistoryItem = new MedicalHistoryItemImpl();
    return medicalHistoryItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolDeviation createProtocolDeviation()
  {
    ProtocolDeviationImpl protocolDeviation = new ProtocolDeviationImpl();
    return protocolDeviation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClinicalEvent createClinicalEvent()
  {
    ClinicalEventImpl clinicalEvent = new ClinicalEventImpl();
    return clinicalEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectCharacteristic createSubjectCharacteristic()
  {
    SubjectCharacteristicImpl subjectCharacteristic = new SubjectCharacteristicImpl();
    return subjectCharacteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PharmacokineticParameterFinding createPharmacokineticParameterFinding()
  {
    PharmacokineticParameterFindingImpl pharmacokineticParameterFinding = new PharmacokineticParameterFindingImpl();
    return pharmacokineticParameterFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcomitantMedication createConcomitantMedication()
  {
    ConcomitantMedicationImpl concomitantMedication = new ConcomitantMedicationImpl();
    return concomitantMedication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsumableMaterial createConsumableMaterial()
  {
    ConsumableMaterialImpl consumableMaterial = new ConsumableMaterialImpl();
    return consumableMaterial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalExposure createHumanClinicalExposure()
  {
    HumanClinicalExposureImpl humanClinicalExposure = new HumanClinicalExposureImpl();
    return humanClinicalExposure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyTestOrganization createStudyTestOrganization()
  {
    StudyTestOrganizationImpl studyTestOrganization = new StudyTestOrganizationImpl();
    return studyTestOrganization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireFinding createQuestionnaireFinding()
  {
    QuestionnaireFindingImpl questionnaireFinding = new QuestionnaireFindingImpl();
    return questionnaireFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyFindingEvaluator createStudyFindingEvaluator()
  {
    StudyFindingEvaluatorImpl studyFindingEvaluator = new StudyFindingEvaluatorImpl();
    return studyFindingEvaluator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectDataNonClinicalTrials createSubjectDataNonClinicalTrials()
  {
    SubjectDataNonClinicalTrialsImpl subjectDataNonClinicalTrials = new SubjectDataNonClinicalTrialsImpl();
    return subjectDataNonClinicalTrials;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanSubjectDataDocumentBody createNonhumanSubjectDataDocumentBody()
  {
    NonhumanSubjectDataDocumentBodyImpl nonhumanSubjectDataDocumentBody = new NonhumanSubjectDataDocumentBodyImpl();
    return nonhumanSubjectDataDocumentBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanSubjectDemographics createNonhumanSubjectDemographics()
  {
    NonhumanSubjectDemographicsImpl nonhumanSubjectDemographics = new NonhumanSubjectDemographicsImpl();
    return nonhumanSubjectDemographics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanDisposition createNonhumanDisposition()
  {
    NonhumanDispositionImpl nonhumanDisposition = new NonhumanDispositionImpl();
    return nonhumanDisposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanExposure createNonhumanExposure()
  {
    NonhumanExposureImpl nonhumanExposure = new NonhumanExposureImpl();
    return nonhumanExposure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HumanClinicalLaboratoryTestResult createHumanClinicalLaboratoryTestResult()
  {
    HumanClinicalLaboratoryTestResultImpl humanClinicalLaboratoryTestResult = new HumanClinicalLaboratoryTestResultImpl();
    return humanClinicalLaboratoryTestResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeight createBodyWeight()
  {
    BodyWeightImpl bodyWeight = new BodyWeightImpl();
    return bodyWeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeightGain createBodyWeightGain()
  {
    BodyWeightGainImpl bodyWeightGain = new BodyWeightGainImpl();
    return bodyWeightGain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClinicalObservation createClinicalObservation()
  {
    ClinicalObservationImpl clinicalObservation = new ClinicalObservationImpl();
    return clinicalObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathDiagnosis createDeathDiagnosis()
  {
    DeathDiagnosisImpl deathDiagnosis = new DeathDiagnosisImpl();
    return deathDiagnosis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FoodandWaterConsumption createFoodandWaterConsumption()
  {
    FoodandWaterConsumptionImpl foodandWaterConsumption = new FoodandWaterConsumptionImpl();
    return foodandWaterConsumption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MacroscopicFinding createMacroscopicFinding()
  {
    MacroscopicFindingImpl macroscopicFinding = new MacroscopicFindingImpl();
    return macroscopicFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MicroscopicFinding createMicroscopicFinding()
  {
    MicroscopicFindingImpl microscopicFinding = new MicroscopicFindingImpl();
    return microscopicFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrganMeasurement createOrganMeasurement()
  {
    OrganMeasurementImpl organMeasurement = new OrganMeasurementImpl();
    return organMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PalpableMass createPalpableMass()
  {
    PalpableMassImpl palpableMass = new PalpableMassImpl();
    return palpableMass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TumorFinding createTumorFinding()
  {
    TumorFindingImpl tumorFinding = new TumorFindingImpl();
    return tumorFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectPool createSubjectPool()
  {
    SubjectPoolImpl subjectPool = new SubjectPoolImpl();
    return subjectPool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MassIdentification createMassIdentification()
  {
    MassIdentificationImpl massIdentification = new MassIdentificationImpl();
    return massIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectIntervention createStudySubjectIntervention()
  {
    StudySubjectInterventionImpl studySubjectIntervention = new StudySubjectInterventionImpl();
    return studySubjectIntervention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectEvent createStudySubjectEvent()
  {
    StudySubjectEventImpl studySubjectEvent = new StudySubjectEventImpl();
    return studySubjectEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudySubjectFinding createStudySubjectFinding()
  {
    StudySubjectFindingImpl studySubjectFinding = new StudySubjectFindingImpl();
    return studySubjectFinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SdtmPackage getSdtmPackage()
  {
    return (SdtmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SdtmPackage getPackage()
  {
    return SdtmPackage.eINSTANCE;
  }

} //SdtmFactoryImpl
