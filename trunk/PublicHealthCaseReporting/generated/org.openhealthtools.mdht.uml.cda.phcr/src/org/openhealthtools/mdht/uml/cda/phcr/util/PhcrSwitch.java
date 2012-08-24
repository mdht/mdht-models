/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.*;
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.SpecimenCollectionProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.SusceptibilityResult;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

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
 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage
 * @generated
 */
public class PhcrSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PhcrPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhcrSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PhcrPackage.eINSTANCE;
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
      case PhcrPackage.PUBLIC_HEALTH_CASE_REPORT:
      {
        PublicHealthCaseReport publicHealthCaseReport = (PublicHealthCaseReport)theEObject;
        T result = casePublicHealthCaseReport(publicHealthCaseReport);
        if (result == null) result = caseClinicalDocument(publicHealthCaseReport);
        if (result == null) result = caseAct(publicHealthCaseReport);
        if (result == null) result = caseInfrastructureRoot(publicHealthCaseReport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION:
      {
        PhcrSocialHistorySection phcrSocialHistorySection = (PhcrSocialHistorySection)theEObject;
        T result = casePhcrSocialHistorySection(phcrSocialHistorySection);
        if (result == null) result = caseSocialHistorySection(phcrSocialHistorySection);
        if (result == null) result = caseSection(phcrSocialHistorySection);
        if (result == null) result = caseAct(phcrSocialHistorySection);
        if (result == null) result = caseInfrastructureRoot(phcrSocialHistorySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.GEOTEMPORAL_HISTORY_OBSERVATION:
      {
        GeotemporalHistoryObservation geotemporalHistoryObservation = (GeotemporalHistoryObservation)theEObject;
        T result = caseGeotemporalHistoryObservation(geotemporalHistoryObservation);
        if (result == null) result = caseObservation(geotemporalHistoryObservation);
        if (result == null) result = caseClinicalStatement(geotemporalHistoryObservation);
        if (result == null) result = caseAct(geotemporalHistoryObservation);
        if (result == null) result = caseInfrastructureRoot(geotemporalHistoryObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION:
      {
        MostRecentTimeArrivedInUSAObservation mostRecentTimeArrivedInUSAObservation = (MostRecentTimeArrivedInUSAObservation)theEObject;
        T result = caseMostRecentTimeArrivedInUSAObservation(mostRecentTimeArrivedInUSAObservation);
        if (result == null) result = caseObservation(mostRecentTimeArrivedInUSAObservation);
        if (result == null) result = caseClinicalStatement(mostRecentTimeArrivedInUSAObservation);
        if (result == null) result = caseAct(mostRecentTimeArrivedInUSAObservation);
        if (result == null) result = caseInfrastructureRoot(mostRecentTimeArrivedInUSAObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.RACE_OBSERVATION:
      {
        RaceObservation raceObservation = (RaceObservation)theEObject;
        T result = caseRaceObservation(raceObservation);
        if (result == null) result = caseObservation(raceObservation);
        if (result == null) result = caseClinicalStatement(raceObservation);
        if (result == null) result = caseAct(raceObservation);
        if (result == null) result = caseInfrastructureRoot(raceObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.OCCUPATION_OBSERVATION:
      {
        OccupationObservation occupationObservation = (OccupationObservation)theEObject;
        T result = caseOccupationObservation(occupationObservation);
        if (result == null) result = caseObservation(occupationObservation);
        if (result == null) result = caseClinicalStatement(occupationObservation);
        if (result == null) result = caseAct(occupationObservation);
        if (result == null) result = caseInfrastructureRoot(occupationObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PREGNANCY_OBSERVATION:
      {
        PregnancyObservation pregnancyObservation = (PregnancyObservation)theEObject;
        T result = casePregnancyObservation(pregnancyObservation);
        if (result == null) result = caseObservation(pregnancyObservation);
        if (result == null) result = caseClinicalStatement(pregnancyObservation);
        if (result == null) result = caseAct(pregnancyObservation);
        if (result == null) result = caseInfrastructureRoot(pregnancyObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION:
      {
        EstimatedDateOfDeliveryObservation estimatedDateOfDeliveryObservation = (EstimatedDateOfDeliveryObservation)theEObject;
        T result = caseEstimatedDateOfDeliveryObservation(estimatedDateOfDeliveryObservation);
        if (result == null) result = caseObservation(estimatedDateOfDeliveryObservation);
        if (result == null) result = caseClinicalStatement(estimatedDateOfDeliveryObservation);
        if (result == null) result = caseAct(estimatedDateOfDeliveryObservation);
        if (result == null) result = caseInfrastructureRoot(estimatedDateOfDeliveryObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION:
      {
        PhcrClinicalInformationSection phcrClinicalInformationSection = (PhcrClinicalInformationSection)theEObject;
        T result = casePhcrClinicalInformationSection(phcrClinicalInformationSection);
        if (result == null) result = caseSection(phcrClinicalInformationSection);
        if (result == null) result = caseAct(phcrClinicalInformationSection);
        if (result == null) result = caseInfrastructureRoot(phcrClinicalInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.CASE_OBSERVATION:
      {
        CaseObservation caseObservation = (CaseObservation)theEObject;
        T result = caseCaseObservation(caseObservation);
        if (result == null) result = caseProblemObservation(caseObservation);
        if (result == null) result = caseObservation(caseObservation);
        if (result == null) result = caseClinicalStatement(caseObservation);
        if (result == null) result = caseAct(caseObservation);
        if (result == null) result = caseInfrastructureRoot(caseObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION:
      {
        SignsAndSymptomsObservation signsAndSymptomsObservation = (SignsAndSymptomsObservation)theEObject;
        T result = caseSignsAndSymptomsObservation(signsAndSymptomsObservation);
        if (result == null) result = caseObservation(signsAndSymptomsObservation);
        if (result == null) result = caseClinicalStatement(signsAndSymptomsObservation);
        if (result == null) result = caseAct(signsAndSymptomsObservation);
        if (result == null) result = caseInfrastructureRoot(signsAndSymptomsObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PATIENT_CONDITION_ALIVE_OBSERVATION:
      {
        PatientConditionAliveObservation patientConditionAliveObservation = (PatientConditionAliveObservation)theEObject;
        T result = casePatientConditionAliveObservation(patientConditionAliveObservation);
        if (result == null) result = caseObservation(patientConditionAliveObservation);
        if (result == null) result = caseClinicalStatement(patientConditionAliveObservation);
        if (result == null) result = caseAct(patientConditionAliveObservation);
        if (result == null) result = caseInfrastructureRoot(patientConditionAliveObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PATIENT_CONDITION_DECEASED_OBSERVATION:
      {
        PatientConditionDeceasedObservation patientConditionDeceasedObservation = (PatientConditionDeceasedObservation)theEObject;
        T result = casePatientConditionDeceasedObservation(patientConditionDeceasedObservation);
        if (result == null) result = caseObservation(patientConditionDeceasedObservation);
        if (result == null) result = caseClinicalStatement(patientConditionDeceasedObservation);
        if (result == null) result = caseAct(patientConditionDeceasedObservation);
        if (result == null) result = caseInfrastructureRoot(patientConditionDeceasedObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION:
      {
        PhcrRelevantMedicalConditionHistoryObservation phcrRelevantMedicalConditionHistoryObservation = (PhcrRelevantMedicalConditionHistoryObservation)theEObject;
        T result = casePhcrRelevantMedicalConditionHistoryObservation(phcrRelevantMedicalConditionHistoryObservation);
        if (result == null) result = caseObservation(phcrRelevantMedicalConditionHistoryObservation);
        if (result == null) result = caseClinicalStatement(phcrRelevantMedicalConditionHistoryObservation);
        if (result == null) result = caseAct(phcrRelevantMedicalConditionHistoryObservation);
        if (result == null) result = caseInfrastructureRoot(phcrRelevantMedicalConditionHistoryObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION:
      {
        PhcrTreatmentInformationSection phcrTreatmentInformationSection = (PhcrTreatmentInformationSection)theEObject;
        T result = casePhcrTreatmentInformationSection(phcrTreatmentInformationSection);
        if (result == null) result = caseSection(phcrTreatmentInformationSection);
        if (result == null) result = caseAct(phcrTreatmentInformationSection);
        if (result == null) result = caseInfrastructureRoot(phcrTreatmentInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.THERAPEUTIC_REGIMEN_ACT:
      {
        TherapeuticRegimenAct therapeuticRegimenAct = (TherapeuticRegimenAct)theEObject;
        T result = caseTherapeuticRegimenAct(therapeuticRegimenAct);
        if (result == null) result = caseCDA_Act(therapeuticRegimenAct);
        if (result == null) result = caseClinicalStatement(therapeuticRegimenAct);
        if (result == null) result = caseAct(therapeuticRegimenAct);
        if (result == null) result = caseInfrastructureRoot(therapeuticRegimenAct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        TreatmentGivenSubstanceAdministration treatmentGivenSubstanceAdministration = (TreatmentGivenSubstanceAdministration)theEObject;
        T result = caseTreatmentGivenSubstanceAdministration(treatmentGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(treatmentGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(treatmentGivenSubstanceAdministration);
        if (result == null) result = caseAct(treatmentGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(treatmentGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
      {
        TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration = (TreatmentNotGivenSubstanceAdministration)theEObject;
        T result = caseTreatmentNotGivenSubstanceAdministration(treatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseSubstanceAdministration(treatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseClinicalStatement(treatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseAct(treatmentNotGivenSubstanceAdministration);
        if (result == null) result = caseInfrastructureRoot(treatmentNotGivenSubstanceAdministration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PHCR_ENCOUNTERS_SECTION:
      {
        PhcrEncountersSection phcrEncountersSection = (PhcrEncountersSection)theEObject;
        T result = casePhcrEncountersSection(phcrEncountersSection);
        if (result == null) result = caseEncountersSection(phcrEncountersSection);
        if (result == null) result = caseSection(phcrEncountersSection);
        if (result == null) result = caseAct(phcrEncountersSection);
        if (result == null) result = caseInfrastructureRoot(phcrEncountersSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION:
      {
        PhcrRelevantDxTestsSection phcrRelevantDxTestsSection = (PhcrRelevantDxTestsSection)theEObject;
        T result = casePhcrRelevantDxTestsSection(phcrRelevantDxTestsSection);
        if (result == null) result = caseResultsSection(phcrRelevantDxTestsSection);
        if (result == null) result = caseSection(phcrRelevantDxTestsSection);
        if (result == null) result = caseAct(phcrRelevantDxTestsSection);
        if (result == null) result = caseInfrastructureRoot(phcrRelevantDxTestsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.RESULT_ORGANIZER:
      {
        ResultOrganizer resultOrganizer = (ResultOrganizer)theEObject;
        T result = caseResultOrganizer(resultOrganizer);
        if (result == null) result = caseCCD_ResultOrganizer(resultOrganizer);
        if (result == null) result = caseOrganizer(resultOrganizer);
        if (result == null) result = caseClinicalStatement(resultOrganizer);
        if (result == null) result = caseAct(resultOrganizer);
        if (result == null) result = caseInfrastructureRoot(resultOrganizer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.RESULT_OBSERVATION:
      {
        ResultObservation resultObservation = (ResultObservation)theEObject;
        T result = caseResultObservation(resultObservation);
        if (result == null) result = caseCCD_ResultObservation(resultObservation);
        if (result == null) result = caseObservation(resultObservation);
        if (result == null) result = caseClinicalStatement(resultObservation);
        if (result == null) result = caseAct(resultObservation);
        if (result == null) result = caseInfrastructureRoot(resultObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.SPECIMEN_COLLECTION_PROCEDURE:
      {
        SpecimenCollectionProcedure specimenCollectionProcedure = (SpecimenCollectionProcedure)theEObject;
        T result = caseSpecimenCollectionProcedure(specimenCollectionProcedure);
        if (result == null) result = caseProcedure(specimenCollectionProcedure);
        if (result == null) result = caseClinicalStatement(specimenCollectionProcedure);
        if (result == null) result = caseAct(specimenCollectionProcedure);
        if (result == null) result = caseInfrastructureRoot(specimenCollectionProcedure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.SUSCEPTIBILITY_RESULT:
      {
        SusceptibilityResult susceptibilityResult = (SusceptibilityResult)theEObject;
        T result = caseSusceptibilityResult(susceptibilityResult);
        if (result == null) result = caseObservation(susceptibilityResult);
        if (result == null) result = caseClinicalStatement(susceptibilityResult);
        if (result == null) result = caseAct(susceptibilityResult);
        if (result == null) result = caseInfrastructureRoot(susceptibilityResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PhcrPackage.IMAGING_OBSERVATION:
      {
        ImagingObservation imagingObservation = (ImagingObservation)theEObject;
        T result = caseImagingObservation(imagingObservation);
        if (result == null) result = caseProblemObservation(imagingObservation);
        if (result == null) result = caseObservation(imagingObservation);
        if (result == null) result = caseClinicalStatement(imagingObservation);
        if (result == null) result = caseAct(imagingObservation);
        if (result == null) result = caseInfrastructureRoot(imagingObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Public Health Case Report</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePublicHealthCaseReport(PublicHealthCaseReport object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhcrSocialHistorySection(PhcrSocialHistorySection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Geotemporal History Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Geotemporal History Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGeotemporalHistoryObservation(GeotemporalHistoryObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Most Recent Time Arrived In USA Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMostRecentTimeArrivedInUSAObservation(MostRecentTimeArrivedInUSAObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Race Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Race Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRaceObservation(RaceObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Occupation Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Occupation Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOccupationObservation(OccupationObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pregnancy Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePregnancyObservation(PregnancyObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estimated Date Of Delivery Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEstimatedDateOfDeliveryObservation(EstimatedDateOfDeliveryObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhcrClinicalInformationSection(PhcrClinicalInformationSection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treatment Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Therapeutic Regimen Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTherapeuticRegimenAct(TherapeuticRegimenAct object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhcrEncountersSection(PhcrEncountersSection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relevant Dx Tests Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResultOrganizer(ResultOrganizer object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResultObservation(ResultObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Specimen Collection Procedure</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specimen Collection Procedure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSpecimenCollectionProcedure(SpecimenCollectionProcedure object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imaging Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseImagingObservation(ImagingObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Patient Condition Alive Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Patient Condition Alive Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePatientConditionAliveObservation(PatientConditionAliveObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Patient Condition Deceased Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Patient Condition Deceased Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePatientConditionDeceasedObservation(PatientConditionDeceasedObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Relevant Medical Condition History Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relevant Medical Condition History Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePhcrRelevantMedicalConditionHistoryObservation(PhcrRelevantMedicalConditionHistoryObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signs And Symptoms Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSignsAndSymptomsObservation(SignsAndSymptomsObservation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Susceptibility Result</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Susceptibility Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSusceptibilityResult(SusceptibilityResult object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treatment Given Substance Administration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treatment Not Given Substance Administration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCaseObservation(CaseObservation object) {
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
	public T caseSection(Section object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSocialHistorySection(SocialHistorySection object) {
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
	public T caseClinicalStatement(ClinicalStatement object) {
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
	public T caseObservation(Observation object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseProblemObservation(ProblemObservation object) {
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
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEncountersSection(EncountersSection object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseResultsSection(ResultsSection object) {
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
	public T caseOrganizer(Organizer object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCCD_ResultOrganizer(org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer object) {
    return null;
  }

		/**
   * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCCD_ResultObservation(org.openhealthtools.mdht.uml.cda.ccd.ResultObservation object) {
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
	public T caseProcedure(Procedure object) {
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
	public T caseSubstanceAdministration(SubstanceAdministration object) {
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

} //PhcrSwitch
