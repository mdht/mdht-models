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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CocciFactoryImpl extends EFactoryImpl implements CocciFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static CocciFactory init() {
    try
    {
      CocciFactory theCocciFactory = (CocciFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/coccidioides"); 
      if (theCocciFactory != null)
      {
        return theCocciFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CocciFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CocciFactoryImpl() {
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
      case CocciPackage.COCCIDIOIDES_CASE_REPORT: return createCoccidioidesCaseReport();
      case CocciPackage.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION: return createCoccidioidesPHCRSocialHistorySection();
      case CocciPackage.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT: return createCoccidioidesPossibleExposureLocationAct();
      case CocciPackage.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION: return createCoccidioidesPHCRClinicalInformationSection();
      case CocciPackage.COCCIDIOIDES_CASE_OBSERVATION: return createCoccidioidesCaseObservation();
      case CocciPackage.COCCIDIOIDES_SIGNS_AND_SYMPTOMS_OBSERVATION: return createCoccidioidesSignsAndSymptomsObservation();
      case CocciPackage.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION: return createCoccidioidesImmunosuppressedMedicalConditionHistoryObservation();
      case CocciPackage.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION: return createCoccidioidesImmunosuppressedMedicalConditionProblemObservation();
      case CocciPackage.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION: return createCoccidioidesPHCRTreatmentInformationSection();
      case CocciPackage.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT: return createCoccidioidesTherapeuticRegimenAct();
      case CocciPackage.COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createCoccidioidesTreatmentGivenSubstanceAdministration();
      case CocciPackage.COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createCoccidioidesTreatmentNotGivenSubstanceAdministration();
      case CocciPackage.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION: return createCoccidioidesPHCRRelevantDxTestsSection();
      case CocciPackage.COCCIDIOIDES_RESULT_OBSERVATION: return createCoccidioidesResultObservation();
      case CocciPackage.COCCIDIOIDES_RESULT_ORGANIZER: return createCoccidioidesResultOrganizer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesCaseReport createCoccidioidesCaseReport() {
    CoccidioidesCaseReportImpl coccidioidesCaseReport = new CoccidioidesCaseReportImpl();
    return coccidioidesCaseReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRSocialHistorySection createCoccidioidesPHCRSocialHistorySection() {
    CoccidioidesPHCRSocialHistorySectionImpl coccidioidesPHCRSocialHistorySection = new CoccidioidesPHCRSocialHistorySectionImpl();
    return coccidioidesPHCRSocialHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPossibleExposureLocationAct createCoccidioidesPossibleExposureLocationAct() {
    CoccidioidesPossibleExposureLocationActImpl coccidioidesPossibleExposureLocationAct = new CoccidioidesPossibleExposureLocationActImpl();
    return coccidioidesPossibleExposureLocationAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRClinicalInformationSection createCoccidioidesPHCRClinicalInformationSection() {
    CoccidioidesPHCRClinicalInformationSectionImpl coccidioidesPHCRClinicalInformationSection = new CoccidioidesPHCRClinicalInformationSectionImpl();
    return coccidioidesPHCRClinicalInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesCaseObservation createCoccidioidesCaseObservation() {
    CoccidioidesCaseObservationImpl coccidioidesCaseObservation = new CoccidioidesCaseObservationImpl();
    return coccidioidesCaseObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesSignsAndSymptomsObservation createCoccidioidesSignsAndSymptomsObservation() {
    CoccidioidesSignsAndSymptomsObservationImpl coccidioidesSignsAndSymptomsObservation = new CoccidioidesSignsAndSymptomsObservationImpl();
    return coccidioidesSignsAndSymptomsObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesImmunosuppressedMedicalConditionHistoryObservation createCoccidioidesImmunosuppressedMedicalConditionHistoryObservation() {
    CoccidioidesImmunosuppressedMedicalConditionHistoryObservationImpl coccidioidesImmunosuppressedMedicalConditionHistoryObservation = new CoccidioidesImmunosuppressedMedicalConditionHistoryObservationImpl();
    return coccidioidesImmunosuppressedMedicalConditionHistoryObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesImmunosuppressedMedicalConditionProblemObservation createCoccidioidesImmunosuppressedMedicalConditionProblemObservation() {
    CoccidioidesImmunosuppressedMedicalConditionProblemObservationImpl coccidioidesImmunosuppressedMedicalConditionProblemObservation = new CoccidioidesImmunosuppressedMedicalConditionProblemObservationImpl();
    return coccidioidesImmunosuppressedMedicalConditionProblemObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRTreatmentInformationSection createCoccidioidesPHCRTreatmentInformationSection() {
    CoccidioidesPHCRTreatmentInformationSectionImpl coccidioidesPHCRTreatmentInformationSection = new CoccidioidesPHCRTreatmentInformationSectionImpl();
    return coccidioidesPHCRTreatmentInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesTherapeuticRegimenAct createCoccidioidesTherapeuticRegimenAct() {
    CoccidioidesTherapeuticRegimenActImpl coccidioidesTherapeuticRegimenAct = new CoccidioidesTherapeuticRegimenActImpl();
    return coccidioidesTherapeuticRegimenAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesPHCRRelevantDxTestsSection createCoccidioidesPHCRRelevantDxTestsSection() {
    CoccidioidesPHCRRelevantDxTestsSectionImpl coccidioidesPHCRRelevantDxTestsSection = new CoccidioidesPHCRRelevantDxTestsSectionImpl();
    return coccidioidesPHCRRelevantDxTestsSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesResultObservation createCoccidioidesResultObservation() {
    CoccidioidesResultObservationImpl coccidioidesResultObservation = new CoccidioidesResultObservationImpl();
    return coccidioidesResultObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesResultOrganizer createCoccidioidesResultOrganizer() {
    CoccidioidesResultOrganizerImpl coccidioidesResultOrganizer = new CoccidioidesResultOrganizerImpl();
    return coccidioidesResultOrganizer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesTreatmentGivenSubstanceAdministration createCoccidioidesTreatmentGivenSubstanceAdministration() {
    CoccidioidesTreatmentGivenSubstanceAdministrationImpl coccidioidesTreatmentGivenSubstanceAdministration = new CoccidioidesTreatmentGivenSubstanceAdministrationImpl();
    return coccidioidesTreatmentGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CoccidioidesTreatmentNotGivenSubstanceAdministration createCoccidioidesTreatmentNotGivenSubstanceAdministration() {
    CoccidioidesTreatmentNotGivenSubstanceAdministrationImpl coccidioidesTreatmentNotGivenSubstanceAdministration = new CoccidioidesTreatmentNotGivenSubstanceAdministrationImpl();
    return coccidioidesTreatmentNotGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CocciPackage getCocciPackage() {
    return (CocciPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static CocciPackage getPackage() {
    return CocciPackage.eINSTANCE;
  }

} //CocciFactoryImpl
