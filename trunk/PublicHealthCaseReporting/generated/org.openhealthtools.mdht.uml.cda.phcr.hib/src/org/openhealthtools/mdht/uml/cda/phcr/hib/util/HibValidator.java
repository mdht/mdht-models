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
package org.openhealthtools.mdht.uml.cda.phcr.hib.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;


import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.hib.*;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage
 * @generated
 */
public class HibValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final HibValidator INSTANCE = new HibValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.hib";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIB Case Report Title' of 'HIB Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_CASE_REPORT__HIB_CASE_REPORT_TITLE = 1;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIB Case Report Hib Phcr Clinical Information Section' of 'HIB Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_CASE_REPORT__HIB_CASE_REPORT_HIB_PHCR_CLINICAL_INFORMATION_SECTION = 2;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIB Case Report Hib Phcr Relevant Dx Tests Section' of 'HIB Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_CASE_REPORT__HIB_CASE_REPORT_HIB_PHCR_RELEVANT_DX_TESTS_SECTION = 3;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'HIB Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int HIB_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hib Phcr Clinical Information Section Hib Case Observation' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_PHCR_CLINICAL_INFORMATION_SECTION__HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION = 5;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 6;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hib Case Observation Hib Signs And Symptoms' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_CASE_OBSERVATION__HIB_CASE_OBSERVATION_HIB_SIGNS_AND_SYMPTOMS = 7;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 8;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_SIGNS_AND_SYMPTOMS__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 9;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hib Phcr Relevant Dx Tests Section Hib Result Observation' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_OBSERVATION = 10;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hib Phcr Relevant Dx Tests Section Hib Result Organizer' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__HIB_PHCR_RELEVANT_DX_TESTS_SECTION_HIB_RESULT_ORGANIZER = 11;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 12;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 13;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hib Result Organizer Hib Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_RESULT_ORGANIZER__HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION = 14;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HIB_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 15;

		/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 15;

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
  public HibValidator()
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
	  return HibPackage.eINSTANCE;
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
			case HibPackage.HIB_CASE_REPORT:
				return validateHIBCaseReport((HIBCaseReport)value, diagnostics, context);
			case HibPackage.HIB_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateHibPhcrClinicalInformationSection((HibPhcrClinicalInformationSection)value, diagnostics, context);
			case HibPackage.HIB_CASE_OBSERVATION:
				return validateHibCaseObservation((HibCaseObservation)value, diagnostics, context);
			case HibPackage.HIB_SIGNS_AND_SYMPTOMS:
				return validateHibSignsAndSymptoms((HibSignsAndSymptoms)value, diagnostics, context);
			case HibPackage.HIB_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateHibPhcrRelevantDxTestsSection((HibPhcrRelevantDxTestsSection)value, diagnostics, context);
			case HibPackage.HIB_RESULT_OBSERVATION:
				return validateHibResultObservation((HibResultObservation)value, diagnostics, context);
			case HibPackage.HIB_RESULT_ORGANIZER:
				return validateHibResultOrganizer((HibResultOrganizer)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIBCaseReport(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(hibCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIBCaseReport_validatePublicHealthCaseReportTemplateId(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIBCaseReport_validateHIBCaseReportTitle(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIBCaseReport_validateHIBCaseReportHibPhcrClinicalInformationSection(hibCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateHIBCaseReport_validateHIBCaseReportHibPhcrRelevantDxTestsSection(hibCaseReport, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateHIBCaseReportTitle constraint of '<em>HIB Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIBCaseReport_validateHIBCaseReportTitle(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibCaseReport.validateHIBCaseReportTitle(diagnostics, context);
	}

		/**
	 * Validates the validateHIBCaseReportHibPhcrClinicalInformationSection constraint of '<em>HIB Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIBCaseReport_validateHIBCaseReportHibPhcrClinicalInformationSection(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibCaseReport.validateHIBCaseReportHibPhcrClinicalInformationSection(diagnostics, context);
	}

		/**
	 * Validates the validateHIBCaseReportHibPhcrRelevantDxTestsSection constraint of '<em>HIB Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHIBCaseReport_validateHIBCaseReportHibPhcrRelevantDxTestsSection(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibCaseReport.validateHIBCaseReportHibPhcrRelevantDxTestsSection(diagnostics, context);
	}

		/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>HIB Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateHIBCaseReport_validatePublicHealthCaseReportTemplateId(HIBCaseReport hibCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return hibCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrClinicalInformationSection(HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hibPhcrClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(hibPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibPhcrClinicalInformationSection_validateHibPhcrClinicalInformationSectionHibCaseObservation(hibPhcrClinicalInformationSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateHibPhcrClinicalInformationSectionHibCaseObservation constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrClinicalInformationSection_validateHibPhcrClinicalInformationSectionHibCaseObservation(HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibPhcrClinicalInformationSection.validateHibPhcrClinicalInformationSectionHibCaseObservation(diagnostics, context);
	}

		/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibPhcrClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibCaseObservation(HibCaseObservation hibCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hibCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibCaseObservation_validateProblemObservationTemplateId(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(hibCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibCaseObservation_validateHibCaseObservationHibSignsAndSymptoms(hibCaseObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateHibCaseObservationHibSignsAndSymptoms constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibCaseObservation_validateHibCaseObservationHibSignsAndSymptoms(HibCaseObservation hibCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibCaseObservation.validateHibCaseObservationHibSignsAndSymptoms(diagnostics, context);
	}

		/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibCaseObservation_validateProblemObservationTemplateId(HibCaseObservation hibCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibSignsAndSymptoms(HibSignsAndSymptoms hibSignsAndSymptoms, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hibSignsAndSymptoms, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibSignsAndSymptoms_validateSignsAndSymptomsObservationTemplateId(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(hibSignsAndSymptoms, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(hibSignsAndSymptoms, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibSignsAndSymptoms_validateSignsAndSymptomsObservationTemplateId(HibSignsAndSymptoms hibSignsAndSymptoms, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibSignsAndSymptoms.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrRelevantDxTestsSection(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hibPhcrRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibPhcrRelevantDxTestsSection_validateHibPhcrRelevantDxTestsSectionHibResultObservation(hibPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibPhcrRelevantDxTestsSection_validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(hibPhcrRelevantDxTestsSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateHibPhcrRelevantDxTestsSectionHibResultObservation constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrRelevantDxTestsSection_validateHibPhcrRelevantDxTestsSectionHibResultObservation(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibPhcrRelevantDxTestsSection.validateHibPhcrRelevantDxTestsSectionHibResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validateHibPhcrRelevantDxTestsSectionHibResultOrganizer constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrRelevantDxTestsSection_validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibPhcrRelevantDxTestsSection.validateHibPhcrRelevantDxTestsSectionHibResultOrganizer(diagnostics, context);
	}

		/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(HibPhcrRelevantDxTestsSection hibPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibPhcrRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibResultObservation(HibResultObservation hibResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hibResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibResultObservation_validateResultObservationTemplateId(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(hibResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(hibResultObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibResultObservation_validateResultObservationTemplateId(HibResultObservation hibResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibResultOrganizer(HibResultOrganizer hibResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hibResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibResultOrganizer_validateResultOrganizerTemplateId(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(hibResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHibResultOrganizer_validateHibResultOrganizerHibResultObservation(hibResultOrganizer, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateHibResultOrganizerHibResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibResultOrganizer_validateHibResultOrganizerHibResultObservation(HibResultOrganizer hibResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibResultOrganizer.validateHibResultOrganizerHibResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibResultOrganizer_validateResultOrganizerTemplateId(HibResultOrganizer hibResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hibResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
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
		return HibPlugin.INSTANCE;
	}

} //HibValidator
