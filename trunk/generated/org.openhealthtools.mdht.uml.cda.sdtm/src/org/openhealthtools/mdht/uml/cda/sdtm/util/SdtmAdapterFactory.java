/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.sdtm.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage
 * @generated
 */
public class SdtmAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SdtmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SdtmAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SdtmPackage.eINSTANCE;
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
  protected SdtmSwitch<Adapter> modelSwitch =
    new SdtmSwitch<Adapter>()
    {
      @Override
      public Adapter caseSubjectDataHumanClinicalTrials(SubjectDataHumanClinicalTrials object)
      {
        return createSubjectDataHumanClinicalTrialsAdapter();
      }
      @Override
      public Adapter caseHumanClinicalSubjectDataDocumentBody(HumanClinicalSubjectDataDocumentBody object)
      {
        return createHumanClinicalSubjectDataDocumentBodyAdapter();
      }
      @Override
      public Adapter caseHumanClinicalSubjectDemographics(HumanClinicalSubjectDemographics object)
      {
        return createHumanClinicalSubjectDemographicsAdapter();
      }
      @Override
      public Adapter caseDataCollection(DataCollection object)
      {
        return createDataCollectionAdapter();
      }
      @Override
      public Adapter caseEventStudyDay(EventStudyDay object)
      {
        return createEventStudyDayAdapter();
      }
      @Override
      public Adapter caseStudyArm(StudyArm object)
      {
        return createStudyArmAdapter();
      }
      @Override
      public Adapter caseVisit(Visit object)
      {
        return createVisitAdapter();
      }
      @Override
      public Adapter caseAdverseEvent(AdverseEvent object)
      {
        return createAdverseEventAdapter();
      }
      @Override
      public Adapter caseGroupIdentifier(GroupIdentifier object)
      {
        return createGroupIdentifierAdapter();
      }
      @Override
      public Adapter caseBodySystemorOrganClass(BodySystemorOrganClass object)
      {
        return createBodySystemorOrganClassAdapter();
      }
      @Override
      public Adapter caseEventSeverity(EventSeverity object)
      {
        return createEventSeverityAdapter();
      }
      @Override
      public Adapter casePreSpecifiedEvent(PreSpecifiedEvent object)
      {
        return createPreSpecifiedEventAdapter();
      }
      @Override
      public Adapter caseStudyDayPeriod(StudyDayPeriod object)
      {
        return createStudyDayPeriodAdapter();
      }
      @Override
      public Adapter caseVitalSign(VitalSign object)
      {
        return createVitalSignAdapter();
      }
      @Override
      public Adapter caseTimingReference(TimingReference object)
      {
        return createTimingReferenceAdapter();
      }
      @Override
      public Adapter caseNonPerformanceReason(NonPerformanceReason object)
      {
        return createNonPerformanceReasonAdapter();
      }
      @Override
      public Adapter casePlannedStudyDay(PlannedStudyDay object)
      {
        return createPlannedStudyDayAdapter();
      }
      @Override
      public Adapter caseExclusionReason(ExclusionReason object)
      {
        return createExclusionReasonAdapter();
      }
      @Override
      public Adapter caseECGTestResult(ECGTestResult object)
      {
        return createECGTestResultAdapter();
      }
      @Override
      public Adapter caseInclusionorExclusionCriteriaNotMet(InclusionorExclusionCriteriaNotMet object)
      {
        return createInclusionorExclusionCriteriaNotMetAdapter();
      }
      @Override
      public Adapter caseNonhumanLaboratoryTestResult(NonhumanLaboratoryTestResult object)
      {
        return createNonhumanLaboratoryTestResultAdapter();
      }
      @Override
      public Adapter caseSpecimenInformation(SpecimenInformation object)
      {
        return createSpecimenInformationAdapter();
      }
      @Override
      public Adapter casePhysicalExaminationFinding(PhysicalExaminationFinding object)
      {
        return createPhysicalExaminationFindingAdapter();
      }
      @Override
      public Adapter caseMicrobiologySpecimenFinding(MicrobiologySpecimenFinding object)
      {
        return createMicrobiologySpecimenFindingAdapter();
      }
      @Override
      public Adapter caseMicrobiologySusceptibility(MicrobiologySusceptibility object)
      {
        return createMicrobiologySusceptibilityAdapter();
      }
      @Override
      public Adapter casePharmacokineticConcentrationFinding(PharmacokineticConcentrationFinding object)
      {
        return createPharmacokineticConcentrationFindingAdapter();
      }
      @Override
      public Adapter caseFindingAbout(FindingAbout object)
      {
        return createFindingAboutAdapter();
      }
      @Override
      public Adapter caseDrugAccountability(DrugAccountability object)
      {
        return createDrugAccountabilityAdapter();
      }
      @Override
      public Adapter caseSubjectElement(SubjectElement object)
      {
        return createSubjectElementAdapter();
      }
      @Override
      public Adapter caseStudyEpoch(StudyEpoch object)
      {
        return createStudyEpochAdapter();
      }
      @Override
      public Adapter caseSubstanceUse(SubstanceUse object)
      {
        return createSubstanceUseAdapter();
      }
      @Override
      public Adapter caseActivityStartTimingReference(ActivityStartTimingReference object)
      {
        return createActivityStartTimingReferenceAdapter();
      }
      @Override
      public Adapter caseActivityEndTimingReference(ActivityEndTimingReference object)
      {
        return createActivityEndTimingReferenceAdapter();
      }
      @Override
      public Adapter caseHumanClinicalDisposition(HumanClinicalDisposition object)
      {
        return createHumanClinicalDispositionAdapter();
      }
      @Override
      public Adapter caseMedicalHistoryItem(MedicalHistoryItem object)
      {
        return createMedicalHistoryItemAdapter();
      }
      @Override
      public Adapter caseProtocolDeviation(ProtocolDeviation object)
      {
        return createProtocolDeviationAdapter();
      }
      @Override
      public Adapter caseClinicalEvent(ClinicalEvent object)
      {
        return createClinicalEventAdapter();
      }
      @Override
      public Adapter caseSubjectCharacteristic(SubjectCharacteristic object)
      {
        return createSubjectCharacteristicAdapter();
      }
      @Override
      public Adapter casePharmacokineticParameterFinding(PharmacokineticParameterFinding object)
      {
        return createPharmacokineticParameterFindingAdapter();
      }
      @Override
      public Adapter caseConcomitantMedication(ConcomitantMedication object)
      {
        return createConcomitantMedicationAdapter();
      }
      @Override
      public Adapter caseConsumableMaterial(ConsumableMaterial object)
      {
        return createConsumableMaterialAdapter();
      }
      @Override
      public Adapter caseHumanClinicalExposure(HumanClinicalExposure object)
      {
        return createHumanClinicalExposureAdapter();
      }
      @Override
      public Adapter caseStudyTestOrganization(StudyTestOrganization object)
      {
        return createStudyTestOrganizationAdapter();
      }
      @Override
      public Adapter caseQuestionnaireFinding(QuestionnaireFinding object)
      {
        return createQuestionnaireFindingAdapter();
      }
      @Override
      public Adapter caseStudyFindingEvaluator(StudyFindingEvaluator object)
      {
        return createStudyFindingEvaluatorAdapter();
      }
      @Override
      public Adapter caseSubjectDataNonClinicalTrials(SubjectDataNonClinicalTrials object)
      {
        return createSubjectDataNonClinicalTrialsAdapter();
      }
      @Override
      public Adapter caseNonhumanSubjectDataDocumentBody(NonhumanSubjectDataDocumentBody object)
      {
        return createNonhumanSubjectDataDocumentBodyAdapter();
      }
      @Override
      public Adapter caseNonhumanSubjectDemographics(NonhumanSubjectDemographics object)
      {
        return createNonhumanSubjectDemographicsAdapter();
      }
      @Override
      public Adapter caseNonhumanDisposition(NonhumanDisposition object)
      {
        return createNonhumanDispositionAdapter();
      }
      @Override
      public Adapter caseNonhumanExposure(NonhumanExposure object)
      {
        return createNonhumanExposureAdapter();
      }
      @Override
      public Adapter caseBodyWeight(BodyWeight object)
      {
        return createBodyWeightAdapter();
      }
      @Override
      public Adapter caseBodyWeightGain(BodyWeightGain object)
      {
        return createBodyWeightGainAdapter();
      }
      @Override
      public Adapter caseClinicalObservation(ClinicalObservation object)
      {
        return createClinicalObservationAdapter();
      }
      @Override
      public Adapter caseDeathDiagnosis(DeathDiagnosis object)
      {
        return createDeathDiagnosisAdapter();
      }
      @Override
      public Adapter caseFoodandWaterConsumption(FoodandWaterConsumption object)
      {
        return createFoodandWaterConsumptionAdapter();
      }
      @Override
      public Adapter caseMacroscopicFinding(MacroscopicFinding object)
      {
        return createMacroscopicFindingAdapter();
      }
      @Override
      public Adapter caseMicroscopicFinding(MicroscopicFinding object)
      {
        return createMicroscopicFindingAdapter();
      }
      @Override
      public Adapter caseOrganMeasurement(OrganMeasurement object)
      {
        return createOrganMeasurementAdapter();
      }
      @Override
      public Adapter casePalpableMass(PalpableMass object)
      {
        return createPalpableMassAdapter();
      }
      @Override
      public Adapter caseTumorFinding(TumorFinding object)
      {
        return createTumorFindingAdapter();
      }
      @Override
      public Adapter caseHumanClinicalLaboratoryTestResult(HumanClinicalLaboratoryTestResult object)
      {
        return createHumanClinicalLaboratoryTestResultAdapter();
      }
      @Override
      public Adapter caseSubjectPool(SubjectPool object)
      {
        return createSubjectPoolAdapter();
      }
      @Override
      public Adapter caseMassIdentification(MassIdentification object)
      {
        return createMassIdentificationAdapter();
      }
      @Override
      public Adapter caseStudySubjectIntervention(StudySubjectIntervention object)
      {
        return createStudySubjectInterventionAdapter();
      }
      @Override
      public Adapter caseStudySubjectEvent(StudySubjectEvent object)
      {
        return createStudySubjectEventAdapter();
      }
      @Override
      public Adapter caseStudySubjectFinding(StudySubjectFinding object)
      {
        return createStudySubjectFindingAdapter();
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
      public Adapter caseOrganizer(Organizer object)
      {
        return createOrganizerAdapter();
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
      public Adapter caseEncounter(Encounter object)
      {
        return createEncounterAdapter();
      }
      @Override
      public Adapter caseProcedure(Procedure object)
      {
        return createProcedureAdapter();
      }
      @Override
      public Adapter caseSubstanceAdministration(SubstanceAdministration object)
      {
        return createSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter caseParticipation(Participation object)
      {
        return createParticipationAdapter();
      }
      @Override
      public Adapter caseConsumable(Consumable object)
      {
        return createConsumableAdapter();
      }
      @Override
      public Adapter caseParticipant1(Participant1 object)
      {
        return createParticipant1Adapter();
      }
      @Override
      public Adapter caseParticipant2(Participant2 object)
      {
        return createParticipant2Adapter();
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials <em>Subject Data Human Clinical Trials</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials
   * @generated
   */
  public Adapter createSubjectDataHumanClinicalTrialsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody <em>Human Clinical Subject Data Document Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody
   * @generated
   */
  public Adapter createHumanClinicalSubjectDataDocumentBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics <em>Human Clinical Subject Demographics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics
   * @generated
   */
  public Adapter createHumanClinicalSubjectDemographicsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection <em>Data Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DataCollection
   * @generated
   */
  public Adapter createDataCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay <em>Event Study Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay
   * @generated
   */
  public Adapter createEventStudyDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm <em>Study Arm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyArm
   * @generated
   */
  public Adapter createStudyArmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit <em>Visit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.Visit
   * @generated
   */
  public Adapter createVisitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent <em>Adverse Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.AdverseEvent
   * @generated
   */
  public Adapter createAdverseEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier <em>Group Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier
   * @generated
   */
  public Adapter createGroupIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass <em>Body Systemor Organ Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass
   * @generated
   */
  public Adapter createBodySystemorOrganClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity <em>Event Severity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity
   * @generated
   */
  public Adapter createEventSeverityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent <em>Pre Specified Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent
   * @generated
   */
  public Adapter createPreSpecifiedEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod <em>Study Day Period</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod
   * @generated
   */
  public Adapter createStudyDayPeriodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign <em>Vital Sign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.VitalSign
   * @generated
   */
  public Adapter createVitalSignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay <em>Planned Study Day</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay
   * @generated
   */
  public Adapter createPlannedStudyDayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason <em>Exclusion Reason</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason
   * @generated
   */
  public Adapter createExclusionReasonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference <em>Timing Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.TimingReference
   * @generated
   */
  public Adapter createTimingReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason <em>Non Performance Reason</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason
   * @generated
   */
  public Adapter createNonPerformanceReasonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult <em>ECG Test Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult
   * @generated
   */
  public Adapter createECGTestResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet <em>Inclusionor Exclusion Criteria Not Met</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet
   * @generated
   */
  public Adapter createInclusionorExclusionCriteriaNotMetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult <em>Nonhuman Laboratory Test Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult
   * @generated
   */
  public Adapter createNonhumanLaboratoryTestResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation <em>Specimen Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation
   * @generated
   */
  public Adapter createSpecimenInformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding <em>Physical Examination Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding
   * @generated
   */
  public Adapter createPhysicalExaminationFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding <em>Microbiology Specimen Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding
   * @generated
   */
  public Adapter createMicrobiologySpecimenFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility <em>Microbiology Susceptibility</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility
   * @generated
   */
  public Adapter createMicrobiologySusceptibilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding <em>Pharmacokinetic Concentration Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding
   * @generated
   */
  public Adapter createPharmacokineticConcentrationFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout <em>Finding About</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout
   * @generated
   */
  public Adapter createFindingAboutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability <em>Drug Accountability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability
   * @generated
   */
  public Adapter createDrugAccountabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement <em>Subject Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement
   * @generated
   */
  public Adapter createSubjectElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch <em>Study Epoch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch
   * @generated
   */
  public Adapter createStudyEpochAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse <em>Substance Use</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse
   * @generated
   */
  public Adapter createSubstanceUseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference <em>Activity Start Timing Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference
   * @generated
   */
  public Adapter createActivityStartTimingReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference <em>Activity End Timing Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference
   * @generated
   */
  public Adapter createActivityEndTimingReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition <em>Human Clinical Disposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition
   * @generated
   */
  public Adapter createHumanClinicalDispositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem <em>Medical History Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem
   * @generated
   */
  public Adapter createMedicalHistoryItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation <em>Protocol Deviation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation
   * @generated
   */
  public Adapter createProtocolDeviationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent <em>Clinical Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent
   * @generated
   */
  public Adapter createClinicalEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic <em>Subject Characteristic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic
   * @generated
   */
  public Adapter createSubjectCharacteristicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding <em>Pharmacokinetic Parameter Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding
   * @generated
   */
  public Adapter createPharmacokineticParameterFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication <em>Concomitant Medication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantMedication
   * @generated
   */
  public Adapter createConcomitantMedicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial <em>Consumable Material</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial
   * @generated
   */
  public Adapter createConsumableMaterialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure <em>Human Clinical Exposure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure
   * @generated
   */
  public Adapter createHumanClinicalExposureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization <em>Study Test Organization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization
   * @generated
   */
  public Adapter createStudyTestOrganizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding <em>Questionnaire Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding
   * @generated
   */
  public Adapter createQuestionnaireFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator <em>Study Finding Evaluator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator
   * @generated
   */
  public Adapter createStudyFindingEvaluatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials <em>Subject Data Non Clinical Trials</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials
   * @generated
   */
  public Adapter createSubjectDataNonClinicalTrialsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody <em>Nonhuman Subject Data Document Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody
   * @generated
   */
  public Adapter createNonhumanSubjectDataDocumentBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics <em>Nonhuman Subject Demographics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics
   * @generated
   */
  public Adapter createNonhumanSubjectDemographicsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition <em>Nonhuman Disposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition
   * @generated
   */
  public Adapter createNonhumanDispositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure <em>Nonhuman Exposure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure
   * @generated
   */
  public Adapter createNonhumanExposureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult <em>Human Clinical Laboratory Test Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult
   * @generated
   */
  public Adapter createHumanClinicalLaboratoryTestResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight <em>Body Weight</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight
   * @generated
   */
  public Adapter createBodyWeightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain <em>Body Weight Gain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain
   * @generated
   */
  public Adapter createBodyWeightGainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation <em>Clinical Observation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation
   * @generated
   */
  public Adapter createClinicalObservationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis <em>Death Diagnosis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis
   * @generated
   */
  public Adapter createDeathDiagnosisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption <em>Foodand Water Consumption</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption
   * @generated
   */
  public Adapter createFoodandWaterConsumptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding <em>Macroscopic Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding
   * @generated
   */
  public Adapter createMacroscopicFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding <em>Microscopic Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding
   * @generated
   */
  public Adapter createMicroscopicFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement <em>Organ Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement
   * @generated
   */
  public Adapter createOrganMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass <em>Palpable Mass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass
   * @generated
   */
  public Adapter createPalpableMassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding <em>Tumor Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding
   * @generated
   */
  public Adapter createTumorFindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool <em>Subject Pool</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool
   * @generated
   */
  public Adapter createSubjectPoolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification <em>Mass Identification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification
   * @generated
   */
  public Adapter createMassIdentificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention <em>Study Subject Intervention</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectIntervention
   * @generated
   */
  public Adapter createStudySubjectInterventionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent <em>Study Subject Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectEvent
   * @generated
   */
  public Adapter createStudySubjectEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding <em>Study Subject Finding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding
   * @generated
   */
  public Adapter createStudySubjectFindingAdapter()
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Organizer
   * @generated
   */
  public Adapter createOrganizerAdapter()
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
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Encounter <em>Encounter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Encounter
   * @generated
   */
  public Adapter createEncounterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Procedure
   * @generated
   */
  public Adapter createProcedureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
   * @generated
   */
  public Adapter createSubstanceAdministrationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Participation <em>Participation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.Participation
   * @generated
   */
  public Adapter createParticipationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Consumable <em>Consumable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Consumable
   * @generated
   */
  public Adapter createConsumableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Participant1 <em>Participant1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Participant1
   * @generated
   */
  public Adapter createParticipant1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Participant2 <em>Participant2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Participant2
   * @generated
   */
  public Adapter createParticipant2Adapter()
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

} //SdtmAdapterFactory
