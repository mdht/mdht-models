/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.hepb.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage
 * @generated
 */
public class HepbValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final HepbValidator INSTANCE = new HepbValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.hepb";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Report Title' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_TITLE = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Report Acute Hepatitis BSocial History Section' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Clinical Information Section' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Report Acute Hepatitis BImmunization Section' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Treatment Information Section' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION = 5;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION = 6;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Acute Hepatitis BCase Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 7;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocial History Section Job Related Body Fluid Exposure Risk Frequency Observation' of 'Acute Hepatitis BSocial History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION = 8;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocial History Section Acute Hepatitis BPossible Exposure Location And Type Act' of 'Acute Hepatitis BSocial History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 9;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocial History Section Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation' of 'Acute Hepatitis BSocial History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION = 10;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocial History Section Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation' of 'Acute Hepatitis BSocial History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION = 11;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Acute Hepatitis BSocial History Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 12;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Job Related Body Fluid Exposure Risk Frequency Observation Template Id' of 'Job Related Body Fluid Exposure Risk Frequency Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_TEMPLATE_ID = 13;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Job Related Body Fluid Exposure Risk Frequency Observation Code' of 'Job Related Body Fluid Exposure Risk Frequency Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_CODE = 14;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Job Related Body Fluid Exposure Risk Frequency Observation Status Code' of 'Job Related Body Fluid Exposure Risk Frequency Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_STATUS_CODE = 15;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Job Related Body Fluid Exposure Risk Frequency Observation Value' of 'Job Related Body Fluid Exposure Risk Frequency Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_VALUE = 16;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Job Related Body Fluid Exposure Risk Frequency Observation Class Code' of 'Job Related Body Fluid Exposure Risk Frequency Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_CLASS_CODE = 17;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Job Related Body Fluid Exposure Risk Frequency Observation Mood Code' of 'Job Related Body Fluid Exposure Risk Frequency Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_MOOD_CODE = 18;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPossible Exposure Location And Type Act Template Id' of 'Acute Hepatitis BPossible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID = 19;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPossible Exposure Location And Type Act Class Code' of 'Acute Hepatitis BPossible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE = 20;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPossible Exposure Location And Type Act Code' of 'Acute Hepatitis BPossible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE = 21;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPossible Exposure Location And Type Act Mood Code' of 'Acute Hepatitis BPossible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE = 22;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPossible Exposure Location And Type Act Status Code' of 'Acute Hepatitis BPossible Exposure Location And Type Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE = 23;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Negation Ind' of 'Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND = 24;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Value' of 'Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE = 25;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Code' of 'Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE = 26;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Effective Time' of 'Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME = 27;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Template Id' of 'Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 28;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Template Id' of 'Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_TEMPLATE_ID = 29;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Code' of 'Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CODE = 30;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Status Code' of 'Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_STATUS_CODE = 31;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Class Code' of 'Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_CLASS_CODE = 32;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Id' of 'Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_ID = 33;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation Mood Code' of 'Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION_MOOD_CODE = 34;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BCase Observation' of 'Acute Hepatitis BPHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION = 35;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BRisk Associated Procedure' of 'Acute Hepatitis BPHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE = 36;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPHCR Clinical Information Section Viral Hepatitis History Observation' of 'Acute Hepatitis BPHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION = 37;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPHCR Clinical Information Section STD History Observation' of 'Acute Hepatitis BPHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION = 38;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Acute Hepatitis BPHCR Clinical Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 39;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Observation Value' of 'Acute Hepatitis BCase Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_OBSERVATION__ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE = 40;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BCase Observation Acute Hepatitis BSigns And Symptoms Observation' of 'Acute Hepatitis BCase Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_OBSERVATION__ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION = 41;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Acute Hepatitis BCase Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BCASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 42;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BSigns And Symptoms Observation Value' of 'Acute Hepatitis BSigns And Symptoms Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 43;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Acute Hepatitis BSigns And Symptoms Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 44;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BRisk Associated Procedure Template Id' of 'Acute Hepatitis BRisk Associated Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_TEMPLATE_ID = 45;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BRisk Associated Procedure Class Code' of 'Acute Hepatitis BRisk Associated Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_CLASS_CODE = 46;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BRisk Associated Procedure Code' of 'Acute Hepatitis BRisk Associated Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_CODE = 47;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BRisk Associated Procedure Mood Code' of 'Acute Hepatitis BRisk Associated Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_MOOD_CODE = 48;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BRisk Associated Procedure Status Code' of 'Acute Hepatitis BRisk Associated Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_STATUS_CODE = 49;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BRisk Associated Procedure Effective Time' of 'Acute Hepatitis BRisk Associated Procedure'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_EFFECTIVE_TIME = 50;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Viral Hepatitis History Observation Code' of 'Viral Hepatitis History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int VIRAL_HEPATITIS_HISTORY_OBSERVATION__VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE = 51;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Viral Hepatitis History Observation Value' of 'Viral Hepatitis History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int VIRAL_HEPATITIS_HISTORY_OBSERVATION__VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE = 52;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Viral Hepatitis History Observation Id' of 'Viral Hepatitis History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int VIRAL_HEPATITIS_HISTORY_OBSERVATION__VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID = 53;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Viral Hepatitis History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int VIRAL_HEPATITIS_HISTORY_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 54;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Class Code' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_CLASS_CODE = 55;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Code' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_CODE = 56;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Effective Time' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_EFFECTIVE_TIME = 57;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Id' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_ID = 58;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Mood Code' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_MOOD_CODE = 59;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Status Code' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_STATUS_CODE = 60;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate STD History Observation Problem Status' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__STD_HISTORY_OBSERVATION_PROBLEM_STATUS = 61;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'STD History Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int STD_HISTORY_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 62;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BImmunization Section Acute Hepatitis BImmunization Activity' of 'Acute Hepatitis BImmunization Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY = 63;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'Acute Hepatitis BImmunization Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 64;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Acute Hepatitis BImmunization Activity'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 65;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPHCR Treatment Information Section Acute Hepatitis BTherapeutic Regimen Act' of 'Acute Hepatitis BPHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT = 66;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'Acute Hepatitis BPHCR Treatment Information Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 67;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Acute Hepatitis BTherapeutic Regimen Act'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 68;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section Acute Hepatitis BResult Observation' of 'Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION = 69;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__RESULTS_SECTION_TEMPLATE_ID = 70;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Acute Hepatitis BResult Observation Interpretation Code' of 'Acute Hepatitis BResult Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRESULT_OBSERVATION__ACUTE_HEPATITIS_BRESULT_OBSERVATION_INTERPRETATION_CODE = 71;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Acute Hepatitis BResult Observation'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BRESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 72;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Template Id' of 'Acute Hepatitis BImmunization Product'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT__PRODUCT_TEMPLATE_ID = 73;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 73;

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
  public HepbValidator()
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
	  return HepbPackage.eINSTANCE;
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
			case HepbPackage.ACUTE_HEPATITIS_BCASE_REPORT:
				return validateAcuteHepatitisBCaseReport((AcuteHepatitisBCaseReport)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION:
				return validateAcuteHepatitisBSocialHistorySection((AcuteHepatitisBSocialHistorySection)value, diagnostics, context);
			case HepbPackage.JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION:
				return validateJobRelatedBodyFluidExposureRiskFrequencyObservation((JobRelatedBodyFluidExposureRiskFrequencyObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT:
				return validateAcuteHepatitisBPossibleExposureLocationAndTypeAct((AcuteHepatitisBPossibleExposureLocationAndTypeAct)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION:
				return validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation((AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION:
				return validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation((AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION:
				return validateAcuteHepatitisBPHCRClinicalInformationSection((AcuteHepatitisBPHCRClinicalInformationSection)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BCASE_OBSERVATION:
				return validateAcuteHepatitisBCaseObservation((AcuteHepatitisBCaseObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateAcuteHepatitisBSignsAndSymptomsObservation((AcuteHepatitisBSignsAndSymptomsObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE:
				return validateAcuteHepatitisBRiskAssociatedProcedure((AcuteHepatitisBRiskAssociatedProcedure)value, diagnostics, context);
			case HepbPackage.VIRAL_HEPATITIS_HISTORY_OBSERVATION:
				return validateViralHepatitisHistoryObservation((ViralHepatitisHistoryObservation)value, diagnostics, context);
			case HepbPackage.STD_HISTORY_OBSERVATION:
				return validateSTDHistoryObservation((STDHistoryObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_SECTION:
				return validateAcuteHepatitisBImmunizationSection((AcuteHepatitisBImmunizationSection)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY:
				return validateAcuteHepatitisBImmunizationActivity((AcuteHepatitisBImmunizationActivity)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION:
				return validateAcuteHepatitisBPHCRTreatmentInformationSection((AcuteHepatitisBPHCRTreatmentInformationSection)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT:
				return validateAcuteHepatitisBTherapeuticRegimenAct((AcuteHepatitisBTherapeuticRegimenAct)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION:
				return validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection((AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BRESULT_OBSERVATION:
				return validateAcuteHepatitisBResultObservation((AcuteHepatitisBResultObservation)value, diagnostics, context);
			case HepbPackage.ACUTE_HEPATITIS_BIMMUNIZATION_PRODUCT:
				return validateAcuteHepatitisBImmunizationProduct((AcuteHepatitisBImmunizationProduct)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validatePublicHealthCaseReportTemplateId(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportTitle(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(acuteHepatitisBCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(acuteHepatitisBCaseReport, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseReportTitle constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportTitle(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validateAcuteHepatitisBCaseReportTitle(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(diagnostics, context);
	}

  /**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Acute Hepatitis BCase Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseReport_validatePublicHealthCaseReportTemplateId(AcuteHepatitisBCaseReport acuteHepatitisBCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocialHistorySection(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBSocialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocialHistorySection_validateSocialHistorySectionTemplateId(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(acuteHepatitisBSocialHistorySection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation constraint of '<em>Acute Hepatitis BSocial History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocialHistorySection.validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct constraint of '<em>Acute Hepatitis BSocial History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocialHistorySection.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation constraint of '<em>Acute Hepatitis BSocial History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocialHistorySection.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation constraint of '<em>Acute Hepatitis BSocial History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocialHistorySection_validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocialHistorySection.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(diagnostics, context);
	}

  /**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Acute Hepatitis BSocial History Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocialHistorySection_validateSocialHistorySectionTemplateId(AcuteHepatitisBSocialHistorySection acuteHepatitisBSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(jobRelatedBodyFluidExposureRiskFrequencyObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId constraint of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return jobRelatedBodyFluidExposureRiskFrequencyObservation.validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode constraint of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return jobRelatedBodyFluidExposureRiskFrequencyObservation.validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode constraint of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return jobRelatedBodyFluidExposureRiskFrequencyObservation.validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(diagnostics, context);
	}

  /**
	 * Validates the validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue constraint of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return jobRelatedBodyFluidExposureRiskFrequencyObservation.validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode constraint of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return jobRelatedBodyFluidExposureRiskFrequencyObservation.validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode constraint of '<em>Job Related Body Fluid Exposure Risk Frequency Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateJobRelatedBodyFluidExposureRiskFrequencyObservation_validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(JobRelatedBodyFluidExposureRiskFrequencyObservation jobRelatedBodyFluidExposureRiskFrequencyObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return jobRelatedBodyFluidExposureRiskFrequencyObservation.validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeAct(AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode(acuteHepatitisBPossibleExposureLocationAndTypeAct, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId constraint of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId(AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPossibleExposureLocationAndTypeAct.validateAcuteHepatitisBPossibleExposureLocationAndTypeActTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode constraint of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode(AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPossibleExposureLocationAndTypeAct.validateAcuteHepatitisBPossibleExposureLocationAndTypeActClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode constraint of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode(AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPossibleExposureLocationAndTypeAct.validateAcuteHepatitisBPossibleExposureLocationAndTypeActCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode constraint of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode(AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPossibleExposureLocationAndTypeAct.validateAcuteHepatitisBPossibleExposureLocationAndTypeActMoodCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode constraint of '<em>Acute Hepatitis BPossible Exposure Location And Type Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPossibleExposureLocationAndTypeAct_validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode(AcuteHepatitisBPossibleExposureLocationAndTypeAct acuteHepatitisBPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPossibleExposureLocationAndTypeAct.validateAcuteHepatitisBPossibleExposureLocationAndTypeActStatusCode(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationCodeValueSet(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateSocialHistoryObservationTemplateId(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationId(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd constraint of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue constraint of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode constraint of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime constraint of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(diagnostics, context);
	}

  /**
	 * Validates the validateSocialHistoryObservationTemplateId constraint of '<em>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation_validateSocialHistoryObservationTemplateId(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSocioBehavioralBooleanRiskFactorObservation.validateSocialHistoryObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId constraint of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode constraint of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode constraint of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationStatusCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode constraint of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId constraint of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationId(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode constraint of '<em>Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation_validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(AcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBActualBloodAndOrBodyFluidExposureObservation.validateAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationMoodCode(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRClinicalInformationSection(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(acuteHepatitisBPHCRClinicalInformationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation constraint of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRClinicalInformationSection.validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure constraint of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRClinicalInformationSection.validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation constraint of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRClinicalInformationSection.validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation constraint of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRClinicalInformationSection_validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRClinicalInformationSection.validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(diagnostics, context);
	}

  /**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Acute Hepatitis BPHCR Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseObservation(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseObservation_validateProblemObservationTemplateId(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseObservation_validateAcuteHepatitisBCaseObservationValue(acuteHepatitisBCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBCaseObservation_validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(acuteHepatitisBCaseObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseObservationValue constraint of '<em>Acute Hepatitis BCase Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseObservation_validateAcuteHepatitisBCaseObservationValue(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseObservation.validateAcuteHepatitisBCaseObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation constraint of '<em>Acute Hepatitis BCase Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseObservation_validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseObservation.validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(diagnostics, context);
	}

  /**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Acute Hepatitis BCase Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBCaseObservation_validateProblemObservationTemplateId(AcuteHepatitisBCaseObservation acuteHepatitisBCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSignsAndSymptomsObservation(AcuteHepatitisBSignsAndSymptomsObservation acuteHepatitisBSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBSignsAndSymptomsObservation_validateAcuteHepatitisBSignsAndSymptomsObservationValue(acuteHepatitisBSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBSignsAndSymptomsObservationValue constraint of '<em>Acute Hepatitis BSigns And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSignsAndSymptomsObservation_validateAcuteHepatitisBSignsAndSymptomsObservationValue(AcuteHepatitisBSignsAndSymptomsObservation acuteHepatitisBSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSignsAndSymptomsObservation.validateAcuteHepatitisBSignsAndSymptomsObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Acute Hepatitis BSigns And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(AcuteHepatitisBSignsAndSymptomsObservation acuteHepatitisBSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureTemplateId(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureClassCode(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureCode(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureMoodCode(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureStatusCode(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime(acuteHepatitisBRiskAssociatedProcedure, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBRiskAssociatedProcedureTemplateId constraint of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureTemplateId(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBRiskAssociatedProcedure.validateAcuteHepatitisBRiskAssociatedProcedureTemplateId(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBRiskAssociatedProcedureClassCode constraint of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureClassCode(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBRiskAssociatedProcedure.validateAcuteHepatitisBRiskAssociatedProcedureClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBRiskAssociatedProcedureCode constraint of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureCode(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBRiskAssociatedProcedure.validateAcuteHepatitisBRiskAssociatedProcedureCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBRiskAssociatedProcedureMoodCode constraint of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureMoodCode(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBRiskAssociatedProcedure.validateAcuteHepatitisBRiskAssociatedProcedureMoodCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBRiskAssociatedProcedureStatusCode constraint of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureStatusCode(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBRiskAssociatedProcedure.validateAcuteHepatitisBRiskAssociatedProcedureStatusCode(diagnostics, context);
	}

  /**
	 * Validates the validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime constraint of '<em>Acute Hepatitis BRisk Associated Procedure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBRiskAssociatedProcedure_validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime(AcuteHepatitisBRiskAssociatedProcedure acuteHepatitisBRiskAssociatedProcedure, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBRiskAssociatedProcedure.validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateViralHepatitisHistoryObservation(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(viralHepatitisHistoryObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViralHepatitisHistoryObservation_validateProblemObservationTemplateId(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViralHepatitisHistoryObservation_validateViralHepatitisHistoryObservationCode(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViralHepatitisHistoryObservation_validateViralHepatitisHistoryObservationValue(viralHepatitisHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateViralHepatitisHistoryObservation_validateViralHepatitisHistoryObservationId(viralHepatitisHistoryObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateViralHepatitisHistoryObservationCode constraint of '<em>Viral Hepatitis History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateViralHepatitisHistoryObservation_validateViralHepatitisHistoryObservationCode(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return viralHepatitisHistoryObservation.validateViralHepatitisHistoryObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateViralHepatitisHistoryObservationValue constraint of '<em>Viral Hepatitis History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateViralHepatitisHistoryObservation_validateViralHepatitisHistoryObservationValue(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return viralHepatitisHistoryObservation.validateViralHepatitisHistoryObservationValue(diagnostics, context);
	}

  /**
	 * Validates the validateViralHepatitisHistoryObservationId constraint of '<em>Viral Hepatitis History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateViralHepatitisHistoryObservation_validateViralHepatitisHistoryObservationId(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return viralHepatitisHistoryObservation.validateViralHepatitisHistoryObservationId(diagnostics, context);
	}

  /**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Viral Hepatitis History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateViralHepatitisHistoryObservation_validateProblemObservationTemplateId(ViralHepatitisHistoryObservation viralHepatitisHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return viralHepatitisHistoryObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(stdHistoryObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateProblemObservationTemplateId(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationClassCode(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationCode(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationEffectiveTime(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationId(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationMoodCode(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationStatusCode(stdHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTDHistoryObservation_validateSTDHistoryObservationProblemStatus(stdHistoryObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateSTDHistoryObservationClassCode constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationClassCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationClassCode(diagnostics, context);
	}

  /**
	 * Validates the validateSTDHistoryObservationCode constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationCode(diagnostics, context);
	}

  /**
	 * Validates the validateSTDHistoryObservationEffectiveTime constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationEffectiveTime(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationEffectiveTime(diagnostics, context);
	}

  /**
	 * Validates the validateSTDHistoryObservationId constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationId(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationId(diagnostics, context);
	}

  /**
	 * Validates the validateSTDHistoryObservationMoodCode constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationMoodCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationMoodCode(diagnostics, context);
	}

  /**
	 * Validates the validateSTDHistoryObservationStatusCode constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationStatusCode(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationStatusCode(diagnostics, context);
	}

  /**
	 * Validates the validateSTDHistoryObservationProblemStatus constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateSTDHistoryObservationProblemStatus(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateSTDHistoryObservationProblemStatus(diagnostics, context);
	}

  /**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>STD History Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateSTDHistoryObservation_validateProblemObservationTemplateId(STDHistoryObservation stdHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return stdHistoryObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationSection(AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBImmunizationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionHasMedicationOrSupplyActivity(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBImmunizationSection_validateImmunizationsSectionTemplateId(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(acuteHepatitisBImmunizationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBImmunizationSection_validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(acuteHepatitisBImmunizationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity constraint of '<em>Acute Hepatitis BImmunization Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationSection_validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBImmunizationSection.validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(diagnostics, context);
	}

  /**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>Acute Hepatitis BImmunization Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationSection_validateImmunizationsSectionTemplateId(AcuteHepatitisBImmunizationSection acuteHepatitisBImmunizationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBImmunizationSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationActivity(AcuteHepatitisBImmunizationActivity acuteHepatitisBImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBImmunizationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasProduct(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBImmunizationActivity_validateMedicationActivityTemplateId(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPerformer(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(acuteHepatitisBImmunizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityProductInstance(acuteHepatitisBImmunizationActivity, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Acute Hepatitis BImmunization Activity</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationActivity_validateMedicationActivityTemplateId(AcuteHepatitisBImmunizationActivity acuteHepatitisBImmunizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBImmunizationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRTreatmentInformationSection(AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRTreatmentInformationSection_validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(acuteHepatitisBPHCRTreatmentInformationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct constraint of '<em>Acute Hepatitis BPHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRTreatmentInformationSection_validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRTreatmentInformationSection.validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(diagnostics, context);
	}

  /**
	 * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>Acute Hepatitis BPHCR Treatment Information Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(AcuteHepatitisBPHCRTreatmentInformationSection acuteHepatitisBPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBTherapeuticRegimenAct(AcuteHepatitisBTherapeuticRegimenAct acuteHepatitisBTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(acuteHepatitisBTherapeuticRegimenAct, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Acute Hepatitis BTherapeutic Regimen Act</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(AcuteHepatitisBTherapeuticRegimenAct acuteHepatitisBTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateResultsSectionTemplateId(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation constraint of '<em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(diagnostics, context);
	}

  /**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection_validateResultsSectionTemplateId(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection.validateResultsSectionTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBResultObservation(AcuteHepatitisBResultObservation acuteHepatitisBResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBResultObservation_validateResultObservationTemplateId(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(acuteHepatitisBResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBResultObservation_validateAcuteHepatitisBResultObservationInterpretationCode(acuteHepatitisBResultObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateAcuteHepatitisBResultObservationInterpretationCode constraint of '<em>Acute Hepatitis BResult Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBResultObservation_validateAcuteHepatitisBResultObservationInterpretationCode(AcuteHepatitisBResultObservation acuteHepatitisBResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBResultObservation.validateAcuteHepatitisBResultObservationInterpretationCode(diagnostics, context);
	}

  /**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Acute Hepatitis BResult Observation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBResultObservation_validateResultObservationTemplateId(AcuteHepatitisBResultObservation acuteHepatitisBResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationProduct(AcuteHepatitisBImmunizationProduct acuteHepatitisBImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(acuteHepatitisBImmunizationProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateClassCode(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterial(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCode(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeVocab(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialCodeOriginalText(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductHasMaterialName(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductMayHaveMaterialManufacturer(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductShouldHaveMaterialManufacturer(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcuteHepatitisBImmunizationProduct_validateProductTemplateId(acuteHepatitisBImmunizationProduct, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductId(acuteHepatitisBImmunizationProduct, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateProductTemplateId constraint of '<em>Acute Hepatitis BImmunization Product</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateAcuteHepatitisBImmunizationProduct_validateProductTemplateId(AcuteHepatitisBImmunizationProduct acuteHepatitisBImmunizationProduct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return acuteHepatitisBImmunizationProduct.validateProductTemplateId(diagnostics, context);
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
		return HepbPlugin.INSTANCE;
	}

} //HepbValidator
