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
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Record Target' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_RECORD_TARGET = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Human Author' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_HUMAN_AUTHOR = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Component Of' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_COMPONENT_OF = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Billing' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_BILLING = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report Section' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_SECTION = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Current Medication' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Cardiac Arrest Event' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Advance Directives' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Allergies And Adverse Reactions Section' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Past Medical History' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Social History' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Physical Assessment Section' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Medications Administered Section' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Procedures Performed Section' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Patient Care Narrative' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Care Report EMS Scene Section' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__PATIENT_CARE_REPORT_EMS_SCENE_SECTION = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Patient Care Report'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PATIENT_CARE_REPORT__GENERAL_HEADER_CONSTRAINTS_CODE = 24;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Section Template Id' of 'EMS Billing Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING_SECTION__EMS_BILLING_SECTION_TEMPLATE_ID = 25;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Section Code' of 'EMS Billing Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING_SECTION__EMS_BILLING_SECTION_CODE = 26;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Section Billing Conditionentry' of 'EMS Billing Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING_SECTION__EMS_BILLING_SECTION_BILLING_CONDITIONENTRY = 27;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Billing Section Losentry' of 'EMS Billing Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_BILLING_SECTION__EMS_BILLING_SECTION_LOSENTRY = 28;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Derived Entry Template Id' of 'Derived Entry'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DERIVED_ENTRY__DERIVED_ENTRY_TEMPLATE_ID = 29;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Derived Entry Type Code' of 'Derived Entry'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DERIVED_ENTRY__DERIVED_ENTRY_TYPE_CODE = 30;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Template Id' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID = 31;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Code' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE = 32;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry3' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3 = 33;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry4' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4 = 34;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry5' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5 = 35;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry6' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6 = 36;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry7' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7 = 37;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry8' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8 = 38;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry9' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9 = 39;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry10' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10 = 40;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry11' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11 = 41;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Injury Incident Description Section Entry12' of 'EMS Injury Incident Description Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_INJURY_INCIDENT_DESCRIPTION_SECTION__EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12 = 42;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Current Medication Section Template Id' of 'EMS Current Medication Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_TEMPLATE_ID = 43;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Current Medication Section Code' of 'EMS Current Medication Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_CODE = 44;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Current Medication Section Entry1' of 'EMS Current Medication Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_ENTRY1 = 45;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Current Medication Section Entry2' of 'EMS Current Medication Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_ENTRY2 = 46;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Current Medication Section Entry3' of 'EMS Current Medication Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CURRENT_MEDICATION_SECTION__EMS_CURRENT_MEDICATION_SECTION_ENTRY3 = 47;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Section Template Id' of 'EMS Cardiac Arrest Event Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID = 48;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Section Code' of 'EMS Cardiac Arrest Event Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_CODE = 49;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Section Title' of 'EMS Cardiac Arrest Event Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE = 50;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Cardiac Arrest Event Section Entry1' of 'EMS Cardiac Arrest Event Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_CARDIAC_ARREST_EVENT_SECTION__EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1 = 51;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Advance Directives Section Template Id' of 'EMS Advance Directives Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 52;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Advance Directives Section Code' of 'EMS Advance Directives Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_CODE = 53;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Advance Directives Section Title' of 'EMS Advance Directives Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TITLE = 54;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Advance Directives Section Entry1' of 'EMS Advance Directives Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_ENTRY1 = 55;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Allergies And Adverse Reactions Section Template Id' of 'EMS Allergies And Adverse Reactions Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID = 56;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Allergies And Adverse Reactions Section Code' of 'EMS Allergies And Adverse Reactions Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE = 57;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Allergies And Adverse Reactions Section Title' of 'EMS Allergies And Adverse Reactions Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE = 58;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Allergies And Adverse Reactions Section Entry1' of 'EMS Allergies And Adverse Reactions Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY1 = 59;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Allergies And Adverse Reactions Section Entry2' of 'EMS Allergies And Adverse Reactions Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENTRY2 = 60;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Past Medical History Template Id' of 'EMS Past Medical History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_TEMPLATE_ID = 61;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Past Medical History Code' of 'EMS Past Medical History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_CODE = 62;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Past Medical History Code P' of 'EMS Past Medical History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_CODE_P = 63;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Past Medical History Title' of 'EMS Past Medical History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_TITLE = 64;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Past Medical History Entry1' of 'EMS Past Medical History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_ENTRY1 = 65;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Past Medical History Entry2' of 'EMS Past Medical History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PAST_MEDICAL_HISTORY__EMS_PAST_MEDICAL_HISTORY_ENTRY2 = 66;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Social History Template Id' of 'EMS Social History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_TEMPLATE_ID = 67;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Social History Code' of 'EMS Social History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_CODE = 68;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Social History Code P' of 'EMS Social History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_CODE_P = 69;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Social History Title' of 'EMS Social History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_TITLE = 70;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Social History Entry1' of 'EMS Social History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_ENTRY1 = 71;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Social History Entry2' of 'EMS Social History'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SOCIAL_HISTORY__EMS_SOCIAL_HISTORY_ENTRY2 = 72;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Template Id' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID = 73;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Code' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_CODE = 74;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Code P' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P = 75;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Text' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT = 76;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Title' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE = 77;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Entry1' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1 = 78;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Entry2' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2 = 79;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Entry3' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3 = 80;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Entry4' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4 = 81;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Entry5' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5 = 82;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Physical Assessment Section Entry6' of 'EMS Physical Assessment Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6 = 83;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Medications Administered Section Template Id' of 'EMS Medications Administered Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 84;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Medications Administered Section Code P' of 'EMS Medications Administered Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P = 85;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Medications Administered Section Code' of 'EMS Medications Administered Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE = 86;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Medications Administered Section Text' of 'EMS Medications Administered Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT = 87;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Medications Administered Section Title' of 'EMS Medications Administered Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE = 88;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Medications Administered Section Entry1' of 'EMS Medications Administered Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_ENTRY1 = 89;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Procedures Performed Section Template Id' of 'EMS Procedures Performed Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_TEMPLATE_ID = 90;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Procedures Performed Section Code' of 'EMS Procedures Performed Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_CODE = 91;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Procedures Performed Section Code P' of 'EMS Procedures Performed Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_CODE_P = 92;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Procedures Performed Section Text' of 'EMS Procedures Performed Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_TEXT = 93;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Procedures Performed Section Title' of 'EMS Procedures Performed Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_TITLE = 94;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Procedures Performed Section Entry1' of 'EMS Procedures Performed Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROCEDURES_PERFORMED_SECTION__EMS_PROCEDURES_PERFORMED_SECTION_ENTRY1 = 95;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Patient Care Narrative Template Id' of 'EMS Patient Care Narrative'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_TEMPLATE_ID = 96;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Patient Care Narrative Code' of 'EMS Patient Care Narrative'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_CODE = 97;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Patient Care Narrative Code P' of 'EMS Patient Care Narrative'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_CODE_P = 98;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Patient Care Narrative Text' of 'EMS Patient Care Narrative'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_TEXT = 99;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Patient Care Narrative Title' of 'EMS Patient Care Narrative'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PATIENT_CARE_NARRATIVE__EMS_PATIENT_CARE_NARRATIVE_TITLE = 100;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Template Id' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_TEMPLATE_ID = 101;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Code' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_CODE = 102;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Text' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_TEXT = 103;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Title' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_TITLE = 104;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Entry1' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_ENTRY1 = 105;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Entry2' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_ENTRY2 = 106;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Entry3' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_ENTRY3 = 107;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Scene Section Entry4' of 'EMS Scene Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SCENE_SECTION__EMS_SCENE_SECTION_ENTRY4 = 108;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Vital Signs Section Template Id' of 'EMS Vital Signs Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_VITAL_SIGNS_SECTION__EMS_VITAL_SIGNS_SECTION_TEMPLATE_ID = 109;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Vital Signs Section Code' of 'EMS Vital Signs Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_VITAL_SIGNS_SECTION__EMS_VITAL_SIGNS_SECTION_CODE = 110;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Vital Signs Section Title' of 'EMS Vital Signs Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_VITAL_SIGNS_SECTION__EMS_VITAL_SIGNS_SECTION_TITLE = 111;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Vital Signs Section Entry1' of 'EMS Vital Signs Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_VITAL_SIGNS_SECTION__EMS_VITAL_SIGNS_SECTION_ENTRY1 = 112;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Dispatch Template Id' of 'EMS Dispatch'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPATCH__EMS_DISPATCH_TEMPLATE_ID = 113;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Dispatch Code' of 'EMS Dispatch'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPATCH__EMS_DISPATCH_CODE = 114;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Dispatch Text' of 'EMS Dispatch'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPATCH__EMS_DISPATCH_TEXT = 115;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Dispatch Title' of 'EMS Dispatch'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPATCH__EMS_DISPATCH_TITLE = 116;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Dispatch Entry1' of 'EMS Dispatch'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPATCH__EMS_DISPATCH_ENTRY1 = 117;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Dispatch Entry2' of 'EMS Dispatch'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPATCH__EMS_DISPATCH_ENTRY2 = 118;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Template Id' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_TEMPLATE_ID = 119;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Code' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_CODE = 120;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Code P' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_CODE_P = 121;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Text' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_TEXT = 122;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Title' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_TITLE = 123;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Entry1' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_ENTRY1 = 124;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Entry2' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_ENTRY2 = 125;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Entry3' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_ENTRY3 = 126;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Response Entry4' of 'EMS Response'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_RESPONSE__EMS_RESPONSE_ENTRY4 = 127;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Template Id' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEMPLATE_ID = 128;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Code' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE = 129;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Code P' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_CODE_P = 130;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Text' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TEXT = 131;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Title' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_TITLE = 132;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry1' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY1 = 133;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry2' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY2 = 134;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry3' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY3 = 135;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry4' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY4 = 136;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry5' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY5 = 137;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry6' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY6 = 138;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry7' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY7 = 139;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Disposition Section Entry8' of 'EMS Disposition Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_DISPOSITION_SECTION__EMS_DISPOSITION_SECTION_ENTRY8 = 140;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Template Id' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_TEMPLATE_ID = 141;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Code' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_CODE = 142;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Code P' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_CODE_P = 143;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Text' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_TEXT = 144;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Title' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_TITLE = 145;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Entry1' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_ENTRY1 = 146;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Personnel Adverse Event Entry2' of 'EMS Personnel Adverse Event'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PERSONNEL_ADVERSE_EVENT__EMS_PERSONNEL_ADVERSE_EVENT_ENTRY2 = 147;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Protocol Section Template Id' of 'EMS Protocol Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_TEMPLATE_ID = 148;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Protocol Section Code' of 'EMS Protocol Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_CODE = 149;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Protocol Section Entry1' of 'EMS Protocol Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_ENTRY1 = 150;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Protocol Section Entry2' of 'EMS Protocol Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_ENTRY2 = 151;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Protocol Section Entry3' of 'EMS Protocol Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_PROTOCOL_SECTION__EMS_PROTOCOL_SECTION_ENTRY3 = 152;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Template Id' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TEMPLATE_ID = 153;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Code' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_CODE = 154;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Code P' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_CODE_P = 155;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Text' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TEXT = 156;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Title' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TITLE = 157;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry1' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY1 = 158;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry2' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY2 = 159;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry3' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY3 = 160;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry4' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY4 = 161;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry5' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY5 = 162;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry6' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY6 = 163;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry7' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY7 = 164;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Situation Section Entry8' of 'EMS Situation Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_ENTRY8 = 165;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Template Id' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_TEMPLATE_ID = 166;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Code' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_CODE = 167;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Text' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_TEXT = 168;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Title' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_TITLE = 169;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry1' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY1 = 170;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry2' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY2 = 171;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry3' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY3 = 172;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry4' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY4 = 173;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry5' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY5 = 174;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry6' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY6 = 175;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry7' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY7 = 176;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry8' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY8 = 177;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate EMS Times Section Entry9' of 'EMS Times Section'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int EMS_TIMES_SECTION__EMS_TIMES_SECTION_ENTRY9 = 178;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 178;

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
      case EmspcrPackage.EMS_BILLING_SECTION:
        return validateEMSBillingSection((EMSBillingSection)value, diagnostics, context);
      case EmspcrPackage.DERIVED_CDA_SECTION:
        return validateDerivedCDASection((DerivedCDASection)value, diagnostics, context);
      case EmspcrPackage.DERIVED_ENTRY:
        return validateDerivedEntry((DerivedEntry)value, diagnostics, context);
      case EmspcrPackage.EMS_INJURY_INCIDENT_DESCRIPTION_SECTION:
        return validateEMSInjuryIncidentDescriptionSection((EMSInjuryIncidentDescriptionSection)value, diagnostics, context);
      case EmspcrPackage.EMS_CURRENT_MEDICATION_SECTION:
        return validateEMSCurrentMedicationSection((EMSCurrentMedicationSection)value, diagnostics, context);
      case EmspcrPackage.EMS_CARDIAC_ARREST_EVENT_SECTION:
        return validateEMSCardiacArrestEventSection((EMSCardiacArrestEventSection)value, diagnostics, context);
      case EmspcrPackage.EMS_ADVANCE_DIRECTIVES_SECTION:
        return validateEMSAdvanceDirectivesSection((EMSAdvanceDirectivesSection)value, diagnostics, context);
      case EmspcrPackage.EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION:
        return validateEMSAllergiesAndAdverseReactionsSection((EMSAllergiesAndAdverseReactionsSection)value, diagnostics, context);
      case EmspcrPackage.EMS_PAST_MEDICAL_HISTORY:
        return validateEMSPastMedicalHistory((EMSPastMedicalHistory)value, diagnostics, context);
      case EmspcrPackage.EMS_SOCIAL_HISTORY:
        return validateEMSSocialHistory((EMSSocialHistory)value, diagnostics, context);
      case EmspcrPackage.EMS_PHYSICAL_ASSESSMENT_SECTION:
        return validateEMSPhysicalAssessmentSection((EMSPhysicalAssessmentSection)value, diagnostics, context);
      case EmspcrPackage.EMS_MEDICATIONS_ADMINISTERED_SECTION:
        return validateEMSMedicationsAdministeredSection((EMSMedicationsAdministeredSection)value, diagnostics, context);
      case EmspcrPackage.EMS_PROCEDURES_PERFORMED_SECTION:
        return validateEMSProceduresPerformedSection((EMSProceduresPerformedSection)value, diagnostics, context);
      case EmspcrPackage.EMS_PATIENT_CARE_NARRATIVE:
        return validateEMSPatientCareNarrative((EMSPatientCareNarrative)value, diagnostics, context);
      case EmspcrPackage.EMS_SCENE_SECTION:
        return validateEMSSceneSection((EMSSceneSection)value, diagnostics, context);
      case EmspcrPackage.EMS_VITAL_SIGNS_SECTION:
        return validateEMSVitalSignsSection((EMSVitalSignsSection)value, diagnostics, context);
      case EmspcrPackage.EMS_DISPATCH:
        return validateEMSDispatch((EMSDispatch)value, diagnostics, context);
      case EmspcrPackage.EMS_RESPONSE:
        return validateEMSResponse((EMSResponse)value, diagnostics, context);
      case EmspcrPackage.EMS_DISPOSITION_SECTION:
        return validateEMSDispositionSection((EMSDispositionSection)value, diagnostics, context);
      case EmspcrPackage.EMS_PERSONNEL_ADVERSE_EVENT:
        return validateEMSPersonnelAdverseEvent((EMSPersonnelAdverseEvent)value, diagnostics, context);
      case EmspcrPackage.EMS_PROTOCOL_SECTION:
        return validateEMSProtocolSection((EMSProtocolSection)value, diagnostics, context);
      case EmspcrPackage.EMS_SITUATION_SECTION:
        return validateEMSSituationSection((EMSSituationSection)value, diagnostics, context);
      case EmspcrPackage.EMS_TIMES_SECTION:
        return validateEMSTimesSection((EMSTimesSection)value, diagnostics, context);
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
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(patientCareReport, diagnostics, context);
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
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(patientCareReport, diagnostics, context);
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
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(patientCareReport, diagnostics, context);
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
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(patientCareReport, diagnostics, context);
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
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportRecordTarget(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportHumanAuthor(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportComponentOf(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportBilling(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportSection(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSCurrentMedication(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSCardiacArrestEvent(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSAdvanceDirectives(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSPastMedicalHistory(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSSocialHistory(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSPhysicalAssessmentSection(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSMedicationsAdministeredSection(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSProceduresPerformedSection(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSPatientCareNarrative(patientCareReport, diagnostics, context);
    if (result || diagnostics != null) result &= validatePatientCareReport_validatePatientCareReportEMSSceneSection(patientCareReport, diagnostics, context);
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
   * Validates the validatePatientCareReportRecordTarget constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportRecordTarget(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportRecordTarget(diagnostics, context);
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
   * Validates the validatePatientCareReportBilling constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportBilling(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportBilling(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportSection constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportSection(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSCurrentMedication constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSCurrentMedication(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSCurrentMedication(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSCardiacArrestEvent constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSCardiacArrestEvent(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSCardiacArrestEvent(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSAdvanceDirectives constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSAdvanceDirectives(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSAdvanceDirectives(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSAllergiesAndAdverseReactionsSection constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSPastMedicalHistory constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSPastMedicalHistory(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSPastMedicalHistory(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSSocialHistory constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSSocialHistory(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSSocialHistory(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSPhysicalAssessmentSection constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSPhysicalAssessmentSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSPhysicalAssessmentSection(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSMedicationsAdministeredSection constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSMedicationsAdministeredSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSMedicationsAdministeredSection(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSProceduresPerformedSection constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSProceduresPerformedSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSProceduresPerformedSection(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSPatientCareNarrative constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSPatientCareNarrative(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSPatientCareNarrative(diagnostics, context);
  }

  /**
   * Validates the validatePatientCareReportEMSSceneSection constraint of '<em>Patient Care Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePatientCareReport_validatePatientCareReportEMSSceneSection(PatientCareReport patientCareReport, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return patientCareReport.validatePatientCareReportEMSSceneSection(diagnostics, context);
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
  public boolean validateEMSBillingSection(EMSBillingSection emsBillingSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsBillingSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBillingSection_validateEMSBillingSectionTemplateId(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBillingSection_validateEMSBillingSectionCode(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBillingSection_validateEMSBillingSectionBillingConditionentry(emsBillingSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSBillingSection_validateEMSBillingSectionLosentry(emsBillingSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSBillingSectionTemplateId constraint of '<em>EMS Billing Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBillingSection_validateEMSBillingSectionTemplateId(EMSBillingSection emsBillingSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBillingSection.validateEMSBillingSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSBillingSectionCode constraint of '<em>EMS Billing Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBillingSection_validateEMSBillingSectionCode(EMSBillingSection emsBillingSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBillingSection.validateEMSBillingSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSBillingSectionBillingConditionentry constraint of '<em>EMS Billing Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBillingSection_validateEMSBillingSectionBillingConditionentry(EMSBillingSection emsBillingSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBillingSection.validateEMSBillingSectionBillingConditionentry(diagnostics, context);
  }

  /**
   * Validates the validateEMSBillingSectionLosentry constraint of '<em>EMS Billing Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSBillingSection_validateEMSBillingSectionLosentry(EMSBillingSection emsBillingSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsBillingSection.validateEMSBillingSectionLosentry(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedCDASection(DerivedCDASection derivedCDASection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(derivedCDASection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(derivedCDASection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(derivedCDASection, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedEntry(DerivedEntry derivedEntry, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(derivedEntry, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateEntry_validateClinicalStatement(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateEntry_validateContextConductionInd(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validateDerivedEntry_validateDerivedEntryTemplateId(derivedEntry, diagnostics, context);
    if (result || diagnostics != null) result &= validateDerivedEntry_validateDerivedEntryTypeCode(derivedEntry, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDerivedEntryTemplateId constraint of '<em>Derived Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedEntry_validateDerivedEntryTemplateId(DerivedEntry derivedEntry, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return derivedEntry.validateDerivedEntryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDerivedEntryTypeCode constraint of '<em>Derived Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDerivedEntry_validateDerivedEntryTypeCode(DerivedEntry derivedEntry, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return derivedEntry.validateDerivedEntryTypeCode(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsInjuryIncidentDescriptionSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionTemplateId(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionCode(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry3(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry4(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry5(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry6(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry7(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry8(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry9(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry10(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry11(emsInjuryIncidentDescriptionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry12(emsInjuryIncidentDescriptionSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionTemplateId constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionTemplateId(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionCode constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionCode(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry3 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry3(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry4 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry4(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry4(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry5 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry5(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry5(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry6 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry6(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry6(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry7 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry7(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry7(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry8 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry8(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry8(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry9 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry9(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry9(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry10 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry10(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry10(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry11 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry11(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry11(diagnostics, context);
  }

  /**
   * Validates the validateEMSInjuryIncidentDescriptionSectionEntry12 constraint of '<em>EMS Injury Incident Description Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSInjuryIncidentDescriptionSection_validateEMSInjuryIncidentDescriptionSectionEntry12(EMSInjuryIncidentDescriptionSection emsInjuryIncidentDescriptionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsInjuryIncidentDescriptionSection.validateEMSInjuryIncidentDescriptionSectionEntry12(diagnostics, context);
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
    if (result || diagnostics != null) result &= validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionTemplateId(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionCode(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionEntry1(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionEntry2(emsCurrentMedicationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionEntry3(emsCurrentMedicationSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSCurrentMedicationSectionTemplateId constraint of '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionTemplateId(EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCurrentMedicationSection.validateEMSCurrentMedicationSectionTemplateId(diagnostics, context);
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
   * Validates the validateEMSCurrentMedicationSectionEntry1 constraint of '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionEntry1(EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCurrentMedicationSection.validateEMSCurrentMedicationSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSCurrentMedicationSectionEntry2 constraint of '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionEntry2(EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCurrentMedicationSection.validateEMSCurrentMedicationSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSCurrentMedicationSectionEntry3 constraint of '<em>EMS Current Medication Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCurrentMedicationSection_validateEMSCurrentMedicationSectionEntry3(EMSCurrentMedicationSection emsCurrentMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCurrentMedicationSection.validateEMSCurrentMedicationSectionEntry3(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventSection(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsCardiacArrestEventSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionTemplateId(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionCode(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionTitle(emsCardiacArrestEventSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionEntry1(emsCardiacArrestEventSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSCardiacArrestEventSectionTemplateId constraint of '<em>EMS Cardiac Arrest Event Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionTemplateId(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEventSection.validateEMSCardiacArrestEventSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSCardiacArrestEventSectionCode constraint of '<em>EMS Cardiac Arrest Event Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionCode(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEventSection.validateEMSCardiacArrestEventSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSCardiacArrestEventSectionTitle constraint of '<em>EMS Cardiac Arrest Event Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionTitle(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEventSection.validateEMSCardiacArrestEventSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSCardiacArrestEventSectionEntry1 constraint of '<em>EMS Cardiac Arrest Event Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSCardiacArrestEventSection_validateEMSCardiacArrestEventSectionEntry1(EMSCardiacArrestEventSection emsCardiacArrestEventSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsCardiacArrestEventSection.validateEMSCardiacArrestEventSectionEntry1(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectivesSection(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsAdvanceDirectivesSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionTemplateId(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionCode(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionTitle(emsAdvanceDirectivesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionEntry1(emsAdvanceDirectivesSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSAdvanceDirectivesSectionTemplateId constraint of '<em>EMS Advance Directives Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAdvanceDirectivesSection.validateEMSAdvanceDirectivesSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSAdvanceDirectivesSectionCode constraint of '<em>EMS Advance Directives Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAdvanceDirectivesSection.validateEMSAdvanceDirectivesSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSAdvanceDirectivesSectionTitle constraint of '<em>EMS Advance Directives Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAdvanceDirectivesSection.validateEMSAdvanceDirectivesSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSAdvanceDirectivesSectionEntry1 constraint of '<em>EMS Advance Directives Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAdvanceDirectivesSection_validateEMSAdvanceDirectivesSectionEntry1(EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAdvanceDirectivesSection.validateEMSAdvanceDirectivesSectionEntry1(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactionsSection(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsAllergiesAndAdverseReactionsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionTemplateId(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionCode(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionTitle(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionEntry1(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionEntry2(emsAllergiesAndAdverseReactionsSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSAllergiesAndAdverseReactionsSectionTemplateId constraint of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionTemplateId(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAllergiesAndAdverseReactionsSection.validateEMSAllergiesAndAdverseReactionsSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSAllergiesAndAdverseReactionsSectionCode constraint of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionCode(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAllergiesAndAdverseReactionsSection.validateEMSAllergiesAndAdverseReactionsSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSAllergiesAndAdverseReactionsSectionTitle constraint of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionTitle(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAllergiesAndAdverseReactionsSection.validateEMSAllergiesAndAdverseReactionsSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSAllergiesAndAdverseReactionsSectionEntry1 constraint of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionEntry1(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAllergiesAndAdverseReactionsSection.validateEMSAllergiesAndAdverseReactionsSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSAllergiesAndAdverseReactionsSectionEntry2 constraint of '<em>EMS Allergies And Adverse Reactions Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSAllergiesAndAdverseReactionsSection_validateEMSAllergiesAndAdverseReactionsSectionEntry2(EMSAllergiesAndAdverseReactionsSection emsAllergiesAndAdverseReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsAllergiesAndAdverseReactionsSection.validateEMSAllergiesAndAdverseReactionsSectionEntry2(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsPastMedicalHistory, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryTemplateId(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryCode(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryCodeP(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryTitle(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryEntry1(emsPastMedicalHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryEntry2(emsPastMedicalHistory, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSPastMedicalHistoryTemplateId constraint of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryTemplateId(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPastMedicalHistory.validateEMSPastMedicalHistoryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSPastMedicalHistoryCode constraint of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryCode(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPastMedicalHistory.validateEMSPastMedicalHistoryCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSPastMedicalHistoryCodeP constraint of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryCodeP(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPastMedicalHistory.validateEMSPastMedicalHistoryCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSPastMedicalHistoryTitle constraint of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryTitle(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPastMedicalHistory.validateEMSPastMedicalHistoryTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSPastMedicalHistoryEntry1 constraint of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryEntry1(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPastMedicalHistory.validateEMSPastMedicalHistoryEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSPastMedicalHistoryEntry2 constraint of '<em>EMS Past Medical History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPastMedicalHistory_validateEMSPastMedicalHistoryEntry2(EMSPastMedicalHistory emsPastMedicalHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPastMedicalHistory.validateEMSPastMedicalHistoryEntry2(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsSocialHistory, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSocialHistory_validateEMSSocialHistoryTemplateId(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSocialHistory_validateEMSSocialHistoryCode(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSocialHistory_validateEMSSocialHistoryCodeP(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSocialHistory_validateEMSSocialHistoryTitle(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSocialHistory_validateEMSSocialHistoryEntry1(emsSocialHistory, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSocialHistory_validateEMSSocialHistoryEntry2(emsSocialHistory, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSSocialHistoryTemplateId constraint of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory_validateEMSSocialHistoryTemplateId(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSocialHistory.validateEMSSocialHistoryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSSocialHistoryCode constraint of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory_validateEMSSocialHistoryCode(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSocialHistory.validateEMSSocialHistoryCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSSocialHistoryCodeP constraint of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory_validateEMSSocialHistoryCodeP(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSocialHistory.validateEMSSocialHistoryCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSSocialHistoryTitle constraint of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory_validateEMSSocialHistoryTitle(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSocialHistory.validateEMSSocialHistoryTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSSocialHistoryEntry1 constraint of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory_validateEMSSocialHistoryEntry1(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSocialHistory.validateEMSSocialHistoryEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSSocialHistoryEntry2 constraint of '<em>EMS Social History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSocialHistory_validateEMSSocialHistoryEntry2(EMSSocialHistory emsSocialHistory, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSocialHistory.validateEMSSocialHistoryEntry2(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsPhysicalAssessmentSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionTemplateId(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionCode(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionCodeP(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionText(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionTitle(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry1(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry2(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry3(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry4(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry5(emsPhysicalAssessmentSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry6(emsPhysicalAssessmentSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionTemplateId constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionCode constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionCodeP constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionText constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionTitle constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionEntry1 constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry1(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionEntry2 constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry2(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionEntry3 constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry3(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionEntry4 constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry4(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionEntry4(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionEntry5 constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry5(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionEntry5(diagnostics, context);
  }

  /**
   * Validates the validateEMSPhysicalAssessmentSectionEntry6 constraint of '<em>EMS Physical Assessment Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPhysicalAssessmentSection_validateEMSPhysicalAssessmentSectionEntry6(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPhysicalAssessmentSection.validateEMSPhysicalAssessmentSectionEntry6(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsMedicationsAdministeredSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionTemplateId(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionCodeP(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionCode(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionText(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionTitle(emsMedicationsAdministeredSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionEntry1(emsMedicationsAdministeredSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSMedicationsAdministeredSectionTemplateId constraint of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionTemplateId(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsMedicationsAdministeredSection.validateEMSMedicationsAdministeredSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSMedicationsAdministeredSectionCodeP constraint of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionCodeP(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsMedicationsAdministeredSection.validateEMSMedicationsAdministeredSectionCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSMedicationsAdministeredSectionCode constraint of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionCode(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsMedicationsAdministeredSection.validateEMSMedicationsAdministeredSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSMedicationsAdministeredSectionText constraint of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionText(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsMedicationsAdministeredSection.validateEMSMedicationsAdministeredSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSMedicationsAdministeredSectionTitle constraint of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionTitle(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsMedicationsAdministeredSection.validateEMSMedicationsAdministeredSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSMedicationsAdministeredSectionEntry1 constraint of '<em>EMS Medications Administered Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSMedicationsAdministeredSection_validateEMSMedicationsAdministeredSectionEntry1(EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsMedicationsAdministeredSection.validateEMSMedicationsAdministeredSectionEntry1(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsProceduresPerformedSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionTemplateId(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionCode(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionCodeP(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionText(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionTitle(emsProceduresPerformedSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionEntry1(emsProceduresPerformedSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSProceduresPerformedSectionTemplateId constraint of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionTemplateId(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProceduresPerformedSection.validateEMSProceduresPerformedSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSProceduresPerformedSectionCode constraint of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionCode(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProceduresPerformedSection.validateEMSProceduresPerformedSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSProceduresPerformedSectionCodeP constraint of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionCodeP(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProceduresPerformedSection.validateEMSProceduresPerformedSectionCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSProceduresPerformedSectionText constraint of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionText(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProceduresPerformedSection.validateEMSProceduresPerformedSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSProceduresPerformedSectionTitle constraint of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionTitle(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProceduresPerformedSection.validateEMSProceduresPerformedSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSProceduresPerformedSectionEntry1 constraint of '<em>EMS Procedures Performed Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProceduresPerformedSection_validateEMSProceduresPerformedSectionEntry1(EMSProceduresPerformedSection emsProceduresPerformedSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProceduresPerformedSection.validateEMSProceduresPerformedSectionEntry1(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrative(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsPatientCareNarrative, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeTemplateId(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeCode(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeCodeP(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeText(emsPatientCareNarrative, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeTitle(emsPatientCareNarrative, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSPatientCareNarrativeTemplateId constraint of '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeTemplateId(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPatientCareNarrative.validateEMSPatientCareNarrativeTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSPatientCareNarrativeCode constraint of '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeCode(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPatientCareNarrative.validateEMSPatientCareNarrativeCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSPatientCareNarrativeCodeP constraint of '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeCodeP(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPatientCareNarrative.validateEMSPatientCareNarrativeCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSPatientCareNarrativeText constraint of '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeText(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPatientCareNarrative.validateEMSPatientCareNarrativeText(diagnostics, context);
  }

  /**
   * Validates the validateEMSPatientCareNarrativeTitle constraint of '<em>EMS Patient Care Narrative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPatientCareNarrative_validateEMSPatientCareNarrativeTitle(EMSPatientCareNarrative emsPatientCareNarrative, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPatientCareNarrative.validateEMSPatientCareNarrativeTitle(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsSceneSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionTemplateId(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionCode(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionText(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionTitle(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionEntry1(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionEntry2(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionEntry3(emsSceneSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSceneSection_validateEMSSceneSectionEntry4(emsSceneSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSSceneSectionTemplateId constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionTemplateId(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionCode constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionCode(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionText constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionText(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionTitle constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionTitle(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionEntry1 constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionEntry1(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionEntry2 constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionEntry2(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionEntry3 constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionEntry3(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSSceneSectionEntry4 constraint of '<em>EMS Scene Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSceneSection_validateEMSSceneSectionEntry4(EMSSceneSection emsSceneSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSceneSection.validateEMSSceneSectionEntry4(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSVitalSignsSection(EMSVitalSignsSection emsVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsVitalSignsSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSVitalSignsSection_validateEMSVitalSignsSectionTemplateId(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSVitalSignsSection_validateEMSVitalSignsSectionCode(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSVitalSignsSection_validateEMSVitalSignsSectionTitle(emsVitalSignsSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSVitalSignsSection_validateEMSVitalSignsSectionEntry1(emsVitalSignsSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSVitalSignsSectionTemplateId constraint of '<em>EMS Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSVitalSignsSection_validateEMSVitalSignsSectionTemplateId(EMSVitalSignsSection emsVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsVitalSignsSection.validateEMSVitalSignsSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSVitalSignsSectionCode constraint of '<em>EMS Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSVitalSignsSection_validateEMSVitalSignsSectionCode(EMSVitalSignsSection emsVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsVitalSignsSection.validateEMSVitalSignsSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSVitalSignsSectionTitle constraint of '<em>EMS Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSVitalSignsSection_validateEMSVitalSignsSectionTitle(EMSVitalSignsSection emsVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsVitalSignsSection.validateEMSVitalSignsSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSVitalSignsSectionEntry1 constraint of '<em>EMS Vital Signs Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSVitalSignsSection_validateEMSVitalSignsSectionEntry1(EMSVitalSignsSection emsVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsVitalSignsSection.validateEMSVitalSignsSectionEntry1(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsDispatch, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispatch_validateEMSDispatchTemplateId(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispatch_validateEMSDispatchCode(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispatch_validateEMSDispatchText(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispatch_validateEMSDispatchTitle(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispatch_validateEMSDispatchEntry1(emsDispatch, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispatch_validateEMSDispatchEntry2(emsDispatch, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSDispatchTemplateId constraint of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch_validateEMSDispatchTemplateId(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispatch.validateEMSDispatchTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispatchCode constraint of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch_validateEMSDispatchCode(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispatch.validateEMSDispatchCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispatchText constraint of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch_validateEMSDispatchText(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispatch.validateEMSDispatchText(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispatchTitle constraint of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch_validateEMSDispatchTitle(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispatch.validateEMSDispatchTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispatchEntry1 constraint of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch_validateEMSDispatchEntry1(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispatch.validateEMSDispatchEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispatchEntry2 constraint of '<em>EMS Dispatch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispatch_validateEMSDispatchEntry2(EMSDispatch emsDispatch, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispatch.validateEMSDispatchEntry2(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsResponse, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseTemplateId(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseCode(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseCodeP(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseText(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseTitle(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseEntry1(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseEntry2(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseEntry3(emsResponse, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSResponse_validateEMSResponseEntry4(emsResponse, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSResponseTemplateId constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseTemplateId(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseCode constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseCode(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseCodeP constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseCodeP(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseText constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseText(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseText(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseTitle constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseTitle(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseEntry1 constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseEntry1(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseEntry2 constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseEntry2(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseEntry3 constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseEntry3(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSResponseEntry4 constraint of '<em>EMS Response</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSResponse_validateEMSResponseEntry4(EMSResponse emsResponse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsResponse.validateEMSResponseEntry4(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsDispositionSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionTemplateId(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionCode(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionCodeP(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionText(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionTitle(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry1(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry2(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry3(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry4(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry5(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry6(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry7(emsDispositionSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSDispositionSection_validateEMSDispositionSectionEntry8(emsDispositionSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSDispositionSectionTemplateId constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionTemplateId(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionCode constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionCode(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionCodeP constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionCodeP(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionText constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionText(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionTitle constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionTitle(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry1 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry1(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry2 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry2(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry3 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry3(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry4 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry4(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry4(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry5 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry5(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry5(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry6 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry6(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry6(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry7 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry7(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry7(diagnostics, context);
  }

  /**
   * Validates the validateEMSDispositionSectionEntry8 constraint of '<em>EMS Disposition Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSDispositionSection_validateEMSDispositionSectionEntry8(EMSDispositionSection emsDispositionSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsDispositionSection.validateEMSDispositionSectionEntry8(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsPersonnelAdverseEvent, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventTemplateId(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventCode(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventCodeP(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventText(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventTitle(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventEntry1(emsPersonnelAdverseEvent, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventEntry2(emsPersonnelAdverseEvent, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventTemplateId constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventTemplateId(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventCode constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventCode(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventCodeP constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventCodeP(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventText constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventText(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventText(diagnostics, context);
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventTitle constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventTitle(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventEntry1 constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventEntry1(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSPersonnelAdverseEventEntry2 constraint of '<em>EMS Personnel Adverse Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSPersonnelAdverseEvent_validateEMSPersonnelAdverseEventEntry2(EMSPersonnelAdverseEvent emsPersonnelAdverseEvent, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsPersonnelAdverseEvent.validateEMSPersonnelAdverseEventEntry2(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProtocolSection(EMSProtocolSection emsProtocolSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsProtocolSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProtocolSection_validateEMSProtocolSectionTemplateId(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProtocolSection_validateEMSProtocolSectionCode(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProtocolSection_validateEMSProtocolSectionEntry1(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProtocolSection_validateEMSProtocolSectionEntry2(emsProtocolSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSProtocolSection_validateEMSProtocolSectionEntry3(emsProtocolSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSProtocolSectionTemplateId constraint of '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProtocolSection_validateEMSProtocolSectionTemplateId(EMSProtocolSection emsProtocolSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProtocolSection.validateEMSProtocolSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSProtocolSectionCode constraint of '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProtocolSection_validateEMSProtocolSectionCode(EMSProtocolSection emsProtocolSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProtocolSection.validateEMSProtocolSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSProtocolSectionEntry1 constraint of '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProtocolSection_validateEMSProtocolSectionEntry1(EMSProtocolSection emsProtocolSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProtocolSection.validateEMSProtocolSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSProtocolSectionEntry2 constraint of '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProtocolSection_validateEMSProtocolSectionEntry2(EMSProtocolSection emsProtocolSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProtocolSection.validateEMSProtocolSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSProtocolSectionEntry3 constraint of '<em>EMS Protocol Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSProtocolSection_validateEMSProtocolSectionEntry3(EMSProtocolSection emsProtocolSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsProtocolSection.validateEMSProtocolSectionEntry3(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsSituationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionTemplateId(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionCode(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionCodeP(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionText(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionTitle(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry1(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry2(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry3(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry4(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry5(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry6(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry7(emsSituationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSSituationSection_validateEMSSituationSectionEntry8(emsSituationSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSSituationSectionTemplateId constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionTemplateId(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionCode constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionCode(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionCodeP constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionCodeP(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionCodeP(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionText constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionText(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionTitle constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionTitle(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry1 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry1(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry2 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry2(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry3 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry3(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry4 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry4(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry4(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry5 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry5(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry5(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry6 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry6(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry6(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry7 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry7(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry7(diagnostics, context);
  }

  /**
   * Validates the validateEMSSituationSectionEntry8 constraint of '<em>EMS Situation Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSSituationSection_validateEMSSituationSectionEntry8(EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsSituationSection.validateEMSSituationSectionEntry8(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emsTimesSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionTemplateId(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionCode(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionText(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionTitle(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry1(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry2(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry3(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry4(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry5(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry6(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry7(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry8(emsTimesSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateEMSTimesSection_validateEMSTimesSectionEntry9(emsTimesSection, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateEMSTimesSectionTemplateId constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionTemplateId(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionCode constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionCode(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionCode(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionText constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionText(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionText(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionTitle constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionTitle(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionTitle(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry1 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry1(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry1(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry2 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry2(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry2(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry3 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry3(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry3(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry4 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry4(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry4(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry5 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry5(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry5(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry6 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry6(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry6(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry7 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry7(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry7(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry8 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry8(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry8(diagnostics, context);
  }

  /**
   * Validates the validateEMSTimesSectionEntry9 constraint of '<em>EMS Times Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEMSTimesSection_validateEMSTimesSectionEntry9(EMSTimesSection emsTimesSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return emsTimesSection.validateEMSTimesSectionEntry9(diagnostics, context);
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
