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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrepPneumoFactoryImpl extends EFactoryImpl implements StrepPneumoFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static StrepPneumoFactory init() {
    try
    {
      StrepPneumoFactory theStrepPneumoFactory = (StrepPneumoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/streppneumo"); 
      if (theStrepPneumoFactory != null)
      {
        return theStrepPneumoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StrepPneumoFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoFactoryImpl() {
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
      case StrepPneumoPackage.STREP_PNEUMO_CASE_REPORT: return createStrepPneumoCaseReport();
      case StrepPneumoPackage.STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION: return createStrepPneumoPHCRClinicalInformationSection();
      case StrepPneumoPackage.STREP_PNEUMO_CASE_OBSERVATION: return createStrepPneumoCaseObservation();
      case StrepPneumoPackage.STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION: return createStrepPneumoSignsAndSymptomsObservation();
      case StrepPneumoPackage.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION: return createStrepPneumoPHCRTreatmentInformationSection();
      case StrepPneumoPackage.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT: return createStrepPneumoTherapeuticRegimenAct();
      case StrepPneumoPackage.STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createStrepPneumoTreatmentGivenSubstanceAdministration();
      case StrepPneumoPackage.STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createStrepPneumoTreatmentNotGivenSubstanceAdministration();
      case StrepPneumoPackage.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION: return createStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection();
      case StrepPneumoPackage.STREP_PNEUMO_RESULT_OBSERVATION: return createStrepPneumoResultObservation();
      case StrepPneumoPackage.STREP_PNEUMO_RESULT_ORGANIZER: return createStrepPneumoResultOrganizer();
      case StrepPneumoPackage.STREP_PNEUMO_SOCIAL_HISTORY_SECTION: return createStrepPneumoSocialHistorySection();
      case StrepPneumoPackage.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT: return createStrepPneumoPossibleExposureLocationAct();
      case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_SECTION: return createStrepPneumoImmunizationSection();
      case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_ACTIVITY: return createStrepPneumoImmunizationActivity();
      case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_PRODUCT: return createStrepPneumoImmunizationProduct();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoCaseReport createStrepPneumoCaseReport() {
    StrepPneumoCaseReportImpl strepPneumoCaseReport = new StrepPneumoCaseReportImpl();
    return strepPneumoCaseReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoPHCRClinicalInformationSection createStrepPneumoPHCRClinicalInformationSection() {
    StrepPneumoPHCRClinicalInformationSectionImpl strepPneumoPHCRClinicalInformationSection = new StrepPneumoPHCRClinicalInformationSectionImpl();
    return strepPneumoPHCRClinicalInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoCaseObservation createStrepPneumoCaseObservation() {
    StrepPneumoCaseObservationImpl strepPneumoCaseObservation = new StrepPneumoCaseObservationImpl();
    return strepPneumoCaseObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoSignsAndSymptomsObservation createStrepPneumoSignsAndSymptomsObservation() {
    StrepPneumoSignsAndSymptomsObservationImpl strepPneumoSignsAndSymptomsObservation = new StrepPneumoSignsAndSymptomsObservationImpl();
    return strepPneumoSignsAndSymptomsObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoPHCRTreatmentInformationSection createStrepPneumoPHCRTreatmentInformationSection() {
    StrepPneumoPHCRTreatmentInformationSectionImpl strepPneumoPHCRTreatmentInformationSection = new StrepPneumoPHCRTreatmentInformationSectionImpl();
    return strepPneumoPHCRTreatmentInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoTherapeuticRegimenAct createStrepPneumoTherapeuticRegimenAct() {
    StrepPneumoTherapeuticRegimenActImpl strepPneumoTherapeuticRegimenAct = new StrepPneumoTherapeuticRegimenActImpl();
    return strepPneumoTherapeuticRegimenAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoTreatmentGivenSubstanceAdministration createStrepPneumoTreatmentGivenSubstanceAdministration() {
    StrepPneumoTreatmentGivenSubstanceAdministrationImpl strepPneumoTreatmentGivenSubstanceAdministration = new StrepPneumoTreatmentGivenSubstanceAdministrationImpl();
    return strepPneumoTreatmentGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoTreatmentNotGivenSubstanceAdministration createStrepPneumoTreatmentNotGivenSubstanceAdministration() {
    StrepPneumoTreatmentNotGivenSubstanceAdministrationImpl strepPneumoTreatmentNotGivenSubstanceAdministration = new StrepPneumoTreatmentNotGivenSubstanceAdministrationImpl();
    return strepPneumoTreatmentNotGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection createStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
    StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection = new StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionImpl();
    return strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoResultObservation createStrepPneumoResultObservation() {
    StrepPneumoResultObservationImpl strepPneumoResultObservation = new StrepPneumoResultObservationImpl();
    return strepPneumoResultObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoResultOrganizer createStrepPneumoResultOrganizer() {
    StrepPneumoResultOrganizerImpl strepPneumoResultOrganizer = new StrepPneumoResultOrganizerImpl();
    return strepPneumoResultOrganizer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoSocialHistorySection createStrepPneumoSocialHistorySection() {
    StrepPneumoSocialHistorySectionImpl strepPneumoSocialHistorySection = new StrepPneumoSocialHistorySectionImpl();
    return strepPneumoSocialHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoPossibleExposureLocationAct createStrepPneumoPossibleExposureLocationAct() {
    StrepPneumoPossibleExposureLocationActImpl strepPneumoPossibleExposureLocationAct = new StrepPneumoPossibleExposureLocationActImpl();
    return strepPneumoPossibleExposureLocationAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoImmunizationSection createStrepPneumoImmunizationSection() {
    StrepPneumoImmunizationSectionImpl strepPneumoImmunizationSection = new StrepPneumoImmunizationSectionImpl();
    return strepPneumoImmunizationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoImmunizationActivity createStrepPneumoImmunizationActivity() {
    StrepPneumoImmunizationActivityImpl strepPneumoImmunizationActivity = new StrepPneumoImmunizationActivityImpl();
    return strepPneumoImmunizationActivity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoImmunizationProduct createStrepPneumoImmunizationProduct() {
    StrepPneumoImmunizationProductImpl strepPneumoImmunizationProduct = new StrepPneumoImmunizationProductImpl();
    return strepPneumoImmunizationProduct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StrepPneumoPackage getStrepPneumoPackage() {
    return (StrepPneumoPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static StrepPneumoPackage getPackage() {
    return StrepPneumoPackage.eINSTANCE;
  }

} //StrepPneumoFactoryImpl
