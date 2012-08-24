/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SalmonellosisFactoryImpl extends EFactoryImpl implements SalmonellosisFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SalmonellosisFactory init()
  {
    try
    {
      SalmonellosisFactory theSalmonellosisFactory = (SalmonellosisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/salmonellosis"); 
      if (theSalmonellosisFactory != null)
      {
        return theSalmonellosisFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SalmonellosisFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisFactoryImpl()
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
      case SalmonellosisPackage.SALMONELLOSIS_CASE_REPORT: return createSalmonellosisCaseReport();
      case SalmonellosisPackage.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION: return createSalmonellosisPHCRSocialHistorySection();
      case SalmonellosisPackage.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT: return createSalmonellosisPossibleExposureLocationAndTypeAct();
      case SalmonellosisPackage.HIV_STATUS_OBSERVATION: return createHIVStatusObservation();
      case SalmonellosisPackage.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION: return createSalmonellosisPHCRRelevantDxTestsSection();
      case SalmonellosisPackage.SALMONELLOSIS_RESULT_ORGANIZER: return createSalmonellosisResultOrganizer();
      case SalmonellosisPackage.SALMONELLOSIS_RESULT_OBSERVATION: return createSalmonellosisResultObservation();
      case SalmonellosisPackage.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION: return createSalmonellosisPHCRClinicalInformationSection();
      case SalmonellosisPackage.SALMONELLOSIS_CASE_OBSERVATION: return createSalmonellosisCaseObservation();
      case SalmonellosisPackage.SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION: return createSalmonellosisSignsAndSymptomsObservation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisCaseReport createSalmonellosisCaseReport()
  {
    SalmonellosisCaseReportImpl salmonellosisCaseReport = new SalmonellosisCaseReportImpl();
    return salmonellosisCaseReport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRSocialHistorySection createSalmonellosisPHCRSocialHistorySection()
  {
    SalmonellosisPHCRSocialHistorySectionImpl salmonellosisPHCRSocialHistorySection = new SalmonellosisPHCRSocialHistorySectionImpl();
    return salmonellosisPHCRSocialHistorySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPossibleExposureLocationAndTypeAct createSalmonellosisPossibleExposureLocationAndTypeAct()
  {
    SalmonellosisPossibleExposureLocationAndTypeActImpl salmonellosisPossibleExposureLocationAndTypeAct = new SalmonellosisPossibleExposureLocationAndTypeActImpl();
    return salmonellosisPossibleExposureLocationAndTypeAct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HIVStatusObservation createHIVStatusObservation()
  {
    HIVStatusObservationImpl hivStatusObservation = new HIVStatusObservationImpl();
    return hivStatusObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRRelevantDxTestsSection createSalmonellosisPHCRRelevantDxTestsSection()
  {
    SalmonellosisPHCRRelevantDxTestsSectionImpl salmonellosisPHCRRelevantDxTestsSection = new SalmonellosisPHCRRelevantDxTestsSectionImpl();
    return salmonellosisPHCRRelevantDxTestsSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisResultOrganizer createSalmonellosisResultOrganizer()
  {
    SalmonellosisResultOrganizerImpl salmonellosisResultOrganizer = new SalmonellosisResultOrganizerImpl();
    return salmonellosisResultOrganizer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisResultObservation createSalmonellosisResultObservation()
  {
    SalmonellosisResultObservationImpl salmonellosisResultObservation = new SalmonellosisResultObservationImpl();
    return salmonellosisResultObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPHCRClinicalInformationSection createSalmonellosisPHCRClinicalInformationSection()
  {
    SalmonellosisPHCRClinicalInformationSectionImpl salmonellosisPHCRClinicalInformationSection = new SalmonellosisPHCRClinicalInformationSectionImpl();
    return salmonellosisPHCRClinicalInformationSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisCaseObservation createSalmonellosisCaseObservation()
  {
    SalmonellosisCaseObservationImpl salmonellosisCaseObservation = new SalmonellosisCaseObservationImpl();
    return salmonellosisCaseObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisSignsAndSymptomsObservation createSalmonellosisSignsAndSymptomsObservation()
  {
    SalmonellosisSignsAndSymptomsObservationImpl salmonellosisSignsAndSymptomsObservation = new SalmonellosisSignsAndSymptomsObservationImpl();
    return salmonellosisSignsAndSymptomsObservation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalmonellosisPackage getSalmonellosisPackage()
  {
    return (SalmonellosisPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SalmonellosisPackage getPackage()
  {
    return SalmonellosisPackage.eINSTANCE;
  }

} //SalmonellosisFactoryImpl
