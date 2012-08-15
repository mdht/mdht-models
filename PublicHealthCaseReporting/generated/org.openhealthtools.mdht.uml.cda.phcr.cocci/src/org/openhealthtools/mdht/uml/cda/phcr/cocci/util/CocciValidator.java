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
package org.openhealthtools.mdht.uml.cda.phcr.cocci.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage
 * @generated
 */
public class CocciValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CocciValidator INSTANCE = new CocciValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.cocci";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Case Report Title' of 'Coccidioides Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_TITLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Case Report Coccidioides PHCR Social History Section' of 'Coccidioides Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Case Report Coccidioides PHCR Clinical Information Section' of 'Coccidioides Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Case Report Coccidioides PHCR Treatment Information Section' of 'Coccidioides Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Case Report Coccidioides PHCR Relevant Dx Tests Section' of 'Coccidioides Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_REPORT__COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Coccidioides Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides PHCR Social History Section Coccidioides Possible Exposure Location Act' of 'Coccidioides PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Coccidioides PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Possible Exposure Location Act Template Id' of 'Coccidioides Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Possible Exposure Location Act Class Code' of 'Coccidioides Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Possible Exposure Location Act Code' of 'Coccidioides Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Possible Exposure Location Act Mood Code' of 'Coccidioides Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Possible Exposure Location Act Status Code' of 'Coccidioides Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides PHCR Clinical Information Section Coccidioides Case Observation' of 'Coccidioides PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides PHCR Clinical Information Section Coccidioides Immunosuppressed Medical Condition History Observation' of 'Coccidioides PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Coccidioides PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Coccidioides Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Case Observation Value' of 'Coccidioides Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_CASE_OBSERVATION__CASE_OBSERVATION_VALUE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Coccidioides Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Immunosuppressed Medical Condition History Observation Coccidioides Immunosuppressed Medical Condition Problem Observation' of 'Coccidioides Immunosuppressed Medical Condition History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Template Id' of 'Coccidioides Immunosuppressed Medical Condition History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Coccidioides Immunosuppressed Medical Condition Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides PHCR Treatment Information Section Coccidioides Therapeutic Regimen Act' of 'Coccidioides PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'Coccidioides PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Given Substance Administration' of 'Coccidioides Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Not Given Substance Administration' of 'Coccidioides Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Coccidioides Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Observation' of 'Coccidioides PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Organizer' of 'Coccidioides PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Coccidioides PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Coccidioides Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Coccidioides Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Result Organizer Code' of 'Coccidioides Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_RESULT_ORGANIZER__COCCIDIOIDES_RESULT_ORGANIZER_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coccidioides Result Organizer Coccidioides Result Observation' of 'Coccidioides Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_RESULT_ORGANIZER__COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Coccidioides Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Coccidioides Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Coccidioides Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 29;

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
	public CocciValidator() {
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
	  return CocciPackage.eINSTANCE;
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
			case CocciPackage.COCCIDIOIDES_CASE_REPORT:
				return validateCoccidioidesCaseReport((CoccidioidesCaseReport)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION:
				return validateCoccidioidesPHCRSocialHistorySection((CoccidioidesPHCRSocialHistorySection)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT:
				return validateCoccidioidesPossibleExposureLocationAct((CoccidioidesPossibleExposureLocationAct)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateCoccidioidesPHCRClinicalInformationSection((CoccidioidesPHCRClinicalInformationSection)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_CASE_OBSERVATION:
				return validateCoccidioidesCaseObservation((CoccidioidesCaseObservation)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateCoccidioidesSignsAndSymptomsObservation((CoccidioidesSignsAndSymptomsObservation)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION:
				return validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservation((CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION:
				return validateCoccidioidesImmunosuppressedMedicalConditionProblemObservation((CoccidioidesImmunosuppressedMedicalConditionProblemObservation)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION:
				return validateCoccidioidesPHCRTreatmentInformationSection((CoccidioidesPHCRTreatmentInformationSection)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT:
				return validateCoccidioidesTherapeuticRegimenAct((CoccidioidesTherapeuticRegimenAct)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateCoccidioidesTreatmentGivenSubstanceAdministration((CoccidioidesTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateCoccidioidesTreatmentNotGivenSubstanceAdministration((CoccidioidesTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateCoccidioidesPHCRRelevantDxTestsSection((CoccidioidesPHCRRelevantDxTestsSection)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_RESULT_OBSERVATION:
				return validateCoccidioidesResultObservation((CoccidioidesResultObservation)value, diagnostics, context);
			case CocciPackage.COCCIDIOIDES_RESULT_ORGANIZER:
				return validateCoccidioidesResultOrganizer((CoccidioidesResultOrganizer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseReport_validatePublicHealthCaseReportTemplateId(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseReport_validateCoccidioidesCaseReportTitle(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(coccidioidesCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(coccidioidesCaseReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesCaseReportTitle constraint of '<em>Coccidioides Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport_validateCoccidioidesCaseReportTitle(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseReport.validateCoccidioidesCaseReportTitle(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection constraint of '<em>Coccidioides Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseReport.validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection constraint of '<em>Coccidioides Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseReport.validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection constraint of '<em>Coccidioides Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseReport.validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection constraint of '<em>Coccidioides Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport_validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseReport.validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Coccidioides Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseReport_validatePublicHealthCaseReportTemplateId(CoccidioidesCaseReport coccidioidesCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRSocialHistorySection(CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesPHCRSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionCode(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRSocialHistorySection_validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(coccidioidesPHCRSocialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct constraint of '<em>Coccidioides PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRSocialHistorySection_validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRSocialHistorySection.validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Coccidioides PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPossibleExposureLocationAct(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesPossibleExposureLocationAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActTemplateId(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActClassCode(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActCode(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActMoodCode(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActStatusCode(coccidioidesPossibleExposureLocationAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesPossibleExposureLocationActTemplateId constraint of '<em>Coccidioides Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActTemplateId(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPossibleExposureLocationAct.validateCoccidioidesPossibleExposureLocationActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesPossibleExposureLocationActClassCode constraint of '<em>Coccidioides Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActClassCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPossibleExposureLocationAct.validateCoccidioidesPossibleExposureLocationActClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesPossibleExposureLocationActCode constraint of '<em>Coccidioides Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPossibleExposureLocationAct.validateCoccidioidesPossibleExposureLocationActCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesPossibleExposureLocationActMoodCode constraint of '<em>Coccidioides Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActMoodCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPossibleExposureLocationAct.validateCoccidioidesPossibleExposureLocationActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesPossibleExposureLocationActStatusCode constraint of '<em>Coccidioides Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPossibleExposureLocationAct_validateCoccidioidesPossibleExposureLocationActStatusCode(CoccidioidesPossibleExposureLocationAct coccidioidesPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPossibleExposureLocationAct.validateCoccidioidesPossibleExposureLocationActStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRClinicalInformationSection(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesPHCRClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRClinicalInformationSection_validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRClinicalInformationSection_validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(coccidioidesPHCRClinicalInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation constraint of '<em>Coccidioides PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRClinicalInformationSection_validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRClinicalInformationSection.validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation constraint of '<em>Coccidioides PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRClinicalInformationSection_validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRClinicalInformationSection.validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Coccidioides PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseObservation(CoccidioidesCaseObservation coccidioidesCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseObservation_validateProblemObservationTemplateId(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesCaseObservation_validateCaseObservationValue(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(coccidioidesCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(coccidioidesCaseObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Coccidioides Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseObservation_validateProblemObservationTemplateId(CoccidioidesCaseObservation coccidioidesCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCaseObservationValue constraint of '<em>Coccidioides Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesCaseObservation_validateCaseObservationValue(CoccidioidesCaseObservation coccidioidesCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesCaseObservation.validateCaseObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesSignsAndSymptomsObservation(CoccidioidesSignsAndSymptomsObservation coccidioidesSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(coccidioidesSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Coccidioides Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(CoccidioidesSignsAndSymptomsObservation coccidioidesSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationClassCode(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationCode(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservation_validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(coccidioidesImmunosuppressedMedicalConditionHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation constraint of '<em>Coccidioides Immunosuppressed Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservation_validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesImmunosuppressedMedicalConditionHistoryObservation.validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrRelevantMedicalConditionHistoryObservationTemplateId constraint of '<em>Coccidioides Immunosuppressed Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation coccidioidesImmunosuppressedMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesImmunosuppressedMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesImmunosuppressedMedicalConditionProblemObservation(CoccidioidesImmunosuppressedMedicalConditionProblemObservation coccidioidesImmunosuppressedMedicalConditionProblemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesImmunosuppressedMedicalConditionProblemObservation_validateProblemObservationTemplateId(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(coccidioidesImmunosuppressedMedicalConditionProblemObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Coccidioides Immunosuppressed Medical Condition Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesImmunosuppressedMedicalConditionProblemObservation_validateProblemObservationTemplateId(CoccidioidesImmunosuppressedMedicalConditionProblemObservation coccidioidesImmunosuppressedMedicalConditionProblemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesImmunosuppressedMedicalConditionProblemObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRTreatmentInformationSection(CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesPHCRTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRTreatmentInformationSection_validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(coccidioidesPHCRTreatmentInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct constraint of '<em>Coccidioides PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRTreatmentInformationSection_validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRTreatmentInformationSection.validateCoccidioidesPHCRTreatmentInformationSectionCoccidioidesTherapeuticRegimenAct(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>Coccidioides PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(CoccidioidesPHCRTreatmentInformationSection coccidioidesPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTherapeuticRegimenAct(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesTherapeuticRegimenAct_validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesTherapeuticRegimenAct_validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(coccidioidesTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration constraint of '<em>Coccidioides Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTherapeuticRegimenAct_validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesTherapeuticRegimenAct.validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration constraint of '<em>Coccidioides Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTherapeuticRegimenAct_validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesTherapeuticRegimenAct.validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Coccidioides Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(CoccidioidesTherapeuticRegimenAct coccidioidesTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRRelevantDxTestsSection(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRRelevantDxTestsSection_validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesPHCRRelevantDxTestsSection_validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(coccidioidesPHCRRelevantDxTestsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation constraint of '<em>Coccidioides PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRRelevantDxTestsSection_validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRRelevantDxTestsSection.validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer constraint of '<em>Coccidioides PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRRelevantDxTestsSection_validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRRelevantDxTestsSection.validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Coccidioides PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(CoccidioidesPHCRRelevantDxTestsSection coccidioidesPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesPHCRRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultObservation(CoccidioidesResultObservation coccidioidesResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesResultObservation_validateResultObservationTemplateId(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesResultObservation_validateResultObservationCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(coccidioidesResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(coccidioidesResultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Coccidioides Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultObservation_validateResultObservationTemplateId(CoccidioidesResultObservation coccidioidesResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Coccidioides Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultObservation_validateResultObservationCode(CoccidioidesResultObservation coccidioidesResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesResultObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultOrganizer(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesResultOrganizer_validateResultOrganizerTemplateId(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesResultOrganizer_validateCoccidioidesResultOrganizerCode(coccidioidesResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesResultOrganizer_validateCoccidioidesResultOrganizerCoccidioidesResultObservation(coccidioidesResultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoccidioidesResultOrganizerCode constraint of '<em>Coccidioides Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultOrganizer_validateCoccidioidesResultOrganizerCode(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesResultOrganizer.validateCoccidioidesResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoccidioidesResultOrganizerCoccidioidesResultObservation constraint of '<em>Coccidioides Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultOrganizer_validateCoccidioidesResultOrganizerCoccidioidesResultObservation(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesResultOrganizer.validateCoccidioidesResultOrganizerCoccidioidesResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Coccidioides Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesResultOrganizer_validateResultOrganizerTemplateId(CoccidioidesResultOrganizer coccidioidesResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTreatmentGivenSubstanceAdministration(CoccidioidesTreatmentGivenSubstanceAdministration coccidioidesTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(coccidioidesTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Coccidioides Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(CoccidioidesTreatmentGivenSubstanceAdministration coccidioidesTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTreatmentNotGivenSubstanceAdministration(CoccidioidesTreatmentNotGivenSubstanceAdministration coccidioidesTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoccidioidesTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(coccidioidesTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Coccidioides Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoccidioidesTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(CoccidioidesTreatmentNotGivenSubstanceAdministration coccidioidesTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coccidioidesTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CocciPlugin.INSTANCE;
	}

} //CocciValidator
