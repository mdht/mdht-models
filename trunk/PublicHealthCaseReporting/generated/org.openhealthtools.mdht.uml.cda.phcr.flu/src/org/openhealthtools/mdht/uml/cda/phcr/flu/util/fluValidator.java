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
package org.openhealthtools.mdht.uml.cda.phcr.flu.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.flu.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage
 * @generated
 */
public class fluValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final fluValidator INSTANCE = new fluValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.flu";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Report Title' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_TITLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Report Influenza Immunization Section' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_IMMUNIZATION_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Report Influenza PHCR Clinical Information Section' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Report Influenza PHCR Treatment Information Section' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Report Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Report Influenza PHCR Social History Section' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__INFLUENZA_CASE_REPORT_INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Influenza Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Immunization Section Influenza Immunization Activity' of 'Influenza Immunization Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_IMMUNIZATION_SECTION__INFLUENZA_IMMUNIZATION_SECTION_INFLUENZA_IMMUNIZATION_ACTIVITY = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'Influenza Immunization Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_IMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Influenza Immunization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_IMMUNIZATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza PHCR Clinical Information Section Influenza Case Observation' of 'Influenza PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION_INFLUENZA_CASE_OBSERVATION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Influenza PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Case Observation Influenza Signs And Symptoms Observation' of 'Influenza Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_OBSERVATION__INFLUENZA_CASE_OBSERVATION_INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Influenza Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Value' of 'Influenza Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_CASE_OBSERVATION__CASE_OBSERVATION_VALUE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Influenza Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Value' of 'Influenza Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza PHCR Treatment Information Section Influenza Therapeutic Regimen Act' of 'Influenza PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION_INFLUENZA_THERAPEUTIC_REGIMEN_ACT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'Influenza PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Therapeutic Regimen Act Influenza Treatment Given Substance Administration' of 'Influenza Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Therapeutic Regimen Act Influenza Treatment Not Given Substance Administration' of 'Influenza Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__INFLUENZA_THERAPEUTIC_REGIMEN_ACT_INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Influenza Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Influenza Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Influenza Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Result Observation' of 'Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_RESULT_OBSERVATION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section Influenza Imaging Observation' of 'Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_INFLUENZA_IMAGING_OBSERVATION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__RESULTS_SECTION_TEMPLATE_ID = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Result Observation Interpretation Code' of 'Influenza Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_RESULT_OBSERVATION__INFLUENZA_RESULT_OBSERVATION_INTERPRETATION_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Influenza Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Influenza Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Imaging Observation Method Code' of 'Influenza Imaging Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_IMAGING_OBSERVATION__INFLUENZA_IMAGING_OBSERVATION_METHOD_CODE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Influenza Imaging Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_IMAGING_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza PHCR Social History Section Influenza Employment Status Observation' of 'Influenza PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza PHCR Social History Section Influenza Possible Exposure Location Act' of 'Influenza PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Influenza PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Employment Status Observation Template Id' of 'Influenza Employment Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Employment Status Observation Code' of 'Influenza Employment Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_CODE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Employment Status Observation Value' of 'Influenza Employment Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION__INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION_VALUE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Possible Exposure Location Act Template Id' of 'Influenza Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Possible Exposure Location Act Code' of 'Influenza Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Influenza Possible Exposure Location Act Status Code' of 'Influenza Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Template Id' of 'Influenza Immunization Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENZA_IMMUNIZATION_PRODUCT__PRODUCT_TEMPLATE_ID = 42;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 42;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrValidator phcrValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDValidator ccdValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fluValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		phcrValidator = PhcrValidator.INSTANCE;
		ccdValidator = CCDValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return fluPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case fluPackage.INFLUENZA_CASE_REPORT:
				return validateInfluenzaCaseReport((InfluenzaCaseReport)value, diagnostics, context);
			case fluPackage.INFLUENZA_IMMUNIZATION_SECTION:
				return validateInfluenzaImmunizationSection((InfluenzaImmunizationSection)value, diagnostics, context);
			case fluPackage.INFLUENZA_IMMUNIZATION_ACTIVITY:
				return validateInfluenzaImmunizationActivity((InfluenzaImmunizationActivity)value, diagnostics, context);
			case fluPackage.INFLUENZA_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateInfluenzaPHCRClinicalInformationSection((InfluenzaPHCRClinicalInformationSection)value, diagnostics, context);
			case fluPackage.INFLUENZA_CASE_OBSERVATION:
				return validateInfluenzaCaseObservation((InfluenzaCaseObservation)value, diagnostics, context);
			case fluPackage.INFLUENZA_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateInfluenzaSignsAndSymptomsObservation((InfluenzaSignsAndSymptomsObservation)value, diagnostics, context);
			case fluPackage.INFLUENZA_PHCR_TREATMENT_INFORMATION_SECTION:
				return validateInfluenzaPHCRTreatmentInformationSection((InfluenzaPHCRTreatmentInformationSection)value, diagnostics, context);
			case fluPackage.INFLUENZA_THERAPEUTIC_REGIMEN_ACT:
				return validateInfluenzaTherapeuticRegimenAct((InfluenzaTherapeuticRegimenAct)value, diagnostics, context);
			case fluPackage.INFLUENZA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateInfluenzaTreatmentGivenSubstanceAdministration((InfluenzaTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case fluPackage.INFLUENZA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateInfluenzaTreatmentNotGivenSubstanceAdministration((InfluenzaTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case fluPackage.INFLUENZA_PHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION:
				return validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection((InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)value, diagnostics, context);
			case fluPackage.INFLUENZA_RESULT_OBSERVATION:
				return validateInfluenzaResultObservation((InfluenzaResultObservation)value, diagnostics, context);
			case fluPackage.INFLUENZA_IMAGING_OBSERVATION:
				return validateInfluenzaImagingObservation((InfluenzaImagingObservation)value, diagnostics, context);
			case fluPackage.INFLUENZA_PHCR_SOCIAL_HISTORY_SECTION:
				return validateInfluenzaPHCRSocialHistorySection((InfluenzaPHCRSocialHistorySection)value, diagnostics, context);
			case fluPackage.INFLUENZA_EMPLOYMENT_STATUS_OBSERVATION:
				return validateInfluenzaEmploymentStatusObservation((InfluenzaEmploymentStatusObservation)value, diagnostics, context);
			case fluPackage.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT:
				return validateInfluenzaPossibleExposureLocationAct((InfluenzaPossibleExposureLocationAct)value, diagnostics, context);
			case fluPackage.INFLUENZA_IMMUNIZATION_PRODUCT:
				return validateInfluenzaImmunizationProduct((InfluenzaImmunizationProduct)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validatePublicHealthCaseReportTemplateId(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validateInfluenzaCaseReportTitle(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaImmunizationSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(influenzaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(influenzaCaseReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaCaseReportTitle constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validateInfluenzaCaseReportTitle(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validateInfluenzaCaseReportTitle(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaCaseReportInfluenzaImmunizationSection constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaImmunizationSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validateInfluenzaCaseReportInfluenzaImmunizationSection(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validateInfluenzaCaseReportInfluenzaPHCRClinicalInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validateInfluenzaCaseReportInfluenzaPHCRTreatmentInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validateInfluenzaCaseReportInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validateInfluenzaCaseReportInfluenzaPHCRSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Influenza Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseReport_validatePublicHealthCaseReportTemplateId(InfluenzaCaseReport influenzaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationSection(InfluenzaImmunizationSection influenzaImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaImmunizationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaImmunizationSection_validateImmunizationsSectionTemplateId(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(influenzaImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaImmunizationSection_validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(influenzaImmunizationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity constraint of '<em>Influenza Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationSection_validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(InfluenzaImmunizationSection influenzaImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaImmunizationSection.validateInfluenzaImmunizationSectionInfluenzaImmunizationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>Influenza Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationSection_validateImmunizationsSectionTemplateId(InfluenzaImmunizationSection influenzaImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaImmunizationSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationActivity(InfluenzaImmunizationActivity influenzaImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaImmunizationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaImmunizationActivity_validateMedicationActivityTemplateId(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(influenzaImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(influenzaImmunizationActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Influenza Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationActivity_validateMedicationActivityTemplateId(InfluenzaImmunizationActivity influenzaImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaImmunizationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRClinicalInformationSection(InfluenzaPHCRClinicalInformationSection influenzaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaPHCRClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(influenzaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRClinicalInformationSection_validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation(influenzaPHCRClinicalInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation constraint of '<em>Influenza PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRClinicalInformationSection_validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation(InfluenzaPHCRClinicalInformationSection influenzaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRClinicalInformationSection.validateInfluenzaPHCRClinicalInformationSectionInfluenzaCaseObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Influenza PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(InfluenzaPHCRClinicalInformationSection influenzaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseObservation(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseObservation_validateProblemObservationTemplateId(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseObservation_validateCaseObservationValue(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(influenzaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaCaseObservation_validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(influenzaCaseObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation constraint of '<em>Influenza Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseObservation_validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseObservation.validateInfluenzaCaseObservationInfluenzaSignsAndSymptomsObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Influenza Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseObservation_validateProblemObservationTemplateId(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCaseObservationValue constraint of '<em>Influenza Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaCaseObservation_validateCaseObservationValue(InfluenzaCaseObservation influenzaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaCaseObservation.validateCaseObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaSignsAndSymptomsObservation(InfluenzaSignsAndSymptomsObservation influenzaSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(influenzaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(influenzaSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Influenza Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(InfluenzaSignsAndSymptomsObservation influenzaSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationValue constraint of '<em>Influenza Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(InfluenzaSignsAndSymptomsObservation influenzaSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaSignsAndSymptomsObservation.validateSignsAndSymptomsObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRTreatmentInformationSection(InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaPHCRTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCodeP(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRTreatmentInformationSection_validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(influenzaPHCRTreatmentInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct constraint of '<em>Influenza PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRTreatmentInformationSection_validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRTreatmentInformationSection.validateInfluenzaPHCRTreatmentInformationSectionInfluenzaTherapeuticRegimenAct(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>Influenza PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(InfluenzaPHCRTreatmentInformationSection influenzaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTherapeuticRegimenAct(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCodeP(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCodeP(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaTherapeuticRegimenAct_validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(influenzaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaTherapeuticRegimenAct_validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(influenzaTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration constraint of '<em>Influenza Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTherapeuticRegimenAct_validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaTherapeuticRegimenAct.validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration constraint of '<em>Influenza Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTherapeuticRegimenAct_validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaTherapeuticRegimenAct.validateInfluenzaTherapeuticRegimenActInfluenzaTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Influenza Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(InfluenzaTherapeuticRegimenAct influenzaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTreatmentGivenSubstanceAdministration(InfluenzaTreatmentGivenSubstanceAdministration influenzaTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationStatusCode(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(influenzaTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Influenza Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(InfluenzaTreatmentGivenSubstanceAdministration influenzaTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTreatmentNotGivenSubstanceAdministration(InfluenzaTreatmentNotGivenSubstanceAdministration influenzaTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(influenzaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Influenza Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(InfluenzaTreatmentNotGivenSubstanceAdministration influenzaTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateResultsSectionTemplateId(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation constraint of '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation constraint of '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionInfluenzaImagingObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Influenza PHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateResultsSectionTemplateId(InfluenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaResultObservation(InfluenzaResultObservation influenzaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaResultObservation_validateResultObservationTemplateId(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaResultObservation_validateResultObservationCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(influenzaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaResultObservation_validateInfluenzaResultObservationInterpretationCode(influenzaResultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaResultObservationInterpretationCode constraint of '<em>Influenza Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaResultObservation_validateInfluenzaResultObservationInterpretationCode(InfluenzaResultObservation influenzaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaResultObservation.validateInfluenzaResultObservationInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Influenza Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaResultObservation_validateResultObservationTemplateId(InfluenzaResultObservation influenzaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Influenza Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaResultObservation_validateResultObservationCode(InfluenzaResultObservation influenzaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaResultObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImagingObservation(InfluenzaImagingObservation influenzaImagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaImagingObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaImagingObservation_validateProblemObservationTemplateId(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateProblemObservationStatusCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationClassCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationMoodCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationId(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationStatusCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationEffectiveTime(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationValue(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationMethodCode(influenzaImagingObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaImagingObservation_validateInfluenzaImagingObservationMethodCode(influenzaImagingObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaImagingObservationMethodCode constraint of '<em>Influenza Imaging Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImagingObservation_validateInfluenzaImagingObservationMethodCode(InfluenzaImagingObservation influenzaImagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaImagingObservation.validateInfluenzaImagingObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Influenza Imaging Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImagingObservation_validateProblemObservationTemplateId(InfluenzaImagingObservation influenzaImagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaImagingObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRSocialHistorySection(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaPHCRSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionCode(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRSocialHistorySection_validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(influenzaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPHCRSocialHistorySection_validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(influenzaPHCRSocialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation constraint of '<em>Influenza PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRSocialHistorySection_validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRSocialHistorySection.validateInfluenzaPHCRSocialHistorySectionInfluenzaEmploymentStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct constraint of '<em>Influenza PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRSocialHistorySection_validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRSocialHistorySection.validateInfluenzaPHCRSocialHistorySectionInfluenzaPossibleExposureLocationAct(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Influenza PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(InfluenzaPHCRSocialHistorySection influenzaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPHCRSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaEmploymentStatusObservation(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaEmploymentStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaEmploymentStatusObservation_validateInfluenzaEmploymentStatusObservationTemplateId(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaEmploymentStatusObservation_validateInfluenzaEmploymentStatusObservationCode(influenzaEmploymentStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaEmploymentStatusObservation_validateInfluenzaEmploymentStatusObservationValue(influenzaEmploymentStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaEmploymentStatusObservationTemplateId constraint of '<em>Influenza Employment Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaEmploymentStatusObservation_validateInfluenzaEmploymentStatusObservationTemplateId(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaEmploymentStatusObservation.validateInfluenzaEmploymentStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaEmploymentStatusObservationCode constraint of '<em>Influenza Employment Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaEmploymentStatusObservation_validateInfluenzaEmploymentStatusObservationCode(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaEmploymentStatusObservation.validateInfluenzaEmploymentStatusObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaEmploymentStatusObservationValue constraint of '<em>Influenza Employment Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaEmploymentStatusObservation_validateInfluenzaEmploymentStatusObservationValue(InfluenzaEmploymentStatusObservation influenzaEmploymentStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaEmploymentStatusObservation.validateInfluenzaEmploymentStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationAct(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaPossibleExposureLocationAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPossibleExposureLocationAct_validateInfluenzaPossibleExposureLocationActTemplateId(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPossibleExposureLocationAct_validateInfluenzaPossibleExposureLocationActCode(influenzaPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaPossibleExposureLocationAct_validateInfluenzaPossibleExposureLocationActStatusCode(influenzaPossibleExposureLocationAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInfluenzaPossibleExposureLocationActTemplateId constraint of '<em>Influenza Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationAct_validateInfluenzaPossibleExposureLocationActTemplateId(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPossibleExposureLocationAct.validateInfluenzaPossibleExposureLocationActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaPossibleExposureLocationActCode constraint of '<em>Influenza Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationAct_validateInfluenzaPossibleExposureLocationActCode(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPossibleExposureLocationAct.validateInfluenzaPossibleExposureLocationActCode(diagnostics, context);
	}

	/**
	 * Validates the validateInfluenzaPossibleExposureLocationActStatusCode constraint of '<em>Influenza Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaPossibleExposureLocationAct_validateInfluenzaPossibleExposureLocationActStatusCode(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaPossibleExposureLocationAct.validateInfluenzaPossibleExposureLocationActStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationProduct(InfluenzaImmunizationProduct influenzaImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influenzaImmunizationProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateClassCode(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterial(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCode(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeVocab(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeOriginalText(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialName(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductMayHaveMaterialManufacturer(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductShouldHaveMaterialManufacturer(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfluenzaImmunizationProduct_validateProductTemplateId(influenzaImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductId(influenzaImmunizationProduct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProductTemplateId constraint of '<em>Influenza Immunization Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenzaImmunizationProduct_validateProductTemplateId(InfluenzaImmunizationProduct influenzaImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return influenzaImmunizationProduct.validateProductTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FluPlugin.INSTANCE;
	}

} //fluValidator
