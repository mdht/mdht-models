/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

import org.openhealthtools.mdht.uml.cda.vsdr.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage
 * @generated
 */
public class VsdrValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final VsdrValidator INSTANCE = new VsdrValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.vsdr";

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Template Id' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID = 1;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Class Code' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE = 2;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Mood Code' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE = 3;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code P' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P = 4;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE = 5;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code P' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P = 6;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE = 7;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Id' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID = 8;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Language Code' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE = 9;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE = 10;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code P' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P = 11;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Title' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE = 12;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Effective Time' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME = 13;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN = 14;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Death Report Document Body' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY = 15;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Author' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR = 16;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Record Target' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET = 17;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Name' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME = 18;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Id' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID = 19;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian' of 'Reporting Death Informationfroma Clinical Settingto Vital Records'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS__REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN = 20;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Template Id' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID = 21;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Code P' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE_P = 23;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Text' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TEXT = 24;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Code' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CODE = 22;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Timeof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH = 25;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Locationof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH = 26;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Certifying Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH = 27;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Mannerof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH = 28;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Pregnancy Status' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS = 29;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Tobacco Use' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE = 30;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Injury' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_INJURY = 31;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Causeof Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH = 32;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Autopsy Performance' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE = 33;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Autopsy Results' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS = 34;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Coroner Referral' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL = 35;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Coroner Case Transfer' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER = 36;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Death Location Type' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE = 37;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Report Document Body Pronouncing Death' of 'Death Report Document Body'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_REPORT_DOCUMENT_BODY__DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH = 38;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Template Id' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_TEMPLATE_ID = 39;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Class Code' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_CLASS_CODE = 40;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Mood Code' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_MOOD_CODE = 41;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Code P' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_CODE_P = 42;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Code' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_CODE = 43;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Effective Time' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME = 44;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Dateand Timeof Death Text' of 'Dateand Timeof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_TEXT = 45;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Template Id' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_TEMPLATE_ID = 46;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Class Code' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_CLASS_CODE = 47;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Code P' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_CODE_P = 49;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Code' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_CODE = 50;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Mood Code' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_MOOD_CODE = 48;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Text' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_TEXT = 51;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Locationof Death Value' of 'Locationof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int LOCATIONOF_DEATH__LOCATIONOF_DEATH_VALUE = 52;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certifying Death Template Id' of 'Certifying Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CERTIFYING_DEATH__CERTIFYING_DEATH_TEMPLATE_ID = 53;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certifying Death Class Code' of 'Certifying Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CERTIFYING_DEATH__CERTIFYING_DEATH_CLASS_CODE = 54;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certifying Death Mood Code' of 'Certifying Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CERTIFYING_DEATH__CERTIFYING_DEATH_MOOD_CODE = 55;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certifying Death Code' of 'Certifying Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CERTIFYING_DEATH__CERTIFYING_DEATH_CODE = 56;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certifying Death Effective Time' of 'Certifying Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CERTIFYING_DEATH__CERTIFYING_DEATH_EFFECTIVE_TIME = 57;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certifying Death Certification Performer' of 'Certifying Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CERTIFYING_DEATH__CERTIFYING_DEATH_CERTIFICATION_PERFORMER = 58;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Template Id' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_TEMPLATE_ID = 59;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Class Code' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_CLASS_CODE = 60;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Code P' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_CODE_P = 62;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Code' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_CODE = 63;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Mood Code' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_MOOD_CODE = 61;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mannerof Death Value' of 'Mannerof Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int MANNEROF_DEATH__MANNEROF_DEATH_VALUE = 64;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Template Id' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_TEMPLATE_ID = 65;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Class Code' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_CLASS_CODE = 66;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Code P' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_CODE_P = 68;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Code' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_CODE = 69;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Mood Code' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_MOOD_CODE = 67;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pregnancy Status Value' of 'Pregnancy Status'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PREGNANCY_STATUS__PREGNANCY_STATUS_VALUE = 70;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Template Id' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_TEMPLATE_ID = 71;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Class Code' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_CLASS_CODE = 72;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Code' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_CODE = 74;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Mood Code' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_MOOD_CODE = 73;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tobacco Use Value' of 'Tobacco Use'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int TOBACCO_USE__TOBACCO_USE_VALUE = 75;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Template Id' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_TEMPLATE_ID = 76;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_CLASS_CODE = 77;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_CODE = 79;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_CODE_P = 80;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_MOOD_CODE = 78;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Status Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_STATUS_CODE = 81;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION = 82;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION = 83;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION = 84;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP = 85;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE = 86;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Determiner Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DETERMINER_CODE = 87;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Desc' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC = 88;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Addr' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR = 89;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE = 90;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY = 91;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE = 92;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE = 93;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE = 94;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P = 96;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE = 97;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE = 95;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Text' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT = 98;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE = 99;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Effective Time' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME = 100;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information Location Participation' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION = 101;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE = 102;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Injury Information Injury Information' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION = 103;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE = 104;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P = 106;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE = 107;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE = 105;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE = 108;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE = 109;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Work Association Work Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION = 110;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE = 111;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P = 113;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE = 114;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE = 112;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE = 115;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE = 116;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Association Transportation Association' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION = 117;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Class Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE = 118;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Code P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P = 120;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE = 121;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Mood Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE = 119;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Value' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE = 122;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship Value P' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE_P = 123;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Type Code' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE = 124;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Injury Component Transportation Relationship Transportation Relationship' of 'Injury'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INJURY__INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP = 125;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Template Id' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_TEMPLATE_ID = 126;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_CLASS_CODE = 127;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_CODE = 129;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Status Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_STATUS_CODE_P = 130;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_MOOD_CODE = 128;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Status Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_STATUS_CODE = 131;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE = 132;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION = 133;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE = 134;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P = 135;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE = 136;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE = 137;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Value' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE = 138;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Sequence Number' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_SEQUENCE_NUMBER = 139;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Type Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE = 140;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL = 141;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE = 142;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P = 143;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE = 144;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE = 145;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause Value' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE = 146;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Sequence Number' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER = 147;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Type Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE = 148;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Cause Death Cause' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE = 149;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE = 150;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code P' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P = 152;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE = 153;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE = 151;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE = 154;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Type Code' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE = 155;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Causal Information Component Other Significant Condition Other Significant Condition' of 'Death Causal Information'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_CAUSAL_INFORMATION__DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION = 156;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Template Id' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_TEMPLATE_ID = 157;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Class Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CLASS_CODE = 158;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Code P' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE_P = 160;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_CODE = 161;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Effective Time' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_EFFECTIVE_TIME = 162;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Value' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_VALUE = 163;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Mood Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_MOOD_CODE = 159;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER = 164;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Class Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE = 165;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Determiner Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE = 166;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Name' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME = 167;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Class Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE = 168;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN = 169;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Type Code' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE = 170;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Performance Autopsy Performer Autopsy Performer Role' of 'Autopsy Performance'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_PERFORMANCE__AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE = 171;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Template Id' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_TEMPLATE_ID = 172;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Class Code' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_CLASS_CODE = 173;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Code P' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_CODE_P = 175;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Code' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_CODE = 176;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Mood Code' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_MOOD_CODE = 174;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Value' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_VALUE = 177;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Autopsy Results Autopsy Report' of 'Autopsy Results'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int AUTOPSY_RESULTS__AUTOPSY_RESULTS_AUTOPSY_REPORT = 178;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Template Id' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_TEMPLATE_ID = 179;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Class Code' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_CLASS_CODE = 180;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Code P' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_CODE_P = 182;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Code' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_CODE = 183;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Mood Code' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_MOOD_CODE = 181;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Referral Value' of 'Coroner Referral'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_REFERRAL__CORONER_REFERRAL_VALUE = 184;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Template Id' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_TEMPLATE_ID = 185;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Class Code' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CLASS_CODE = 186;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Code P' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CODE_P = 188;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Code' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CODE = 189;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Mood Code' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_MOOD_CODE = 187;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Value' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_VALUE = 190;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coroner Case Transfer Coroner Case' of 'Coroner Case Transfer'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int CORONER_CASE_TRANSFER__CORONER_CASE_TRANSFER_CORONER_CASE = 191;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Template Id' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_TEMPLATE_ID = 192;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Class Code' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CLASS_CODE = 193;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Code P' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CODE_P = 195;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Code' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_CODE = 196;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Mood Code' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_MOOD_CODE = 194;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Value' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_VALUE = 197;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Death Location Type Value P' of 'Death Location Type'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int DEATH_LOCATION_TYPE__DEATH_LOCATION_TYPE_VALUE_P = 198;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Template Id' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_TEMPLATE_ID = 199;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Class Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_CLASS_CODE = 200;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Mood Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_MOOD_CODE = 201;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_CODE = 202;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Effective Time' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_EFFECTIVE_TIME = 203;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER = 204;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Class Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE = 205;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Determiner Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE = 206;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Name' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME = 207;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Addr' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ADDR = 208;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Class Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE = 209;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Id' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID = 210;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY = 211;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Type Code' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE = 212;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pronouncing Death Pronouncer Pronouncer Role' of 'Pronouncing Death'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int PRONOUNCING_DEATH__PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE = 213;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 213;

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
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VsdrValidator()
  {
    super();
    cdaValidator = CDAValidator.INSTANCE;
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
    return VsdrPackage.eINSTANCE;
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
      case VsdrPackage.REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS:
        return validateReportingDeathInformationfromaClinicalSettingtoVitalRecords((ReportingDeathInformationfromaClinicalSettingtoVitalRecords)value, diagnostics, context);
      case VsdrPackage.DEATH_REPORT_DOCUMENT_BODY:
        return validateDeathReportDocumentBody((DeathReportDocumentBody)value, diagnostics, context);
      case VsdrPackage.DATEAND_TIMEOF_DEATH:
        return validateDateandTimeofDeath((DateandTimeofDeath)value, diagnostics, context);
      case VsdrPackage.LOCATIONOF_DEATH:
        return validateLocationofDeath((LocationofDeath)value, diagnostics, context);
      case VsdrPackage.CERTIFYING_DEATH:
        return validateCertifyingDeath((CertifyingDeath)value, diagnostics, context);
      case VsdrPackage.MANNEROF_DEATH:
        return validateMannerofDeath((MannerofDeath)value, diagnostics, context);
      case VsdrPackage.PREGNANCY_STATUS:
        return validatePregnancyStatus((PregnancyStatus)value, diagnostics, context);
      case VsdrPackage.TOBACCO_USE:
        return validateTobaccoUse((TobaccoUse)value, diagnostics, context);
      case VsdrPackage.INJURY:
        return validateInjury((Injury)value, diagnostics, context);
      case VsdrPackage.DEATH_CAUSAL_INFORMATION:
        return validateDeathCausalInformation((DeathCausalInformation)value, diagnostics, context);
      case VsdrPackage.AUTOPSY_PERFORMANCE:
        return validateAutopsyPerformance((AutopsyPerformance)value, diagnostics, context);
      case VsdrPackage.AUTOPSY_RESULTS:
        return validateAutopsyResults((AutopsyResults)value, diagnostics, context);
      case VsdrPackage.CORONER_REFERRAL:
        return validateCoronerReferral((CoronerReferral)value, diagnostics, context);
      case VsdrPackage.CORONER_CASE_TRANSFER:
        return validateCoronerCaseTransfer((CoronerCaseTransfer)value, diagnostics, context);
      case VsdrPackage.DEATH_LOCATION_TYPE:
        return validateDeathLocationType((DeathLocationType)value, diagnostics, context);
      case VsdrPackage.PRONOUNCING_DEATH:
        return validatePronouncingDeath((PronouncingDeath)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    if (result || diagnostics != null) result &= validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(reportingDeathInformationfromaClinicalSettingtoVitalRecords, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(diagnostics, context);
  }

  /**
   * Validates the validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian constraint of '<em>Reporting Death Informationfroma Clinical Settingto Vital Records</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReportingDeathInformationfromaClinicalSettingtoVitalRecords_validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(ReportingDeathInformationfromaClinicalSettingtoVitalRecords reportingDeathInformationfromaClinicalSettingtoVitalRecords, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reportingDeathInformationfromaClinicalSettingtoVitalRecords.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(deathReportDocumentBody, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyTemplateId(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCode(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCodeP(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyText(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyTimeofDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyLocationofDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCertifyingDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyMannerofDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyPregnancyStatus(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyTobaccoUse(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyInjury(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCauseofDeath(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyAutopsyPerformance(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyAutopsyResults(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCoronerReferral(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyCoronerCaseTransfer(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyDeathLocationType(deathReportDocumentBody, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathReportDocumentBody_validateDeathReportDocumentBodyPronouncingDeath(deathReportDocumentBody, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDeathReportDocumentBodyTemplateId constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyTemplateId(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyCodeP constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyCodeP(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyText constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyText(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyText(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyCode constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyCode(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyTimeofDeath constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyTimeofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyTimeofDeath(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyLocationofDeath constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyLocationofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyLocationofDeath(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyCertifyingDeath constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyCertifyingDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyCertifyingDeath(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyMannerofDeath constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyMannerofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyMannerofDeath(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyPregnancyStatus constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyPregnancyStatus(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyPregnancyStatus(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyTobaccoUse constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyTobaccoUse(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyTobaccoUse(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyInjury constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyInjury(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyInjury(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyCauseofDeath constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyCauseofDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyCauseofDeath(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyAutopsyPerformance constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyAutopsyPerformance(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyAutopsyPerformance(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyAutopsyResults constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyAutopsyResults(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyAutopsyResults(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyCoronerReferral constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyCoronerReferral(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyCoronerReferral(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyCoronerCaseTransfer constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyCoronerCaseTransfer(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyCoronerCaseTransfer(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyDeathLocationType constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyDeathLocationType(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyDeathLocationType(diagnostics, context);
  }

  /**
   * Validates the validateDeathReportDocumentBodyPronouncingDeath constraint of '<em>Death Report Document Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathReportDocumentBody_validateDeathReportDocumentBodyPronouncingDeath(DeathReportDocumentBody deathReportDocumentBody, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathReportDocumentBody.validateDeathReportDocumentBodyPronouncingDeath(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(dateandTimeofDeath, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathTemplateId(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathClassCode(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathMoodCode(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathCodeP(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathCode(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathEffectiveTime(dateandTimeofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateandTimeofDeath_validateDateandTimeofDeathText(dateandTimeofDeath, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDateandTimeofDeathTemplateId constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathTemplateId(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDateandTimeofDeathClassCode constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathClassCode(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDateandTimeofDeathMoodCode constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathMoodCode(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDateandTimeofDeathCodeP constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathCodeP(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDateandTimeofDeathCode constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathCode(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathCode(diagnostics, context);
  }

  /**
   * Validates the validateDateandTimeofDeathEffectiveTime constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathEffectiveTime(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateDateandTimeofDeathText constraint of '<em>Dateand Timeof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateandTimeofDeath_validateDateandTimeofDeathText(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return dateandTimeofDeath.validateDateandTimeofDeathText(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(locationofDeath, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathTemplateId(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathClassCode(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathMoodCode(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathCodeP(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathCode(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathText(locationofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateLocationofDeath_validateLocationofDeathValue(locationofDeath, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateLocationofDeathTemplateId constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathTemplateId(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateLocationofDeathClassCode constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathClassCode(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathClassCode(diagnostics, context);
  }

  /**
   * Validates the validateLocationofDeathCodeP constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathCodeP(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathCodeP(diagnostics, context);
  }

  /**
   * Validates the validateLocationofDeathCode constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathCode(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathCode(diagnostics, context);
  }

  /**
   * Validates the validateLocationofDeathMoodCode constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathMoodCode(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateLocationofDeathText constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathText(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathText(diagnostics, context);
  }

  /**
   * Validates the validateLocationofDeathValue constraint of '<em>Locationof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLocationofDeath_validateLocationofDeathValue(LocationofDeath locationofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return locationofDeath.validateLocationofDeathValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(certifyingDeath, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateCertifyingDeath_validateCertifyingDeathTemplateId(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateCertifyingDeath_validateCertifyingDeathClassCode(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateCertifyingDeath_validateCertifyingDeathMoodCode(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateCertifyingDeath_validateCertifyingDeathCode(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateCertifyingDeath_validateCertifyingDeathEffectiveTime(certifyingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateCertifyingDeath_validateCertifyingDeathCertificationPerformer(certifyingDeath, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateCertifyingDeathTemplateId constraint of '<em>Certifying Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath_validateCertifyingDeathTemplateId(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return certifyingDeath.validateCertifyingDeathTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateCertifyingDeathClassCode constraint of '<em>Certifying Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath_validateCertifyingDeathClassCode(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return certifyingDeath.validateCertifyingDeathClassCode(diagnostics, context);
  }

  /**
   * Validates the validateCertifyingDeathMoodCode constraint of '<em>Certifying Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath_validateCertifyingDeathMoodCode(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return certifyingDeath.validateCertifyingDeathMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateCertifyingDeathCode constraint of '<em>Certifying Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath_validateCertifyingDeathCode(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return certifyingDeath.validateCertifyingDeathCode(diagnostics, context);
  }

  /**
   * Validates the validateCertifyingDeathEffectiveTime constraint of '<em>Certifying Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath_validateCertifyingDeathEffectiveTime(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return certifyingDeath.validateCertifyingDeathEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateCertifyingDeathCertificationPerformer constraint of '<em>Certifying Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCertifyingDeath_validateCertifyingDeathCertificationPerformer(CertifyingDeath certifyingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return certifyingDeath.validateCertifyingDeathCertificationPerformer(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(mannerofDeath, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathTemplateId(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathClassCode(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathMoodCode(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathCodeP(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathCode(mannerofDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validateMannerofDeath_validateMannerofDeathValue(mannerofDeath, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateMannerofDeathTemplateId constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathTemplateId(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateMannerofDeathClassCode constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathClassCode(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathClassCode(diagnostics, context);
  }

  /**
   * Validates the validateMannerofDeathCodeP constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathCodeP(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathCodeP(diagnostics, context);
  }

  /**
   * Validates the validateMannerofDeathCode constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathCode(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathCode(diagnostics, context);
  }

  /**
   * Validates the validateMannerofDeathMoodCode constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathMoodCode(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateMannerofDeathValue constraint of '<em>Mannerof Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMannerofDeath_validateMannerofDeathValue(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return mannerofDeath.validateMannerofDeathValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(pregnancyStatus, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusTemplateId(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusClassCode(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusMoodCode(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusCodeP(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusCode(pregnancyStatus, diagnostics, context);
    if (result || diagnostics != null) result &= validatePregnancyStatus_validatePregnancyStatusValue(pregnancyStatus, diagnostics, context);
    return result;
  }

  /**
   * Validates the validatePregnancyStatusTemplateId constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusTemplateId(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusTemplateId(diagnostics, context);
  }

  /**
   * Validates the validatePregnancyStatusClassCode constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusClassCode(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePregnancyStatusCodeP constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusCodeP(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusCodeP(diagnostics, context);
  }

  /**
   * Validates the validatePregnancyStatusCode constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusCode(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusCode(diagnostics, context);
  }

  /**
   * Validates the validatePregnancyStatusMoodCode constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusMoodCode(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusMoodCode(diagnostics, context);
  }

  /**
   * Validates the validatePregnancyStatusValue constraint of '<em>Pregnancy Status</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePregnancyStatus_validatePregnancyStatusValue(PregnancyStatus pregnancyStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pregnancyStatus.validatePregnancyStatusValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(tobaccoUse, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseTemplateId(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseClassCode(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseMoodCode(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseCode(tobaccoUse, diagnostics, context);
    if (result || diagnostics != null) result &= validateTobaccoUse_validateTobaccoUseValue(tobaccoUse, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateTobaccoUseTemplateId constraint of '<em>Tobacco Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse_validateTobaccoUseTemplateId(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tobaccoUse.validateTobaccoUseTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateTobaccoUseClassCode constraint of '<em>Tobacco Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse_validateTobaccoUseClassCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tobaccoUse.validateTobaccoUseClassCode(diagnostics, context);
  }

  /**
   * Validates the validateTobaccoUseCode constraint of '<em>Tobacco Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse_validateTobaccoUseCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tobaccoUse.validateTobaccoUseCode(diagnostics, context);
  }

  /**
   * Validates the validateTobaccoUseMoodCode constraint of '<em>Tobacco Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse_validateTobaccoUseMoodCode(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tobaccoUse.validateTobaccoUseMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateTobaccoUseValue constraint of '<em>Tobacco Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTobaccoUse_validateTobaccoUseValue(TobaccoUse tobaccoUse, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return tobaccoUse.validateTobaccoUseValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(injury, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryTemplateId(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryStatusCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationship(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationText(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentInjuryInformationInjuryInformation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociationValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentWorkAssociationWorkAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociation(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTypeCode(injury, diagnostics, context);
    if (result || diagnostics != null) result &= validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationship(injury, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateInjuryTemplateId constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryTemplateId(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateInjuryClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryCodeP constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryCodeP(diagnostics, context);
  }

  /**
   * Validates the validateInjuryMoodCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryStatusCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryStatusCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryStatusCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationship constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationship(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationship(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDeterminerCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRole(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationCodeP constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationMoodCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationText constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationText(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationText(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationValue constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationValue(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationTypeCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentInjuryInformationInjuryInformation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentInjuryInformationInjuryInformation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentInjuryInformationInjuryInformation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationWorkAssociationClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationWorkAssociationClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationWorkAssociationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationWorkAssociationCodeP constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationWorkAssociationCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationWorkAssociationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationWorkAssociationCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationWorkAssociationCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationWorkAssociationCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationWorkAssociationMoodCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationWorkAssociationMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationWorkAssociationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationWorkAssociationValue constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationWorkAssociationValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationWorkAssociationValue(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationTypeCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentWorkAssociationWorkAssociation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentWorkAssociationWorkAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentWorkAssociationWorkAssociation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTransportationAssociationClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTransportationAssociationCodeP constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTransportationAssociationCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTransportationAssociationCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTransportationAssociationValue constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociationValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTransportationAssociationValue(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTypeCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationAssociationTransportationAssociation constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationAssociationTransportationAssociation(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationAssociationTransportationAssociation(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationshipCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationshipValue constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationshipValueP(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTypeCode constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTypeCode(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateInjuryComponentTransportationRelationshipTransportationRelationship constraint of '<em>Injury</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInjury_validateInjuryComponentTransportationRelationshipTransportationRelationship(Injury injury, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return injury.validateInjuryComponentTransportationRelationshipTransportationRelationship(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(deathCausalInformation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationTemplateId(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationStatusCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationStatusCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCause(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantCondition(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseValue(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseSequenceNumber(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseTypeCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCause(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(deathCausalInformation, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(deathCausalInformation, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDeathCausalInformationTemplateId constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationTemplateId(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationClassCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationStatusCodeP constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationStatusCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationStatusCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationMoodCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationStatusCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationStatusCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationStatusCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCause constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCause(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCause(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantCondition constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantCondition(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantCondition(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalSequenceNumber(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseClassCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseCodeP constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseMoodCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCauseValue constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCauseValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCauseValue(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseSequenceNumber constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseSequenceNumber(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseSequenceNumber(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseTypeCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentCauseDeathCause constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentCauseDeathCause(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentCauseDeathCause(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionTypeCode constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition constraint of '<em>Death Causal Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathCausalInformation_validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(DeathCausalInformation deathCausalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathCausalInformation.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(autopsyPerformance, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceTemplateId(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceClassCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceMoodCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceCodeP(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceEffectiveTime(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceValue(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformer(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerTypeCode(autopsyPerformance, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(autopsyPerformance, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateAutopsyPerformanceTemplateId constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceTemplateId(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceClassCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceClassCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceCodeP constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceCodeP(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceCodeP(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceEffectiveTime constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceEffectiveTime(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceValue constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceValue(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceValue(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceMoodCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceMoodCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformer constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformer(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformer(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerTypeCode constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerTypeCode(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole constraint of '<em>Autopsy Performance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyPerformance_validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(AutopsyPerformance autopsyPerformance, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyPerformance.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(autopsyResults, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsTemplateId(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsClassCode(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsMoodCode(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsCodeP(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsCode(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsValue(autopsyResults, diagnostics, context);
    if (result || diagnostics != null) result &= validateAutopsyResults_validateAutopsyResultsAutopsyReport(autopsyResults, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateAutopsyResultsTemplateId constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsTemplateId(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyResultsClassCode constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsClassCode(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsClassCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyResultsCodeP constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsCodeP(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsCodeP(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyResultsCode constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsCode(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyResultsMoodCode constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsMoodCode(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyResultsValue constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsValue(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsValue(diagnostics, context);
  }

  /**
   * Validates the validateAutopsyResultsAutopsyReport constraint of '<em>Autopsy Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAutopsyResults_validateAutopsyResultsAutopsyReport(AutopsyResults autopsyResults, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return autopsyResults.validateAutopsyResultsAutopsyReport(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(coronerReferral, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralTemplateId(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralClassCode(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralMoodCode(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralCodeP(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralCode(coronerReferral, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerReferral_validateCoronerReferralValue(coronerReferral, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateCoronerReferralTemplateId constraint of '<em>Coroner Referral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral_validateCoronerReferralTemplateId(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerReferral.validateCoronerReferralTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateCoronerReferralClassCode constraint of '<em>Coroner Referral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral_validateCoronerReferralClassCode(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerReferral.validateCoronerReferralClassCode(diagnostics, context);
  }

  /**
   * Validates the validateCoronerReferralCodeP constraint of '<em>Coroner Referral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral_validateCoronerReferralCodeP(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerReferral.validateCoronerReferralCodeP(diagnostics, context);
  }

  /**
   * Validates the validateCoronerReferralCode constraint of '<em>Coroner Referral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral_validateCoronerReferralCode(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerReferral.validateCoronerReferralCode(diagnostics, context);
  }

  /**
   * Validates the validateCoronerReferralMoodCode constraint of '<em>Coroner Referral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral_validateCoronerReferralMoodCode(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerReferral.validateCoronerReferralMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateCoronerReferralValue constraint of '<em>Coroner Referral</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerReferral_validateCoronerReferralValue(CoronerReferral coronerReferral, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerReferral.validateCoronerReferralValue(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(coronerCaseTransfer, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferTemplateId(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferClassCode(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferMoodCode(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferCodeP(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferCode(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferValue(coronerCaseTransfer, diagnostics, context);
    if (result || diagnostics != null) result &= validateCoronerCaseTransfer_validateCoronerCaseTransferCoronerCase(coronerCaseTransfer, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateCoronerCaseTransferTemplateId constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferTemplateId(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateCoronerCaseTransferClassCode constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferClassCode(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferClassCode(diagnostics, context);
  }

  /**
   * Validates the validateCoronerCaseTransferCodeP constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferCodeP(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferCodeP(diagnostics, context);
  }

  /**
   * Validates the validateCoronerCaseTransferCode constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferCode(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferCode(diagnostics, context);
  }

  /**
   * Validates the validateCoronerCaseTransferMoodCode constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferMoodCode(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateCoronerCaseTransferValue constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferValue(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferValue(diagnostics, context);
  }

  /**
   * Validates the validateCoronerCaseTransferCoronerCase constraint of '<em>Coroner Case Transfer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCoronerCaseTransfer_validateCoronerCaseTransferCoronerCase(CoronerCaseTransfer coronerCaseTransfer, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return coronerCaseTransfer.validateCoronerCaseTransferCoronerCase(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(deathLocationType, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeTemplateId(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeClassCode(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeMoodCode(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeCodeP(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeCode(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeValue(deathLocationType, diagnostics, context);
    if (result || diagnostics != null) result &= validateDeathLocationType_validateDeathLocationTypeValueP(deathLocationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateDeathLocationTypeTemplateId constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeTemplateId(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeTemplateId(diagnostics, context);
  }

  /**
   * Validates the validateDeathLocationTypeClassCode constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeClassCode(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeClassCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathLocationTypeCodeP constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeCodeP(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeCodeP(diagnostics, context);
  }

  /**
   * Validates the validateDeathLocationTypeCode constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeCode(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathLocationTypeMoodCode constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeMoodCode(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeMoodCode(diagnostics, context);
  }

  /**
   * Validates the validateDeathLocationTypeValue constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeValue(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeValue(diagnostics, context);
  }

  /**
   * Validates the validateDeathLocationTypeValueP constraint of '<em>Death Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDeathLocationType_validateDeathLocationTypeValueP(DeathLocationType deathLocationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return deathLocationType.validateDeathLocationTypeValueP(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(pronouncingDeath, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathTemplateId(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathClassCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathMoodCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathEffectiveTime(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncer(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRoleAddr(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRoleClassCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRoleId(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerTypeCode(pronouncingDeath, diagnostics, context);
    if (result || diagnostics != null) result &= validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRole(pronouncingDeath, diagnostics, context);
    return result;
  }

  /**
   * Validates the validatePronouncingDeathTemplateId constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathTemplateId(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathTemplateId(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathClassCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathClassCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathMoodCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathMoodCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathMoodCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathEffectiveTime constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathEffectiveTime(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathEffectiveTime(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncer constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncer(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncer(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRoleAddr constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRoleAddr(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRoleAddr(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRoleClassCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRoleClassCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRoleClassCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRoleId constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRoleId(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRoleId(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRolePronouncingParty constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerTypeCode constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerTypeCode(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerTypeCode(diagnostics, context);
  }

  /**
   * Validates the validatePronouncingDeathPronouncerPronouncerRole constraint of '<em>Pronouncing Death</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePronouncingDeath_validatePronouncingDeathPronouncerPronouncerRole(PronouncingDeath pronouncingDeath, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return pronouncingDeath.validatePronouncingDeathPronouncerPronouncerRole(diagnostics, context);
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
    return VsdrPlugin.INSTANCE;
  }

} //VsdrValidator
