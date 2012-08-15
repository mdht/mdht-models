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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage
 * @generated
 */
public class TularemiaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TularemiaValidator INSTANCE = new TularemiaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.tularemia";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Report Title' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TITLE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Report Tularemia PHCR Social History Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Report Tularemia PHCR Clinical Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Report Tularemia PHCR Treatment Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Report Phcr Encounters Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Report Tularemia PHCR Relevant Dx Tests Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia PHCR Social History Section Tularemia Possible Exposure Location And Type Act' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Template Id' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Class Code' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Mood Code' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Code' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Code P' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Status Code' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Possible Exposure Location And Type Act Status Code P' of 'Possible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia PHCR Clinical Information Section Tularemia Case Observation' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Observation Value' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_OBSERVATION__TULAREMIA_CASE_OBSERVATION_VALUE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Observation Tularemia Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_OBSERVATION__TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Case Observation Location Of Lesion Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_OBSERVATION__TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Signs And Symptoms Observation Value' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Template Id' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Class Code' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_CLASS_CODE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Mood Code' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_MOOD_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Code P' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_CODE_P = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Code' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Status Code' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_STATUS_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Status Code P' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Effective Time' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Value' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_VALUE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Location Of Lesion Observation Target Site Code' of 'Location Of Lesion Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION_OF_LESION_OBSERVATION__LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia PHCR Treatment Information Section Tularemia Therapeutic Regimen Act' of 'PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Organizer' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_ORGANIZER = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia PHCR Relevant Dx Tests Section Tularemia Result Observation' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_TULAREMIA_RESULT_OBSERVATION = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia PHCR Relevant Dx Tests Section Imaging Observation' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION_IMAGING_OBSERVATION = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_ORGANIZER__TULAREMIA_RESULT_ORGANIZER_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Result Organizer Tularemia Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_ORGANIZER__TULAREMIA_RESULT_ORGANIZER_TULAREMIA_RESULT_OBSERVATION = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tularemia Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_OBSERVATION__TULAREMIA_RESULT_OBSERVATION_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TULAREMIA_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 52;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 52;

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
	public TularemiaValidator() {
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
	  return TularemiaPackage.eINSTANCE;
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
			case TularemiaPackage.TULAREMIA_CASE_REPORT:
				return validateTularemiaCaseReport((TularemiaCaseReport)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION:
				return validateTularemiaPHCRSocialHistorySection((TularemiaPHCRSocialHistorySection)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT:
				return validateTularemiaPossibleExposureLocationAndTypeAct((TularemiaPossibleExposureLocationAndTypeAct)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateTularemiaPHCRClinicalInformationSection((TularemiaPHCRClinicalInformationSection)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_CASE_OBSERVATION:
				return validateTularemiaCaseObservation((TularemiaCaseObservation)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateTularemiaSignsAndSymptomsObservation((TularemiaSignsAndSymptomsObservation)value, diagnostics, context);
			case TularemiaPackage.LOCATION_OF_LESION_OBSERVATION:
				return validateLocationOfLesionObservation((LocationOfLesionObservation)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION:
				return validateTularemiaPHCRTreatmentInformationSection((TularemiaPHCRTreatmentInformationSection)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_THERAPEUTIC_REGIMEN_ACT:
				return validateTularemiaTherapeuticRegimenAct((TularemiaTherapeuticRegimenAct)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateTularemiaTreatmentGivenSubstanceAdministration((TularemiaTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateTularemiaTreatmentNotGivenSubstanceAdministration((TularemiaTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateTularemiaPHCRRelevantDxTestsSection((TularemiaPHCRRelevantDxTestsSection)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_RESULT_ORGANIZER:
				return validateTularemiaResultOrganizer((TularemiaResultOrganizer)value, diagnostics, context);
			case TularemiaPackage.TULAREMIA_RESULT_OBSERVATION:
				return validateTularemiaResultObservation((TularemiaResultObservation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validatePublicHealthCaseReportTemplateId(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validateTularemiaCaseReportTitle(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validateTularemiaCaseReportPhcrEncountersSection(tularemiaCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(tularemiaCaseReport, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaCaseReportTitle constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validateTularemiaCaseReportTitle(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validateTularemiaCaseReportTitle(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseReportTularemiaPHCRSocialHistorySection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseReportPhcrEncountersSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validateTularemiaCaseReportPhcrEncountersSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validateTularemiaCaseReportPhcrEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseReport_validatePublicHealthCaseReportTemplateId(TularemiaCaseReport tularemiaCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRSocialHistorySection(TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaPHCRSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionCode(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(tularemiaPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRSocialHistorySection_validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(tularemiaPHCRSocialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRSocialHistorySection_validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRSocialHistorySection.validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActTemplateId(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActClassCode(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActMoodCode(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActCodeP(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActCode(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActStatusCode(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(tularemiaPossibleExposureLocationAndTypeAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActTemplateId constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActTemplateId(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActClassCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActClassCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActMoodCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActMoodCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActCode(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActCodeP constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActCodeP(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActStatusCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActStatusCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP constraint of '<em>Possible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPossibleExposureLocationAndTypeAct_validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPossibleExposureLocationAndTypeAct.validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRClinicalInformationSection(TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaPHCRClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRClinicalInformationSection_validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(tularemiaPHCRClinicalInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRClinicalInformationSection_validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRClinicalInformationSection.validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(TularemiaPHCRClinicalInformationSection tularemiaPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseObservation(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseObservation_validateProblemObservationTemplateId(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseObservation_validateTularemiaCaseObservationValue(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseObservation_validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(tularemiaCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaCaseObservation_validateTularemiaCaseObservationLocationOfLesionObservation(tularemiaCaseObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaCaseObservationValue constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseObservation_validateTularemiaCaseObservationValue(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseObservation.validateTularemiaCaseObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseObservation_validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseObservation.validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaCaseObservationLocationOfLesionObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseObservation_validateTularemiaCaseObservationLocationOfLesionObservation(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseObservation.validateTularemiaCaseObservationLocationOfLesionObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaCaseObservation_validateProblemObservationTemplateId(TularemiaCaseObservation tularemiaCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaSignsAndSymptomsObservation(TularemiaSignsAndSymptomsObservation tularemiaSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaSignsAndSymptomsObservation_validateTularemiaSignsAndSymptomsObservationValue(tularemiaSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaSignsAndSymptomsObservationValue constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaSignsAndSymptomsObservation_validateTularemiaSignsAndSymptomsObservationValue(TularemiaSignsAndSymptomsObservation tularemiaSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaSignsAndSymptomsObservation.validateTularemiaSignsAndSymptomsObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(TularemiaSignsAndSymptomsObservation tularemiaSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationOfLesionObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationTemplateId(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationClassCode(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationMoodCode(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationCodeP(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationCode(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationStatusCode(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationStatusCodeP(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationEffectiveTime(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationValue(locationOfLesionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocationOfLesionObservation_validateLocationOfLesionObservationTargetSiteCode(locationOfLesionObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLocationOfLesionObservationTemplateId constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationTemplateId(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationClassCode constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationClassCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationMoodCode constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationMoodCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationCodeP constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationCodeP(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationCode constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationStatusCode constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationStatusCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationStatusCodeP constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationStatusCodeP(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationStatusCodeP(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationEffectiveTime constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationEffectiveTime(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationValue constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationValue(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateLocationOfLesionObservationTargetSiteCode constraint of '<em>Location Of Lesion Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfLesionObservation_validateLocationOfLesionObservationTargetSiteCode(LocationOfLesionObservation locationOfLesionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return locationOfLesionObservation.validateLocationOfLesionObservationTargetSiteCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRTreatmentInformationSection(TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaPHCRTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCodeP(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRTreatmentInformationSection_validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(tularemiaPHCRTreatmentInformationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct constraint of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRTreatmentInformationSection_validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRTreatmentInformationSection.validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(diagnostics, context);
	}

	/**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(TularemiaPHCRTreatmentInformationSection tularemiaPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTherapeuticRegimenAct(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCodeP(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCodeP(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaTherapeuticRegimenAct_validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(tularemiaTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaTherapeuticRegimenAct_validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(tularemiaTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTherapeuticRegimenAct_validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaTherapeuticRegimenAct.validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTherapeuticRegimenAct_validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaTherapeuticRegimenAct.validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(TularemiaTherapeuticRegimenAct tularemiaTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTreatmentGivenSubstanceAdministration(TularemiaTreatmentGivenSubstanceAdministration tularemiaTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationStatusCode(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(tularemiaTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(TularemiaTreatmentGivenSubstanceAdministration tularemiaTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTreatmentNotGivenSubstanceAdministration tularemiaTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(tularemiaTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(TularemiaTreatmentNotGivenSubstanceAdministration tularemiaTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRRelevantDxTestsSection(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaPHCRRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRRelevantDxTestsSection_validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRRelevantDxTestsSection_validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaPHCRRelevantDxTestsSection_validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(tularemiaPHCRRelevantDxTestsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRRelevantDxTestsSection_validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRRelevantDxTestsSection.validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultOrganizer(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRRelevantDxTestsSection_validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRRelevantDxTestsSection.validateTularemiaPHCRRelevantDxTestsSectionTularemiaResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaPHCRRelevantDxTestsSectionImagingObservation constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRRelevantDxTestsSection_validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRRelevantDxTestsSection.validateTularemiaPHCRRelevantDxTestsSectionImagingObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(TularemiaPHCRRelevantDxTestsSection tularemiaPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaPHCRRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultOrganizer(TularemiaResultOrganizer tularemiaResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultOrganizer_validateResultOrganizerTemplateId(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultOrganizer_validateResultOrganizerCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultOrganizer_validateTularemiaResultOrganizerCode(tularemiaResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultOrganizer_validateTularemiaResultOrganizerTularemiaResultObservation(tularemiaResultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultOrganizer_validateTularemiaResultOrganizerCode(TularemiaResultOrganizer tularemiaResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultOrganizer.validateTularemiaResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateTularemiaResultOrganizerTularemiaResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultOrganizer_validateTularemiaResultOrganizerTularemiaResultObservation(TularemiaResultOrganizer tularemiaResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultOrganizer.validateTularemiaResultOrganizerTularemiaResultObservation(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultOrganizer_validateResultOrganizerTemplateId(TularemiaResultOrganizer tularemiaResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultOrganizer_validateResultOrganizerCode(TularemiaResultOrganizer tularemiaResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultObservation(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tularemiaResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultObservation_validateResultObservationTemplateId(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultObservation_validateResultObservationCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(tularemiaResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTularemiaResultObservation_validateTularemiaResultObservationCode(tularemiaResultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTularemiaResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultObservation_validateTularemiaResultObservationCode(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultObservation.validateTularemiaResultObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultObservation_validateResultObservationTemplateId(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTularemiaResultObservation_validateResultObservationCode(TularemiaResultObservation tularemiaResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tularemiaResultObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TularemiaPlugin.INSTANCE;
	}

} //TularemiaValidator
