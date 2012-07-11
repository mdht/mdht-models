/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;

import org.openhealthtools.mdht.uml.cda.vsbr.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage
 * @generated
 */
public class VsbrAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VsbrPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsbrAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VsbrPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected VsbrSwitch<Adapter> modelSwitch =
    new VsbrSwitch<Adapter>()
    {
      @Override
      public Adapter caseReportingBirthInformationfromaclinicalsettingtovitalrecords(ReportingBirthInformationfromaclinicalsettingtovitalrecords object)
      {
        return createReportingBirthInformationfromaclinicalsettingtovitalrecordsAdapter();
      }
      @Override
      public Adapter caseBirthReportingPrenatalExperienceSection(BirthReportingPrenatalExperienceSection object)
      {
        return createBirthReportingPrenatalExperienceSectionAdapter();
      }
      @Override
      public Adapter casePreNatalCare(PreNatalCare object)
      {
        return createPreNatalCareAdapter();
      }
      @Override
      public Adapter caseHeight(Height object)
      {
        return createHeightAdapter();
      }
      @Override
      public Adapter caseDateofLastLiveBirth(DateofLastLiveBirth object)
      {
        return createDateofLastLiveBirthAdapter();
      }
      @Override
      public Adapter caseLastMenstrualPeriodDate(LastMenstrualPeriodDate object)
      {
        return createLastMenstrualPeriodDateAdapter();
      }
      @Override
      public Adapter caseNumberofBirthsStillLiving(NumberofBirthsStillLiving object)
      {
        return createNumberofBirthsStillLivingAdapter();
      }
      @Override
      public Adapter caseNumberofLiveBirthsnowDead(NumberofLiveBirthsnowDead object)
      {
        return createNumberofLiveBirthsnowDeadAdapter();
      }
      @Override
      public Adapter caseOtherPregnancyOutcomes(OtherPregnancyOutcomes object)
      {
        return createOtherPregnancyOutcomesAdapter();
      }
      @Override
      public Adapter caseBirthReportingInfectionsPresent(BirthReportingInfectionsPresent object)
      {
        return createBirthReportingInfectionsPresentAdapter();
      }
      @Override
      public Adapter caseLaborandDeliverySection(LaborandDeliverySection object)
      {
        return createLaborandDeliverySectionAdapter();
      }
      @Override
      public Adapter caseLaborandDeliveryInformation(LaborandDeliveryInformation object)
      {
        return createLaborandDeliveryInformationAdapter();
      }
      @Override
      public Adapter caseMaternalMorbidities(MaternalMorbidities object)
      {
        return createMaternalMorbiditiesAdapter();
      }
      @Override
      public Adapter caseCharacteristicsofLaborandDelivery(CharacteristicsofLaborandDelivery object)
      {
        return createCharacteristicsofLaborandDeliveryAdapter();
      }
      @Override
      public Adapter caseLaborOnsets(LaborOnsets object)
      {
        return createLaborOnsetsAdapter();
      }
      @Override
      public Adapter caseObstetricProcedures(ObstetricProcedures object)
      {
        return createObstetricProceduresAdapter();
      }
      @Override
      public Adapter caseAttemptedForcepsDelivery(AttemptedForcepsDelivery object)
      {
        return createAttemptedForcepsDeliveryAdapter();
      }
      @Override
      public Adapter caseAttemptedVacuumExtraction(AttemptedVacuumExtraction object)
      {
        return createAttemptedVacuumExtractionAdapter();
      }
      @Override
      public Adapter caseFetalPresentation(FetalPresentation object)
      {
        return createFetalPresentationAdapter();
      }
      @Override
      public Adapter caseRouteandMethodofDelivery(RouteandMethodofDelivery object)
      {
        return createRouteandMethodofDeliveryAdapter();
      }
      @Override
      public Adapter caseBodyWeightatDelivery(BodyWeightatDelivery object)
      {
        return createBodyWeightatDeliveryAdapter();
      }
      @Override
      public Adapter caseNewbornSection(NewbornSection object)
      {
        return createNewbornSectionAdapter();
      }
      @Override
      public Adapter caseEstimateofGestation(EstimateofGestation object)
      {
        return createEstimateofGestationAdapter();
      }
      @Override
      public Adapter caseApgarScore(ApgarScore object)
      {
        return createApgarScoreAdapter();
      }
      @Override
      public Adapter casePlurality(Plurality object)
      {
        return createPluralityAdapter();
      }
      @Override
      public Adapter caseBirthOrder(BirthOrder object)
      {
        return createBirthOrderAdapter();
      }
      @Override
      public Adapter caseNumberofInfantsBornAlive(NumberofInfantsBornAlive object)
      {
        return createNumberofInfantsBornAliveAdapter();
      }
      @Override
      public Adapter caseCongenitalAnomaliesoftheNewborn(CongenitalAnomaliesoftheNewborn object)
      {
        return createCongenitalAnomaliesoftheNewbornAdapter();
      }
      @Override
      public Adapter caseWeight(Weight object)
      {
        return createWeightAdapter();
      }
      @Override
      public Adapter caseFetalDeathReportingPrenatalExperienceSection(FetalDeathReportingPrenatalExperienceSection object)
      {
        return createFetalDeathReportingPrenatalExperienceSectionAdapter();
      }
      @Override
      public Adapter caseFetalDeathReportingInfectionsPresent(FetalDeathReportingInfectionsPresent object)
      {
        return createFetalDeathReportingInfectionsPresentAdapter();
      }
      @Override
      public Adapter caseFetusSection(FetusSection object)
      {
        return createFetusSectionAdapter();
      }
      @Override
      public Adapter caseAbnormalConditionsoftheNewborn(AbnormalConditionsoftheNewborn object)
      {
        return createAbnormalConditionsoftheNewbornAdapter();
      }
      @Override
      public Adapter caseReportingFetalDeathInformationfromaclinicalsettingtovitalrecords(ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords object)
      {
        return createReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAdapter();
      }
      @Override
      public Adapter casePrepregnancyBodyWeight(PrepregnancyBodyWeight object)
      {
        return createPrepregnancyBodyWeightAdapter();
      }
      @Override
      public Adapter caseRiskFactors(RiskFactors object)
      {
        return createRiskFactorsAdapter();
      }
      @Override
      public Adapter caseInfrastructureRoot(InfrastructureRoot object)
      {
        return createInfrastructureRootAdapter();
      }
      @Override
      public Adapter caseAct(Act object)
      {
        return createActAdapter();
      }
      @Override
      public Adapter caseClinicalDocument(ClinicalDocument object)
      {
        return createClinicalDocumentAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseClinicalStatement(ClinicalStatement object)
      {
        return createClinicalStatementAdapter();
      }
      @Override
      public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
      {
        return createCDA_ActAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords <em>Reporting Birth Informationfromaclinicalsettingtovitalrecords</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.ReportingBirthInformationfromaclinicalsettingtovitalrecords
   * @generated
   */
  public Adapter createReportingBirthInformationfromaclinicalsettingtovitalrecordsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection <em>Birth Reporting Prenatal Experience Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingPrenatalExperienceSection
   * @generated
   */
  public Adapter createBirthReportingPrenatalExperienceSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare <em>Pre Natal Care</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare
   * @generated
   */
  public Adapter createPreNatalCareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection <em>Laborand Delivery Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection
   * @generated
   */
  public Adapter createLaborandDeliverySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation <em>Laborand Delivery Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation
   * @generated
   */
  public Adapter createLaborandDeliveryInformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection <em>Newborn Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.NewbornSection
   * @generated
   */
  public Adapter createNewbornSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection <em>Fetal Death Reporting Prenatal Experience Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingPrenatalExperienceSection
   * @generated
   */
  public Adapter createFetalDeathReportingPrenatalExperienceSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetusSection <em>Fetus Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.FetusSection
   * @generated
   */
  public Adapter createFetusSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords <em>Reporting Fetal Death Informationfromaclinicalsettingtovitalrecords</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.ReportingFetalDeathInformationfromaclinicalsettingtovitalrecords
   * @generated
   */
  public Adapter createReportingFetalDeathInformationfromaclinicalsettingtovitalrecordsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.Height <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.Height
   * @generated
   */
  public Adapter createHeightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery <em>Body Weightat Delivery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery
   * @generated
   */
  public Adapter createBodyWeightatDeliveryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight <em>Prepregnancy Body Weight</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight
   * @generated
   */
  public Adapter createPrepregnancyBodyWeightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving <em>Numberof Births Still Living</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsStillLiving
   * @generated
   */
  public Adapter createNumberofBirthsStillLivingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth <em>Dateof Last Live Birth</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.DateofLastLiveBirth
   * @generated
   */
  public Adapter createDateofLastLiveBirthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead <em>Numberof Live Birthsnow Dead</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsnowDead
   * @generated
   */
  public Adapter createNumberofLiveBirthsnowDeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes <em>Other Pregnancy Outcomes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes
   * @generated
   */
  public Adapter createOtherPregnancyOutcomesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate <em>Last Menstrual Period Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate
   * @generated
   */
  public Adapter createLastMenstrualPeriodDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent <em>Birth Reporting Infections Present</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.BirthReportingInfectionsPresent
   * @generated
   */
  public Adapter createBirthReportingInfectionsPresentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets <em>Labor Onsets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets
   * @generated
   */
  public Adapter createLaborOnsetsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent <em>Fetal Death Reporting Infections Present</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathReportingInfectionsPresent
   * @generated
   */
  public Adapter createFetalDeathReportingInfectionsPresentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures <em>Obstetric Procedures</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures
   * @generated
   */
  public Adapter createObstetricProceduresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors <em>Risk Factors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors
   * @generated
   */
  public Adapter createRiskFactorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery <em>Characteristicsof Laborand Delivery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicsofLaborandDelivery
   * @generated
   */
  public Adapter createCharacteristicsofLaborandDeliveryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities <em>Maternal Morbidities</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities
   * @generated
   */
  public Adapter createMaternalMorbiditiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn <em>Abnormal Conditionsofthe Newborn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionsoftheNewborn
   * @generated
   */
  public Adapter createAbnormalConditionsoftheNewbornAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn <em>Congenital Anomaliesofthe Newborn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaliesoftheNewborn
   * @generated
   */
  public Adapter createCongenitalAnomaliesoftheNewbornAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery <em>Attempted Forceps Delivery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.AttemptedForcepsDelivery
   * @generated
   */
  public Adapter createAttemptedForcepsDeliveryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction <em>Attempted Vacuum Extraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.AttemptedVacuumExtraction
   * @generated
   */
  public Adapter createAttemptedVacuumExtractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation <em>Fetal Presentation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation
   * @generated
   */
  public Adapter createFetalPresentationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery <em>Routeand Methodof Delivery</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.RouteandMethodofDelivery
   * @generated
   */
  public Adapter createRouteandMethodofDeliveryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.Weight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.Weight
   * @generated
   */
  public Adapter createWeightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation <em>Estimateof Gestation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation
   * @generated
   */
  public Adapter createEstimateofGestationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore <em>Apgar Score</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore
   * @generated
   */
  public Adapter createApgarScoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality <em>Plurality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.Plurality
   * @generated
   */
  public Adapter createPluralityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive <em>Numberof Infants Born Alive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive
   * @generated
   */
  public Adapter createNumberofInfantsBornAliveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder <em>Birth Order</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder
   * @generated
   */
  public Adapter createBirthOrderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
   * @generated
   */
  public Adapter createInfrastructureRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.Act
   * @generated
   */
  public Adapter createActAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
   * @generated
   */
  public Adapter createClinicalDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Section
   * @generated
   */
  public Adapter createSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
   * @generated
   */
  public Adapter createClinicalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Act
   * @generated
   */
  public Adapter createCDA_ActAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Observation
   * @generated
   */
  public Adapter createObservationAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VsbrAdapterFactory
