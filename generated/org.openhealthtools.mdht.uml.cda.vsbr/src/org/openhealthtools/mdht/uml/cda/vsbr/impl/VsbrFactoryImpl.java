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
public class VsbrFactoryImpl extends EFactoryImpl implements VsbrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VsbrFactory init()
  {
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
  public VsbrFactoryImpl()
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
      case VsbrPackage.REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS: return createReportingBirthInformationfromaclinicalsettingtovitalrecords();
      case VsbrPackage.BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION: return createBirthReportingPrenatalExperienceSection();
      case VsbrPackage.PRE_NATAL_CARE: return createPreNatalCare();
      case VsbrPackage.HEIGHT: return createHeight();
      case VsbrPackage.DATEOF_LAST_LIVE_BIRTH: return createDateofLastLiveBirth();
      case VsbrPackage.LAST_MENSTRUAL_PERIOD_DATE: return createLastMenstrualPeriodDate();
      case VsbrPackage.NUMBEROF_BIRTHS_STILL_LIVING: return createNumberofBirthsStillLiving();
      case VsbrPackage.NUMBEROF_LIVE_BIRTHSNOW_DEAD: return createNumberofLiveBirthsnowDead();
      case VsbrPackage.OTHER_PREGNANCY_OUTCOMES: return createOtherPregnancyOutcomes();
      case VsbrPackage.BIRTH_REPORTING_INFECTIONS_PRESENT: return createBirthReportingInfectionsPresent();
      case VsbrPackage.LABORAND_DELIVERY_SECTION: return createLaborandDeliverySection();
      case VsbrPackage.LABORAND_DELIVERY_INFORMATION: return createLaborandDeliveryInformation();
      case VsbrPackage.MATERNAL_MORBIDITIES: return createMaternalMorbidities();
      case VsbrPackage.CHARACTERISTICSOF_LABORAND_DELIVERY: return createCharacteristicsofLaborandDelivery();
      case VsbrPackage.LABOR_ONSETS: return createLaborOnsets();
      case VsbrPackage.OBSTETRIC_PROCEDURES: return createObstetricProcedures();
      case VsbrPackage.ATTEMPTED_FORCEPS_DELIVERY: return createAttemptedForcepsDelivery();
      case VsbrPackage.ATTEMPTED_VACUUM_EXTRACTION: return createAttemptedVacuumExtraction();
      case VsbrPackage.FETAL_PRESENTATION: return createFetalPresentation();
      case VsbrPackage.ROUTEAND_METHODOF_DELIVERY: return createRouteandMethodofDelivery();
      case VsbrPackage.BODY_WEIGHTAT_DELIVERY: return createBodyWeightatDelivery();
      case VsbrPackage.NEWBORN_SECTION: return createNewbornSection();
      case VsbrPackage.ESTIMATEOF_GESTATION: return createEstimateofGestation();
      case VsbrPackage.APGAR_SCORE: return createApgarScore();
      case VsbrPackage.PLURALITY: return createPlurality();
      case VsbrPackage.BIRTH_ORDER: return createBirthOrder();
      case VsbrPackage.NUMBEROF_INFANTS_BORN_ALIVE: return createNumberofInfantsBornAlive();
      case VsbrPackage.CONGENITAL_ANOMALIESOFTHE_NEWBORN: return createCongenitalAnomaliesoftheNewborn();
      case VsbrPackage.WEIGHT: return createWeight();
      case VsbrPackage.FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION: return createFetalDeathReportingPrenatalExperienceSection();
      case VsbrPackage.FETAL_DEATH_REPORTING_INFECTIONS_PRESENT: return createFetalDeathReportingInfectionsPresent();
      case VsbrPackage.FETUS_SECTION: return createFetusSection();
      case VsbrPackage.ABNORMAL_CONDITIONSOFTHE_NEWBORN: return createAbnormalConditionsoftheNewborn();
      case VsbrPackage.REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS: return createReportingFetalDeathInformationfromaclinicalsettingtovitalrecords();
      case VsbrPackage.PREPREGNANCY_BODY_WEIGHT: return createPrepregnancyBodyWeight();
      case VsbrPackage.RISK_FACTORS: return createRiskFactors();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportingBirthInformationfromaclinicalsettingtovitalrecords createReportingBirthInformationfromaclinicalsettingtovitalrecords()
  {
    ReportingBirthInformationfromaclinicalsettingtovitalrecordsImpl reportingBirthInformationfromaclinicalsettingtovitalrecords = new ReportingBirthInformationfromaclinicalsettingtovitalrecordsImpl();
    return reportingBirthInformationfromaclinicalsettingtovitalrecords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthReportingPrenatalExperienceSection createBirthReportingPrenatalExperienceSection()
  {
    BirthReportingPrenatalExperienceSectionImpl birthReportingPrenatalExperienceSection = new BirthReportingPrenatalExperienceSectionImpl();
    return birthReportingPrenatalExperienceSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreNatalCare createPreNatalCare()
  {
    PreNatalCareImpl preNatalCare = new PreNatalCareImpl();
    return preNatalCare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliverySection createLaborandDeliverySection()
  {
    LaborandDeliverySectionImpl laborandDeliverySection = new LaborandDeliverySectionImpl();
    return laborandDeliverySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborandDeliveryInformation createLaborandDeliveryInformation()
  {
    LaborandDeliveryInformationImpl laborandDeliveryInformation = new LaborandDeliveryInformationImpl();
    return laborandDeliveryInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewbornSection createNewbornSection()
  {
    NewbornSectionImpl newbornSection = new NewbornSectionImpl();
    return newbornSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalDeathReportingPrenatalExperienceSection createFetalDeathReportingPrenatalExperienceSection()
  {
    FetalDeathReportingPrenatalExperienceSectionImpl fetalDeathReportingPrenatalExperienceSection = new FetalDeathReportingPrenatalExperienceSectionImpl();
    return fetalDeathReportingPrenatalExperienceSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetusSection createFetusSection()
  {
    FetusSectionImpl fetusSection = new FetusSectionImpl();
    return fetusSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords createReportingFetalDeathInformationfromaclinicalsettingtovitalrecords()
  {
    ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl reportingFetalDeathInformationfromaclinicalsettingtovitalrecords = new ReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsImpl();
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Height createHeight()
  {
    HeightImpl height = new HeightImpl();
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeightatDelivery createBodyWeightatDelivery()
  {
    BodyWeightatDeliveryImpl bodyWeightatDelivery = new BodyWeightatDeliveryImpl();
    return bodyWeightatDelivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrepregnancyBodyWeight createPrepregnancyBodyWeight()
  {
    PrepregnancyBodyWeightImpl prepregnancyBodyWeight = new PrepregnancyBodyWeightImpl();
    return prepregnancyBodyWeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofBirthsStillLiving createNumberofBirthsStillLiving()
  {
    NumberofBirthsStillLivingImpl numberofBirthsStillLiving = new NumberofBirthsStillLivingImpl();
    return numberofBirthsStillLiving;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateofLastLiveBirth createDateofLastLiveBirth()
  {
    DateofLastLiveBirthImpl dateofLastLiveBirth = new DateofLastLiveBirthImpl();
    return dateofLastLiveBirth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofLiveBirthsnowDead createNumberofLiveBirthsnowDead()
  {
    NumberofLiveBirthsnowDeadImpl numberofLiveBirthsnowDead = new NumberofLiveBirthsnowDeadImpl();
    return numberofLiveBirthsnowDead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherPregnancyOutcomes createOtherPregnancyOutcomes()
  {
    OtherPregnancyOutcomesImpl otherPregnancyOutcomes = new OtherPregnancyOutcomesImpl();
    return otherPregnancyOutcomes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LastMenstrualPeriodDate createLastMenstrualPeriodDate()
  {
    LastMenstrualPeriodDateImpl lastMenstrualPeriodDate = new LastMenstrualPeriodDateImpl();
    return lastMenstrualPeriodDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthReportingInfectionsPresent createBirthReportingInfectionsPresent()
  {
    BirthReportingInfectionsPresentImpl birthReportingInfectionsPresent = new BirthReportingInfectionsPresentImpl();
    return birthReportingInfectionsPresent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LaborOnsets createLaborOnsets()
  {
    LaborOnsetsImpl laborOnsets = new LaborOnsetsImpl();
    return laborOnsets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalDeathReportingInfectionsPresent createFetalDeathReportingInfectionsPresent()
  {
    FetalDeathReportingInfectionsPresentImpl fetalDeathReportingInfectionsPresent = new FetalDeathReportingInfectionsPresentImpl();
    return fetalDeathReportingInfectionsPresent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObstetricProcedures createObstetricProcedures()
  {
    ObstetricProceduresImpl obstetricProcedures = new ObstetricProceduresImpl();
    return obstetricProcedures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskFactors createRiskFactors()
  {
    RiskFactorsImpl riskFactors = new RiskFactorsImpl();
    return riskFactors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacteristicsofLaborandDelivery createCharacteristicsofLaborandDelivery()
  {
    CharacteristicsofLaborandDeliveryImpl characteristicsofLaborandDelivery = new CharacteristicsofLaborandDeliveryImpl();
    return characteristicsofLaborandDelivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaternalMorbidities createMaternalMorbidities()
  {
    MaternalMorbiditiesImpl maternalMorbidities = new MaternalMorbiditiesImpl();
    return maternalMorbidities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbnormalConditionsoftheNewborn createAbnormalConditionsoftheNewborn()
  {
    AbnormalConditionsoftheNewbornImpl abnormalConditionsoftheNewborn = new AbnormalConditionsoftheNewbornImpl();
    return abnormalConditionsoftheNewborn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CongenitalAnomaliesoftheNewborn createCongenitalAnomaliesoftheNewborn()
  {
    CongenitalAnomaliesoftheNewbornImpl congenitalAnomaliesoftheNewborn = new CongenitalAnomaliesoftheNewbornImpl();
    return congenitalAnomaliesoftheNewborn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttemptedForcepsDelivery createAttemptedForcepsDelivery()
  {
    AttemptedForcepsDeliveryImpl attemptedForcepsDelivery = new AttemptedForcepsDeliveryImpl();
    return attemptedForcepsDelivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttemptedVacuumExtraction createAttemptedVacuumExtraction()
  {
    AttemptedVacuumExtractionImpl attemptedVacuumExtraction = new AttemptedVacuumExtractionImpl();
    return attemptedVacuumExtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FetalPresentation createFetalPresentation()
  {
    FetalPresentationImpl fetalPresentation = new FetalPresentationImpl();
    return fetalPresentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RouteandMethodofDelivery createRouteandMethodofDelivery()
  {
    RouteandMethodofDeliveryImpl routeandMethodofDelivery = new RouteandMethodofDeliveryImpl();
    return routeandMethodofDelivery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weight createWeight()
  {
    WeightImpl weight = new WeightImpl();
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstimateofGestation createEstimateofGestation()
  {
    EstimateofGestationImpl estimateofGestation = new EstimateofGestationImpl();
    return estimateofGestation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApgarScore createApgarScore()
  {
    ApgarScoreImpl apgarScore = new ApgarScoreImpl();
    return apgarScore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plurality createPlurality()
  {
    PluralityImpl plurality = new PluralityImpl();
    return plurality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofInfantsBornAlive createNumberofInfantsBornAlive()
  {
    NumberofInfantsBornAliveImpl numberofInfantsBornAlive = new NumberofInfantsBornAliveImpl();
    return numberofInfantsBornAlive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BirthOrder createBirthOrder()
  {
    BirthOrderImpl birthOrder = new BirthOrderImpl();
    return birthOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsbrPackage getVsbrPackage()
  {
    return (VsbrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VsbrPackage getPackage()
  {
    return VsbrPackage.eINSTANCE;
  }

} //VsbrFactoryImpl
