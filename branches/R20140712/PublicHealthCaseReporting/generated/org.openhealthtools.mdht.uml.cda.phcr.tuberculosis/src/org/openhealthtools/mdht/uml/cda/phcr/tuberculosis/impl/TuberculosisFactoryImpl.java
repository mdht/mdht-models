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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuberculosisFactoryImpl extends EFactoryImpl implements TuberculosisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TuberculosisFactory init() {
		try {
			TuberculosisFactory theTuberculosisFactory = (TuberculosisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/phcr/tuberculosis"); 
			if (theTuberculosisFactory != null) {
				return theTuberculosisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TuberculosisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TuberculosisPackage.TUBERCULOSIS_CASE_REPORT: return createTuberculosisCaseReport();
			case TuberculosisPackage.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION: return createTuberculosisPHCRSocialHistorySection();
			case TuberculosisPackage.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT: return createTuberculosisPossibleExposureLocationAct();
			case TuberculosisPackage.TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION: return createTuberculosisSocioBehavioralBooleanRiskFactorObservation();
			case TuberculosisPackage.SMOKING_STATUS_OBSERVATION: return createSmokingStatusObservation();
			case TuberculosisPackage.HIV_STATUS_OBSERVATION: return createHIVStatusObservation();
			case TuberculosisPackage.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION: return createTuberculosisPHCRClinicalInformationSection();
			case TuberculosisPackage.TUBERCULOSIS_CASE_OBSERVATION: return createTuberculosisCaseObservation();
			case TuberculosisPackage.TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION: return createTuberculosisSignsAndSymptomsObservation();
			case TuberculosisPackage.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION: return createTuberculosisSiteOfTBDiseaseObservation();
			case TuberculosisPackage.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION: return createTuberculosisRelevantMedicalConditionHistoryObservation();
			case TuberculosisPackage.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION: return createTuberculosisRelevantMedicalConditionProblemObservation();
			case TuberculosisPackage.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION: return createTuberculosisPHCRRelevantDxTestsSection();
			case TuberculosisPackage.TUBERCULOSIS_RESULT_ORGANIZER: return createTuberculosisResultOrganizer();
			case TuberculosisPackage.TUBERCULOSIS_RESULT_OBSERVATION: return createTuberculosisResultObservation();
			case TuberculosisPackage.TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION: return createTuberculosisPHCRTreatmentInformationSection();
			case TuberculosisPackage.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT: return createTuberculosisTherapeuticRegimenAct();
			case TuberculosisPackage.TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION: return createTuberculosisTreatmentGivenSubstanceAdministration();
			case TuberculosisPackage.TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION: return createTuberculosisTreatmentNotGivenSubstanceAdministration();
			case TuberculosisPackage.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION: return createTuberculosisPHCRImmunizationSection();
			case TuberculosisPackage.TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION: return createTuberculosisImmunizationActivitySubstanceAdministration();
			case TuberculosisPackage.TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT: return createTuberculosisImmunizationManufacturedProduct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisCaseReport createTuberculosisCaseReport() {
		TuberculosisCaseReportImpl tuberculosisCaseReport = new TuberculosisCaseReportImpl();
		return tuberculosisCaseReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRSocialHistorySection createTuberculosisPHCRSocialHistorySection() {
		TuberculosisPHCRSocialHistorySectionImpl tuberculosisPHCRSocialHistorySection = new TuberculosisPHCRSocialHistorySectionImpl();
		return tuberculosisPHCRSocialHistorySection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPossibleExposureLocationAct createTuberculosisPossibleExposureLocationAct() {
		TuberculosisPossibleExposureLocationActImpl tuberculosisPossibleExposureLocationAct = new TuberculosisPossibleExposureLocationActImpl();
		return tuberculosisPossibleExposureLocationAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisSocioBehavioralBooleanRiskFactorObservation createTuberculosisSocioBehavioralBooleanRiskFactorObservation() {
		TuberculosisSocioBehavioralBooleanRiskFactorObservationImpl tuberculosisSocioBehavioralBooleanRiskFactorObservation = new TuberculosisSocioBehavioralBooleanRiskFactorObservationImpl();
		return tuberculosisSocioBehavioralBooleanRiskFactorObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokingStatusObservation createSmokingStatusObservation() {
		SmokingStatusObservationImpl smokingStatusObservation = new SmokingStatusObservationImpl();
		return smokingStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HIVStatusObservation createHIVStatusObservation() {
		HIVStatusObservationImpl hivStatusObservation = new HIVStatusObservationImpl();
		return hivStatusObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRClinicalInformationSection createTuberculosisPHCRClinicalInformationSection() {
		TuberculosisPHCRClinicalInformationSectionImpl tuberculosisPHCRClinicalInformationSection = new TuberculosisPHCRClinicalInformationSectionImpl();
		return tuberculosisPHCRClinicalInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisCaseObservation createTuberculosisCaseObservation() {
		TuberculosisCaseObservationImpl tuberculosisCaseObservation = new TuberculosisCaseObservationImpl();
		return tuberculosisCaseObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisSignsAndSymptomsObservation createTuberculosisSignsAndSymptomsObservation() {
		TuberculosisSignsAndSymptomsObservationImpl tuberculosisSignsAndSymptomsObservation = new TuberculosisSignsAndSymptomsObservationImpl();
		return tuberculosisSignsAndSymptomsObservation;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisRelevantMedicalConditionHistoryObservation createTuberculosisRelevantMedicalConditionHistoryObservation()
  {
		TuberculosisRelevantMedicalConditionHistoryObservationImpl tuberculosisRelevantMedicalConditionHistoryObservation = new TuberculosisRelevantMedicalConditionHistoryObservationImpl();
		return tuberculosisRelevantMedicalConditionHistoryObservation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisRelevantMedicalConditionProblemObservation createTuberculosisRelevantMedicalConditionProblemObservation()
  {
		TuberculosisRelevantMedicalConditionProblemObservationImpl tuberculosisRelevantMedicalConditionProblemObservation = new TuberculosisRelevantMedicalConditionProblemObservationImpl();
		return tuberculosisRelevantMedicalConditionProblemObservation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRRelevantDxTestsSection createTuberculosisPHCRRelevantDxTestsSection() {
		TuberculosisPHCRRelevantDxTestsSectionImpl tuberculosisPHCRRelevantDxTestsSection = new TuberculosisPHCRRelevantDxTestsSectionImpl();
		return tuberculosisPHCRRelevantDxTestsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisResultOrganizer createTuberculosisResultOrganizer() {
		TuberculosisResultOrganizerImpl tuberculosisResultOrganizer = new TuberculosisResultOrganizerImpl();
		return tuberculosisResultOrganizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisResultObservation createTuberculosisResultObservation() {
		TuberculosisResultObservationImpl tuberculosisResultObservation = new TuberculosisResultObservationImpl();
		return tuberculosisResultObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRTreatmentInformationSection createTuberculosisPHCRTreatmentInformationSection() {
		TuberculosisPHCRTreatmentInformationSectionImpl tuberculosisPHCRTreatmentInformationSection = new TuberculosisPHCRTreatmentInformationSectionImpl();
		return tuberculosisPHCRTreatmentInformationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisTherapeuticRegimenAct createTuberculosisTherapeuticRegimenAct() {
		TuberculosisTherapeuticRegimenActImpl tuberculosisTherapeuticRegimenAct = new TuberculosisTherapeuticRegimenActImpl();
		return tuberculosisTherapeuticRegimenAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisTreatmentGivenSubstanceAdministration createTuberculosisTreatmentGivenSubstanceAdministration() {
		TuberculosisTreatmentGivenSubstanceAdministrationImpl tuberculosisTreatmentGivenSubstanceAdministration = new TuberculosisTreatmentGivenSubstanceAdministrationImpl();
		return tuberculosisTreatmentGivenSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisTreatmentNotGivenSubstanceAdministration createTuberculosisTreatmentNotGivenSubstanceAdministration() {
		TuberculosisTreatmentNotGivenSubstanceAdministrationImpl tuberculosisTreatmentNotGivenSubstanceAdministration = new TuberculosisTreatmentNotGivenSubstanceAdministrationImpl();
		return tuberculosisTreatmentNotGivenSubstanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPHCRImmunizationSection createTuberculosisPHCRImmunizationSection() {
		TuberculosisPHCRImmunizationSectionImpl tuberculosisPHCRImmunizationSection = new TuberculosisPHCRImmunizationSectionImpl();
		return tuberculosisPHCRImmunizationSection;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisImmunizationActivitySubstanceAdministration createTuberculosisImmunizationActivitySubstanceAdministration()
  {
		TuberculosisImmunizationActivitySubstanceAdministrationImpl tuberculosisImmunizationActivitySubstanceAdministration = new TuberculosisImmunizationActivitySubstanceAdministrationImpl();
		return tuberculosisImmunizationActivitySubstanceAdministration;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisImmunizationManufacturedProduct createTuberculosisImmunizationManufacturedProduct()
  {
		TuberculosisImmunizationManufacturedProductImpl tuberculosisImmunizationManufacturedProduct = new TuberculosisImmunizationManufacturedProductImpl();
		return tuberculosisImmunizationManufacturedProduct;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisSiteOfTBDiseaseObservation createTuberculosisSiteOfTBDiseaseObservation()
  {
		TuberculosisSiteOfTBDiseaseObservationImpl tuberculosisSiteOfTBDiseaseObservation = new TuberculosisSiteOfTBDiseaseObservationImpl();
		return tuberculosisSiteOfTBDiseaseObservation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisPackage getTuberculosisPackage() {
		return (TuberculosisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TuberculosisPackage getPackage() {
		return TuberculosisPackage.eINSTANCE;
	}

} //TuberculosisFactoryImpl
