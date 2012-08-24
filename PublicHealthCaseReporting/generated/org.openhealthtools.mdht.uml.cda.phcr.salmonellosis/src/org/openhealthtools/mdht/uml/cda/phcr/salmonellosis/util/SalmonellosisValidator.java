/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.*;

import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPackage
 * @generated
 */
public class SalmonellosisValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final SalmonellosisValidator INSTANCE = new SalmonellosisValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.phcr.salmonellosis";

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Report Title' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_TITLE = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Report Salmonellosis Social History Section' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION = 2;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Report Salmonellosis Relevant Dx Tests Section' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Report Salmonellosis PHCR Clinical Information Section' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_REPORT__SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Public Health Case Report Template Id' of 'Case Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_REPORT__PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis PHCR Social History Section Salmonellosis Possible Exposure Location And Type Act' of 'PHCR Social History Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION__SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis PHCR Social History Section HIV Status Observation' of 'PHCR Social History Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION__SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'PHCR Social History Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Possible Exposure Location And Type Act Template Id' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Possible Exposure Location And Type Act Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Possible Exposure Location And Type Act Status Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Possible Exposure Location And Type Act Status Code P' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Possible Exposure Location And Type Act Class Code' of 'Possible Exposure Location And Type Act'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Template Id' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_TEMPLATE_ID = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Code P' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_CODE_P = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Code' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_CODE = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Status Code' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_STATUS_CODE = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Value' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_VALUE = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Class Code' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_CLASS_CODE = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HIV Status Observation Mood Code' of 'HIV Status Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int HIV_STATUS_OBSERVATION__HIV_STATUS_OBSERVATION_MOOD_CODE = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Organizer' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Observation' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'PHCR Relevant Dx Tests Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Result Organizer Code' of 'Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_RESULT_ORGANIZER__SALMONELLOSIS_RESULT_ORGANIZER_CODE = 24;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Result Organizer Salmonellosis Result Observation' of 'Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_RESULT_ORGANIZER__SALMONELLOSIS_RESULT_ORGANIZER_SALMONELLOSIS_RESULT_OBSERVATION = 25;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 26;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Result Observation Code' of 'Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_RESULT_OBSERVATION__SALMONELLOSIS_RESULT_OBSERVATION_CODE = 27;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 28;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis PHCR Clinical Information Section Salmonellosis Case Observation' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SALMONELLOSIS_CASE_OBSERVATION = 29;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phcr Clinical Information Section Template Id' of 'PHCR Clinical Information Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID = 30;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Observation Target Site Code' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_OBSERVATION__SALMONELLOSIS_CASE_OBSERVATION_TARGET_SITE_CODE = 31;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Observation Value' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_OBSERVATION__SALMONELLOSIS_CASE_OBSERVATION_VALUE = 32;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Case Observation Salmonellosis Signs And Symptoms Observation' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_OBSERVATION__SALMONELLOSIS_CASE_OBSERVATION_SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION = 33;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Case Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 34;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Salmonellosis Signs And Symptoms Observation Value' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE = 35;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Signs And Symptoms Observation Template Id' of 'Signs And Symptoms Observation'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID = 36;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 36;

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
  public SalmonellosisValidator()
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
    return SalmonellosisPackage.eINSTANCE;
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
      case SalmonellosisPackage.SALMONELLOSIS_CASE_REPORT:
        return validateSalmonellosisCaseReport((SalmonellosisCaseReport)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION:
        return validateSalmonellosisPHCRSocialHistorySection((SalmonellosisPHCRSocialHistorySection)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT:
        return validateSalmonellosisPossibleExposureLocationAndTypeAct((SalmonellosisPossibleExposureLocationAndTypeAct)value, diagnostics, context);
      case SalmonellosisPackage.HIV_STATUS_OBSERVATION:
        return validateHIVStatusObservation((HIVStatusObservation)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION:
        return validateSalmonellosisPHCRRelevantDxTestsSection((SalmonellosisPHCRRelevantDxTestsSection)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_RESULT_ORGANIZER:
        return validateSalmonellosisResultOrganizer((SalmonellosisResultOrganizer)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_RESULT_OBSERVATION:
        return validateSalmonellosisResultObservation((SalmonellosisResultObservation)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION:
        return validateSalmonellosisPHCRClinicalInformationSection((SalmonellosisPHCRClinicalInformationSection)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_CASE_OBSERVATION:
        return validateSalmonellosisCaseObservation((SalmonellosisCaseObservation)value, diagnostics, context);
      case SalmonellosisPackage.SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION:
        return validateSalmonellosisSignsAndSymptomsObservation((SalmonellosisSignsAndSymptomsObservation)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReport(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisCaseReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTarget(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRole(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthor(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorTiime(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticator(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseReport_validatePublicHealthCaseReportTemplateId(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCodeP(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportCode(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrSocialHistorySection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrClinicalInformationSection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrTreatmentInformationSection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrEncountersSection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportPhcrRelevantDxTestsSection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePublicHealthCaseReport_validatePublicHealthCaseReportImmunizationsSection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseReport_validateSalmonellosisCaseReportTitle(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseReport_validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseReport_validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(salmonellosisCaseReport, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseReport_validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(salmonellosisCaseReport, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisCaseReportTitle constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReport_validateSalmonellosisCaseReportTitle(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseReport.validateSalmonellosisCaseReportTitle(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisCaseReportSalmonellosisSocialHistorySection constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReport_validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseReport.validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReport_validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseReport.validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReport_validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseReport.validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(diagnostics, context);
  }

  /**
   * Validates the validatePublicHealthCaseReportTemplateId constraint of '<em>Case Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseReport_validatePublicHealthCaseReportTemplateId(SalmonellosisCaseReport salmonellosisCaseReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseReport.validatePublicHealthCaseReportTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRSocialHistorySection(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisPHCRSocialHistorySection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionMaritalStatus(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionReligiousAffiliation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRace(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientRaceCodeSystem(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicity(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionPatientEthnicityCodeSystem(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionText(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionSocialHistoryObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCodeP(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionCode(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionTitle(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionText(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionGeotemporalHistoryObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionRaceObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionOccupationObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrSocialHistorySection_validatePhcrSocialHistorySectionPregnancyObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRSocialHistorySection_validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRSocialHistorySection_validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(salmonellosisPHCRSocialHistorySection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct constraint of '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRSocialHistorySection_validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRSocialHistorySection.validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation constraint of '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRSocialHistorySection_validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRSocialHistorySection.validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(diagnostics, context);
  }

  /**
   * Validates the validateSocialHistorySectionTemplateId constraint of '<em>PHCR Social History Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRSocialHistorySection_validateSocialHistorySectionTemplateId(SalmonellosisPHCRSocialHistorySection salmonellosisPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRSocialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeAct(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActCode(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(salmonellosisPossibleExposureLocationAndTypeAct, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPossibleExposureLocationAndTypeAct.validateSalmonellosisPossibleExposureLocationAndTypeActTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisPossibleExposureLocationAndTypeActCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActCode(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPossibleExposureLocationAndTypeAct.validateSalmonellosisPossibleExposureLocationAndTypeActCode(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPossibleExposureLocationAndTypeAct.validateSalmonellosisPossibleExposureLocationAndTypeActStatusCode(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPossibleExposureLocationAndTypeAct.validateSalmonellosisPossibleExposureLocationAndTypeActStatusCodeP(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisPossibleExposureLocationAndTypeActClassCode constraint of '<em>Possible Exposure Location And Type Act</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPossibleExposureLocationAndTypeAct_validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(SalmonellosisPossibleExposureLocationAndTypeAct salmonellosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPossibleExposureLocationAndTypeAct.validateSalmonellosisPossibleExposureLocationAndTypeActClassCode(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationCodeP(hivStatusObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationCode(hivStatusObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationStatusCode(hivStatusObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationValue(hivStatusObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateHIVStatusObservation_validateHIVStatusObservationClassCode(hivStatusObservation, diagnostics, context);
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
   * Validates the validateHIVStatusObservationCodeP constraint of '<em>HIV Status Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationCodeP(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return hivStatusObservation.validateHIVStatusObservationCodeP(diagnostics, context);
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
   * Validates the validateHIVStatusObservationValue constraint of '<em>HIV Status Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHIVStatusObservation_validateHIVStatusObservationValue(HIVStatusObservation hivStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return hivStatusObservation.validateHIVStatusObservationValue(diagnostics, context);
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
  public boolean validateSalmonellosisPHCRRelevantDxTestsSection(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCodeP(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionCode(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionTitle(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionText(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultOrganizer(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionResultObservation(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrRelevantDxTestsSection_validatePhcrRelevantDxTestsSectionImagingObservation(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRRelevantDxTestsSection_validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRRelevantDxTestsSection_validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(salmonellosisPHCRRelevantDxTestsSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRRelevantDxTestsSection_validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRRelevantDxTestsSection.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRRelevantDxTestsSection_validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRRelevantDxTestsSection.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(diagnostics, context);
  }

  /**
   * Validates the validateResultsSectionTemplateId constraint of '<em>PHCR Relevant Dx Tests Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRRelevantDxTestsSection_validateResultsSectionTemplateId(SalmonellosisPHCRRelevantDxTestsSection salmonellosisPHCRRelevantDxTestsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRRelevantDxTestsSection.validateResultsSectionTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultOrganizer(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisResultOrganizer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCodeValue(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisResultOrganizer_validateResultOrganizerTemplateId(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerSpecimen(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerClassCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerMoodCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerId(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCodeP(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerStatusCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerEffectiveTime(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerResultObservation(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultOrganizer_validatePHCRResultOrganizerSpecimenCollectionProcedure(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisResultOrganizer_validateSalmonellosisResultOrganizerCode(salmonellosisResultOrganizer, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisResultOrganizer_validateSalmonellosisResultOrganizerSalmonellosisResultObservation(salmonellosisResultOrganizer, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisResultOrganizerCode constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultOrganizer_validateSalmonellosisResultOrganizerCode(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisResultOrganizer.validateSalmonellosisResultOrganizerCode(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisResultOrganizerSalmonellosisResultObservation constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultOrganizer_validateSalmonellosisResultOrganizerSalmonellosisResultObservation(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisResultOrganizer.validateSalmonellosisResultOrganizerSalmonellosisResultObservation(diagnostics, context);
  }

  /**
   * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultOrganizer_validateResultOrganizerTemplateId(SalmonellosisResultOrganizer salmonellosisResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisResultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultObservation(SalmonellosisResultObservation salmonellosisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisResultObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCodeValue(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisResultObservation_validateResultObservationTemplateId(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationClassCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCodeP(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationStatusCode(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSpecimenCollectionProcedure(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateResultObservation_validatePHCRResultObservationSusceptibilityResult(salmonellosisResultObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisResultObservation_validateSalmonellosisResultObservationCode(salmonellosisResultObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisResultObservationCode constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultObservation_validateSalmonellosisResultObservationCode(SalmonellosisResultObservation salmonellosisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisResultObservation.validateSalmonellosisResultObservationCode(diagnostics, context);
  }

  /**
   * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisResultObservation_validateResultObservationTemplateId(SalmonellosisResultObservation salmonellosisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisResultObservation.validateResultObservationTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRClinicalInformationSection(SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisPHCRClinicalInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionConstraint(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCode(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCodeP(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionTitle(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionText(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionCaseObservation(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionAliveObservation(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validatePhcrClinicalInformationSection_validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisPHCRClinicalInformationSection_validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(salmonellosisPHCRClinicalInformationSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRClinicalInformationSection_validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRClinicalInformationSection.validateSalmonellosisPHCRClinicalInformationSectionSalmonellosisCaseObservation(diagnostics, context);
  }

  /**
   * Validates the validatePhcrClinicalInformationSectionTemplateId constraint of '<em>PHCR Clinical Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisPHCRClinicalInformationSection_validatePhcrClinicalInformationSectionTemplateId(SalmonellosisPHCRClinicalInformationSection salmonellosisPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisPHCRClinicalInformationSection.validatePhcrClinicalInformationSectionTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservation(SalmonellosisCaseObservation salmonellosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisCaseObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseObservation_validateProblemObservationTemplateId(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatus(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatus(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTimeLow(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthor(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationAuthorAssignedAuthor(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationClassCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationMoodCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationId(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCodeP(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCodeP(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationStatusCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationEffectiveTime(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationValue(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationProblemStatusObservation(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateCaseObservation_validateCaseObservationSignsAndSymptomsObservation(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseObservation_validateSalmonellosisCaseObservationTargetSiteCode(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseObservation_validateSalmonellosisCaseObservationValue(salmonellosisCaseObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisCaseObservation_validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(salmonellosisCaseObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisCaseObservationTargetSiteCode constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservation_validateSalmonellosisCaseObservationTargetSiteCode(SalmonellosisCaseObservation salmonellosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseObservation.validateSalmonellosisCaseObservationTargetSiteCode(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisCaseObservationValue constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservation_validateSalmonellosisCaseObservationValue(SalmonellosisCaseObservation salmonellosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseObservation.validateSalmonellosisCaseObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservation_validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(SalmonellosisCaseObservation salmonellosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseObservation.validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(diagnostics, context);
  }

  /**
   * Validates the validateProblemObservationTemplateId constraint of '<em>Case Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisCaseObservation_validateProblemObservationTemplateId(SalmonellosisCaseObservation salmonellosisCaseObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisCaseObservation.validateProblemObservationTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisSignsAndSymptomsObservation(SalmonellosisSignsAndSymptomsObservation salmonellosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(salmonellosisSignsAndSymptomsObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationClassCode(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationMoodCode(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationNegationInd(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCodeP(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationCode(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCode(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationStatusCodeP(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationEffectiveTime(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= phcrValidator.validateSignsAndSymptomsObservation_validateSignsAndSymptomsObservationValue(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateSalmonellosisSignsAndSymptomsObservation_validateSalmonellosisSignsAndSymptomsObservationValue(salmonellosisSignsAndSymptomsObservation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateSalmonellosisSignsAndSymptomsObservationValue constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisSignsAndSymptomsObservation_validateSalmonellosisSignsAndSymptomsObservationValue(SalmonellosisSignsAndSymptomsObservation salmonellosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisSignsAndSymptomsObservation.validateSalmonellosisSignsAndSymptomsObservationValue(diagnostics, context);
  }

  /**
   * Validates the validateSignsAndSymptomsObservationTemplateId constraint of '<em>Signs And Symptoms Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSalmonellosisSignsAndSymptomsObservation_validateSignsAndSymptomsObservationTemplateId(SalmonellosisSignsAndSymptomsObservation salmonellosisSignsAndSymptomsObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return salmonellosisSignsAndSymptomsObservation.validateSignsAndSymptomsObservationTemplateId(diagnostics, context);
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
    return SalmonellosisPlugin.INSTANCE;
  }

} //SalmonellosisValidator
