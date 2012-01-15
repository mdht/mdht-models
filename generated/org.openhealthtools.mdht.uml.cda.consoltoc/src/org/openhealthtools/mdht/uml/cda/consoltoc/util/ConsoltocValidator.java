/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consoltoc.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage
 * @generated
 */
public class ConsoltocValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final ConsoltocValidator INSTANCE = new ConsoltocValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.consoltoc";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Request'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_REQUEST__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 2;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Summary'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int CONSULTATION_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 3;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Discharge Instructions'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int DISCHARGE_INSTRUCTIONS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 4;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
  public ConsoltocValidator()
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
	  return ConsoltocPackage.eINSTANCE;
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
			case ConsoltocPackage.DISCHARGE_SUMMARY:
				return validateDischargeSummary((DischargeSummary)value, diagnostics, context);
			case ConsoltocPackage.CONSULTATION_REQUEST:
				return validateConsultationRequest((ConsultationRequest)value, diagnostics, context);
			case ConsoltocPackage.CONSULTATION_SUMMARY:
				return validateConsultationSummary((ConsultationSummary)value, diagnostics, context);
			case ConsoltocPackage.DISCHARGE_INSTRUCTIONS:
				return validateDischargeInstructions((DischargeInstructions)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(dischargeSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateGeneralHeaderConstraintsTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(dischargeSummary, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeSummary_validateGeneralHeaderConstraintsTemplateId(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(consultationRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationRequest_validateGeneralHeaderConstraintsTemplateId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(consultationRequest, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(consultationRequest, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Request</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationRequest_validateGeneralHeaderConstraintsTemplateId(ConsultationRequest consultationRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationRequest.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(consultationSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationSummary_validateGeneralHeaderConstraintsTemplateId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(consultationSummary, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(consultationSummary, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Summary</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateConsultationSummary_validateGeneralHeaderConstraintsTemplateId(ConsultationSummary consultationSummary, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return consultationSummary.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(dischargeInstructions, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeInstructions_validateGeneralHeaderConstraintsTemplateId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(dischargeInstructions, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(dischargeInstructions, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Discharge Instructions</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateDischargeInstructions_validateGeneralHeaderConstraintsTemplateId(DischargeInstructions dischargeInstructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return dischargeInstructions.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
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
		return ConsoltocPlugin.INSTANCE;
	}

} //ConsoltocValidator
