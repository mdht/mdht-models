/*******************************************************************************
 * Copyright (c) 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
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
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Code' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_CODE = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Version Number' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_VERSION_NUMBER = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Id' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ID = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Title' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_TITLE = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Human Author' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_HUMAN_AUTHOR = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Component Of' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_COMPONENT_OF = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Advance Directives Section Entries Optional' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Allergies Section Entries Optional' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_ALLERGIES_SECTION_ENTRIES_OPTIONAL = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Template Id' of 'EMS Billing'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING__EMS_BILLING_TEMPLATE_ID = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Code' of 'EMS Billing'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING__EMS_BILLING_CODE = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Level Of Service' of 'EMS Billing'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING__EMS_BILLING_LEVEL_OF_SERVICE = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Template Id' of 'EMS Injury Incident Description'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION__EMS_INJURY_INCIDENT_DESCRIPTION_TEMPLATE_ID = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Code' of 'EMS Injury Incident Description'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION__EMS_INJURY_INCIDENT_DESCRIPTION_CODE = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Template Id' of 'EMS Cardiac Arrest Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_TEMPLATE_ID = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Code' of 'EMS Cardiac Arrest Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_CODE = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Title' of 'EMS Cardiac Arrest Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_TITLE = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Cardiac Arrest Existence' of 'EMS Cardiac Arrest Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT__EMS_CARDIAC_ARREST_EVENT_CARDIAC_ARREST_EXISTENCE = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Advance Directives Template Id' of 'EMS Advance Directives'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ADVANCE_DIRECTIVES__EMS_ADVANCE_DIRECTIVES_TEMPLATE_ID = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Advance Directives Code' of 'EMS Advance Directives'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ADVANCE_DIRECTIVES__EMS_ADVANCE_DIRECTIVES_CODE = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Allergies And Adverse Reactions Template Id' of 'EMS Allergies And Adverse Reactions'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ALLERGIES_AND_ADVERSE_REACTIONS__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_TEMPLATE_ID = 24;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Current Medication Section Code' of 'EMS Current Medication Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_CODE = 25;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 25;

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
      case EmspcrPackage.EMS_BILLING:
        return validateEMSBilling((EMSBilling)value, diagnostics, context);
      case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION:
        return validateEMSInjuryIncidentDescription((EMSInjuryIncidentDescription)value, diagnostics, context);
      case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT:
        return validateEMSCardiacArrestEvent((EMSCardiacArrestEvent)value, diagnostics, context);
      case EmspcrPackage.EMS_ADVANCE_DIRECTIVES:
        return validateEMSAdvanceDirectives((EMSAdvanceDirectives)value, diagnostics, context);
      case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS:
        return validateEMSAllergiesAndAdverseReactions((EMSAllergiesAndAdverseReactions)value, diagnostics, context);
      case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION:
        return validateEMSCurrentMedicationSection((EMSCurrentMedicationSection)value, diagnostics, context);
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
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(patientCareReport, diagnostics, context);
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
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportVersionNumber(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportTitle(patientCareReport, diagnostics, context);
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
   * Validates the validatePatientCareReportCode constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportCode(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportCode(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportVersionNumber constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportVersionNumber(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportVersionNumber(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportId constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportId(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportId(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportTitle constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportTitle(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportTitle(diagnostics, context);
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
  public boolean validateEMSBilling(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsBilling, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBilling_validateEMSBillingTemplateId(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBilling_validateEMSBillingCode(emsBilling, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBilling_validateEMSBillingLevelOfService(emsBilling, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSBillingTemplateId constraint of '<em>EMS Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBilling_validateEMSBillingTemplateId(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBilling.validateEMSBillingTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSBillingCode constraint of '<em>EMS Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBilling_validateEMSBillingCode(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBilling.validateEMSBillingCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSBillingLevelOfService constraint of '<em>EMS Billing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBilling_validateEMSBillingLevelOfService(EMSBilling emsBilling, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBilling.validateEMSBillingLevelOfService(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescription(EMSInjuryIncidentDescription emsInjuryIncidentDescription, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsInjuryIncidentDescription, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescription_validateEMSInjuryIncidentDescriptionTemplateId(emsInjuryIncidentDescription, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescription_validateEMSInjuryIncidentDescriptionCode(emsInjuryIncidentDescription, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionTemplateId constraint of '<em>EMS Injury Incident Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescription_validateEMSInjuryIncidentDescriptionTemplateId(EMSInjuryIncidentDescription emsInjuryIncidentDescription, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescription.validateEMSInjuryIncidentDescriptionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionCode constraint of '<em>EMS Injury Incident Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescription_validateEMSInjuryIncidentDescriptionCode(EMSInjuryIncidentDescription emsInjuryIncidentDescription, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescription.validateEMSInjuryIncidentDescriptionCode(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEvent(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsCardiacArrestEvent, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventTemplateId(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventCode(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventTitle(emsCardiacArrestEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventCardiacArrestExistence(emsCardiacArrestEvent, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSCardiacArrestEventTemplateId constraint of '<em>EMS Cardiac Arrest Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventTemplateId(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEvent.validateEMSCardiacArrestEventTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSCardiacArrestEventCode constraint of '<em>EMS Cardiac Arrest Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventCode(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEvent.validateEMSCardiacArrestEventCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSCardiacArrestEventTitle constraint of '<em>EMS Cardiac Arrest Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventTitle(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEvent.validateEMSCardiacArrestEventTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSCardiacArrestEventCardiacArrestExistence constraint of '<em>EMS Cardiac Arrest Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEvent_validateEMSCardiacArrestEventCardiacArrestExistence(EMSCardiacArrestEvent emsCardiacArrestEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEvent.validateEMSCardiacArrestEventCardiacArrestExistence(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectives(EMSAdvanceDirectives emsAdvanceDirectives, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsAdvanceDirectives, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAdvanceDirectives_validateEMSAdvanceDirectivesTemplateId(emsAdvanceDirectives, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAdvanceDirectives_validateEMSAdvanceDirectivesCode(emsAdvanceDirectives, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSAdvanceDirectivesTemplateId constraint of '<em>EMS Advance Directives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectives_validateEMSAdvanceDirectivesTemplateId(EMSAdvanceDirectives emsAdvanceDirectives, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAdvanceDirectives.validateEMSAdvanceDirectivesTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSAdvanceDirectivesCode constraint of '<em>EMS Advance Directives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectives_validateEMSAdvanceDirectivesCode(EMSAdvanceDirectives emsAdvanceDirectives, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAdvanceDirectives.validateEMSAdvanceDirectivesCode(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactions(EMSAllergiesAndAdverseReactions emsAllergiesAndAdverseReactions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsAllergiesAndAdverseReactions, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsAllergiesAndAdverseReactions, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAllergiesAndAdverseReactions_validateEMSAllergiesAndAdverseReactionsTemplateId(emsAllergiesAndAdverseReactions, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSAllergiesAndAdverseReactionsTemplateId constraint of '<em>EMS Allergies And Adverse Reactions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactions_validateEMSAllergiesAndAdverseReactionsTemplateId(EMSAllergiesAndAdverseReactions emsAllergiesAndAdverseReactions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAllergiesAndAdverseReactions.validateEMSAllergiesAndAdverseReactionsTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCurrentMedicationSection(EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsCurrentMedicationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionCode(emsCurrentMedicationSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSCurrentMedicationSectionCode constraint of '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionCode(EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCurrentMedicationSection.validateEMSCurrentMedicationSectionCode(diagnostics, context);
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
