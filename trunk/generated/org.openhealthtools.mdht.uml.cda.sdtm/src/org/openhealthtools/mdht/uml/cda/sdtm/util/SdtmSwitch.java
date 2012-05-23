/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.sdtm.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage
 * @generated
 */
public class SdtmSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SdtmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SdtmSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SdtmPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SdtmPackage.SUBJECT_DATA_HUMAN_CLINICAL_TRIALS:
      {
        SubjectDataHumanClinicalTrials subjectDataHumanClinicalTrials = (SubjectDataHumanClinicalTrials)theEObject;
        T result = caseSubjectDataHumanClinicalTrials(subjectDataHumanClinicalTrials);
        if (result == null) result = caseClinicalDocument(subjectDataHumanClinicalTrials);
        if (result == null) result = caseAct(subjectDataHumanClinicalTrials);
        if (result == null) result = caseInfrastructureRoot(subjectDataHumanClinicalTrials);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY:
      {
        HumanClinicalSubjectDataDocumentBody humanClinicalSubjectDataDocumentBody = (HumanClinicalSubjectDataDocumentBody)theEObject;
        T result = caseHumanClinicalSubjectDataDocumentBody(humanClinicalSubjectDataDocumentBody);
        if (result == null) result = caseSection(humanClinicalSubjectDataDocumentBody);
        if (result == null) result = caseAct(humanClinicalSubjectDataDocumentBody);
        if (result == null) result = caseInfrastructureRoot(humanClinicalSubjectDataDocumentBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS:
      {
        HumanClinicalSubjectDemographics humanClinicalSubjectDemographics = (HumanClinicalSubjectDemographics)theEObject;
        T result = caseHumanClinicalSubjectDemographics(humanClinicalSubjectDemographics);
        if (result == null) result = caseOrganizer(humanClinicalSubjectDemographics);
        if (result == null) result = caseClinicalStatement(humanClinicalSubjectDemographics);
        if (result == null) result = caseAct(humanClinicalSubjectDemographics);
        if (result == null) result = caseInfrastructureRoot(humanClinicalSubjectDemographics);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.DATA_COLLECTION:
      {
        DataCollection dataCollection = (DataCollection)theEObject;
        T result = caseDataCollection(dataCollection);
        if (result == null) result = caseCDA_Act(dataCollection);
        if (result == null) result = caseClinicalStatement(dataCollection);
        if (result == null) result = caseAct(dataCollection);
        if (result == null) result = caseInfrastructureRoot(dataCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.EVENT_STUDY_DAY:
      {
        EventStudyDay eventStudyDay = (EventStudyDay)theEObject;
        T result = caseEventStudyDay(eventStudyDay);
        if (result == null) result = caseObservation(eventStudyDay);
        if (result == null) result = caseClinicalStatement(eventStudyDay);
        if (result == null) result = caseAct(eventStudyDay);
        if (result == null) result = caseInfrastructureRoot(eventStudyDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.STUDY_ARM:
      {
        StudyArm studyArm = (StudyArm)theEObject;
        T result = caseStudyArm(studyArm);
        if (result == null) result = caseCDA_Act(studyArm);
        if (result == null) result = caseClinicalStatement(studyArm);
        if (result == null) result = caseAct(studyArm);
        if (result == null) result = caseInfrastructureRoot(studyArm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.VISIT:
      {
        Visit visit = (Visit)theEObject;
        T result = caseVisit(visit);
        if (result == null) result = caseEncounter(visit);
        if (result == null) result = caseClinicalStatement(visit);
        if (result == null) result = caseAct(visit);
        if (result == null) result = caseInfrastructureRoot(visit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.ADVERSE_EVENT:
      {
        AdverseEvent adverseEvent = (AdverseEvent)theEObject;
        T result = caseAdverseEvent(adverseEvent);
        if (result == null) result = caseObservation(adverseEvent);
        if (result == null) result = caseClinicalStatement(adverseEvent);
        if (result == null) result = caseAct(adverseEvent);
        if (result == null) result = caseInfrastructureRoot(adverseEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.GROUP_IDENTIFIER:
      {
        GroupIdentifier groupIdentifier = (GroupIdentifier)theEObject;
        T result = caseGroupIdentifier(groupIdentifier);
        if (result == null) result = caseCDA_Act(groupIdentifier);
        if (result == null) result = caseClinicalStatement(groupIdentifier);
        if (result == null) result = caseAct(groupIdentifier);
        if (result == null) result = caseInfrastructureRoot(groupIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.BODY_SYSTEMOR_ORGAN_CLASS:
      {
        BodySystemorOrganClass bodySystemorOrganClass = (BodySystemorOrganClass)theEObject;
        T result = caseBodySystemorOrganClass(bodySystemorOrganClass);
        if (result == null) result = caseObservation(bodySystemorOrganClass);
        if (result == null) result = caseClinicalStatement(bodySystemorOrganClass);
        if (result == null) result = caseAct(bodySystemorOrganClass);
        if (result == null) result = caseInfrastructureRoot(bodySystemorOrganClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.EVENT_SEVERITY:
      {
        EventSeverity eventSeverity = (EventSeverity)theEObject;
        T result = caseEventSeverity(eventSeverity);
        if (result == null) result = caseObservation(eventSeverity);
        if (result == null) result = caseClinicalStatement(eventSeverity);
        if (result == null) result = caseAct(eventSeverity);
        if (result == null) result = caseInfrastructureRoot(eventSeverity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PRE_SPECIFIED_EVENT:
      {
        PreSpecifiedEvent preSpecifiedEvent = (PreSpecifiedEvent)theEObject;
        T result = casePreSpecifiedEvent(preSpecifiedEvent);
        if (result == null) result = caseObservation(preSpecifiedEvent);
        if (result == null) result = caseClinicalStatement(preSpecifiedEvent);
        if (result == null) result = caseAct(preSpecifiedEvent);
        if (result == null) result = caseInfrastructureRoot(preSpecifiedEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.STUDY_DAY_PERIOD:
      {
        StudyDayPeriod studyDayPeriod = (StudyDayPeriod)theEObject;
        T result = caseStudyDayPeriod(studyDayPeriod);
        if (result == null) result = caseObservation(studyDayPeriod);
        if (result == null) result = caseClinicalStatement(studyDayPeriod);
        if (result == null) result = caseAct(studyDayPeriod);
        if (result == null) result = caseInfrastructureRoot(studyDayPeriod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.VITAL_SIGN:
      {
        VitalSign vitalSign = (VitalSign)theEObject;
        T result = caseVitalSign(vitalSign);
        if (result == null) result = caseObservation(vitalSign);
        if (result == null) result = caseClinicalStatement(vitalSign);
        if (result == null) result = caseAct(vitalSign);
        if (result == null) result = caseInfrastructureRoot(vitalSign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PLANNED_STUDY_DAY:
      {
        PlannedStudyDay plannedStudyDay = (PlannedStudyDay)theEObject;
        T result = casePlannedStudyDay(plannedStudyDay);
        if (result == null) result = caseObservation(plannedStudyDay);
        if (result == null) result = caseClinicalStatement(plannedStudyDay);
        if (result == null) result = caseAct(plannedStudyDay);
        if (result == null) result = caseInfrastructureRoot(plannedStudyDay);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.TIMING_REFERENCE:
      {
        TimingReference timingReference = (TimingReference)theEObject;
        T result = caseTimingReference(timingReference);
        if (result == null) result = caseCDA_Act(timingReference);
        if (result == null) result = caseClinicalStatement(timingReference);
        if (result == null) result = caseAct(timingReference);
        if (result == null) result = caseInfrastructureRoot(timingReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.NON_PERFORMANCE_REASON:
      {
        NonPerformanceReason nonPerformanceReason = (NonPerformanceReason)theEObject;
        T result = caseNonPerformanceReason(nonPerformanceReason);
        if (result == null) result = caseObservation(nonPerformanceReason);
        if (result == null) result = caseClinicalStatement(nonPerformanceReason);
        if (result == null) result = caseAct(nonPerformanceReason);
        if (result == null) result = caseInfrastructureRoot(nonPerformanceReason);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.ECG_TEST_RESULT:
      {
        ECGTestResult ecgTestResult = (ECGTestResult)theEObject;
        T result = caseECGTestResult(ecgTestResult);
        if (result == null) result = caseObservation(ecgTestResult);
        if (result == null) result = caseClinicalStatement(ecgTestResult);
        if (result == null) result = caseAct(ecgTestResult);
        if (result == null) result = caseInfrastructureRoot(ecgTestResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.BASELINE_INDICATOR:
      {
        BaselineIndicator baselineIndicator = (BaselineIndicator)theEObject;
        T result = caseBaselineIndicator(baselineIndicator);
        if (result == null) result = caseObservation(baselineIndicator);
        if (result == null) result = caseClinicalStatement(baselineIndicator);
        if (result == null) result = caseAct(baselineIndicator);
        if (result == null) result = caseInfrastructureRoot(baselineIndicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.DERIVED_DATA_INDICATOR:
      {
        DerivedDataIndicator derivedDataIndicator = (DerivedDataIndicator)theEObject;
        T result = caseDerivedDataIndicator(derivedDataIndicator);
        if (result == null) result = caseObservation(derivedDataIndicator);
        if (result == null) result = caseClinicalStatement(derivedDataIndicator);
        if (result == null) result = caseAct(derivedDataIndicator);
        if (result == null) result = caseInfrastructureRoot(derivedDataIndicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET:
      {
        InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet = (InclusionorExclusionCriteriaNotMet)theEObject;
        T result = caseInclusionorExclusionCriteriaNotMet(inclusionorExclusionCriteriaNotMet);
        if (result == null) result = caseObservation(inclusionorExclusionCriteriaNotMet);
        if (result == null) result = caseClinicalStatement(inclusionorExclusionCriteriaNotMet);
        if (result == null) result = caseAct(inclusionorExclusionCriteriaNotMet);
        if (result == null) result = caseInfrastructureRoot(inclusionorExclusionCriteriaNotMet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.NON_HUMAN_LABORATORY_TEST_RESULT:
      {
        NonHumanLaboratoryTestResult nonHumanLaboratoryTestResult = (NonHumanLaboratoryTestResult)theEObject;
        T result = caseNonHumanLaboratoryTestResult(nonHumanLaboratoryTestResult);
        if (result == null) result = caseObservation(nonHumanLaboratoryTestResult);
        if (result == null) result = caseClinicalStatement(nonHumanLaboratoryTestResult);
        if (result == null) result = caseAct(nonHumanLaboratoryTestResult);
        if (result == null) result = caseInfrastructureRoot(nonHumanLaboratoryTestResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.SPECIMEN_INFORMATION:
      {
        SpecimenInformation specimenInformation = (SpecimenInformation)theEObject;
        T result = caseSpecimenInformation(specimenInformation);
        if (result == null) result = caseProcedure(specimenInformation);
        if (result == null) result = caseClinicalStatement(specimenInformation);
        if (result == null) result = caseAct(specimenInformation);
        if (result == null) result = caseInfrastructureRoot(specimenInformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PHYSICAL_EXAMINATION_FINDING:
      {
        PhysicalExaminationFinding physicalExaminationFinding = (PhysicalExaminationFinding)theEObject;
        T result = casePhysicalExaminationFinding(physicalExaminationFinding);
        if (result == null) result = caseObservation(physicalExaminationFinding);
        if (result == null) result = caseClinicalStatement(physicalExaminationFinding);
        if (result == null) result = caseAct(physicalExaminationFinding);
        if (result == null) result = caseInfrastructureRoot(physicalExaminationFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.MICROBIOLOGY_SPECIMEN_FINDING:
      {
        MicrobiologySpecimenFinding microbiologySpecimenFinding = (MicrobiologySpecimenFinding)theEObject;
        T result = caseMicrobiologySpecimenFinding(microbiologySpecimenFinding);
        if (result == null) result = caseObservation(microbiologySpecimenFinding);
        if (result == null) result = caseClinicalStatement(microbiologySpecimenFinding);
        if (result == null) result = caseAct(microbiologySpecimenFinding);
        if (result == null) result = caseInfrastructureRoot(microbiologySpecimenFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.MICROBIOLOGY_SUSCEPTIBILITY:
      {
        MicrobiologySusceptibility microbiologySusceptibility = (MicrobiologySusceptibility)theEObject;
        T result = caseMicrobiologySusceptibility(microbiologySusceptibility);
        if (result == null) result = caseObservation(microbiologySusceptibility);
        if (result == null) result = caseClinicalStatement(microbiologySusceptibility);
        if (result == null) result = caseAct(microbiologySusceptibility);
        if (result == null) result = caseInfrastructureRoot(microbiologySusceptibility);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PHARMACOKINETIC_CONCENTRATION_FINDING:
      {
        PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding = (PharmacokineticConcentrationFinding)theEObject;
        T result = casePharmacokineticConcentrationFinding(pharmacokineticConcentrationFinding);
        if (result == null) result = caseObservation(pharmacokineticConcentrationFinding);
        if (result == null) result = caseClinicalStatement(pharmacokineticConcentrationFinding);
        if (result == null) result = caseAct(pharmacokineticConcentrationFinding);
        if (result == null) result = caseInfrastructureRoot(pharmacokineticConcentrationFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.FINDING_ABOUT:
      {
        FindingAbout findingAbout = (FindingAbout)theEObject;
        T result = caseFindingAbout(findingAbout);
        if (result == null) result = caseObservation(findingAbout);
        if (result == null) result = caseClinicalStatement(findingAbout);
        if (result == null) result = caseAct(findingAbout);
        if (result == null) result = caseInfrastructureRoot(findingAbout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.DRUG_ACCOUNTABILITY:
      {
        DrugAccountability drugAccountability = (DrugAccountability)theEObject;
        T result = caseDrugAccountability(drugAccountability);
        if (result == null) result = caseObservation(drugAccountability);
        if (result == null) result = caseClinicalStatement(drugAccountability);
        if (result == null) result = caseAct(drugAccountability);
        if (result == null) result = caseInfrastructureRoot(drugAccountability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.SUBJECT_ELEMENT:
      {
        SubjectElement subjectElement = (SubjectElement)theEObject;
        T result = caseSubjectElement(subjectElement);
        if (result == null) result = caseCDA_Act(subjectElement);
        if (result == null) result = caseClinicalStatement(subjectElement);
        if (result == null) result = caseAct(subjectElement);
        if (result == null) result = caseInfrastructureRoot(subjectElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.STUDY_EPOCH:
      {
        StudyEpoch studyEpoch = (StudyEpoch)theEObject;
        T result = caseStudyEpoch(studyEpoch);
        if (result == null) result = caseCDA_Act(studyEpoch);
        if (result == null) result = caseClinicalStatement(studyEpoch);
        if (result == null) result = caseAct(studyEpoch);
        if (result == null) result = caseInfrastructureRoot(studyEpoch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.SUBSTANCE_USE:
      {
        SubstanceUse substanceUse = (SubstanceUse)theEObject;
        T result = caseSubstanceUse(substanceUse);
        if (result == null) result = caseSubstanceAdministration(substanceUse);
        if (result == null) result = caseClinicalStatement(substanceUse);
        if (result == null) result = caseAct(substanceUse);
        if (result == null) result = caseInfrastructureRoot(substanceUse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.ACTIVITY_START_TIMING_REFERENCE:
      {
        ActivityStartTimingReference activityStartTimingReference = (ActivityStartTimingReference)theEObject;
        T result = caseActivityStartTimingReference(activityStartTimingReference);
        if (result == null) result = caseCDA_Act(activityStartTimingReference);
        if (result == null) result = caseClinicalStatement(activityStartTimingReference);
        if (result == null) result = caseAct(activityStartTimingReference);
        if (result == null) result = caseInfrastructureRoot(activityStartTimingReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.ACTIVITY_END_TIMING_REFERENCE:
      {
        ActivityEndTimingReference activityEndTimingReference = (ActivityEndTimingReference)theEObject;
        T result = caseActivityEndTimingReference(activityEndTimingReference);
        if (result == null) result = caseCDA_Act(activityEndTimingReference);
        if (result == null) result = caseClinicalStatement(activityEndTimingReference);
        if (result == null) result = caseAct(activityEndTimingReference);
        if (result == null) result = caseInfrastructureRoot(activityEndTimingReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.HUMAN_CLINICAL_DISPOSITION:
      {
        HumanClinicalDisposition humanClinicalDisposition = (HumanClinicalDisposition)theEObject;
        T result = caseHumanClinicalDisposition(humanClinicalDisposition);
        if (result == null) result = caseCDA_Act(humanClinicalDisposition);
        if (result == null) result = caseClinicalStatement(humanClinicalDisposition);
        if (result == null) result = caseAct(humanClinicalDisposition);
        if (result == null) result = caseInfrastructureRoot(humanClinicalDisposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.MEDICAL_HISTORY_ITEM:
      {
        MedicalHistoryItem medicalHistoryItem = (MedicalHistoryItem)theEObject;
        T result = caseMedicalHistoryItem(medicalHistoryItem);
        if (result == null) result = caseObservation(medicalHistoryItem);
        if (result == null) result = caseClinicalStatement(medicalHistoryItem);
        if (result == null) result = caseAct(medicalHistoryItem);
        if (result == null) result = caseInfrastructureRoot(medicalHistoryItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PROTOCOL_DEVIATION:
      {
        ProtocolDeviation protocolDeviation = (ProtocolDeviation)theEObject;
        T result = caseProtocolDeviation(protocolDeviation);
        if (result == null) result = caseObservation(protocolDeviation);
        if (result == null) result = caseClinicalStatement(protocolDeviation);
        if (result == null) result = caseAct(protocolDeviation);
        if (result == null) result = caseInfrastructureRoot(protocolDeviation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.CLINICAL_EVENT:
      {
        ClinicalEvent clinicalEvent = (ClinicalEvent)theEObject;
        T result = caseClinicalEvent(clinicalEvent);
        if (result == null) result = caseObservation(clinicalEvent);
        if (result == null) result = caseClinicalStatement(clinicalEvent);
        if (result == null) result = caseAct(clinicalEvent);
        if (result == null) result = caseInfrastructureRoot(clinicalEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.SUBJECT_CHARACTERISTIC:
      {
        SubjectCharacteristic subjectCharacteristic = (SubjectCharacteristic)theEObject;
        T result = caseSubjectCharacteristic(subjectCharacteristic);
        if (result == null) result = caseObservation(subjectCharacteristic);
        if (result == null) result = caseClinicalStatement(subjectCharacteristic);
        if (result == null) result = caseAct(subjectCharacteristic);
        if (result == null) result = caseInfrastructureRoot(subjectCharacteristic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PHARMACOKINETIC_PARAMETER_FINDING:
      {
        PharmacokineticParameterFinding pharmacokineticParameterFinding = (PharmacokineticParameterFinding)theEObject;
        T result = casePharmacokineticParameterFinding(pharmacokineticParameterFinding);
        if (result == null) result = caseObservation(pharmacokineticParameterFinding);
        if (result == null) result = caseClinicalStatement(pharmacokineticParameterFinding);
        if (result == null) result = caseAct(pharmacokineticParameterFinding);
        if (result == null) result = caseInfrastructureRoot(pharmacokineticParameterFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.CONCOMITANT_MEDICATION:
      {
        ConcomitantMedication concomitantMedication = (ConcomitantMedication)theEObject;
        T result = caseConcomitantMedication(concomitantMedication);
        if (result == null) result = caseSubstanceAdministration(concomitantMedication);
        if (result == null) result = caseClinicalStatement(concomitantMedication);
        if (result == null) result = caseAct(concomitantMedication);
        if (result == null) result = caseInfrastructureRoot(concomitantMedication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.CONSUMABLE_MATERIAL:
      {
        ConsumableMaterial consumableMaterial = (ConsumableMaterial)theEObject;
        T result = caseConsumableMaterial(consumableMaterial);
        if (result == null) result = caseConsumable(consumableMaterial);
        if (result == null) result = caseParticipation(consumableMaterial);
        if (result == null) result = caseInfrastructureRoot(consumableMaterial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.HUMAN_CLINICAL_EXPOSURE:
      {
        HumanClinicalExposure humanClinicalExposure = (HumanClinicalExposure)theEObject;
        T result = caseHumanClinicalExposure(humanClinicalExposure);
        if (result == null) result = caseSubstanceAdministration(humanClinicalExposure);
        if (result == null) result = caseClinicalStatement(humanClinicalExposure);
        if (result == null) result = caseAct(humanClinicalExposure);
        if (result == null) result = caseInfrastructureRoot(humanClinicalExposure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.STUDY_TEST_PERFORMER:
      {
        StudyTestPerformer studyTestPerformer = (StudyTestPerformer)theEObject;
        T result = caseStudyTestPerformer(studyTestPerformer);
        if (result == null) result = caseParticipant1(studyTestPerformer);
        if (result == null) result = caseParticipation(studyTestPerformer);
        if (result == null) result = caseInfrastructureRoot(studyTestPerformer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.QUESTIONNAIRE_FINDING:
      {
        QuestionnaireFinding questionnaireFinding = (QuestionnaireFinding)theEObject;
        T result = caseQuestionnaireFinding(questionnaireFinding);
        if (result == null) result = caseObservation(questionnaireFinding);
        if (result == null) result = caseClinicalStatement(questionnaireFinding);
        if (result == null) result = caseAct(questionnaireFinding);
        if (result == null) result = caseInfrastructureRoot(questionnaireFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.STUDY_FINDING_EVALUATOR:
      {
        StudyFindingEvaluator studyFindingEvaluator = (StudyFindingEvaluator)theEObject;
        T result = caseStudyFindingEvaluator(studyFindingEvaluator);
        if (result == null) result = caseParticipant1(studyFindingEvaluator);
        if (result == null) result = caseParticipation(studyFindingEvaluator);
        if (result == null) result = caseInfrastructureRoot(studyFindingEvaluator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.SUBJECT_DATA_NON_CLINICAL_TRIALS:
      {
        SubjectDataNonClinicalTrials subjectDataNonClinicalTrials = (SubjectDataNonClinicalTrials)theEObject;
        T result = caseSubjectDataNonClinicalTrials(subjectDataNonClinicalTrials);
        if (result == null) result = caseClinicalDocument(subjectDataNonClinicalTrials);
        if (result == null) result = caseAct(subjectDataNonClinicalTrials);
        if (result == null) result = caseInfrastructureRoot(subjectDataNonClinicalTrials);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.NON_HUMAN_SUBJECT_DATA_DOCUMENT_BODY:
      {
        NonHumanSubjectDataDocumentBody nonHumanSubjectDataDocumentBody = (NonHumanSubjectDataDocumentBody)theEObject;
        T result = caseNonHumanSubjectDataDocumentBody(nonHumanSubjectDataDocumentBody);
        if (result == null) result = caseSection(nonHumanSubjectDataDocumentBody);
        if (result == null) result = caseAct(nonHumanSubjectDataDocumentBody);
        if (result == null) result = caseInfrastructureRoot(nonHumanSubjectDataDocumentBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.NON_HUMAN_EXPOSURE:
      {
        NonHumanExposure nonHumanExposure = (NonHumanExposure)theEObject;
        T result = caseNonHumanExposure(nonHumanExposure);
        if (result == null) result = caseSubstanceAdministration(nonHumanExposure);
        if (result == null) result = caseClinicalStatement(nonHumanExposure);
        if (result == null) result = caseAct(nonHumanExposure);
        if (result == null) result = caseInfrastructureRoot(nonHumanExposure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.NON_HUMAN_DISPOSITION:
      {
        NonHumanDisposition nonHumanDisposition = (NonHumanDisposition)theEObject;
        T result = caseNonHumanDisposition(nonHumanDisposition);
        if (result == null) result = caseCDA_Act(nonHumanDisposition);
        if (result == null) result = caseClinicalStatement(nonHumanDisposition);
        if (result == null) result = caseAct(nonHumanDisposition);
        if (result == null) result = caseInfrastructureRoot(nonHumanDisposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.HUMAN_CLINICAL_LABORATORY_TEST_RESULT:
      {
        HumanClinicalLaboratoryTestResult humanClinicalLaboratoryTestResult = (HumanClinicalLaboratoryTestResult)theEObject;
        T result = caseHumanClinicalLaboratoryTestResult(humanClinicalLaboratoryTestResult);
        if (result == null) result = caseObservation(humanClinicalLaboratoryTestResult);
        if (result == null) result = caseClinicalStatement(humanClinicalLaboratoryTestResult);
        if (result == null) result = caseAct(humanClinicalLaboratoryTestResult);
        if (result == null) result = caseInfrastructureRoot(humanClinicalLaboratoryTestResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.BODY_WEIGHT:
      {
        BodyWeight bodyWeight = (BodyWeight)theEObject;
        T result = caseBodyWeight(bodyWeight);
        if (result == null) result = caseObservation(bodyWeight);
        if (result == null) result = caseClinicalStatement(bodyWeight);
        if (result == null) result = caseAct(bodyWeight);
        if (result == null) result = caseInfrastructureRoot(bodyWeight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.BODY_WEIGHT_GAIN:
      {
        BodyWeightGain bodyWeightGain = (BodyWeightGain)theEObject;
        T result = caseBodyWeightGain(bodyWeightGain);
        if (result == null) result = caseObservation(bodyWeightGain);
        if (result == null) result = caseClinicalStatement(bodyWeightGain);
        if (result == null) result = caseAct(bodyWeightGain);
        if (result == null) result = caseInfrastructureRoot(bodyWeightGain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.CLINICAL_OBSERVATION:
      {
        ClinicalObservation clinicalObservation = (ClinicalObservation)theEObject;
        T result = caseClinicalObservation(clinicalObservation);
        if (result == null) result = caseObservation(clinicalObservation);
        if (result == null) result = caseClinicalStatement(clinicalObservation);
        if (result == null) result = caseAct(clinicalObservation);
        if (result == null) result = caseInfrastructureRoot(clinicalObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.DEATH_DIAGNOSIS:
      {
        DeathDiagnosis deathDiagnosis = (DeathDiagnosis)theEObject;
        T result = caseDeathDiagnosis(deathDiagnosis);
        if (result == null) result = caseObservation(deathDiagnosis);
        if (result == null) result = caseClinicalStatement(deathDiagnosis);
        if (result == null) result = caseAct(deathDiagnosis);
        if (result == null) result = caseInfrastructureRoot(deathDiagnosis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.FOODAND_WATER_CONSUMPTION:
      {
        FoodandWaterConsumption foodandWaterConsumption = (FoodandWaterConsumption)theEObject;
        T result = caseFoodandWaterConsumption(foodandWaterConsumption);
        if (result == null) result = caseObservation(foodandWaterConsumption);
        if (result == null) result = caseClinicalStatement(foodandWaterConsumption);
        if (result == null) result = caseAct(foodandWaterConsumption);
        if (result == null) result = caseInfrastructureRoot(foodandWaterConsumption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.MACROSCOPIC_FINDING:
      {
        MacroscopicFinding macroscopicFinding = (MacroscopicFinding)theEObject;
        T result = caseMacroscopicFinding(macroscopicFinding);
        if (result == null) result = caseObservation(macroscopicFinding);
        if (result == null) result = caseClinicalStatement(macroscopicFinding);
        if (result == null) result = caseAct(macroscopicFinding);
        if (result == null) result = caseInfrastructureRoot(macroscopicFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.MICROSCOPIC_FINDINGS:
      {
        MicroscopicFindings microscopicFindings = (MicroscopicFindings)theEObject;
        T result = caseMicroscopicFindings(microscopicFindings);
        if (result == null) result = caseObservation(microscopicFindings);
        if (result == null) result = caseClinicalStatement(microscopicFindings);
        if (result == null) result = caseAct(microscopicFindings);
        if (result == null) result = caseInfrastructureRoot(microscopicFindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.ORGAN_MEASUREMENT:
      {
        OrganMeasurement organMeasurement = (OrganMeasurement)theEObject;
        T result = caseOrganMeasurement(organMeasurement);
        if (result == null) result = caseObservation(organMeasurement);
        if (result == null) result = caseClinicalStatement(organMeasurement);
        if (result == null) result = caseAct(organMeasurement);
        if (result == null) result = caseInfrastructureRoot(organMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.PALPABLE_MASS:
      {
        PalpableMass palpableMass = (PalpableMass)theEObject;
        T result = casePalpableMass(palpableMass);
        if (result == null) result = caseObservation(palpableMass);
        if (result == null) result = caseClinicalStatement(palpableMass);
        if (result == null) result = caseAct(palpableMass);
        if (result == null) result = caseInfrastructureRoot(palpableMass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.TUMOR_FINDING:
      {
        TumorFinding tumorFinding = (TumorFinding)theEObject;
        T result = caseTumorFinding(tumorFinding);
        if (result == null) result = caseObservation(tumorFinding);
        if (result == null) result = caseClinicalStatement(tumorFinding);
        if (result == null) result = caseAct(tumorFinding);
        if (result == null) result = caseInfrastructureRoot(tumorFinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SdtmPackage.SUBJECT_POOL:
      {
        SubjectPool subjectPool = (SubjectPool)theEObject;
        T result = caseSubjectPool(subjectPool);
        if (result == null) result = caseObservation(subjectPool);
        if (result == null) result = caseClinicalStatement(subjectPool);
        if (result == null) result = caseAct(subjectPool);
        if (result == null) result = caseInfrastructureRoot(subjectPool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject Data Human Clinical Trials</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject Data Human Clinical Trials</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectDataHumanClinicalTrials(SubjectDataHumanClinicalTrials object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Human Clinical Subject Data Document Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Human Clinical Subject Data Document Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHumanClinicalSubjectDataDocumentBody(HumanClinicalSubjectDataDocumentBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Human Clinical Subject Demographics</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Human Clinical Subject Demographics</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHumanClinicalSubjectDemographics(HumanClinicalSubjectDemographics object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataCollection(DataCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Study Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Study Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventStudyDay(EventStudyDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Study Arm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Study Arm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudyArm(StudyArm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisit(Visit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adverse Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdverseEvent(AdverseEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupIdentifier(GroupIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Systemor Organ Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Systemor Organ Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodySystemorOrganClass(BodySystemorOrganClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Severity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Severity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventSeverity(EventSeverity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Specified Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Specified Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreSpecifiedEvent(PreSpecifiedEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Study Day Period</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Study Day Period</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudyDayPeriod(StudyDayPeriod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVitalSign(VitalSign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Planned Study Day</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Planned Study Day</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlannedStudyDay(PlannedStudyDay object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timing Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timing Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimingReference(TimingReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Performance Reason</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Performance Reason</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonPerformanceReason(NonPerformanceReason object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ECG Test Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ECG Test Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseECGTestResult(ECGTestResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Baseline Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Baseline Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaselineIndicator(BaselineIndicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Derived Data Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Derived Data Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDerivedDataIndicator(DerivedDataIndicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inclusionor Exclusion Criteria Not Met</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inclusionor Exclusion Criteria Not Met</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclusionorExclusionCriteriaNotMet(InclusionorExclusionCriteriaNotMet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Human Laboratory Test Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Human Laboratory Test Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonHumanLaboratoryTestResult(NonHumanLaboratoryTestResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specimen Information</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specimen Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecimenInformation(SpecimenInformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Physical Examination Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Physical Examination Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhysicalExaminationFinding(PhysicalExaminationFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Microbiology Specimen Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Microbiology Specimen Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMicrobiologySpecimenFinding(MicrobiologySpecimenFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Microbiology Susceptibility</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Microbiology Susceptibility</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMicrobiologySusceptibility(MicrobiologySusceptibility object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pharmacokinetic Concentration Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pharmacokinetic Concentration Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePharmacokineticConcentrationFinding(PharmacokineticConcentrationFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Finding About</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Finding About</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFindingAbout(FindingAbout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drug Accountability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drug Accountability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrugAccountability(DrugAccountability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectElement(SubjectElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Study Epoch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Study Epoch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudyEpoch(StudyEpoch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substance Use</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substance Use</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstanceUse(SubstanceUse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Start Timing Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Start Timing Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityStartTimingReference(ActivityStartTimingReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity End Timing Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity End Timing Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityEndTimingReference(ActivityEndTimingReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Human Clinical Disposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Human Clinical Disposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHumanClinicalDisposition(HumanClinicalDisposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Medical History Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medical History Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMedicalHistoryItem(MedicalHistoryItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol Deviation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol Deviation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocolDeviation(ProtocolDeviation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClinicalEvent(ClinicalEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject Characteristic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject Characteristic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectCharacteristic(SubjectCharacteristic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pharmacokinetic Parameter Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pharmacokinetic Parameter Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePharmacokineticParameterFinding(PharmacokineticParameterFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concomitant Medication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concomitant Medication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcomitantMedication(ConcomitantMedication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consumable Material</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consumable Material</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsumableMaterial(ConsumableMaterial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Human Clinical Exposure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Human Clinical Exposure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHumanClinicalExposure(HumanClinicalExposure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Study Test Performer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Study Test Performer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudyTestPerformer(StudyTestPerformer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Questionnaire Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Questionnaire Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestionnaireFinding(QuestionnaireFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Study Finding Evaluator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Study Finding Evaluator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudyFindingEvaluator(StudyFindingEvaluator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject Data Non Clinical Trials</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject Data Non Clinical Trials</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectDataNonClinicalTrials(SubjectDataNonClinicalTrials object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Human Subject Data Document Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Human Subject Data Document Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonHumanSubjectDataDocumentBody(NonHumanSubjectDataDocumentBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Human Exposure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Human Exposure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonHumanExposure(NonHumanExposure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Human Disposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Human Disposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonHumanDisposition(NonHumanDisposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Human Clinical Laboratory Test Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Human Clinical Laboratory Test Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHumanClinicalLaboratoryTestResult(HumanClinicalLaboratoryTestResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Weight</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Weight</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyWeight(BodyWeight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Weight Gain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Weight Gain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyWeightGain(BodyWeightGain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClinicalObservation(ClinicalObservation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Death Diagnosis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Death Diagnosis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeathDiagnosis(DeathDiagnosis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foodand Water Consumption</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foodand Water Consumption</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFoodandWaterConsumption(FoodandWaterConsumption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Macroscopic Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Macroscopic Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMacroscopicFinding(MacroscopicFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Microscopic Findings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Microscopic Findings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMicroscopicFindings(MicroscopicFindings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organ Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organ Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganMeasurement(OrganMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Palpable Mass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Palpable Mass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePalpableMass(PalpableMass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tumor Finding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tumor Finding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTumorFinding(TumorFinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subject Pool</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subject Pool</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubjectPool(SubjectPool object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructureRoot(InfrastructureRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAct(Act object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClinicalDocument(ClinicalDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClinicalStatement(ClinicalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganizer(Organizer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObservation(Observation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEncounter(Encounter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcedure(Procedure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstanceAdministration(SubstanceAdministration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParticipation(Participation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Consumable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Consumable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsumable(Consumable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Participant1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParticipant1(Participant1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SdtmSwitch
