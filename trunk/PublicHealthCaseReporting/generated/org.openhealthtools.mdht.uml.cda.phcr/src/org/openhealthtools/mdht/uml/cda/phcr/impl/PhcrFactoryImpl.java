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
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhcrFactoryImpl extends EFactoryImpl implements PhcrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PhcrFactory init()
  {
    try
    {
      PhcrFactory thePhcrFactory = (PhcrFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr"); 
      if (thePhcrFactory != null)
      {
        return thePhcrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PhcrFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhcrFactoryImpl()
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
      case PhcrPackage.PUBLIC_HEALTH_CASE_REPORT: return createPublicHealthCaseReport();
      case PhcrPackage.PHCR_SOCIAL_HISTORY_SECTION: return createPhcrSocialHistorySection();
      case PhcrPackage.GEOTEMPORAL_HISTORY_OBSERVATION: return createGeotemporalHistoryObservation();
      case PhcrPackage.MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION: return createMostRecentTimeArrivedInUSAObservation();
      case PhcrPackage.RACE_OBSERVATION: return createRaceObservation();
      case PhcrPackage.OCCUPATION_OBSERVATION: return createOccupationObservation();
      case PhcrPackage.PREGNANCY_OBSERVATION: return createPregnancyObservation();
      case PhcrPackage.ESTIMATED_DATE_OF_DELIVERY_OBSERVATION: return createEstimatedDateOfDeliveryObservation();
      case PhcrPackage.PHCR_CLINICAL_INFORMATION_SECTION: return createPhcrClinicalInformationSection();
      case PhcrPackage.CASE_OBSERVATION: return createCaseObservation();
      case PhcrPackage.SIGNS_AND_SYMPTOMS_OBSERVATION: return createSignsAndSymptomsObservation();
      case PhcrPackage.PATIENT_CONDITION_ALIVE_OBSERVATION: return createPatientConditionAliveObservation();
      case PhcrPackage.PATIENT_CONDITION_DECEASED_OBSERVATION: return createPatientConditionDeceasedObservation();
      case PhcrPackage.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION: return createPhcrRelevantMedicalConditionHistoryObservation();
      case PhcrPackage.PHCR_TREATMENT_INFORMATION_SECTION: return createPhcrTreatmentInformationSection();
      case PhcrPackage.THERAPEUTIC_REGIMEN_ACT: return createTherapeuticRegimenAct();
      case PhcrPackage.TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createTreatmentGivenSubstanceAdministration();
      case PhcrPackage.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createTreatmentNotGivenSubstanceAdministration();
      case PhcrPackage.PHCR_ENCOUNTERS_SECTION: return createPhcrEncountersSection();
      case PhcrPackage.PHCR_RELEVANT_DX_TESTS_SECTION: return createPhcrRelevantDxTestsSection();
      case PhcrPackage.RESULT_ORGANIZER: return createResultOrganizer();
      case PhcrPackage.RESULT_OBSERVATION: return createResultObservation();
      case PhcrPackage.SPECIMEN_COLLECTION_PROCEDURE: return createSpecimenCollectionProcedure();
      case PhcrPackage.SUSCEPTIBILITY_RESULT: return createSusceptibilityResult();
      case PhcrPackage.IMAGING_OBSERVATION: return createImagingObservation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PublicHealthCaseReport createPublicHealthCaseReport() {
    PublicHealthCaseReportImpl publicHealthCaseReport = new PublicHealthCaseReportImpl();
    return publicHealthCaseReport;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrSocialHistorySection createPhcrSocialHistorySection() {
    PhcrSocialHistorySectionImpl phcrSocialHistorySection = new PhcrSocialHistorySectionImpl();
    return phcrSocialHistorySection;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeotemporalHistoryObservation createGeotemporalHistoryObservation() {
    GeotemporalHistoryObservationImpl geotemporalHistoryObservation = new GeotemporalHistoryObservationImpl();
    return geotemporalHistoryObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MostRecentTimeArrivedInUSAObservation createMostRecentTimeArrivedInUSAObservation() {
    MostRecentTimeArrivedInUSAObservationImpl mostRecentTimeArrivedInUSAObservation = new MostRecentTimeArrivedInUSAObservationImpl();
    return mostRecentTimeArrivedInUSAObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public RaceObservation createRaceObservation() {
    RaceObservationImpl raceObservation = new RaceObservationImpl();
    return raceObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OccupationObservation createOccupationObservation() {
    OccupationObservationImpl occupationObservation = new OccupationObservationImpl();
    return occupationObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PregnancyObservation createPregnancyObservation() {
    PregnancyObservationImpl pregnancyObservation = new PregnancyObservationImpl();
    return pregnancyObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EstimatedDateOfDeliveryObservation createEstimatedDateOfDeliveryObservation() {
    EstimatedDateOfDeliveryObservationImpl estimatedDateOfDeliveryObservation = new EstimatedDateOfDeliveryObservationImpl();
    return estimatedDateOfDeliveryObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrClinicalInformationSection createPhcrClinicalInformationSection() {
    PhcrClinicalInformationSectionImpl phcrClinicalInformationSection = new PhcrClinicalInformationSectionImpl();
    return phcrClinicalInformationSection;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrTreatmentInformationSection createPhcrTreatmentInformationSection() {
    PhcrTreatmentInformationSectionImpl phcrTreatmentInformationSection = new PhcrTreatmentInformationSectionImpl();
    return phcrTreatmentInformationSection;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TherapeuticRegimenAct createTherapeuticRegimenAct() {
    TherapeuticRegimenActImpl therapeuticRegimenAct = new TherapeuticRegimenActImpl();
    return therapeuticRegimenAct;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrEncountersSection createPhcrEncountersSection() {
    PhcrEncountersSectionImpl phcrEncountersSection = new PhcrEncountersSectionImpl();
    return phcrEncountersSection;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrRelevantDxTestsSection createPhcrRelevantDxTestsSection() {
    PhcrRelevantDxTestsSectionImpl phcrRelevantDxTestsSection = new PhcrRelevantDxTestsSectionImpl();
    return phcrRelevantDxTestsSection;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultOrganizer createResultOrganizer() {
    ResultOrganizerImpl resultOrganizer = new ResultOrganizerImpl();
    return resultOrganizer;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultObservation createResultObservation() {
    ResultObservationImpl resultObservation = new ResultObservationImpl();
    return resultObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SpecimenCollectionProcedure createSpecimenCollectionProcedure() {
    SpecimenCollectionProcedureImpl specimenCollectionProcedure = new SpecimenCollectionProcedureImpl();
    return specimenCollectionProcedure;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImagingObservation createImagingObservation() {
    ImagingObservationImpl imagingObservation = new ImagingObservationImpl();
    return imagingObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PatientConditionAliveObservation createPatientConditionAliveObservation() {
    PatientConditionAliveObservationImpl patientConditionAliveObservation = new PatientConditionAliveObservationImpl();
    return patientConditionAliveObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PatientConditionDeceasedObservation createPatientConditionDeceasedObservation() {
    PatientConditionDeceasedObservationImpl patientConditionDeceasedObservation = new PatientConditionDeceasedObservationImpl();
    return patientConditionDeceasedObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhcrRelevantMedicalConditionHistoryObservation createPhcrRelevantMedicalConditionHistoryObservation() {
    PhcrRelevantMedicalConditionHistoryObservationImpl phcrRelevantMedicalConditionHistoryObservation = new PhcrRelevantMedicalConditionHistoryObservationImpl();
    return phcrRelevantMedicalConditionHistoryObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SignsAndSymptomsObservation createSignsAndSymptomsObservation() {
    SignsAndSymptomsObservationImpl signsAndSymptomsObservation = new SignsAndSymptomsObservationImpl();
    return signsAndSymptomsObservation;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SusceptibilityResult createSusceptibilityResult() {
    SusceptibilityResultImpl susceptibilityResult = new SusceptibilityResultImpl();
    return susceptibilityResult;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TreatmentGivenSubstanceAdministration createTreatmentGivenSubstanceAdministration() {
    TreatmentGivenSubstanceAdministrationImpl treatmentGivenSubstanceAdministration = new TreatmentGivenSubstanceAdministrationImpl();
    return treatmentGivenSubstanceAdministration;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TreatmentNotGivenSubstanceAdministration createTreatmentNotGivenSubstanceAdministration() {
    TreatmentNotGivenSubstanceAdministrationImpl treatmentNotGivenSubstanceAdministration = new TreatmentNotGivenSubstanceAdministrationImpl();
    return treatmentNotGivenSubstanceAdministration;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CaseObservation createCaseObservation() {
    CaseObservationImpl caseObservation = new CaseObservationImpl();
    return caseObservation;
  }

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhcrPackage getPhcrPackage()
  {
    return (PhcrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PhcrPackage getPackage()
  {
    return PhcrPackage.eINSTANCE;
  }

} //PhcrFactoryImpl
