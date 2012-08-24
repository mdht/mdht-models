/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TularemiaFactoryImpl extends EFactoryImpl implements TularemiaFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static TularemiaFactory init() {
    try
    {
      TularemiaFactory theTularemiaFactory = (TularemiaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/tularemia"); 
      if (theTularemiaFactory != null)
      {
        return theTularemiaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TularemiaFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case TularemiaPackage.TULAREMIA_CASE_REPORT: return createTularemiaCaseReport();
      case TularemiaPackage.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION: return createTularemiaPHCRSocialHistorySection();
      case TularemiaPackage.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT: return createTularemiaPossibleExposureLocationAndTypeAct();
      case TularemiaPackage.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION: return createTularemiaPHCRClinicalInformationSection();
      case TularemiaPackage.TULAREMIA_CASE_OBSERVATION: return createTularemiaCaseObservation();
      case TularemiaPackage.TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION: return createTularemiaSignsAndSymptomsObservation();
      case TularemiaPackage.LOCATION_OF_LESION_OBSERVATION: return createLocationOfLesionObservation();
      case TularemiaPackage.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION: return createTularemiaPHCRTreatmentInformationSection();
      case TularemiaPackage.TULAREMIA_THERAPEUTIC_REGIMEN_ACT: return createTularemiaTherapeuticRegimenAct();
      case TularemiaPackage.TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createTularemiaTreatmentGivenSubstanceAdministration();
      case TularemiaPackage.TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createTularemiaTreatmentNotGivenSubstanceAdministration();
      case TularemiaPackage.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION: return createTularemiaPHCRRelevantDxTestsSection();
      case TularemiaPackage.TULAREMIA_RESULT_ORGANIZER: return createTularemiaResultOrganizer();
      case TularemiaPackage.TULAREMIA_RESULT_OBSERVATION: return createTularemiaResultObservation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaCaseReport createTularemiaCaseReport() {
    TularemiaCaseReportImpl tularemiaCaseReport = new TularemiaCaseReportImpl();
    return tularemiaCaseReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaPHCRSocialHistorySection createTularemiaPHCRSocialHistorySection() {
    TularemiaPHCRSocialHistorySectionImpl tularemiaPHCRSocialHistorySection = new TularemiaPHCRSocialHistorySectionImpl();
    return tularemiaPHCRSocialHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaPossibleExposureLocationAndTypeAct createTularemiaPossibleExposureLocationAndTypeAct() {
    TularemiaPossibleExposureLocationAndTypeActImpl tularemiaPossibleExposureLocationAndTypeAct = new TularemiaPossibleExposureLocationAndTypeActImpl();
    return tularemiaPossibleExposureLocationAndTypeAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaPHCRClinicalInformationSection createTularemiaPHCRClinicalInformationSection() {
    TularemiaPHCRClinicalInformationSectionImpl tularemiaPHCRClinicalInformationSection = new TularemiaPHCRClinicalInformationSectionImpl();
    return tularemiaPHCRClinicalInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaCaseObservation createTularemiaCaseObservation() {
    TularemiaCaseObservationImpl tularemiaCaseObservation = new TularemiaCaseObservationImpl();
    return tularemiaCaseObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaSignsAndSymptomsObservation createTularemiaSignsAndSymptomsObservation() {
    TularemiaSignsAndSymptomsObservationImpl tularemiaSignsAndSymptomsObservation = new TularemiaSignsAndSymptomsObservationImpl();
    return tularemiaSignsAndSymptomsObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public LocationOfLesionObservation createLocationOfLesionObservation() {
    LocationOfLesionObservationImpl locationOfLesionObservation = new LocationOfLesionObservationImpl();
    return locationOfLesionObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaPHCRTreatmentInformationSection createTularemiaPHCRTreatmentInformationSection() {
    TularemiaPHCRTreatmentInformationSectionImpl tularemiaPHCRTreatmentInformationSection = new TularemiaPHCRTreatmentInformationSectionImpl();
    return tularemiaPHCRTreatmentInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaTherapeuticRegimenAct createTularemiaTherapeuticRegimenAct() {
    TularemiaTherapeuticRegimenActImpl tularemiaTherapeuticRegimenAct = new TularemiaTherapeuticRegimenActImpl();
    return tularemiaTherapeuticRegimenAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaTreatmentGivenSubstanceAdministration createTularemiaTreatmentGivenSubstanceAdministration() {
    TularemiaTreatmentGivenSubstanceAdministrationImpl tularemiaTreatmentGivenSubstanceAdministration = new TularemiaTreatmentGivenSubstanceAdministrationImpl();
    return tularemiaTreatmentGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaTreatmentNotGivenSubstanceAdministration createTularemiaTreatmentNotGivenSubstanceAdministration() {
    TularemiaTreatmentNotGivenSubstanceAdministrationImpl tularemiaTreatmentNotGivenSubstanceAdministration = new TularemiaTreatmentNotGivenSubstanceAdministrationImpl();
    return tularemiaTreatmentNotGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaPHCRRelevantDxTestsSection createTularemiaPHCRRelevantDxTestsSection() {
    TularemiaPHCRRelevantDxTestsSectionImpl tularemiaPHCRRelevantDxTestsSection = new TularemiaPHCRRelevantDxTestsSectionImpl();
    return tularemiaPHCRRelevantDxTestsSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaResultOrganizer createTularemiaResultOrganizer() {
    TularemiaResultOrganizerImpl tularemiaResultOrganizer = new TularemiaResultOrganizerImpl();
    return tularemiaResultOrganizer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaResultObservation createTularemiaResultObservation() {
    TularemiaResultObservationImpl tularemiaResultObservation = new TularemiaResultObservationImpl();
    return tularemiaResultObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TularemiaPackage getTularemiaPackage() {
    return (TularemiaPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static TularemiaPackage getPackage() {
    return TularemiaPackage.eINSTANCE;
  }

} //TularemiaFactoryImpl
