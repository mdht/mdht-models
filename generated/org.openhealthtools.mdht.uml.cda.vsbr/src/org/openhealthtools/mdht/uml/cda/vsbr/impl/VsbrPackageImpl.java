/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore;
import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation;
import org.openhealthtools.mdht.uml.cda.vsbr.FetusSection;
import org.openhealthtools.mdht.uml.cda.vsbr.Height;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors;
import org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.Weight;
import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsbrPackageImpl extends EPackageImpl implements VsbrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass birthReportingPrenatalExperienceSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preNatalCareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass laborandDeliverySectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass laborandDeliveryInformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newbornSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetalDeathReportingPrenatalExperienceSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetusSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass heightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyWeightatDeliveryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prepregnancyBodyWeightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberofBirthsStillLivingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateofLastLiveBirthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberofLiveBirthsnowDeadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass otherPregnancyOutcomesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lastMenstrualPeriodDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass birthReportingInfectionsPresentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass laborOnsetsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetalDeathReportingInfectionsPresentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass obstetricProceduresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass riskFactorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass characteristicsofLaborandDeliveryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maternalMorbiditiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abnormalConditionsoftheNewbornEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass congenitalAnomaliesoftheNewbornEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attemptedForcepsDeliveryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attemptedVacuumExtractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetalPresentationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass routeandMethodofDeliveryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass estimateofGestationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass apgarScoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluralityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberofInfantsBornAliveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass birthOrderEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VsbrPackageImpl()
  {
    super(eNS_URI, VsbrFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VsbrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VsbrPackage init()
  {
    if (isInited) return (VsbrPackage)EPackage.Registry.INSTANCE.getEPackage(VsbrPackage.eNS_URI);

    // Obtain or create and register package
    VsbrPackageImpl theVsbrPackage = (VsbrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VsbrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VsbrPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CDAPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theVsbrPackage.createPackageContents();

    // Initialize created meta-data
    theVsbrPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theVsbrPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return VsbrValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theVsbrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VsbrPackage.eNS_URI, theVsbrPackage);
    return theVsbrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportingBirthInformationfromaclinicalsettingtovitalrecords()
  {
    return reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBirthReportingPrenatalExperienceSection()
  {
    return birthReportingPrenatalExperienceSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreNatalCare()
  {
    return preNatalCareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLaborandDeliverySection()
  {
    return laborandDeliverySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLaborandDeliveryInformation()
  {
    return laborandDeliveryInformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewbornSection()
  {
    return newbornSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetalDeathReportingPrenatalExperienceSection()
  {
    return fetalDeathReportingPrenatalExperienceSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetusSection()
  {
    return fetusSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReportingFetalDeathInformationfromaclinicalsettingtovitalrecords()
  {
    return reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeight()
  {
    return heightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyWeightatDelivery()
  {
    return bodyWeightatDeliveryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrepregnancyBodyWeight()
  {
    return prepregnancyBodyWeightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberofBirthsStillLiving()
  {
    return numberofBirthsStillLivingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateofLastLiveBirth()
  {
    return dateofLastLiveBirthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberofLiveBirthsnowDead()
  {
    return numberofLiveBirthsnowDeadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherPregnancyOutcomes()
  {
    return otherPregnancyOutcomesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLastMenstrualPeriodDate()
  {
    return lastMenstrualPeriodDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBirthReportingInfectionsPresent()
  {
    return birthReportingInfectionsPresentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLaborOnsets()
  {
    return laborOnsetsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetalDeathReportingInfectionsPresent()
  {
    return fetalDeathReportingInfectionsPresentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObstetricProcedures()
  {
    return obstetricProceduresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRiskFactors()
  {
    return riskFactorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharacteristicsofLaborandDelivery()
  {
    return characteristicsofLaborandDeliveryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaternalMorbidities()
  {
    return maternalMorbiditiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbnormalConditionsoftheNewborn()
  {
    return abnormalConditionsoftheNewbornEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCongenitalAnomaliesoftheNewborn()
  {
    return congenitalAnomaliesoftheNewbornEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttemptedForcepsDelivery()
  {
    return attemptedForcepsDeliveryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttemptedVacuumExtraction()
  {
    return attemptedVacuumExtractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFetalPresentation()
  {
    return fetalPresentationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRouteandMethodofDelivery()
  {
    return routeandMethodofDeliveryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeight()
  {
    return weightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEstimateofGestation()
  {
    return estimateofGestationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApgarScore()
  {
    return apgarScoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlurality()
  {
    return pluralityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberofInfantsBornAlive()
  {
    return numberofInfantsBornAliveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBirthOrder()
  {
    return birthOrderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsbrFactory getVsbrFactory()
  {
    return (VsbrFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass = createEClass(REPORTING_BIRTH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);

    birthReportingPrenatalExperienceSectionEClass = createEClass(BIRTH_REPORTING_PRENATAL_EXPERIENCE_SECTION);

    preNatalCareEClass = createEClass(PRE_NATAL_CARE);

    heightEClass = createEClass(HEIGHT);

    dateofLastLiveBirthEClass = createEClass(DATEOF_LAST_LIVE_BIRTH);

    lastMenstrualPeriodDateEClass = createEClass(LAST_MENSTRUAL_PERIOD_DATE);

    numberofBirthsStillLivingEClass = createEClass(NUMBEROF_BIRTHS_STILL_LIVING);

    numberofLiveBirthsnowDeadEClass = createEClass(NUMBEROF_LIVE_BIRTHSNOW_DEAD);

    otherPregnancyOutcomesEClass = createEClass(OTHER_PREGNANCY_OUTCOMES);

    birthReportingInfectionsPresentEClass = createEClass(BIRTH_REPORTING_INFECTIONS_PRESENT);

    laborandDeliverySectionEClass = createEClass(LABORAND_DELIVERY_SECTION);

    laborandDeliveryInformationEClass = createEClass(LABORAND_DELIVERY_INFORMATION);

    maternalMorbiditiesEClass = createEClass(MATERNAL_MORBIDITIES);

    characteristicsofLaborandDeliveryEClass = createEClass(CHARACTERISTICSOF_LABORAND_DELIVERY);

    laborOnsetsEClass = createEClass(LABOR_ONSETS);

    obstetricProceduresEClass = createEClass(OBSTETRIC_PROCEDURES);

    attemptedForcepsDeliveryEClass = createEClass(ATTEMPTED_FORCEPS_DELIVERY);

    attemptedVacuumExtractionEClass = createEClass(ATTEMPTED_VACUUM_EXTRACTION);

    fetalPresentationEClass = createEClass(FETAL_PRESENTATION);

    routeandMethodofDeliveryEClass = createEClass(ROUTEAND_METHODOF_DELIVERY);

    bodyWeightatDeliveryEClass = createEClass(BODY_WEIGHTAT_DELIVERY);

    newbornSectionEClass = createEClass(NEWBORN_SECTION);

    estimateofGestationEClass = createEClass(ESTIMATEOF_GESTATION);

    apgarScoreEClass = createEClass(APGAR_SCORE);

    pluralityEClass = createEClass(PLURALITY);

    birthOrderEClass = createEClass(BIRTH_ORDER);

    numberofInfantsBornAliveEClass = createEClass(NUMBEROF_INFANTS_BORN_ALIVE);

    congenitalAnomaliesoftheNewbornEClass = createEClass(CONGENITAL_ANOMALIESOFTHE_NEWBORN);

    weightEClass = createEClass(WEIGHT);

    fetalDeathReportingPrenatalExperienceSectionEClass = createEClass(FETAL_DEATH_REPORTING_PRENATAL_EXPERIENCE_SECTION);

    fetalDeathReportingInfectionsPresentEClass = createEClass(FETAL_DEATH_REPORTING_INFECTIONS_PRESENT);

    fetusSectionEClass = createEClass(FETUS_SECTION);

    abnormalConditionsoftheNewbornEClass = createEClass(ABNORMAL_CONDITIONSOFTHE_NEWBORN);

    reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass = createEClass(REPORTING_FETAL_DEATH_INFORMATIONFROMACLINICALSETTINGTOVITALRECORDS);

    prepregnancyBodyWeightEClass = createEClass(PREPREGNANCY_BODY_WEIGHT);

    riskFactorsEClass = createEClass(RISK_FACTORS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
    birthReportingPrenatalExperienceSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    preNatalCareEClass.getESuperTypes().add(theCDAPackage.getAct());
    heightEClass.getESuperTypes().add(theCDAPackage.getObservation());
    dateofLastLiveBirthEClass.getESuperTypes().add(theCDAPackage.getObservation());
    lastMenstrualPeriodDateEClass.getESuperTypes().add(theCDAPackage.getObservation());
    numberofBirthsStillLivingEClass.getESuperTypes().add(theCDAPackage.getObservation());
    numberofLiveBirthsnowDeadEClass.getESuperTypes().add(theCDAPackage.getObservation());
    otherPregnancyOutcomesEClass.getESuperTypes().add(theCDAPackage.getObservation());
    birthReportingInfectionsPresentEClass.getESuperTypes().add(theCDAPackage.getObservation());
    laborandDeliverySectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    laborandDeliveryInformationEClass.getESuperTypes().add(theCDAPackage.getAct());
    maternalMorbiditiesEClass.getESuperTypes().add(theCDAPackage.getObservation());
    characteristicsofLaborandDeliveryEClass.getESuperTypes().add(theCDAPackage.getObservation());
    laborOnsetsEClass.getESuperTypes().add(theCDAPackage.getObservation());
    obstetricProceduresEClass.getESuperTypes().add(theCDAPackage.getObservation());
    attemptedForcepsDeliveryEClass.getESuperTypes().add(theCDAPackage.getObservation());
    attemptedVacuumExtractionEClass.getESuperTypes().add(theCDAPackage.getObservation());
    fetalPresentationEClass.getESuperTypes().add(theCDAPackage.getObservation());
    routeandMethodofDeliveryEClass.getESuperTypes().add(theCDAPackage.getObservation());
    bodyWeightatDeliveryEClass.getESuperTypes().add(theCDAPackage.getObservation());
    newbornSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    estimateofGestationEClass.getESuperTypes().add(theCDAPackage.getObservation());
    apgarScoreEClass.getESuperTypes().add(theCDAPackage.getObservation());
    pluralityEClass.getESuperTypes().add(theCDAPackage.getObservation());
    birthOrderEClass.getESuperTypes().add(theCDAPackage.getObservation());
    numberofInfantsBornAliveEClass.getESuperTypes().add(theCDAPackage.getObservation());
    congenitalAnomaliesoftheNewbornEClass.getESuperTypes().add(theCDAPackage.getObservation());
    weightEClass.getESuperTypes().add(theCDAPackage.getObservation());
    fetalDeathReportingPrenatalExperienceSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    fetalDeathReportingInfectionsPresentEClass.getESuperTypes().add(theCDAPackage.getObservation());
    fetusSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    abnormalConditionsoftheNewbornEClass.getESuperTypes().add(theCDAPackage.getObservation());
    reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass.getESuperTypes().add(theCDAPackage.getClinicalDocument());
    prepregnancyBodyWeightEClass.getESuperTypes().add(theCDAPackage.getObservation());
    riskFactorsEClass.getESuperTypes().add(theCDAPackage.getObservation());

    // Initialize classes and features; add operations and parameters
    initEClass(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ReportingBirthInformationfromaclinicalsettingtovitalrecords.class, "ReportingBirthInformationfromaclinicalsettingtovitalrecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsBirthReportingPrenatalExperienceSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingBirthInformationfromaclinicalsettingtovitalrecordsNewbornSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getBirthReportingPrenatalExperienceSection(), "getBirthReportingPrenatalExperienceSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getLaborandDeliverySection(), "getLaborandDeliverySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, this.getNewbornSection(), "getNewbornSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(birthReportingPrenatalExperienceSectionEClass, BirthReportingPrenatalExperienceSection.class, "BirthReportingPrenatalExperienceSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionPreNatalCare", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionHeight", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionDateofLastLiveBirth", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionLastMenstrualPeriodDate", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionNumberofBirthsStillLiving", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionOtherPreganancyOutcomes", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionRiskFactor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateBirthReportingPrenatalExperienceSectionBirthReportingInfectionsPresent", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getPreNatalCare(), "getPreNatalCare", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getHeight(), "getHeight", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getDateofLastLiveBirth(), "getDateofLastLiveBirth", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getLastMenstrualPeriodDate(), "getLastMenstrualPeriodDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getNumberofBirthsStillLiving(), "getNumberofBirthsStillLiving", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getNumberofLiveBirthsnowDead(), "getNumberofLiveBirthsnowDead", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getOtherPregnancyOutcomes(), "getOtherPreganancyOutcomes", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getBirthReportingInfectionsPresent(), "getRiskFactors", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(birthReportingPrenatalExperienceSectionEClass, this.getBirthReportingInfectionsPresent(), "getBirthReportingInfectionsPresents", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(preNatalCareEClass, PreNatalCare.class, "PreNatalCare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(preNatalCareEClass, ecorePackage.getEBoolean(), "validatePreNatalCareEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(heightEClass, Height.class, "Height", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(heightEClass, ecorePackage.getEBoolean(), "validateHeightTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(heightEClass, ecorePackage.getEBoolean(), "validateHeightClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(heightEClass, ecorePackage.getEBoolean(), "validateHeightCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(heightEClass, ecorePackage.getEBoolean(), "validateHeightMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(heightEClass, ecorePackage.getEBoolean(), "validateHeightValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(dateofLastLiveBirthEClass, DateofLastLiveBirth.class, "DateofLastLiveBirth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(dateofLastLiveBirthEClass, ecorePackage.getEBoolean(), "validateDateofLastLiveBirthValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(lastMenstrualPeriodDateEClass, LastMenstrualPeriodDate.class, "LastMenstrualPeriodDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(lastMenstrualPeriodDateEClass, ecorePackage.getEBoolean(), "validateLastMenstrualPeriodDateValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(numberofBirthsStillLivingEClass, NumberofBirthsStillLiving.class, "NumberofBirthsStillLiving", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(numberofBirthsStillLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsStillLivingTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofBirthsStillLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsStillLivingClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofBirthsStillLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsStillLivingCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofBirthsStillLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsStillLivingMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofBirthsStillLivingEClass, ecorePackage.getEBoolean(), "validateNumberofBirthsStillLivingValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(numberofLiveBirthsnowDeadEClass, NumberofLiveBirthsnowDead.class, "NumberofLiveBirthsnowDead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(numberofLiveBirthsnowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsnowDeadTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofLiveBirthsnowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsnowDeadClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofLiveBirthsnowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsnowDeadCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofLiveBirthsnowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsnowDeadMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofLiveBirthsnowDeadEClass, ecorePackage.getEBoolean(), "validateNumberofLiveBirthsnowDeadValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(otherPregnancyOutcomesEClass, OtherPregnancyOutcomes.class, "OtherPregnancyOutcomes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(otherPregnancyOutcomesEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomesTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherPregnancyOutcomesEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomesClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherPregnancyOutcomesEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomesCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherPregnancyOutcomesEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomesMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherPregnancyOutcomesEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomesValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherPregnancyOutcomesEClass, ecorePackage.getEBoolean(), "validateOtherPregnancyOutcomesEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(birthReportingInfectionsPresentEClass, BirthReportingInfectionsPresent.class, "BirthReportingInfectionsPresent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(birthReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateBirthReportingInfectionsPresentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateBirthReportingInfectionsPresentClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateBirthReportingInfectionsPresentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateBirthReportingInfectionsPresentMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateBirthReportingInfectionsPresentValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(laborandDeliverySectionEClass, LaborandDeliverySection.class, "LaborandDeliverySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionLaborandDeliveryInformation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliverySectionEClass, ecorePackage.getEBoolean(), "validateLaborandDeliverySectionBodyWeightatDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(laborandDeliverySectionEClass, this.getLaborandDeliveryInformation(), "getLaborandDeliveryInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliverySectionEClass, this.getBodyWeightatDelivery(), "getBodyWeightatDelivery", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(laborandDeliveryInformationEClass, LaborandDeliveryInformation.class, "LaborandDeliveryInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationPerformer", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationAttendantParticipation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationHomeBirthPlanAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationTransferAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationMaternalMorbidities", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationLaborOnsets", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationObstetricProcedures", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationAttemptedForcepsDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationAttemptedVacuumExtraction", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationFetalPresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationRouteandMethodofDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationBodyWeightatDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborandDeliveryInformationEClass, ecorePackage.getEBoolean(), "validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getMaternalMorbidities(), "getMaternalMorbiditiess", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getCharacteristicsofLaborandDelivery(), "getCharacteristicsofLaborandDeliveries", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getLaborOnsets(), "getLaborOnsetss", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getObstetricProcedures(), "getObstetricProceduress", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getAttemptedForcepsDelivery(), "getAttemptedForcepsDelivery", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getAttemptedVacuumExtraction(), "getAttemptedVacuumExtraction", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getFetalPresentation(), "getFetalPresentation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getRouteandMethodofDelivery(), "getRouteandMethodofDelivery", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(laborandDeliveryInformationEClass, this.getBodyWeightatDelivery(), "getBodyWeightatDelivery", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(maternalMorbiditiesEClass, MaternalMorbidities.class, "MaternalMorbidities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(maternalMorbiditiesEClass, ecorePackage.getEBoolean(), "validateMaternalMorbiditiesTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(maternalMorbiditiesEClass, ecorePackage.getEBoolean(), "validateMaternalMorbiditiesClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(maternalMorbiditiesEClass, ecorePackage.getEBoolean(), "validateMaternalMorbiditiesCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(maternalMorbiditiesEClass, ecorePackage.getEBoolean(), "validateMaternalMorbiditiesMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(maternalMorbiditiesEClass, ecorePackage.getEBoolean(), "validateMaternalMorbiditiesValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(characteristicsofLaborandDeliveryEClass, CharacteristicsofLaborandDelivery.class, "CharacteristicsofLaborandDelivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(characteristicsofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicsofLaborandDeliveryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(characteristicsofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicsofLaborandDeliveryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(characteristicsofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicsofLaborandDeliveryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(characteristicsofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicsofLaborandDeliveryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(characteristicsofLaborandDeliveryEClass, ecorePackage.getEBoolean(), "validateCharacteristicsofLaborandDeliveryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(laborOnsetsEClass, LaborOnsets.class, "LaborOnsets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(laborOnsetsEClass, ecorePackage.getEBoolean(), "validateLaborOnsetsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborOnsetsEClass, ecorePackage.getEBoolean(), "validateLaborOnsetsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborOnsetsEClass, ecorePackage.getEBoolean(), "validateLaborOnsetsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborOnsetsEClass, ecorePackage.getEBoolean(), "validateLaborOnsetsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(laborOnsetsEClass, ecorePackage.getEBoolean(), "validateLaborOnsetsValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(obstetricProceduresEClass, ObstetricProcedures.class, "ObstetricProcedures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(obstetricProceduresEClass, ecorePackage.getEBoolean(), "validateObstetricProceduresTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(obstetricProceduresEClass, ecorePackage.getEBoolean(), "validateObstetricProceduresClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(obstetricProceduresEClass, ecorePackage.getEBoolean(), "validateObstetricProceduresCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(obstetricProceduresEClass, ecorePackage.getEBoolean(), "validateObstetricProceduresMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(obstetricProceduresEClass, ecorePackage.getEBoolean(), "validateObstetricProceduresValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(attemptedForcepsDeliveryEClass, AttemptedForcepsDelivery.class, "AttemptedForcepsDelivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(attemptedForcepsDeliveryEClass, ecorePackage.getEBoolean(), "validateAttemptedForcepsDeliveryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedForcepsDeliveryEClass, ecorePackage.getEBoolean(), "validateAttemptedForcepsDeliveryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedForcepsDeliveryEClass, ecorePackage.getEBoolean(), "validateAttemptedForcepsDeliveryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedForcepsDeliveryEClass, ecorePackage.getEBoolean(), "validateAttemptedForcepsDeliveryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedForcepsDeliveryEClass, ecorePackage.getEBoolean(), "validateAttemptedForcepsDeliveryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(attemptedVacuumExtractionEClass, AttemptedVacuumExtraction.class, "AttemptedVacuumExtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(attemptedVacuumExtractionEClass, ecorePackage.getEBoolean(), "validateAttemptedVacuumExtractionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedVacuumExtractionEClass, ecorePackage.getEBoolean(), "validateAttemptedVacuumExtractionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedVacuumExtractionEClass, ecorePackage.getEBoolean(), "validateAttemptedVacuumExtractionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedVacuumExtractionEClass, ecorePackage.getEBoolean(), "validateAttemptedVacuumExtractionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(attemptedVacuumExtractionEClass, ecorePackage.getEBoolean(), "validateAttemptedVacuumExtractionValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(fetalPresentationEClass, FetalPresentation.class, "FetalPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(fetalPresentationEClass, ecorePackage.getEBoolean(), "validateFetalPresentationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalPresentationEClass, ecorePackage.getEBoolean(), "validateFetalPresentationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalPresentationEClass, ecorePackage.getEBoolean(), "validateFetalPresentationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalPresentationEClass, ecorePackage.getEBoolean(), "validateFetalPresentationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalPresentationEClass, ecorePackage.getEBoolean(), "validateFetalPresentationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(routeandMethodofDeliveryEClass, RouteandMethodofDelivery.class, "RouteandMethodofDelivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(routeandMethodofDeliveryEClass, ecorePackage.getEBoolean(), "validateRouteandMethodofDeliveryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(routeandMethodofDeliveryEClass, ecorePackage.getEBoolean(), "validateRouteandMethodofDeliveryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(routeandMethodofDeliveryEClass, ecorePackage.getEBoolean(), "validateRouteandMethodofDeliveryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(routeandMethodofDeliveryEClass, ecorePackage.getEBoolean(), "validateRouteandMethodofDeliveryMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(routeandMethodofDeliveryEClass, ecorePackage.getEBoolean(), "validateRouteandMethodofDeliveryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(routeandMethodofDeliveryEClass, ecorePackage.getEBoolean(), "validateRouteandMethodofDeliveryEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(bodyWeightatDeliveryEClass, BodyWeightatDelivery.class, "BodyWeightatDelivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(bodyWeightatDeliveryEClass, ecorePackage.getEBoolean(), "validateBodyWeightatDeliveryTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(bodyWeightatDeliveryEClass, ecorePackage.getEBoolean(), "validateBodyWeightatDeliveryClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(bodyWeightatDeliveryEClass, ecorePackage.getEBoolean(), "validateBodyWeightatDeliveryCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(bodyWeightatDeliveryEClass, ecorePackage.getEBoolean(), "validateBodyWeightatDeliveryValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(newbornSectionEClass, NewbornSection.class, "NewbornSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionEstimateofGestation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionApgarScore", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionPlurality", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionBirthOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionNumberofInfantsBornAlive", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionCongenitalAnomaliesoftheNewborn", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(newbornSectionEClass, ecorePackage.getEBoolean(), "validateNewbornSectionWeight", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getEstimateofGestation(), "getEstimateofGestation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getApgarScore(), "getApgarScores", 1, 2, IS_UNIQUE, !IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getPlurality(), "getPlurality", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getBirthOrder(), "getBirthOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getNumberofInfantsBornAlive(), "getNumberofInfantsBornAlive", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getCongenitalAnomaliesoftheNewborn(), "getCongenitalAnomaliesoftheNewborns", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(newbornSectionEClass, this.getWeight(), "getWeight", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(estimateofGestationEClass, EstimateofGestation.class, "EstimateofGestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(estimateofGestationEClass, ecorePackage.getEBoolean(), "validateEstimateofGestationValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(apgarScoreEClass, ApgarScore.class, "ApgarScore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(apgarScoreEClass, ecorePackage.getEBoolean(), "validateApgarScoreTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(apgarScoreEClass, ecorePackage.getEBoolean(), "validateApgarScoreClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(apgarScoreEClass, ecorePackage.getEBoolean(), "validateApgarScoreCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(apgarScoreEClass, ecorePackage.getEBoolean(), "validateApgarScoreMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(apgarScoreEClass, ecorePackage.getEBoolean(), "validateApgarScoreValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(pluralityEClass, Plurality.class, "Plurality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(pluralityEClass, ecorePackage.getEBoolean(), "validatePluralityValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(birthOrderEClass, BirthOrder.class, "BirthOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(birthOrderEClass, ecorePackage.getEBoolean(), "validateBirthOrderValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(numberofInfantsBornAliveEClass, NumberofInfantsBornAlive.class, "NumberofInfantsBornAlive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(numberofInfantsBornAliveEClass, ecorePackage.getEBoolean(), "validateNumberofInfantsBornAliveValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(congenitalAnomaliesoftheNewbornEClass, CongenitalAnomaliesoftheNewborn.class, "CongenitalAnomaliesoftheNewborn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(congenitalAnomaliesoftheNewbornEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomaliesoftheNewbornTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(congenitalAnomaliesoftheNewbornEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomaliesoftheNewbornClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(congenitalAnomaliesoftheNewbornEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomaliesoftheNewbornCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(congenitalAnomaliesoftheNewbornEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomaliesoftheNewbornMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(congenitalAnomaliesoftheNewbornEClass, ecorePackage.getEBoolean(), "validateCongenitalAnomaliesoftheNewbornValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(weightEClass, Weight.class, "Weight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(weightEClass, ecorePackage.getEBoolean(), "validateWeightTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(weightEClass, ecorePackage.getEBoolean(), "validateWeightClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(weightEClass, ecorePackage.getEBoolean(), "validateWeightCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(weightEClass, ecorePackage.getEBoolean(), "validateWeightMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(weightEClass, ecorePackage.getEBoolean(), "validateWeightValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(fetalDeathReportingPrenatalExperienceSectionEClass, FetalDeathReportingPrenatalExperienceSection.class, "FetalDeathReportingPrenatalExperienceSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionPreNatalCare", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionHeight", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionDateofLastLiveBirth", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionNumberofBirthsStillLiving", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionNumberofLiveBirthsnowDead", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionOtherPreganancyOutcomes", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionRiskFactor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingPrenatalExperienceSectionFetalDeathReportingInfectionsPresent", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getPreNatalCare(), "getPreNatalCare", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getHeight(), "getHeight", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getDateofLastLiveBirth(), "getDateofLastLiveBirth", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getLastMenstrualPeriodDate(), "getLastMenstrualPeriodDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getNumberofBirthsStillLiving(), "getNumberofBirthsStillLiving", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getNumberofLiveBirthsnowDead(), "getNumberofLiveBirthsnowDead", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getOtherPregnancyOutcomes(), "getOtherPreganancyOutcomes", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getBirthReportingInfectionsPresent(), "getRiskFactors", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetalDeathReportingPrenatalExperienceSectionEClass, this.getFetalDeathReportingInfectionsPresent(), "getFetalDeathReportingInfectionsPresents", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(fetalDeathReportingInfectionsPresentEClass, FetalDeathReportingInfectionsPresent.class, "FetalDeathReportingInfectionsPresent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(fetalDeathReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingInfectionsPresentTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingInfectionsPresentClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingInfectionsPresentCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingInfectionsPresentMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetalDeathReportingInfectionsPresentEClass, ecorePackage.getEBoolean(), "validateFetalDeathReportingInfectionsPresentValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(fetusSectionEClass, FetusSection.class, "FetusSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionSubject", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionAbnormalConditionsoftheNewborn", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionBirthOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionNumberofInfantsBornAlive", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionCongenitalAnomaliesoftheNewborn2", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(fetusSectionEClass, ecorePackage.getEBoolean(), "validateFetusSectionWeight", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(fetusSectionEClass, this.getAbnormalConditionsoftheNewborn(), "getAbnormalConditionsoftheNewborns", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetusSectionEClass, this.getBirthOrder(), "getBirthOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetusSectionEClass, this.getNumberofInfantsBornAlive(), "getNumberofInfantsBornAlive", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetusSectionEClass, this.getCongenitalAnomaliesoftheNewborn(), "getCongenitalAnomaliesoftheNewborn2s", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(fetusSectionEClass, this.getWeight(), "getWeight", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(abnormalConditionsoftheNewbornEClass, AbnormalConditionsoftheNewborn.class, "AbnormalConditionsoftheNewborn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(abnormalConditionsoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionsoftheNewbornTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(abnormalConditionsoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionsoftheNewbornClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(abnormalConditionsoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionsoftheNewbornCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(abnormalConditionsoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionsoftheNewbornMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(abnormalConditionsoftheNewbornEClass, ecorePackage.getEBoolean(), "validateAbnormalConditionsoftheNewbornValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords.class, "ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsConfidentialityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLanguageCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRealmCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetalDeathReportingPrenatalExperienceSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsLaborandDeliverySection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, ecorePackage.getEBoolean(), "validateReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsFetusSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getFetalDeathReportingPrenatalExperienceSection(), "getFetalDeathReportingPrenatalExperienceSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getLaborandDeliverySection(), "getLaborandDeliverySection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, this.getFetusSection(), "getFetusSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(prepregnancyBodyWeightEClass, PrepregnancyBodyWeight.class, "PrepregnancyBodyWeight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(prepregnancyBodyWeightEClass, ecorePackage.getEBoolean(), "validatePrepregnancyBodyWeightTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(prepregnancyBodyWeightEClass, ecorePackage.getEBoolean(), "validatePrepregnancyBodyWeightClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(prepregnancyBodyWeightEClass, ecorePackage.getEBoolean(), "validatePrepregnancyBodyWeightCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(prepregnancyBodyWeightEClass, ecorePackage.getEBoolean(), "validatePrepregnancyBodyWeightMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(prepregnancyBodyWeightEClass, ecorePackage.getEBoolean(), "validatePrepregnancyBodyWeightValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(riskFactorsEClass, RiskFactors.class, "RiskFactors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(riskFactorsEClass, ecorePackage.getEBoolean(), "validateRiskFactorsTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(riskFactorsEClass, ecorePackage.getEBoolean(), "validateRiskFactorsClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(riskFactorsEClass, ecorePackage.getEBoolean(), "validateRiskFactorsCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(riskFactorsEClass, ecorePackage.getEBoolean(), "validateRiskFactorsMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(riskFactorsEClass, ecorePackage.getEBoolean(), "validateRiskFactorsValue", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(riskFactorsEClass, ecorePackage.getEBoolean(), "validateRiskFactorsEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.openhealthtools.org/mdht/uml/cda/annotation
    createAnnotationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor
    createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor
    createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget
    createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole
    createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient
    createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian
    createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPreNatalCareprenatalVisitsAssociation
    createVsbrPreNatalCareprenatalVisitsAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPreNatalCareprenatalVisitsAssociationpreNatalVisitNumber
    createVsbrPreNatalCareprenatalVisitsAssociationpreNatalVisitNumberAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocation
    createVsbrLaborandDeliveryInformationparticipatingLocationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRole
    createVsbrLaborandDeliveryInformationparticipatingLocationLocationRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocation
    createVsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipation
    createVsbrLaborandDeliveryInformationattendantParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRole
    createVsbrLaborandDeliveryInformationattendantParticipationattendantRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendant
    createVsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendantAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationcertifierParticipation
    createVsbrLaborandDeliveryInformationcertifierParticipationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransfer
    createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacility
    createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRole
    createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleFacility
    createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociation
    createVsbrLaborandDeliveryInformationhomeBirthPlanAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociationhomeBirthPlan
    createVsbrLaborandDeliveryInformationhomeBirthPlanAssociationhomeBirthPlanAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociation
    createVsbrLaborandDeliveryInformationpaymentSourceAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSource
    createVsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSourceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociation
    createVsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationhysterotomyHysterectomy
    createVsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationhysterotomyHysterectomyAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRouteandMethodofDeliveryTrialOfLaborAssociation
    createVsbrRouteandMethodofDeliveryTrialOfLaborAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRouteandMethodofDeliveryTrialOfLaborAssociationTrialOfLabor
    createVsbrRouteandMethodofDeliveryTrialOfLaborAssociationTrialOfLaborAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubject
    createVsbrNewbornSectionNewbornSubjectAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewborn
    createVsbrNewbornSectionNewbornSubjectRoleOfNewbornAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewbornNewborn
    createVsbrNewbornSectionNewbornSubjectRoleOfNewbornNewbornAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransfer
    createVsbrNewbornSectiontransferAssociationinfantTransferAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacility
    createVsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRole
    createVsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleFacility
    createVsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleFacilityAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociation
    createVsbrNewbornSectioninfantLivingAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociationinfantLiving
    createVsbrNewbornSectioninfantLivingAssociationinfantLivingAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociation
    createVsbrNewbornSectioninfantBreastfedAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociationinfantBreastfed
    createVsbrNewbornSectioninfantBreastfedAssociationinfantBreastfedAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociation
    createVsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationinfantBreastfed
    createVsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationinfantBreastfedAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectiontimeOfDeathAssociation
    createVsbrFetusSectiontimeOfDeathAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectiontimeOfDeathAssociationfetalDeath
    createVsbrFetusSectiontimeOfDeathAssociationfetalDeathAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectionautopsyPerformanceAssociation
    createVsbrFetusSectionautopsyPerformanceAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectionautopsyPerformanceAssociationautopsyPerformance
    createVsbrFetusSectionautopsyPerformanceAssociationautopsyPerformanceAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectioninfantBreastfedAssociation
    createVsbrFetusSectioninfantBreastfedAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectioninfantBreastfedAssociationinfantBreastfed
    createVsbrFetusSectioninfantBreastfedAssociationinfantBreastfedAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor
    createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor
    createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget
    createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole
    createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient
    createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian
    createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRiskFactorsCesareanAssociation
    createVsbrRiskFactorsCesareanAssociationAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRiskFactorsCesareanAssociationNumberOfCesarianDeliveries
    createVsbrRiskFactorsCesareanAssociationNumberOfCesarianDeliveriesAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createAnnotationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";		
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Reporting Birth Information from a clinical setting to vital recordsTemplateId Reporting Birth Information from a clinical setting to vital recordsCode Reporting Birth Information from a clinical setting to vital recordsCodeP Reporting Birth Information from a clinical setting to vital recordsConfidentialityCode Reporting Birth Information from a clinical setting to vital recordsConfidentialityCodeP Reporting Birth Information from a clinical setting to vital recordsMoodCode Reporting Birth Information from a clinical setting to vital recordsEffectiveTime Reporting Birth Information from a clinical setting to vital recordsId Reporting Birth Information from a clinical setting to vital recordsLanguageCode Reporting Birth Information from a clinical setting to vital recordsRealmCode Reporting Birth Information from a clinical setting to vital recordsRealmCodeP Reporting Birth Information from a clinical setting to vital recordsAuthor Reporting Birth Information from a clinical setting to vital recordsCustodian Reporting Birth Information from a clinical setting to vital recordsRecordTarget Reporting Birth Information from a clinical setting to vital recordsBirth Reporting - Prenatal Experience Section Reporting Birth Information from a clinical setting to vital recordsLabor and Delivery Section Reporting Birth Information from a clinical setting to vital recordsNewborn Section",
       "templateId.root", "2.16.840.1.113883.10.20.26.1",
       "classCode", "DOCCLIN",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																																																																																						
    addAnnotation
      (birthReportingPrenatalExperienceSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Birth Reporting - Prenatal Experience SectionTemplateId Birth Reporting - Prenatal Experience SectionClassCode Birth Reporting - Prenatal Experience SectionCode Birth Reporting - Prenatal Experience SectionMoodCode Birth Reporting - Prenatal Experience SectionText Birth Reporting - Prenatal Experience SectionPre-Natal Care Birth Reporting - Prenatal Experience SectionRisk Factor Birth Reporting - Prenatal Experience SectionBirth Reporting - Infections Present",
       "templateId.root", "2.16.840.1.113883.10.20.26.3",
       "classCode", "DOCSECT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "moodCode", "EVN",
       "constraints.validation.info", "Birth Reporting - Prenatal Experience SectionHeight",
       "constraints.validation.warning", "Birth Reporting - Prenatal Experience SectionDate of Last Live Birth Birth Reporting - Prenatal Experience SectionLast Menstrual Period Date Birth Reporting - Prenatal Experience SectionNumber of Births Still Living Birth Reporting - Prenatal Experience SectionNumber of Live Births now Dead Birth Reporting - Prenatal Experience SectionOther Preganancy Outcomes"
       });																																																																												
    addAnnotation
      (preNatalCareEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Pre-Natal CareTemplateId Pre-Natal CareClassCode Pre-Natal CareCode Pre-Natal CareMoodCode Pre-Natal CareEntryRelationship",
       "templateId.root", "2.16.840.1.113883.10.20.26.32",
       "classCode", "ACT",
       "constraints.validation.warning", "Pre-Natal CareEffectiveTime",
       "moodCode", "DEF",
       "constraints.validation.info", "Pre-Natal CareNegationInd"
       });																																
    addAnnotation
      (heightEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "HeightTemplateId HeightClassCode HeightCode HeightMoodCode HeightValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.21",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (dateofLastLiveBirthEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Date of Last Live BirthTemplateId Date of Last Live BirthCode Date of Last Live BirthMoodCode Date of Last Live BirthValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.17",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																		
    addAnnotation
      (lastMenstrualPeriodDateEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Last Menstrual Period DateTemplateId Last Menstrual Period DateClassCode Last Menstrual Period DateCode Last Menstrual Period DateMoodCode Last Menstrual Period DateValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.24",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (numberofBirthsStillLivingEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Number of Births Still LivingTemplateId Number of Births Still LivingClassCode Number of Births Still LivingCode Number of Births Still LivingMoodCode Number of Births Still LivingValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.26",
       "classCode", "OBS"
       });																						
    addAnnotation
      (numberofLiveBirthsnowDeadEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Number of Live Births now DeadTemplateId Number of Live Births now DeadClassCode Number of Live Births now DeadCode Number of Live Births now DeadMoodCode Number of Live Births now DeadValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.28",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (otherPregnancyOutcomesEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Other Pregnancy OutcomesTemplateId Other Pregnancy OutcomesClassCode Other Pregnancy OutcomesCode Other Pregnancy OutcomesMoodCode Other Pregnancy OutcomesValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.30",
       "classCode", "OBS",
       "moodCode", "EVN",
       "constraints.validation.warning", "Other Pregnancy OutcomesEffectiveTime"
       });																										
    addAnnotation
      (birthReportingInfectionsPresentEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Birth Reporting - Infections PresentTemplateId Birth Reporting - Infections PresentClassCode Birth Reporting - Infections PresentCode Birth Reporting - Infections PresentMoodCode Birth Reporting - Infections PresentValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.13",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (laborandDeliverySectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Labor and Delivery SectionTemplateId Labor and Delivery SectionClassCode Labor and Delivery SectionCode Labor and Delivery SectionMoodCode Labor and Delivery SectionText Labor and Delivery SectionLabor and Delivery Information",
       "templateId.root", "2.16.840.1.113883.10.20.26.5",
       "classCode", "DOCSECT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "moodCode", "EVN",
       "constraints.validation.warning", "Labor and Delivery SectionBody Weight at Delivery"
       });																																		
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Labor and Delivery InformationTemplateId Labor and Delivery InformationClassCode Labor and Delivery InformationCode Labor and Delivery InformationMoodCode Labor and Delivery InformationParticipant Labor and Delivery InformationPerformer Labor and Delivery InformationAttendantParticipation Labor and Delivery InformationTransferAssociation Labor and Delivery InformationMaternal Morbidities Labor and Delivery InformationCharacteristics of Labor and Delivery Labor and Delivery InformationLabor Onsets Labor and Delivery InformationObstetric Procedures Labor and Delivery InformationAttempted Forceps Delivery Labor and Delivery InformationAttempted Vacuum Extraction Labor and Delivery InformationFetal Presentation Labor and Delivery InformationRoute and Method of Delivery",
       "templateId.root", "2.16.840.1.113883.10.20.26.22",
       "classCode", "ACT",
       "moodCode", "EVN",
       "constraints.validation.warning", "Labor and Delivery InformationHomeBirthPlanAssociation Labor and Delivery InformationEntryRelationship Labor and Delivery InformationBody Weight at Delivery",
       "constraints.validation.info", "Labor and Delivery InformationHysterotomyHysterectomyAssociation"
       });																																																																																																																					
    addAnnotation
      (maternalMorbiditiesEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Maternal MorbiditiesTemplateId Maternal MorbiditiesClassCode Maternal MorbiditiesCode Maternal MorbiditiesMoodCode Maternal MorbiditiesValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.25",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (characteristicsofLaborandDeliveryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Characteristics of Labor and DeliveryTemplateId Characteristics of Labor and DeliveryClassCode Characteristics of Labor and DeliveryCode Characteristics of Labor and DeliveryMoodCode Characteristics of Labor and DeliveryValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.15",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (laborOnsetsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Labor OnsetsTemplateId Labor OnsetsClassCode Labor OnsetsCode Labor OnsetsMoodCode Labor OnsetsValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.23",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (obstetricProceduresEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Obstetric ProceduresTemplateId Obstetric ProceduresClassCode Obstetric ProceduresCode Obstetric ProceduresMoodCode Obstetric ProceduresValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.29",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (attemptedForcepsDeliveryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Attempted Forceps DeliveryTemplateId Attempted Forceps DeliveryClassCode Attempted Forceps DeliveryCode Attempted Forceps DeliveryMoodCode Attempted Forceps DeliveryValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.10",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (attemptedVacuumExtractionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Attempted Vacuum ExtractionTemplateId Attempted Vacuum ExtractionClassCode Attempted Vacuum ExtractionCode Attempted Vacuum ExtractionMoodCode Attempted Vacuum ExtractionValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.11",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (fetalPresentationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Fetal PresentationTemplateId Fetal PresentationClassCode Fetal PresentationCode Fetal PresentationMoodCode Fetal PresentationValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.20",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (routeandMethodofDeliveryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Route and Method of DeliveryTemplateId Route and Method of DeliveryClassCode Route and Method of DeliveryCode Route and Method of DeliveryMoodCode Route and Method of DeliveryValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.35",
       "classCode", "OBS",
       "moodCode", "EVN",
       "constraints.validation.info", "Route and Method of DeliveryEntryRelationship"
       });																												
    addAnnotation
      (bodyWeightatDeliveryEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Body Weight at DeliveryTemplateId Body Weight at DeliveryClassCode Body Weight at DeliveryCode Body Weight at DeliveryValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.14",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																		
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Newborn SectionTemplateId Newborn SectionClassCode Newborn SectionCode Newborn SectionMoodCode Newborn SectionText Newborn SectionSubject Newborn SectionApgar Score Newborn SectionPlurality Newborn SectionCongenital Anomalies of the Newborn Newborn SectionWeight",
       "templateId.root", "2.16.840.1.113883.10.20.26.6",
       "classCode", "DOCSECT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "moodCode", "EVN",
       "constraints.validation.warning", "Newborn SectionEstimate of Gestation",
       "constraints.validation.info", "Newborn SectionBirth Order Newborn SectionNumber of Infants Born Alive"
       });																																																																															
    addAnnotation
      (estimateofGestationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Estimate of GestationTemplateId Estimate of GestationClassCode Estimate of GestationCode Estimate of GestationMoodCode Estimate of GestationValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.18",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (apgarScoreEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Apgar ScoreTemplateId Apgar ScoreClassCode Apgar ScoreCode Apgar ScoreMoodCode Apgar ScoreValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.9",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (pluralityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PluralityTemplateId PluralityClassCode PluralityCode PluralityMoodCode PluralityValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.31",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (birthOrderEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Birth OrderTemplateId Birth OrderClassCode Birth OrderCode Birth OrderCodeP Birth OrderMoodCode Birth OrderValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.12",
       "classCode", "OBS",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																										
    addAnnotation
      (numberofInfantsBornAliveEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Number of Infants Born AliveTemplateId Number of Infants Born AliveClassCode Number of Infants Born AliveCode Number of Infants Born AliveMoodCode Number of Infants Born AliveValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.27",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (congenitalAnomaliesoftheNewbornEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Congenital Anomalies of the NewbornTemplateId Congenital Anomalies of the NewbornClassCode Congenital Anomalies of the NewbornCode Congenital Anomalies of the NewbornMoodCode Congenital Anomalies of the NewbornValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.16",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																								
    addAnnotation
      (weightEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "WeightTemplateId WeightClassCode WeightCode WeightMoodCode WeightValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.36",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (fetalDeathReportingPrenatalExperienceSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Fetal Death Reporting - Prenatal Experience SectionTemplateId Fetal Death Reporting - Prenatal Experience SectionClassCode Fetal Death Reporting - Prenatal Experience SectionCode Fetal Death Reporting - Prenatal Experience SectionMoodCode Fetal Death Reporting - Prenatal Experience SectionText Fetal Death Reporting - Prenatal Experience SectionPre-Natal Care Fetal Death Reporting - Prenatal Experience SectionRisk Factor Fetal Death Reporting - Prenatal Experience SectionFetal Death Reporting - Infections Present",
       "templateId.root", "2.16.840.1.113883.10.20.26.4",
       "classCode", "DOCSECT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "moodCode", "EVN",
       "constraints.validation.info", "Fetal Death Reporting - Prenatal Experience SectionHeight",
       "constraints.validation.warning", "Fetal Death Reporting - Prenatal Experience SectionDate of Last Live Birth Fetal Death Reporting - Prenatal Experience SectionNumber of Births Still Living Fetal Death Reporting - Prenatal Experience SectionNumber of Live Births now Dead Fetal Death Reporting - Prenatal Experience SectionOther Preganancy Outcomes"
       });																																																																								
    addAnnotation
      (fetalDeathReportingInfectionsPresentEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Fetal Death Reporting - Infections PresentTemplateId Fetal Death Reporting - Infections PresentClassCode Fetal Death Reporting - Infections PresentCode Fetal Death Reporting - Infections PresentMoodCode Fetal Death Reporting - Infections PresentValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.19",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Fetus SectionTemplateId Fetus SectionClassCode Fetus SectionCode Fetus SectionMoodCode Fetus SectionText Fetus SectionSubject Fetus SectionAbnormal Conditions of the Newborn Fetus SectionNumber of Infants Born Alive Fetus SectionCongenital Anomalies of the Newborn2 Fetus SectionWeight",
       "templateId.root", "2.16.840.1.113883.10.20.26.7",
       "classCode", "DOCSECT",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC",
       "moodCode", "EVN",
       "constraints.validation.info", "Fetus SectionBirth Order"
       });																																																														
    addAnnotation
      (abnormalConditionsoftheNewbornEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Abnormal Conditions of the NewbornTemplateId Abnormal Conditions of the NewbornClassCode Abnormal Conditions of the NewbornCode Abnormal Conditions of the NewbornMoodCode Abnormal Conditions of the NewbornValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.8",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Reporting Fetal Death Information from a clinical setting to vital recordsTemplateId Reporting Fetal Death Information from a clinical setting to vital recordsCode Reporting Fetal Death Information from a clinical setting to vital recordsCodeP Reporting Fetal Death Information from a clinical setting to vital recordsConfidentialityCode Reporting Fetal Death Information from a clinical setting to vital recordsConfidentialityCodeP Reporting Fetal Death Information from a clinical setting to vital recordsEffectiveTime Reporting Fetal Death Information from a clinical setting to vital recordsId Reporting Fetal Death Information from a clinical setting to vital recordsLanguageCode Reporting Fetal Death Information from a clinical setting to vital recordsMoodCode Reporting Fetal Death Information from a clinical setting to vital recordsRealmCode Reporting Fetal Death Information from a clinical setting to vital recordsRealmCodeP Reporting Fetal Death Information from a clinical setting to vital recordsAuthor Reporting Fetal Death Information from a clinical setting to vital recordsCustodian Reporting Fetal Death Information from a clinical setting to vital recordsRecordTarget Reporting Fetal Death Information from a clinical setting to vital recordsFetal Death Reporting - Prenatal Experience Section Reporting Fetal Death Information from a clinical setting to vital recordsLabor and Delivery Section Reporting Fetal Death Information from a clinical setting to vital recordsFetus Section",
       "templateId.root", "2.16.840.1.113883.10.20.26.2",
       "classCode", "DOCCLIN",
       "code.codeSystem", "2.16.840.1.113883.6.1",
       "code.codeSystemName", "LOINC"
       });																																																																																						
    addAnnotation
      (prepregnancyBodyWeightEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Pre-pregnancy Body WeightTemplateId Pre-pregnancy Body WeightClassCode Pre-pregnancy Body WeightCode Pre-pregnancy Body WeightMoodCode Pre-pregnancy Body WeightValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.33",
       "classCode", "OBS",
       "moodCode", "EVN"
       });																						
    addAnnotation
      (riskFactorsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "Risk FactorsTemplateId Risk FactorsClassCode Risk FactorsCode Risk FactorsMoodCode Risk FactorsValue",
       "templateId.root", "2.16.840.1.113883.10.20.26.34",
       "classCode", "OBS",
       "moodCode", "EVN",
       "constraints.validation.info", "Risk FactorsEntryRelationship"
       });																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthor";			
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "AUT",
       "constraints.validation.error", "AuthorAssignedAuthor"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor";				
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.warning", "AssignedAuthorId"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTarget";					
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RCT",
       "constraints.validation.error", "RecordTargetTypeCode RecordTargetPatientRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole";						
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.warning", "PatientRoleAddr",
       "constraints.validation.error", "PatientRoleId PatientRoleClassCode",
       "classCode", "PAT"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient";							
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "classCode", "PSN",
       "constraints.validation.error", "PatientClassCode PatientDeterminerCode PatientName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingBirthInformationfromaclinicalsettingtovitalrecordsCustodian";								
    addAnnotation
      (reportingBirthInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "CST",
       "constraints.validation.error", "CustodianTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPreNatalCareprenatalVisitsAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrPreNatalCareprenatalVisitsAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPreNatalCareprenatalVisitsAssociation";																																																																																																																																																																			
    addAnnotation
      (preNatalCareEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "prenatalVisitsAssociationTypeCode prenatalVisitsAssociationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPreNatalCareprenatalVisitsAssociationpreNatalVisitNumber</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrPreNatalCareprenatalVisitsAssociationpreNatalVisitNumberAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrPreNatalCareprenatalVisitsAssociationpreNatalVisitNumber";																																																																																																																																																																				
    addAnnotation
      (preNatalCareEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "preNatalVisitNumberClassCode preNatalVisitNumberCode preNatalVisitNumberMoodCode preNatalVisitNumberValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationparticipatingLocationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocation";																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "LOC",
       "constraints.validation.error", "participatingLocationTypeCode participatingLocationParticipantRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationparticipatingLocationLocationRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRole";																																																																																																																																																																																																																																																																																																																																																																																							
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "LocationRoleAddr",
       "classCode", "ROL",
       "constraints.validation.error", "LocationRoleClassCode LocationRoleCode",
       "constraints.validation.warning", "LocationRoleId LocationRolePlayingEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationparticipatingLocationLocationRoleLocation";																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.info", "LocationDesc",
       "constraints.validation.warning", "LocationName",
       "classCode", "PLC",
       "constraints.validation.error", "LocationClassCode LocationDeterminerCode",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationattendantParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipation";																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "PRF",
       "constraints.validation.error", "attendantParticipationTypeCode attendantParticipationAssignedEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationattendantParticipationattendantRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRole";																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "ASSIGNED",
       "constraints.validation.error", "attendantRoleClassCode attendantRoleId attendantRoleCode attendantRoleAssignedPerson"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendant</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendantAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationattendantParticipationattendantRoleAttendant";																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "PSN",
       "constraints.validation.error", "AttendantClassCode AttendantDeterminerCode AttendantName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationcertifierParticipation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationcertifierParticipationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationcertifierParticipation";																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "PRF",
       "constraints.validation.error", "certifierParticipationTypeCode certifierParticipationAssignedEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransfer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransfer";																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "maternalTransferClassCode maternalTransferCode maternalTransferMoodCode maternalTransferValue",
       "moodCode", "EVN",
       "constraints.validation.info", "maternalTransferParticipant"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacility";																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "ORG",
       "constraints.validation.error", "TransferFacilityTypeCode TransferFacilityParticipantRole"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRole";																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "PROV",
       "constraints.validation.error", "TransferFacilityRoleClassCode TransferFacilityRolePlayingEntity"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationtransferAssociationmaternalTransferTransferFacilityTransferFacilityRoleFacility";																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "ENT",
       "constraints.validation.error", "FacilityClassCode FacilityDeterminerCode FacilityName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationhomeBirthPlanAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociation";																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "homeBirthPlanAssociationTypeCode homeBirthPlanAssociationHomeBirthPlan"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociationhomeBirthPlan</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationhomeBirthPlanAssociationhomeBirthPlanAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhomeBirthPlanAssociationhomeBirthPlan";																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "homeBirthPlanClassCode homeBirthPlanCode homeBirthPlanMoodCode homeBirthPlanValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationpaymentSourceAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociation";																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "paymentSourceAssociationTypeCode paymentSourceAssociationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSource</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSourceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationpaymentSourceAssociationpaymentSource";																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "paymentSourceClassCode paymentSourceCode paymentSourceMoodCode paymentSourceValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociation";																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "hysterotomyHysterectomyAssociationTypeCode hysterotomyHysterectomyAssociationHysterotomyHysterectomy"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationhysterotomyHysterectomy</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationhysterotomyHysterectomyAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrLaborandDeliveryInformationhysterotomyHysterectomyAssociationhysterotomyHysterectomy";																																																																																																																																																																																																																																																																																																																																																																																																						
    addAnnotation
      (laborandDeliveryInformationEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "hysterotomyHysterectomyClassCode hysterotomyHysterectomyCode hysterotomyHysterectomyMoodCode hysterotomyHysterectomyValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubject</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectionNewbornSubjectAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubject";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "SBJ",
       "constraints.validation.error", "NewbornSubjectTypeCode NewbornSubjectRelatedSubject"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewborn</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectionNewbornSubjectRoleOfNewbornAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewborn";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "PRS",
       "constraints.validation.error", "RoleOfNewbornClassCode RoleOfNewbornSubject"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewbornNewborn</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectionNewbornSubjectRoleOfNewbornNewbornAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectionNewbornSubjectRoleOfNewbornNewborn";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "NewbornBirthTime NewbornClassCode NewbornName NewbornSDTCId NewbornAdministrativeGenderCode NewbornAdministrativeGenderCodeP",
       "classCode", "PSN",
       "determinerCode", "INSTANCE",
       "administrativeGenderCode.codeSystem", "2.16.840.1.113883.5.1",
       "administrativeGenderCode.codeSystemName", "AdministrativeGenderCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransfer</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectiontransferAssociationinfantTransferAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransfer";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "infantTransferClassCode infantTransferCode infantTransferMoodCode infantTransferValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacility";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "ORG",
       "constraints.validation.error", "TransferFacilityTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "PROV",
       "constraints.validation.error", "TransferFacilityRoleClassCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleFacility</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleFacilityAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectiontransferAssociationinfantTransferTransferFacilityTransferFacilityRoleFacility";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "ENT",
       "constraints.validation.error", "FacilityClassCode FacilityDeterminerCode FacilityName",
       "determinerCode", "INSTANCE"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectioninfantLivingAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "infantLivingAssociationTypeCode infantLivingAssociationInfantLiving"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociationinfantLiving</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectioninfantLivingAssociationinfantLivingAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantLivingAssociationinfantLiving";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "infantLivingClassCode infantLivingCode infantLivingMoodCode infantLivingValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectioninfantBreastfedAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "infantBreastfedAssociationTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociationinfantBreastfed</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrNewbornSectioninfantBreastfedAssociationinfantBreastfedAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornSectioninfantBreastfedAssociationinfantBreastfed";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (newbornSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "infantBreastfedClassCode infantBreastfedCode infantBreastfedMoodCode infantBreastfedValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
    addAnnotation
      (congenitalAnomaliesoftheNewbornEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "infantBreastfedAssociationTypeCode"
       });																																																																																																																																																																																																																																																																																																																																																													
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationinfantBreastfed</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationinfantBreastfedAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrCongenitalAnomaliesoftheNewborninfantBreastfedAssociationinfantBreastfed";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
    addAnnotation
      (congenitalAnomaliesoftheNewbornEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "infantBreastfedClassCode infantBreastfedCode infantBreastfedMoodCode infantBreastfedValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																												
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectiontimeOfDeathAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrFetusSectiontimeOfDeathAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectiontimeOfDeathAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "timeOfDeathAssociationTypeCode timeOfDeathAssociationAct"
       });																																																																																																																																																																																																																					
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectiontimeOfDeathAssociationfetalDeath</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrFetusSectiontimeOfDeathAssociationfetalDeathAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectiontimeOfDeathAssociationfetalDeath";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "ACT",
       "constraints.validation.error", "fetalDeathClassCode fetalDeathCode fetalDeathEffectiveTime fetalDeathMoodCode",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectionautopsyPerformanceAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrFetusSectionautopsyPerformanceAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectionautopsyPerformanceAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "autopsyPerformanceAssociationTypeCode autopsyPerformanceAssociationAutopsyPerformance"
       });																																																																																																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectionautopsyPerformanceAssociationautopsyPerformance</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrFetusSectionautopsyPerformanceAssociationautopsyPerformanceAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectionautopsyPerformanceAssociationautopsyPerformance";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "autopsyPerformanceClassCode autopsyPerformanceCode autopsyPerformanceMoodCode autopsyPerformanceValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectioninfantBreastfedAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrFetusSectioninfantBreastfedAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectioninfantBreastfedAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "infantBreastfedAssociationTypeCode"
       });																																																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectioninfantBreastfedAssociationinfantBreastfed</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrFetusSectioninfantBreastfedAssociationinfantBreastfedAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrFetusSectioninfantBreastfedAssociationinfantBreastfed";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (fetusSectionEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "infantBreastfedClassCode infantBreastfedCode infantBreastfedMoodCode infantBreastfedValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthor";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "AUT",
       "constraints.validation.error", "AuthorAssignedAuthor"
       });																																																																																																																																			
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.warning", "AssignedAuthorId",
       "constraints.validation.error", "AssignedAuthorAssignedPerson"
       });																																																																																																																																		
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTarget";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "RCT",
       "constraints.validation.error", "RecordTargetTypeCode RecordTargetPatientRole"
       });																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRoleAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRole";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																	
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.warning", "PatientRoleAddr",
       "constraints.validation.error", "PatientRoleId PatientRoleClassCode",
       "classCode", "PAT"
       });																																																																																																																																
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatientAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsRecordTargetPatientRolePatient";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "classCode", "PSN",
       "constraints.validation.error", "PatientClassCode PatientDeterminerCode PatientName",
       "determinerCode", "INSTANCE"
       });																																																																																																																															
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodianAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsCustodian";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
    addAnnotation
      (reportingFetalDeathInformationfromaclinicalsettingtovitalrecordsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "CST",
       "constraints.validation.error", "CustodianTypeCode"
       });																																																																																																																														
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRiskFactorsCesareanAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrRiskFactorsCesareanAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRiskFactorsCesareanAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								
    addAnnotation
      (riskFactorsEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "CesareanAssociationTypeCode CesareanAssociationObservation"
       });																									
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRiskFactorsCesareanAssociationNumberOfCesarianDeliveries</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrRiskFactorsCesareanAssociationNumberOfCesarianDeliveriesAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRiskFactorsCesareanAssociationNumberOfCesarianDeliveries";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
    addAnnotation
      (riskFactorsEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "NumberOfCesarianDeliveriesClassCode NumberOfCesarianDeliveriesCode NumberOfCesarianDeliveriesMoodCode NumberOfCesarianDeliveriesValue",
       "moodCode", "EVN"
       });																								
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRouteandMethodofDeliveryTrialOfLaborAssociation</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrRouteandMethodofDeliveryTrialOfLaborAssociationAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRouteandMethodofDeliveryTrialOfLaborAssociation";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
    addAnnotation
      (routeandMethodofDeliveryEClass, 
       source, 
       new String[] 
       {
       "typeCode", "COMP",
       "constraints.validation.error", "TrialOfLaborAssociationTypeCode TrialOfLaborAssociationObservation"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRouteandMethodofDeliveryTrialOfLaborAssociationTrialOfLabor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createVsbrRouteandMethodofDeliveryTrialOfLaborAssociationTrialOfLaborAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrRouteandMethodofDeliveryTrialOfLaborAssociationTrialOfLabor";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
    addAnnotation
      (routeandMethodofDeliveryEClass, 
       source, 
       new String[] 
       {
       "classCode", "OBS",
       "constraints.validation.error", "TrialOfLaborClassCode TrialOfLaborCode TrialOfLaborMoodCode TrialOfLaborValue",
       "moodCode", "EVN"
       });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
  }

} //VsbrPackageImpl
