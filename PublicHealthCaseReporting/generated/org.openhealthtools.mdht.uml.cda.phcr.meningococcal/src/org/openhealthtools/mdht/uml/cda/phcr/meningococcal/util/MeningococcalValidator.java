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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;


import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.*;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage
 * @generated
 */
public class MeningococcalValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final MeningococcalValidator INSTANCE = new MeningococcalValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.meningococcal";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Case Report Title' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_CASE_REPORT__MENINGOCOCCAL_CASE_REPORT_TITLE = 1;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Case Report Meningococcal Phcr Clinical Information Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_CASE_REPORT__MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION = 2;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Case Report Meningococcal Phcr Relevant Dx Tests Section' of 'Case Report'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_CASE_REPORT__MENINGOCOCCAL_CASE_REPORT_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION = 3;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int MENINGOCOCCAL_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Phcr Clinical Information Section Meningococcal Case Observation' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION = 5;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 6;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Case Observation Meningococcal Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_CASE_OBSERVATION__MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION = 7;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 8;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 9;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Phcr Relevant Dx Tests Section Meningococcal Result Observation' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION = 10;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Meningococcal Phcr Relevant Dx Tests Section Meningococcal Result Organizer' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER = 11;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 12;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 13;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MENINGOCOCCAL_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 14;

		/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 14;

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
  public MeningococcalValidator()
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
	  return MeningococcalPackage.eINSTANCE;
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
			case MeningococcalPackage.MENINGOCOCCAL_CASE_REPORT:
				return validateMeningococcalCaseReport((MeningococcalCaseReport)value, diagnostics, context);
			case MeningococcalPackage.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateMeningococcalPhcrClinicalInformationSection((MeningococcalPhcrClinicalInformationSection)value, diagnostics, context);
			case MeningococcalPackage.MENINGOCOCCAL_CASE_OBSERVATION:
				return validateMeningococcalCaseObservation((MeningococcalCaseObservation)value, diagnostics, context);
			case MeningococcalPackage.MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateMeningococcalSignsAndSymptomsObservation((MeningococcalSignsAndSymptomsObservation)value, diagnostics, context);
			case MeningococcalPackage.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateMeningococcalPhcrRelevantDxTestsSection((MeningococcalPhcrRelevantDxTestsSection)value, diagnostics, context);
			case MeningococcalPackage.MENINGOCOCCAL_RESULT_OBSERVATION:
				return validateMeningococcalResultObservation((MeningococcalResultObservation)value, diagnostics, context);
			case MeningococcalPackage.MENINGOCOCCAL_RESULT_ORGANIZER:
				return validateMeningococcalResultOrganizer((MeningococcalResultOrganizer)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateMeningococcalCaseReport(MeningococcalCaseReport meningococcalCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(meningococcalCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalCaseReport_validatePublicHealthCaseReportTemplateId(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalCaseReport_validateMeningococcalCaseReportTitle(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalCaseReport_validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(meningococcalCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalCaseReport_validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(meningococcalCaseReport, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateMeningococcalCaseReportTitle constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseReport_validateMeningococcalCaseReportTitle(MeningococcalCaseReport meningococcalCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalCaseReport.validateMeningococcalCaseReportTitle(diagnostics, context);
	}

		/**
	 * Validates the validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseReport_validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(MeningococcalCaseReport meningococcalCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalCaseReport.validateMeningococcalCaseReportMeningococcalPhcrClinicalInformationSection(diagnostics, context);
	}

		/**
	 * Validates the validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseReport_validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(MeningococcalCaseReport meningococcalCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalCaseReport.validateMeningococcalCaseReportMeningococcalPhcrRelevantDxTestsSection(diagnostics, context);
	}

		/**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateMeningococcalCaseReport_validatePublicHealthCaseReportTemplateId(MeningococcalCaseReport meningococcalCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return meningococcalCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrClinicalInformationSection(MeningococcalPhcrClinicalInformationSection meningococcalPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meningococcalPhcrClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalPhcrClinicalInformationSection_validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(meningococcalPhcrClinicalInformationSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrClinicalInformationSection_validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(MeningococcalPhcrClinicalInformationSection meningococcalPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalPhcrClinicalInformationSection.validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(diagnostics, context);
	}

		/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(MeningococcalPhcrClinicalInformationSection meningococcalPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalPhcrClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseObservation(MeningococcalCaseObservation meningococcalCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meningococcalCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalCaseObservation_validateProblemObservationTemplateId(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(meningococcalCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalCaseObservation_validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(meningococcalCaseObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseObservation_validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(MeningococcalCaseObservation meningococcalCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalCaseObservation.validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(diagnostics, context);
	}

		/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseObservation_validateProblemObservationTemplateId(MeningococcalCaseObservation meningococcalCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalSignsAndSymptomsObservation(MeningococcalSignsAndSymptomsObservation meningococcalSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meningococcalSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(meningococcalSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(MeningococcalSignsAndSymptomsObservation meningococcalSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrRelevantDxTestsSection(MeningococcalPhcrRelevantDxTestsSection meningococcalPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meningococcalPhcrRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalPhcrRelevantDxTestsSection_validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalPhcrRelevantDxTestsSection_validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(meningococcalPhcrRelevantDxTestsSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrRelevantDxTestsSection_validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(MeningococcalPhcrRelevantDxTestsSection meningococcalPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalPhcrRelevantDxTestsSection.validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrRelevantDxTestsSection_validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(MeningococcalPhcrRelevantDxTestsSection meningococcalPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalPhcrRelevantDxTestsSection.validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(diagnostics, context);
	}

		/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(MeningococcalPhcrRelevantDxTestsSection meningococcalPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalPhcrRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalResultObservation(MeningococcalResultObservation meningococcalResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meningococcalResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalResultObservation_validateResultObservationTemplateId(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(meningococcalResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(meningococcalResultObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalResultObservation_validateResultObservationTemplateId(MeningococcalResultObservation meningococcalResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalResultOrganizer(MeningococcalResultOrganizer meningococcalResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(meningococcalResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeningococcalResultOrganizer_validateResultOrganizerTemplateId(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(meningococcalResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(meningococcalResultOrganizer, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalResultOrganizer_validateResultOrganizerTemplateId(MeningococcalResultOrganizer meningococcalResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return meningococcalResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
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
		return MeningococcalPlugin.INSTANCE;
	}

} //MeningococcalValidator
