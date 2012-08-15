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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage
 * @generated
 */
public class StrepPneumoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StrepPneumoValidator INSTANCE = new StrepPneumoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.streppneumo";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Report Title' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_TITLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Report Strep Pneumo PHCR Clinical Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Report Strep Pneumo PHCR Treatment Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Report Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Report Strep Pneumo Social History Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Report Strep Pneumo Immunization Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo PHCR Clinical Information Section Strep Pneumo Case Observation' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION_STREP_PNEUMO_CASE_OBSERVATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Case Observation Strep Pneumo Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_OBSERVATION__STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Value' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo PHCR Treatment Information Section Strep Pneumo Therapeutic Regimen Act' of 'PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Observation' of 'Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_OBSERVATION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section Strep Pneumo Result Organizer' of 'Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_STREP_PNEUMO_RESULT_ORGANIZER = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__RESULTS_SECTION_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Result Organizer Strep Pneumo Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_RESULT_ORGANIZER__STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Social History Section Strep Pneumo Possible Exposure Location And Type Act' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_SOCIAL_HISTORY_SECTION__STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Possible Exposure Location Act Template Id' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Possible Exposure Location Act Class Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Possible Exposure Location Act Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Possible Exposure Location Act Mood Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Possible Exposure Location Act Status Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT__STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Immunization Section Strep Pneumo Immunization Activity' of 'Immunization Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_IMMUNIZATION_SECTION__STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'Immunization Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_IMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Immunization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_IMMUNIZATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Strep Pneumo Immunization Product Template Id' of 'Immunization Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STREP_PNEUMO_IMMUNIZATION_PRODUCT__STREP_PNEUMO_IMMUNIZATION_PRODUCT_TEMPLATE_ID = 37;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 37;

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
	public StrepPneumoValidator() {
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
	  return StrepPneumoPackage.eINSTANCE;
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
			case StrepPneumoPackage.STREP_PNEUMO_CASE_REPORT:
				return validateStrepPneumoCaseReport((StrepPneumoCaseReport)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateStrepPneumoPHCRClinicalInformationSection((StrepPneumoPHCRClinicalInformationSection)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_CASE_OBSERVATION:
				return validateStrepPneumoCaseObservation((StrepPneumoCaseObservation)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateStrepPneumoSignsAndSymptomsObservation((StrepPneumoSignsAndSymptomsObservation)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION:
				return validateStrepPneumoPHCRTreatmentInformationSection((StrepPneumoPHCRTreatmentInformationSection)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT:
				return validateStrepPneumoTherapeuticRegimenAct((StrepPneumoTherapeuticRegimenAct)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateStrepPneumoTreatmentGivenSubstanceAdministration((StrepPneumoTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateStrepPneumoTreatmentNotGivenSubstanceAdministration((StrepPneumoTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION:
				return validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection((StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_RESULT_OBSERVATION:
				return validateStrepPneumoResultObservation((StrepPneumoResultObservation)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_RESULT_ORGANIZER:
				return validateStrepPneumoResultOrganizer((StrepPneumoResultOrganizer)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_SOCIAL_HISTORY_SECTION:
				return validateStrepPneumoSocialHistorySection((StrepPneumoSocialHistorySection)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT:
				return validateStrepPneumoPossibleExposureLocationAct((StrepPneumoPossibleExposureLocationAct)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_SECTION:
				return validateStrepPneumoImmunizationSection((StrepPneumoImmunizationSection)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_ACTIVITY:
				return validateStrepPneumoImmunizationActivity((StrepPneumoImmunizationActivity)value, diagnostics, context);
			case StrepPneumoPackage.STREP_PNEUMO_IMMUNIZATION_PRODUCT:
				return validateStrepPneumoImmunizationProduct((StrepPneumoImmunizationProduct)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validatePublicHealthCaseReportTemplateId(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validateStrepPneumoCaseReportTitle(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(strepPneumoCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoImmunizationSection(strepPneumoCaseReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoCaseReportTitle constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validateStrepPneumoCaseReportTitle(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validateStrepPneumoCaseReportTitle(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoCaseReportStrepPneumoSocialHistorySection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoCaseReportStrepPneumoImmunizationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validateStrepPneumoCaseReportStrepPneumoImmunizationSection(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validateStrepPneumoCaseReportStrepPneumoImmunizationSection(diagnostics, context);
	}

	/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseReport_validatePublicHealthCaseReportTemplateId(StrepPneumoCaseReport strepPneumoCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRClinicalInformationSection(StrepPneumoPHCRClinicalInformationSection strepPneumoPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoPHCRClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPHCRClinicalInformationSection_validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation(strepPneumoPHCRClinicalInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRClinicalInformationSection_validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation(StrepPneumoPHCRClinicalInformationSection strepPneumoPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPHCRClinicalInformationSection.validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(StrepPneumoPHCRClinicalInformationSection strepPneumoPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseObservation(StrepPneumoCaseObservation strepPneumoCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseObservation_validateProblemObservationTemplateId(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(strepPneumoCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoCaseObservation_validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(strepPneumoCaseObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseObservation_validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(StrepPneumoCaseObservation strepPneumoCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseObservation.validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoCaseObservation_validateProblemObservationTemplateId(StrepPneumoCaseObservation strepPneumoCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoSignsAndSymptomsObservation(StrepPneumoSignsAndSymptomsObservation strepPneumoSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(strepPneumoSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(StrepPneumoSignsAndSymptomsObservation strepPneumoSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationValue constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(StrepPneumoSignsAndSymptomsObservation strepPneumoSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoSignsAndSymptomsObservation.validateSignsAndSymptomsObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRTreatmentInformationSection(StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoPHCRTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPHCRTreatmentInformationSection_validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(strepPneumoPHCRTreatmentInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct constraint of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRTreatmentInformationSection_validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPHCRTreatmentInformationSection.validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(StrepPneumoPHCRTreatmentInformationSection strepPneumoPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTherapeuticRegimenAct(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoTherapeuticRegimenAct_validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoTherapeuticRegimenAct_validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(strepPneumoTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTherapeuticRegimenAct_validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoTherapeuticRegimenAct.validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTherapeuticRegimenAct_validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoTherapeuticRegimenAct.validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(StrepPneumoTherapeuticRegimenAct strepPneumoTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTreatmentGivenSubstanceAdministration(StrepPneumoTreatmentGivenSubstanceAdministration strepPneumoTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(strepPneumoTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentGivenSubstanceAdministration strepPneumoTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTreatmentNotGivenSubstanceAdministration(StrepPneumoTreatmentNotGivenSubstanceAdministration strepPneumoTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(strepPneumoTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentNotGivenSubstanceAdministration strepPneumoTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateResultsSectionTemplateId(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation constraint of '<em>Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer constraint of '<em>Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionStrepPneumoResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateResultsSectionTemplateId(StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoResultObservation(StrepPneumoResultObservation strepPneumoResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoResultObservation_validateResultObservationTemplateId(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(strepPneumoResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(strepPneumoResultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoResultObservation_validateResultObservationTemplateId(StrepPneumoResultObservation strepPneumoResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoResultOrganizer(StrepPneumoResultOrganizer strepPneumoResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoResultOrganizer_validateResultOrganizerTemplateId(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(strepPneumoResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoResultOrganizer_validateStrepPneumoResultOrganizerStrepPneumoResultObservation(strepPneumoResultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoResultOrganizerStrepPneumoResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoResultOrganizer_validateStrepPneumoResultOrganizerStrepPneumoResultObservation(StrepPneumoResultOrganizer strepPneumoResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoResultOrganizer.validateStrepPneumoResultOrganizerStrepPneumoResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoResultOrganizer_validateResultOrganizerTemplateId(StrepPneumoResultOrganizer strepPneumoResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoSocialHistorySection(StrepPneumoSocialHistorySection strepPneumoSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoSocialHistorySection_validateSocialHistorySectionTemplateId(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionCode(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(strepPneumoSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoSocialHistorySection_validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(strepPneumoSocialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoSocialHistorySection_validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(StrepPneumoSocialHistorySection strepPneumoSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoSocialHistorySection.validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoSocialHistorySection_validateSocialHistorySectionTemplateId(StrepPneumoSocialHistorySection strepPneumoSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationAct(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoPossibleExposureLocationAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActTemplateId(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActClassCode(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActCode(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActMoodCode(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActStatusCode(strepPneumoPossibleExposureLocationAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoPossibleExposureLocationActTemplateId constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActTemplateId(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPossibleExposureLocationAct.validateStrepPneumoPossibleExposureLocationActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoPossibleExposureLocationActClassCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActClassCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPossibleExposureLocationAct.validateStrepPneumoPossibleExposureLocationActClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoPossibleExposureLocationActCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPossibleExposureLocationAct.validateStrepPneumoPossibleExposureLocationActCode(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoPossibleExposureLocationActMoodCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActMoodCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPossibleExposureLocationAct.validateStrepPneumoPossibleExposureLocationActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateStrepPneumoPossibleExposureLocationActStatusCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoPossibleExposureLocationAct_validateStrepPneumoPossibleExposureLocationActStatusCode(StrepPneumoPossibleExposureLocationAct strepPneumoPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoPossibleExposureLocationAct.validateStrepPneumoPossibleExposureLocationActStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationSection(StrepPneumoImmunizationSection strepPneumoImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoImmunizationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoImmunizationSection_validateImmunizationsSectionTemplateId(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(strepPneumoImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoImmunizationSection_validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(strepPneumoImmunizationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity constraint of '<em>Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationSection_validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(StrepPneumoImmunizationSection strepPneumoImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoImmunizationSection.validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>Immunization Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationSection_validateImmunizationsSectionTemplateId(StrepPneumoImmunizationSection strepPneumoImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoImmunizationSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationActivity(StrepPneumoImmunizationActivity strepPneumoImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoImmunizationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoImmunizationActivity_validateMedicationActivityTemplateId(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(strepPneumoImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(strepPneumoImmunizationActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Immunization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationActivity_validateMedicationActivityTemplateId(StrepPneumoImmunizationActivity strepPneumoImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoImmunizationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationProduct(StrepPneumoImmunizationProduct strepPneumoImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(strepPneumoImmunizationProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateProduct_validateTypeCode(strepPneumoImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStrepPneumoImmunizationProduct_validateStrepPneumoImmunizationProductTemplateId(strepPneumoImmunizationProduct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStrepPneumoImmunizationProductTemplateId constraint of '<em>Immunization Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrepPneumoImmunizationProduct_validateStrepPneumoImmunizationProductTemplateId(StrepPneumoImmunizationProduct strepPneumoImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return strepPneumoImmunizationProduct.validateStrepPneumoImmunizationProductTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StrepPneumoPlugin.INSTANCE;
	}

} //StrepPneumoValidator
