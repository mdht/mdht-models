/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.emspcr.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage
 * @generated
 */
public class EmspcrValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final EmspcrValidator INSTANCE = new EmspcrValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.emspcr";

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Class Code' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CLASS_CODE = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Mood Code' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_MOOD_CODE = 2;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Set Id' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SET_ID = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Human Author' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_HUMAN_AUTHOR = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Component Of' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_COMPONENT_OF = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Advance Directives Section Entries Optional' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Allergies Section Entries Optional' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Billing Template Id' of 'Billing'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BILLING__BILLING_TEMPLATE_ID = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Billing Code' of 'Billing'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BILLING__BILLING_CODE = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Billing Level Of Service' of 'Billing'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int BILLING__BILLING_LEVEL_OF_SERVICE = 12;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

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
  protected ConsolValidator consolValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmspcrValidator()
  {
    super();
    cdaValidator = CDAValidator.INSTANCE;
    consolValidator = ConsolValidator.INSTANCE;
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
    return EmspcrPackage.eINSTANCE;
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
      case EmspcrPackage.PATIENT_CARE_REPORT:
        return validatePatientCareReport((PatientCareReport)value, diagnostics, context);
      case EmspcrPackage.BILLING:
        return validateBilling((Billing)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(patientCareReport, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddress(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validateGeneralHeaderConstraintsTemplateId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validateGeneralHeaderConstraintsCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportClassCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportMoodCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportSetId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportHumanAuthor(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportComponentOf(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportAllergiesSectionEntriesOptional(patientCareReport, diagnostics, context);
    return result;
  }

  /**
   * Validates the validatePatientCareReportClassCode constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportClassCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportMoodCode constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportMoodCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportMoodCode(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportSetId constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportSetId(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportSetId(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportHumanAuthor constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportHumanAuthor(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportHumanAuthor(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportComponentOf constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportComponentOf(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportComponentOf(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportAdvanceDirectivesSectionEntriesOptional constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportAdvanceDirectivesSectionEntriesOptional(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportAllergiesSectionEntriesOptional constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportAllergiesSectionEntriesOptional(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportAllergiesSectionEntriesOptional(diagnostics, context);
  }

  /**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validateGeneralHeaderConstraintsTemplateId(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validateGeneralHeaderConstraintsCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validateGeneralHeaderConstraintsCode(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBilling(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(billing, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(billing, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(billing, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validateBilling_validateBillingTemplateId(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validateBilling_validateBillingCode(billing, diagnostics, context);
    if (result || diagnostics != null) result &= validateBilling_validateBillingLevelOfService(billing, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateBillingTemplateId constraint of '<em>Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBilling_validateBillingTemplateId(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return billing.validateBillingTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateBillingCode constraint of '<em>Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBilling_validateBillingCode(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return billing.validateBillingCode(diagnostics, context);
  }

  /**
   * Validates the validateBillingLevelOfService constraint of '<em>Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBilling_validateBillingLevelOfService(Billing billing, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return billing.validateBillingLevelOfService(diagnostics, context);
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
    return EmspcrPlugin.INSTANCE;
  }

} //EmspcrValidator
