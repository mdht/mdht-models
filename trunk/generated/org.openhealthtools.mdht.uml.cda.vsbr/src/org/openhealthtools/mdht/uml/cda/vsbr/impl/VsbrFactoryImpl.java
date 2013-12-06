/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.vsbr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsbrFactoryImpl extends EFactoryImpl implements VsbrFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static VsbrFactory init() {
    try
    {
      VsbrFactory theVsbrFactory = (VsbrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/vsbr"); 
      if (theVsbrFactory != null)
      {
        return theVsbrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VsbrFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VsbrFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case VsbrPackage.REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS: return createReportingBirthInformationfromaclinicalsettingtovitalrecords();
      case VsbrPackage.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION: return createPrenatalTestingandSurveillanceSection();
      case VsbrPackage.PRENATAL_CARE: return createPrenatalCare();
      case VsbrPackage.PRIOR_PREGNANCY_HISTORY_SECTION: return createPriorPregnancyHistorySection();
      case VsbrPackage.DATEOF_LAST_LIVE_BIRTH: return createDateofLastLiveBirth();
      case VsbrPackage.LAST_MENSTRUAL_PERIOD_DATE: return createLastMenstrualPeriodDate();
      case VsbrPackage.NUMBEROF_BIRTHS_NOW_LIVING: return createNumberofBirthsNowLiving();
      case VsbrPackage.NUMBEROF_LIVE_BIRTHSNOW_DEAD: return createNumberofLiveBirthsnowDead();
      case VsbrPackage.OTHER_PREGNANCY_OUTCOME: return createOtherPregnancyOutcome();
      case VsbrPackage.ESTIMATEOF_GESTATION: return createEstimateofGestation();
      case VsbrPackage.NEWBORN_DELIVERY_SECTION: return createNewbornDeliverySection();
      case VsbrPackage.BIRTH_ORDER: return createBirthOrder();
      case VsbrPackage.NUMBEROF_INFANTS_BORN_ALIVE: return createNumberofInfantsBornAlive();
      case VsbrPackage.CONGENITAL_ANOMALY: return createCongenitalAnomaly();
      case VsbrPackage.NEWBORNS_VITAL_SIGNS_SECTION: return createNewbornsVitalSignsSection();
      case VsbrPackage.NEWBORNS_VITAL_SIGNS_OBSERVATION: return createNewbornsVitalSignsObservation();
      case VsbrPackage.ABNORMAL_CONDITIONOFTHE_NEWBORN: return createAbnormalConditionoftheNewborn();
      case VsbrPackage.INFANT_LIVING: return createInfantLiving();
      case VsbrPackage.INFANT_BREASTFED: return createInfantBreastfed();
      case VsbrPackage.INFANT_TRANSFER: return createInfantTransfer();
      case VsbrPackage.PLURALITY: return createPlurality();
      case VsbrPackage.ASSESSMENTS_SECTION: return createAssessmentsSection();
      case VsbrPackage.ASSESSMENTS_OBSERVATION: return createAssessmentsObservation();
      case VsbrPackage.LABORAND_DELIVERY_SECTION: return createLaborandDeliverySection();
      case VsbrPackage.LABORAND_DELIVERY_INFORMATION: return createLaborandDeliveryInformation();
      case VsbrPackage.CHARACTERISTICOF_LABORAND_DELIVERY: return createCharacteristicofLaborandDelivery();
      case VsbrPackage.PLANNED_HOME_BIRTH: return createPlannedHomeBirth();
      case VsbrPackage.MATERNAL_TRANSFER: return createMaternalTransfer();
      case VsbrPackage.MATERNAL_MORBIDITY: return createMaternalMorbidity();
      case VsbrPackage.PREGNANCY_RISK_FACTOR: return createPregnancyRiskFactor();
      case VsbrPackage.LABORAND_DELIVERY_PROCEDURE_SECTION: return createLaborandDeliveryProcedureSection();
      case VsbrPackage.OBSTETRIC_PROCEDURE: return createObstetricProcedure();
      case VsbrPackage.METHODOF_DELIVERY: return createMethodofDelivery();
      case VsbrPackage.ONSETOF_LABOR: return createOnsetofLabor();
      case VsbrPackage.MOTHERS_VITAL_SIGNS_SECTION: return createMothersVitalSignsSection();
      case VsbrPackage.MOTHERS_VITAL_SIGNS_OBSERVATION: return createMothersVitalSignsObservation();
      case VsbrPackage.HISTORYOF_INFECTION_LIVE_BIRTH_SECTION: return createHistoryofInfectionLiveBirthSection();
      case VsbrPackage.INFECTION_PRESENT_LIVE_BIRTH: return createInfectionPresentLiveBirth();
      case VsbrPackage.FETAL_DELIVERY_SECTION: return createFetalDeliverySection();
      case VsbrPackage.AUTOPSY_PERFORMANCE: return createAutopsyPerformance();
      case VsbrPackage.FETAL_DEATH_OCCURRANCE: return createFetalDeathOccurrance();
      case VsbrPackage.FETAL_DELIVERY_TIME: return createFetalDeliveryTime();
      case VsbrPackage.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS: return createReportingFetalDeathInformationfromaclinicalsettingtovitalrecords();
      case VsbrPackage.HISTORYOF_INFECTION_FETAL_DEATH_SECTION: return createHistoryofInfectionFetalDeathSection();
      case VsbrPackage.INFECTION_PRESENT_FETAL_DEATH: return createInfectionPresentFetalDeath();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReportingBirthInformationfromaclinicalsettingtovitalrecords createReportingBirthInformationfromaclinicalsettingtovitalrecords() {
    ReportingBirthInformationfromaclinicalsettingtovitalrecordsImpl reportingBirthInformationfromaclinicalsettingtovitalrecords = new ReportingBirthInformationfromaclinicalsettingtovitalrecordsImpl();
    return reportingBirthInformationfromaclinicalsettingtovitalrecords;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrenatalTestingandSurveillanceSection createPrenatalTestingandSurveillanceSection()
  {
    PrenatalTestingandSurveillanceSectionImpl prenatalTestingandSurveillanceSection = new PrenatalTestingandSurveillanceSectionImpl();
    return prenatalTestingandSurveillanceSection;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PrenatalCare createPrenatalCare() {
    PrenatalCareImpl prenatalCare = new PrenatalCareImpl();
    return prenatalCare;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PriorPregnancyHistorySection createPriorPregnancyHistorySection() {
    PriorPregnancyHistorySectionImpl priorPregnancyHistorySection = new PriorPregnancyHistorySectionImpl();
    return priorPregnancyHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DateofLastLiveBirth createDateofLastLiveBirth() {
    DateofLastLiveBirthImpl dateofLastLiveBirth = new DateofLastLiveBirthImpl();
    return dateofLastLiveBirth;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LastMenstrualPeriodDate createLastMenstrualPeriodDate() {
    LastMenstrualPeriodDateImpl lastMenstrualPeriodDate = new LastMenstrualPeriodDateImpl();
    return lastMenstrualPeriodDate;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NumberofBirthsNowLiving createNumberofBirthsNowLiving() {
    NumberofBirthsNowLivingImpl numberofBirthsNowLiving = new NumberofBirthsNowLivingImpl();
    return numberofBirthsNowLiving;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NumberofLiveBirthsnowDead createNumberofLiveBirthsnowDead() {
    NumberofLiveBirthsnowDeadImpl numberofLiveBirthsnowDead = new NumberofLiveBirthsnowDeadImpl();
    return numberofLiveBirthsnowDead;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OtherPregnancyOutcome createOtherPregnancyOutcome() {
    OtherPregnancyOutcomeImpl otherPregnancyOutcome = new OtherPregnancyOutcomeImpl();
    return otherPregnancyOutcome;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EstimateofGestation createEstimateofGestation() {
    EstimateofGestationImpl estimateofGestation = new EstimateofGestationImpl();
    return estimateofGestation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewbornDeliverySection createNewbornDeliverySection() {
    NewbornDeliverySectionImpl newbornDeliverySection = new NewbornDeliverySectionImpl();
    return newbornDeliverySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BirthOrder createBirthOrder() {
    BirthOrderImpl birthOrder = new BirthOrderImpl();
    return birthOrder;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NumberofInfantsBornAlive createNumberofInfantsBornAlive() {
    NumberofInfantsBornAliveImpl numberofInfantsBornAlive = new NumberofInfantsBornAliveImpl();
    return numberofInfantsBornAlive;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CongenitalAnomaly createCongenitalAnomaly() {
    CongenitalAnomalyImpl congenitalAnomaly = new CongenitalAnomalyImpl();
    return congenitalAnomaly;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewbornsVitalSignsSection createNewbornsVitalSignsSection() {
    NewbornsVitalSignsSectionImpl newbornsVitalSignsSection = new NewbornsVitalSignsSectionImpl();
    return newbornsVitalSignsSection;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewbornsVitalSignsObservation createNewbornsVitalSignsObservation()
  {
    NewbornsVitalSignsObservationImpl newbornsVitalSignsObservation = new NewbornsVitalSignsObservationImpl();
    return newbornsVitalSignsObservation;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AbnormalConditionoftheNewborn createAbnormalConditionoftheNewborn() {
    AbnormalConditionoftheNewbornImpl abnormalConditionoftheNewborn = new AbnormalConditionoftheNewbornImpl();
    return abnormalConditionoftheNewborn;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InfantLiving createInfantLiving() {
    InfantLivingImpl infantLiving = new InfantLivingImpl();
    return infantLiving;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InfantBreastfed createInfantBreastfed() {
    InfantBreastfedImpl infantBreastfed = new InfantBreastfedImpl();
    return infantBreastfed;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public InfantTransfer createInfantTransfer() {
    InfantTransferImpl infantTransfer = new InfantTransferImpl();
    return infantTransfer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Plurality createPlurality() {
    PluralityImpl plurality = new PluralityImpl();
    return plurality;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LaborandDeliverySection createLaborandDeliverySection() {
    LaborandDeliverySectionImpl laborandDeliverySection = new LaborandDeliverySectionImpl();
    return laborandDeliverySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LaborandDeliveryInformation createLaborandDeliveryInformation() {
    LaborandDeliveryInformationImpl laborandDeliveryInformation = new LaborandDeliveryInformationImpl();
    return laborandDeliveryInformation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CharacteristicofLaborandDelivery createCharacteristicofLaborandDelivery() {
    CharacteristicofLaborandDeliveryImpl characteristicofLaborandDelivery = new CharacteristicofLaborandDeliveryImpl();
    return characteristicofLaborandDelivery;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlannedHomeBirth createPlannedHomeBirth() {
    PlannedHomeBirthImpl plannedHomeBirth = new PlannedHomeBirthImpl();
    return plannedHomeBirth;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaternalTransfer createMaternalTransfer() {
    MaternalTransferImpl maternalTransfer = new MaternalTransferImpl();
    return maternalTransfer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MaternalMorbidity createMaternalMorbidity() {
    MaternalMorbidityImpl maternalMorbidity = new MaternalMorbidityImpl();
    return maternalMorbidity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PregnancyRiskFactor createPregnancyRiskFactor() {
    PregnancyRiskFactorImpl pregnancyRiskFactor = new PregnancyRiskFactorImpl();
    return pregnancyRiskFactor;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessmentsSection createAssessmentsSection()
  {
    AssessmentsSectionImpl assessmentsSection = new AssessmentsSectionImpl();
    return assessmentsSection;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MothersVitalSignsSection createMothersVitalSignsSection() {
    MothersVitalSignsSectionImpl mothersVitalSignsSection = new MothersVitalSignsSectionImpl();
    return mothersVitalSignsSection;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssessmentsObservation createAssessmentsObservation()
  {
    AssessmentsObservationImpl assessmentsObservation = new AssessmentsObservationImpl();
    return assessmentsObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MothersVitalSignsObservation createMothersVitalSignsObservation()
  {
    MothersVitalSignsObservationImpl mothersVitalSignsObservation = new MothersVitalSignsObservationImpl();
    return mothersVitalSignsObservation;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LaborandDeliveryProcedureSection createLaborandDeliveryProcedureSection() {
    LaborandDeliveryProcedureSectionImpl laborandDeliveryProcedureSection = new LaborandDeliveryProcedureSectionImpl();
    return laborandDeliveryProcedureSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ObstetricProcedure createObstetricProcedure() {
    ObstetricProcedureImpl obstetricProcedure = new ObstetricProcedureImpl();
    return obstetricProcedure;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MethodofDelivery createMethodofDelivery() {
    MethodofDeliveryImpl methodofDelivery = new MethodofDeliveryImpl();
    return methodofDelivery;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OnsetofLabor createOnsetofLabor() {
    OnsetofLaborImpl onsetofLabor = new OnsetofLaborImpl();
    return onsetofLabor;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HistoryofInfectionLiveBirthSection createHistoryofInfectionLiveBirthSection()
  {
    HistoryofInfectionLiveBirthSectionImpl historyofInfectionLiveBirthSection = new HistoryofInfectionLiveBirthSectionImpl();
    return historyofInfectionLiveBirthSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfectionPresentFetalDeath createInfectionPresentFetalDeath()
  {
    InfectionPresentFetalDeathImpl infectionPresentFetalDeath = new InfectionPresentFetalDeathImpl();
    return infectionPresentFetalDeath;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeliverySection createFetalDeliverySection() {
    FetalDeliverySectionImpl fetalDeliverySection = new FetalDeliverySectionImpl();
    return fetalDeliverySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AutopsyPerformance createAutopsyPerformance() {
    AutopsyPerformanceImpl autopsyPerformance = new AutopsyPerformanceImpl();
    return autopsyPerformance;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeathOccurrance createFetalDeathOccurrance() {
    FetalDeathOccurranceImpl fetalDeathOccurrance = new FetalDeathOccurranceImpl();
    return fetalDeathOccurrance;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeliveryTime createFetalDeliveryTime() {
    FetalDeliveryTimeImpl fetalDeliveryTime = new FetalDeliveryTimeImpl();
    return fetalDeliveryTime;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords createReportingFetalDeathInformationfromaclinicalsettingtovitalrecords() {
    ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl reportingFetalDeathInformationfromaclinicalsettingtovitalrecords = new ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl();
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HistoryofInfectionFetalDeathSection createHistoryofInfectionFetalDeathSection()
  {
    HistoryofInfectionFetalDeathSectionImpl historyofInfectionFetalDeathSection = new HistoryofInfectionFetalDeathSectionImpl();
    return historyofInfectionFetalDeathSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfectionPresentLiveBirth createInfectionPresentLiveBirth()
  {
    InfectionPresentLiveBirthImpl infectionPresentLiveBirth = new InfectionPresentLiveBirthImpl();
    return infectionPresentLiveBirth;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VsbrPackage getVsbrPackage() {
    return (VsbrPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static VsbrPackage getPackage() {
    return VsbrPackage.eINSTANCE;
  }

} // VsbrFactoryImpl
