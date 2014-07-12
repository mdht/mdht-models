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
package org.openhealthtools.mdht.uml.cda.phcr.tss.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.tss.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tss.tssPackage
 * @generated
 */
public class tssValidator extends EObjectValidator {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final tssValidator INSTANCE = new tssValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.tss";

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Toxic Shock Syndrome Case Report Title' of 'Toxic Shock Syndrome Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TOXIC_SHOCK_SYNDROME_CASE_REPORT__TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE = 1;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Toxic Shock Syndrome Case Report Tss Phcr Clinical Information Section' of 'Toxic Shock Syndrome Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TOXIC_SHOCK_SYNDROME_CASE_REPORT__TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION = 2;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Toxic Shock Syndrome Case Report Tss Phcr Relevant Dx Tests Section' of 'Toxic Shock Syndrome Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TOXIC_SHOCK_SYNDROME_CASE_REPORT__TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION = 3;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Toxic Shock Syndrome Case Report'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TOXIC_SHOCK_SYNDROME_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 4;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Phcr Clinical Information Section Tss Case Observation' of 'Tss Phcr Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_PHCR_CLINICAL_INFORMATION_SECTION__TSS_PHCR_CLINICAL_INFORMATION_SECTION_TSS_CASE_OBSERVATION = 5;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Tss Phcr Clinical Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 6;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Case Observation Value P' of 'Tss Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_CASE_OBSERVATION__TSS_CASE_OBSERVATION_VALUE_P = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Case Observation Value' of 'Tss Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_CASE_OBSERVATION__TSS_CASE_OBSERVATION_VALUE = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Case Observation Tss Signs And Symptoms Observation' of 'Tss Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_CASE_OBSERVATION__TSS_CASE_OBSERVATION_TSS_SIGNS_AND_SYMPTOMS_OBSERVATION = 9;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Tss Case Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 10;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Signs And Symptoms Observation Value' of 'Tss Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_SIGNS_AND_SYMPTOMS_OBSERVATION__TSS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Tss Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 12;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Phcr Relevant Dx Tests Section Tss Result Organizer' of 'Tss Phcr Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_PHCR_RELEVANT_DX_TESTS_SECTION__TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER = 13;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Phcr Relevant Dx Tests Section Tss Result Observation' of 'Tss Phcr Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_PHCR_RELEVANT_DX_TESTS_SECTION__TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION = 14;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Tss Phcr Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 15;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Result Organizer Code P' of 'Tss Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_RESULT_ORGANIZER__TSS_RESULT_ORGANIZER_CODE_P = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Result Organizer Code' of 'Tss Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_RESULT_ORGANIZER__TSS_RESULT_ORGANIZER_CODE = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Result Organizer Tss Result Observation' of 'Tss Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_RESULT_ORGANIZER__TSS_RESULT_ORGANIZER_TSS_RESULT_OBSERVATION = 18;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Tss Result Organizer'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 19;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Result Observation Code P' of 'Tss Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_RESULT_OBSERVATION__TSS_RESULT_OBSERVATION_CODE_P = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tss Result Observation Code' of 'Tss Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TSS_RESULT_OBSERVATION__TSS_RESULT_OBSERVATION_CODE = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Tss Result Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int TSS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 22;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 22;

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
	public tssValidator() {
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
    return tssPackage.eINSTANCE;
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
      case tssPackage.TOXIC_SHOCK_SYNDROME_CASE_REPORT:
        return validateToxicShockSyndromeCaseReport((ToxicShockSyndromeCaseReport)value, diagnostics, context);
      case tssPackage.TSS_PHCR_CLINICAL_INFORMATION_SECTION:
        return validateTssPhcrClinicalInformationSection((TssPhcrClinicalInformationSection)value, diagnostics, context);
      case tssPackage.TSS_CASE_OBSERVATION:
        return validateTssCaseObservation((TssCaseObservation)value, diagnostics, context);
      case tssPackage.TSS_SIGNS_AND_SYMPTOMS_OBSERVATION:
        return validateTssSignsAndSymptomsObservation((TssSignsAndSymptomsObservation)value, diagnostics, context);
      case tssPackage.TSS_PHCR_RELEVANT_DX_TESTS_SECTION:
        return validateTssPhcrRelevantDxTestsSection((TssPhcrRelevantDxTestsSection)value, diagnostics, context);
      case tssPackage.TSS_RESULT_ORGANIZER:
        return validateTssResultOrganizer((TssResultOrganizer)value, diagnostics, context);
      case tssPackage.TSS_RESULT_OBSERVATION:
        return validateTssResultObservation((TssResultObservation)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateToxicShockSyndromeCaseReport(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(toxicShockSyndromeCaseReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateToxicShockSyndromeCaseReport_validatePublicHealthCaseReportTemplateId(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateToxicShockSyndromeCaseReport_validateToxicShockSyndromeCaseReportTitle(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateToxicShockSyndromeCaseReport_validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(toxicShockSyndromeCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateToxicShockSyndromeCaseReport_validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(toxicShockSyndromeCaseReport, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateToxicShockSyndromeCaseReportTitle constraint of '<em>Toxic Shock Syndrome Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateToxicShockSyndromeCaseReport_validateToxicShockSyndromeCaseReportTitle(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return toxicShockSyndromeCaseReport.validateToxicShockSyndromeCaseReportTitle(diagnostics, context);
  }

	/**
   * Validates the validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection constraint of '<em>Toxic Shock Syndrome Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateToxicShockSyndromeCaseReport_validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return toxicShockSyndromeCaseReport.validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(diagnostics, context);
  }

	/**
   * Validates the validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection constraint of '<em>Toxic Shock Syndrome Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateToxicShockSyndromeCaseReport_validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return toxicShockSyndromeCaseReport.validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(diagnostics, context);
  }

	/**
   * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Toxic Shock Syndrome Case Report</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateToxicShockSyndromeCaseReport_validatePublicHealthCaseReportTemplateId(ToxicShockSyndromeCaseReport toxicShockSyndromeCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validatePublicHealthCaseReportTemplateId", getObjectLabel(toxicShockSyndromeCaseReport, context) },
             new Object[] { toxicShockSyndromeCaseReport },
             context));
      }
      return false;
    }
    return phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportTemplateId(toxicShockSyndromeCaseReport, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrClinicalInformationSection(TssPhcrClinicalInformationSection tssPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(tssPhcrClinicalInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(tssPhcrClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssPhcrClinicalInformationSection_validateTssPhcrClinicalInformationSectionTssCaseObservation(tssPhcrClinicalInformationSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateTssPhcrClinicalInformationSectionTssCaseObservation constraint of '<em>Tss Phcr Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrClinicalInformationSection_validateTssPhcrClinicalInformationSectionTssCaseObservation(TssPhcrClinicalInformationSection tssPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return tssPhcrClinicalInformationSection.validateTssPhcrClinicalInformationSectionTssCaseObservation(diagnostics, context);
  }

	/**
   * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Tss Phcr Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(TssPhcrClinicalInformationSection tssPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validatePhcrClinicalInformationSectionTemplateId", getObjectLabel(tssPhcrClinicalInformationSection, context) },
             new Object[] { tssPhcrClinicalInformationSection },
             context));
      }
      return false;
    }
    return phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(tssPhcrClinicalInformationSection, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssCaseObservation(TssCaseObservation tssCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(tssCaseObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssCaseObservation_validateProblemObservationTemplateId(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCodeP(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCodeP(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssCaseObservation_validateTssCaseObservationValueP(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssCaseObservation_validateTssCaseObservationValue(tssCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssCaseObservation_validateTssCaseObservationTssSignsAndSymptomsObservation(tssCaseObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateTssCaseObservationValueP constraint of '<em>Tss Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssCaseObservation_validateTssCaseObservationValueP(TssCaseObservation tssCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssCaseObservation.validateTssCaseObservationValueP(diagnostics, context);
  }

  /**
   * Validates the validateTssCaseObservationValue constraint of '<em>Tss Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssCaseObservation_validateTssCaseObservationValue(TssCaseObservation tssCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssCaseObservation.validateTssCaseObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateTssCaseObservationTssSignsAndSymptomsObservation constraint of '<em>Tss Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssCaseObservation_validateTssCaseObservationTssSignsAndSymptomsObservation(TssCaseObservation tssCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return tssCaseObservation.validateTssCaseObservationTssSignsAndSymptomsObservation(diagnostics, context);
  }

	/**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Tss Case Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssCaseObservation_validateProblemObservationTemplateId(TssCaseObservation tssCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validateProblemObservationTemplateId", getObjectLabel(tssCaseObservation, context) },
             new Object[] { tssCaseObservation },
             context));
      }
      return false;
    }
    return phcrValidator.validateCaseObservation_validateProblemObservationTemplateId(tssCaseObservation, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssSignsAndSymptomsObservation(TssSignsAndSymptomsObservation tssSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(tssSignsAndSymptomsObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(tssSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssSignsAndSymptomsObservation_validateTssSignsAndSymptomsObservationValue(tssSignsAndSymptomsObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateTssSignsAndSymptomsObservationValue constraint of '<em>Tss Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssSignsAndSymptomsObservation_validateTssSignsAndSymptomsObservationValue(TssSignsAndSymptomsObservation tssSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssSignsAndSymptomsObservation.validateTssSignsAndSymptomsObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Tss Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(TssSignsAndSymptomsObservation tssSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validateSignsAndSymptomsObservationTemplateId", getObjectLabel(tssSignsAndSymptomsObservation, context) },
             new Object[] { tssSignsAndSymptomsObservation },
             context));
      }
      return false;
    }
    return phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(tssSignsAndSymptomsObservation, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrRelevantDxTestsSection(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(tssPhcrRelevantDxTestsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCodeP(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssPhcrRelevantDxTestsSection_validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(tssPhcrRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssPhcrRelevantDxTestsSection_validateTssPhcrRelevantDxTestsSectionTssResultObservation(tssPhcrRelevantDxTestsSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateTssPhcrRelevantDxTestsSectionTssResultOrganizer constraint of '<em>Tss Phcr Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrRelevantDxTestsSection_validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return tssPhcrRelevantDxTestsSection.validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(diagnostics, context);
  }

	/**
   * Validates the validateTssPhcrRelevantDxTestsSectionTssResultObservation constraint of '<em>Tss Phcr Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrRelevantDxTestsSection_validateTssPhcrRelevantDxTestsSectionTssResultObservation(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return tssPhcrRelevantDxTestsSection.validateTssPhcrRelevantDxTestsSectionTssResultObservation(diagnostics, context);
  }

	/**
   * Validates the validateResultsSectionTemplateId constraint of '<em>Tss Phcr Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(TssPhcrRelevantDxTestsSection tssPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validateResultsSectionTemplateId", getObjectLabel(tssPhcrRelevantDxTestsSection, context) },
             new Object[] { tssPhcrRelevantDxTestsSection },
             context));
      }
      return false;
    }
    return phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionTemplateId(tssPhcrRelevantDxTestsSection, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssResultOrganizer(TssResultOrganizer tssResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(tssResultOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultOrganizer_validateResultOrganizerTemplateId(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCodeP(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultOrganizer_validateTssResultOrganizerCodeP(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultOrganizer_validateTssResultOrganizerCode(tssResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultOrganizer_validateTssResultOrganizerTssResultObservation(tssResultOrganizer, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateTssResultOrganizerCodeP constraint of '<em>Tss Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssResultOrganizer_validateTssResultOrganizerCodeP(TssResultOrganizer tssResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssResultOrganizer.validateTssResultOrganizerCodeP(diagnostics, context);
  }

  /**
   * Validates the validateTssResultOrganizerCode constraint of '<em>Tss Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssResultOrganizer_validateTssResultOrganizerCode(TssResultOrganizer tssResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssResultOrganizer.validateTssResultOrganizerCode(diagnostics, context);
  }

  /**
   * Validates the validateTssResultOrganizerTssResultObservation constraint of '<em>Tss Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssResultOrganizer_validateTssResultOrganizerTssResultObservation(TssResultOrganizer tssResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return tssResultOrganizer.validateTssResultOrganizerTssResultObservation(diagnostics, context);
  }

	/**
   * Validates the validateResultOrganizerTemplateId constraint of '<em>Tss Result Organizer</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssResultOrganizer_validateResultOrganizerTemplateId(TssResultOrganizer tssResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validateResultOrganizerTemplateId", getObjectLabel(tssResultOrganizer, context) },
             new Object[] { tssResultOrganizer },
             context));
      }
      return false;
    }
    return phcrValidator.validateResultOrganizer_validateResultOrganizerTemplateId(tssResultOrganizer, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssResultObservation(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(tssResultObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultObservation_validateResultObservationTemplateId(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCodeP(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultObservation_validateTssResultObservationCodeP(tssResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateTssResultObservation_validateTssResultObservationCode(tssResultObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateTssResultObservationCodeP constraint of '<em>Tss Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssResultObservation_validateTssResultObservationCodeP(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssResultObservation.validateTssResultObservationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateTssResultObservationCode constraint of '<em>Tss Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTssResultObservation_validateTssResultObservationCode(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tssResultObservation.validateTssResultObservationCode(diagnostics, context);
  }

  /**
   * Validates the validateResultObservationTemplateId constraint of '<em>Tss Result Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateTssResultObservation_validateResultObservationTemplateId(TssResultObservation tssResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
             new Object[] { "validateResultObservationTemplateId", getObjectLabel(tssResultObservation, context) },
             new Object[] { tssResultObservation },
             context));
      }
      return false;
    }
    return phcrValidator.validateResultObservation_validateResultObservationTemplateId(tssResultObservation, diagnostics, context);
  }

	/**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return TssPlugin.INSTANCE;
  }

} //tssValidator
