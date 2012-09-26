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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage
 * @generated
 */
public class SilicosisValidator extends EObjectValidator {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final SilicosisValidator INSTANCE = new SilicosisValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.silicosis";

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Case Report Title' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_TITLE = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Case Report Silicosis PHCR Social History Section' of 'Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION = 2;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Case Report Silicosis PHCR Clinical Information Section' of 'Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION = 3;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Case Report Silicosis PHCR Relevant Dx Tests Section' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_CASE_REPORT__SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 5;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis PHCR Social History Section Silicosis Socio Behavioral Boolean Risk Factor Observation' of 'PHCR Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION = 6;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis PHCR Social History Section Silicosis Possible Exposure Location And Type Act' of 'PHCR Social History Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 7;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'PHCR Social History Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code P' of 'Socio Behavioral Boolean Risk Factor Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P = 9;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code' of 'Socio Behavioral Boolean Risk Factor Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE = 10;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Negation Ind' of 'Socio Behavioral Boolean Risk Factor Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND = 11;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Effective Time' of 'Socio Behavioral Boolean Risk Factor Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME = 12;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Value' of 'Socio Behavioral Boolean Risk Factor Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Template Id' of 'Socio Behavioral Boolean Risk Factor Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Possible Exposure Location And Type Act Template Id' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis PHCR Clinical Information Section Silicosis Case Observation' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION = 20;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis PHCR Clinical Information Section Silicosis History Of Tuberculosis Observation' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Case Observation Value' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_CASE_OBSERVATION__SILICOSIS_CASE_OBSERVATION_VALUE = 23;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Case Observation Silicosis Signs And Symptoms Observation' of 'Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_CASE_OBSERVATION__SILICOSIS_CASE_OBSERVATION_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION = 24;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 25;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Signs And Symptoms Observation Value' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 26;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 27;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis History Of Tuberculosis Observation Class Code' of 'History Of Tuberculosis Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE = 28;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis History Of Tuberculosis Observation Value' of 'History Of Tuberculosis Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE = 29;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis History Of Tuberculosis Observation Value P' of 'History Of Tuberculosis Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE_P = 30;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'History Of Tuberculosis Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 31;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_IMAGING_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 35;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis PHCR Relevant Dx Tests Section Silicosis Imaging Observation' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION = 32;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 33;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Imaging Observation Value' of 'Imaging Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_IMAGING_OBSERVATION__SILICOSIS_IMAGING_OBSERVATION_VALUE = 34;

		/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Possible Exposure Location And Type Act Class Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE = 16;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Possible Exposure Location And Type Act Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE = 17;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Possible Exposure Location And Type Act Mood Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE = 18;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Silicosis Possible Exposure Location And Type Act Status Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE = 19;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 35;

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
	public SilicosisValidator() {
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
    return SilicosisPackage.eINSTANCE;
  }

	/**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID)
    {
      case SilicosisPackage.SILICOSIS_CASE_REPORT:
        return validateSilicosisCaseReport((SilicosisCaseReport)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION:
        return validateSilicosisPHCRSocialHistorySection((SilicosisPHCRSocialHistorySection)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION:
        return validateSilicosisSocioBehavioralBooleanRiskFactorObservation((SilicosisSocioBehavioralBooleanRiskFactorObservation)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT:
        return validateSilicosisPossibleExposureLocationAndTypeAct((SilicosisPossibleExposureLocationAndTypeAct)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION:
        return validateSilicosisPHCRClinicalInformationSection((SilicosisPHCRClinicalInformationSection)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_CASE_OBSERVATION:
        return validateSilicosisCaseObservation((SilicosisCaseObservation)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION:
        return validateSilicosisSignsAndSymptomsObservation((SilicosisSignsAndSymptomsObservation)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION:
        return validateSilicosisHistoryOfTuberculosisObservation((SilicosisHistoryOfTuberculosisObservation)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION:
        return validateSilicosisPHCRRelevantDxTestsSection((SilicosisPHCRRelevantDxTestsSection)value, diagnostics, context);
      case SilicosisPackage.SILICOSIS_IMAGING_OBSERVATION:
        return validateSilicosisImagingObservation((SilicosisImagingObservation)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseReport(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisCaseReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseReport_validatePublicHealthCaseReportTemplateId(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseReport_validateSilicosisCaseReportTitle(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseReport_validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseReport_validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(silicosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseReport_validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(silicosisCaseReport, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisCaseReportTitle constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisCaseReport_validateSilicosisCaseReportTitle(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisCaseReport.validateSilicosisCaseReportTitle(diagnostics, context);
  }

  /**
   * Validates the validateSilicosisCaseReportSilicosisPHCRSocialHistorySection constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseReport_validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisCaseReport.validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseReport_validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisCaseReport.validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisCaseReport_validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisCaseReport.validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(diagnostics, context);
  }

  /**
   * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseReport_validatePublicHealthCaseReportTemplateId(SilicosisCaseReport silicosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validatePublicHealthCaseReportTemplateId", getObjectLabel(silicosisCaseReport, context) },
             new Object[] { silicosisCaseReport },
             context));
      }
      return false;
    }
    return phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportTemplateId(silicosisCaseReport, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPHCRSocialHistorySection(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisPHCRSocialHistorySection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCodeP(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRSocialHistorySection_validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(silicosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRSocialHistorySection_validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(silicosisPHCRSocialHistorySection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation constraint of '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPHCRSocialHistorySection_validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPHCRSocialHistorySection.validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct constraint of '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPHCRSocialHistorySection_validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPHCRSocialHistorySection.validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(diagnostics, context);
  }

	/**
   * Validates the validateSocialHistorySectionTemplateId constraint of '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(SilicosisPHCRSocialHistorySection silicosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateSocialHistorySectionTemplateId", getObjectLabel(silicosisPHCRSocialHistorySection, context) },
             new Object[] { silicosisPHCRSocialHistorySection },
             context));
      }
      return false;
    }
    return phcrValidator.validatePhcrSocialHistorySection_validateSocialHistorySectionTemplateId(silicosisPHCRSocialHistorySection, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSocialHistoryObservationTemplateId(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationClassCode(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationId(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationMoodCode(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationStatusCode(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationSocialHistoryStatusObservation(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationEpisodeObservation(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisSocioBehavioralBooleanRiskFactorObservation.validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisSocioBehavioralBooleanRiskFactorObservation.validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisSocioBehavioralBooleanRiskFactorObservation.validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisSocioBehavioralBooleanRiskFactorObservation.validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisSocioBehavioralBooleanRiskFactorObservation.validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateSocialHistoryObservationTemplateId constraint of '<em>Socio Behavioral Boolean Risk Factor Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisSocioBehavioralBooleanRiskFactorObservation_validateSocialHistoryObservationTemplateId(SilicosisSocioBehavioralBooleanRiskFactorObservation silicosisSocioBehavioralBooleanRiskFactorObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateSocialHistoryObservationTemplateId", getObjectLabel(silicosisSocioBehavioralBooleanRiskFactorObservation, context) },
             new Object[] { silicosisSocioBehavioralBooleanRiskFactorObservation },
             context));
      }
      return false;
    }
    return ccdValidator.validateSocialHistoryObservation_validateSocialHistoryObservationTemplateId(silicosisSocioBehavioralBooleanRiskFactorObservation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPHCRClinicalInformationSection(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisPHCRClinicalInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRClinicalInformationSection_validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(silicosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRClinicalInformationSection_validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(silicosisPHCRClinicalInformationSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPHCRClinicalInformationSection_validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPHCRClinicalInformationSection.validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRClinicalInformationSection_validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisPHCRClinicalInformationSection.validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(diagnostics, context);
  }

  /**
   * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(SilicosisPHCRClinicalInformationSection silicosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validatePhcrClinicalInformationSectionTemplateId", getObjectLabel(silicosisPHCRClinicalInformationSection, context) },
             new Object[] { silicosisPHCRClinicalInformationSection },
             context));
      }
      return false;
    }
    return phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(silicosisPHCRClinicalInformationSection, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseObservation(SilicosisCaseObservation silicosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisCaseObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseObservation_validateProblemObservationTemplateId(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCodeP(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCodeP(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseObservation_validateSilicosisCaseObservationValue(silicosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisCaseObservation_validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(silicosisCaseObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisCaseObservationValue constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseObservation_validateSilicosisCaseObservationValue(SilicosisCaseObservation silicosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisCaseObservation.validateSilicosisCaseObservationValue(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisCaseObservation_validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(SilicosisCaseObservation silicosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisCaseObservation.validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(diagnostics, context);
  }

	/**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisCaseObservation_validateProblemObservationTemplateId(SilicosisCaseObservation silicosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateProblemObservationTemplateId", getObjectLabel(silicosisCaseObservation, context) },
             new Object[] { silicosisCaseObservation },
             context));
      }
      return false;
    }
    return phcrValidator.validateCaseObservation_validateProblemObservationTemplateId(silicosisCaseObservation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSignsAndSymptomsObservation(SilicosisSignsAndSymptomsObservation silicosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisSignsAndSymptomsObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(silicosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisSignsAndSymptomsObservation_validateSilicosisSignsAndSymptomsObservationValue(silicosisSignsAndSymptomsObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisSignsAndSymptomsObservationValue constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisSignsAndSymptomsObservation_validateSilicosisSignsAndSymptomsObservationValue(SilicosisSignsAndSymptomsObservation silicosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisSignsAndSymptomsObservation.validateSilicosisSignsAndSymptomsObservationValue(diagnostics, context);
  }

	/**
   * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(SilicosisSignsAndSymptomsObservation silicosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateSignsAndSymptomsObservationTemplateId", getObjectLabel(silicosisSignsAndSymptomsObservation, context) },
             new Object[] { silicosisSignsAndSymptomsObservation },
             context));
      }
      return false;
    }
    return phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(silicosisSignsAndSymptomsObservation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisHistoryOfTuberculosisObservation(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(silicosisHistoryOfTuberculosisObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisHistoryOfTuberculosisObservation_validateProblemObservationTemplateId(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisHistoryOfTuberculosisObservation_validateSilicosisHistoryOfTuberculosisObservationClassCode(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisHistoryOfTuberculosisObservation_validateSilicosisHistoryOfTuberculosisObservationValue(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisHistoryOfTuberculosisObservation_validateSilicosisHistoryOfTuberculosisObservationValueP(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSilicosisHistoryOfTuberculosisObservationClassCode constraint of '<em>History Of Tuberculosis Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisHistoryOfTuberculosisObservation_validateSilicosisHistoryOfTuberculosisObservationClassCode(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisHistoryOfTuberculosisObservation.validateSilicosisHistoryOfTuberculosisObservationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateSilicosisHistoryOfTuberculosisObservationValue constraint of '<em>History Of Tuberculosis Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisHistoryOfTuberculosisObservation_validateSilicosisHistoryOfTuberculosisObservationValue(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisHistoryOfTuberculosisObservation.validateSilicosisHistoryOfTuberculosisObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateSilicosisHistoryOfTuberculosisObservationValueP constraint of '<em>History Of Tuberculosis Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisHistoryOfTuberculosisObservation_validateSilicosisHistoryOfTuberculosisObservationValueP(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisHistoryOfTuberculosisObservation.validateSilicosisHistoryOfTuberculosisObservationValueP(diagnostics, context);
  }

  /**
   * Validates the validateProblemObservationTemplateId constraint of '<em>History Of Tuberculosis Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisHistoryOfTuberculosisObservation_validateProblemObservationTemplateId(SilicosisHistoryOfTuberculosisObservation silicosisHistoryOfTuberculosisObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateProblemObservationTemplateId", getObjectLabel(silicosisHistoryOfTuberculosisObservation, context) },
             new Object[] { silicosisHistoryOfTuberculosisObservation },
             context));
      }
      return false;
    }
    return ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(silicosisHistoryOfTuberculosisObservation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRRelevantDxTestsSection(SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(silicosisPHCRRelevantDxTestsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCodeP(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPHCRRelevantDxTestsSection_validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRRelevantDxTestsSection_validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisPHCRRelevantDxTestsSection.validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(diagnostics, context);
  }

  /**
   * Validates the validateResultsSectionTemplateId constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(SilicosisPHCRRelevantDxTestsSection silicosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateResultsSectionTemplateId", getObjectLabel(silicosisPHCRRelevantDxTestsSection, context) },
             new Object[] { silicosisPHCRRelevantDxTestsSection },
             context));
      }
      return false;
    }
    return phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionTemplateId(silicosisPHCRRelevantDxTestsSection, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisImagingObservation(SilicosisImagingObservation silicosisImagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(silicosisImagingObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisImagingObservation_validateProblemObservationTemplateId(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationClassCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationMoodCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationId(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationStatusCodeP(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationStatusCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationEffectiveTime(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationValue(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateImagingObservation_validateImagingObservationMethodCode(silicosisImagingObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisImagingObservation_validateSilicosisImagingObservationValue(silicosisImagingObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSilicosisImagingObservationValue constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisImagingObservation_validateSilicosisImagingObservationValue(SilicosisImagingObservation silicosisImagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisImagingObservation.validateSilicosisImagingObservationValue(diagnostics, context);
  }

		/**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Imaging Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisImagingObservation_validateProblemObservationTemplateId(SilicosisImagingObservation silicosisImagingObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO override the constraint, if desired
    // -> uncomment the scaffolding
    // -> specify the condition that violates the constraint
    // -> verify the diagnostic details, including severity, code, and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (createDiagnostic
            (Diagnostic.ERROR,
             DIAGNOSTIC_SOURCE,
             0,
             "_UI_GenericConstraint_diagnostic",
             new Object[] { "validateProblemObservationTemplateId", getObjectLabel(silicosisImagingObservation, context) },
             new Object[] { silicosisImagingObservation },
             context));
      }
      return false;
    }
    return phcrValidator.validateImagingObservation_validateProblemObservationTemplateId(silicosisImagingObservation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeAct(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActTemplateId(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActClassCode(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActCode(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActMoodCode(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActStatusCode(silicosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateSilicosisPossibleExposureLocationAndTypeActTemplateId constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActTemplateId(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return silicosisPossibleExposureLocationAndTypeAct.validateSilicosisPossibleExposureLocationAndTypeActTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateSilicosisPossibleExposureLocationAndTypeActClassCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActClassCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPossibleExposureLocationAndTypeAct.validateSilicosisPossibleExposureLocationAndTypeActClassCode(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisPossibleExposureLocationAndTypeActCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPossibleExposureLocationAndTypeAct.validateSilicosisPossibleExposureLocationAndTypeActCode(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisPossibleExposureLocationAndTypeActMoodCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActMoodCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPossibleExposureLocationAndTypeAct.validateSilicosisPossibleExposureLocationAndTypeActMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateSilicosisPossibleExposureLocationAndTypeActStatusCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateSilicosisPossibleExposureLocationAndTypeAct_validateSilicosisPossibleExposureLocationAndTypeActStatusCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return silicosisPossibleExposureLocationAndTypeAct.validateSilicosisPossibleExposureLocationAndTypeActStatusCode(diagnostics, context);
  }

	/**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return SilicosisPlugin.INSTANCE;
  }

} //SilicosisValidator
