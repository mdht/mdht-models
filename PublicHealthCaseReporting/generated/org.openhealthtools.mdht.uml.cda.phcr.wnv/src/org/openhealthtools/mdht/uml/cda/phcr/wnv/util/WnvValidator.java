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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.*;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage
 * @generated
 */
public class WnvValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final WnvValidator INSTANCE = new WnvValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.wnv";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate West Nile Virus Case Report Title' of 'West Nile Virus Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int WEST_NILE_VIRUS_CASE_REPORT__WEST_NILE_VIRUS_CASE_REPORT_TITLE = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate West Nile Virus Case Report Wnv Phcr Clinical Information Section' of 'West Nile Virus Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int WEST_NILE_VIRUS_CASE_REPORT__WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate West Nile Virus Case Report Wnv Phcr Relevant Dx Tests Section' of 'West Nile Virus Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int WEST_NILE_VIRUS_CASE_REPORT__WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'West Nile Virus Case Report'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int WEST_NILE_VIRUS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 4;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Wnv Phcr Clinical Information Section Wnv Case Observation' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_PHCR_CLINICAL_INFORMATION_SECTION__WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION = 5;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'Phcr Clinical Information Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 6;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Wnv Case Observation Wnv Signs And Symptoms Observation' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_CASE_OBSERVATION__WNV_CASE_OBSERVATION_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION = 7;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 8;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 9;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Organizer' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_PHCR_RELEVANT_DX_TESTS_SECTION__WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER = 11;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Observation' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_PHCR_RELEVANT_DX_TESTS_SECTION__WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION = 10;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Phcr Relevant Dx Tests Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 12;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Wnv Result Organizer Wnv Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_RESULT_ORGANIZER__WNV_RESULT_ORGANIZER_WNV_RESULT_OBSERVATION = 15;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 16;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 17;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 13;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WNV_RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 14;

		/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 17;

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
  public WnvValidator()
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
	  return WnvPackage.eINSTANCE;
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
			case WnvPackage.WEST_NILE_VIRUS_CASE_REPORT:
				return validateWestNileVirusCaseReport((WestNileVirusCaseReport)value, diagnostics, context);
			case WnvPackage.WNV_PHCR_CLINICAL_INFORMATION_SECTION:
				return validateWnvPhcrClinicalInformationSection((WnvPhcrClinicalInformationSection)value, diagnostics, context);
			case WnvPackage.WNV_CASE_OBSERVATION:
				return validateWnvCaseObservation((WnvCaseObservation)value, diagnostics, context);
			case WnvPackage.WNV_SIGNS_AND_SYMPTOMS_OBSERVATION:
				return validateWnvSignsAndSymptomsObservation((WnvSignsAndSymptomsObservation)value, diagnostics, context);
			case WnvPackage.WNV_PHCR_RELEVANT_DX_TESTS_SECTION:
				return validateWnvPhcrRelevantDxTestsSection((WnvPhcrRelevantDxTestsSection)value, diagnostics, context);
			case WnvPackage.WNV_RESULT_OBSERVATION:
				return validateWnvResultObservation((WnvResultObservation)value, diagnostics, context);
			case WnvPackage.WNV_RESULT_ORGANIZER:
				return validateWnvResultOrganizer((WnvResultOrganizer)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReport(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(westNileVirusCaseReport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateWestNileVirusCaseReport_validatePublicHealthCaseReportTemplateId(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateWestNileVirusCaseReport_validateWestNileVirusCaseReportTitle(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateWestNileVirusCaseReport_validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(westNileVirusCaseReport, diagnostics, context);
		if (result || diagnostics != null) result &= validateWestNileVirusCaseReport_validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(westNileVirusCaseReport, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateWestNileVirusCaseReportTitle constraint of '<em>West Nile Virus Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReport_validateWestNileVirusCaseReportTitle(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return westNileVirusCaseReport.validateWestNileVirusCaseReportTitle(diagnostics, context);
	}

  /**
	 * Validates the validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection constraint of '<em>West Nile Virus Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReport_validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return westNileVirusCaseReport.validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(diagnostics, context);
	}

  /**
	 * Validates the validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection constraint of '<em>West Nile Virus Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReport_validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return westNileVirusCaseReport.validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(diagnostics, context);
	}

  /**
	 * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>West Nile Virus Case Report</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWestNileVirusCaseReport_validatePublicHealthCaseReportTemplateId(WestNileVirusCaseReport westNileVirusCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return westNileVirusCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWnvPhcrClinicalInformationSection(WnvPhcrClinicalInformationSection wnvPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(wnvPhcrClinicalInformationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(wnvPhcrClinicalInformationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvPhcrClinicalInformationSection_validateWnvPhcrClinicalInformationSectionWnvCaseObservation(wnvPhcrClinicalInformationSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateWnvPhcrClinicalInformationSectionWnvCaseObservation constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvPhcrClinicalInformationSection_validateWnvPhcrClinicalInformationSectionWnvCaseObservation(WnvPhcrClinicalInformationSection wnvPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvPhcrClinicalInformationSection.validateWnvPhcrClinicalInformationSectionWnvCaseObservation(diagnostics, context);
	}

		/**
	 * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>Phcr Clinical Information Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvPhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(WnvPhcrClinicalInformationSection wnvPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvPhcrClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWnvCaseObservation(WnvCaseObservation wnvCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(wnvCaseObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvCaseObservation_validateProblemObservationTemplateId(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationStatusCode(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateProblemObservationCode(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(wnvCaseObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvCaseObservation_validateWnvCaseObservationWnvSignsAndSymptomsObservation(wnvCaseObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateWnvCaseObservationWnvSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvCaseObservation_validateWnvCaseObservationWnvSignsAndSymptomsObservation(WnvCaseObservation wnvCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvCaseObservation.validateWnvCaseObservationWnvSignsAndSymptomsObservation(diagnostics, context);
	}

		/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvCaseObservation_validateProblemObservationTemplateId(WnvCaseObservation wnvCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWnvSignsAndSymptomsObservation(WnvSignsAndSymptomsObservation wnvSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(wnvSignsAndSymptomsObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(wnvSignsAndSymptomsObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(wnvSignsAndSymptomsObservation, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(WnvSignsAndSymptomsObservation wnvSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateWnvPhcrRelevantDxTestsSection(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(wnvPhcrRelevantDxTestsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validateResultsSectionCode(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvPhcrRelevantDxTestsSection_validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvPhcrRelevantDxTestsSection_validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(wnvPhcrRelevantDxTestsSection, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateWnvPhcrRelevantDxTestsSectionWnvResultObservation constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvPhcrRelevantDxTestsSection_validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvPhcrRelevantDxTestsSection.validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvPhcrRelevantDxTestsSection_validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvPhcrRelevantDxTestsSection.validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(diagnostics, context);
	}

		/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Phcr Relevant Dx Tests Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvPhcrRelevantDxTestsSection_validateResultsSectionTemplateId(WnvPhcrRelevantDxTestsSection wnvPhcrRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvPhcrRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultObservation(WnvResultObservation wnvResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wnvResultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvResultObservation_validateResultObservationTemplateId(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validateResultObservationStatusCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvResultObservation_validateResultObservationCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(wnvResultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(wnvResultObservation, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultObservation_validateResultObservationTemplateId(WnvResultObservation wnvResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvResultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validateResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultObservation_validateResultObservationCode(WnvResultObservation wnvResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvResultObservation.validateResultObservationCode(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultOrganizer(WnvResultOrganizer wnvResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wnvResultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvResultOrganizer_validateResultOrganizerTemplateId(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvResultOrganizer_validateResultOrganizerCode(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validateResultOrganizerStatusCode(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(wnvResultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateWnvResultOrganizer_validateWnvResultOrganizerWnvResultObservation(wnvResultOrganizer, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateWnvResultOrganizerWnvResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultOrganizer_validateWnvResultOrganizerWnvResultObservation(WnvResultOrganizer wnvResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvResultOrganizer.validateWnvResultOrganizerWnvResultObservation(diagnostics, context);
	}

		/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultOrganizer_validateResultOrganizerTemplateId(WnvResultOrganizer wnvResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

		/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWnvResultOrganizer_validateResultOrganizerCode(WnvResultOrganizer wnvResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wnvResultOrganizer.validateResultOrganizerCode(diagnostics, context);
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
		return WnvPlugin.INSTANCE;
	}

} //WnvValidator
