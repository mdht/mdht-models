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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.anthrax.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnthraxFactoryImpl extends EFactoryImpl implements AnthraxFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static AnthraxFactory init() {
    try
    {
      AnthraxFactory theAnthraxFactory = (AnthraxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/anthrax"); 
      if (theAnthraxFactory != null)
      {
        return theAnthraxFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnthraxFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxFactoryImpl() {
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
      case AnthraxPackage.ANTHRAX_CASE_REPORT: return createAnthraxCaseReport();
      case AnthraxPackage.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION: return createAnthraxPhcrSocialHistorySection();
      case AnthraxPackage.ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT: return createAnthraxPossibleExpossureLocationAndTypeAct();
      case AnthraxPackage.ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION: return createAnthraxPhcrClinicalInformationSection();
      case AnthraxPackage.ANTHRAX_CASE_OBSERVATION: return createAnthraxCaseObservation();
      case AnthraxPackage.ANTHRAX_SIGNS_AND_SYMPTOMS_OBSERVATION: return createAnthraxSignsAndSymptomsObservation();
      case AnthraxPackage.ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION: return createAnthraxPhcrTreatmentInformationSection();
      case AnthraxPackage.ANTHRAX_THERAPEUTIC_REGIMEN_ACT: return createAnthraxTherapeuticRegimenAct();
      case AnthraxPackage.ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createAnthraxTreatmentGivenSubstanceAdministration();
      case AnthraxPackage.ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createAnthraxTreatmentNotGivenSubstanceAdministration();
      case AnthraxPackage.ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION: return createAnthraxPhcrRelevantDxTestsSection();
      case AnthraxPackage.ANTHRAX_RESULT_ORGANIZER: return createAnthraxResultOrganizer();
      case AnthraxPackage.ANTHRAX_RESULT_OBSERVATION: return createAnthraxResultObservation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxCaseReport createAnthraxCaseReport() {
    AnthraxCaseReportImpl anthraxCaseReport = new AnthraxCaseReportImpl();
    return anthraxCaseReport;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrClinicalInformationSection createAnthraxPhcrClinicalInformationSection() {
    AnthraxPhcrClinicalInformationSectionImpl anthraxPhcrClinicalInformationSection = new AnthraxPhcrClinicalInformationSectionImpl();
    return anthraxPhcrClinicalInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxCaseObservation createAnthraxCaseObservation() {
    AnthraxCaseObservationImpl anthraxCaseObservation = new AnthraxCaseObservationImpl();
    return anthraxCaseObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxSignsAndSymptomsObservation createAnthraxSignsAndSymptomsObservation() {
    AnthraxSignsAndSymptomsObservationImpl anthraxSignsAndSymptomsObservation = new AnthraxSignsAndSymptomsObservationImpl();
    return anthraxSignsAndSymptomsObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrRelevantDxTestsSection createAnthraxPhcrRelevantDxTestsSection() {
    AnthraxPhcrRelevantDxTestsSectionImpl anthraxPhcrRelevantDxTestsSection = new AnthraxPhcrRelevantDxTestsSectionImpl();
    return anthraxPhcrRelevantDxTestsSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxResultObservation createAnthraxResultObservation() {
    AnthraxResultObservationImpl anthraxResultObservation = new AnthraxResultObservationImpl();
    return anthraxResultObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxResultOrganizer createAnthraxResultOrganizer() {
    AnthraxResultOrganizerImpl anthraxResultOrganizer = new AnthraxResultOrganizerImpl();
    return anthraxResultOrganizer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrSocialHistorySection createAnthraxPhcrSocialHistorySection() {
    AnthraxPhcrSocialHistorySectionImpl anthraxPhcrSocialHistorySection = new AnthraxPhcrSocialHistorySectionImpl();
    return anthraxPhcrSocialHistorySection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPossibleExpossureLocationAndTypeAct createAnthraxPossibleExpossureLocationAndTypeAct() {
    AnthraxPossibleExpossureLocationAndTypeActImpl anthraxPossibleExpossureLocationAndTypeAct = new AnthraxPossibleExpossureLocationAndTypeActImpl();
    return anthraxPossibleExpossureLocationAndTypeAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPhcrTreatmentInformationSection createAnthraxPhcrTreatmentInformationSection() {
    AnthraxPhcrTreatmentInformationSectionImpl anthraxPhcrTreatmentInformationSection = new AnthraxPhcrTreatmentInformationSectionImpl();
    return anthraxPhcrTreatmentInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxTherapeuticRegimenAct createAnthraxTherapeuticRegimenAct() {
    AnthraxTherapeuticRegimenActImpl anthraxTherapeuticRegimenAct = new AnthraxTherapeuticRegimenActImpl();
    return anthraxTherapeuticRegimenAct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxTreatmentGivenSubstanceAdministration createAnthraxTreatmentGivenSubstanceAdministration() {
    AnthraxTreatmentGivenSubstanceAdministrationImpl anthraxTreatmentGivenSubstanceAdministration = new AnthraxTreatmentGivenSubstanceAdministrationImpl();
    return anthraxTreatmentGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxTreatmentNotGivenSubstanceAdministration createAnthraxTreatmentNotGivenSubstanceAdministration() {
    AnthraxTreatmentNotGivenSubstanceAdministrationImpl anthraxTreatmentNotGivenSubstanceAdministration = new AnthraxTreatmentNotGivenSubstanceAdministrationImpl();
    return anthraxTreatmentNotGivenSubstanceAdministration;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AnthraxPackage getAnthraxPackage() {
    return (AnthraxPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static AnthraxPackage getPackage() {
    return AnthraxPackage.eINSTANCE;
  }

} //AnthraxFactoryImpl
