/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;
import org.openhealthtools.mdht.uml.cda.util.AnnotationBasedInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdtmPackageImpl extends EPackageImpl implements SdtmPackage
{
  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  protected String packageFilename = "sdtm.ecore";

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass subjectDataHumanClinicalTrialsEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass humanClinicalSubjectDataDocumentBodyEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass humanClinicalSubjectDemographicsEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass dataCollectionEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass eventStudyDayEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass studyArmEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass visitEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass adverseEventEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass groupIdentifierEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass bodySystemorOrganClassEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass eventSeverityEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass preSpecifiedEventEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass studyDayPeriodEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass vitalSignEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass plannedStudyDayEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exclusionReasonEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass timingReferenceEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass nonPerformanceReasonEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass ecgTestResultEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass inclusionorExclusionCriteriaNotMetEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nonhumanLaboratoryTestResultEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass specimenInformationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass physicalExaminationFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass microbiologySpecimenFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass microbiologySusceptibilityEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass pharmacokineticConcentrationFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass findingAboutEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass drugAccountabilityEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass subjectElementEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass studyEpochEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass substanceUseEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass activityStartTimingReferenceEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass activityEndTimingReferenceEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass humanClinicalDispositionEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass medicalHistoryItemEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass protocolDeviationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass clinicalEventEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass subjectCharacteristicEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass pharmacokineticParameterFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass concomitantMedicationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass consumableMaterialEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass humanClinicalExposureEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass studyTestOrganizationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass questionnaireFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass studyFindingEvaluatorEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass subjectDataNonClinicalTrialsEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nonhumanSubjectDataDocumentBodyEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nonhumanSubjectDemographicsEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nonhumanDispositionEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nonhumanExposureEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass humanClinicalLaboratoryTestResultEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass bodyWeightEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass bodyWeightGainEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass clinicalObservationEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass deathDiagnosisEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass foodandWaterConsumptionEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass macroscopicFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass microscopicFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass organMeasurementEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass palpableMassEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass tumorFindingEClass = null;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private EClass subjectPoolEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass massIdentificationEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass studySubjectInterventionEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass studySubjectEventEClass = null;

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass studySubjectFindingEClass = null;

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
     * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#eNS_URI
     * @see #init()
     * @generated
     */
  private SdtmPackageImpl()
  {
        super(eNS_URI, SdtmFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SdtmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
  public static SdtmPackage init()
  {
        if (isInited) return (SdtmPackage)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI);

        // Obtain or create and register package
        SdtmPackageImpl theSdtmPackage = (SdtmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SdtmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SdtmPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        CDAPackage.eINSTANCE.eClass();

        // Load packages
        theSdtmPackage.loadPackage();

        // Fix loaded packages
        theSdtmPackage.fixPackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSdtmPackage, 
             new EValidator.Descriptor()
             {
                 public EValidator getEValidator()
                 {
                     return SdtmValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theSdtmPackage.freeze();

  
        // publish my initializers in the registry
        Initializer.Registry.INSTANCE.registerFactory("org.openhealthtools.mdht.uml.cda.sdtm", AnnotationBasedInitializer.FACTORY);
        Initializer.Registry.INSTANCE.initializeEPackage(theSdtmPackage);
                
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SdtmPackage.eNS_URI, theSdtmPackage);
        return theSdtmPackage;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSubjectDataHumanClinicalTrials()
  {
        if (subjectDataHumanClinicalTrialsEClass == null)
        {
            subjectDataHumanClinicalTrialsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(0);
        }
        return subjectDataHumanClinicalTrialsEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getHumanClinicalSubjectDataDocumentBody()
  {
        if (humanClinicalSubjectDataDocumentBodyEClass == null)
        {
            humanClinicalSubjectDataDocumentBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(1);
        }
        return humanClinicalSubjectDataDocumentBodyEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getHumanClinicalSubjectDemographics()
  {
        if (humanClinicalSubjectDemographicsEClass == null)
        {
            humanClinicalSubjectDemographicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(2);
        }
        return humanClinicalSubjectDemographicsEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getDataCollection()
  {
        if (dataCollectionEClass == null)
        {
            dataCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(3);
        }
        return dataCollectionEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getEventStudyDay()
  {
        if (eventStudyDayEClass == null)
        {
            eventStudyDayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(4);
        }
        return eventStudyDayEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getStudyArm()
  {
        if (studyArmEClass == null)
        {
            studyArmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(5);
        }
        return studyArmEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getVisit()
  {
        if (visitEClass == null)
        {
            visitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(6);
        }
        return visitEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getAdverseEvent()
  {
        if (adverseEventEClass == null)
        {
            adverseEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(7);
        }
        return adverseEventEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getGroupIdentifier()
  {
        if (groupIdentifierEClass == null)
        {
            groupIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(8);
        }
        return groupIdentifierEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getBodySystemorOrganClass()
  {
        if (bodySystemorOrganClassEClass == null)
        {
            bodySystemorOrganClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(9);
        }
        return bodySystemorOrganClassEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getEventSeverity()
  {
        if (eventSeverityEClass == null)
        {
            eventSeverityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(10);
        }
        return eventSeverityEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPreSpecifiedEvent()
  {
        if (preSpecifiedEventEClass == null)
        {
            preSpecifiedEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(11);
        }
        return preSpecifiedEventEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getStudyDayPeriod()
  {
        if (studyDayPeriodEClass == null)
        {
            studyDayPeriodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(12);
        }
        return studyDayPeriodEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getVitalSign()
  {
        if (vitalSignEClass == null)
        {
            vitalSignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(13);
        }
        return vitalSignEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPlannedStudyDay()
  {
        if (plannedStudyDayEClass == null)
        {
            plannedStudyDayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(16);
        }
        return plannedStudyDayEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExclusionReason()
    {
        if (exclusionReasonEClass == null)
        {
            exclusionReasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(17);
        }
        return exclusionReasonEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTimingReference()
  {
        if (timingReferenceEClass == null)
        {
            timingReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(14);
        }
        return timingReferenceEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getNonPerformanceReason()
  {
        if (nonPerformanceReasonEClass == null)
        {
            nonPerformanceReasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(15);
        }
        return nonPerformanceReasonEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getECGTestResult()
  {
        if (ecgTestResultEClass == null)
        {
            ecgTestResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(18);
        }
        return ecgTestResultEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getInclusionorExclusionCriteriaNotMet()
  {
        if (inclusionorExclusionCriteriaNotMetEClass == null)
        {
            inclusionorExclusionCriteriaNotMetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(19);
        }
        return inclusionorExclusionCriteriaNotMetEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNonhumanLaboratoryTestResult()
    {
        if (nonhumanLaboratoryTestResultEClass == null)
        {
            nonhumanLaboratoryTestResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(20);
        }
        return nonhumanLaboratoryTestResultEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSpecimenInformation()
  {
        if (specimenInformationEClass == null)
        {
            specimenInformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(21);
        }
        return specimenInformationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPhysicalExaminationFinding()
  {
        if (physicalExaminationFindingEClass == null)
        {
            physicalExaminationFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(22);
        }
        return physicalExaminationFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getMicrobiologySpecimenFinding()
  {
        if (microbiologySpecimenFindingEClass == null)
        {
            microbiologySpecimenFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(23);
        }
        return microbiologySpecimenFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getMicrobiologySusceptibility()
  {
        if (microbiologySusceptibilityEClass == null)
        {
            microbiologySusceptibilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(24);
        }
        return microbiologySusceptibilityEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPharmacokineticConcentrationFinding()
  {
        if (pharmacokineticConcentrationFindingEClass == null)
        {
            pharmacokineticConcentrationFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(25);
        }
        return pharmacokineticConcentrationFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getFindingAbout()
  {
        if (findingAboutEClass == null)
        {
            findingAboutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(26);
        }
        return findingAboutEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getDrugAccountability()
  {
        if (drugAccountabilityEClass == null)
        {
            drugAccountabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(27);
        }
        return drugAccountabilityEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSubjectElement()
  {
        if (subjectElementEClass == null)
        {
            subjectElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(28);
        }
        return subjectElementEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getStudyEpoch()
  {
        if (studyEpochEClass == null)
        {
            studyEpochEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(29);
        }
        return studyEpochEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSubstanceUse()
  {
        if (substanceUseEClass == null)
        {
            substanceUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(30);
        }
        return substanceUseEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getActivityStartTimingReference()
  {
        if (activityStartTimingReferenceEClass == null)
        {
            activityStartTimingReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(31);
        }
        return activityStartTimingReferenceEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getActivityEndTimingReference()
  {
        if (activityEndTimingReferenceEClass == null)
        {
            activityEndTimingReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(32);
        }
        return activityEndTimingReferenceEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getHumanClinicalDisposition()
  {
        if (humanClinicalDispositionEClass == null)
        {
            humanClinicalDispositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(33);
        }
        return humanClinicalDispositionEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getMedicalHistoryItem()
  {
        if (medicalHistoryItemEClass == null)
        {
            medicalHistoryItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(34);
        }
        return medicalHistoryItemEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getProtocolDeviation()
  {
        if (protocolDeviationEClass == null)
        {
            protocolDeviationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(35);
        }
        return protocolDeviationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getClinicalEvent()
  {
        if (clinicalEventEClass == null)
        {
            clinicalEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(36);
        }
        return clinicalEventEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSubjectCharacteristic()
  {
        if (subjectCharacteristicEClass == null)
        {
            subjectCharacteristicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(37);
        }
        return subjectCharacteristicEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPharmacokineticParameterFinding()
  {
        if (pharmacokineticParameterFindingEClass == null)
        {
            pharmacokineticParameterFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(38);
        }
        return pharmacokineticParameterFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getConcomitantMedication()
  {
        if (concomitantMedicationEClass == null)
        {
            concomitantMedicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(39);
        }
        return concomitantMedicationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getConsumableMaterial()
  {
        if (consumableMaterialEClass == null)
        {
            consumableMaterialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(40);
        }
        return consumableMaterialEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getHumanClinicalExposure()
  {
        if (humanClinicalExposureEClass == null)
        {
            humanClinicalExposureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(41);
        }
        return humanClinicalExposureEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStudyTestOrganization()
    {
        if (studyTestOrganizationEClass == null)
        {
            studyTestOrganizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(42);
        }
        return studyTestOrganizationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getQuestionnaireFinding()
  {
        if (questionnaireFindingEClass == null)
        {
            questionnaireFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(43);
        }
        return questionnaireFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getStudyFindingEvaluator()
  {
        if (studyFindingEvaluatorEClass == null)
        {
            studyFindingEvaluatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(44);
        }
        return studyFindingEvaluatorEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSubjectDataNonClinicalTrials()
  {
        if (subjectDataNonClinicalTrialsEClass == null)
        {
            subjectDataNonClinicalTrialsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(45);
        }
        return subjectDataNonClinicalTrialsEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNonhumanSubjectDataDocumentBody()
    {
        if (nonhumanSubjectDataDocumentBodyEClass == null)
        {
            nonhumanSubjectDataDocumentBodyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(46);
        }
        return nonhumanSubjectDataDocumentBodyEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNonhumanSubjectDemographics()
    {
        if (nonhumanSubjectDemographicsEClass == null)
        {
            nonhumanSubjectDemographicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(47);
        }
        return nonhumanSubjectDemographicsEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNonhumanDisposition()
    {
        if (nonhumanDispositionEClass == null)
        {
            nonhumanDispositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(48);
        }
        return nonhumanDispositionEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNonhumanExposure()
    {
        if (nonhumanExposureEClass == null)
        {
            nonhumanExposureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(49);
        }
        return nonhumanExposureEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getHumanClinicalLaboratoryTestResult()
  {
        if (humanClinicalLaboratoryTestResultEClass == null)
        {
            humanClinicalLaboratoryTestResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(60);
        }
        return humanClinicalLaboratoryTestResultEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getBodyWeight()
  {
        if (bodyWeightEClass == null)
        {
            bodyWeightEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(50);
        }
        return bodyWeightEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getBodyWeightGain()
  {
        if (bodyWeightGainEClass == null)
        {
            bodyWeightGainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(51);
        }
        return bodyWeightGainEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getClinicalObservation()
  {
        if (clinicalObservationEClass == null)
        {
            clinicalObservationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(52);
        }
        return clinicalObservationEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getDeathDiagnosis()
  {
        if (deathDiagnosisEClass == null)
        {
            deathDiagnosisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(53);
        }
        return deathDiagnosisEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getFoodandWaterConsumption()
  {
        if (foodandWaterConsumptionEClass == null)
        {
            foodandWaterConsumptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(54);
        }
        return foodandWaterConsumptionEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getMacroscopicFinding()
  {
        if (macroscopicFindingEClass == null)
        {
            macroscopicFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(55);
        }
        return macroscopicFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMicroscopicFinding()
    {
        if (microscopicFindingEClass == null)
        {
            microscopicFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(56);
        }
        return microscopicFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getOrganMeasurement()
  {
        if (organMeasurementEClass == null)
        {
            organMeasurementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(57);
        }
        return organMeasurementEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getPalpableMass()
  {
        if (palpableMassEClass == null)
        {
            palpableMassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(58);
        }
        return palpableMassEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getTumorFinding()
  {
        if (tumorFindingEClass == null)
        {
            tumorFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(59);
        }
        return tumorFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public EClass getSubjectPool()
  {
        if (subjectPoolEClass == null)
        {
            subjectPoolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(61);
        }
        return subjectPoolEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMassIdentification()
    {
        if (massIdentificationEClass == null)
        {
            massIdentificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(62);
        }
        return massIdentificationEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStudySubjectIntervention()
    {
        if (studySubjectInterventionEClass == null)
        {
            studySubjectInterventionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(63);
        }
        return studySubjectInterventionEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStudySubjectEvent()
    {
        if (studySubjectEventEClass == null)
        {
            studySubjectEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(64);
        }
        return studySubjectEventEClass;
    }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStudySubjectFinding()
    {
        if (studySubjectFindingEClass == null)
        {
            studySubjectFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SdtmPackage.eNS_URI).getEClassifiers().get(65);
        }
        return studySubjectFindingEClass;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public SdtmFactory getSdtmFactory()
  {
        return (SdtmFactory)getEFactoryInstance();
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private boolean isLoaded = false;

  /**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public void loadPackage()
  {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null)
        {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try
        {
            resource.load(null);
        }
        catch (IOException exception)
        {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }


  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  private boolean isFixed = false;

  /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public void fixPackageContents()
  {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

  /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
        if (eClassifier.getInstanceClassName() == null)
        {
            eClassifier.setInstanceClassName("org.openhealthtools.mdht.uml.cda.sdtm." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //SdtmPackageImpl
