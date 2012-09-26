/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage
 * @generated
 */
public class TuberculosisValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final TuberculosisValidator INSTANCE = new TuberculosisValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.tuberculosis";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Report Title' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TITLE = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Report Tuberculosis PHCR Social History Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Report Tuberculosis PHCR Clinical Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Report Tuberculosis PHCR Relevant Dx Tests Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Report Tuberculosis PHCR Treatment Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION = 5;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Report Tuberculosis PHCR Immunization Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION = 6;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 7;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Social History Section Tuberculosis Possible Exposure Location Act' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT = 8;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Social History Section Tuberculosis Socio Behavioral Boolean Risk Factor Observation' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION = 9;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Social History Section Smoking Status Observation' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION = 10;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Social History Section HIV Status Observation' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION = 11;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'PHCR Social History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 12;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Possible Exposure Location Act Template Id' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID = 13;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Possible Exposure Location Act Class Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE = 14;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Possible Exposure Location Act Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE = 15;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Possible Exposure Location Act Mood Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE = 16;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Possible Exposure Location Act Status Code' of 'Possible Exposure Location Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE = 17;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Effective Time' of 'Socio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME = 18;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Negation Ind' of 'Socio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND = 19;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Code' of 'Socio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE = 20;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Template Id' of 'Socio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 21;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Smoking Status Observation Code' of 'Smoking Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int SMOKING_STATUS_OBSERVATION__SMOKING_STATUS_OBSERVATION_CODE = 22;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Smoking Status Observation Effective Time' of 'Smoking Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int SMOKING_STATUS_OBSERVATION__SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME = 23;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Template Id' of 'Smoking Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int SMOKING_STATUS_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 24;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Template Id' of 'HIV Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_TEMPLATE_ID = 25;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Class Code' of 'HIV Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_CLASS_CODE = 26;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Code' of 'HIV Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_CODE = 27;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Status Code' of 'HIV Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_STATUS_CODE = 28;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Mood Code' of 'HIV Status Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_MOOD_CODE = 29;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Case Observation' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION = 30;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Relevant Medical Condition History Observation' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION = 31;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'PHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 32;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Observation Value' of 'Case Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_OBSERVATION__TUBERCULOSIS_CASE_OBSERVATION_VALUE = 33;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Observation Tuberculosis Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_OBSERVATION__TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION = 34;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Case Observation Tuberculosis Site Of TB Disease Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_OBSERVATION__TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION = 35;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 36;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 37;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Template Id' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID = 38;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Class Code' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE = 39;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Code' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE = 40;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Effective Time' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME = 41;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Mood Code' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE = 42;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Status Code' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE = 43;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Site Of TB Disease Observation Value' of 'Site Of TB Disease Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE = 44;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Relevant Medical Condition History Observation Value' of 'Relevant Medical Condition History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_VALUE = 45;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Relevant Medical Condition History Observation Tuberculosis Relevant Medical Condition Problem Observation' of 'Relevant Medical Condition History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION = 46;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Relevant Medical Condition History Observation Template Id' of 'Relevant Medical Condition History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID = 47;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Relevant Medical Condition Problem Observation Code' of 'Relevant Medical Condition Problem Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION__TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION_CODE = 48;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Relevant Medical Condition Problem Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 49;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Organizer' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER = 50;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Observation' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION = 51;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'PHCR Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 52;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RESULT_ORGANIZER__TUBERCULOSIS_RESULT_ORGANIZER_CODE = 53;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Result Organizer Tuberculosis Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RESULT_ORGANIZER__TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION = 54;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 55;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RESULT_OBSERVATION__TUBERCULOSIS_RESULT_OBSERVATION_CODE = 56;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 57;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Treatment Information Section Tuberculosis Therapeutic Regimen Act' of 'PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT = 58;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'PHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 59;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT__TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 60;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT__TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 61;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 62;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 63;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 64;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tuberculosis PHCR Immunization Section Tuberculosis Immunization Activity Substance Administration' of 'PHCR Immunization Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION = 65;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'PHCR Immunization Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 66;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Immunization Activity Substance Administration'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__MEDICATION_ACTIVITY_TEMPLATE_ID = 67;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Template Id' of 'Immunization Manufactured Product'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT__PRODUCT_TEMPLATE_ID = 68;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 68;

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
  public TuberculosisValidator()
  {
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
  protected EPackage getEPackage()
  {
	  return TuberculosisPackage.eINSTANCE;
	}

  /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		switch (classifierID) {
			case TuberculosisPackage.TUBERCULOSIS_CASE_REPORT:
				return validateTuberculosisCaseReport((TuberculosisCaseReport)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION:
				return validateTuberculosisPHCRSocialHistorySection((TuberculosisPHCRSocialHistorySection)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT:
				return validateTuberculosisPossibleExposureLocationAct((TuberculosisPossibleExposureLocationAct)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION:
				return validateTuberculosisSocioBehavioralBooleanRiskFactorObservation((TuberculosisSocioBehavioralBooleanRiskFactorObservation)value, diagnostics, context);
			case TuberculosisPackage.SMOKING_STATUS_OBSERVATION:
				return validateSmokingStatusObservation((SmokingStatusObservation)value, diagnostics, context);
			case TuberculosisPackage.HIV_STATUS_OBSERVATION:
				return validateHIVStatusObservation((HIVStatusObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateTuberculosisPHCRClinicalInformationSection((TuberculosisPHCRClinicalInformationSection)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_CASE_OBSERVATION:
				return validateTuberculosisCaseObservation((TuberculosisCaseObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateTuberculosisSignsAndSymptomsObservation((TuberculosisSignsAndSymptomsObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION:
				return validateTuberculosisSiteOfTBDiseaseObservation((TuberculosisSiteOfTBDiseaseObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION:
				return validateTuberculosisRelevantMedicalConditionHistoryObservation((TuberculosisRelevantMedicalConditionHistoryObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION:
				return validateTuberculosisRelevantMedicalConditionProblemObservation((TuberculosisRelevantMedicalConditionProblemObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateTuberculosisPHCRRelevantDxTestsSection((TuberculosisPHCRRelevantDxTestsSection)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_RESULT_ORGANIZER:
				return validateTuberculosisResultOrganizer((TuberculosisResultOrganizer)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_RESULT_OBSERVATION:
				return validateTuberculosisResultObservation((TuberculosisResultObservation)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION:
				return validateTuberculosisPHCRTreatmentInformationSection((TuberculosisPHCRTreatmentInformationSection)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT:
				return validateTuberculosisTherapeuticRegimenAct((TuberculosisTherapeuticRegimenAct)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateTuberculosisTreatmentGivenSubstanceAdministration((TuberculosisTreatmentGivenSubstanceAdministration)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
				return validateTuberculosisTreatmentNotGivenSubstanceAdministration((TuberculosisTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION:
				return validateTuberculosisPHCRImmunizationSection((TuberculosisPHCRImmunizationSection)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return validateTuberculosisImmunizationActivitySubstanceAdministration((TuberculosisImmunizationActivitySubstanceAdministration)value, diagnostics, context);
			case TuberculosisPackage.TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT:
				return validateTuberculosisImmunizationManufacturedProduct((TuberculosisImmunizationManufacturedProduct)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validatePublicHealthCaseReportTemplateId(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validateTuberculosisCaseReportTitle(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(tuberculosisCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(tuberculosisCaseReport, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisCaseReportTitle constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validateTuberculosisCaseReportTitle(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validateTuberculosisCaseReportTitle(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(diagnostics, context);
	}

  /**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseReport_validatePublicHealthCaseReportTemplateId(TuberculosisCaseReport tuberculosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRSocialHistorySection(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisPHCRSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(tuberculosisPHCRSocialHistorySection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRSocialHistorySection.validateTuberculosisPHCRSocialHistorySectionTuberculosisPossibleExposureLocationAct(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRSocialHistorySection.validateTuberculosisPHCRSocialHistorySectionTuberculosisSocioBehavioralBooleanRiskFactorObservation(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRSocialHistorySection.validateTuberculosisPHCRSocialHistorySectionSmokingStatusObservation(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRSocialHistorySection_validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRSocialHistorySection.validateTuberculosisPHCRSocialHistorySectionHIVStatusObservation(diagnostics, context);
	}

  /**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>PHCR Social History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(TuberculosisPHCRSocialHistorySection tuberculosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPossibleExposureLocationAct(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisPossibleExposureLocationAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActTemplateId(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActClassCode(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActCode(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActMoodCode(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActStatusCode(tuberculosisPossibleExposureLocationAct, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisPossibleExposureLocationActTemplateId constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActTemplateId(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPossibleExposureLocationAct.validateTuberculosisPossibleExposureLocationActTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPossibleExposureLocationActClassCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActClassCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPossibleExposureLocationAct.validateTuberculosisPossibleExposureLocationActClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPossibleExposureLocationActCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPossibleExposureLocationAct.validateTuberculosisPossibleExposureLocationActCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPossibleExposureLocationActMoodCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActMoodCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPossibleExposureLocationAct.validateTuberculosisPossibleExposureLocationActMoodCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPossibleExposureLocationActStatusCode constraint of '<em>Possible Exposure Location Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPossibleExposureLocationAct_validateTuberculosisPossibleExposureLocationActStatusCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPossibleExposureLocationAct.validateTuberculosisPossibleExposureLocationActStatusCode(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservation(TuberculosisSocioBehavioralBooleanRiskFactorObservation tuberculosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationCodeValueSet(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateSocialHistoryObservationTemplateId(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationId(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(tuberculosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(TuberculosisSocioBehavioralBooleanRiskFactorObservation tuberculosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSocioBehavioralBooleanRiskFactorObservation.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(TuberculosisSocioBehavioralBooleanRiskFactorObservation tuberculosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSocioBehavioralBooleanRiskFactorObservation.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(TuberculosisSocioBehavioralBooleanRiskFactorObservation tuberculosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSocioBehavioralBooleanRiskFactorObservation.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateSocialHistoryObservationTemplateId constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSocioBehavioralBooleanRiskFactorObservation_validateSocialHistoryObservationTemplateId(TuberculosisSocioBehavioralBooleanRiskFactorObservation tuberculosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSocioBehavioralBooleanRiskFactorObservation.validateSocialHistoryObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSmokingStatusObservation(SmokingStatusObservation smokingStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(smokingStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationCodeValueSet(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmokingStatusObservation_validateSocialHistoryObservationTemplateId(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationId(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmokingStatusObservation_validateSmokingStatusObservationCode(smokingStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmokingStatusObservation_validateSmokingStatusObservationEffectiveTime(smokingStatusObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateSmokingStatusObservationCode constraint of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSmokingStatusObservation_validateSmokingStatusObservationCode(SmokingStatusObservation smokingStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return smokingStatusObservation.validateSmokingStatusObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateSmokingStatusObservationEffectiveTime constraint of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSmokingStatusObservation_validateSmokingStatusObservationEffectiveTime(SmokingStatusObservation smokingStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return smokingStatusObservation.validateSmokingStatusObservationEffectiveTime(diagnostics, context);
	}

  /**
	 * Validates the validateSocialHistoryObservationTemplateId constraint of '<em>Smoking Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSmokingStatusObservation_validateSocialHistoryObservationTemplateId(SmokingStatusObservation smokingStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return smokingStatusObservation.validateSocialHistoryObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIVStatusObservation(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hivStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationTemplateId(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationClassCode(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationCode(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationStatusCode(hivStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationMoodCode(hivStatusObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateHIVStatusObservationTemplateId constraint of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationTemplateId(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hivStatusObservation.validateHIVStatusObservationTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateHIVStatusObservationClassCode constraint of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationClassCode(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hivStatusObservation.validateHIVStatusObservationClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateHIVStatusObservationCode constraint of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationCode(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hivStatusObservation.validateHIVStatusObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateHIVStatusObservationStatusCode constraint of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationStatusCode(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hivStatusObservation.validateHIVStatusObservationStatusCode(diagnostics, context);
	}

  /**
	 * Validates the validateHIVStatusObservationMoodCode constraint of '<em>HIV Status Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationMoodCode(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hivStatusObservation.validateHIVStatusObservationMoodCode(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRClinicalInformationSection(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisPHCRClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRClinicalInformationSection_validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRClinicalInformationSection_validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(tuberculosisPHCRClinicalInformationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRClinicalInformationSection_validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRClinicalInformationSection.validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRClinicalInformationSection_validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRClinicalInformationSection.validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(diagnostics, context);
	}

  /**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>PHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(TuberculosisPHCRClinicalInformationSection tuberculosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseObservation(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseObservation_validateProblemObservationTemplateId(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseObservation_validateTuberculosisCaseObservationValue(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseObservation_validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(tuberculosisCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisCaseObservation_validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(tuberculosisCaseObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisCaseObservationValue constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseObservation_validateTuberculosisCaseObservationValue(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseObservation.validateTuberculosisCaseObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseObservation_validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseObservation.validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseObservation_validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseObservation.validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(diagnostics, context);
	}

  /**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseObservation_validateProblemObservationTemplateId(TuberculosisCaseObservation tuberculosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSignsAndSymptomsObservation(TuberculosisSignsAndSymptomsObservation tuberculosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(tuberculosisSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(TuberculosisSignsAndSymptomsObservation tuberculosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationTemplateId(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationClassCode(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationCode(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationMoodCode(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationStatusCode(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationValue(tuberculosisSiteOfTBDiseaseObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationTemplateId constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationTemplateId(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationClassCode constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationClassCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationCode constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationMoodCode constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationMoodCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationMoodCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationStatusCode constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationStatusCode(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationStatusCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisSiteOfTBDiseaseObservationValue constraint of '<em>Site Of TB Disease Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisSiteOfTBDiseaseObservation_validateTuberculosisSiteOfTBDiseaseObservationValue(TuberculosisSiteOfTBDiseaseObservation tuberculosisSiteOfTBDiseaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisSiteOfTBDiseaseObservation.validateTuberculosisSiteOfTBDiseaseObservationValue(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionHistoryObservation(TuberculosisRelevantMedicalConditionHistoryObservation tuberculosisRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationClassCode(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationCode(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisRelevantMedicalConditionHistoryObservation_validateTuberculosisRelevantMedicalConditionHistoryObservationValue(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisRelevantMedicalConditionHistoryObservation_validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(tuberculosisRelevantMedicalConditionHistoryObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisRelevantMedicalConditionHistoryObservationValue constraint of '<em>Relevant Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionHistoryObservation_validateTuberculosisRelevantMedicalConditionHistoryObservationValue(TuberculosisRelevantMedicalConditionHistoryObservation tuberculosisRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisRelevantMedicalConditionHistoryObservation.validateTuberculosisRelevantMedicalConditionHistoryObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation constraint of '<em>Relevant Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionHistoryObservation_validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(TuberculosisRelevantMedicalConditionHistoryObservation tuberculosisRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisRelevantMedicalConditionHistoryObservation.validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(diagnostics, context);
	}

  /**
	 * Validates the validatePhcrRelevantMedicalConditionHistoryObservationTemplateId constraint of '<em>Relevant Medical Condition History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionHistoryObservation_validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(TuberculosisRelevantMedicalConditionHistoryObservation tuberculosisRelevantMedicalConditionHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisRelevantMedicalConditionHistoryObservation.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionProblemObservation(TuberculosisRelevantMedicalConditionProblemObservation tuberculosisRelevantMedicalConditionProblemObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisRelevantMedicalConditionProblemObservation_validateProblemObservationTemplateId(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisRelevantMedicalConditionProblemObservation_validateTuberculosisRelevantMedicalConditionProblemObservationCode(tuberculosisRelevantMedicalConditionProblemObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisRelevantMedicalConditionProblemObservationCode constraint of '<em>Relevant Medical Condition Problem Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionProblemObservation_validateTuberculosisRelevantMedicalConditionProblemObservationCode(TuberculosisRelevantMedicalConditionProblemObservation tuberculosisRelevantMedicalConditionProblemObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisRelevantMedicalConditionProblemObservation.validateTuberculosisRelevantMedicalConditionProblemObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Relevant Medical Condition Problem Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisRelevantMedicalConditionProblemObservation_validateProblemObservationTemplateId(TuberculosisRelevantMedicalConditionProblemObservation tuberculosisRelevantMedicalConditionProblemObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisRelevantMedicalConditionProblemObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRRelevantDxTestsSection(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRRelevantDxTestsSection_validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRRelevantDxTestsSection_validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(tuberculosisPHCRRelevantDxTestsSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRRelevantDxTestsSection_validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRRelevantDxTestsSection.validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRRelevantDxTestsSection_validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRRelevantDxTestsSection.validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(diagnostics, context);
	}

  /**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(TuberculosisPHCRRelevantDxTestsSection tuberculosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultOrganizer(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisResultOrganizer_validateResultOrganizerTemplateId(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisResultOrganizer_validateTuberculosisResultOrganizerCode(tuberculosisResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisResultOrganizer_validateTuberculosisResultOrganizerTuberculosisResultObservation(tuberculosisResultOrganizer, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultOrganizer_validateTuberculosisResultOrganizerCode(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisResultOrganizer.validateTuberculosisResultOrganizerCode(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisResultOrganizerTuberculosisResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultOrganizer_validateTuberculosisResultOrganizerTuberculosisResultObservation(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisResultOrganizer.validateTuberculosisResultOrganizerTuberculosisResultObservation(diagnostics, context);
	}

  /**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultOrganizer_validateResultOrganizerTemplateId(TuberculosisResultOrganizer tuberculosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultObservation(TuberculosisResultObservation tuberculosisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisResultObservation_validateResultObservationTemplateId(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(tuberculosisResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisResultObservation_validateTuberculosisResultObservationCode(tuberculosisResultObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultObservation_validateTuberculosisResultObservationCode(TuberculosisResultObservation tuberculosisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisResultObservation.validateTuberculosisResultObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisResultObservation_validateResultObservationTemplateId(TuberculosisResultObservation tuberculosisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRTreatmentInformationSection(TuberculosisPHCRTreatmentInformationSection tuberculosisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisPHCRTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRTreatmentInformationSection_validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct(tuberculosisPHCRTreatmentInformationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct constraint of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRTreatmentInformationSection_validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct(TuberculosisPHCRTreatmentInformationSection tuberculosisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRTreatmentInformationSection.validateTuberculosisPHCRTreatmentInformationSectionTuberculosisTherapeuticRegimenAct(diagnostics, context);
	}

  /**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>PHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(TuberculosisPHCRTreatmentInformationSection tuberculosisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTherapeuticRegimenAct(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisTherapeuticRegimenAct_validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisTherapeuticRegimenAct_validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(tuberculosisTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTherapeuticRegimenAct_validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisTherapeuticRegimenAct.validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(diagnostics, context);
	}

  /**
	 * Validates the validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTherapeuticRegimenAct_validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisTherapeuticRegimenAct.validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(diagnostics, context);
	}

  /**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(TuberculosisTherapeuticRegimenAct tuberculosisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTreatmentGivenSubstanceAdministration(TuberculosisTreatmentGivenSubstanceAdministration tuberculosisTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(tuberculosisTreatmentGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(TuberculosisTreatmentGivenSubstanceAdministration tuberculosisTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTreatmentNotGivenSubstanceAdministration(TuberculosisTreatmentNotGivenSubstanceAdministration tuberculosisTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(tuberculosisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(TuberculosisTreatmentNotGivenSubstanceAdministration tuberculosisTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRImmunizationSection(TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisPHCRImmunizationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRImmunizationSection_validateImmunizationsSectionTemplateId(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(tuberculosisPHCRImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisPHCRImmunizationSection_validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(tuberculosisPHCRImmunizationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration constraint of '<em>PHCR Immunization Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRImmunizationSection_validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRImmunizationSection.validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(diagnostics, context);
	}

  /**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>PHCR Immunization Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisPHCRImmunizationSection_validateImmunizationsSectionTemplateId(TuberculosisPHCRImmunizationSection tuberculosisPHCRImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisPHCRImmunizationSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisImmunizationActivitySubstanceAdministration(TuberculosisImmunizationActivitySubstanceAdministration tuberculosisImmunizationActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisImmunizationActivitySubstanceAdministration_validateMedicationActivityTemplateId(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(tuberculosisImmunizationActivitySubstanceAdministration, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Immunization Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisImmunizationActivitySubstanceAdministration_validateMedicationActivityTemplateId(TuberculosisImmunizationActivitySubstanceAdministration tuberculosisImmunizationActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisImmunizationActivitySubstanceAdministration.validateMedicationActivityTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisImmunizationManufacturedProduct(TuberculosisImmunizationManufacturedProduct tuberculosisImmunizationManufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(tuberculosisImmunizationManufacturedProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateClassCode(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterial(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCode(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeVocab(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeOriginalText(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialName(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductMayHaveMaterialManufacturer(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductShouldHaveMaterialManufacturer(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateTuberculosisImmunizationManufacturedProduct_validateProductTemplateId(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductId(tuberculosisImmunizationManufacturedProduct, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateProductTemplateId constraint of '<em>Immunization Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisImmunizationManufacturedProduct_validateProductTemplateId(TuberculosisImmunizationManufacturedProduct tuberculosisImmunizationManufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return tuberculosisImmunizationManufacturedProduct.validateProductTemplateId(diagnostics, context);
	}

  /**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return TuberculosisPlugin.INSTANCE;
	}

} //TuberculosisValidator
