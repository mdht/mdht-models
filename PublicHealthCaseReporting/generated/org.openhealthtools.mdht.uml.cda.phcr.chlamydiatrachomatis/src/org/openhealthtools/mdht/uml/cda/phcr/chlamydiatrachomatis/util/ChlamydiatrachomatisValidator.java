/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage
 * @generated
 */
public class ChlamydiatrachomatisValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final ChlamydiatrachomatisValidator INSTANCE = new ChlamydiatrachomatisValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis";

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Public Health Case Report Title' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Clinical Information Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION = 2;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Relevant Dx Tests Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Treatment Information Section' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Public Health Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis PHCR Clinical Information Section Chlamydiatrachomatis Case Observation' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Case Observation Value P' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE_P = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Case Observation Value' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__CHLAMYDIATRACHOMATIS_CASE_OBSERVATION_VALUE = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Observation' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis PHCR Relevant Dx Tests Section Chlamydiatrachomatis Result Organizer' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION_CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Result Observation Code' of 'Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Result Organizer Code' of 'chlamydiatrachomatis Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER_CODE = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'chlamydiatrachomatis Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis PHCR Treatment Information Section Chlamydiatrachomatis Therapeutic Regimen Act' of 'PHCR Treatment Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Treatment Information Section Template Id' of 'PHCR Treatment Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Given Substance Administration' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Not Given Substance Administration' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Therapeutic Regimen Act Template Id' of 'Therapeutic Regimen Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Given Substance Administration Template Id' of 'Treatment Given Substance Administration'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Treatment Not Given Substance Administration Template Id' of 'Treatment Not Given Substance Administration'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 24;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 24;

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
  public ChlamydiatrachomatisValidator()
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
    return ChlamydiatrachomatisPackage.eINSTANCE;
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
    switch (classifierID)
    {
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT:
        return validateChlamydiatrachomatisPublicHealthCaseReport((ChlamydiatrachomatisPublicHealthCaseReport)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION:
        return validateChlamydiatrachomatisPHCRClinicalInformationSection((ChlamydiatrachomatisPHCRClinicalInformationSection)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_CASE_OBSERVATION:
        return validateChlamydiatrachomatisCaseObservation((ChlamydiatrachomatisCaseObservation)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION:
        return validateChlamydiatrachomatisPHCRRelevantDxTestsSection((ChlamydiatrachomatisPHCRRelevantDxTestsSection)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION:
        return validateChlamydiatrachomatisResultObservation((ChlamydiatrachomatisResultObservation)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_RESULT_ORGANIZER:
        return validatechlamydiatrachomatisResultOrganizer((chlamydiatrachomatisResultOrganizer)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION:
        return validateChlamydiatrachomatisPHCRTreatmentInformationSection((ChlamydiatrachomatisPHCRTreatmentInformationSection)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT:
        return validateChlamydiatrachomatisTherapeuticRegimenAct((ChlamydiatrachomatisTherapeuticRegimenAct)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION:
        return validateChlamydiatrachomatisTreatmentGivenSubstanceAdministration((ChlamydiatrachomatisTreatmentGivenSubstanceAdministration)value, diagnostics, context);
      case ChlamydiatrachomatisPackage.CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION:
        return validateChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration((ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPublicHealthCaseReport(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPublicHealthCaseReport_validatePublicHealthCaseReportTemplateId(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportTitle(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(chlamydiatrachomatisPublicHealthCaseReport, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisPublicHealthCaseReportTitle constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportTitle(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPublicHealthCaseReport.validateChlamydiatrachomatisPublicHealthCaseReportTitle(diagnostics, context);
  }

  /**
   * Validates the validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPublicHealthCaseReport.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(diagnostics, context);
  }

  /**
   * Validates the validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPublicHealthCaseReport.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(diagnostics, context);
  }

  /**
   * Validates the validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPublicHealthCaseReport_validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPublicHealthCaseReport.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(diagnostics, context);
  }

  /**
   * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Public Health Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPublicHealthCaseReport_validatePublicHealthCaseReportTemplateId(ChlamydiatrachomatisPublicHealthCaseReport chlamydiatrachomatisPublicHealthCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPublicHealthCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRClinicalInformationSection(ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRClinicalInformationSection_validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(chlamydiatrachomatisPHCRClinicalInformationSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRClinicalInformationSection_validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRClinicalInformationSection.validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(diagnostics, context);
  }

  /**
   * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(ChlamydiatrachomatisPHCRClinicalInformationSection chlamydiatrachomatisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisCaseObservation(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisCaseObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisCaseObservation_validateProblemObservationTemplateId(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCodeP(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCodeP(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisCaseObservation_validateChlamydiatrachomatisCaseObservationValueP(chlamydiatrachomatisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisCaseObservation_validateChlamydiatrachomatisCaseObservationValue(chlamydiatrachomatisCaseObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisCaseObservationValueP constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisCaseObservation_validateChlamydiatrachomatisCaseObservationValueP(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisCaseObservation.validateChlamydiatrachomatisCaseObservationValueP(diagnostics, context);
  }

  /**
   * Validates the validateChlamydiatrachomatisCaseObservationValue constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisCaseObservation_validateChlamydiatrachomatisCaseObservationValue(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisCaseObservation.validateChlamydiatrachomatisCaseObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisCaseObservation_validateProblemObservationTemplateId(ChlamydiatrachomatisCaseObservation chlamydiatrachomatisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSection(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCodeP(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRRelevantDxTestsSection_validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRRelevantDxTestsSection_validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(chlamydiatrachomatisPHCRRelevantDxTestsSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSection_validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRRelevantDxTestsSection.validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultObservation(diagnostics, context);
  }

  /**
   * Validates the validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSection_validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRRelevantDxTestsSection.validateChlamydiatrachomatisPHCRRelevantDxTestsSectionChlamydiatrachomatisResultOrganizer(diagnostics, context);
  }

  /**
   * Validates the validateResultsSectionTemplateId constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(ChlamydiatrachomatisPHCRRelevantDxTestsSection chlamydiatrachomatisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisResultObservation(ChlamydiatrachomatisResultObservation chlamydiatrachomatisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisResultObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisResultObservation_validateResultObservationTemplateId(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCodeP(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(chlamydiatrachomatisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisResultObservation_validateChlamydiatrachomatisResultObservationCode(chlamydiatrachomatisResultObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisResultObservationCode constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisResultObservation_validateChlamydiatrachomatisResultObservationCode(ChlamydiatrachomatisResultObservation chlamydiatrachomatisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisResultObservation.validateChlamydiatrachomatisResultObservationCode(diagnostics, context);
  }

  /**
   * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisResultObservation_validateResultObservationTemplateId(ChlamydiatrachomatisResultObservation chlamydiatrachomatisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisResultObservation.validateResultObservationTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatechlamydiatrachomatisResultOrganizer(chlamydiatrachomatisResultOrganizer chlamydiatrachomatisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisResultOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validatechlamydiatrachomatisResultOrganizer_validateResultOrganizerTemplateId(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCodeP(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validatechlamydiatrachomatisResultOrganizer_validateChlamydiatrachomatisResultOrganizerCode(chlamydiatrachomatisResultOrganizer, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisResultOrganizerCode constraint of '<em>chlamydiatrachomatis Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatechlamydiatrachomatisResultOrganizer_validateChlamydiatrachomatisResultOrganizerCode(chlamydiatrachomatisResultOrganizer chlamydiatrachomatisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisResultOrganizer.validateChlamydiatrachomatisResultOrganizerCode(diagnostics, context);
  }

  /**
   * Validates the validateResultOrganizerTemplateId constraint of '<em>chlamydiatrachomatis Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatechlamydiatrachomatisResultOrganizer_validateResultOrganizerTemplateId(chlamydiatrachomatisResultOrganizer chlamydiatrachomatisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRTreatmentInformationSection(ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCode(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionCodeP(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTitle(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionText(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrTreatmentInformationSection_validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisPHCRTreatmentInformationSection_validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(chlamydiatrachomatisPHCRTreatmentInformationSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct constraint of '<em>PHCR Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRTreatmentInformationSection_validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRTreatmentInformationSection.validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(diagnostics, context);
  }

  /**
   * Validates the validatePhcrTreatmentInformationSectionTemplateId constraint of '<em>PHCR Treatment Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisPHCRTreatmentInformationSection_validatePhcrTreatmentInformationSectionTemplateId(ChlamydiatrachomatisPHCRTreatmentInformationSection chlamydiatrachomatisPHCRTreatmentInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisPHCRTreatmentInformationSection.validatePhcrTreatmentInformationSectionTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTherapeuticRegimenAct(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActClassCode(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActMoodCode(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActNegationInd(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCodeP(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActCode(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCode(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActStatusCodeP(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentGivenSubstanceAdministration(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTherapeuticRegimenAct_validateTherapeuticRegimenActTreatmentNotGivenSubstanceAdministration(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisTherapeuticRegimenAct_validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisTherapeuticRegimenAct_validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(chlamydiatrachomatisTherapeuticRegimenAct, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTherapeuticRegimenAct_validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisTherapeuticRegimenAct.validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(diagnostics, context);
  }

  /**
   * Validates the validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTherapeuticRegimenAct_validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisTherapeuticRegimenAct.validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(diagnostics, context);
  }

  /**
   * Validates the validateTherapeuticRegimenActTemplateId constraint of '<em>Therapeutic Regimen Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTherapeuticRegimenAct_validateTherapeuticRegimenActTemplateId(ChlamydiatrachomatisTherapeuticRegimenAct chlamydiatrachomatisTherapeuticRegimenAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisTherapeuticRegimenAct.validateTherapeuticRegimenActTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTreatmentGivenSubstanceAdministration(ChlamydiatrachomatisTreatmentGivenSubstanceAdministration chlamydiatrachomatisTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTreatmentGivenNegationInd(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationClassCode(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationMoodCode(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationNegationInd(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationStatusCode(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationEffectiveTime(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCodeP(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationRouteCode(chlamydiatrachomatisTreatmentGivenSubstanceAdministration, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateTreatmentGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTreatmentGivenSubstanceAdministration_validateTreatmentGivenSubstanceAdministrationTemplateId(ChlamydiatrachomatisTreatmentGivenSubstanceAdministration chlamydiatrachomatisTreatmentGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisTreatmentGivenSubstanceAdministration.validateTreatmentGivenSubstanceAdministrationTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= validateChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationClassCode(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationMoodCode(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationNegationInd(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCode(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateTreatmentNotGivenSubstanceAdministrationTemplateId constraint of '<em>Treatment Not Given Substance Administration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration_validateTreatmentNotGivenSubstanceAdministrationTemplateId(ChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return chlamydiatrachomatisTreatmentNotGivenSubstanceAdministration.validateTreatmentNotGivenSubstanceAdministrationTemplateId(diagnostics, context);
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
    return ChlamydiatrachomatisPlugin.INSTANCE;
  }

} //ChlamydiatrachomatisValidator
