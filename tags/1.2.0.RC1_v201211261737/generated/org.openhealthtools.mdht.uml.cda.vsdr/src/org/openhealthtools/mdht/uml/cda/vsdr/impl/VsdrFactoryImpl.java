/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.vsdr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VsdrFactoryImpl extends EFactoryImpl implements VsdrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VsdrFactory init()
  {
    try
    {
      VsdrFactory theVsdrFactory = (VsdrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/vsdr"); 
      if (theVsdrFactory != null)
      {
        return theVsdrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VsdrFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsdrFactoryImpl()
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
      case VsdrPackage.REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS: return createReportingdeathinformationfromaclinicalsettingtovitalrecords();
      case VsdrPackage.DEATH_REPORT_DOCUMENT_BODY: return createDeathReportDocumentBody();
      case VsdrPackage.TIMEOF_DEATH: return createTimeofDeath();
      case VsdrPackage.LOCATIONOF_DEATH: return createLocationofDeath();
      case VsdrPackage.DEATH_CERTIFICATION: return createDeathCertification();
      case VsdrPackage.MANNEROF_DEATH: return createMannerofDeath();
      case VsdrPackage.PREGNANCY_STATUS: return createPregnancyStatus();
      case VsdrPackage.TOBACCO_USE: return createTobaccoUse();
      case VsdrPackage.INJURY: return createInjury();
      case VsdrPackage.DEATH_CAUSAL_INFORMATION: return createDeathCausalInformation();
      case VsdrPackage.AUTOPSY_PERFORMANCE: return createAutopsyPerformance();
      case VsdrPackage.AUTOPSY_RESULTS: return createAutopsyResults();
      case VsdrPackage.CORONER_REFERRAL: return createCoronerReferral();
      case VsdrPackage.CORONER_CASE_TRANSFER: return createCoronerCaseTransfer();
      case VsdrPackage.DEATH_LOCATION_TYPE: return createDeathLocationType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reportingdeathinformationfromaclinicalsettingtovitalrecords createReportingdeathinformationfromaclinicalsettingtovitalrecords()
  {
    ReportingdeathinformationfromaclinicalsettingtovitalrecordsImpl reportingdeathinformationfromaclinicalsettingtovitalrecords = new ReportingdeathinformationfromaclinicalsettingtovitalrecordsImpl();
    return reportingdeathinformationfromaclinicalsettingtovitalrecords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathReportDocumentBody createDeathReportDocumentBody()
  {
    DeathReportDocumentBodyImpl deathReportDocumentBody = new DeathReportDocumentBodyImpl();
    return deathReportDocumentBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeofDeath createTimeofDeath()
  {
    TimeofDeathImpl timeofDeath = new TimeofDeathImpl();
    return timeofDeath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationofDeath createLocationofDeath()
  {
    LocationofDeathImpl locationofDeath = new LocationofDeathImpl();
    return locationofDeath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCertification createDeathCertification()
  {
    DeathCertificationImpl deathCertification = new DeathCertificationImpl();
    return deathCertification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MannerofDeath createMannerofDeath()
  {
    MannerofDeathImpl mannerofDeath = new MannerofDeathImpl();
    return mannerofDeath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PregnancyStatus createPregnancyStatus()
  {
    PregnancyStatusImpl pregnancyStatus = new PregnancyStatusImpl();
    return pregnancyStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TobaccoUse createTobaccoUse()
  {
    TobaccoUseImpl tobaccoUse = new TobaccoUseImpl();
    return tobaccoUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Injury createInjury()
  {
    InjuryImpl injury = new InjuryImpl();
    return injury;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathCausalInformation createDeathCausalInformation()
  {
    DeathCausalInformationImpl deathCausalInformation = new DeathCausalInformationImpl();
    return deathCausalInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyPerformance createAutopsyPerformance()
  {
    AutopsyPerformanceImpl autopsyPerformance = new AutopsyPerformanceImpl();
    return autopsyPerformance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutopsyResults createAutopsyResults()
  {
    AutopsyResultsImpl autopsyResults = new AutopsyResultsImpl();
    return autopsyResults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoronerReferral createCoronerReferral()
  {
    CoronerReferralImpl coronerReferral = new CoronerReferralImpl();
    return coronerReferral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoronerCaseTransfer createCoronerCaseTransfer()
  {
    CoronerCaseTransferImpl coronerCaseTransfer = new CoronerCaseTransferImpl();
    return coronerCaseTransfer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeathLocationType createDeathLocationType()
  {
    DeathLocationTypeImpl deathLocationType = new DeathLocationTypeImpl();
    return deathLocationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsdrPackage getVsdrPackage()
  {
    return (VsdrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VsdrPackage getPackage()
  {
    return VsdrPackage.eINSTANCE;
  }

} //VsdrFactoryImpl
